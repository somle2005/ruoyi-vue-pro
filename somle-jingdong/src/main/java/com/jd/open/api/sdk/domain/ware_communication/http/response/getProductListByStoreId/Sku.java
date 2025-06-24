package com.jd.open.api.sdk.domain.ware_communication.http.response.getProductListByStoreId;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class Sku implements Serializable {
   private String[] title;
   private String[] imageUrl;
   private Long[] price;
   private String[] model;
   private String[] description;
   private String[] skuId;
   private String[] articleNumber;
   private String[] barcode;

   @JsonProperty("title")
   public void setTitle(String[] title) {
      this.title = title;
   }

   @JsonProperty("title")
   public String[] getTitle() {
      return this.title;
   }

   @JsonProperty("imageUrl")
   public void setImageUrl(String[] imageUrl) {
      this.imageUrl = imageUrl;
   }

   @JsonProperty("imageUrl")
   public String[] getImageUrl() {
      return this.imageUrl;
   }

   @JsonProperty("price")
   public void setPrice(Long[] price) {
      this.price = price;
   }

   @JsonProperty("price")
   public Long[] getPrice() {
      return this.price;
   }

   @JsonProperty("model")
   public void setModel(String[] model) {
      this.model = model;
   }

   @JsonProperty("model")
   public String[] getModel() {
      return this.model;
   }

   @JsonProperty("description")
   public void setDescription(String[] description) {
      this.description = description;
   }

   @JsonProperty("description")
   public String[] getDescription() {
      return this.description;
   }

   @JsonProperty("skuId")
   public void setSkuId(String[] skuId) {
      this.skuId = skuId;
   }

   @JsonProperty("skuId")
   public String[] getSkuId() {
      return this.skuId;
   }

   @JsonProperty("articleNumber")
   public void setArticleNumber(String[] articleNumber) {
      this.articleNumber = articleNumber;
   }

   @JsonProperty("articleNumber")
   public String[] getArticleNumber() {
      return this.articleNumber;
   }

   @JsonProperty("barcode")
   public void setBarcode(String[] barcode) {
      this.barcode = barcode;
   }

   @JsonProperty("barcode")
   public String[] getBarcode() {
      return this.barcode;
   }
}
