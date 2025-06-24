package com.jd.open.api.sdk.domain.ware.WareOptimizeService.request.wareInfoCheckOptimize;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class SkuReq implements Serializable {
   private String skuTitle;
   private String colourId;
   private String sizeId;
   private String colour;
   private String size;
   private String skuModel;
   private List<MarketingInfo> skuMarketing;
   private List<StructedAttribute> skuStructAttr;
   private List<Attribute> attr;
   private Long skuId;
   private String upcCode;

   @JsonProperty("skuTitle")
   public void setSkuTitle(String skuTitle) {
      this.skuTitle = skuTitle;
   }

   @JsonProperty("skuTitle")
   public String getSkuTitle() {
      return this.skuTitle;
   }

   @JsonProperty("colourId")
   public void setColourId(String colourId) {
      this.colourId = colourId;
   }

   @JsonProperty("colourId")
   public String getColourId() {
      return this.colourId;
   }

   @JsonProperty("sizeId")
   public void setSizeId(String sizeId) {
      this.sizeId = sizeId;
   }

   @JsonProperty("sizeId")
   public String getSizeId() {
      return this.sizeId;
   }

   @JsonProperty("colour")
   public void setColour(String colour) {
      this.colour = colour;
   }

   @JsonProperty("colour")
   public String getColour() {
      return this.colour;
   }

   @JsonProperty("size")
   public void setSize(String size) {
      this.size = size;
   }

   @JsonProperty("size")
   public String getSize() {
      return this.size;
   }

   @JsonProperty("skuModel")
   public void setSkuModel(String skuModel) {
      this.skuModel = skuModel;
   }

   @JsonProperty("skuModel")
   public String getSkuModel() {
      return this.skuModel;
   }

   @JsonProperty("skuMarketing")
   public void setSkuMarketing(List<MarketingInfo> skuMarketing) {
      this.skuMarketing = skuMarketing;
   }

   @JsonProperty("skuMarketing")
   public List<MarketingInfo> getSkuMarketing() {
      return this.skuMarketing;
   }

   @JsonProperty("skuStructAttr")
   public void setSkuStructAttr(List<StructedAttribute> skuStructAttr) {
      this.skuStructAttr = skuStructAttr;
   }

   @JsonProperty("skuStructAttr")
   public List<StructedAttribute> getSkuStructAttr() {
      return this.skuStructAttr;
   }

   @JsonProperty("attr")
   public void setAttr(List<Attribute> attr) {
      this.attr = attr;
   }

   @JsonProperty("attr")
   public List<Attribute> getAttr() {
      return this.attr;
   }

   @JsonProperty("skuId")
   public void setSkuId(Long skuId) {
      this.skuId = skuId;
   }

   @JsonProperty("skuId")
   public Long getSkuId() {
      return this.skuId;
   }

   @JsonProperty("upcCode")
   public void setUpcCode(String upcCode) {
      this.upcCode = upcCode;
   }

   @JsonProperty("upcCode")
   public String getUpcCode() {
      return this.upcCode;
   }
}
