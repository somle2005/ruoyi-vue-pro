package com.jd.open.api.sdk.domain.afsservice.ServiceCommonProvider.response.get;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class PublicResultObject4 implements Serializable {
   private Integer resultCode;
   private String resultErrorMsg;
   private AfsRefundInfoOut afsRefundInfoOut;

   @JsonProperty("resultCode")
   public void setResultCode(Integer resultCode) {
      this.resultCode = resultCode;
   }

   @JsonProperty("resultCode")
   public Integer getResultCode() {
      return this.resultCode;
   }

   @JsonProperty("resultErrorMsg")
   public void setResultErrorMsg(String resultErrorMsg) {
      this.resultErrorMsg = resultErrorMsg;
   }

   @JsonProperty("resultErrorMsg")
   public String getResultErrorMsg() {
      return this.resultErrorMsg;
   }

   @JsonProperty("afsRefundInfoOut")
   public void setAfsRefundInfoOut(AfsRefundInfoOut afsRefundInfoOut) {
      this.afsRefundInfoOut = afsRefundInfoOut;
   }

   @JsonProperty("afsRefundInfoOut")
   public AfsRefundInfoOut getAfsRefundInfoOut() {
      return this.afsRefundInfoOut;
   }
}
