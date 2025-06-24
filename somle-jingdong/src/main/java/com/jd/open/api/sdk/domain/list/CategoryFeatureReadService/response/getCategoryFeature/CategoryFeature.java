package com.jd.open.api.sdk.domain.list.CategoryFeatureReadService.response.getCategoryFeature;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Map;

public class CategoryFeature implements Serializable {
   private Integer categoryId;
   private Map<String, String> features;

   @JsonProperty("categoryId")
   public void setCategoryId(Integer categoryId) {
      this.categoryId = categoryId;
   }

   @JsonProperty("categoryId")
   public Integer getCategoryId() {
      return this.categoryId;
   }

   @JsonProperty("features")
   public void setFeatures(Map<String, String> features) {
      this.features = features;
   }

   @JsonProperty("features")
   public Map<String, String> getFeatures() {
      return this.features;
   }
}
