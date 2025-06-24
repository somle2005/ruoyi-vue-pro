package com.doudian.open.core;

import com.doudian.open.utils.ReflectUtil;
import jakarta.servlet.http.HttpServletRequest;


public class DoudianOpSpi {

    public static class Configurator {
        DoudianOpSpiRequest<?> request;

        public String responseJson() {
            return request.responseJson();
        }
    }

    public static Configurator  config(Class<? extends DoudianOpSpiRequest<?>> requestClass, DoudianOpSpiBizHandler bizHandler, HttpServletRequest httpServletRequest) {
        Configurator configurator = new Configurator();
        DoudianOpSpiRequest<?> request = ReflectUtil.newObject(requestClass);
        request.initWithConfig(httpServletRequest);
        request.registerHandler(bizHandler);
        configurator.request = request;
        return configurator;
    }

}
