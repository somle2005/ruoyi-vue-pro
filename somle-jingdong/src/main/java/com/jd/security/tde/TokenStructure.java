package com.jd.security.tde;

public class TokenStructure {
   private String serverUrl;
   private String accessToken;
   private String appKey;
   private String appSecret;

   public TokenStructure() {
   }

   public TokenStructure(String serverUrl, String accessToken, String appKey, String appSecret) {
      this.serverUrl = serverUrl;
      this.accessToken = accessToken;
      this.appKey = appKey;
      this.appSecret = appSecret;
   }

   public String getServerUrl() {
      return this.serverUrl;
   }

   public void setServerUrl(String serverUrl) {
      this.serverUrl = serverUrl;
   }

   public String getAccessToken() {
      return this.accessToken;
   }

   public void setAccessToken(String accessToken) {
      this.accessToken = accessToken;
   }

   public String getAppKey() {
      return this.appKey;
   }

   public void setAppKey(String appKey) {
      this.appKey = appKey;
   }

   public String getAppSecret() {
      return this.appSecret;
   }

   public void setAppSecret(String appSecret) {
      this.appSecret = appSecret;
   }
}
