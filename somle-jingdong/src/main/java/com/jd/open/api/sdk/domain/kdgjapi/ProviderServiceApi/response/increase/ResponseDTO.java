package com.jd.open.api.sdk.domain.kdgjapi.ProviderServiceApi.response.increase;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class ResponseDTO implements Serializable {
   private Integer statusCode;
   private String statusMessage;

   @JsonProperty("statusCode")
   public void setStatusCode(Integer statusCode) {
      this.statusCode = statusCode;
   }

   @JsonProperty("statusCode")
   public Integer getStatusCode() {
      return this.statusCode;
   }

   @JsonProperty("statusMessage")
   public void setStatusMessage(String statusMessage) {
      this.statusMessage = statusMessage;
   }

   @JsonProperty("statusMessage")
   public String getStatusMessage() {
      return this.statusMessage;
   }
}
