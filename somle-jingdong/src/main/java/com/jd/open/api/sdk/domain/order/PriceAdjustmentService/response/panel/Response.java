package com.jd.open.api.sdk.domain.order.PriceAdjustmentService.response.panel;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class Response implements Serializable {
   private String code;
   private boolean success;
   private String message;
   private AdjustmentInfoDto data;
   private String traceId;

   @JsonProperty("code")
   public void setCode(String code) {
      this.code = code;
   }

   @JsonProperty("code")
   public String getCode() {
      return this.code;
   }

   @JsonProperty("success")
   public void setSuccess(boolean success) {
      this.success = success;
   }

   @JsonProperty("success")
   public boolean getSuccess() {
      return this.success;
   }

   @JsonProperty("message")
   public void setMessage(String message) {
      this.message = message;
   }

   @JsonProperty("message")
   public String getMessage() {
      return this.message;
   }

   @JsonProperty("data")
   public void setData(AdjustmentInfoDto data) {
      this.data = data;
   }

   @JsonProperty("data")
   public AdjustmentInfoDto getData() {
      return this.data;
   }

   @JsonProperty("traceId")
   public void setTraceId(String traceId) {
      this.traceId = traceId;
   }

   @JsonProperty("traceId")
   public String getTraceId() {
      return this.traceId;
   }
}
