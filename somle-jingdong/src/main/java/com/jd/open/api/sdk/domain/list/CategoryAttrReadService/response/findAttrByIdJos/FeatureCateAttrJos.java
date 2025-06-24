package com.jd.open.api.sdk.domain.list.CategoryAttrReadService.response.findAttrByIdJos;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class FeatureCateAttrJos implements Serializable {
   private String attrFeatureCn;
   private String attrFeatureKey;
   private String attrFeatureValue;

   @JsonProperty("attrFeatureCn")
   public void setAttrFeatureCn(String attrFeatureCn) {
      this.attrFeatureCn = attrFeatureCn;
   }

   @JsonProperty("attrFeatureCn")
   public String getAttrFeatureCn() {
      return this.attrFeatureCn;
   }

   @JsonProperty("attrFeatureKey")
   public void setAttrFeatureKey(String attrFeatureKey) {
      this.attrFeatureKey = attrFeatureKey;
   }

   @JsonProperty("attrFeatureKey")
   public String getAttrFeatureKey() {
      return this.attrFeatureKey;
   }

   @JsonProperty("attrFeatureValue")
   public void setAttrFeatureValue(String attrFeatureValue) {
      this.attrFeatureValue = attrFeatureValue;
   }

   @JsonProperty("attrFeatureValue")
   public String getAttrFeatureValue() {
      return this.attrFeatureValue;
   }
}
