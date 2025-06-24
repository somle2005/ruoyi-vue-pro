package com.jd.open.api.sdk.domain.spgl.ProductReadRpcService.response.queryProductInfoByPage;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class TargetTag implements Serializable {
   private String tagType;
   private String tagValue;
   private String targetType;

   @JsonProperty("tagType")
   public void setTagType(String tagType) {
      this.tagType = tagType;
   }

   @JsonProperty("tagType")
   public String getTagType() {
      return this.tagType;
   }

   @JsonProperty("tagValue")
   public void setTagValue(String tagValue) {
      this.tagValue = tagValue;
   }

   @JsonProperty("tagValue")
   public String getTagValue() {
      return this.tagValue;
   }

   @JsonProperty("targetType")
   public void setTargetType(String targetType) {
      this.targetType = targetType;
   }

   @JsonProperty("targetType")
   public String getTargetType() {
      return this.targetType;
   }
}
