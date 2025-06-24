package com.jd.open.api.sdk.domain.promotion.UnitPromotionWriteService.request.addSkus;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class ClientInfo implements Serializable {
   private String ip;
   private String port;
   private String requestId;

   @JsonProperty("ip")
   public void setIp(String ip) {
      this.ip = ip;
   }

   @JsonProperty("ip")
   public String getIp() {
      return this.ip;
   }

   @JsonProperty("port")
   public void setPort(String port) {
      this.port = port;
   }

   @JsonProperty("port")
   public String getPort() {
      return this.port;
   }

   @JsonProperty("requestId")
   public void setRequestId(String requestId) {
      this.requestId = requestId;
   }

   @JsonProperty("requestId")
   public String getRequestId() {
      return this.requestId;
   }
}
