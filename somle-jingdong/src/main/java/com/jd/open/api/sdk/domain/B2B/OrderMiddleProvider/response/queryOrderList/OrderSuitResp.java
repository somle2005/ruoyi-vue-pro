package com.jd.open.api.sdk.domain.B2B.OrderMiddleProvider.response.queryOrderList;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;

public class OrderSuitResp implements Serializable {
   private BigDecimal addMoney;
   private Long id;
   private BigDecimal needMoney;
   private String promotionCode;
   private String promotionMsg;
   private String suitName;
   private Integer suitNum;
   private Integer suitType;
   private BigDecimal totalDiscount;
   private BigDecimal totalOriginalPrice;
   private BigDecimal totalReward;
   private Long virtualSkuId;

   @JsonProperty("addMoney")
   public void setAddMoney(BigDecimal addMoney) {
      this.addMoney = addMoney;
   }

   @JsonProperty("addMoney")
   public BigDecimal getAddMoney() {
      return this.addMoney;
   }

   @JsonProperty("id")
   public void setId(Long id) {
      this.id = id;
   }

   @JsonProperty("id")
   public Long getId() {
      return this.id;
   }

   @JsonProperty("needMoney")
   public void setNeedMoney(BigDecimal needMoney) {
      this.needMoney = needMoney;
   }

   @JsonProperty("needMoney")
   public BigDecimal getNeedMoney() {
      return this.needMoney;
   }

   @JsonProperty("promotionCode")
   public void setPromotionCode(String promotionCode) {
      this.promotionCode = promotionCode;
   }

   @JsonProperty("promotionCode")
   public String getPromotionCode() {
      return this.promotionCode;
   }

   @JsonProperty("promotionMsg")
   public void setPromotionMsg(String promotionMsg) {
      this.promotionMsg = promotionMsg;
   }

   @JsonProperty("promotionMsg")
   public String getPromotionMsg() {
      return this.promotionMsg;
   }

   @JsonProperty("suitName")
   public void setSuitName(String suitName) {
      this.suitName = suitName;
   }

   @JsonProperty("suitName")
   public String getSuitName() {
      return this.suitName;
   }

   @JsonProperty("suitNum")
   public void setSuitNum(Integer suitNum) {
      this.suitNum = suitNum;
   }

   @JsonProperty("suitNum")
   public Integer getSuitNum() {
      return this.suitNum;
   }

   @JsonProperty("suitType")
   public void setSuitType(Integer suitType) {
      this.suitType = suitType;
   }

   @JsonProperty("suitType")
   public Integer getSuitType() {
      return this.suitType;
   }

   @JsonProperty("totalDiscount")
   public void setTotalDiscount(BigDecimal totalDiscount) {
      this.totalDiscount = totalDiscount;
   }

   @JsonProperty("totalDiscount")
   public BigDecimal getTotalDiscount() {
      return this.totalDiscount;
   }

   @JsonProperty("totalOriginalPrice")
   public void setTotalOriginalPrice(BigDecimal totalOriginalPrice) {
      this.totalOriginalPrice = totalOriginalPrice;
   }

   @JsonProperty("totalOriginalPrice")
   public BigDecimal getTotalOriginalPrice() {
      return this.totalOriginalPrice;
   }

   @JsonProperty("totalReward")
   public void setTotalReward(BigDecimal totalReward) {
      this.totalReward = totalReward;
   }

   @JsonProperty("totalReward")
   public BigDecimal getTotalReward() {
      return this.totalReward;
   }

   @JsonProperty("virtualSkuId")
   public void setVirtualSkuId(Long virtualSkuId) {
      this.virtualSkuId = virtualSkuId;
   }

   @JsonProperty("virtualSkuId")
   public Long getVirtualSkuId() {
      return this.virtualSkuId;
   }
}
