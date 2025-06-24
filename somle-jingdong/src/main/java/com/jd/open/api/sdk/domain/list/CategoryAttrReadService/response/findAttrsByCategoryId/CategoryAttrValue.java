package com.jd.open.api.sdk.domain.list.CategoryAttrReadService.response.findAttrsByCategoryId;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Set;

public class CategoryAttrValue implements Serializable {
   private Long attrValueId;
   private Integer attrValueIndexId;
   private String attrValue;
   private Set<Feature> attrValueFeatures;

   @JsonProperty("attrValueId")
   public void setAttrValueId(Long attrValueId) {
      this.attrValueId = attrValueId;
   }

   @JsonProperty("attrValueId")
   public Long getAttrValueId() {
      return this.attrValueId;
   }

   @JsonProperty("attrValueIndexId")
   public void setAttrValueIndexId(Integer attrValueIndexId) {
      this.attrValueIndexId = attrValueIndexId;
   }

   @JsonProperty("attrValueIndexId")
   public Integer getAttrValueIndexId() {
      return this.attrValueIndexId;
   }

   @JsonProperty("attrValue")
   public void setAttrValue(String attrValue) {
      this.attrValue = attrValue;
   }

   @JsonProperty("attrValue")
   public String getAttrValue() {
      return this.attrValue;
   }

   @JsonProperty("attrValueFeatures")
   public void setAttrValueFeatures(Set<Feature> attrValueFeatures) {
      this.attrValueFeatures = attrValueFeatures;
   }

   @JsonProperty("attrValueFeatures")
   public Set<Feature> getAttrValueFeatures() {
      return this.attrValueFeatures;
   }
}
