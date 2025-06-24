package com.jd.open.api.sdk.domain.wujiemiandan.WaybillReceiveOpenApi.response.create;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class Response implements Serializable {
   private String statusMessage;
   private Integer statusCode;
   private WaybillReceiveResponse data;

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

   @JsonProperty("data")
   public void setData(WaybillReceiveResponse data) {
      this.data = data;
   }

   @JsonProperty("data")
   public WaybillReceiveResponse getData() {
      return this.data;
   }
}
