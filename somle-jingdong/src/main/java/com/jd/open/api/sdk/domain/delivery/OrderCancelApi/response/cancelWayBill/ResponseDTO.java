package com.jd.open.api.sdk.domain.delivery.OrderCancelApi.response.cancelWayBill;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class ResponseDTO implements Serializable {
   private String statusMessage;
   private String statusCode;

   @JsonProperty("statusMessage")
   public void setStatusMessage(String statusMessage) {
      this.statusMessage = statusMessage;
   }

   @JsonProperty("statusMessage")
   public String getStatusMessage() {
      return this.statusMessage;
   }

   @JsonProperty("statusCode")
   public void setStatusCode(String statusCode) {
      this.statusCode = statusCode;
   }

   @JsonProperty("statusCode")
   public String getStatusCode() {
      return this.statusCode;
   }
}
