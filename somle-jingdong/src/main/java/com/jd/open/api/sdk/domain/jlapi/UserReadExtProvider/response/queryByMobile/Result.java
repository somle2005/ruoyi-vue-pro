package com.jd.open.api.sdk.domain.jlapi.UserReadExtProvider.response.queryByMobile;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class Result implements Serializable {
   private int code;
   private boolean success;
   private String message;
   private List<UserExtRespDTO> data;

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
   public void setData(List<UserExtRespDTO> data) {
      this.data = data;
   }

   @JsonProperty("data")
   public List<UserExtRespDTO> getData() {
      return this.data;
   }
}
