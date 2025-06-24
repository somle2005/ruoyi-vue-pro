package com.jd.open.api.sdk.domain.fresh7.JosApi.response.offline;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class StateResult implements Serializable {
   private Integer code;
   private boolean success;
   private String errorMsg;

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

   @JsonProperty("errorMsg")
   public void setErrorMsg(String errorMsg) {
      this.errorMsg = errorMsg;
   }

   @JsonProperty("errorMsg")
   public String getErrorMsg() {
      return this.errorMsg;
   }
}
