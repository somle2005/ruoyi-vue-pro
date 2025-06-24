package com.jd.open.api.sdk.domain.ware_communication.ProductSearchResource.response.getSkuList;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class SkuProductInfo implements Serializable {
   private String title;
   private String spuId;
   private String saleAttributes;
   private Long price;
   private String imageUrl;
   private String barcode;
   private Long basePrice;
   private String skuId;
   private Long jdSpuId;
   private Long jdSkuId;

   @JsonProperty("title")
   public void setTitle(String title) {
      this.title = title;
   }

   @JsonProperty("title")
   public String getTitle() {
      return this.title;
   }

   @JsonProperty("spuId")
   public void setSpuId(String spuId) {
      this.spuId = spuId;
   }

   @JsonProperty("spuId")
   public String getSpuId() {
      return this.spuId;
   }

   @JsonProperty("saleAttributes")
   public void setSaleAttributes(String saleAttributes) {
      this.saleAttributes = saleAttributes;
   }

   @JsonProperty("saleAttributes")
   public String getSaleAttributes() {
      return this.saleAttributes;
   }

   @JsonProperty("price")
   public void setPrice(Long price) {
      this.price = price;
   }

   @JsonProperty("price")
   public Long getPrice() {
      return this.price;
   }

   @JsonProperty("imageUrl")
   public void setImageUrl(String imageUrl) {
      this.imageUrl = imageUrl;
   }

   @JsonProperty("imageUrl")
   public String getImageUrl() {
      return this.imageUrl;
   }

   @JsonProperty("barcode")
   public void setBarcode(String barcode) {
      this.barcode = barcode;
   }

   @JsonProperty("barcode")
   public String getBarcode() {
      return this.barcode;
   }

   @JsonProperty("basePrice")
   public void setBasePrice(Long basePrice) {
      this.basePrice = basePrice;
   }

   @JsonProperty("basePrice")
   public Long getBasePrice() {
      return this.basePrice;
   }

   @JsonProperty("skuId")
   public void setSkuId(String skuId) {
      this.skuId = skuId;
   }

   @JsonProperty("skuId")
   public String getSkuId() {
      return this.skuId;
   }

   @JsonProperty("jdSpuId")
   public void setJdSpuId(Long jdSpuId) {
      this.jdSpuId = jdSpuId;
   }

   @JsonProperty("jdSpuId")
   public Long getJdSpuId() {
      return this.jdSpuId;
   }

   @JsonProperty("jdSkuId")
   public void setJdSkuId(Long jdSkuId) {
      this.jdSkuId = jdSkuId;
   }

   @JsonProperty("jdSkuId")
   public Long getJdSkuId() {
      return this.jdSkuId;
   }
}
