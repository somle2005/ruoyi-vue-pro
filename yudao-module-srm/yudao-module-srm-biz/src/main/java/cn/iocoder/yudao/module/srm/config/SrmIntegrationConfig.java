package cn.iocoder.yudao.module.srm.config;

import cn.iocoder.yudao.framework.common.enums.ChannelEnum;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.channel.PublishSubscribeChannel;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

/**
 * Spring Integration 配置类
 *
 * @author wdy
 */
@Configuration
public class SrmIntegrationConfig {


    /**
     * 供应商消息通道
     */
    @Bean(ChannelEnum.SUPPLIER)
    public PublishSubscribeChannel supplierChannel(ThreadPoolTaskExecutor supplierTaskExecutor) {
        return new PublishSubscribeChannel(supplierTaskExecutor);  //放入线程池
    }
}