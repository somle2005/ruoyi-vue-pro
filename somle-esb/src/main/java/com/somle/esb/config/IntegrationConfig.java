package com.somle.esb.config;

import cn.hutool.core.util.StrUtil;
import cn.iocoder.yudao.module.infra.api.config.ConfigApi;
import com.somle.dingtalk.service.DingTalkService;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.integration.channel.PublishSubscribeChannel;
import org.springframework.integration.dsl.IntegrationFlow;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.MessagingException;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

import static cn.hutool.extra.spring.SpringUtil.getActiveProfile;

@Slf4j
@Configuration
public class IntegrationConfig {
    @Resource
    DingTalkService dingTalkService;

    @Resource
    private ConfigApi configApi;

    @Bean
    public MessageChannel testChannel() {
        return new PublishSubscribeChannel();
    }

    @Bean
    public MessageChannel dataChannel() {
        return new PublishSubscribeChannel();
    }

    @Bean
//    @ConditionalOnProperty(prefix = "xxx.xxx", name = "active", havingValue = "true")
    @Profile("prod")
    public IntegrationFlow errorLoggingFlow() {
        return IntegrationFlow
            .from("errorChannel")
            .handle(this::logError)
            .get();
    }

    private void logError(Message<?> message) {
        Object payload = message.getPayload();
        Throwable exception = (Throwable) message.getPayload();

        // Extract the root cause
        Throwable rootCause = getRootCauseOrFallback(message.getPayload());

        // Log the payload and the root cause
        log.error("Spring Integration 异常处理\nHeaders: {}\nPayload: {}\nException: {}",
            message.getHeaders(),
            payload,
            rootCause,
            rootCause);

        //title根据上游异常类型 动态封装描述字符串'采购订单'
        String markdown = formatErrorMarkdown(
            "ALERT",
            rootCause,
            message.getHeaders(),
            payload,
            payload.getClass().getSimpleName(),
            getActiveProfile()
        );


        // Send the error details via your service
        dingTalkService.sendRobotMessage("同步失败", markdown, configApi.getConfigValueByKey("token.dingtalk.robot"));
    }

    /**
     * Finds the root cause of a Throwable.
     */
    private Throwable findRootCause(Throwable throwable) {
        Throwable cause = throwable.getCause();
        return (cause == null) ? throwable : findRootCause(cause);
    }
    /**
     * 构造钉钉 Markdown 格式告警内容
     */

    private String formatErrorMarkdown(String title, Throwable rootCause, Object headers, Object payload, String type, String env) {
        return StrUtil.format(
            """
                ## 🚨 {}
                
                **🌐 当前环境**：`{}`
                
                **📦 异常类型**：`{}`
                
                **💥 异常摘要**：
                ```text
                {}: {}
                ```
                
                **🧾 请求头**：
                ```json
                {}
                ```
                
                **📄 请求体**：
                ```text
                {}
                ```
                
                **🕒 时间**：{}
                """,
            title,
            env,
            type,
            rootCause.getClass().getName(), StrUtil.nullToDefault(rootCause.getMessage(), "无异常信息"),
            headers,
            payload,
            ZonedDateTime.now(ZoneId.of("Asia/Shanghai")).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss Z"))
        );
    }


    private Throwable getRootCauseOrFallback(Object payload) {
        Throwable result;

        // 1. payload 是 MessagingException 且有嵌套异常
        if (payload instanceof MessagingException me && me.getCause() != null) {
            result = findRootCause(me.getCause());
        }
        // 2. payload 是普通 Throwable
        else if (payload instanceof Throwable t) {
            result = findRootCause(t);
        }
        // 3. 无法解析，构造一个占位异常
        else {
            result = new RuntimeException("未识别的异常类型: " + payload);
        }

        return result;
    }
}