package com.jd.open.api.sdk.request.promotion;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.promotion.SellerPromotionV2UnitFullCreateResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class SellerPromotionV2UnitFullCreateRequest extends AbstractRequest implements JdRequest<SellerPromotionV2UnitFullCreateResponse> {
   private String ip;
   private String port;
   private String requestId;
   private String promoName;
   private String beginTime;
   private String endTime;
   private String slogan;
   private String comment;
   private String link;
   private Integer plusMember;
   private boolean allowOthersOperate;
   private boolean allowOthersCheck;
   private boolean allowOtherUserOperate;
   private boolean allowOtherUserCheck;
   private boolean needManualCheck;
   private Integer freqBound;
   private Integer perMaxNum;
   private Integer perMinNum;
   private Integer propType;
   private Integer propNum;
   private Integer propUsedWay;
   private Integer couponValidDays;
   private Integer tokenUseNum;
   private String userPins;
   private Integer promoAreaType;
   private String promoAreas;
   private String skuId;
   private String promoPrice;
   private String limitNum;

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

   public void setRequestId(String requestId) {
      this.requestId = requestId;
   }

   public String getRequestId() {
      return this.requestId;
   }

   public void setPromoName(String promoName) {
      this.promoName = promoName;
   }

   public String getPromoName() {
      return this.promoName;
   }

   public void setBeginTime(String beginTime) {
      this.beginTime = beginTime;
   }

   public String getBeginTime() {
      return this.beginTime;
   }

   public void setEndTime(String endTime) {
      this.endTime = endTime;
   }

   public String getEndTime() {
      return this.endTime;
   }

   public void setSlogan(String slogan) {
      this.slogan = slogan;
   }

   public String getSlogan() {
      return this.slogan;
   }

   public void setComment(String comment) {
      this.comment = comment;
   }

   public String getComment() {
      return this.comment;
   }

   public void setLink(String link) {
      this.link = link;
   }

   public String getLink() {
      return this.link;
   }

   public void setPlusMember(Integer plusMember) {
      this.plusMember = plusMember;
   }

   public Integer getPlusMember() {
      return this.plusMember;
   }

   public void setAllowOthersOperate(boolean allowOthersOperate) {
      this.allowOthersOperate = allowOthersOperate;
   }

   public boolean getAllowOthersOperate() {
      return this.allowOthersOperate;
   }

   public void setAllowOthersCheck(boolean allowOthersCheck) {
      this.allowOthersCheck = allowOthersCheck;
   }

   public boolean getAllowOthersCheck() {
      return this.allowOthersCheck;
   }

   public void setAllowOtherUserOperate(boolean allowOtherUserOperate) {
      this.allowOtherUserOperate = allowOtherUserOperate;
   }

   public boolean getAllowOtherUserOperate() {
      return this.allowOtherUserOperate;
   }

   public void setAllowOtherUserCheck(boolean allowOtherUserCheck) {
      this.allowOtherUserCheck = allowOtherUserCheck;
   }

   public boolean getAllowOtherUserCheck() {
      return this.allowOtherUserCheck;
   }

   public void setNeedManualCheck(boolean needManualCheck) {
      this.needManualCheck = needManualCheck;
   }

   public boolean getNeedManualCheck() {
      return this.needManualCheck;
   }

   public void setFreqBound(Integer freqBound) {
      this.freqBound = freqBound;
   }

   public Integer getFreqBound() {
      return this.freqBound;
   }

   public void setPerMaxNum(Integer perMaxNum) {
      this.perMaxNum = perMaxNum;
   }

   public Integer getPerMaxNum() {
      return this.perMaxNum;
   }

   public void setPerMinNum(Integer perMinNum) {
      this.perMinNum = perMinNum;
   }

   public Integer getPerMinNum() {
      return this.perMinNum;
   }

   public void setPropType(Integer propType) {
      this.propType = propType;
   }

   public Integer getPropType() {
      return this.propType;
   }

   public void setPropNum(Integer propNum) {
      this.propNum = propNum;
   }

   public Integer getPropNum() {
      return this.propNum;
   }

   public void setPropUsedWay(Integer propUsedWay) {
      this.propUsedWay = propUsedWay;
   }

   public Integer getPropUsedWay() {
      return this.propUsedWay;
   }

   public void setCouponValidDays(Integer couponValidDays) {
      this.couponValidDays = couponValidDays;
   }

   public Integer getCouponValidDays() {
      return this.couponValidDays;
   }

   public void setTokenUseNum(Integer tokenUseNum) {
      this.tokenUseNum = tokenUseNum;
   }

   public Integer getTokenUseNum() {
      return this.tokenUseNum;
   }

   public void setUserPins(String userPins) {
      this.userPins = userPins;
   }

   public String getUserPins() {
      return this.userPins;
   }

   public void setPromoAreaType(Integer promoAreaType) {
      this.promoAreaType = promoAreaType;
   }

   public Integer getPromoAreaType() {
      return this.promoAreaType;
   }

   public void setPromoAreas(String promoAreas) {
      this.promoAreas = promoAreas;
   }

   public String getPromoAreas() {
      return this.promoAreas;
   }

   public void setSkuId(String skuId) {
      this.skuId = skuId;
   }

   public String getSkuId() {
      return this.skuId;
   }

   public void setPromoPrice(String promoPrice) {
      this.promoPrice = promoPrice;
   }

   public String getPromoPrice() {
      return this.promoPrice;
   }

   public void setLimitNum(String limitNum) {
      this.limitNum = limitNum;
   }

   public String getLimitNum() {
      return this.limitNum;
   }

   public String getApiMethod() {
      return "jingdong.seller.promotion.v2.unit.full.create";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("ip", this.ip);
      pmap.put("port", this.port);
      pmap.put("request_id", this.requestId);
      pmap.put("promo_name", this.promoName);
      pmap.put("begin_time", this.beginTime);
      pmap.put("end_time", this.endTime);
      pmap.put("slogan", this.slogan);
      pmap.put("comment", this.comment);
      pmap.put("link", this.link);
      pmap.put("plusMember", this.plusMember);
      pmap.put("allow_others_operate", this.allowOthersOperate);
      pmap.put("allow_others_check", this.allowOthersCheck);
      pmap.put("allow_other_user_operate", this.allowOtherUserOperate);
      pmap.put("allow_other_user_check", this.allowOtherUserCheck);
      pmap.put("need_manual_check", this.needManualCheck);
      pmap.put("freq_bound", this.freqBound);
      pmap.put("per_max_num", this.perMaxNum);
      pmap.put("per_min_num", this.perMinNum);
      pmap.put("prop_type", this.propType);
      pmap.put("prop_num", this.propNum);
      pmap.put("prop_used_way", this.propUsedWay);
      pmap.put("coupon_valid_days", this.couponValidDays);
      pmap.put("token_use_num", this.tokenUseNum);
      pmap.put("user_pins", this.userPins);
      pmap.put("promo_area_type", this.promoAreaType);
      pmap.put("promo_areas", this.promoAreas);
      pmap.put("sku_id", this.skuId);
      pmap.put("promo_price", this.promoPrice);
      pmap.put("limit_num", this.limitNum);
      return JsonUtil.toJson(pmap);
   }

   public Class<SellerPromotionV2UnitFullCreateResponse> getResponseClass() {
      return SellerPromotionV2UnitFullCreateResponse.class;
   }
}
