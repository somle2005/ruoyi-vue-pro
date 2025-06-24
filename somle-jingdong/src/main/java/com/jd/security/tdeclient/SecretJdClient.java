package com.jd.security.tdeclient;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

public class SecretJdClient {
   private static final ConcurrentMap<String, TDEClient> cache = new ConcurrentHashMap();
   private static final long km_epoch = 28800L;
   private static final ScheduledExecutorService secret_scheduler = Executors.newScheduledThreadPool(1, new ThreadFactory() {
      public Thread newThread(Runnable r) {
         Thread t = Executors.defaultThreadFactory().newThread(r);
         t.setName("jd-sdk-secret-flush-thread");
         t.setDaemon(true);
         return t;
      }
   });

   private SecretJdClient() {
   }

   public static TDEClient getInstance(String serverUrl, String accessToken, String appKey, String appSecret) throws Exception {
      TDEClient tdeClient = (TDEClient)cache.get(accessToken);
      if (tdeClient == null) {
         synchronized(accessToken.intern()) {
            if (cache.get(accessToken) == null) {
               TDEClient instance = TDEClient.getInstance(serverUrl, accessToken, appKey, appSecret);
               cache.putIfAbsent(accessToken, instance);
            }
         }
      }

      return (TDEClient)cache.get(accessToken);
   }

   private static void scheduler() {
      secret_scheduler.scheduleAtFixedRate(new FlushKeyCacheThread(), 28800L, 28800L, TimeUnit.SECONDS);
   }

   public static ConcurrentMap<String, TDEClient> getCache() {
      return cache;
   }

   static {
      scheduler();
   }
}
