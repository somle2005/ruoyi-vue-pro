package com.jd.open.api.sdk.domain.ware.WareOptimizeService.request.wareInfoCheckOptimize;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class StructedAttribute implements Serializable {
   private String spuStructGroupName;
   private Integer spuStructAttrId;
   private Integer spuStructAttrValueId;
   private Integer spuStructGroupId;
   private List<PropValueReq> spuStructValues;
   private Integer spuStructInputType;
   private String spuStructAttrValue;
   private String spuStructAttrName;
   private String skuStructGroupName;
   private Integer skuStructAttrId;
   private Integer skuStructAttrValueId;
   private Integer skuStructGroupId;
   private List<PropValueReq> skuStructValues;
   private Integer skuStructInputType;
   private String skuStructAttrValue;
   private String skuStructAttrName;

   @JsonProperty("spuStructGroupName")
   public void setSpuStructGroupName(String spuStructGroupName) {
      this.spuStructGroupName = spuStructGroupName;
   }

   @JsonProperty("spuStructGroupName")
   public String getSpuStructGroupName() {
      return this.spuStructGroupName;
   }

   @JsonProperty("spuStructAttrId")
   public void setSpuStructAttrId(Integer spuStructAttrId) {
      this.spuStructAttrId = spuStructAttrId;
   }

   @JsonProperty("spuStructAttrId")
   public Integer getSpuStructAttrId() {
      return this.spuStructAttrId;
   }

   @JsonProperty("spuStructAttrValueId")
   public void setSpuStructAttrValueId(Integer spuStructAttrValueId) {
      this.spuStructAttrValueId = spuStructAttrValueId;
   }

   @JsonProperty("spuStructAttrValueId")
   public Integer getSpuStructAttrValueId() {
      return this.spuStructAttrValueId;
   }

   @JsonProperty("spuStructGroupId")
   public void setSpuStructGroupId(Integer spuStructGroupId) {
      this.spuStructGroupId = spuStructGroupId;
   }

   @JsonProperty("spuStructGroupId")
   public Integer getSpuStructGroupId() {
      return this.spuStructGroupId;
   }

   @JsonProperty("spuStructValues")
   public void setSpuStructValues(List<PropValueReq> spuStructValues) {
      this.spuStructValues = spuStructValues;
   }

   @JsonProperty("spuStructValues")
   public List<PropValueReq> getSpuStructValues() {
      return this.spuStructValues;
   }

   @JsonProperty("spuStructInputType")
   public void setSpuStructInputType(Integer spuStructInputType) {
      this.spuStructInputType = spuStructInputType;
   }

   @JsonProperty("spuStructInputType")
   public Integer getSpuStructInputType() {
      return this.spuStructInputType;
   }

   @JsonProperty("spuStructAttrValue")
   public void setSpuStructAttrValue(String spuStructAttrValue) {
      this.spuStructAttrValue = spuStructAttrValue;
   }

   @JsonProperty("spuStructAttrValue")
   public String getSpuStructAttrValue() {
      return this.spuStructAttrValue;
   }

   @JsonProperty("spuStructAttrName")
   public void setSpuStructAttrName(String spuStructAttrName) {
      this.spuStructAttrName = spuStructAttrName;
   }

   @JsonProperty("spuStructAttrName")
   public String getSpuStructAttrName() {
      return this.spuStructAttrName;
   }

   @JsonProperty("skuStructGroupName")
   public void setSkuStructGroupName(String skuStructGroupName) {
      this.skuStructGroupName = skuStructGroupName;
   }

   @JsonProperty("skuStructGroupName")
   public String getSkuStructGroupName() {
      return this.skuStructGroupName;
   }

   @JsonProperty("skuStructAttrId")
   public void setSkuStructAttrId(Integer skuStructAttrId) {
      this.skuStructAttrId = skuStructAttrId;
   }

   @JsonProperty("skuStructAttrId")
   public Integer getSkuStructAttrId() {
      return this.skuStructAttrId;
   }

   @JsonProperty("skuStructAttrValueId")
   public void setSkuStructAttrValueId(Integer skuStructAttrValueId) {
      this.skuStructAttrValueId = skuStructAttrValueId;
   }

   @JsonProperty("skuStructAttrValueId")
   public Integer getSkuStructAttrValueId() {
      return this.skuStructAttrValueId;
   }

   @JsonProperty("skuStructGroupId")
   public void setSkuStructGroupId(Integer skuStructGroupId) {
      this.skuStructGroupId = skuStructGroupId;
   }

   @JsonProperty("skuStructGroupId")
   public Integer getSkuStructGroupId() {
      return this.skuStructGroupId;
   }

   @JsonProperty("skuStructValues")
   public void setSkuStructValues(List<PropValueReq> skuStructValues) {
      this.skuStructValues = skuStructValues;
   }

   @JsonProperty("skuStructValues")
   public List<PropValueReq> getSkuStructValues() {
      return this.skuStructValues;
   }

   @JsonProperty("skuStructInputType")
   public void setSkuStructInputType(Integer skuStructInputType) {
      this.skuStructInputType = skuStructInputType;
   }

   @JsonProperty("skuStructInputType")
   public Integer getSkuStructInputType() {
      return this.skuStructInputType;
   }

   @JsonProperty("skuStructAttrValue")
   public void setSkuStructAttrValue(String skuStructAttrValue) {
      this.skuStructAttrValue = skuStructAttrValue;
   }

   @JsonProperty("skuStructAttrValue")
   public String getSkuStructAttrValue() {
      return this.skuStructAttrValue;
   }

   @JsonProperty("skuStructAttrName")
   public void setSkuStructAttrName(String skuStructAttrName) {
      this.skuStructAttrName = skuStructAttrName;
   }

   @JsonProperty("skuStructAttrName")
   public String getSkuStructAttrName() {
      return this.skuStructAttrName;
   }
}
