package com.somle.esb.util;

import cn.hutool.json.JSONUtil;
import cn.iocoder.yudao.framework.common.util.concurrent.AsyncTask;
import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * 同步工具类 提供多线程同步操作的通用方法
 */
@Slf4j
public class SyncUtils {

    /**
     * 多线程同步方法（支持返回值） 使用CompletableFuture进行异步处理，提高同步效率，并返回同步结果
     *
     * @param ids          需要同步的ID列表
     * @param validator    数据验证器
     * @param converter    数据转换器
     * @param syncer       同步执行器（返回结果）
     * @param logType      日志类型
     * @param numberGetter 编号获取器
     * @param <T>          源数据类型
     * @param <R>          目标数据类型
     * @param <S>          同步结果类型
     * @return 所有同步结果的列表
     */
    public static <T, R, S> List<S> syncToKingdeeWithResult(List<Long> ids, Function<List<Long>, List<T>> validator,
                                                            Function<List<T>, List<R>> converter, Function<R, S> syncer, String logType, Function<R, Object> numberGetter) {
        List<T> dtos = validator.apply(ids);
        if (dtos.isEmpty()) {
            log.warn("[{}] 未找到需要同步的信息,入参:{}", logType, JSONUtil.parse(ids));
            return List.of();
        }

        List<R> kingdeeObjs = converter.apply(dtos);
        int total = kingdeeObjs.size();
        AtomicInteger successCount = new AtomicInteger(0);
        AtomicInteger failCount = new AtomicInteger(0);
        Set<Object> failedIdentifiers = ConcurrentHashMap.newKeySet();
        AtomicInteger completedCount = new AtomicInteger(0);

        // 创建异步任务列表
        List<CompletableFuture<S>> futures = kingdeeObjs.stream().map(obj -> CompletableFuture.supplyAsync(() -> {
            try {
                S result = syncer.apply(obj);
                successCount.incrementAndGet();
                int current = completedCount.incrementAndGet();
                log.info("[{}] 同步进度：{}/{}，唯一标识(ID)：{} - 成功", logType, current, total,
                        numberGetter.apply(obj));
                return result;
            } catch (Exception e) {
                failCount.incrementAndGet();
                Object identifier = numberGetter.apply(obj);
                failedIdentifiers.add(identifier);
                int current = completedCount.incrementAndGet();
                log.error("[{}] 同步失败：{}/{}，唯一标识(ID)：{}，错误信息：{}", logType, current, total, identifier,
                        e.getMessage(), e);
                // 返回null表示失败，调用方需要处理
                return null;
            }
        }, AsyncTask.DEFAULT.getExecutor().getThreadPoolExecutor())).collect(Collectors.toList());

        // 等待所有任务完成并收集结果
        List<S> results = futures.stream().map(CompletableFuture::join).collect(Collectors.toList());

        log.info("[{}] 同步完成，共处理：{}个，成功：{}个，失败：{}个", logType, total, successCount.get(), failCount.get());
        if (failCount.get() > 0) {
            log.warn("[{}] 存在{}个同步失败的数据，失败的唯一标识符：{}", logType, failCount.get(),
                    JSONUtil.parse(failedIdentifiers));
        }

        return results;
    }

    /**
     * 串行同步方法（保留作为备选）
     *
     * @param ids          需要同步的ID列表
     * @param validator    数据验证器
     * @param converter    数据转换器
     * @param syncer       同步执行器
     * @param logType      日志类型
     * @param numberGetter 编号获取器
     * @param <T>          源数据类型
     * @param <R>          目标数据类型
     */
    public static <T, R> void syncToKingdee(List<Long> ids, Function<List<Long>, List<T>> validator,
                                            Function<List<T>, List<R>> converter, Consumer<R> syncer, String logType, Function<R, Object> numberGetter) {
        List<T> dtos = validator.apply(ids);
        if (dtos.isEmpty()) {
            log.warn("[{}] 未找到需要同步的信息,入参:{}", logType, JSONUtil.parse(ids));
            return;
        }

        List<R> kingdeeObjs = converter.apply(dtos);
        int total = kingdeeObjs.size();
        int successCount = 0;
        int failCount = 0;
        Set<Object> failedIdentifiers = ConcurrentHashMap.newKeySet();

        for (int i = 0; i < total; i++) {
            R obj = kingdeeObjs.get(i);
            try {
                syncer.accept(obj);
                successCount++;
                log.info("[{}] 同步进度：{}/{}，唯一标识(ID)：{} - 成功", logType, i + 1, total, numberGetter.apply(obj));
            } catch (Exception e) {
                failCount++;
                Object identifier = numberGetter.apply(obj);
                failedIdentifiers.add(identifier);
                log.error("[{}] 同步失败：{}/{}，唯一标识(ID)：{}，错误信息：{}", logType, i + 1, total, identifier,
                        e.getMessage(), e);
            }
        }

        log.info("[{}] 同步完成，共处理：{}个，成功：{}个，失败：{}个", logType, total, successCount, failCount);
        if (failCount > 0) {
            log.warn("[{}] 存在{}个同步失败的数据，失败的唯一标识符：{}", logType, failCount,
                    JSONUtil.parse(failedIdentifiers));
        }
    }
} 