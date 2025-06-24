package com.jd.open.api.sdk.domain.promotion.JosPromotionReadService.response.get;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;

public class JosPromotion implements Serializable {
   private Long venderId;
   private Long promoId;
   private String promoName;
   private Integer promoType;
   private Integer favorMode;
   private String beginTime;
   private String endTime;
   private Integer bound;
   private Integer member;
   private String slogan;
   private String comment;
   private Integer promoStatus;
   private Date created;
   private Date modified;
   private Integer platform;
   private String link;
   private Integer shopMember;
   private Integer qqMember;
   private Integer plusMember;
   private boolean memberLevelOnly;
   private boolean allowOthersOperate;
   private boolean allowOthersCheck;
   private boolean allowOtherUserOperate;
   private boolean allowOtherUserCheck;
   private boolean needManualCheck;
   private boolean allowCheck;
   private boolean allowOperate;
   private boolean isJingdouRequired;
   private Integer freqBound;
   private Integer perMaxNum;
   private Integer perMinNum;
   private Integer propType;
   private Integer propNum;
   private Integer propUsedWay;
   private Integer couponId;
   private String couponBatchKey;
   private Integer couponValidDays;
   private String quota;
   private String rate;
   private String plus;
   private String orderModeDesc;
   private Integer tokenUseNum;
   private String userPins;
   private Integer promoAreaType;
   private String promoAreas;
   private Integer freePostage;
   private Integer topMn;
   private String promoChannels;
   private Integer targetPp;
   private Integer newPersonPrice;
   private Integer studentPrice;
   private Integer gaf;
   private Integer shopFans;
   private Integer platformSet;

   @JsonProperty("vender_id")
   public void setVenderId(Long venderId) {
      this.venderId = venderId;
   }

   @JsonProperty("vender_id")
   public Long getVenderId() {
      return this.venderId;
   }

   @JsonProperty("promo_id")
   public void setPromoId(Long promoId) {
      this.promoId = promoId;
   }

   @JsonProperty("promo_id")
   public Long getPromoId() {
      return this.promoId;
   }

   @JsonProperty("promo_name")
   public void setPromoName(String promoName) {
      this.promoName = promoName;
   }

   @JsonProperty("promo_name")
   public String getPromoName() {
      return this.promoName;
   }

   @JsonProperty("promo_type")
   public void setPromoType(Integer promoType) {
      this.promoType = promoType;
   }

   @JsonProperty("promo_type")
   public Integer getPromoType() {
      return this.promoType;
   }

   @JsonProperty("favor_mode")
   public void setFavorMode(Integer favorMode) {
      this.favorMode = favorMode;
   }

   @JsonProperty("favor_mode")
   public Integer getFavorMode() {
      return this.favorMode;
   }

   @JsonProperty("begin_time")
   public void setBeginTime(String beginTime) {
      this.beginTime = beginTime;
   }

   @JsonProperty("begin_time")
   public String getBeginTime() {
      return this.beginTime;
   }

   @JsonProperty("end_time")
   public void setEndTime(String endTime) {
      this.endTime = endTime;
   }

   @JsonProperty("end_time")
   public String getEndTime() {
      return this.endTime;
   }

   @JsonProperty("bound")
   public void setBound(Integer bound) {
      this.bound = bound;
   }

   @JsonProperty("bound")
   public Integer getBound() {
      return this.bound;
   }

   @JsonProperty("member")
   public void setMember(Integer member) {
      this.member = member;
   }

   @JsonProperty("member")
   public Integer getMember() {
      return this.member;
   }

   @JsonProperty("slogan")
   public void setSlogan(String slogan) {
      this.slogan = slogan;
   }

   @JsonProperty("slogan")
   public String getSlogan() {
      return this.slogan;
   }

   @JsonProperty("comment")
   public void setComment(String comment) {
      this.comment = comment;
   }

   @JsonProperty("comment")
   public String getComment() {
      return this.comment;
   }

   @JsonProperty("promo_status")
   public void setPromoStatus(Integer promoStatus) {
      this.promoStatus = promoStatus;
   }

   @JsonProperty("promo_status")
   public Integer getPromoStatus() {
      return this.promoStatus;
   }

   @JsonProperty("created")
   public void setCreated(Date created) {
      this.created = created;
   }

   @JsonProperty("created")
   public Date getCreated() {
      return this.created;
   }

   @JsonProperty("modified")
   public void setModified(Date modified) {
      this.modified = modified;
   }

   @JsonProperty("modified")
   public Date getModified() {
      return this.modified;
   }

   @JsonProperty("platform")
   public void setPlatform(Integer platform) {
      this.platform = platform;
   }

   @JsonProperty("platform")
   public Integer getPlatform() {
      return this.platform;
   }

   @JsonProperty("link")
   public void setLink(String link) {
      this.link = link;
   }

   @JsonProperty("link")
   public String getLink() {
      return this.link;
   }

