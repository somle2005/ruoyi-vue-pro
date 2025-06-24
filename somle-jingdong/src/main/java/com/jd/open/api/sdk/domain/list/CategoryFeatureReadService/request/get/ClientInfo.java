package com.jd.open.api.sdk.domain.list.CategoryFeatureReadService.request.get;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class ClientInfo implements Serializable {
   private String ip;
   private String userAgent;

   @JsonProperty("ip")
   public void setIp(String ip) {
      this.ip = ip;
   }

   @JsonProperty("ip")
   public String getIp() {
      return this.ip;
   }

   @JsonProperty("userAgent")
   public void setUserAgent(String userAgent) {
      this.userAgent = userAgent;
   }

   @JsonProperty("userAgent")
   public String getUserAgent() {
      return this.userAgent;
   }
}
