package com.jd.open.api.sdk.domain.hudong.CouponReadOuterService.response.queryCouponPage;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;

public class Coupon implements Serializable {
   private Integer wareGrade;
   private Integer num;
   private String link;
   private BigDecimal discount;
   private Integer type;
   private Long couponId;
   private Integer shareType;
   private String takeEndTime;
   private BigDecimal high;
   private Integer sendNum;
   private BigDecimal quota;
   private Integer officialType;
   private String beginTime;
   private Integer promoteChannel;
   private Integer remainNum;
   private Integer storeType;
   private String appName;
   private Integer display;
   private String busiCode;
   private Integer wareChoseType;
   private String mobileLink;
   private String takeBeginTime;
   private Integer validityType;
   private Integer takeRule;
   private Boolean hourCoupon;
   private String name;
   private String activityLink;
   private Integer days;
   private Integer style;
   private String endTime;
   private Integer newStatus;
   private MemberCreateModel memberParam;
   private Long skuCount;

   @JsonProperty("wareGrade")
   public void setWareGrade(Integer wareGrade) {
      this.wareGrade = wareGrade;
   }

   @JsonProperty("wareGrade")
   public Integer getWareGrade() {
      return this.wareGrade;
   }

   @JsonProperty("num")
   public void setNum(Integer num) {
      this.num = num;
   }

   @JsonProperty("num")
   public Integer getNum() {
      return this.num;
   }

   @JsonProperty("link")
   public void setLink(String link) {
      this.link = link;
   }

   @JsonProperty("link")
   public String getLink() {
      return this.link;
   }

   @JsonProperty("discount")
   public void setDiscount(BigDecimal discount) {
      this.discount = discount;
   }

   @JsonProperty("discount")
   public BigDecimal getDiscount() {
      return this.discount;
   }

   @JsonProperty("type")
   public void setType(Integer type) {
      this.type = type;
   }

   @JsonProperty("type")
   public Integer getType() {
      return this.type;
   }

   @JsonProperty("couponId")
   public void setCouponId(Long couponId) {
      this.couponId = couponId;
   }

   @JsonProperty("couponId")
   public Long getCouponId() {
      return this.couponId;
   }

   @JsonProperty("shareType")
   public void setShareType(Integer shareType) {
      this.shareType = shareType;
   }

   @JsonProperty("shareType")
   public Integer getShareType() {
      return this.shareType;
   }

   @JsonProperty("takeEndTime")
   public void setTakeEndTime(String takeEndTime) {
      this.takeEndTime = takeEndTime;
   }

   @JsonProperty("takeEndTime")
   public String getTakeEndTime() {
      return this.takeEndTime;
   }

   @JsonProperty("high")
   public void setHigh(BigDecimal high) {
      this.high = high;
   }

   @JsonProperty("high")
   public BigDecimal getHigh() {
      return this.high;
   }

   @JsonProperty("sendNum")
   public void setSendNum(Integer sendNum) {
      this.sendNum = sendNum;
   }

   @JsonProperty("sendNum")
   public Integer getSendNum() {
      return this.sendNum;
   }

   @JsonProperty("quota")
   public void setQuota(BigDecimal quota) {
      this.quota = quota;
   }

   @JsonProperty("quota")
   public BigDecimal getQuota() {
      return this.quota;
   }

   @JsonProperty("officialType")
   public void setOfficialType(Integer officialType) {
      this.officialType = officialType;
   }

   @JsonProperty("officialType")
   public Integer getOfficialType() {
      return this.officialType;
   }

   @JsonProperty("beginTime")
   public void setBeginTime(String beginTime) {
      this.beginTime = beginTime;
   }

   @JsonProperty("beginTime")
   public String getBeginTime() {
      return this.beginTime;
   }

   @JsonProperty("promoteChannel")
   public void setPromoteChannel(Integer promoteChannel) {
      this.promoteChannel = promoteChannel;
   }

   @JsonProperty("promoteChannel")
   public Integer getPromoteChannel() {
      return this.promoteChannel;
   }

   @JsonProperty("remainNum")
   public void setRemainNum(Integer remainNum) {
      this.remainNum = remainNum;
   }

