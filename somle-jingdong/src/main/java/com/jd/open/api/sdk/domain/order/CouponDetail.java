package com.jd.open.api.sdk.domain.order;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonFilter("CouponDetail")
public class CouponDetail {
   private String orderId;
   private String skuId;
   private String couponType;
   private String couponPrice;

   @JsonProperty("order_id")
   public String getOrderId() {
      return this.orderId;
   }

   @JsonProperty("order_id")
   public void setOrderId(String orderId) {
      this.orderId = orderId;
   }

   @JsonProperty("sku_id")
   public String getSkuId() {
      return this.skuId;
   }

   @JsonProperty("sku_id")
   public void setSkuId(String skuId) {
      this.skuId = skuId;
   }

   @JsonProperty("coupon_type")
   public String getCouponType() {
      return this.couponType;
   }

   @JsonProperty("coupon_type")
   public void setCouponType(String couponType) {
      this.couponType = couponType;
   }

   @JsonProperty("coupon_price")
   public String getCouponPrice() {
      return this.couponPrice;
   }

   @JsonProperty("coupon_price")
   public void setCouponPrice(String couponPrice) {
      this.couponPrice = couponPrice;
   }
}
