package com.jd.open.api.sdk.domain.ware.KeeperWarePreDetectService.response.preDetect;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class Response implements Serializable {
   private String errorMsg;
   private String code;
   private boolean success;
   private WarePreDetectResponse data;

   @JsonProperty("errorMsg")
   public void setErrorMsg(String errorMsg) {
      this.errorMsg = errorMsg;
   }

   @JsonProperty("errorMsg")
   public String getErrorMsg() {
      return this.errorMsg;
   }

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

   @JsonProperty("data")
   public void setData(WarePreDetectResponse data) {
      this.data = data;
   }

   @JsonProperty("data")
   public WarePreDetectResponse getData() {
      return this.data;
   }
}
