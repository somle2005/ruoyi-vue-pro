package com.jd.open.api.sdk.domain.hudong.PresaleQueryService.response.detail;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class PresaleDetailResult implements Serializable {
   private String isShowOnHandPrice;
   private String shipTime;
   private Boolean hidePriceEnable;
   private Integer type;
   private Integer payType;
   private Integer doNotDisturb;
   private Boolean releasePriceEnable;
   private BusiPlatform busiViewPlatform;
   private Boolean modifyPriceEnable;
   private String balanceEndTime;
   private List<PresaleSkuInfo> presaleSkus;
   private String presaleStartTime;
   private Integer hidePrice;
   private String balanceStartTime;
   private String presaleName;
   private String preHeatStartTime;
   private Boolean isPopVender;
   private Boolean shop;
   private Boolean mergePay;
   private Integer preHeatHidePrice;
   private String presaleEndTime;
   private Integer preShowTag;
   private Integer discountType;
   private Integer spotPresale;
   private Integer presaleStatus;
   private MemberCreateModel memberCreateModel;
   private Integer balanceHours;
   private Long presaleId;
   private Integer presaleCheckStatus;

   @JsonProperty("isShowOnHandPrice")
   public void setIsShowOnHandPrice(String isShowOnHandPrice) {
      this.isShowOnHandPrice = isShowOnHandPrice;
   }

   @JsonProperty("isShowOnHandPrice")
   public String getIsShowOnHandPrice() {
      return this.isShowOnHandPrice;
   }

   @JsonProperty("shipTime")
   public void setShipTime(String shipTime) {
      this.shipTime = shipTime;
   }

   @JsonProperty("shipTime")
   public String getShipTime() {
      return this.shipTime;
   }

   @JsonProperty("hidePriceEnable")
   public void setHidePriceEnable(Boolean hidePriceEnable) {
      this.hidePriceEnable = hidePriceEnable;
   }

   @JsonProperty("hidePriceEnable")
   public Boolean getHidePriceEnable() {
      return this.hidePriceEnable;
   }

   @JsonProperty("type")
   public void setType(Integer type) {
      this.type = type;
   }

   @JsonProperty("type")
   public Integer getType() {
      return this.type;
   }

   @JsonProperty("payType")
   public void setPayType(Integer payType) {
      this.payType = payType;
   }

   @JsonProperty("payType")
   public Integer getPayType() {
      return this.payType;
   }

   @JsonProperty("doNotDisturb")
   public void setDoNotDisturb(Integer doNotDisturb) {
      this.doNotDisturb = doNotDisturb;
   }

   @JsonProperty("doNotDisturb")
   public Integer getDoNotDisturb() {
      return this.doNotDisturb;
   }

   @JsonProperty("releasePriceEnable")
   public void setReleasePriceEnable(Boolean releasePriceEnable) {
      this.releasePriceEnable = releasePriceEnable;
   }

   @JsonProperty("releasePriceEnable")
   public Boolean getReleasePriceEnable() {
      return this.releasePriceEnable;
   }

   @JsonProperty("busiViewPlatform")
   public void setBusiViewPlatform(BusiPlatform busiViewPlatform) {
      this.busiViewPlatform = busiViewPlatform;
   }

   @JsonProperty("busiViewPlatform")
   public BusiPlatform getBusiViewPlatform() {
      return this.busiViewPlatform;
   }

   @JsonProperty("modifyPriceEnable")
   public void setModifyPriceEnable(Boolean modifyPriceEnable) {
      this.modifyPriceEnable = modifyPriceEnable;
   }

   @JsonProperty("modifyPriceEnable")
   public Boolean getModifyPriceEnable() {
      return this.modifyPriceEnable;
   }

   @JsonProperty("balanceEndTime")
   public void setBalanceEndTime(String balanceEndTime) {
      this.balanceEndTime = balanceEndTime;
   }

   @JsonProperty("balanceEndTime")
   public String getBalanceEndTime() {
      return this.balanceEndTime;
   }

   @JsonProperty("presaleSkus")
   public void setPresaleSkus(List<PresaleSkuInfo> presaleSkus) {
      this.presaleSkus = presaleSkus;
   }

   @JsonProperty("presaleSkus")
   public List<PresaleSkuInfo> getPresaleSkus() {
      return this.presaleSkus;
   }

   @JsonProperty("presaleStartTime")
   public void setPresaleStartTime(String presaleStartTime) {
      this.presaleStartTime = presaleStartTime;
   }

   @JsonProperty("presaleStartTime")
   public String getPresaleStartTime() {
      return this.presaleStartTime;
   }

   @JsonProperty("hidePrice")
   public void setHidePrice(Integer hidePrice) {
      this.hidePrice = hidePrice;
   }

   @JsonProperty("hidePrice")
   public Integer getHidePrice() {
      return this.hidePrice;
   }

   @JsonProperty("balanceStartTime")
   public void setBalanceStartTime(String balanceStartTime) {
      this.balanceStartTime = balanceStartTime;
   }

   @JsonProperty("balanceStartTime")
   public String getBalanceStartTime() {
      return this.balanceStartTime;
   }

   @JsonProperty("presaleName")
   public void setPresaleName(String presaleName) {
      this.presaleName = presaleName;
   }

   @JsonProperty("presaleName")
   public String getPresaleName() {
      return this.presaleName;
   }

   @JsonProperty("preHeatStartTime")
   public void setPreHeatStartTime(String preHeatStartTime) {
      this.preHeatStartTime = preHeatStartTime;
   }

   @JsonProperty("preHeatStartTime")
   public String getPreHeatStartTime() {
      return this.preHeatStartTime;
   }

   @JsonProperty("isPopVender")
   public void setIsPopVender(Boolean isPopVender) {
      this.isPopVender = isPopVender;
   }

   @JsonProperty("isPopVender")
   public Boolean getIsPopVender() {
      return this.isPopVender;
   }

   @JsonProperty("shop")
   public void setShop(Boolean shop) {
      this.shop = shop;
   }

   @JsonProperty("shop")
   public Boolean getShop() {
      return this.shop;
   }

   @JsonProperty("mergePay")
   public void setMergePay(Boolean mergePay) {
      this.mergePay = mergePay;
   }

   @JsonProperty("mergePay")
   public Boolean getMergePay() {
      return this.mergePay;
   }

   @JsonProperty("preHeatHidePrice")
   public void setPreHeatHidePrice(Integer preHeatHidePrice) {
      this.preHeatHidePrice = preHeatHidePrice;
   }

   @JsonProperty("preHeatHidePrice")
   public Integer getPreHeatHidePrice() {
      return this.preHeatHidePrice;
   }

   @JsonProperty("presaleEndTime")
   public void setPresaleEndTime(String presaleEndTime) {
      this.presaleEndTime = presaleEndTime;
   }

   @JsonProperty("presaleEndTime")
   public String getPresaleEndTime() {
      return this.presaleEndTime;
   }

   @JsonProperty("preShowTag")
   public void setPreShowTag(Integer preShowTag) {
      this.preShowTag = preShowTag;
   }

   @JsonProperty("preShowTag")
   public Integer getPreShowTag() {
      return this.preShowTag;
   }

   @JsonProperty("discountType")
   public void setDiscountType(Integer discountType) {
      this.discountType = discountType;
   }

   @JsonProperty("discountType")
   public Integer getDiscountType() {
      return this.discountType;
   }

   @JsonProperty("spotPresale")
   public void setSpotPresale(Integer spotPresale) {
      this.spotPresale = spotPresale;
   }

   @JsonProperty("spotPresale")
   public Integer getSpotPresale() {
      return this.spotPresale;
   }

   @JsonProperty("presaleStatus")
   public void setPresaleStatus(Integer presaleStatus) {
      this.presaleStatus = presaleStatus;
   }

   @JsonProperty("presaleStatus")
   public Integer getPresaleStatus() {
      return this.presaleStatus;
   }

   @JsonProperty("memberCreateModel")
   public void setMemberCreateModel(MemberCreateModel memberCreateModel) {
      this.memberCreateModel = memberCreateModel;
   }

   @JsonProperty("memberCreateModel")
   public MemberCreateModel getMemberCreateModel() {
      return this.memberCreateModel;
   }

   @JsonProperty("balanceHours")
   public void setBalanceHours(Integer balanceHours) {
      this.balanceHours = balanceHours;
   }

   @JsonProperty("balanceHours")
   public Integer getBalanceHours() {
      return this.balanceHours;
   }

   @JsonProperty("presaleId")
   public void setPresaleId(Long presaleId) {
      this.presaleId = presaleId;
   }

   @JsonProperty("presaleId")
   public Long getPresaleId() {
      return this.presaleId;
   }

   @JsonProperty("presaleCheckStatus")
   public void setPresaleCheckStatus(Integer presaleCheckStatus) {
      this.presaleCheckStatus = presaleCheckStatus;
   }

   @JsonProperty("presaleCheckStatus")
   public Integer getPresaleCheckStatus() {
      return this.presaleCheckStatus;
   }
}
