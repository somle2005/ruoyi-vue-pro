package cn.iocoder.yudao.module.tms.config;

import cn.iocoder.yudao.framework.cola.statemachine.builder.FailCallback;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnBean(FailCallback.class)
public class FailCallbackAutoConfig {


    //找到BaseFailCallbackImpl ，给map加添一些键值对
}
