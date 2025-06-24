package com.doudian.open.core;

import com.doudian.open.utils.ReflectUtil;

public class DoudianOpClientHolder {

    private static final DoudianOpClientHolder INSTANCE = new DoudianOpClientHolder();

    public static DoudianOpClient getClient() {
        return INSTANCE.initClient();
    }

    private DoudianOpClientHolder() {
    }

    private volatile DoudianOpClient client;

    private DoudianOpClient initClient() {

        if (client != null) {
            return client;
        }

        synchronized (this) {
            if (client != null) {
                return client;
            }

            //初始化client
            //判断是否开启了上报授权
            Class<?> clientClass = null;
            try {
               clientClass = Class.forName("com.doudian.open.core.statistics.DoudianOpStatisticsClient");
            }catch (ClassNotFoundException e){
                //没有开启授权，使用默认的client
                client = DefaultDoudianOpClient.getDefaultClient();
                return client;
            }
            client = (DoudianOpClient) ReflectUtil.newObject(clientClass);
            return client;
        }
    }
}
