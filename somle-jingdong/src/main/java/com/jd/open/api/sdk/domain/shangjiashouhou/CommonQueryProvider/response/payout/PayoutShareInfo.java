package com.jd.open.api.sdk.domain.shangjiashouhou.CommonQueryProvider.response.payout;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;

public class PayoutShareInfo implements Serializable {
   private Integer payoutShareInfoId;
   private Integer payoutId;
   private Integer applyNum;
   private BigDecimal shareMoney;
   private BigDecimal warePrice;
   private String skuId;
   private String wareName;
   private Integer wareNum;

   @JsonProperty("payoutShareInfoId")
   public void setPayoutShareInfoId(Integer payoutShareInfoId) {
      this.payoutShareInfoId = payoutShareInfoId;
   }

   @JsonProperty("payoutShareInfoId")
   public Integer getPayoutShareInfoId() {
      return this.payoutShareInfoId;
   }

   @JsonProperty("payoutId")
   public void setPayoutId(Integer payoutId) {
      this.payoutId = payoutId;
   }

   @JsonProperty("payoutId")
   public Integer getPayoutId() {
      return this.payoutId;
   }

   @JsonProperty("applyNum")
   public void setApplyNum(Integer applyNum) {
      this.applyNum = applyNum;
   }

   @JsonProperty("applyNum")
   public Integer getApplyNum() {
      return this.applyNum;
   }

   @JsonProperty("shareMoney")
   public void setShareMoney(BigDecimal shareMoney) {
      this.shareMoney = shareMoney;
   }

   @JsonProperty("shareMoney")
   public BigDecimal getShareMoney() {
      return this.shareMoney;
   }

   @JsonProperty("warePrice")
   public void setWarePrice(BigDecimal warePrice) {
      this.warePrice = warePrice;
   }

   @JsonProperty("warePrice")
   public BigDecimal getWarePrice() {
      return this.warePrice;
   }

   @JsonProperty("skuId")
   public void setSkuId(String skuId) {
      this.skuId = skuId;
   }

   @JsonProperty("skuId")
   public String getSkuId() {
      return this.skuId;
   }

   @JsonProperty("wareName")
   public void setWareName(String wareName) {
      this.wareName = wareName;
   }

   @JsonProperty("wareName")
   public String getWareName() {
      return this.wareName;
   }

   @JsonProperty("wareNum")
   public void setWareNum(Integer wareNum) {
      this.wareNum = wareNum;
   }

   @JsonProperty("wareNum")
   public Integer getWareNum() {
      return this.wareNum;
   }
}