   @JsonProperty("shop_member")
   public void setShopMember(Integer shopMember) {
      this.shopMember = shopMember;
   }

   @JsonProperty("shop_member")
   public Integer getShopMember() {
      return this.shopMember;
   }

   @JsonProperty("qq_member")
   public void setQqMember(Integer qqMember) {
      this.qqMember = qqMember;
   }

   @JsonProperty("qq_member")
   public Integer getQqMember() {
      return this.qqMember;
   }

   @JsonProperty("plus_member")
   public void setPlusMember(Integer plusMember) {
      this.plusMember = plusMember;
   }

   @JsonProperty("plus_member")
   public Integer getPlusMember() {
      return this.plusMember;
   }

   @JsonProperty("member_level_only")
   public void setMemberLevelOnly(boolean memberLevelOnly) {
      this.memberLevelOnly = memberLevelOnly;
   }

   @JsonProperty("member_level_only")
   public boolean getMemberLevelOnly() {
      return this.memberLevelOnly;
   }

   @JsonProperty("allow_others_operate")
   public void setAllowOthersOperate(boolean allowOthersOperate) {
      this.allowOthersOperate = allowOthersOperate;
   }

   @JsonProperty("allow_others_operate")
   public boolean getAllowOthersOperate() {
      return this.allowOthersOperate;
   }

   @JsonProperty("allow_others_check")
   public void setAllowOthersCheck(boolean allowOthersCheck) {
      this.allowOthersCheck = allowOthersCheck;
   }

   @JsonProperty("allow_others_check")
   public boolean getAllowOthersCheck() {
      return this.allowOthersCheck;
   }

   @JsonProperty("allow_other_user_operate")
   public void setAllowOtherUserOperate(boolean allowOtherUserOperate) {
      this.allowOtherUserOperate = allowOtherUserOperate;
   }

   @JsonProperty("allow_other_user_operate")
   public boolean getAllowOtherUserOperate() {
      return this.allowOtherUserOperate;
   }

   @JsonProperty("allow_other_user_check")
   public void setAllowOtherUserCheck(boolean allowOtherUserCheck) {
      this.allowOtherUserCheck = allowOtherUserCheck;
   }

   @JsonProperty("allow_other_user_check")
   public boolean getAllowOtherUserCheck() {
      return this.allowOtherUserCheck;
   }

   @JsonProperty("need_manual_check")
   public void setNeedManualCheck(boolean needManualCheck) {
      this.needManualCheck = needManualCheck;
   }

   @JsonProperty("need_manual_check")
   public boolean getNeedManualCheck() {
      return this.needManualCheck;
   }

   @JsonProperty("allow_check")
   public void setAllowCheck(boolean allowCheck) {
      this.allowCheck = allowCheck;
   }

   @JsonProperty("allow_check")
   public boolean getAllowCheck() {
      return this.allowCheck;
   }

   @JsonProperty("allow_operate")
   public void setAllowOperate(boolean allowOperate) {
      this.allowOperate = allowOperate;
   }

   @JsonProperty("allow_operate")
   public boolean getAllowOperate() {
      return this.allowOperate;
   }

   @JsonProperty("is_jingdou_required")
   public void setIsJingdouRequired(boolean isJingdouRequired) {
      this.isJingdouRequired = isJingdouRequired;
   }

   @JsonProperty("is_jingdou_required")
   public boolean getIsJingdouRequired() {
      return this.isJingdouRequired;
   }

   @JsonProperty("freq_bound")
   public void setFreqBound(Integer freqBound) {
      this.freqBound = freqBound;
   }

   @JsonProperty("freq_bound")
   public Integer getFreqBound() {
      return this.freqBound;
   }

   @JsonProperty("per_max_num")
   public void setPerMaxNum(Integer perMaxNum) {
      this.perMaxNum = perMaxNum;
   }

   @JsonProperty("per_max_num")
   public Integer getPerMaxNum() {
      return this.perMaxNum;
   }

   @JsonProperty("per_min_num")
   public void setPerMinNum(Integer perMinNum) {
      this.perMinNum = perMinNum;
   }

   @JsonProperty("per_min_num")
   public Integer getPerMinNum() {
      return this.perMinNum;
   }

   @JsonProperty("prop_type")
   public void setPropType(Integer propType) {
      this.propType = propType;
   }

   @JsonProperty("prop_type")
   public Integer getPropType() {
      return this.propType;
   }

   @JsonProperty("prop_num")
   public void setPropNum(Integer propNum) {
      this.propNum = propNum;
   }

   @JsonProperty("prop_num")
   public Integer getPropNum() {
      return this.propNum;
   }

   @JsonProperty("prop_used_way")
   public void setPropUsedWay(Integer propUsedWay) {
      this.propUsedWay = propUsedWay;
   }

   @JsonProperty("prop_used_way")
   public Integer getPropUsedWay() {
      return this.propUsedWay;
   }

