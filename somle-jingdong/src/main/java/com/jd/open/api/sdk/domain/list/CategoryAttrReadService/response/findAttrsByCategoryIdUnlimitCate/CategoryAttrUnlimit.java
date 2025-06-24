package com.jd.open.api.sdk.domain.list.CategoryAttrReadService.response.findAttrsByCategoryIdUnlimitCate;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

public class CategoryAttrUnlimit implements Serializable {
   private Long id;
   private String name;
   private Long catId;
   private Integer orderSort;
   private Integer attributeType;
   private Integer inputType;
   private String graphic;
   private boolean isRequired;
   private Set<Feature> features;
   private List<CategoryAttrValueUnlimit> attrValueList;
   private CategoryAttrGroupUnlimit attrGroup;
   private Long originCategoryId;

   @JsonProperty("id")
   public void setId(Long id) {
      this.id = id;
   }

   @JsonProperty("id")
   public Long getId() {
      return this.id;
   }

   @JsonProperty("name")
   public void setName(String name) {
      this.name = name;
   }

   @JsonProperty("name")
   public String getName() {
      return this.name;
   }

   @JsonProperty("catId")
   public void setCatId(Long catId) {
      this.catId = catId;
   }

   @JsonProperty("catId")
   public Long getCatId() {
      return this.catId;
   }

   @JsonProperty("orderSort")
   public void setOrderSort(Integer orderSort) {
      this.orderSort = orderSort;
   }

   @JsonProperty("orderSort")
   public Integer getOrderSort() {
      return this.orderSort;
   }

   @JsonProperty("attributeType")
   public void setAttributeType(Integer attributeType) {
      this.attributeType = attributeType;
   }

   @JsonProperty("attributeType")
   public Integer getAttributeType() {
      return this.attributeType;
   }

   @JsonProperty("inputType")
   public void setInputType(Integer inputType) {
      this.inputType = inputType;
   }

   @JsonProperty("inputType")
   public Integer getInputType() {
      return this.inputType;
   }

   @JsonProperty("graphic")
   public void setGraphic(String graphic) {
      this.graphic = graphic;
   }

   @JsonProperty("graphic")
   public String getGraphic() {
      return this.graphic;
   }

   @JsonProperty("isRequired")
   public void setIsRequired(boolean isRequired) {
      this.isRequired = isRequired;
   }

   @JsonProperty("isRequired")
   public boolean getIsRequired() {
      return this.isRequired;
   }

   @JsonProperty("features")
   public void setFeatures(Set<Feature> features) {
      this.features = features;
   }

   @JsonProperty("features")
   public Set<Feature> getFeatures() {
      return this.features;
   }

   @JsonProperty("attrValueList")
   public void setAttrValueList(List<CategoryAttrValueUnlimit> attrValueList) {
      this.attrValueList = attrValueList;
   }

   @JsonProperty("attrValueList")
   public List<CategoryAttrValueUnlimit> getAttrValueList() {
      return this.attrValueList;
   }

   @JsonProperty("attrGroup")
   public void setAttrGroup(CategoryAttrGroupUnlimit attrGroup) {
      this.attrGroup = attrGroup;
   }

   @JsonProperty("attrGroup")
   public CategoryAttrGroupUnlimit getAttrGroup() {
      return this.attrGroup;
   }

   @JsonProperty("originCategoryId")
   public void setOriginCategoryId(Long originCategoryId) {
      this.originCategoryId = originCategoryId;
   }

   @JsonProperty("originCategoryId")
   public Long getOriginCategoryId() {
      return this.originCategoryId;
   }
}