   @JsonProperty("remainNum")
   public Integer getRemainNum() {
      return this.remainNum;
   }

   @JsonProperty("storeType")
   public void setStoreType(Integer storeType) {
      this.storeType = storeType;
   }

   @JsonProperty("storeType")
   public Integer getStoreType() {
      return this.storeType;
   }

   @JsonProperty("appName")
   public void setAppName(String appName) {
      this.appName = appName;
   }

   @JsonProperty("appName")
   public String getAppName() {
      return this.appName;
   }

   @JsonProperty("display")
   public void setDisplay(Integer display) {
      this.display = display;
   }

   @JsonProperty("display")
   public Integer getDisplay() {
      return this.display;
   }

   @JsonProperty("busiCode")
   public void setBusiCode(String busiCode) {
      this.busiCode = busiCode;
   }

   @JsonProperty("busiCode")
   public String getBusiCode() {
      return this.busiCode;
   }

   @JsonProperty("wareChoseType")
   public void setWareChoseType(Integer wareChoseType) {
      this.wareChoseType = wareChoseType;
   }

   @JsonProperty("wareChoseType")
   public Integer getWareChoseType() {
      return this.wareChoseType;
   }

   @JsonProperty("mobileLink")
   public void setMobileLink(String mobileLink) {
      this.mobileLink = mobileLink;
   }

   @JsonProperty("mobileLink")
   public String getMobileLink() {
      return this.mobileLink;
   }

   @JsonProperty("takeBeginTime")
   public void setTakeBeginTime(String takeBeginTime) {
      this.takeBeginTime = takeBeginTime;
   }

   @JsonProperty("takeBeginTime")
   public String getTakeBeginTime() {
      return this.takeBeginTime;
   }

   @JsonProperty("validityType")
   public void setValidityType(Integer validityType) {
      this.validityType = validityType;
   }

   @JsonProperty("validityType")
   public Integer getValidityType() {
      return this.validityType;
   }

   @JsonProperty("takeRule")
   public void setTakeRule(Integer takeRule) {
      this.takeRule = takeRule;
   }

   @JsonProperty("takeRule")
   public Integer getTakeRule() {
      return this.takeRule;
   }

   @JsonProperty("hourCoupon")
   public void setHourCoupon(Boolean hourCoupon) {
      this.hourCoupon = hourCoupon;
   }

   @JsonProperty("hourCoupon")
   public Boolean getHourCoupon() {
      return this.hourCoupon;
   }

   @JsonProperty("name")
   public void setName(String name) {
      this.name = name;
   }

   @JsonProperty("name")
   public String getName() {
      return this.name;
   }

   @JsonProperty("activityLink")
   public void setActivityLink(String activityLink) {
      this.activityLink = activityLink;
   }

   @JsonProperty("activityLink")
   public String getActivityLink() {
      return this.activityLink;
   }

   @JsonProperty("days")
   public void setDays(Integer days) {
      this.days = days;
   }

   @JsonProperty("days")
   public Integer getDays() {
      return this.days;
   }

   @JsonProperty("style")
   public void setStyle(Integer style) {
      this.style = style;
   }

   @JsonProperty("style")
   public Integer getStyle() {
      return this.style;
   }

   @JsonProperty("endTime")
   public void setEndTime(String endTime) {
      this.endTime = endTime;
   }

   @JsonProperty("endTime")
   public String getEndTime() {
      return this.endTime;
   }

   @JsonProperty("newStatus")
   public void setNewStatus(Integer newStatus) {
      this.newStatus = newStatus;
   }

   @JsonProperty("newStatus")
   public Integer getNewStatus() {
      return this.newStatus;
   }

   @JsonProperty("memberParam")
   public void setMemberParam(MemberCreateModel memberParam) {
      this.memberParam = memberParam;
   }

   @JsonProperty("memberParam")
   public MemberCreateModel getMemberParam() {
      return this.memberParam;
   }

   @JsonProperty("skuCount")
   public void setSkuCount(Long skuCount) {
      this.skuCount = skuCount;
   }

   @JsonProperty("skuCount")
   public Long getSkuCount() {
      return this.skuCount;
   }
}
