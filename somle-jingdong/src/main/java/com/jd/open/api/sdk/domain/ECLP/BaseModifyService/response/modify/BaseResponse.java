package com.jd.open.api.sdk.domain.ECLP.BaseModifyService.response.modify;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class BaseResponse implements Serializable {
   private String resultMsg;
   private int resultCode;

   @JsonProperty("resultMsg")
   public void setResultMsg(String resultMsg) {
      this.resultMsg = resultMsg;
   }

   @JsonProperty("resultMsg")
   public String getResultMsg() {
      return this.resultMsg;
   }

   @JsonProperty("resultCode")
   public void setResultCode(int resultCode) {
      this.resultCode = resultCode;
   }

   @JsonProperty("resultCode")
   public int getResultCode() {
      return this.resultCode;
   }
}
