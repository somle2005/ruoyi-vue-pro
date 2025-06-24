package com.jd.open.api.sdk.domain.afsservice.NegotiationOperateSoaService.response.get;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

public class CanNegotiationUpdateDTO implements Serializable {
   private List<AfterSalesTypeDTO> afterSalesTypeList;
   private List<ApplyReasonDTO> afterSalesReasonList;
   private BigDecimal refundAmount;

   @JsonProperty("afterSalesTypeList")
   public void setAfterSalesTypeList(List<AfterSalesTypeDTO> afterSalesTypeList) {
      this.afterSalesTypeList = afterSalesTypeList;
   }

   @JsonProperty("afterSalesTypeList")
   public List<AfterSalesTypeDTO> getAfterSalesTypeList() {
      return this.afterSalesTypeList;
   }

   @JsonProperty("afterSalesReasonList")
   public void setAfterSalesReasonList(List<ApplyReasonDTO> afterSalesReasonList) {
      this.afterSalesReasonList = afterSalesReasonList;
   }

   @JsonProperty("afterSalesReasonList")
   public List<ApplyReasonDTO> getAfterSalesReasonList() {
      return this.afterSalesReasonList;
   }

   @JsonProperty("refundAmount")
   public void setRefundAmount(BigDecimal refundAmount) {
      this.refundAmount = refundAmount;
   }

   @JsonProperty("refundAmount")
   public BigDecimal getRefundAmount() {
      return this.refundAmount;
   }
}
