package com.jd.open.api.sdk.domain.shangjiashouhou.CommonQueryProvider.response.payout;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;

public class PayoutDetailInfo implements Serializable {
   private Integer payoutDetailId;
   private BigDecimal orderPrice;
   private BigDecimal payoutPrice;
   private String payoutCount;
   private Integer couponNum;
   private String couponCode;
   private Boolean distributeStatus;
   private Integer couponType;
   private String couponTypeName;

   @JsonProperty("payoutDetailId")
   public void setPayoutDetailId(Integer payoutDetailId) {
      this.payoutDetailId = payoutDetailId;
   }

   @JsonProperty("payoutDetailId")
   public Integer getPayoutDetailId() {
      return this.payoutDetailId;
   }

   @JsonProperty("orderPrice")
   public void setOrderPrice(BigDecimal orderPrice) {
      this.orderPrice = orderPrice;
   }

   @JsonProperty("orderPrice")
   public BigDecimal getOrderPrice() {
      return this.orderPrice;
   }

   @JsonProperty("payoutPrice")
   public void setPayoutPrice(BigDecimal payoutPrice) {
      this.payoutPrice = payoutPrice;
   }

   @JsonProperty("payoutPrice")
   public BigDecimal getPayoutPrice() {
      return this.payoutPrice;
   }

   @JsonProperty("payoutCount")
   public void setPayoutCount(String payoutCount) {
      this.payoutCount = payoutCount;
   }

   @JsonProperty("payoutCount")
   public String getPayoutCount() {
      return this.payoutCount;
   }

   @JsonProperty("couponNum")
   public void setCouponNum(Integer couponNum) {
      this.couponNum = couponNum;
   }

   @JsonProperty("couponNum")
   public Integer getCouponNum() {
      return this.couponNum;
   }

   @JsonProperty("couponCode")
   public void setCouponCode(String couponCode) {
      this.couponCode = couponCode;
   }

   @JsonProperty("couponCode")
   public String getCouponCode() {
      return this.couponCode;
   }

   @JsonProperty("distributeStatus")
   public void setDistributeStatus(Boolean distributeStatus) {
      this.distributeStatus = distributeStatus;
   }

   @JsonProperty("distributeStatus")
   public Boolean getDistributeStatus() {
      return this.distributeStatus;
   }

   @JsonProperty("couponType")
   public void setCouponType(Integer couponType) {
      this.couponType = couponType;
   }

   @JsonProperty("couponType")
   public Integer getCouponType() {
      return this.couponType;
   }

   @JsonProperty("couponTypeName")
   public void setCouponTypeName(String couponTypeName) {
      this.couponTypeName = couponTypeName;
   }

   @JsonProperty("couponTypeName")
   public String getCouponTypeName() {
      return this.couponTypeName;
   }
}
