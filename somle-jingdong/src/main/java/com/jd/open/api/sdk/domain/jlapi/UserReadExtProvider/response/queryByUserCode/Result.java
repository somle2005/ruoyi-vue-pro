package com.jd.open.api.sdk.domain.jlapi.UserReadExtProvider.response.queryByUserCode;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class Result implements Serializable {
   private int code;
   private boolean success;
   private String message;
   private UserCodeExtRespDTO data;

   @JsonProperty("code")
   public void setCode(int code) {
      this.code = code;
   }

   @JsonProperty("code")
   public int getCode() {
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
   public void setData(UserCodeExtRespDTO data) {
      this.data = data;
   }

   @JsonProperty("data")
   public UserCodeExtRespDTO getData() {
      return this.data;
   }
}
