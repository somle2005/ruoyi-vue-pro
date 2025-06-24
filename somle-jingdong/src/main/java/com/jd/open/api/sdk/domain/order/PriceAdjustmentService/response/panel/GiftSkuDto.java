package com.jd.open.api.sdk.domain.order.PriceAdjustmentService.response.panel;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class GiftSkuDto implements Serializable {
   private String skuName;
   private String imgUrl;
   private String skuUuId;
   private String color;
   private String size;
   private int skuNum;
   private String saleAttributes;
   private Long skuId;

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

   @JsonProperty("skuUuId")
   public void setSkuUuId(String skuUuId) {
      this.skuUuId = skuUuId;
   }

   @JsonProperty("skuUuId")
   public String getSkuUuId() {
      return this.skuUuId;
   }

   @JsonProperty("color")
   public void setColor(String color) {
      this.color = color;
   }

   @JsonProperty("color")
   public String getColor() {
      return this.color;
   }

   @JsonProperty("size")
   public void setSize(String size) {
      this.size = size;
   }

   @JsonProperty("size")
   public String getSize() {
      return this.size;
   }

   @JsonProperty("skuNum")
   public void setSkuNum(int skuNum) {
      this.skuNum = skuNum;
   }

   @JsonProperty("skuNum")
   public int getSkuNum() {
      return this.skuNum;
   }

   @JsonProperty("saleAttributes")
   public void setSaleAttributes(String saleAttributes) {
      this.saleAttributes = saleAttributes;
   }

   @JsonProperty("saleAttributes")
   public String getSaleAttributes() {
      return this.saleAttributes;
   }

   @JsonProperty("skuId")
   public void setSkuId(Long skuId) {
      this.skuId = skuId;
   }

   @JsonProperty("skuId")
   public Long getSkuId() {
      return this.skuId;
   }
}
