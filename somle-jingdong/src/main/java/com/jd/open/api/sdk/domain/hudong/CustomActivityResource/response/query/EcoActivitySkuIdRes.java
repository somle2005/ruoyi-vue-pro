package com.jd.open.api.sdk.domain.hudong.CustomActivityResource.response.query;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;

public class EcoActivitySkuIdRes implements Serializable {
   private String skuName;
   private String itemId;
   private String pin;
   private String wareId;
   private String venderId;
   private String skuStatus;
   private String itemStore;
   private BigDecimal jdPrice;
   private String mktActBaseNo;
   private String skuId;
   private String skuImage;

   @JsonProperty("skuName")
   public void setSkuName(String skuName) {
      this.skuName = skuName;
   }

   @JsonProperty("skuName")
   public String getSkuName() {
      return this.skuName;
   }

   @JsonProperty("itemId")
   public void setItemId(String itemId) {
      this.itemId = itemId;
   }

   @JsonProperty("itemId")
   public String getItemId() {
      return this.itemId;
   }

   @JsonProperty("pin")
   public void setPin(String pin) {
      this.pin = pin;
   }

   @JsonProperty("pin")
   public String getPin() {
      return this.pin;
   }

   @JsonProperty("wareId")
   public void setWareId(String wareId) {
      this.wareId = wareId;
   }

   @JsonProperty("wareId")
   public String getWareId() {
      return this.wareId;
   }

   @JsonProperty("venderId")
   public void setVenderId(String venderId) {
      this.venderId = venderId;
   }

   @JsonProperty("venderId")
   public String getVenderId() {
      return this.venderId;
   }

   @JsonProperty("skuStatus")
   public void setSkuStatus(String skuStatus) {
      this.skuStatus = skuStatus;
   }

   @JsonProperty("skuStatus")
   public String getSkuStatus() {
      return this.skuStatus;
   }

   @JsonProperty("itemStore")
   public void setItemStore(String itemStore) {
      this.itemStore = itemStore;
   }

   @JsonProperty("itemStore")
   public String getItemStore() {
      return this.itemStore;
   }

   @JsonProperty("jdPrice")
   public void setJdPrice(BigDecimal jdPrice) {
      this.jdPrice = jdPrice;
   }

   @JsonProperty("jdPrice")
   public BigDecimal getJdPrice() {
      return this.jdPrice;
   }

   @JsonProperty("mktActBaseNo")
   public void setMktActBaseNo(String mktActBaseNo) {
      this.mktActBaseNo = mktActBaseNo;
   }

   @JsonProperty("mktActBaseNo")
   public String getMktActBaseNo() {
      return this.mktActBaseNo;
   }

   @JsonProperty("skuId")
   public void setSkuId(String skuId) {
      this.skuId = skuId;
   }

   @JsonProperty("skuId")
   public String getSkuId() {
      return this.skuId;
   }

   @JsonProperty("skuImage")
   public void setSkuImage(String skuImage) {
      this.skuImage = skuImage;
   }

   @JsonProperty("skuImage")
   public String getSkuImage() {
      return this.skuImage;
   }
}
