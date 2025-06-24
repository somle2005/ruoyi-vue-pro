package com.jd.open.api.sdk.domain.ware.JOSTextMaterialService.response.batchadd;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class Result implements Serializable {
   private Integer code;
   private boolean success;
   private String message;
   private SaveTextMaterialResult data;

   @JsonProperty("code")
   public void setCode(Integer code) {
      this.code = code;
   }

   @JsonProperty("code")
   public Integer getCode() {
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
   public void setData(SaveTextMaterialResult data) {
      this.data = data;
   }

   @JsonProperty("data")
   public SaveTextMaterialResult getData() {
      return this.data;
   }
}
