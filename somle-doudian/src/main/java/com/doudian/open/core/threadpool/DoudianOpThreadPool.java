package com.doudian.open.core.threadpool;

import com.doudian.open.core.DoudianOpConfig;

import java.util.concurrent.*;

public class DoudianOpThreadPool {

    private volatile static DoudianOpThreadPool INSTANCE;

    private final ThreadPoolExecutor executor;

    private DoudianOpThreadPool(ThreadPoolExecutor executor) {
        this.executor = executor;
    }

    public static DoudianOpThreadPool getInstance(DoudianOpConfig config) {
        if (INSTANCE == null) {
            synchronized (DoudianOpThreadPool.class) {
                if (INSTANCE == null) {
                    ThreadPoolExecutor executor = new ThreadPoolExecutor(config.getAsyncThreadPoolSize(), config.getAsyncThreadPoolSize(),
                            0L, TimeUnit.MILLISECONDS,
                            new ArrayBlockingQueue<Runnable>(config.getAsyncThreadPoolQueueSize()));
                    INSTANCE = new DoudianOpThreadPool(executor);
                }
            }
        }
        return INSTANCE;
    }

    public <T> Future<T> submit(Callable<T> call) {
        return executor.submit(call);
    }
}
