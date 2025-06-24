package com.jd.open.api.sdk.domain.price.ConsumptionJosFacade.response.query;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class Response implements Serializable {
   private String traceId;
   private String code;
   private String message;
   private Boolean success;
   private ConsumptionDetailDTO data;

   @JsonProperty("trace_Id")
   public void setTraceId(String traceId) {
      this.traceId = traceId;
   }

   @JsonProperty("trace_Id")
   public String getTraceId() {
      return this.traceId;
   }

   @JsonProperty("code")
   public void setCode(String code) {
      this.code = code;
   }

   @JsonProperty("code")
   public String getCode() {
      return this.code;
   }

   @JsonProperty("message")
   public void setMessage(String message) {
      this.message = message;
   }

   @JsonProperty("message")
   public String getMessage() {
      return this.message;
   }

   @JsonProperty("success")
   public void setSuccess(Boolean success) {
      this.success = success;
   }

   @JsonProperty("success")
   public Boolean getSuccess() {
      return this.success;
   }

   @JsonProperty("data")
   public void setData(ConsumptionDetailDTO data) {
      this.data = data;
   }

   @JsonProperty("data")
   public ConsumptionDetailDTO getData() {
      return this.data;
   }
}
