package com.jd.open.api.sdk.response.evaluation;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.response.AbstractResponse;

public class PopPopCommentJsfServiceSaveReplyResponse extends AbstractResponse {
   private String resultCode;
   private String resultMsg;

   @JsonProperty("resultCode")
   public void setResultCode(String resultCode) {
      this.resultCode = resultCode;
   }

   @JsonProperty("resultCode")
   public String getResultCode() {
      return this.resultCode;
   }

   @JsonProperty("resultMsg")
   public void setResultMsg(String resultMsg) {
      this.resultMsg = resultMsg;
   }

   @JsonProperty("resultMsg")
   public String getResultMsg() {
      return this.resultMsg;
   }
}
