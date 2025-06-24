package com.jd.open.api.sdk.domain.list.CategoryAttrReadService.response.findAttrByIdJos;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

public class CategoryAttrJos implements Serializable {
   private Long categoryAttrId;
   private Long categoryId;
   private String attName;
   private Integer attrIndexId;
   private Integer inputType;
   private Integer attributeType;
   private Set<FeatureCateAttrJos> attrFeatures;
   private CategoryAttrGroupJos categoryAttrGroup;
   private List<CategoryAttrValueJos> attrValueList;

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
   public void setAttrFeatures(Set<FeatureCateAttrJos> attrFeatures) {
      this.attrFeatures = attrFeatures;
   }

   @JsonProperty("attrFeatures")
   public Set<FeatureCateAttrJos> getAttrFeatures() {
      return this.attrFeatures;
   }

   @JsonProperty("categoryAttrGroup")
   public void setCategoryAttrGroup(CategoryAttrGroupJos categoryAttrGroup) {
      this.categoryAttrGroup = categoryAttrGroup;
   }

   @JsonProperty("categoryAttrGroup")
   public CategoryAttrGroupJos getCategoryAttrGroup() {
      return this.categoryAttrGroup;
   }

   @JsonProperty("attrValueList")
   public void setAttrValueList(List<CategoryAttrValueJos> attrValueList) {
      this.attrValueList = attrValueList;
   }

   @JsonProperty("attrValueList")
   public List<CategoryAttrValueJos> getAttrValueList() {
      return this.attrValueList;
   }
}
