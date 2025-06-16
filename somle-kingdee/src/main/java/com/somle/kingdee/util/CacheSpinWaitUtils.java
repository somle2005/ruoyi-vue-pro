package com.somle.kingdee.util;

import cn.hutool.core.util.StrUtil;
import cn.iocoder.yudao.framework.common.util.json.JsonUtilsX;
import com.fasterxml.jackson.core.type.TypeReference;
import lombok.extern.slf4j.Slf4j;
import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;
import org.springframework.data.redis.core.StringRedisTemplate;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * Redis + Redisson 防缓存击穿工具类
 * 支持空值缓存、自旋等待、分布式锁并发加载
 * @author: wdy
 */
@Slf4j
public class CacheSpinWaitUtils {
    private static final String NULL_PLACEHOLDER = "__NULL__";

    /**
     * 分布式锁未获取时，自旋等待缓存key，期间如缓存数据可用则直接返回。
     *
     * @param cacheSupplier  缓存查询逻辑 (比如 lambda: redisTemplate.opsForValue().get(cacheKey))
     * @param parser         缓存反序列化方法 (比如 lambda: JsonUtilsX.parseObject(json, new TypeReference<>(){}))
     * @param maxWaitMillis  最多等待毫秒数
     * @param intervalMillis 轮询间隔毫秒
     * @param <T>            返回数据类型
     * @return 缓存命中时返回解析后的对象，否则返回null
     */
    public static <T> T spinWaitForCache(Supplier<String> cacheSupplier, Function<String, T> parser, int maxWaitMillis, int intervalMillis) {
        int waited = 0;
        while (waited < maxWaitMillis) {
            String cacheVal = cacheSupplier.get();
            if (cacheVal != null) {
                try {
                    return parser.apply(cacheVal);
                } catch (Exception e) {
                    log.warn("[spinWaitForCache] 反序列化失败，cache={}", cacheVal, e);
                    throw e;
//                    return null;
                }
            }
            try {
                Thread.sleep(intervalMillis);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return null;
            }
            waited += intervalMillis;
        }
        return null;
    }

    /**
     * 通用 Redis 缓存获取工具方法，支持 Redisson 分布式锁防止缓存击穿。
     * <p>
     * 功能：
     * 1. 优先从 Redis 缓存中获取数据。
     * 2. 如果缓存为空，尝试获取 Redisson 分布式锁。
     * 3. 获取锁成功后执行 loader 加载数据并缓存，避免并发击穿。
     * 4. 获取锁失败则使用自旋等待已被其他线程填充的缓存。
     *
     * @param redisTemplate  Redis 操作工具
     * @param redissonClient Redisson 客户端，用于获取分布式锁
     * @param key            缓存 key
     * @param lockKey        分布式锁 key
     * @param timeout        缓存过期时间
     * @param unit           缓存时间单位
     * @param type           返回值类型引用，用于反序列化
     * @param loader         当缓存不存在时的数据加载逻辑（通常为数据库或远程调用）
     * @param <T>            返回值类型
     * @return 从缓存或 loader 加载的数据
     */
    public static <T> T getOrLoad(StringRedisTemplate redisTemplate, RedissonClient redissonClient,
                                  String key, String lockKey, long timeout, TimeUnit unit,
                                  TypeReference<T> type, Supplier<T> loader) {
        String cache = redisTemplate.opsForValue().get(key);
        if (StrUtil.isNotEmpty(cache)) {
            if (NULL_PLACEHOLDER.equals(cache)) {
                return null;
            }
            try {
                return JsonUtilsX.parseObject(cache, type);
            } catch (Exception e) {
                log.warn("[getOrLoad] 缓存反序列化失败 key={}, cache={}", key, cache, e);
                redisTemplate.delete(key);
            }
        }

        RLock lock = redissonClient.getLock(lockKey);
        boolean locked = false;
        try {
            locked = lock.tryLock(0, 10, TimeUnit.SECONDS);
            if (!locked) {
                return spinWaitForCache(
                    () -> redisTemplate.opsForValue().get(key),
                    json -> JsonUtilsX.parseObject(json, type),
                    5000, 200
                );
            }

            cache = redisTemplate.opsForValue().get(key);
            if (StrUtil.isNotEmpty(cache)) {
                if (NULL_PLACEHOLDER.equals(cache)) {
                    return null;
                }
                return JsonUtilsX.parseObject(cache, type);
            }

            T result = loader.get();
            if (result == null) {
                redisTemplate.opsForValue().set(key, NULL_PLACEHOLDER, timeout, unit);
                return null;
            }

            redisTemplate.opsForValue().set(key, JsonUtilsX.toJsonString(result), timeout, unit);
            return result;
        } catch (Exception e) {
            throw new RuntimeException("[getOrLoad] 加载缓存异常", e);
        } finally {
            if (locked && lock.isHeldByCurrentThread()) {
                lock.unlock();
            }
        }
    }
}
