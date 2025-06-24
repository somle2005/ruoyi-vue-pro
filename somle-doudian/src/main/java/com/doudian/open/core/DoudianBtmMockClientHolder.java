package com.doudian.open.core;

import com.doudian.open.utils.Logger;

import java.lang.reflect.Method;

public class DoudianBtmMockClientHolder {
    private static final Logger LOG = Logger.getLogger(DoudianBtmMockClientHolder.class);

    public static final DoudianBtmMockClientHolder INSTANCE = new DoudianBtmMockClientHolder();

    private DoudianBtmMockClientHolder() {
    }

    private volatile Object btmMockService;
    private volatile Method recordMockCaseMethod;
    private volatile Method isReplayMethod;
    private volatile Method replayMethod;
    private volatile boolean init;

    public void recordMockCase(String url, String header, String requestBody, String responseBody) {
        if (!this.init) {
            doInit();
        }

        if (this.btmMockService == null) {
            throw new IllegalStateException("Unexpected call for btm! Please check whether it is a light-application and whether POM dependency is valid");
        }

        try {
            this.recordMockCaseMethod.invoke(btmMockService, url, header, requestBody, responseBody);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public boolean isReplay() {
        if (!this.init) {
            doInit();
        }

        if (this.btmMockService == null) {
            throw new IllegalStateException("Unexpected call for btm! Please check whether it is a light-application and whether POM dependency is valid");
        }

        try {
            return (boolean) this.isReplayMethod.invoke(btmMockService);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public String replay(String url, String header, String requestBody) {
        if (!this.init) {
            doInit();
        }

        if (this.btmMockService == null) {
            throw new IllegalStateException("Unexpected call for btm! Please check whether it is a light-application and whether POM dependency is valid");
        }

        try {
            return (String) this.replayMethod.invoke(btmMockService, url, header, requestBody);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private void doInit() {
        synchronized (this) {
            if (!this.init) {
                try {
                    Class<?> clientClass = Class.forName("com.jinritemai.cloud.base.core.service.BtmMockServiceImpl");
                    Class<?> springBeanGetterServiceClass = Class.forName("com.jinritemai.cloud.base.core.service.SpringBeanGetterService");
                    this.btmMockService = springBeanGetterServiceClass.getDeclaredMethod("getBtmMockServiceBean").invoke(null);
                    this.recordMockCaseMethod = clientClass.getDeclaredMethod("recordMockCase", String.class, String.class, String.class, String.class);
                    this.isReplayMethod = clientClass.getDeclaredMethod("isReplay");
                    this.replayMethod = clientClass.getDeclaredMethod("replay", String.class, String.class, String.class);
                    this.init = true;
                } catch (ClassNotFoundException ignored) {
                    LOG.warning("BtmMockServiceImpl ClassNotFound");
                    return;
                } catch (Exception e) {
                    LOG.warning("Failed to init BtmMockServiceImpl! %s", e.getMessage());
                    return;
                }
            }
        }
    }
}
