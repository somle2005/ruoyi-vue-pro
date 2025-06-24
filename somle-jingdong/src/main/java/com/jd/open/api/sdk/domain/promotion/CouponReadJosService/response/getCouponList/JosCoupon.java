package com.jd.open.api.sdk.domain.promotion.CouponReadJosService.response.getCouponList;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Map;

public class JosCoupon implements Serializable {
   private Long couponId;
   private Long venderId;
   private Integer lockType;
   private String name;
   private Integer type;
   private Integer bindType;
   private Integer grantType;
   private Integer num;
   private BigDecimal discount;
   private BigDecimal quota;
   private Integer validityType;
   private Integer days;
   private Long beginTime;
   private Long endTime;
   private String password;
   private Long rfId;
   private Integer member;
   private Long takeBeginTime;
   private Long takeEndTime;
   private Integer takeRule;
   private Integer takeNum;
   private String link;
   private Long activityRfId;
   private String activityLink;
   private Integer usedNum;
   private Integer sendNum;
   private Boolean deleted;
   private Integer display;
   private Long created;
   private Integer platformType;
   private String platform;
   private String imgUrl;
   private Integer boundStatus;
   private Integer jdNum;
   private Long itemId;
   private Integer shareType;
   private Map<String, String> extMapInfo;

   @JsonProperty("couponId")
   public void setCouponId(Long couponId) {
      this.couponId = couponId;
   }

   @JsonProperty("couponId")
   public Long getCouponId() {
      return this.couponId;
   }

   @JsonProperty("venderId")
   public void setVenderId(Long venderId) {
      this.venderId = venderId;
   }

   @JsonProperty("venderId")
   public Long getVenderId() {
      return this.venderId;
   }

   @JsonProperty("lockType")
   public void setLockType(Integer lockType) {
      this.lockType = lockType;
   }

   @JsonProperty("lockType")
   public Integer getLockType() {
      return this.lockType;
   }

   @JsonProperty("name")
   public void setName(String name) {
      this.name = name;
   }

   @JsonProperty("name")
   public String getName() {
      return this.name;
   }

   @JsonProperty("type")
   public void setType(Integer type) {
      this.type = type;
   }

   @JsonProperty("type")
   public Integer getType() {
      return this.type;
   }

   @JsonProperty("bindType")
   public void setBindType(Integer bindType) {
      this.bindType = bindType;
   }

   @JsonProperty("bindType")
   public Integer getBindType() {
      return this.bindType;
   }

   @JsonProperty("grantType")
   public void setGrantType(Integer grantType) {
      this.grantType = grantType;
   }

   @JsonProperty("grantType")
   public Integer getGrantType() {
      return this.grantType;
   }

   @JsonProperty("num")
   public void setNum(Integer num) {
      this.num = num;
   }

   @JsonProperty("num")
   public Integer getNum() {
      return this.num;
   }

   @JsonProperty("discount")
   public void setDiscount(BigDecimal discount) {
      this.discount = discount;
   }

   @JsonProperty("discount")
   public BigDecimal getDiscount() {
      return this.discount;
   }

   @JsonProperty("quota")
   public void setQuota(BigDecimal quota) {
      this.quota = quota;
   }

   @JsonProperty("quota")
   public BigDecimal getQuota() {
      return this.quota;
   }

   @JsonProperty("validityType")
   public void setValidityType(Integer validityType) {
      this.validityType = validityType;
   }

   @JsonProperty("validityType")
   public Integer getValidityType() {
      return this.validityType;
   }

   @JsonProperty("days")
   public void setDays(Integer days) {
      this.days = days;
   }

   @JsonProperty("days")
   public Integer getDays() {
      return this.days;
   }

   @JsonProperty("beginTime")
   public void setBeginTime(Long beginTime) {
      this.beginTime = beginTime;
   }

   @JsonProperty("beginTime")
   public Long getBeginTime() {
      return this.beginTime;
   }

   @JsonProperty("endTime")
   public void setEndTime(Long endTime) {
      this.endTime = endTime;
   }

   @JsonProperty("endTime")
   public Long getEndTime() {
      return this.endTime;
   }

   @JsonProperty("password")
   public void setPassword(String password) {
      this.password = password;
   }

   @JsonProperty("password")
   public String getPassword() {
      return this.password;
   }

   @JsonProperty("rfId")
   public void setRfId(Long rfId) {
      this.rfId = rfId;
   }

   @JsonProperty("rfId")
   public Long getRfId() {
      return this.rfId;
   }

   @JsonProperty("member")
   public void setMember(Integer member) {
      this.member = member;
   }

   @JsonProperty("member")
   public Integer getMember() {
      return this.member;
   }

