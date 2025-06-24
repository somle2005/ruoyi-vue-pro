package com.jd.open.api.sdk.domain.order.PopOrderBasicService.response.coupondetail;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;

public class OrderCouponDetail implements Serializable {
   private String jdCouponId;
   private String couponTypeDesc;
   private String couponPrice;
   private Long couponId;
   private String couponName;
   private Integer couponNum;
   private Boolean priceDivide;
   private BigDecimal venderDivideMoney;
   private BigDecimal jdDivideMoney;

   @JsonProperty("jdCouponId")
   public void setJdCouponId(String jdCouponId) {
      this.jdCouponId = jdCouponId;
   }

   @JsonProperty("jdCouponId")
   public String getJdCouponId() {
      return this.jdCouponId;
   }

   @JsonProperty("couponTypeDesc")
   public void setCouponTypeDesc(String couponTypeDesc) {
      this.couponTypeDesc = couponTypeDesc;
   }

   @JsonProperty("couponTypeDesc")
   public String getCouponTypeDesc() {
      return this.couponTypeDesc;
   }

   @JsonProperty("couponPrice")
   public void setCouponPrice(String couponPrice) {
      this.couponPrice = couponPrice;
   }

   @JsonProperty("couponPrice")
   public String getCouponPrice() {
      return this.couponPrice;
   }

   @JsonProperty("couponId")
   public void setCouponId(Long couponId) {
      this.couponId = couponId;
   }

   @JsonProperty("couponId")
   public Long getCouponId() {
      return this.couponId;
   }

   @JsonProperty("couponName")
   public void setCouponName(String couponName) {
      this.couponName = couponName;
   }

   @JsonProperty("couponName")
   public String getCouponName() {
      return this.couponName;
   }

   @JsonProperty("couponNum")
   public void setCouponNum(Integer couponNum) {
      this.couponNum = couponNum;
   }

   @JsonProperty("couponNum")
   public Integer getCouponNum() {
      return this.couponNum;
   }

   @JsonProperty("priceDivide")
   public void setPriceDivide(Boolean priceDivide) {
      this.priceDivide = priceDivide;
   }

   @JsonProperty("priceDivide")
   public Boolean getPriceDivide() {
      return this.priceDivide;
   }

   @JsonProperty("venderDivideMoney")
   public void setVenderDivideMoney(BigDecimal venderDivideMoney) {
      this.venderDivideMoney = venderDivideMoney;
   }

   @JsonProperty("venderDivideMoney")
   public BigDecimal getVenderDivideMoney() {
      return this.venderDivideMoney;
   }

   @JsonProperty("jdDivideMoney")
   public void setJdDivideMoney(BigDecimal jdDivideMoney) {
      this.jdDivideMoney = jdDivideMoney;
   }

   @JsonProperty("jdDivideMoney")
   public BigDecimal getJdDivideMoney() {
      return this.jdDivideMoney;
   }
}
