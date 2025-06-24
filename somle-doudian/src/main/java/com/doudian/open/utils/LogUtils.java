package com.doudian.open.utils;

import com.doudian.open.core.DoudianBaseTokenClientHolder;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * author       hahafeng
 * email        chenzhifeng.777@bytedance.com
 * date         2022/7/21 4:46 PM
 */
public class LogUtils {
    private static final Logger LOG = Logger.getLogger(LogUtils.class);
    private static final String LOG_ID_KEY = "x-tt-logid";
    private static volatile Method getLogMethod;
    private static volatile boolean init;

    public static String getLogId() {
        if (!init) {
            try {
                Class<?> clientClass = Class.forName("org.slf4j.MDC");
                LogUtils.getLogMethod = clientClass.getDeclaredMethod("get", String.class);
            } catch (ClassNotFoundException ignored) {
                LOG.warning("MDC ClassNotFound");
            } catch (Exception e) {
                LOG.warning("Failed to init DMC! %s", e.getMessage());
            } finally {
                LogUtils.init = true;
            }
        }

        if (init && getLogMethod == null) {
            return null;
        }

        try {
            return (String) getLogMethod.invoke(null, LOG_ID_KEY);
        } catch (Exception e) {
            LOG.warning("Unexpected exp! %s", e.getMessage());
            return null;
        }
    }
}
