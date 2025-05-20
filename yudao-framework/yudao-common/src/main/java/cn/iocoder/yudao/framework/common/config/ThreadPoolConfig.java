package cn.iocoder.yudao.framework.common.config;

import cn.iocoder.yudao.framework.common.util.concurrent.AsyncTask;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

/**
 * 线程池配置类
 */
@Configuration
public class ThreadPoolConfig {


    public ThreadPoolTaskExecutor supplierTaskExecutor() {
        return AsyncTask.DEFAULT.getExecutor();
    }
}
