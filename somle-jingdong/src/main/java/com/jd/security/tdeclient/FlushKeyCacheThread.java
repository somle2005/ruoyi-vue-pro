package com.jd.security.tdeclient;

import com.jd.security.tde.util.UtilTools;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Logger;

public class FlushKeyCacheThread implements Runnable {
   private static final Logger LOGGER = Logger.getLogger(FlushKeyCacheThread.class.getName());

   public void run() {
      try {
         ConcurrentMap<String, TDEClient> cache = SecretJdClient.getCache();

         for(Map.Entry<String, TDEClient> entry : cache.entrySet()) {
            try {
               TDEClient tdeClient = (TDEClient)entry.getValue();
               String accessToken = tdeClient.getAccessToken();
               String appKey = tdeClient.getAppKey();
               String appSecret = tdeClient.getAppSecret();
               String serverUrl = tdeClient.getServerUrl();
               TDEClient instance = TDEClient.getInstance(serverUrl, accessToken, appKey, appSecret);
               cache.put(accessToken, instance);
            } catch (Exception e) {
               LOGGER.warning(UtilTools.extractStackTrace(e));
            }
         }
      } catch (Exception e) {
         LOGGER.warning(UtilTools.extractStackTrace(e));
      }

   }
}
