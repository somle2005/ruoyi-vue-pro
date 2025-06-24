package com.jd.open.api.sdk.domain.afsservice.ServiceCommonProvider.response.get;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class AfsRefundInfoOut implements Serializable {
   private List<Integer> afsFinanceDetailOuts;
   private List<String> afsSignatureOut;
   private AfsRefundOut afsRefundOut;

   @JsonProperty("afsFinanceDetailOuts")
   public void setAfsFinanceDetailOuts(List<Integer> afsFinanceDetailOuts) {
      this.afsFinanceDetailOuts = afsFinanceDetailOuts;
   }

   @JsonProperty("afsFinanceDetailOuts")
   public List<Integer> getAfsFinanceDetailOuts() {
      return this.afsFinanceDetailOuts;
   }

   @JsonProperty("afsSignatureOut")
   public void setAfsSignatureOut(List<String> afsSignatureOut) {
      this.afsSignatureOut = afsSignatureOut;
   }

   @JsonProperty("afsSignatureOut")
   public List<String> getAfsSignatureOut() {
      return this.afsSignatureOut;
   }

   @JsonProperty("afsRefundOut")
   public void setAfsRefundOut(AfsRefundOut afsRefundOut) {
      this.afsRefundOut = afsRefundOut;
   }

   @JsonProperty("afsRefundOut")
   public AfsRefundOut getAfsRefundOut() {
      return this.afsRefundOut;
   }
}
