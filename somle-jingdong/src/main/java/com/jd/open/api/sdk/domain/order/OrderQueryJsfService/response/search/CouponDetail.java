package com.jd.open.api.sdk.domain.order.OrderQueryJsfService.response.search;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class CouponDetail implements Serializable {
   private String orderId;
   private String skuId;
   private String couponType;
   private String couponPrice;

   @JsonProperty("orderId")
   public void setOrderId(String orderId) {
      this.orderId = orderId;
   }

   @JsonProperty("orderId")
   public String getOrderId() {
      return this.orderId;
   }

   @JsonProperty("skuId")
   public void setSkuId(String skuId) {
      this.skuId = skuId;
   }

   @JsonProperty("skuId")
   public String getSkuId() {
      return this.skuId;
   }

   @JsonProperty("couponType")
   public void setCouponType(String couponType) {
      this.couponType = couponType;
   }

   @JsonProperty("couponType")
   public String getCouponType() {
      return this.couponType;
   }

   @JsonProperty("couponPrice")
   public void setCouponPrice(String couponPrice) {
      this.couponPrice = couponPrice;
   }

   @JsonProperty("couponPrice")
   public String getCouponPrice() {
      return this.couponPrice;
   }
}
