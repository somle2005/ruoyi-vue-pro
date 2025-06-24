package com.jd.open.api.sdk.request.hudong;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.hudong.MarketToolCouponApiServiceCouponWriteOuterServiceCreateCouponResponse;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Map;
import java.util.TreeMap;

public class MarketToolCouponApiServiceCouponWriteOuterServiceCreateCouponRequest extends AbstractRequest implements JdRequest<MarketToolCouponApiServiceCouponWriteOuterServiceCreateCouponResponse> {
   private Integer wareGrade;
   private Integer num;
   private BigDecimal discount;
   private String strategyParam;
   private Integer type;
   private String skuIdList;
   private Long couponId;
   private Integer shareType;
   private String storeId;
   private String takeEndTime;
   private BigDecimal high;
   private Integer takeNum;
   private BigDecimal quota;
   private Integer officialType;
   private String beginTime;
   private Integer promoteChannel;
   private Integer remainNum;
   private Integer storeType;
   private Integer display;
   private String busiCode;
   private Integer wareChoseType;
   private Integer userClass;
   private Integer userLevel;
   private String takeBeginTime;
   private Integer validityType;
   private Integer takeRule;
   private boolean hourCoupon;
   private String name;
   private String activityLink;
   private Integer days;
   private Integer style;
   private String endTime;
   private String adWord;
   private String spuIdList;
   private String channels;
   private Integer channelSelectType;
   private Integer selectType;
   private String platforms;
   private String appName;
   private String ip;
   private String appId;

   public void setWareGrade(Integer wareGrade) {
      this.wareGrade = wareGrade;
   }

