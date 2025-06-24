package com.jd.open.api.sdk.domain.hudong.SuitPromoWriteOuterService.request.deleteSuitPromo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class ClientInfo implements Serializable {
   private String businessIdentity;
   private String appName;
   private String ip;
   private String appId;
   private String userAgent;
   private String uuid;
   private String version;

   @JsonProperty("businessIdentity")
   public void setBusinessIdentity(String businessIdentity) {
      this.businessIdentity = businessIdentity;
   }

   @JsonProperty("businessIdentity")
   public String getBusinessIdentity() {
      return this.businessIdentity;
   }

   @JsonProperty("appName")
   public void setAppName(String appName) {
      this.appName = appName;
   }

   @JsonProperty("appName")
   public String getAppName() {
      return this.appName;
   }

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

   @JsonProperty("userAgent")
   public void setUserAgent(String userAgent) {
      this.userAgent = userAgent;
   }

   @JsonProperty("userAgent")
   public String getUserAgent() {
      return this.userAgent;
   }

   @JsonProperty("uuid")
   public void setUuid(String uuid) {
      this.uuid = uuid;
   }

   @JsonProperty("uuid")
   public String getUuid() {
      return this.uuid;
   }

   @JsonProperty("version")
   public void setVersion(String version) {
      this.version = version;
   }

   @JsonProperty("version")
   public String getVersion() {
      return this.version;
   }
}
