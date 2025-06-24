package com.jd.open.api.sdk.internal.JSON;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

class Log {
   public static final String EXCEPTION = "EXCEPTION ";
   public static final String IGNORED = "IGNORED ";
   protected static Properties __props = new Properties();
   public static String __logClass;
   public static boolean __ignored;
   private static final ConcurrentMap<String, Logger> __loggers = new ConcurrentHashMap();
   private static Logger LOG;
   private static boolean __initialized;

   public static boolean initialized() {
      if (LOG != null) {
         return true;
      } else {
         synchronized(Log.class) {
            if (__initialized) {
               return LOG != null;
            }

            __initialized = true;
         }

         try {
            Class<?> log_class = Loader.loadClass(Log.class, __logClass);
            if (LOG == null || !LOG.getClass().equals(log_class)) {
               LOG = (Logger)log_class.newInstance();
               LOG.debug("Logging to {} via {}", LOG, log_class.getName());
            }
         } catch (Throwable e) {
            initStandardLogging(e);
         }

         return LOG != null;
      }
   }

   private static void initStandardLogging(Throwable e) {
      if (e != null && __ignored) {
         e.printStackTrace();
      }

      if (LOG == null) {
         Class<?> log_class = StdErrLog.class;
         LOG = new StdErrLog();
         LOG.debug("Logging to {} via {}", LOG, log_class.getName());
      }

   }

   public static void setLog(Logger log) {
      LOG = log;
   }

   /** @deprecated */
   @Deprecated
   public static Logger getLog() {
      initialized();
      return LOG;
   }

   public static Logger getRootLogger() {
      initialized();
      return LOG;
   }

   static boolean isIgnored() {
      return __ignored;
   }

   public static void setLogToParent(String name) {
      ClassLoader loader = Log.class.getClassLoader();
      if (loader.getParent() != null) {
         try {
            Class<?> uberlog = loader.getParent().loadClass("org.eclipse.jetty.util.log.Log");
            Method getLogger = uberlog.getMethod("getLogger", String.class);
            Object logger = getLogger.invoke((Object)null, name);
            setLog(new LoggerLog(logger));
         } catch (Exception e) {
            e.printStackTrace();
         }
      } else {
         setLog(getLogger(name));
      }

   }

   /** @deprecated */
   @Deprecated
   public static void debug(Throwable th) {
      if (isDebugEnabled()) {
         LOG.debug("EXCEPTION ", th);
      }
   }

   /** @deprecated */
   @Deprecated
   public static void debug(String msg) {
      if (initialized()) {
         LOG.debug(msg);
      }
   }

   /** @deprecated */
   @Deprecated
   public static void debug(String msg, Object arg) {
      if (initialized()) {
         LOG.debug(msg, arg);
      }
   }

   /** @deprecated */
   @Deprecated
   public static void debug(String msg, Object arg0, Object arg1) {
      if (initialized()) {
         LOG.debug(msg, arg0, arg1);
      }
   }

   /** @deprecated */
   @Deprecated
   public static void ignore(Throwable thrown) {
      if (initialized()) {
         LOG.ignore(thrown);
      }
   }

   /** @deprecated */
   @Deprecated
   public static void info(String msg) {
      if (initialized()) {
         LOG.info(msg);
      }
   }

   /** @deprecated */
   @Deprecated
   public static void info(String msg, Object arg) {
      if (initialized()) {
         LOG.info(msg, arg);
      }
   }

   /** @deprecated */
   @Deprecated
   public static void info(String msg, Object arg0, Object arg1) {
      if (initialized()) {
         LOG.info(msg, arg0, arg1);
      }
   }

   /** @deprecated */
   @Deprecated
   public static boolean isDebugEnabled() {
      return !initialized() ? false : LOG.isDebugEnabled();
   }

   /** @deprecated */
   @Deprecated
   public static void warn(String msg) {
      if (initialized()) {
         LOG.warn(msg);
      }
   }

   /** @deprecated */
   @Deprecated
   public static void warn(String msg, Object arg) {
      if (initialized()) {
         LOG.warn(msg, arg);
      }
   }

   /** @deprecated */
   @Deprecated
   public static void warn(String msg, Object arg0, Object arg1) {
      if (initialized()) {
         LOG.warn(msg, arg0, arg1);
      }
   }

   /** @deprecated */
   @Deprecated
   public static void warn(String msg, Throwable th) {
      if (initialized()) {
         LOG.warn(msg, th);
      }
   }

   /** @deprecated */
   @Deprecated
   public static void warn(Throwable th) {
      if (initialized()) {
         LOG.warn("EXCEPTION ", th);
      }
   }

   public static Logger getLogger(Class<?> clazz) {
      return getLogger(clazz.getName());
   }

   public static Logger getLogger(String name) {
      if (!initialized()) {
         return null;
      } else if (name == null) {
         return LOG;
      } else {
         Logger logger = (Logger)__loggers.get(name);
         if (logger == null) {
            logger = LOG.getLogger(name);
         }

         return logger;
      }
   }

   static ConcurrentMap<String, Logger> getMutableLoggers() {
      return __loggers;
   }

   public static Map<String, Logger> getLoggers() {
      return Collections.unmodifiableMap(__loggers);
   }

   static {
      URL testProps = Log.class.getClassLoader().getResource("jetty-logging.properties");
      if (testProps != null) {
         InputStream in = null;

         try {
            in = testProps.openStream();
            Log.__props.load(in);
         } catch (IOException e) {
            System.err.println("Unable to load " + testProps);
            e.printStackTrace(System.err);
         } finally {
            try {
               if (in != null) {
                  in.close();
               }
            } catch (IOException e) {
               Log.LOG.ignore(e);
            }
         }
      }

      @SuppressWarnings("unchecked")
      Enumeration<String> systemKeyEnum = (Enumeration<String>) (Enumeration<?>) System.getProperties().propertyNames();

      while(systemKeyEnum.hasMoreElements()) {
         String key = (String)systemKeyEnum.nextElement();
         String val = System.getProperty(key);
         if (val != null) {
            Log.__props.setProperty(key, val);
         }
      }

      Log.__logClass = Log.__props.getProperty("org.eclipse.jetty.util.log.class", "org.eclipse.jetty.util.log.Slf4jLog");
      Log.__ignored = Boolean.parseBoolean(Log.__props.getProperty("org.eclipse.jetty.util.log.IGNORED", "false"));
   }
}
