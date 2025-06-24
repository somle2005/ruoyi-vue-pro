package com.jd.open.api.sdk.domain.hudong.CouponOuterWriteService.request.createCoupon;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class ClientInfo implements Serializable {
   private String appName;
   private String appId;
   private String uuid;
   private String ip;

   @JsonProperty("appName")
   public void setAppName(String appName) {
      this.appName = appName;
   }

   @JsonProperty("appName")
   public String getAppName() {
      return this.appName;
   }

   @JsonProperty("appId")
   public void setAppId(String appId) {
      this.appId = appId;
   }

   @JsonProperty("appId")
   public String getAppId() {
      return this.appId;
   }

   @JsonProperty("uuid")
   public void setUuid(String uuid) {
      this.uuid = uuid;
   }

   @JsonProperty("uuid")
   public String getUuid() {
      return this.uuid;
   }

   @JsonProperty("ip")
   public void setIp(String ip) {
      this.ip = ip;
   }

   @JsonProperty("ip")
   public String getIp() {
      return this.ip;
   }
}
