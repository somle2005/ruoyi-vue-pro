package cn.iocoder.yudao.module.srm.config;

import cn.iocoder.yudao.framework.common.enums.ChannelEnum;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.channel.PublishSubscribeChannel;
import org.springframework.messaging.MessageChannel;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

/**
 * 消息通道配置类，生产端维护，TODO 待优化
 */
@Configuration
public class SrmMessageChannelConfig {

    /**
     * 供应商消息通道
     */
    @Bean(ChannelEnum.SUPPLIER)
    public MessageChannel supplierChannel(ThreadPoolTaskExecutor TaskExecutor) {
        return new PublishSubscribeChannel(TaskExecutor);
    }

    /**
     * 采购订单消息通道
     */
    @Bean(ChannelEnum.PURCHASE_ORDER)
    public MessageChannel purchaseOrderChannel(ThreadPoolTaskExecutor TaskExecutor) {
        return new PublishSubscribeChannel(TaskExecutor);
    }

    /**
     * 采购入库单消息通道
     */
    @Bean(ChannelEnum.PURCHASE_IN)
    public MessageChannel purchaseInChannel(ThreadPoolTaskExecutor TaskExecutor) {
        return new PublishSubscribeChannel(TaskExecutor);
    }

    /**
     * 采购退货单消息通道
     */
    @Bean(ChannelEnum.PURCHASE_RETURN)
    public MessageChannel purchaseReturnChannel(ThreadPoolTaskExecutor TaskExecutor) {
        return new PublishSubscribeChannel(TaskExecutor);
    }

} 