   public Integer getWareGrade() {
      return this.wareGrade;
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

   public void setStrategyParam(String strategyParam) {
      this.strategyParam = strategyParam;
   }

   public String getStrategyParam() {
      return this.strategyParam;
   }

   public void setType(Integer type) {
      this.type = type;
   }

   public Integer getType() {
      return this.type;
   }

   public void setSkuIdList(String skuIdList) {
      this.skuIdList = skuIdList;
   }

   public String getSkuIdList() {
      return this.skuIdList;
   }

   public void setCouponId(Long couponId) {
      this.couponId = couponId;
   }

   public Long getCouponId() {
      return this.couponId;
   }

   public void setShareType(Integer shareType) {
      this.shareType = shareType;
   }

   public Integer getShareType() {
      return this.shareType;
   }

   public void setStoreId(String storeId) {
      this.storeId = storeId;
   }

   public String getStoreId() {
      return this.storeId;
   }

   public void setTakeEndTime(String takeEndTime) {
      this.takeEndTime = takeEndTime;
   }

   public String getTakeEndTime() {
      return this.takeEndTime;
   }

   public void setHigh(BigDecimal high) {
      this.high = high;
   }

   public BigDecimal getHigh() {
      return this.high;
   }

   public void setTakeNum(Integer takeNum) {
      this.takeNum = takeNum;
   }

   public Integer getTakeNum() {
      return this.takeNum;
   }

   public void setQuota(BigDecimal quota) {
      this.quota = quota;
   }

   public BigDecimal getQuota() {
      return this.quota;
   }

   public void setOfficialType(Integer officialType) {
      this.officialType = officialType;
   }

   public Integer getOfficialType() {
      return this.officialType;
   }

   public void setBeginTime(String beginTime) {
      this.beginTime = beginTime;
   }

   public String getBeginTime() {
      return this.beginTime;
   }

   public void setPromoteChannel(Integer promoteChannel) {
      this.promoteChannel = promoteChannel;
   }

   public Integer getPromoteChannel() {
      return this.promoteChannel;
   }

   public void setRemainNum(Integer remainNum) {
      this.remainNum = remainNum;
   }

   public Integer getRemainNum() {
      return this.remainNum;
   }

   public void setStoreType(Integer storeType) {
      this.storeType = storeType;
   }

   public Integer getStoreType() {
      return this.storeType;
   }

   public void setDisplay(Integer display) {
      this.display = display;
   }

   public Integer getDisplay() {
      return this.display;
   }

   public void setBusiCode(String busiCode) {
      this.busiCode = busiCode;
   }

   public String getBusiCode() {
      return this.busiCode;
   }

   public void setWareChoseType(Integer wareChoseType) {
      this.wareChoseType = wareChoseType;
   }

   public Integer getWareChoseType() {
      return this.wareChoseType;
   }

   public void setUserClass(Integer userClass) {
      this.userClass = userClass;
   }

   public Integer getUserClass() {
      return this.userClass;
   }

   public void setUserLevel(Integer userLevel) {
      this.userLevel = userLevel;
   }

   public Integer getUserLevel() {
      return this.userLevel;
   }

   public void setTakeBeginTime(String takeBeginTime) {
      this.takeBeginTime = takeBeginTime;
   }

   public String getTakeBeginTime() {
      return this.takeBeginTime;
   }

   public void setValidityType(Integer validityType) {
      this.validityType = validityType;
   }

   public Integer getValidityType() {
      return this.validityType;
   }

   public void setTakeRule(Integer takeRule) {
      this.takeRule = takeRule;
   }

   public Integer getTakeRule() {
      return this.takeRule;
   }

   public void setHourCoupon(boolean hourCoupon) {
      this.hourCoupon = hourCoupon;
   }

   public boolean getHourCoupon() {
      return this.hourCoupon;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getName() {
      return this.name;
   }

   public void setActivityLink(String activityLink) {
      this.activityLink = activityLink;
   }

   public String getActivityLink() {
      return this.activityLink;
   }

   public void setDays(Integer days) {
      this.days = days;
   }

   public Integer getDays() {
      return this.days;
   }

   public void setStyle(Integer style) {
      this.style = style;
   }

   public Integer getStyle() {
      return this.style;
   }

   public void setEndTime(String endTime) {
      this.endTime = endTime;
   }

   public String getEndTime() {
      return this.endTime;
   }

   public void setAdWord(String adWord) {
      this.adWord = adWord;
   }

   public String getAdWord() {
      return this.adWord;
   }

   public void setSpuIdList(String spuIdList) {
      this.spuIdList = spuIdList;
   }

   public String getSpuIdList() {
      return this.spuIdList;
   }

   public void setChannels(String channels) {
      this.channels = channels;
   }

   public String getChannels() {
      return this.channels;
   }

   public void setChannelSelectType(Integer channelSelectType) {
      this.channelSelectType = channelSelectType;
   }

   public Integer getChannelSelectType() {
      return this.channelSelectType;
   }

   public void setSelectType(Integer selectType) {
      this.selectType = selectType;
   }

   public Integer getSelectType() {
      return this.selectType;
   }

   public void setPlatforms(String platforms) {
      this.platforms = platforms;
   }

   public String getPlatforms() {
      return this.platforms;
   }

   public void setAppName(String appName) {
      this.appName = appName;
   }

   public String getAppName() {
      return this.appName;
   }

   public void setIp(String ip) {
      this.ip = ip;
   }

   public String getIp() {
      return this.ip;
   }

   public void setAppId(String appId) {
      this.appId = appId;
   }

   public String getAppId() {
      return this.appId;
   }

   public String getApiMethod() {
      return "jingdong.market.tool.coupon.api.service.CouponWriteOuterService.createCoupon";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("wareGrade", this.wareGrade);
      pmap.put("num", this.num);
      pmap.put("discount", this.discount);
      pmap.put("strategyParam", this.strategyParam);
      pmap.put("type", this.type);
      pmap.put("skuIdList", this.skuIdList);
      pmap.put("couponId", this.couponId);
      pmap.put("shareType", this.shareType);
      pmap.put("storeId", this.storeId);
      pmap.put("takeEndTime", this.takeEndTime);
      pmap.put("high", this.high);
      pmap.put("takeNum", this.takeNum);
      pmap.put("quota", this.quota);
      pmap.put("officialType", this.officialType);
      pmap.put("beginTime", this.beginTime);
      pmap.put("promoteChannel", this.promoteChannel);
      pmap.put("remainNum", this.remainNum);
      pmap.put("storeType", this.storeType);
      pmap.put("display", this.display);
      pmap.put("busiCode", this.busiCode);
      pmap.put("wareChoseType", this.wareChoseType);
      pmap.put("userClass", this.userClass);
      pmap.put("userLevel", this.userLevel);
      pmap.put("takeBeginTime", this.takeBeginTime);
      pmap.put("validityType", this.validityType);
      pmap.put("takeRule", this.takeRule);
      pmap.put("hourCoupon", this.hourCoupon);
      pmap.put("name", this.name);
      pmap.put("activityLink", this.activityLink);
      pmap.put("days", this.days);
      pmap.put("style", this.style);
      pmap.put("endTime", this.endTime);
      pmap.put("adWord", this.adWord);
      pmap.put("spuIdList", this.spuIdList);
      pmap.put("channels", this.channels);
      pmap.put("channelSelectType", this.channelSelectType);
      pmap.put("selectType", this.selectType);
      pmap.put("platforms", this.platforms);
      pmap.put("appName", this.appName);
      pmap.put("ip", this.ip);
      pmap.put("appId", this.appId);
      return JsonUtil.toJson(pmap);
   }

   public Class<MarketToolCouponApiServiceCouponWriteOuterServiceCreateCouponResponse> getResponseClass() {
      return MarketToolCouponApiServiceCouponWriteOuterServiceCreateCouponResponse.class;
   }
}
