package com.jd.open.api.sdk.domain.hudong.SuitPromoReadOuterService.response.getSuitPromoDtail;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;

public class Map implements Serializable {
   private Integer blackWhite;
   private Integer isNeedToBuy;
   private Long wareId;
   private Integer num;
   private BigDecimal discount;
   private String skuName;
   private BigDecimal promoPrice;
   private String itemNum;
   private Integer synchStatus;
   private Long stockNum;
   private BigDecimal jdPrice;
   private Boolean oneSkuManyVendor;
   private Long skuId;
   private String imgRui;

   @JsonProperty("blackWhite")
   public void setBlackWhite(Integer blackWhite) {
      this.blackWhite = blackWhite;
   }

   @JsonProperty("blackWhite")
   public Integer getBlackWhite() {
      return this.blackWhite;
   }

   @JsonProperty("isNeedToBuy")
   public void setIsNeedToBuy(Integer isNeedToBuy) {
      this.isNeedToBuy = isNeedToBuy;
   }

   @JsonProperty("isNeedToBuy")
   public Integer getIsNeedToBuy() {
      return this.isNeedToBuy;
   }

   @JsonProperty("wareId")
   public void setWareId(Long wareId) {
      this.wareId = wareId;
   }

   @JsonProperty("wareId")
   public Long getWareId() {
      return this.wareId;
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

   @JsonProperty("skuName")
   public void setSkuName(String skuName) {
      this.skuName = skuName;
   }

   @JsonProperty("skuName")
   public String getSkuName() {
      return this.skuName;
   }

   @JsonProperty("promoPrice")
   public void setPromoPrice(BigDecimal promoPrice) {
      this.promoPrice = promoPrice;
   }

   @JsonProperty("promoPrice")
   public BigDecimal getPromoPrice() {
      return this.promoPrice;
   }

   @JsonProperty("itemNum")
   public void setItemNum(String itemNum) {
      this.itemNum = itemNum;
   }

   @JsonProperty("itemNum")
   public String getItemNum() {
      return this.itemNum;
   }

   @JsonProperty("synchStatus")
   public void setSynchStatus(Integer synchStatus) {
      this.synchStatus = synchStatus;
   }

   @JsonProperty("synchStatus")
   public Integer getSynchStatus() {
      return this.synchStatus;
   }

   @JsonProperty("stockNum")
   public void setStockNum(Long stockNum) {
      this.stockNum = stockNum;
   }

   @JsonProperty("stockNum")
   public Long getStockNum() {
      return this.stockNum;
   }

   @JsonProperty("jdPrice")
   public void setJdPrice(BigDecimal jdPrice) {
      this.jdPrice = jdPrice;
   }

   @JsonProperty("jdPrice")
   public BigDecimal getJdPrice() {
      return this.jdPrice;
   }

   @JsonProperty("oneSkuManyVendor")
   public void setOneSkuManyVendor(Boolean oneSkuManyVendor) {
      this.oneSkuManyVendor = oneSkuManyVendor;
   }

   @JsonProperty("oneSkuManyVendor")
   public Boolean getOneSkuManyVendor() {
      return this.oneSkuManyVendor;
   }

   @JsonProperty("skuId")
   public void setSkuId(Long skuId) {
      this.skuId = skuId;
   }

   @JsonProperty("skuId")
   public Long getSkuId() {
      return this.skuId;
   }

   @JsonProperty("imgRui")
   public void setImgRui(String imgRui) {
      this.imgRui = imgRui;
   }

   @JsonProperty("imgRui")
   public String getImgRui() {
      return this.imgRui;
   }
}
