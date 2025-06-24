package com.jd.open.api.sdk.domain.hudong.JosFansActivityWriteService.request.createGiftActivityWithResult;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class GiftRuleActivity implements Serializable {
   private String batchKey;
   private List<GiftSkuActivity> skus;
   private Integer expireType;
   private String prizeEndTimeStr;
   private Long discount;
   private String prizeStartTimeStr;
   private Long couponId;
   private String skuIds;
   private Integer type;
   private Long prizeId;
   private String putKey;
   private Integer quota;
   private Date prizeEndTime;
   private Integer validateDay;
   private Long drawCount;
   private String rfId;
   private Long id;
   private Long promoId;
   private Date beginTime;
   private Date prizeStartTime;
   private Integer riskValue;
   private Long collectTimes;
   private Integer prizeType;
   private Integer floatRatio;
   private Long sendCount;
   private Integer prizeLevel;
   private String endTimeStr;
   private Integer days;
   private String beginTimeStr;
   private Integer sharePersonCount;
   private Date endTime;
   private Integer status;
   private String desc;
   private Integer awardType;

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

   @JsonProperty("prizeEndTimeStr")
   public void setPrizeEndTimeStr(String prizeEndTimeStr) {
      this.prizeEndTimeStr = prizeEndTimeStr;
   }

   @JsonProperty("prizeEndTimeStr")
   public String getPrizeEndTimeStr() {
      return this.prizeEndTimeStr;
   }

   @JsonProperty("discount")
   public void setDiscount(Long discount) {
      this.discount = discount;
   }

   @JsonProperty("discount")
   public Long getDiscount() {
      return this.discount;
   }

   @JsonProperty("prizeStartTimeStr")
   public void setPrizeStartTimeStr(String prizeStartTimeStr) {
      this.prizeStartTimeStr = prizeStartTimeStr;
   }

   @JsonProperty("prizeStartTimeStr")
   public String getPrizeStartTimeStr() {
      return this.prizeStartTimeStr;
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

   @JsonProperty("type")
   public void setType(Integer type) {
      this.type = type;
   }

   @JsonProperty("type")
   public Integer getType() {
      return this.type;
   }

   @JsonProperty("prizeId")
   public void setPrizeId(Long prizeId) {
      this.prizeId = prizeId;
   }

   @JsonProperty("prizeId")
   public Long getPrizeId() {
      return this.prizeId;
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

   @JsonProperty("prizeEndTime")
   public void setPrizeEndTime(Date prizeEndTime) {
      this.prizeEndTime = prizeEndTime;
   }

   @JsonProperty("prizeEndTime")
   public Date getPrizeEndTime() {
      return this.prizeEndTime;
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

   @JsonProperty("rfId")
   public void setRfId(String rfId) {
      this.rfId = rfId;
   }

   @JsonProperty("rfId")
   public String getRfId() {
      return this.rfId;
   }

   @JsonProperty("id")
   public void setId(Long id) {
      this.id = id;
   }

   @JsonProperty("id")
   public Long getId() {
      return this.id;
   }

   @JsonProperty("promoId")
   public void setPromoId(Long promoId) {
      this.promoId = promoId;
   }

   @JsonProperty("promoId")
   public Long getPromoId() {
      return this.promoId;
   }

   @JsonProperty("beginTime")
   public void setBeginTime(Date beginTime) {
      this.beginTime = beginTime;
   }

   @JsonProperty("beginTime")
   public Date getBeginTime() {
      return this.beginTime;
   }

   @JsonProperty("prizeStartTime")
   public void setPrizeStartTime(Date prizeStartTime) {
      this.prizeStartTime = prizeStartTime;
   }

   @JsonProperty("prizeStartTime")
   public Date getPrizeStartTime() {
      return this.prizeStartTime;
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

   @JsonProperty("prizeType")
   public void setPrizeType(Integer prizeType) {
      this.prizeType = prizeType;
   }

   @JsonProperty("prizeType")
   public Integer getPrizeType() {
      return this.prizeType;
   }

   @JsonProperty("floatRatio")
   public void setFloatRatio(Integer floatRatio) {
      this.floatRatio = floatRatio;
   }

   @JsonProperty("floatRatio")
   public Integer getFloatRatio() {
      return this.floatRatio;
   }

   @JsonProperty("sendCount")
   public void setSendCount(Long sendCount) {
      this.sendCount = sendCount;
   }

   @JsonProperty("sendCount")
   public Long getSendCount() {
      return this.sendCount;
   }

   @JsonProperty("prizeLevel")
   public void setPrizeLevel(Integer prizeLevel) {
      this.prizeLevel = prizeLevel;
   }

   @JsonProperty("prizeLevel")
   public Integer getPrizeLevel() {
      return this.prizeLevel;
   }

   @JsonProperty("endTimeStr")
   public void setEndTimeStr(String endTimeStr) {
      this.endTimeStr = endTimeStr;
   }

   @JsonProperty("endTimeStr")
   public String getEndTimeStr() {
      return this.endTimeStr;
   }

   @JsonProperty("days")
   public void setDays(Integer days) {
      this.days = days;
   }

   @JsonProperty("days")
   public Integer getDays() {
      return this.days;
   }

   @JsonProperty("beginTimeStr")
   public void setBeginTimeStr(String beginTimeStr) {
      this.beginTimeStr = beginTimeStr;
   }

   @JsonProperty("beginTimeStr")
   public String getBeginTimeStr() {
      return this.beginTimeStr;
   }

   @JsonProperty("sharePersonCount")
   public void setSharePersonCount(Integer sharePersonCount) {
      this.sharePersonCount = sharePersonCount;
   }

   @JsonProperty("sharePersonCount")
   public Integer getSharePersonCount() {
      return this.sharePersonCount;
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

   @JsonProperty("desc")
   public void setDesc(String desc) {
      this.desc = desc;
   }

   @JsonProperty("desc")
   public String getDesc() {
      return this.desc;
   }

   @JsonProperty("awardType")
   public void setAwardType(Integer awardType) {
      this.awardType = awardType;
   }

   @JsonProperty("awardType")
   public Integer getAwardType() {
      return this.awardType;
   }
}
