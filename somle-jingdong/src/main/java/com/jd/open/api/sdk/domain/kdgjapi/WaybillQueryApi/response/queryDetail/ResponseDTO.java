package com.jd.open.api.sdk.domain.kdgjapi.WaybillQueryApi.response.queryDetail;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class ResponseDTO implements Serializable {
   private String requestId;
   private String statusMessage;
   private Integer statusCode;
   private WaybillDTO data;

   @JsonProperty("requestId")
   public void setRequestId(String requestId) {
      this.requestId = requestId;
   }

   @JsonProperty("requestId")
   public String getRequestId() {
      return this.requestId;
   }

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
   public void setData(WaybillDTO data) {
      this.data = data;
   }

   @JsonProperty("data")
   public WaybillDTO getData() {
      return this.data;
   }
}
