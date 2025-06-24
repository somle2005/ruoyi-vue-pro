package com.xiaohongshu.fls.opensdk.entity;

import com.xiaohongshu.fls.opensdk.client.BaseClient;
import com.xiaohongshu.fls.opensdk.util.Utils;

public class BaseRequest {
   public String method;
   public String appId;
   public String sign;
   public String timestamp;
   public String version;
   public String accessToken;

   public void addParameter(BaseClient client, String accessToken) {
      this.appId = client.appId;
      this.timestamp = System.currentTimeMillis() / 1000L + "";
      this.version = client.version;
      this.accessToken = accessToken;
      Utils.addSign(this, client.appSecret);
   }

   public String getMethod() {
      return this.method;
   }

   public void setMethod(String method) {
      this.method = method;
   }

   public String getAppId() {
      return this.appId;
   }

   public void setAppId(String appId) {
      this.appId = appId;
   }

   public String getSign() {
      return this.sign;
   }

   public void setSign(String sign) {
      this.sign = sign;
   }

   public String getTimestamp() {
      return this.timestamp;
   }

   public void setTimestamp(String timestamp) {
      this.timestamp = timestamp;
   }

   public String getVersion() {
      return this.version;
   }

   public void setVersion(String version) {
      this.version = version;
   }

   public String getAccessToken() {
      return this.accessToken;
   }

   public void setAccessToken(String accessToken) {
      this.accessToken = accessToken;
   }

   public void setParameters() {
   }
}
