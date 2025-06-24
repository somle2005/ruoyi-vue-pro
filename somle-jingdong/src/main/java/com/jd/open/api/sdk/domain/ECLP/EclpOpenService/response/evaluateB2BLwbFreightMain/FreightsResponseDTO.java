package com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.evaluateB2BLwbFreightMain;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class FreightsResponseDTO implements Serializable {
   private Byte resultCode;
   private String resultMsg;
   private FreightsDataDTO resultData;

   @JsonProperty("resultCode")
   public void setResultCode(Byte resultCode) {
      this.resultCode = resultCode;
   }

   @JsonProperty("resultCode")
   public Byte getResultCode() {
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
   public void setResultData(FreightsDataDTO resultData) {
      this.resultData = resultData;
   }

   @JsonProperty("resultData")
   public FreightsDataDTO getResultData() {
      return this.resultData;
   }
}
