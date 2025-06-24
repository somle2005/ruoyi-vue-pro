package com.jd.open.api.sdk.domain.risk.KeeperWareRectificationService.response.detail;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class Response implements Serializable {
   private String code;
   private boolean success;
   private String errorMsg;
   private RectificationModuleInfoVO data;

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

   @JsonProperty("errorMsg")
   public void setErrorMsg(String errorMsg) {
      this.errorMsg = errorMsg;
   }

   @JsonProperty("errorMsg")
   public String getErrorMsg() {
      return this.errorMsg;
   }

   @JsonProperty("data")
   public void setData(RectificationModuleInfoVO data) {
      this.data = data;
   }

   @JsonProperty("data")
   public RectificationModuleInfoVO getData() {
      return this.data;
   }
}
