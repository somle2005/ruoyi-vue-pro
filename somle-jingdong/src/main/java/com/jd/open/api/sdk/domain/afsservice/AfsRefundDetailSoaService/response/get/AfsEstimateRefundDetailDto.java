package com.jd.open.api.sdk.domain.afsservice.AfsRefundDetailSoaService.response.get;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

public class AfsEstimateRefundDetailDto implements Serializable {
   private BigDecimal payAmount;
   private List<RefundFeeDetailDto> payFeeDetails;
   private List<RefundFeeDetailDto> cutFeeDetails;
   private BigDecimal maxAdjustmentAmount;
   private BigDecimal cutAmount;
   private BigDecimal maxRefundAmount;

   @JsonProperty("payAmount")
   public void setPayAmount(BigDecimal payAmount) {
      this.payAmount = payAmount;
   }

   @JsonProperty("payAmount")
   public BigDecimal getPayAmount() {
      return this.payAmount;
   }

   @JsonProperty("payFeeDetails")
   public void setPayFeeDetails(List<RefundFeeDetailDto> payFeeDetails) {
      this.payFeeDetails = payFeeDetails;
   }

   @JsonProperty("payFeeDetails")
   public List<RefundFeeDetailDto> getPayFeeDetails() {
      return this.payFeeDetails;
   }

   @JsonProperty("cutFeeDetails")
   public void setCutFeeDetails(List<RefundFeeDetailDto> cutFeeDetails) {
      this.cutFeeDetails = cutFeeDetails;
   }

   @JsonProperty("cutFeeDetails")
   public List<RefundFeeDetailDto> getCutFeeDetails() {
      return this.cutFeeDetails;
   }

   @JsonProperty("maxAdjustmentAmount")
   public void setMaxAdjustmentAmount(BigDecimal maxAdjustmentAmount) {
      this.maxAdjustmentAmount = maxAdjustmentAmount;
   }

   @JsonProperty("maxAdjustmentAmount")
   public BigDecimal getMaxAdjustmentAmount() {
      return this.maxAdjustmentAmount;
   }

   @JsonProperty("cutAmount")
   public void setCutAmount(BigDecimal cutAmount) {
      this.cutAmount = cutAmount;
   }

   @JsonProperty("cutAmount")
   public BigDecimal getCutAmount() {
      return this.cutAmount;
   }

   @JsonProperty("maxRefundAmount")
   public void setMaxRefundAmount(BigDecimal maxRefundAmount) {
      this.maxRefundAmount = maxRefundAmount;
   }

   @JsonProperty("maxRefundAmount")
   public BigDecimal getMaxRefundAmount() {
      return this.maxRefundAmount;
   }
}
