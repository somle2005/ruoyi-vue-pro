package com.jd.open.api.sdk.domain.xfylapi.ThirdDataExportService.request.pushGoodsInfo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class ThirdGoodsItemParam implements Serializable {
   private String itemMeans;
   private String itemName;
   private String itemTopCategory;
   private String goodsId2;
   private List<String> itemSuitable2;
   private String itemSecCategory;
   private String itemId;

   @JsonProperty("itemMeans")
   public void setItemMeans(String itemMeans) {
      this.itemMeans = itemMeans;
   }

   @JsonProperty("itemMeans")
   public String getItemMeans() {
      return this.itemMeans;
   }

   @JsonProperty("itemName")
   public void setItemName(String itemName) {
      this.itemName = itemName;
   }

   @JsonProperty("itemName")
   public String getItemName() {
      return this.itemName;
   }

   @JsonProperty("itemTopCategory")
   public void setItemTopCategory(String itemTopCategory) {
      this.itemTopCategory = itemTopCategory;
   }

   @JsonProperty("itemTopCategory")
   public String getItemTopCategory() {
      return this.itemTopCategory;
   }

   @JsonProperty("goodsId2")
   public void setGoodsId2(String goodsId2) {
      this.goodsId2 = goodsId2;
   }

   @JsonProperty("goodsId2")
   public String getGoodsId2() {
      return this.goodsId2;
   }

   @JsonProperty("itemSuitable2")
   public void setItemSuitable2(List<String> itemSuitable2) {
      this.itemSuitable2 = itemSuitable2;
   }

   @JsonProperty("itemSuitable2")
   public List<String> getItemSuitable2() {
      return this.itemSuitable2;
   }

   @JsonProperty("itemSecCategory")
   public void setItemSecCategory(String itemSecCategory) {
      this.itemSecCategory = itemSecCategory;
   }

   @JsonProperty("itemSecCategory")
   public String getItemSecCategory() {
      return this.itemSecCategory;
   }

   @JsonProperty("itemId")
   public void setItemId(String itemId) {
      this.itemId = itemId;
   }

   @JsonProperty("itemId")
   public String getItemId() {
      return this.itemId;
   }
}
