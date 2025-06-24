package com.jd.open.api.sdk.domain.list.CategoryAttrReadService.response.findAttrsByCategoryId;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

public class CategoryAttr implements Serializable {
   private Long categoryAttrId;
   private Long categoryId;
   private String attName;
   private Integer attrIndexId;
   private Integer inputType;
   private Integer attributeType;
   private Set<Feature> attrFeatures;
   private CategoryAttrGroup categoryAttrGroup;
   private List<CategoryAttrValue> attrValueList;

   @JsonProperty("categoryAttrId")
   public void setCategoryAttrId(Long categoryAttrId) {
      this.categoryAttrId = categoryAttrId;
   }

   @JsonProperty("categoryAttrId")
   public Long getCategoryAttrId() {
      return this.categoryAttrId;
   }

   @JsonProperty("categoryId")
   public void setCategoryId(Long categoryId) {
      this.categoryId = categoryId;
   }

   @JsonProperty("categoryId")
   public Long getCategoryId() {
      return this.categoryId;
   }

   @JsonProperty("attName")
   public void setAttName(String attName) {
      this.attName = attName;
   }

   @JsonProperty("attName")
   public String getAttName() {
      return this.attName;
   }

   @JsonProperty("attrIndexId")
   public void setAttrIndexId(Integer attrIndexId) {
      this.attrIndexId = attrIndexId;
   }

   @JsonProperty("attrIndexId")
   public Integer getAttrIndexId() {
      return this.attrIndexId;
   }

   @JsonProperty("inputType")
   public void setInputType(Integer inputType) {
      this.inputType = inputType;
   }

   @JsonProperty("inputType")
   public Integer getInputType() {
      return this.inputType;
   }

   @JsonProperty("attributeType")
   public void setAttributeType(Integer attributeType) {
      this.attributeType = attributeType;
   }

   @JsonProperty("attributeType")
   public Integer getAttributeType() {
      return this.attributeType;
   }

   @JsonProperty("attrFeatures")
   public void setAttrFeatures(Set<Feature> attrFeatures) {
      this.attrFeatures = attrFeatures;
   }

   @JsonProperty("attrFeatures")
   public Set<Feature> getAttrFeatures() {
      return this.attrFeatures;
   }

   @JsonProperty("categoryAttrGroup")
   public void setCategoryAttrGroup(CategoryAttrGroup categoryAttrGroup) {
      this.categoryAttrGroup = categoryAttrGroup;
   }

   @JsonProperty("categoryAttrGroup")
   public CategoryAttrGroup getCategoryAttrGroup() {
      return this.categoryAttrGroup;
   }

   @JsonProperty("attrValueList")
   public void setAttrValueList(List<CategoryAttrValue> attrValueList) {
      this.attrValueList = attrValueList;
   }

   @JsonProperty("attrValueList")
   public List<CategoryAttrValue> getAttrValueList() {
      return this.attrValueList;
   }
}
