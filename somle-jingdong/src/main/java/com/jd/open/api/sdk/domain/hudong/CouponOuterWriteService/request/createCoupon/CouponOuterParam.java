package com.jd.open.api.sdk.domain.hudong.CouponOuterWriteService.request.createCoupon;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

public class CouponOuterParam implements Serializable {
   private Integer wareChoseType;
   private Integer validityType;
   private Integer takeRule;
   private String endTime;
   private Integer type;
   private List<CouponStairParam> stairs;
   private Integer style;
   private String name;
   private BigDecimal mainDiscount;
   private String takeEndTime;
   private String beginTime;
   private Integer display;
   private String activityLink;
   private Integer officialType;
   private Integer takeNum;
   private Integer num;
   private String takeBeginTime;
   private Integer days;
   private List<CouponSku> skus;
   private BigDecimal high;
   private List<CouponSpu> spus;
   private Integer shareType;
   private BigDecimal mainQuota;
   private Integer promoteChannel;
   private String busiCode;
   private PlatformOuterParam busiPlatformParam;
   private MemberOuterParam memberParam;

   @JsonProperty("wareChoseType")
   public void setWareChoseType(Integer wareChoseType) {
      this.wareChoseType = wareChoseType;
   }

   @JsonProperty("wareChoseType")
   public Integer getWareChoseType() {
      return this.wareChoseType;
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

   @JsonProperty("endTime")
   public void setEndTime(String endTime) {
      this.endTime = endTime;
   }

   @JsonProperty("endTime")
   public String getEndTime() {
      return this.endTime;
   }

   @JsonProperty("type")
   public void setType(Integer type) {
      this.type = type;
   }

   @JsonProperty("type")
   public Integer getType() {
      return this.type;
   }

   @JsonProperty("stairs")
   public void setStairs(List<CouponStairParam> stairs) {
      this.stairs = stairs;
   }

   @JsonProperty("stairs")
   public List<CouponStairParam> getStairs() {
      return this.stairs;
   }

   @JsonProperty("style")
   public void setStyle(Integer style) {
      this.style = style;
   }

   @JsonProperty("style")
   public Integer getStyle() {
      return this.style;
   }

   @JsonProperty("name")
   public void setName(String name) {
      this.name = name;
   }

   @JsonProperty("name")
   public String getName() {
      return this.name;
   }

   @JsonProperty("mainDiscount")
   public void setMainDiscount(BigDecimal mainDiscount) {
      this.mainDiscount = mainDiscount;
   }

   @JsonProperty("mainDiscount")
   public BigDecimal getMainDiscount() {
      return this.mainDiscount;
   }

   @JsonProperty("takeEndTime")
   public void setTakeEndTime(String takeEndTime) {
      this.takeEndTime = takeEndTime;
   }

   @JsonProperty("takeEndTime")
   public String getTakeEndTime() {
      return this.takeEndTime;
   }

   @JsonProperty("beginTime")
   public void setBeginTime(String beginTime) {
      this.beginTime = beginTime;
   }

   @JsonProperty("beginTime")
   public String getBeginTime() {
      return this.beginTime;
   }

   @JsonProperty("display")
   public void setDisplay(Integer display) {
      this.display = display;
   }

   @JsonProperty("display")
   public Integer getDisplay() {
      return this.display;
   }

   @JsonProperty("activityLink")
   public void setActivityLink(String activityLink) {
      this.activityLink = activityLink;
   }

   @JsonProperty("activityLink")
   public String getActivityLink() {
      return this.activityLink;
   }

   @JsonProperty("officialType")
   public void setOfficialType(Integer officialType) {
      this.officialType = officialType;
   }

   @JsonProperty("officialType")
   public Integer getOfficialType() {
      return this.officialType;
   }

   @JsonProperty("takeNum")
   public void setTakeNum(Integer takeNum) {
      this.takeNum = takeNum;
   }

   @JsonProperty("takeNum")
   public Integer getTakeNum() {
      return this.takeNum;
   }

   @JsonProperty("num")
   public void setNum(Integer num) {
      this.num = num;
   }

   @JsonProperty("num")
   public Integer getNum() {
      return this.num;
   }

   @JsonProperty("takeBeginTime")
   public void setTakeBeginTime(String takeBeginTime) {
      this.takeBeginTime = takeBeginTime;
   }

   @JsonProperty("takeBeginTime")
   public String getTakeBeginTime() {
      return this.takeBeginTime;
   }

   @JsonProperty("days")
   public void setDays(Integer days) {
      this.days = days;
   }

   @JsonProperty("days")
   public Integer getDays() {
      return this.days;
   }

   @JsonProperty("skus")
   public void setSkus(List<CouponSku> skus) {
      this.skus = skus;
   }

   @JsonProperty("skus")
   public List<CouponSku> getSkus() {
      return this.skus;
   }

   @JsonProperty("high")
   public void setHigh(BigDecimal high) {
      this.high = high;
   }

   @JsonProperty("high")
   public BigDecimal getHigh() {
      return this.high;
   }

   @JsonProperty("spus")
   public void setSpus(List<CouponSpu> spus) {
      this.spus = spus;
   }

   @JsonProperty("spus")
   public List<CouponSpu> getSpus() {
      return this.spus;
   }

   @JsonProperty("shareType")
   public void setShareType(Integer shareType) {
      this.shareType = shareType;
   }

   @JsonProperty("shareType")
   public Integer getShareType() {
      return this.shareType;
   }

   @JsonProperty("mainQuota")
   public void setMainQuota(BigDecimal mainQuota) {
      this.mainQuota = mainQuota;
   }

   @JsonProperty("mainQuota")
   public BigDecimal getMainQuota() {
      return this.mainQuota;
   }

   @JsonProperty("promoteChannel")
   public void setPromoteChannel(Integer promoteChannel) {
      this.promoteChannel = promoteChannel;
   }

   @JsonProperty("promoteChannel")
   public Integer getPromoteChannel() {
      return this.promoteChannel;
   }

   @JsonProperty("busiCode")
   public void setBusiCode(String busiCode) {
      this.busiCode = busiCode;
   }

   @JsonProperty("busiCode")
   public String getBusiCode() {
      return this.busiCode;
   }

   @JsonProperty("busiPlatformParam")
   public void setBusiPlatformParam(PlatformOuterParam busiPlatformParam) {
      this.busiPlatformParam = busiPlatformParam;
   }

   @JsonProperty("busiPlatformParam")
   public PlatformOuterParam getBusiPlatformParam() {
      return this.busiPlatformParam;
   }

   @JsonProperty("memberParam")
   public void setMemberParam(MemberOuterParam memberParam) {
      this.memberParam = memberParam;
   }

   @JsonProperty("memberParam")
   public MemberOuterParam getMemberParam() {
      return this.memberParam;
   }
}
