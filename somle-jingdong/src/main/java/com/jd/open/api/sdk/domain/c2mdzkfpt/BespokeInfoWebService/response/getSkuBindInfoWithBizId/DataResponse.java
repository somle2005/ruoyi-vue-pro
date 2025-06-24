package com.jd.open.api.sdk.domain.c2mdzkfpt.BespokeInfoWebService.response.getSkuBindInfoWithBizId;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class DataResponse implements Serializable {
   private String code;
   private boolean success;
   private String message;
   private CustomInfoVo result;

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

   @JsonProperty("result")
   public void setResult(CustomInfoVo result) {
      this.result = result;
   }

   @JsonProperty("result")
   public CustomInfoVo getResult() {
      return this.result;
   }
}
