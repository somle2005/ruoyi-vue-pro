package com.jd.open.api.sdk.domain.youE.PerformInfoSyncExportService.response.queryUnUploadSellingSku;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class SkuInfo implements Serializable {
   private String skuName;
   private String category2;
   private String category3;
   private String skuSource;
   private String brandName;
   private String skuModel;
   private String category1;
   private String shopName;
   private String skuId;

   @JsonProperty("skuName")
   public void setSkuName(String skuName) {
      this.skuName = skuName;
   }

   @JsonProperty("skuName")
   public String getSkuName() {
      return this.skuName;
   }

   @JsonProperty("category2")
   public void setCategory2(String category2) {
      this.category2 = category2;
   }

   @JsonProperty("category2")
   public String getCategory2() {
      return this.category2;
   }

   @JsonProperty("category3")
   public void setCategory3(String category3) {
      this.category3 = category3;
   }

   @JsonProperty("category3")
   public String getCategory3() {
      return this.category3;
   }

   @JsonProperty("skuSource")
   public void setSkuSource(String skuSource) {
      this.skuSource = skuSource;
   }

   @JsonProperty("skuSource")
   public String getSkuSource() {
      return this.skuSource;
   }

   @JsonProperty("brandName")
   public void setBrandName(String brandName) {
      this.brandName = brandName;
   }

   @JsonProperty("brandName")
   public String getBrandName() {
      return this.brandName;
   }

   @JsonProperty("skuModel")
   public void setSkuModel(String skuModel) {
      this.skuModel = skuModel;
   }

   @JsonProperty("skuModel")
   public String getSkuModel() {
      return this.skuModel;
   }

   @JsonProperty("category1")
   public void setCategory1(String category1) {
      this.category1 = category1;
   }

   @JsonProperty("category1")
   public String getCategory1() {
      return this.category1;
   }

   @JsonProperty("shopName")
   public void setShopName(String shopName) {
      this.shopName = shopName;
   }

   @JsonProperty("shopName")
   public String getShopName() {
      return this.shopName;
   }

   @JsonProperty("skuId")
   public void setSkuId(String skuId) {
      this.skuId = skuId;
   }

   @JsonProperty("skuId")
   public String getSkuId() {
      return this.skuId;
   }
}
