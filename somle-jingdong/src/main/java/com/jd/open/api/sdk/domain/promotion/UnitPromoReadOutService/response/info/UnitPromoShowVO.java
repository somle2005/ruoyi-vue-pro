package com.jd.open.api.sdk.domain.promotion.UnitPromoReadOutService.response.info;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class UnitPromoShowVO implements Serializable {
   private Integer orderLimit;
   private Boolean buyLimit;
   private Long promoId;
   private String beginTime;
   private List<String> platFormName;
   private Map<String, String> extMapToExtConvert;
   private Integer promoLabel;
   private String promoName;
   private String slogan;
   private Integer perMaxNum;
   private Integer status;
   private String memberNameList;
   private BusiPlatformCreateModel busiPlatform;
   private MemberCreateModel member;
   private Integer limitWay;
   private Integer bound;
   private Boolean overlyingSuit;
   private String endTime;
   private Integer perMinNum;

   @JsonProperty("orderLimit")
   public void setOrderLimit(Integer orderLimit) {
      this.orderLimit = orderLimit;
   }

   @JsonProperty("orderLimit")
   public Integer getOrderLimit() {
      return this.orderLimit;
   }

   @JsonProperty("buyLimit")
   public void setBuyLimit(Boolean buyLimit) {
      this.buyLimit = buyLimit;
   }

   @JsonProperty("buyLimit")
   public Boolean getBuyLimit() {
      return this.buyLimit;
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
   public void setBeginTime(String beginTime) {
      this.beginTime = beginTime;
   }

   @JsonProperty("beginTime")
   public String getBeginTime() {
      return this.beginTime;
   }

   @JsonProperty("platFormName")
   public void setPlatFormName(List<String> platFormName) {
      this.platFormName = platFormName;
   }

   @JsonProperty("platFormName")
   public List<String> getPlatFormName() {
      return this.platFormName;
   }

   @JsonProperty("extMapToExtConvert")
   public void setExtMapToExtConvert(Map<String, String> extMapToExtConvert) {
      this.extMapToExtConvert = extMapToExtConvert;
   }

   @JsonProperty("extMapToExtConvert")
   public Map<String, String> getExtMapToExtConvert() {
      return this.extMapToExtConvert;
   }

   @JsonProperty("promoLabel")
   public void setPromoLabel(Integer promoLabel) {
      this.promoLabel = promoLabel;
   }

   @JsonProperty("promoLabel")
   public Integer getPromoLabel() {
      return this.promoLabel;
   }

   @JsonProperty("promoName")
   public void setPromoName(String promoName) {
      this.promoName = promoName;
   }

   @JsonProperty("promoName")
   public String getPromoName() {
      return this.promoName;
   }

   @JsonProperty("slogan")
   public void setSlogan(String slogan) {
      this.slogan = slogan;
   }

   @JsonProperty("slogan")
   public String getSlogan() {
      return this.slogan;
   }

   @JsonProperty("perMaxNum")
   public void setPerMaxNum(Integer perMaxNum) {
      this.perMaxNum = perMaxNum;
   }

   @JsonProperty("perMaxNum")
   public Integer getPerMaxNum() {
      return this.perMaxNum;
   }

   @JsonProperty("status")
   public void setStatus(Integer status) {
      this.status = status;
   }

   @JsonProperty("status")
   public Integer getStatus() {
      return this.status;
   }

   @JsonProperty("memberNameList")
   public void setMemberNameList(String memberNameList) {
      this.memberNameList = memberNameList;
   }

   @JsonProperty("memberNameList")
   public String getMemberNameList() {
      return this.memberNameList;
   }

   @JsonProperty("busiPlatform")
   public void setBusiPlatform(BusiPlatformCreateModel busiPlatform) {
      this.busiPlatform = busiPlatform;
   }

   @JsonProperty("busiPlatform")
   public BusiPlatformCreateModel getBusiPlatform() {
      return this.busiPlatform;
   }

   @JsonProperty("member")
   public void setMember(MemberCreateModel member) {
      this.member = member;
   }

   @JsonProperty("member")
   public MemberCreateModel getMember() {
      return this.member;
   }

   @JsonProperty("limitWay")
   public void setLimitWay(Integer limitWay) {
      this.limitWay = limitWay;
   }

   @JsonProperty("limitWay")
   public Integer getLimitWay() {
      return this.limitWay;
   }

   @JsonProperty("bound")
   public void setBound(Integer bound) {
      this.bound = bound;
   }

   @JsonProperty("bound")
   public Integer getBound() {
      return this.bound;
   }

   @JsonProperty("overlyingSuit")
   public void setOverlyingSuit(Boolean overlyingSuit) {
      this.overlyingSuit = overlyingSuit;
   }

   @JsonProperty("overlyingSuit")
   public Boolean getOverlyingSuit() {
      return this.overlyingSuit;
   }

   @JsonProperty("endTime")
   public void setEndTime(String endTime) {
      this.endTime = endTime;
   }

   @JsonProperty("endTime")
   public String getEndTime() {
      return this.endTime;
   }

   @JsonProperty("perMinNum")
   public void setPerMinNum(Integer perMinNum) {
      this.perMinNum = perMinNum;
   }

   @JsonProperty("perMinNum")
   public Integer getPerMinNum() {
      return this.perMinNum;
   }
}
