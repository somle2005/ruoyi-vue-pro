package cn.iocoder.yudao.framework.common.config;

import cn.iocoder.yudao.framework.common.util.concurrent.AsyncTask;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.ThreadPoolExecutor;

/**
 * 线程池配置类
 */
@Configuration
public class ThreadPoolConfig {

    /**
     * 通用线程池
     * 复用 AsyncTask.DEFAULT 中的线程池，避免创建多个线程池实例
     * 配置说明：
     * - 核心线程数：8
     * - 最大线程数：256
     * - 线程存活时间：60秒
     * - 队列容量：1024
     * - 拒绝策略：CallerRunsPolicy（调用者运行）
     * - 支持父子线程数据传递
     */
    @Bean
    public ThreadPoolExecutor commonThreadPool() {
        return AsyncTask.DEFAULT.getExecutor().getThreadPoolExecutor();
    }

    /**
     * 供应商任务线程池
     */
    @Bean
    public ThreadPoolTaskExecutor TaskExecutor() {
        return AsyncTask.DEFAULT.getExecutor();
    }
}
