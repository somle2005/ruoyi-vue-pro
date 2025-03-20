package com.somle.esb.service;

import cn.iocoder.yudao.module.infra.api.config.ConfigApi;
import com.somle.esb.model.OssData;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageChannel;
import org.springframework.stereotype.Service;


@Slf4j
@Service
public class EsbService {

    @Autowired
    MessageChannel dataChannel;


    @Autowired
    private ConfigApi configApi;


    @Autowired
    private ApplicationContext applicationContext;


    public void printAllBeans() {
        String[] beanNames = applicationContext.getBeanDefinitionNames();
        System.out.println("Beans provided by Spring:");

        for (String beanName : beanNames) {
            System.out.println(beanName);
        }
    }


    public void send(OssData data) {
        dataChannel.send(MessageBuilder.withPayload(data).build());
    }

}
