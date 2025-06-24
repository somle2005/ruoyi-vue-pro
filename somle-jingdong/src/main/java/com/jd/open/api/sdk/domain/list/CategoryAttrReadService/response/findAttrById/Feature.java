package com.jd.open.api.sdk.domain.list.CategoryAttrReadService.response.findAttrById;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class Feature implements Serializable {
   private String attrFeatureCn;
   private String attrFeatureKey;
   private String attrFeatureValue;
   private String attrGroupFeatureCn;
   private String attrGroupFeatureKey;
   private String attrGroupFeatureValue;
   private String attrValueFeatureCn;
   private String attrValueFeatureKey;
   private String attrValueFeatureValue;

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
