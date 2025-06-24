package com.jd.open.api.sdk.domain.gysyuyue.SvcBookingApiService.response.number;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class SvcResult implements Serializable {
   private boolean success;
   private int errCode;
   private String errMsg;
   private SvcApiBindNumberInfo data;

   @JsonProperty("success")
   public void setSuccess(boolean success) {
      this.success = success;
   }

   @JsonProperty("success")
   public boolean getSuccess() {
      return this.success;
   }

   @JsonProperty("errCode")
   public void setErrCode(int errCode) {
      this.errCode = errCode;
   }

   @JsonProperty("errCode")
   public int getErrCode() {
      return this.errCode;
   }

   @JsonProperty("errMsg")
   public void setErrMsg(String errMsg) {
      this.errMsg = errMsg;
   }

   @JsonProperty("errMsg")
   public String getErrMsg() {
      return this.errMsg;
   }

   @JsonProperty("data")
   public void setData(SvcApiBindNumberInfo data) {
      this.data = data;
   }

   @JsonProperty("data")
   public SvcApiBindNumberInfo getData() {
      return this.data;
   }
}
