package com.jd.open.api.sdk.request.promotion;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.promotion.SellerCouponWriteCreateResponse;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Map;
import java.util.TreeMap;

public class SellerCouponWriteCreateRequest extends AbstractRequest implements JdRequest<SellerCouponWriteCreateResponse> {
   private String ip;
   private String port;
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
   private String batchKey;
   private Integer member;
   private Long takeBeginTime;
   private Long takeEndTime;
   private Integer takeRule;
   private Integer takeNum;
   private Integer display;
   private Integer platformType;
   private String platform;
   private Integer shareType;
   private String activityLink;
   private Integer userClass;
   private String paidMembers;
   private String numPerSending;
   private String nonDirectCoupon;
   private String bandLevel;
   private String bandOrgId;
   private String udShowInfo;
   private String userLabel;
   private String skuId;

   public void setIp(String ip) {
      this.ip = ip;
   }

   public String getIp() {
      return this.ip;
   }

   public void setPort(String port) {
      this.port = port;
   }

   public String getPort() {
      return this.port;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getName() {
      return this.name;
   }

   public void setType(Integer type) {
      this.type = type;
   }

   public Integer getType() {
      return this.type;
   }

   public void setBindType(Integer bindType) {
      this.bindType = bindType;
   }

   public Integer getBindType() {
      return this.bindType;
   }

   public void setGrantType(Integer grantType) {
      this.grantType = grantType;
   }

   public Integer getGrantType() {
      return this.grantType;
   }

   public void setNum(Integer num) {
      this.num = num;
   }

   public Integer getNum() {
      return this.num;
   }

   public void setDiscount(BigDecimal discount) {
      this.discount = discount;
   }

   public BigDecimal getDiscount() {
      return this.discount;
   }

   public void setQuota(BigDecimal quota) {
      this.quota = quota;
   }

   public BigDecimal getQuota() {
      return this.quota;
   }

   public void setValidityType(Integer validityType) {
      this.validityType = validityType;
   }

   public Integer getValidityType() {
      return this.validityType;
   }

   public void setDays(Integer days) {
      this.days = days;
   }

   public Integer getDays() {
      return this.days;
   }

   public void setBeginTime(Long beginTime) {
      this.beginTime = beginTime;
   }

   public Long getBeginTime() {
      return this.beginTime;
   }

   public void setEndTime(Long endTime) {
      this.endTime = endTime;
   }

   public Long getEndTime() {
      return this.endTime;
   }

   public void setPassword(String password) {
      this.password = password;
   }

   public String getPassword() {
      return this.password;
   }

   public void setBatchKey(String batchKey) {
      this.batchKey = batchKey;
   }

   public String getBatchKey() {
      return this.batchKey;
   }

   public void setMember(Integer member) {
      this.member = member;
   }

   public Integer getMember() {
      return this.member;
   }

   public void setTakeBeginTime(Long takeBeginTime) {
      this.takeBeginTime = takeBeginTime;
   }

   public Long getTakeBeginTime() {
      return this.takeBeginTime;
   }

   public void setTakeEndTime(Long takeEndTime) {
      this.takeEndTime = takeEndTime;
   }

   public Long getTakeEndTime() {
      return this.takeEndTime;
   }

   public void setTakeRule(Integer takeRule) {
      this.takeRule = takeRule;
   }

   public Integer getTakeRule() {
      return this.takeRule;
   }

   public void setTakeNum(Integer takeNum) {
      this.takeNum = takeNum;
   }

   public Integer getTakeNum() {
      return this.takeNum;
   }

   public void setDisplay(Integer display) {
      this.display = display;
   }

   public Integer getDisplay() {
      return this.display;
   }

   public void setPlatformType(Integer platformType) {
      this.platformType = platformType;
   }

   public Integer getPlatformType() {
      return this.platformType;
   }

   public void setPlatform(String platform) {
      this.platform = platform;
   }

   public String getPlatform() {
      return this.platform;
   }

   public void setShareType(Integer shareType) {
      this.shareType = shareType;
   }

   public Integer getShareType() {
      return this.shareType;
   }

   public void setActivityLink(String activityLink) {
      this.activityLink = activityLink;
   }

   public String getActivityLink() {
      return this.activityLink;
   }

   public void setUserClass(Integer userClass) {
      this.userClass = userClass;
   }

   public Integer getUserClass() {
      return this.userClass;
   }

   public void setPaidMembers(String paidMembers) {
      this.paidMembers = paidMembers;
   }

   public String getPaidMembers() {
      return this.paidMembers;
   }

   public void setNumPerSending(String numPerSending) {
      this.numPerSending = numPerSending;
   }

   public String getNumPerSending() {
      return this.numPerSending;
   }

   public void setNonDirectCoupon(String nonDirectCoupon) {
      this.nonDirectCoupon = nonDirectCoupon;
   }

   public String getNonDirectCoupon() {
      return this.nonDirectCoupon;
   }

   public void setBandLevel(String bandLevel) {
      this.bandLevel = bandLevel;
   }

   public String getBandLevel() {
      return this.bandLevel;
   }

   public void setBandOrgId(String bandOrgId) {
      this.bandOrgId = bandOrgId;
   }

   public String getBandOrgId() {
      return this.bandOrgId;
   }

   public void setUdShowInfo(String udShowInfo) {
      this.udShowInfo = udShowInfo;
   }

   public String getUdShowInfo() {
      return this.udShowInfo;
   }

   public void setUserLabel(String userLabel) {
      this.userLabel = userLabel;
   }

   public String getUserLabel() {
      return this.userLabel;
   }

   public void setSkuId(String skuId) {
      this.skuId = skuId;
   }

   public String getSkuId() {
      return this.skuId;
   }

   public String getApiMethod() {
      return "jingdong.seller.coupon.write.create";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("ip", this.ip);
      pmap.put("port", this.port);
      pmap.put("name", this.name);
      pmap.put("type", this.type);
      pmap.put("bindType", this.bindType);
      pmap.put("grantType", this.grantType);
      pmap.put("num", this.num);
      pmap.put("discount", this.discount);
      pmap.put("quota", this.quota);
      pmap.put("validityType", this.validityType);
      pmap.put("days", this.days);
      pmap.put("beginTime", this.beginTime);
      pmap.put("endTime", this.endTime);
      pmap.put("password", this.password);
      pmap.put("batchKey", this.batchKey);
      pmap.put("member", this.member);
      pmap.put("takeBeginTime", this.takeBeginTime);
      pmap.put("takeEndTime", this.takeEndTime);
      pmap.put("takeRule", this.takeRule);
      pmap.put("takeNum", this.takeNum);
      pmap.put("display", this.display);
      pmap.put("platformType", this.platformType);
      pmap.put("platform", this.platform);
      pmap.put("shareType", this.shareType);
      pmap.put("activityLink", this.activityLink);
      pmap.put("userClass", this.userClass);
      pmap.put("paidMembers", this.paidMembers);
      pmap.put("numPerSending", this.numPerSending);
      pmap.put("nonDirectCoupon", this.nonDirectCoupon);
      pmap.put("bandLevel", this.bandLevel);
      pmap.put("bandOrgId", this.bandOrgId);
      pmap.put("udShowInfo", this.udShowInfo);
      pmap.put("userLabel", this.userLabel);
      pmap.put("skuId", this.skuId);
      return JsonUtil.toJson(pmap);
   }

   public Class<SellerCouponWriteCreateResponse> getResponseClass() {
      return SellerCouponWriteCreateResponse.class;
   }
}