   @JsonProperty("takeBeginTime")
   public void setTakeBeginTime(Long takeBeginTime) {
      this.takeBeginTime = takeBeginTime;
   }

   @JsonProperty("takeBeginTime")
   public Long getTakeBeginTime() {
      return this.takeBeginTime;
   }

   @JsonProperty("takeEndTime")
   public void setTakeEndTime(Long takeEndTime) {
      this.takeEndTime = takeEndTime;
   }

   @JsonProperty("takeEndTime")
   public Long getTakeEndTime() {
      return this.takeEndTime;
   }

   @JsonProperty("takeRule")
   public void setTakeRule(Integer takeRule) {
      this.takeRule = takeRule;
   }

   @JsonProperty("takeRule")
   public Integer getTakeRule() {
      return this.takeRule;
   }

   @JsonProperty("takeNum")
   public void setTakeNum(Integer takeNum) {
      this.takeNum = takeNum;
   }

   @JsonProperty("takeNum")
   public Integer getTakeNum() {
      return this.takeNum;
   }

   @JsonProperty("link")
   public void setLink(String link) {
      this.link = link;
   }

   @JsonProperty("link")
   public String getLink() {
      return this.link;
   }

   @JsonProperty("activityRfId")
   public void setActivityRfId(Long activityRfId) {
      this.activityRfId = activityRfId;
   }

   @JsonProperty("activityRfId")
   public Long getActivityRfId() {
      return this.activityRfId;
   }

   @JsonProperty("activityLink")
   public void setActivityLink(String activityLink) {
      this.activityLink = activityLink;
   }

   @JsonProperty("activityLink")
   public String getActivityLink() {
      return this.activityLink;
   }

   @JsonProperty("usedNum")
   public void setUsedNum(Integer usedNum) {
      this.usedNum = usedNum;
   }

   @JsonProperty("usedNum")
   public Integer getUsedNum() {
      return this.usedNum;
   }

   @JsonProperty("sendNum")
   public void setSendNum(Integer sendNum) {
      this.sendNum = sendNum;
   }

   @JsonProperty("sendNum")
   public Integer getSendNum() {
      return this.sendNum;
   }

   @JsonProperty("deleted")
   public void setDeleted(Boolean deleted) {
      this.deleted = deleted;
   }

   @JsonProperty("deleted")
   public Boolean getDeleted() {
      return this.deleted;
   }

   @JsonProperty("display")
   public void setDisplay(Integer display) {
      this.display = display;
   }

   @JsonProperty("display")
   public Integer getDisplay() {
      return this.display;
   }

   @JsonProperty("created")
   public void setCreated(Long created) {
      this.created = created;
   }

   @JsonProperty("created")
   public Long getCreated() {
      return this.created;
   }

   @JsonProperty("platformType")
   public void setPlatformType(Integer platformType) {
      this.platformType = platformType;
   }

   @JsonProperty("platformType")
   public Integer getPlatformType() {
      return this.platformType;
   }

   @JsonProperty("platform")
   public void setPlatform(String platform) {
      this.platform = platform;
   }

   @JsonProperty("platform")
   public String getPlatform() {
      return this.platform;
   }

   @JsonProperty("imgUrl")
   public void setImgUrl(String imgUrl) {
      this.imgUrl = imgUrl;
   }

   @JsonProperty("imgUrl")
   public String getImgUrl() {
      return this.imgUrl;
   }

   @JsonProperty("boundStatus")
   public void setBoundStatus(Integer boundStatus) {
      this.boundStatus = boundStatus;
   }

   @JsonProperty("boundStatus")
   public Integer getBoundStatus() {
      return this.boundStatus;
   }

   @JsonProperty("jdNum")
   public void setJdNum(Integer jdNum) {
      this.jdNum = jdNum;
   }

   @JsonProperty("jdNum")
   public Integer getJdNum() {
      return this.jdNum;
   }

   @JsonProperty("itemId")
   public void setItemId(Long itemId) {
      this.itemId = itemId;
   }

   @JsonProperty("itemId")
   public Long getItemId() {
      return this.itemId;
   }

   @JsonProperty("shareType")
   public void setShareType(Integer shareType) {
      this.shareType = shareType;
   }

   @JsonProperty("shareType")
   public Integer getShareType() {
      return this.shareType;
   }

   @JsonProperty("extMapInfo")
   public void setExtMapInfo(Map<String, String> extMapInfo) {
      this.extMapInfo = extMapInfo;
   }

   @JsonProperty("extMapInfo")
   public Map<String, String> getExtMapInfo() {
      return this.extMapInfo;
   }
}
