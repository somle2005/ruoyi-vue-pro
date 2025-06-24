package com.jd.open.api.sdk.domain.fangchan.ChannelSoaService.response.addOrUpdateChannel;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class BooleanResult implements Serializable {
   private int count;
   private boolean success;
   private int code;
   private String errorMsg;

   @JsonProperty("count")
   public void setCount(int count) {
      this.count = count;
   }

   @JsonProperty("count")
   public int getCount() {
      return this.count;
   }

   @JsonProperty("success")
   public void setSuccess(boolean success) {
      this.success = success;
   }

   @JsonProperty("success")
   public boolean getSuccess() {
      return this.success;
   }

   @JsonProperty("code")
   public void setCode(int code) {
      this.code = code;
   }

   @JsonProperty("code")
   public int getCode() {
      return this.code;
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
