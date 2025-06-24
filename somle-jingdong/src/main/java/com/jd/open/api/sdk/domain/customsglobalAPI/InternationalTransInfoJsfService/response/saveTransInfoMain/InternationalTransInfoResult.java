package com.jd.open.api.sdk.domain.customsglobalAPI.InternationalTransInfoJsfService.response.saveTransInfoMain;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class InternationalTransInfoResult implements Serializable {
   private boolean success;
   private String errorCode;
   private String errorMsg;
   private int totalNum;

   @JsonProperty("success")
   public void setSuccess(boolean success) {
      this.success = success;
   }

   @JsonProperty("success")
   public boolean getSuccess() {
      return this.success;
   }

   @JsonProperty("errorCode")
   public void setErrorCode(String errorCode) {
      this.errorCode = errorCode;
   }

   @JsonProperty("errorCode")
   public String getErrorCode() {
      return this.errorCode;
   }

   @JsonProperty("errorMsg")
   public void setErrorMsg(String errorMsg) {
      this.errorMsg = errorMsg;
   }

   @JsonProperty("errorMsg")
   public String getErrorMsg() {
      return this.errorMsg;
   }

   @JsonProperty("totalNum")
   public void setTotalNum(int totalNum) {
      this.totalNum = totalNum;
   }

   @JsonProperty("totalNum")
   public int getTotalNum() {
      return this.totalNum;
   }
}
