package com.jd.open.api.sdk.domain.hudong.PresaleWriteService.request.create;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;

public class PresaleSkuInfo implements Serializable {
   private Integer[] stepTwoNumber;
   private BigDecimal[] depositWorth;
   private Long[] wareId;
   private Integer[] stepThreeNumber;
   private Integer[] stepOneNumber;
   private BigDecimal[] stepThreePrice;
   private BigDecimal[] stepTwoPrice;
   private BigDecimal[] oriPrice;
   private BigDecimal[] stepOnePrice;
   private BigDecimal[] earnest;
   private Long[] skuId;

   @JsonProperty("stepTwoNumber")
   public void setStepTwoNumber(Integer[] stepTwoNumber) {
      this.stepTwoNumber = stepTwoNumber;
   }

   @JsonProperty("stepTwoNumber")
   public Integer[] getStepTwoNumber() {
      return this.stepTwoNumber;
   }

   @JsonProperty("depositWorth")
   public void setDepositWorth(BigDecimal[] depositWorth) {
      this.depositWorth = depositWorth;
   }

   @JsonProperty("depositWorth")
   public BigDecimal[] getDepositWorth() {
      return this.depositWorth;
   }

   @JsonProperty("wareId")
   public void setWareId(Long[] wareId) {
      this.wareId = wareId;
   }

   @JsonProperty("wareId")
   public Long[] getWareId() {
      return this.wareId;
   }

   @JsonProperty("stepThreeNumber")
   public void setStepThreeNumber(Integer[] stepThreeNumber) {
      this.stepThreeNumber = stepThreeNumber;
   }

   @JsonProperty("stepThreeNumber")
   public Integer[] getStepThreeNumber() {
      return this.stepThreeNumber;
   }

   @JsonProperty("stepOneNumber")
   public void setStepOneNumber(Integer[] stepOneNumber) {
      this.stepOneNumber = stepOneNumber;
   }

   @JsonProperty("stepOneNumber")
   public Integer[] getStepOneNumber() {
      return this.stepOneNumber;
   }

   @JsonProperty("stepThreePrice")
   public void setStepThreePrice(BigDecimal[] stepThreePrice) {
      this.stepThreePrice = stepThreePrice;
   }

   @JsonProperty("stepThreePrice")
   public BigDecimal[] getStepThreePrice() {
      return this.stepThreePrice;
   }

   @JsonProperty("stepTwoPrice")
   public void setStepTwoPrice(BigDecimal[] stepTwoPrice) {
      this.stepTwoPrice = stepTwoPrice;
   }

   @JsonProperty("stepTwoPrice")
   public BigDecimal[] getStepTwoPrice() {
      return this.stepTwoPrice;
   }

   @JsonProperty("oriPrice")
   public void setOriPrice(BigDecimal[] oriPrice) {
      this.oriPrice = oriPrice;
   }

   @JsonProperty("oriPrice")
   public BigDecimal[] getOriPrice() {
      return this.oriPrice;
   }

   @JsonProperty("stepOnePrice")
   public void setStepOnePrice(BigDecimal[] stepOnePrice) {
      this.stepOnePrice = stepOnePrice;
   }

   @JsonProperty("stepOnePrice")
   public BigDecimal[] getStepOnePrice() {
      return this.stepOnePrice;
   }

   @JsonProperty("earnest")
   public void setEarnest(BigDecimal[] earnest) {
      this.earnest = earnest;
   }

   @JsonProperty("earnest")
   public BigDecimal[] getEarnest() {
      return this.earnest;
   }

   @JsonProperty("skuId")
   public void setSkuId(Long[] skuId) {
      this.skuId = skuId;
   }

   @JsonProperty("skuId")
   public Long[] getSkuId() {
      return this.skuId;
   }
}
