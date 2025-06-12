package com.somle.kingdee.util;

import java.util.function.Function;
import java.util.function.Supplier;

/**
 * @author: wdy
 */
public class CacheSpinWaitUtils {


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
                return parser.apply(cacheVal);
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

}
