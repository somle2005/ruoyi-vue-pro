package com.jd.open.api.sdk.domain.order.ReservedPromiseTemplateJosService.response.queryPromiseTemplates;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class Response implements Serializable {
   private String code;
   private boolean success;
   private String message;
   private List<ReservedPromiseTemplate> bizResponse;

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

   @JsonProperty("bizResponse")
   public void setBizResponse(List<ReservedPromiseTemplate> bizResponse) {
      this.bizResponse = bizResponse;
   }

   @JsonProperty("bizResponse")
   public List<ReservedPromiseTemplate> getBizResponse() {
      return this.bizResponse;
   }
}
