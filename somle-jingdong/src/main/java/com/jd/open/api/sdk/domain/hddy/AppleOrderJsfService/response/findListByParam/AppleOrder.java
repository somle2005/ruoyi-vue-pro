package com.jd.open.api.sdk.domain.hddy.AppleOrderJsfService.response.findListByParam;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class AppleOrder implements Serializable {
   private Date payTime;
   private Long orderId;
   private BigDecimal skuAmount;
   private Date refundTime;
   private BigDecimal skuPrice;
   private String skuName;
   private Integer planNum;
   private String itemThirdCateName;
   private String imei1;
   private String itemSecondCateName;
   private Integer skuNum;
   private Long skuId;
   private String activityId;
   private String activityName;

   @JsonProperty("payTime")
   public void setPayTime(Date payTime) {
      this.payTime = payTime;
   }

   @JsonProperty("payTime")
   public Date getPayTime() {
      return this.payTime;
   }

   @JsonProperty("orderId")
   public void setOrderId(Long orderId) {
      this.orderId = orderId;
   }

   @JsonProperty("orderId")
   public Long getOrderId() {
      return this.orderId;
   }

   @JsonProperty("skuAmount")
   public void setSkuAmount(BigDecimal skuAmount) {
      this.skuAmount = skuAmount;
   }

   @JsonProperty("skuAmount")
   public BigDecimal getSkuAmount() {
      return this.skuAmount;
   }

   @JsonProperty("refundTime")
   public void setRefundTime(Date refundTime) {
      this.refundTime = refundTime;
   }

   @JsonProperty("refundTime")
   public Date getRefundTime() {
      return this.refundTime;
   }

   @JsonProperty("skuPrice")
   public void setSkuPrice(BigDecimal skuPrice) {
      this.skuPrice = skuPrice;
   }

   @JsonProperty("skuPrice")
   public BigDecimal getSkuPrice() {
      return this.skuPrice;
   }

   @JsonProperty("skuName")
   public void setSkuName(String skuName) {
      this.skuName = skuName;
   }

   @JsonProperty("skuName")
   public String getSkuName() {
      return this.skuName;
   }

   @JsonProperty("planNum")
   public void setPlanNum(Integer planNum) {
      this.planNum = planNum;
   }

   @JsonProperty("planNum")
   public Integer getPlanNum() {
      return this.planNum;
   }

   @JsonProperty("itemThirdCateName")
   public void setItemThirdCateName(String itemThirdCateName) {
      this.itemThirdCateName = itemThirdCateName;
   }

   @JsonProperty("itemThirdCateName")
   public String getItemThirdCateName() {
      return this.itemThirdCateName;
   }

   @JsonProperty("imei1")
   public void setImei1(String imei1) {
      this.imei1 = imei1;
   }

   @JsonProperty("imei1")
   public String getImei1() {
      return this.imei1;
   }

   @JsonProperty("itemSecondCateName")
   public void setItemSecondCateName(String itemSecondCateName) {
      this.itemSecondCateName = itemSecondCateName;
   }

   @JsonProperty("itemSecondCateName")
   public String getItemSecondCateName() {
      return this.itemSecondCateName;
   }

   @JsonProperty("skuNum")
   public void setSkuNum(Integer skuNum) {
      this.skuNum = skuNum;
   }

   @JsonProperty("skuNum")
   public Integer getSkuNum() {
      return this.skuNum;
   }

   @JsonProperty("skuId")
   public void setSkuId(Long skuId) {
      this.skuId = skuId;
   }

   @JsonProperty("skuId")
   public Long getSkuId() {
      return this.skuId;
   }

   @JsonProperty("activity_id")
   public void setActivityId(String activityId) {
      this.activityId = activityId;
   }

   @JsonProperty("activity_id")
   public String getActivityId() {
      return this.activityId;
   }

   @JsonProperty("activity_name")
   public void setActivityName(String activityName) {
      this.activityName = activityName;
   }

   @JsonProperty("activity_name")
   public String getActivityName() {
      return this.activityName;
   }
}
