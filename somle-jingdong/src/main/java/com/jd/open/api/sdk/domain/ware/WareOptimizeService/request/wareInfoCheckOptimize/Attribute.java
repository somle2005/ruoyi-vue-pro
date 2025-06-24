package com.jd.open.api.sdk.domain.ware.WareOptimizeService.request.wareInfoCheckOptimize;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class Attribute implements Serializable {
   private Long skuAttributeId;
   private Long skuAttributeValueId;
   private String skuAttributeValue;
   private String skuAttributeName;
   private Long skuAttributeGroupId;
   private String skuAttributeGroupName;
   private Long spuAttributeId;
   private Long spuAttributeValueId;
   private String spuAttributeValue;
   private String spuAttributeName;
   private Long spuAttributeGroupId;
   private String spuAttributeGroupName;

   @JsonProperty("skuAttributeId")
   public void setSkuAttributeId(Long skuAttributeId) {
      this.skuAttributeId = skuAttributeId;
   }

   @JsonProperty("skuAttributeId")
   public Long getSkuAttributeId() {
      return this.skuAttributeId;
   }

   @JsonProperty("skuAttributeValueId")
   public void setSkuAttributeValueId(Long skuAttributeValueId) {
      this.skuAttributeValueId = skuAttributeValueId;
   }

   @JsonProperty("skuAttributeValueId")
   public Long getSkuAttributeValueId() {
      return this.skuAttributeValueId;
   }

   @JsonProperty("skuAttributeValue")
   public void setSkuAttributeValue(String skuAttributeValue) {
      this.skuAttributeValue = skuAttributeValue;
   }

   @JsonProperty("skuAttributeValue")
   public String getSkuAttributeValue() {
      return this.skuAttributeValue;
   }

   @JsonProperty("skuAttributeName")
   public void setSkuAttributeName(String skuAttributeName) {
      this.skuAttributeName = skuAttributeName;
   }

   @JsonProperty("skuAttributeName")
   public String getSkuAttributeName() {
      return this.skuAttributeName;
   }

   @JsonProperty("skuAttributeGroupId")
   public void setSkuAttributeGroupId(Long skuAttributeGroupId) {
      this.skuAttributeGroupId = skuAttributeGroupId;
   }

   @JsonProperty("skuAttributeGroupId")
   public Long getSkuAttributeGroupId() {
      return this.skuAttributeGroupId;
   }

   @JsonProperty("skuAttributeGroupName")
   public void setSkuAttributeGroupName(String skuAttributeGroupName) {
      this.skuAttributeGroupName = skuAttributeGroupName;
   }

   @JsonProperty("skuAttributeGroupName")
   public String getSkuAttributeGroupName() {
      return this.skuAttributeGroupName;
   }

   @JsonProperty("spuAttributeId")
   public void setSpuAttributeId(Long spuAttributeId) {
      this.spuAttributeId = spuAttributeId;
   }

   @JsonProperty("spuAttributeId")
   public Long getSpuAttributeId() {
      return this.spuAttributeId;
   }

   @JsonProperty("spuAttributeValueId")
   public void setSpuAttributeValueId(Long spuAttributeValueId) {
      this.spuAttributeValueId = spuAttributeValueId;
   }

   @JsonProperty("spuAttributeValueId")
   public Long getSpuAttributeValueId() {
      return this.spuAttributeValueId;
   }

   @JsonProperty("spuAttributeValue")
   public void setSpuAttributeValue(String spuAttributeValue) {
      this.spuAttributeValue = spuAttributeValue;
   }

   @JsonProperty("spuAttributeValue")
   public String getSpuAttributeValue() {
      return this.spuAttributeValue;
   }

   @JsonProperty("spuAttributeName")
   public void setSpuAttributeName(String spuAttributeName) {
      this.spuAttributeName = spuAttributeName;
   }

   @JsonProperty("spuAttributeName")
   public String getSpuAttributeName() {
      return this.spuAttributeName;
   }

   @JsonProperty("spuAttributeGroupId")
   public void setSpuAttributeGroupId(Long spuAttributeGroupId) {
      this.spuAttributeGroupId = spuAttributeGroupId;
   }

   @JsonProperty("spuAttributeGroupId")
   public Long getSpuAttributeGroupId() {
      return this.spuAttributeGroupId;
   }

   @JsonProperty("spuAttributeGroupName")
   public void setSpuAttributeGroupName(String spuAttributeGroupName) {
      this.spuAttributeGroupName = spuAttributeGroupName;
   }

   @JsonProperty("spuAttributeGroupName")
   public String getSpuAttributeGroupName() {
      return this.spuAttributeGroupName;
   }
}
