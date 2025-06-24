package com.jd.open.api.sdk.domain.list.CategoryAttrReadService.response.findAttrByIdJos;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class FeatureCateAttrValueJos implements Serializable {
   private String attrValueFeatureCn;
   private String attrValueFeatureKey;
   private String attrValueFeatureValue;

   @JsonProperty("attrValueFeatureCn")
   public void setAttrValueFeatureCn(String attrValueFeatureCn) {
      this.attrValueFeatureCn = attrValueFeatureCn;
   }

   @JsonProperty("attrValueFeatureCn")
   public String getAttrValueFeatureCn() {
      return this.attrValueFeatureCn;
   }

   @JsonProperty("attrValueFeatureKey")
   public void setAttrValueFeatureKey(String attrValueFeatureKey) {
      this.attrValueFeatureKey = attrValueFeatureKey;
   }

   @JsonProperty("attrValueFeatureKey")
   public String getAttrValueFeatureKey() {
      return this.attrValueFeatureKey;
   }

   @JsonProperty("attrValueFeatureValue")
   public void setAttrValueFeatureValue(String attrValueFeatureValue) {
      this.attrValueFeatureValue = attrValueFeatureValue;
   }

   @JsonProperty("attrValueFeatureValue")
   public String getAttrValueFeatureValue() {
      return this.attrValueFeatureValue;
   }
}
