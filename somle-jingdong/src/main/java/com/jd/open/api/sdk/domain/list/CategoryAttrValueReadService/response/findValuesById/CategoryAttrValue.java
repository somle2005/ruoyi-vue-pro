package com.jd.open.api.sdk.domain.list.CategoryAttrValueReadService.response.findValuesById;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Set;

public class CategoryAttrValue implements Serializable {
   private Long attributeId;
   private Long categoryId;
   private Set<Feature> features;
   private Long id;
   private Integer indexId;
   private String value;

   @JsonProperty("attributeId")
   public void setAttributeId(Long attributeId) {
      this.attributeId = attributeId;
   }

   @JsonProperty("attributeId")
   public Long getAttributeId() {
      return this.attributeId;
   }

   @JsonProperty("categoryId")
   public void setCategoryId(Long categoryId) {
      this.categoryId = categoryId;
   }

   @JsonProperty("categoryId")
   public Long getCategoryId() {
      return this.categoryId;
   }

   @JsonProperty("features")
   public void setFeatures(Set<Feature> features) {
      this.features = features;
   }

   @JsonProperty("features")
   public Set<Feature> getFeatures() {
      return this.features;
   }

   @JsonProperty("id")
   public void setId(Long id) {
      this.id = id;
   }

   @JsonProperty("id")
   public Long getId() {
      return this.id;
   }

   @JsonProperty("indexId")
   public void setIndexId(Integer indexId) {
      this.indexId = indexId;
   }

   @JsonProperty("indexId")
   public Integer getIndexId() {
      return this.indexId;
   }

   @JsonProperty("value")
   public void setValue(String value) {
      this.value = value;
   }

   @JsonProperty("value")
   public String getValue() {
      return this.value;
   }
}
