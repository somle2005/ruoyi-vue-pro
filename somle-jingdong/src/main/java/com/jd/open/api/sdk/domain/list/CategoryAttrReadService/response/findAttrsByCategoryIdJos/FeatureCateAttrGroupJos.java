package com.jd.open.api.sdk.domain.list.CategoryAttrReadService.response.findAttrsByCategoryIdJos;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class FeatureCateAttrGroupJos implements Serializable {
   private String attrGroupFeatureCn;
   private String attrGroupFeatureKey;
   private String attrGroupFeatureValue;

   @JsonProperty("attrGroupFeatureCn")
   public void setAttrGroupFeatureCn(String attrGroupFeatureCn) {
      this.attrGroupFeatureCn = attrGroupFeatureCn;
   }

   @JsonProperty("attrGroupFeatureCn")
   public String getAttrGroupFeatureCn() {
      return this.attrGroupFeatureCn;
   }

   @JsonProperty("attrGroupFeatureKey")
   public void setAttrGroupFeatureKey(String attrGroupFeatureKey) {
      this.attrGroupFeatureKey = attrGroupFeatureKey;
   }

   @JsonProperty("attrGroupFeatureKey")
   public String getAttrGroupFeatureKey() {
      return this.attrGroupFeatureKey;
   }

   @JsonProperty("attrGroupFeatureValue")
   public void setAttrGroupFeatureValue(String attrGroupFeatureValue) {
      this.attrGroupFeatureValue = attrGroupFeatureValue;
   }

   @JsonProperty("attrGroupFeatureValue")
   public String getAttrGroupFeatureValue() {
      return this.attrGroupFeatureValue;
   }
}
