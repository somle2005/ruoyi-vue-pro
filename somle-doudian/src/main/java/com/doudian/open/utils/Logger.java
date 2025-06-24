package com.doudian.open.utils;

import com.doudian.open.core.GlobalConfig;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class Logger {

    private static final ConcurrentMap<String, Logger> LOGGER_MAP = new ConcurrentHashMap<>();

    private java.util.logging.Logger jdkLogger = null;

    public static Logger getLogger(final Class<?> clazz) {
        Logger logger = LOGGER_MAP.get(clazz.getName());
        if (logger != null) {
            return logger;
        }

        synchronized (Logger.class) {
            logger = LOGGER_MAP.get(clazz.getName());
            if (logger != null) {
                return logger;
            }
            logger = new Logger();
            logger.jdkLogger = java.util.logging.Logger.getLogger(clazz.getName());
            LOGGER_MAP.put(clazz.getName(), logger);
        }
        return logger;
    }

    public void info(String format, Object...args) {
        if (GlobalConfig.isDisableSdkLog()) {
            return;
        }
        try {
            jdkLogger.info(String.format("[doudian sdk log] " + format, args));
        } catch (Exception e) {
            //ignore
        }
    }

    public void warning(String format, Object...args) {
        if (GlobalConfig.isDisableSdkLog()) {
            return;
        }
        try {
            jdkLogger.warning(String.format("[doudian sdk log] " + format, args));
        } catch (Exception e) {
            //ignore
        }
    }
}
