package com.doudian.open.core;

import com.doudian.open.utils.Logger;
import com.doudian.open.utils.ReflectUtil;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class DoudianBaseTokenClientHolder {
    private static final Logger LOG = Logger.getLogger(DoudianBaseTokenClientHolder.class);

    public static final DoudianBaseTokenClientHolder INSTANCE = new DoudianBaseTokenClientHolder();

    private DoudianBaseTokenClientHolder() {
    }

    private volatile Object tokenService;
    private volatile Method getTokenMethod;
    private volatile Method refreshTokenMethod;
    private volatile boolean init;

    public String refreshToken() {
        if (!this.init) {
            doInit();
        }

        if (this.tokenService == null) {
            throw new IllegalStateException("Unexpected call! Please check whether it is a light-application and whether POM dependency is valid");
        }

        try {
            return (String) this.refreshTokenMethod.invoke(tokenService);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public String getToken() {
        if (!this.init) {
            doInit();
        }

        if (this.tokenService == null) {
            throw new IllegalStateException("Unexpected call! Please check whether it is a light-application and whether POM dependency is valid");
        }

        try {
            return (String) this.getTokenMethod.invoke(tokenService);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private void doInit() {
        synchronized (this) {
            if (!this.init) {
                try {
                    Class<?> clientClass = Class.forName("com.jinritemai.cloud.base.core.service.TokenServiceImpl");
                    Class<?> springBeanGetterServiceClass = Class.forName("com.jinritemai.cloud.base.core.service.SpringBeanGetterService");
                    this.tokenService = springBeanGetterServiceClass.getDeclaredMethod("getTokenServiceBean").invoke(null);
                    this.getTokenMethod = clientClass.getDeclaredMethod("getToken");
                    this.refreshTokenMethod = clientClass.getDeclaredMethod("refreshToken");
                    this.init = true;
                } catch (ClassNotFoundException ignored) {
                    LOG.warning("TokenServiceImpl ClassNotFound");
                    return;
                } catch (Exception e) {
                    LOG.warning("Failed to init TokenServiceImpl! %s", e.getMessage());
                    return;
                }
            }
        }
    }
}