   @JsonProperty("coupon_id")
   public void setCouponId(Integer couponId) {
      this.couponId = couponId;
   }

   @JsonProperty("coupon_id")
   public Integer getCouponId() {
      return this.couponId;
   }

   @JsonProperty("coupon_batch_key")
   public void setCouponBatchKey(String couponBatchKey) {
      this.couponBatchKey = couponBatchKey;
   }

   @JsonProperty("coupon_batch_key")
   public String getCouponBatchKey() {
      return this.couponBatchKey;
   }

   @JsonProperty("coupon_valid_days")
   public void setCouponValidDays(Integer couponValidDays) {
      this.couponValidDays = couponValidDays;
   }

   @JsonProperty("coupon_valid_days")
   public Integer getCouponValidDays() {
      return this.couponValidDays;
   }

   @JsonProperty("quota")
   public void setQuota(String quota) {
      this.quota = quota;
   }

   @JsonProperty("quota")
   public String getQuota() {
      return this.quota;
   }

   @JsonProperty("rate")
   public void setRate(String rate) {
      this.rate = rate;
   }

   @JsonProperty("rate")
   public String getRate() {
      return this.rate;
   }

   @JsonProperty("plus")
   public void setPlus(String plus) {
      this.plus = plus;
   }

   @JsonProperty("plus")
   public String getPlus() {
      return this.plus;
   }

   @JsonProperty("order_mode_desc")
   public void setOrderModeDesc(String orderModeDesc) {
      this.orderModeDesc = orderModeDesc;
   }

   @JsonProperty("order_mode_desc")
   public String getOrderModeDesc() {
      return this.orderModeDesc;
   }

   @JsonProperty("token_use_num")
   public void setTokenUseNum(Integer tokenUseNum) {
      this.tokenUseNum = tokenUseNum;
   }

   @JsonProperty("token_use_num")
   public Integer getTokenUseNum() {
      return this.tokenUseNum;
   }

   @JsonProperty("user_pins")
   public void setUserPins(String userPins) {
      this.userPins = userPins;
   }

   @JsonProperty("user_pins")
   public String getUserPins() {
      return this.userPins;
   }

   @JsonProperty("promo_area_type")
   public void setPromoAreaType(Integer promoAreaType) {
      this.promoAreaType = promoAreaType;
   }

   @JsonProperty("promo_area_type")
   public Integer getPromoAreaType() {
      return this.promoAreaType;
   }

   @JsonProperty("promo_areas")
   public void setPromoAreas(String promoAreas) {
      this.promoAreas = promoAreas;
   }

   @JsonProperty("promo_areas")
   public String getPromoAreas() {
      return this.promoAreas;
   }

   @JsonProperty("free_postage")
   public void setFreePostage(Integer freePostage) {
      this.freePostage = freePostage;
   }

   @JsonProperty("free_postage")
   public Integer getFreePostage() {
      return this.freePostage;
   }

   @JsonProperty("top_mn")
   public void setTopMn(Integer topMn) {
      this.topMn = topMn;
   }

   @JsonProperty("top_mn")
   public Integer getTopMn() {
      return this.topMn;
   }

   @JsonProperty("promo_channels")
   public void setPromoChannels(String promoChannels) {
      this.promoChannels = promoChannels;
   }

   @JsonProperty("promo_channels")
   public String getPromoChannels() {
      return this.promoChannels;
   }

   @JsonProperty("target_pp")
   public void setTargetPp(Integer targetPp) {
      this.targetPp = targetPp;
   }

   @JsonProperty("target_pp")
   public Integer getTargetPp() {
      return this.targetPp;
   }

   @JsonProperty("new_person_price")
   public void setNewPersonPrice(Integer newPersonPrice) {
      this.newPersonPrice = newPersonPrice;
   }

   @JsonProperty("new_person_price")
   public Integer getNewPersonPrice() {
      return this.newPersonPrice;
   }

   @JsonProperty("student_price")
   public void setStudentPrice(Integer studentPrice) {
      this.studentPrice = studentPrice;
   }

   @JsonProperty("student_price")
   public Integer getStudentPrice() {
      return this.studentPrice;
   }

   @JsonProperty("gaf")
   public void setGaf(Integer gaf) {
      this.gaf = gaf;
   }

   @JsonProperty("gaf")
   public Integer getGaf() {
      return this.gaf;
   }

   @JsonProperty("shop_fans")
   public void setShopFans(Integer shopFans) {
      this.shopFans = shopFans;
   }

   @JsonProperty("shop_fans")
   public Integer getShopFans() {
      return this.shopFans;
   }

   @JsonProperty("platform_set")
   public void setPlatformSet(Integer platformSet) {
      this.platformSet = platformSet;
   }

   @JsonProperty("platform_set")
   public Integer getPlatformSet() {
      return this.platformSet;
   }
}
