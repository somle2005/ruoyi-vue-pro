package com.jd.open.api.sdk.domain.yjs.StoreClient.response.queryStorePageDetailData;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class StoreRecommendSku implements Serializable {
   private String skuName;
   private String imgUrl;
   private String brandName;
   private String storeSkuUrl;
   private String skuTag;
   private int sort;
   private String drugType;
   private String skuId;

   @JsonProperty("skuName")
   public void setSkuName(String skuName) {
      this.skuName = skuName;
   }

   @JsonProperty("skuName")
   public String getSkuName() {
      return this.skuName;
   }

   @JsonProperty("imgUrl")
   public void setImgUrl(String imgUrl) {
      this.imgUrl = imgUrl;
   }

   @JsonProperty("imgUrl")
   public String getImgUrl() {
      return this.imgUrl;
   }

   @JsonProperty("brandName")
   public void setBrandName(String brandName) {
      this.brandName = brandName;
   }

   @JsonProperty("brandName")
   public String getBrandName() {
      return this.brandName;
   }

   @JsonProperty("storeSkuUrl")
   public void setStoreSkuUrl(String storeSkuUrl) {
      this.storeSkuUrl = storeSkuUrl;
   }

   @JsonProperty("storeSkuUrl")
   public String getStoreSkuUrl() {
      return this.storeSkuUrl;
   }

   @JsonProperty("skuTag")
   public void setSkuTag(String skuTag) {
      this.skuTag = skuTag;
   }

   @JsonProperty("skuTag")
   public String getSkuTag() {
      return this.skuTag;
   }

   @JsonProperty("sort")
   public void setSort(int sort) {
      this.sort = sort;
   }

   @JsonProperty("sort")
   public int getSort() {
      return this.sort;
   }

   @JsonProperty("drugType")
   public void setDrugType(String drugType) {
      this.drugType = drugType;
   }

   @JsonProperty("drugType")
   public String getDrugType() {
      return this.drugType;
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
