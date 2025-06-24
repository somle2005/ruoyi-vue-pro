package com.jd.open.api.sdk.domain.hudong.PresaleQueryService.response.list;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class PresaleDetailResult implements Serializable {
   private Long presaleId;
   private String presaleName;
   private Integer type;
   private Integer preShowTag;
   private Integer discountType;
   private String presaleStartTime;
   private String presaleEndTime;
   private String shipTime;
   private Integer presaleStatus;
   private Integer presaleCheckStatus;
   private Long wareId;
   private Long skuId;
   private String wareName;
   private String wareImg;
   private Integer payType;
   private Boolean shop;
   private String isShowOnHandPrice;
   private Integer preHeatHidePrice;

   @JsonProperty("presaleId")
   public void setPresaleId(Long presaleId) {
      this.presaleId = presaleId;
   }

   @JsonProperty("presaleId")
   public Long getPresaleId() {
      return this.presaleId;
   }

   @JsonProperty("presaleName")
   public void setPresaleName(String presaleName) {
      this.presaleName = presaleName;
   }

   @JsonProperty("presaleName")
   public String getPresaleName() {
      return this.presaleName;
   }

   @JsonProperty("type")
   public void setType(Integer type) {
      this.type = type;
   }

   @JsonProperty("type")
   public Integer getType() {
      return this.type;
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

   @JsonProperty("presaleStartTime")
   public void setPresaleStartTime(String presaleStartTime) {
      this.presaleStartTime = presaleStartTime;
   }

   @JsonProperty("presaleStartTime")
   public String getPresaleStartTime() {
      return this.presaleStartTime;
   }

   @JsonProperty("presaleEndTime")
   public void setPresaleEndTime(String presaleEndTime) {
      this.presaleEndTime = presaleEndTime;
   }

   @JsonProperty("presaleEndTime")
   public String getPresaleEndTime() {
      return this.presaleEndTime;
   }

   @JsonProperty("shipTime")
   public void setShipTime(String shipTime) {
      this.shipTime = shipTime;
   }

   @JsonProperty("shipTime")
   public String getShipTime() {
      return this.shipTime;
   }

   @JsonProperty("presaleStatus")
   public void setPresaleStatus(Integer presaleStatus) {
      this.presaleStatus = presaleStatus;
   }

   @JsonProperty("presaleStatus")
   public Integer getPresaleStatus() {
      return this.presaleStatus;
   }

   @JsonProperty("presaleCheckStatus")
   public void setPresaleCheckStatus(Integer presaleCheckStatus) {
      this.presaleCheckStatus = presaleCheckStatus;
   }

   @JsonProperty("presaleCheckStatus")
   public Integer getPresaleCheckStatus() {
      return this.presaleCheckStatus;
   }

   @JsonProperty("wareId")
   public void setWareId(Long wareId) {
      this.wareId = wareId;
   }

   @JsonProperty("wareId")
   public Long getWareId() {
      return this.wareId;
   }

   @JsonProperty("skuId")
   public void setSkuId(Long skuId) {
      this.skuId = skuId;
   }

   @JsonProperty("skuId")
   public Long getSkuId() {
      return this.skuId;
   }

   @JsonProperty("wareName")
   public void setWareName(String wareName) {
      this.wareName = wareName;
   }

   @JsonProperty("wareName")
   public String getWareName() {
      return this.wareName;
   }

   @JsonProperty("wareImg")
   public void setWareImg(String wareImg) {
      this.wareImg = wareImg;
   }

   @JsonProperty("wareImg")
   public String getWareImg() {
      return this.wareImg;
   }

   @JsonProperty("payType")
   public void setPayType(Integer payType) {
      this.payType = payType;
   }

   @JsonProperty("payType")
   public Integer getPayType() {
      return this.payType;
   }

   @JsonProperty("shop")
   public void setShop(Boolean shop) {
      this.shop = shop;
   }

   @JsonProperty("shop")
   public Boolean getShop() {
      return this.shop;
   }

   @JsonProperty("isShowOnHandPrice")
   public void setIsShowOnHandPrice(String isShowOnHandPrice) {
      this.isShowOnHandPrice = isShowOnHandPrice;
   }

   @JsonProperty("isShowOnHandPrice")
   public String getIsShowOnHandPrice() {
      return this.isShowOnHandPrice;
   }

   @JsonProperty("preHeatHidePrice")
   public void setPreHeatHidePrice(Integer preHeatHidePrice) {
      this.preHeatHidePrice = preHeatHidePrice;
   }

   @JsonProperty("preHeatHidePrice")
   public Integer getPreHeatHidePrice() {
      return this.preHeatHidePrice;
   }
}
