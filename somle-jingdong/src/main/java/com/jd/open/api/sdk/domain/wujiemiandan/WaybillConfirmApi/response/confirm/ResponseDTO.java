package com.jd.open.api.sdk.domain.wujiemiandan.WaybillConfirmApi.response.confirm;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class ResponseDTO implements Serializable {
   private String statusMessage;
   private Integer statusCode;

   @JsonProperty("statusMessage")
   public void setStatusMessage(String statusMessage) {
      this.statusMessage = statusMessage;
   }

   @JsonProperty("statusMessage")
   public String getStatusMessage() {
      return this.statusMessage;
   }

   @JsonProperty("statusCode")
   public void setStatusCode(Integer statusCode) {
      this.statusCode = statusCode;
   }

   @JsonProperty("statusCode")
   public Integer getStatusCode() {
      return this.statusCode;
   }
}
