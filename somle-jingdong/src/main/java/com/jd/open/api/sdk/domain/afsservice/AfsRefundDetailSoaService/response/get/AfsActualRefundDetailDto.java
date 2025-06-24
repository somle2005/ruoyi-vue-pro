package com.jd.open.api.sdk.domain.afsservice.AfsRefundDetailSoaService.response.get;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

public class AfsActualRefundDetailDto implements Serializable {
   private String refundMethod;
   private String refundReason;
   private List<RefundFeeDetailDto> actualRefundFeeDetails;
   private BigDecimal actualRefundAmount;

   @JsonProperty("refundMethod")
   public void setRefundMethod(String refundMethod) {
      this.refundMethod = refundMethod;
   }

   @JsonProperty("refundMethod")
   public String getRefundMethod() {
      return this.refundMethod;
   }

   @JsonProperty("refundReason")
   public void setRefundReason(String refundReason) {
      this.refundReason = refundReason;
   }

   @JsonProperty("refundReason")
   public String getRefundReason() {
      return this.refundReason;
   }

   @JsonProperty("actualRefundFeeDetails")
   public void setActualRefundFeeDetails(List<RefundFeeDetailDto> actualRefundFeeDetails) {
      this.actualRefundFeeDetails = actualRefundFeeDetails;
   }

   @JsonProperty("actualRefundFeeDetails")
   public List<RefundFeeDetailDto> getActualRefundFeeDetails() {
      return this.actualRefundFeeDetails;
   }

   @JsonProperty("actualRefundAmount")
   public void setActualRefundAmount(BigDecimal actualRefundAmount) {
      this.actualRefundAmount = actualRefundAmount;
   }

   @JsonProperty("actualRefundAmount")
   public BigDecimal getActualRefundAmount() {
      return this.actualRefundAmount;
   }
}
