package com.jd.open.api.sdk.domain.promotion.UnitPromoWriteOutService.request.selfUnitPromo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class UnitPromInfo implements Serializable {
   private Boolean buyLimit;
   private List<MemberInfo> member;
   private String beginTime;
   private Integer limitWay;
   private List<UnitPromSkuInfo> unitPromoSkuList;
   private Map<String, String> extMapToExtConvert;
   private Integer bound;
   private Boolean overlyingSuit;
   private Integer promoLabel;
   private String name;
   private String endTime;
   private Integer perMinNum;
   private BusiPlatformInfo platForm;
   private String slogan;
   private Integer perMaxNum;
   private Integer orderLimit;

   @JsonProperty("buyLimit")
   public void setBuyLimit(Boolean buyLimit) {
      this.buyLimit = buyLimit;
   }

   @JsonProperty("buyLimit")
   public Boolean getBuyLimit() {
      return this.buyLimit;
   }

   @JsonProperty("member")
   public void setMember(List<MemberInfo> member) {
      this.member = member;
   }

   @JsonProperty("member")
   public List<MemberInfo> getMember() {
      return this.member;
   }

   @JsonProperty("beginTime")
   public void setBeginTime(String beginTime) {
      this.beginTime = beginTime;
   }

   @JsonProperty("beginTime")
   public String getBeginTime() {
      return this.beginTime;
   }

   @JsonProperty("limitWay")
   public void setLimitWay(Integer limitWay) {
      this.limitWay = limitWay;
   }

   @JsonProperty("limitWay")
   public Integer getLimitWay() {
      return this.limitWay;
   }

   @JsonProperty("unitPromoSkuList")
   public void setUnitPromoSkuList(List<UnitPromSkuInfo> unitPromoSkuList) {
      this.unitPromoSkuList = unitPromoSkuList;
   }

   @JsonProperty("unitPromoSkuList")
   public List<UnitPromSkuInfo> getUnitPromoSkuList() {
      return this.unitPromoSkuList;
   }

   @JsonProperty("extMapToExtConvert")
   public void setExtMapToExtConvert(Map<String, String> extMapToExtConvert) {
      this.extMapToExtConvert = extMapToExtConvert;
   }

   @JsonProperty("extMapToExtConvert")
   public Map<String, String> getExtMapToExtConvert() {
      return this.extMapToExtConvert;
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

   @JsonProperty("promoLabel")
   public void setPromoLabel(Integer promoLabel) {
      this.promoLabel = promoLabel;
   }

   @JsonProperty("promoLabel")
   public Integer getPromoLabel() {
      return this.promoLabel;
   }

   @JsonProperty("name")
   public void setName(String name) {
      this.name = name;
   }

   @JsonProperty("name")
   public String getName() {
      return this.name;
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

   @JsonProperty("platForm")
   public void setPlatForm(BusiPlatformInfo platForm) {
      this.platForm = platForm;
   }

   @JsonProperty("platForm")
   public BusiPlatformInfo getPlatForm() {
      return this.platForm;
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

   @JsonProperty("orderLimit")
   public void setOrderLimit(Integer orderLimit) {
      this.orderLimit = orderLimit;
   }

   @JsonProperty("orderLimit")
   public Integer getOrderLimit() {
      return this.orderLimit;
   }
}
