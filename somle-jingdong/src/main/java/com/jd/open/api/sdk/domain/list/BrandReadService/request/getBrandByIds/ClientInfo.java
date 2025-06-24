package com.jd.open.api.sdk.domain.list.BrandReadService.request.getBrandByIds;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class ClientInfo implements Serializable {
   private String ip;
   private String appId;
   private String appName;
   private String userAgent;
   private String businessIdentity;

   @JsonProperty("ip")
   public void setIp(String ip) {
      this.ip = ip;
   }

   @JsonProperty("ip")
   public String getIp() {
      return this.ip;
   }

   @JsonProperty("appId")
   public void setAppId(String appId) {
      this.appId = appId;
   }

   @JsonProperty("appId")
   public String getAppId() {
      return this.appId;
   }

   @JsonProperty("appName")
   public void setAppName(String appName) {
      this.appName = appName;
   }

   @JsonProperty("appName")
   public String getAppName() {
      return this.appName;
   }

   @JsonProperty("userAgent")
   public void setUserAgent(String userAgent) {
      this.userAgent = userAgent;
   }

   @JsonProperty("userAgent")
   public String getUserAgent() {
      return this.userAgent;
   }

   @JsonProperty("businessIdentity")
   public void setBusinessIdentity(String businessIdentity) {
      this.businessIdentity = businessIdentity;
   }

   @JsonProperty("businessIdentity")
   public String getBusinessIdentity() {
      return this.businessIdentity;
   }
}
