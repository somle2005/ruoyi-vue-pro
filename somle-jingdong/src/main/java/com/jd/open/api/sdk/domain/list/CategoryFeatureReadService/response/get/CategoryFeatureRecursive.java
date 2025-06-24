package com.jd.open.api.sdk.domain.list.CategoryFeatureReadService.response.get;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class CategoryFeatureRecursive implements Serializable {
   private String featureValue;
   private Integer realCategoryClass;
   private String featureKey;
   private Integer realCategoryId;

   @JsonProperty("featureValue")
   public void setFeatureValue(String featureValue) {
      this.featureValue = featureValue;
   }

   @JsonProperty("featureValue")
   public String getFeatureValue() {
      return this.featureValue;
   }

   @JsonProperty("realCategoryClass")
   public void setRealCategoryClass(Integer realCategoryClass) {
      this.realCategoryClass = realCategoryClass;
   }

   @JsonProperty("realCategoryClass")
   public Integer getRealCategoryClass() {
      return this.realCategoryClass;
   }

   @JsonProperty("featureKey")
   public void setFeatureKey(String featureKey) {
      this.featureKey = featureKey;
   }

   @JsonProperty("featureKey")
   public String getFeatureKey() {
      return this.featureKey;
   }

   @JsonProperty("realCategoryId")
   public void setRealCategoryId(Integer realCategoryId) {
      this.realCategoryId = realCategoryId;
   }

   @JsonProperty("realCategoryId")
   public Integer getRealCategoryId() {
      return this.realCategoryId;
   }
}
