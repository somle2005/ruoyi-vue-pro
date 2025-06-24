package com.jd.open.api.sdk.domain.afsservice.AfsRefundDetailSoaService.response.get;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;

public class RefundFeeDetailDto implements Serializable {
   private Integer venderDeductionType;
   private BigDecimal amount;
   private String feeTypeStr;
   private double bearRate;
   private Integer supportAdjustType;

   @JsonProperty("venderDeductionType")
   public void setVenderDeductionType(Integer venderDeductionType) {
      this.venderDeductionType = venderDeductionType;
   }

   @JsonProperty("venderDeductionType")
   public Integer getVenderDeductionType() {
      return this.venderDeductionType;
   }

   @JsonProperty("amount")
   public void setAmount(BigDecimal amount) {
      this.amount = amount;
   }

   @JsonProperty("amount")
   public BigDecimal getAmount() {
      return this.amount;
   }

   @JsonProperty("feeTypeStr")
   public void setFeeTypeStr(String feeTypeStr) {
      this.feeTypeStr = feeTypeStr;
   }

   @JsonProperty("feeTypeStr")
   public String getFeeTypeStr() {
      return this.feeTypeStr;
   }

   @JsonProperty("bearRate")
   public void setBearRate(double bearRate) {
      this.bearRate = bearRate;
   }

   @JsonProperty("bearRate")
   public double getBearRate() {
      return this.bearRate;
   }

   @JsonProperty("supportAdjustType")
   public void setSupportAdjustType(Integer supportAdjustType) {
      this.supportAdjustType = supportAdjustType;
   }

   @JsonProperty("supportAdjustType")
   public Integer getSupportAdjustType() {
      return this.supportAdjustType;
   }
}
