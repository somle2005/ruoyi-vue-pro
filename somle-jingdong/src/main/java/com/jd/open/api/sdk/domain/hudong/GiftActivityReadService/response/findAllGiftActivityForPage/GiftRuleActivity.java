package com.jd.open.api.sdk.domain.hudong.GiftActivityReadService.response.findAllGiftActivityForPage;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class GiftRuleActivity implements Serializable {
   private String batchKey;
   private List<GiftSkuActivity> skus;
   private Integer expireType;
   private Long venderId;
   private Long discount;
   private Long couponId;
   private String skuIds;
   private Long prizeId;
   private Long activityId;
   private String putKey;
   private Integer quota;
   private Integer validateDay;
   private Long drawCount;
   private Long promoId;
   private Integer riskValue;
   private Long collectTimes;
   private Date endTime;
   private Integer status;

   @JsonProperty("batchKey")
   public void setBatchKey(String batchKey) {
      this.batchKey = batchKey;
   }

   @JsonProperty("batchKey")
   public String getBatchKey() {
      return this.batchKey;
   }

   @JsonProperty("skus")
   public void setSkus(List<GiftSkuActivity> skus) {
      this.skus = skus;
   }

   @JsonProperty("skus")
   public List<GiftSkuActivity> getSkus() {
      return this.skus;
   }

   @JsonProperty("expireType")
   public void setExpireType(Integer expireType) {
      this.expireType = expireType;
   }

   @JsonProperty("expireType")
   public Integer getExpireType() {
      return this.expireType;
   }

   @JsonProperty("venderId")
   public void setVenderId(Long venderId) {
      this.venderId = venderId;
   }

   @JsonProperty("venderId")
   public Long getVenderId() {
      return this.venderId;
   }

   @JsonProperty("discount")
   public void setDiscount(Long discount) {
      this.discount = discount;
   }

   @JsonProperty("discount")
   public Long getDiscount() {
      return this.discount;
   }

   @JsonProperty("couponId")
   public void setCouponId(Long couponId) {
      this.couponId = couponId;
   }

   @JsonProperty("couponId")
   public Long getCouponId() {
      return this.couponId;
   }

   @JsonProperty("skuIds")
   public void setSkuIds(String skuIds) {
      this.skuIds = skuIds;
   }

   @JsonProperty("skuIds")
   public String getSkuIds() {
      return this.skuIds;
   }

   @JsonProperty("prizeId")
   public void setPrizeId(Long prizeId) {
      this.prizeId = prizeId;
   }

   @JsonProperty("prizeId")
   public Long getPrizeId() {
      return this.prizeId;
   }

   @JsonProperty("activityId")
   public void setActivityId(Long activityId) {
      this.activityId = activityId;
   }

   @JsonProperty("activityId")
   public Long getActivityId() {
      return this.activityId;
   }

   @JsonProperty("putKey")
   public void setPutKey(String putKey) {
      this.putKey = putKey;
   }

   @JsonProperty("putKey")
   public String getPutKey() {
      return this.putKey;
   }

   @JsonProperty("quota")
   public void setQuota(Integer quota) {
      this.quota = quota;
   }

   @JsonProperty("quota")
   public Integer getQuota() {
      return this.quota;
   }

   @JsonProperty("validateDay")
   public void setValidateDay(Integer validateDay) {
      this.validateDay = validateDay;
   }

   @JsonProperty("validateDay")
   public Integer getValidateDay() {
      return this.validateDay;
   }

   @JsonProperty("drawCount")
   public void setDrawCount(Long drawCount) {
      this.drawCount = drawCount;
   }

   @JsonProperty("drawCount")
   public Long getDrawCount() {
      return this.drawCount;
   }

   @JsonProperty("promoId")
   public void setPromoId(Long promoId) {
      this.promoId = promoId;
   }

   @JsonProperty("promoId")
   public Long getPromoId() {
      return this.promoId;
   }

   @JsonProperty("riskValue")
   public void setRiskValue(Integer riskValue) {
      this.riskValue = riskValue;
   }

   @JsonProperty("riskValue")
   public Integer getRiskValue() {
      return this.riskValue;
   }

   @JsonProperty("collectTimes")
   public void setCollectTimes(Long collectTimes) {
      this.collectTimes = collectTimes;
   }

   @JsonProperty("collectTimes")
   public Long getCollectTimes() {
      return this.collectTimes;
   }

   @JsonProperty("endTime")
   public void setEndTime(Date endTime) {
      this.endTime = endTime;
   }

   @JsonProperty("endTime")
   public Date getEndTime() {
      return this.endTime;
   }

   @JsonProperty("status")
   public void setStatus(Integer status) {
      this.status = status;
   }

   @JsonProperty("status")
   public Integer getStatus() {
      return this.status;
   }
}
