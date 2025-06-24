package com.jd.open.api.sdk.domain.hudong.PresaleWriteService.request.create;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class PresaleInfo implements Serializable {
   private String isShowOnHandPrice;
   private String shipTime;
   private Boolean mergePay;
   private Integer type;
   private BusiPlatformInfo busiPlatform;
   private Integer payType;
   private Integer doNotDisturb;
   private String presaleEndTime;
   private Integer preShowTag;
   private Integer discountType;
   private Integer spotPresale;
   private MemberInfo memberInfo;
   private List<PresaleSkuInfo> presaleSkus;
   private String presaleStartTime;
   private Integer hidePrice;
   private String balanceStartTime;
   private String presaleName;
   private String preHeatStartTime;
   private Integer balanceHours;
   private Map<String, String> extMap;

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

   @JsonProperty("mergePay")
   public void setMergePay(Boolean mergePay) {
      this.mergePay = mergePay;
   }

   @JsonProperty("mergePay")
   public Boolean getMergePay() {
      return this.mergePay;
   }

   @JsonProperty("type")
   public void setType(Integer type) {
      this.type = type;
   }

   @JsonProperty("type")
   public Integer getType() {
      return this.type;
   }

   @JsonProperty("busiPlatform")
   public void setBusiPlatform(BusiPlatformInfo busiPlatform) {
      this.busiPlatform = busiPlatform;
   }

   @JsonProperty("busiPlatform")
   public BusiPlatformInfo getBusiPlatform() {
      return this.busiPlatform;
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

   @JsonProperty("memberInfo")
   public void setMemberInfo(MemberInfo memberInfo) {
      this.memberInfo = memberInfo;
   }

   @JsonProperty("memberInfo")
   public MemberInfo getMemberInfo() {
      return this.memberInfo;
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

   @JsonProperty("balanceHours")
   public void setBalanceHours(Integer balanceHours) {
      this.balanceHours = balanceHours;
   }

   @JsonProperty("balanceHours")
   public Integer getBalanceHours() {
      return this.balanceHours;
   }

   @JsonProperty("extMap")
   public void setExtMap(Map<String, String> extMap) {
      this.extMap = extMap;
   }

   @JsonProperty("extMap")
   public Map<String, String> getExtMap() {
      return this.extMap;
   }
}
