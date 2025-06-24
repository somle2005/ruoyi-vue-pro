package com.jd.open.api.sdk.domain.wujiemiandan.WaybillAppendOpenApi.response.append;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class Response implements Serializable {
   private String statusMessage;
   private Integer statusCode;
   private WaybillAppendResponse data;

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
   public void setData(WaybillAppendResponse data) {
      this.data = data;
   }

   @JsonProperty("data")
   public WaybillAppendResponse getData() {
      return this.data;
   }
}
