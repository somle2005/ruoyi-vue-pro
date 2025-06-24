package com.jd.open.api.sdk.domain.jinsuanpan.BillQueryServiceProvider.response.queryCouponListByCondition;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class BillCouponMO implements Serializable {
   private String couponName;
   private String effectDate;
   private String couponSource;
   private Long orderId;
   private String couponType;
   private List<BearerMo> bearerList;
   private String couponBatchCode;
   private String couponCode;
   private String skuId;

   @JsonProperty("couponName")
   public void setCouponName(String couponName) {
      this.couponName = couponName;
   }

   @JsonProperty("couponName")
   public String getCouponName() {
      return this.couponName;
   }

   @JsonProperty("effectDate")
   public void setEffectDate(String effectDate) {
      this.effectDate = effectDate;
   }

   @JsonProperty("effectDate")
   public String getEffectDate() {
      return this.effectDate;
   }

   @JsonProperty("couponSource")
   public void setCouponSource(String couponSource) {
      this.couponSource = couponSource;
   }

   @JsonProperty("couponSource")
   public String getCouponSource() {
      return this.couponSource;
   }

   @JsonProperty("orderId")
   public void setOrderId(Long orderId) {
      this.orderId = orderId;
   }

   @JsonProperty("orderId")
   public Long getOrderId() {
      return this.orderId;
   }

   @JsonProperty("couponType")
   public void setCouponType(String couponType) {
      this.couponType = couponType;
   }

   @JsonProperty("couponType")
   public String getCouponType() {
      return this.couponType;
   }

   @JsonProperty("bearerList")
   public void setBearerList(List<BearerMo> bearerList) {
      this.bearerList = bearerList;
   }

   @JsonProperty("bearerList")
   public List<BearerMo> getBearerList() {
      return this.bearerList;
   }

   @JsonProperty("couponBatchCode")
   public void setCouponBatchCode(String couponBatchCode) {
      this.couponBatchCode = couponBatchCode;
   }

   @JsonProperty("couponBatchCode")
   public String getCouponBatchCode() {
      return this.couponBatchCode;
   }

   @JsonProperty("couponCode")
   public void setCouponCode(String couponCode) {
      this.couponCode = couponCode;
   }

   @JsonProperty("couponCode")
   public String getCouponCode() {
      return this.couponCode;
   }

   @JsonProperty("skuId")
   public void setSkuId(String skuId) {
      this.skuId = skuId;
   }

   @JsonProperty("skuId")
   public String getSkuId() {
      return this.skuId;
   }
}
