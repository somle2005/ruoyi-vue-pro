package com.doudian.open.core;

public class GlobalConfig extends DoudianOpConfig{

    private static final GlobalConfig GLOBAL_CONFIG = new GlobalConfig();

    public GlobalConfig() {
        super();
    }

    /**
     * 是否关闭SDK日志
     */
    private boolean disableSdkLog = false;

    public synchronized static void initAppKey(String appKey){
        getGlobalConfig().setAppKey(appKey);
    }

    public synchronized static void initAppSecret(String appSecret){
        getGlobalConfig().setAppSecret(appSecret);
    }

    public synchronized static void initHttpClientReadTimeout(Integer timeout) {
        getGlobalConfig().setHttpClientReadTimeout(timeout);
    }

    public synchronized static void initHttpClientConnectTimeout(Integer timeout) {
        getGlobalConfig().setHttpClientConnectTimeout(timeout);
    }

    public synchronized static void initMaterialGatewayHttpClientReadTimeout(Integer timeout) {
        getGlobalConfig().setMaterialGatewayHttpReadTimeout(timeout);
    }

    public synchronized static void initMaterialGatewayHttpClientConnectTimeout(Integer timeout) {
        getGlobalConfig().setMaterialGatewayHttpConnectTimeout(timeout);
    }

    public static void disableSdkLog() {
        getGlobalConfig().disableSdkLog = true;
    }

    public static boolean isDisableSdkLog() {
        return getGlobalConfig().disableSdkLog;
    }

    public static GlobalConfig getGlobalConfig() {
        return GLOBAL_CONFIG;
    }

    public static void AddAppKeyAndAppSecret(String appKey, String appSecret) {
        getGlobalConfig().AddAppKeyAndSecret(appKey, appSecret);
    }

}
