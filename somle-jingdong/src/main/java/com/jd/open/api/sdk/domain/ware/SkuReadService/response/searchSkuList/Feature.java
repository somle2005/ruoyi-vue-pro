package com.jd.open.api.sdk.domain.ware.SkuReadService.response.searchSkuList;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class Feature implements Serializable {
   private String featureCn;
   private String featureKey;
   private String featureValue;

   @JsonProperty("featureCn")
   public void setFeatureCn(String featureCn) {
      this.featureCn = featureCn;
   }

   @JsonProperty("featureCn")
   public String getFeatureCn() {
      return this.featureCn;
   }

   @JsonProperty("featureKey")
   public void setFeatureKey(String featureKey) {
      this.featureKey = featureKey;
   }

   @JsonProperty("featureKey")
   public String getFeatureKey() {
      return this.featureKey;
   }

   @JsonProperty("featureValue")
   public void setFeatureValue(String featureValue) {
      this.featureValue = featureValue;
   }

   @JsonProperty("featureValue")
   public String getFeatureValue() {
      return this.featureValue;
   }
}
