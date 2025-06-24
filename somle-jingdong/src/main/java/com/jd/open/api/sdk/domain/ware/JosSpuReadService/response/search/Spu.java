package com.jd.open.api.sdk.domain.ware.JosSpuReadService.response.search;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Set;

public class Spu implements Serializable {
   private Long spuId;
   private Long cspuId;
   private String cspuName;
   private String saleAttr;
   private Set<Feature> features;

   @JsonProperty("spuId")
   public void setSpuId(Long spuId) {
      this.spuId = spuId;
   }

   @JsonProperty("spuId")
   public Long getSpuId() {
      return this.spuId;
   }

   @JsonProperty("cspuId")
   public void setCspuId(Long cspuId) {
      this.cspuId = cspuId;
   }

   @JsonProperty("cspuId")
   public Long getCspuId() {
      return this.cspuId;
   }

   @JsonProperty("cspuName")
   public void setCspuName(String cspuName) {
      this.cspuName = cspuName;
   }

   @JsonProperty("cspuName")
   public String getCspuName() {
      return this.cspuName;
   }

   @JsonProperty("saleAttr")
   public void setSaleAttr(String saleAttr) {
      this.saleAttr = saleAttr;
   }

   @JsonProperty("saleAttr")
   public String getSaleAttr() {
      return this.saleAttr;
   }

   @JsonProperty("features")
   public void setFeatures(Set<Feature> features) {
      this.features = features;
   }

   @JsonProperty("features")
   public Set<Feature> getFeatures() {
      return this.features;
   }
}
