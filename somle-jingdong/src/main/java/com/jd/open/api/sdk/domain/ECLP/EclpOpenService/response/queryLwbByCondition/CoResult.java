package com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.queryLwbByCondition;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class CoResult implements Serializable {
   private int resultCode;
   private String resultMsg;
   private LwbMainStatusFull resultData;

   @JsonProperty("resultCode")
   public void setResultCode(int resultCode) {
      this.resultCode = resultCode;
   }

   @JsonProperty("resultCode")
   public int getResultCode() {
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

   @JsonProperty("resultData")
   public void setResultData(LwbMainStatusFull resultData) {
      this.resultData = resultData;
   }

   @JsonProperty("resultData")
   public LwbMainStatusFull getResultData() {
      return this.resultData;
   }
}
