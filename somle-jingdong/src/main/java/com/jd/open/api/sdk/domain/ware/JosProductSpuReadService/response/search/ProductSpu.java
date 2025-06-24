package com.jd.open.api.sdk.domain.ware.JosProductSpuReadService.response.search;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Set;

public class ProductSpu implements Serializable {
   private Long spuId;
   private String spuName;
   private Set<Feature> features;
   private String uniqueCode;

   @JsonProperty("spuId")
   public void setSpuId(Long spuId) {
      this.spuId = spuId;
   }

   @JsonProperty("spuId")
   public Long getSpuId() {
      return this.spuId;
   }

   @JsonProperty("spuName")
   public void setSpuName(String spuName) {
      this.spuName = spuName;
   }

   @JsonProperty("spuName")
   public String getSpuName() {
      return this.spuName;
   }

   @JsonProperty("features")
   public void setFeatures(Set<Feature> features) {
      this.features = features;
   }

   @JsonProperty("features")
   public Set<Feature> getFeatures() {
      return this.features;
   }

   @JsonProperty("uniqueCode")
   public void setUniqueCode(String uniqueCode) {
      this.uniqueCode = uniqueCode;
   }

   @JsonProperty("uniqueCode")
   public String getUniqueCode() {
      return this.uniqueCode;
   }
}
