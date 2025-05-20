package com.somle.kingdee.util;

import com.github.benmanes.caffeine.cache.Cache;
import com.github.benmanes.caffeine.cache.Caffeine;
import com.somle.kingdee.model.KingdeeCustomField;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.TimeUnit;

/**
 * 自定义字段缓存工具类
 */
@Slf4j
public class CustomFieldCache {

    /**
     * 缓存实例
     * key: entityNumber_displayName
     * value: KingdeeCustomField
     */
    private static final Cache<String, KingdeeCustomField> CACHE = Caffeine.newBuilder()
            // 设置缓存最大容量
            .maximumSize(1000)
            // 设置写入后过期时间
            .expireAfterWrite(3, TimeUnit.MINUTES)
            // 设置访问后过期时间
            .expireAfterAccess(2, TimeUnit.MINUTES)
            // 开启统计
            .recordStats()
            .build();

    /**
     * 获取缓存key
     *
     * @param entityNumber 实体编号
     * @param displayName  显示名称
     * @return 缓存key
     */
    private static String getCacheKey(String entityNumber, String displayName) {
        return entityNumber + "_" + displayName;
    }

    /**
     * 获取自定义字段
     *
     * @param entityNumber 实体编号
     * @param displayName  显示名称
     * @param loader       加载器
     * @return 自定义字段
     */
    public static KingdeeCustomField getCustomField(String entityNumber, String displayName,
                                                    java.util.function.Supplier<KingdeeCustomField> loader) {
        String cacheKey = getCacheKey(entityNumber, displayName);
        try {
            return CACHE.get(cacheKey, key -> {
                KingdeeCustomField field = loader.get();
                if (field == null) {
                    log.debug("未找到自定义字段: entityNumber={}, displayName={}", entityNumber, displayName);
                }
                return field;
            });
        } catch (Exception e) {
            log.error("获取自定义字段缓存异常: entityNumber={}, displayName={}", entityNumber, displayName, e);
            return null;
        }
    }

    /**
     * 清除指定实体的缓存
     *
     * @param entityNumber 实体编号
     */
    public static void invalidateByEntity(String entityNumber) {
        CACHE.asMap().keySet().stream()
                .filter(key -> key.startsWith(entityNumber + "_"))
                .forEach(CACHE::invalidate);
    }

    /**
     * 清除所有缓存
     */
    public static void invalidateAll() {
        CACHE.invalidateAll();
    }

    /**
     * 获取缓存统计信息
     */
    public static String getStats() {
        return CACHE.stats().toString();
    }
} 