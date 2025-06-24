package com.jd.open.api.sdk.domain.ware.KeeperWarePreDetectService.request.preDetect;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

public class WarePreDetectRequest$Sku implements Serializable {
   private String skuId;
   private String color;
   private String size;
   private Set<String> images;
   private List<Arrays> skuAttrs;
   private List<Arrays> skuMarketings;

   @JsonProperty("skuId")
   public void setSkuId(String skuId) {
      this.skuId = skuId;
   }

   @JsonProperty("skuId")
   public String getSkuId() {
      return this.skuId;
   }

   @JsonProperty("color")
   public void setColor(String color) {
      this.color = color;
   }

   @JsonProperty("color")
   public String getColor() {
      return this.color;
   }

   @JsonProperty("size")
   public void setSize(String size) {
      this.size = size;
   }

   @JsonProperty("size")
   public String getSize() {
      return this.size;
   }

   @JsonProperty("images")
   public void setImages(Set<String> images) {
      this.images = images;
   }

   @JsonProperty("images")
   public Set<String> getImages() {
      return this.images;
   }

   @JsonProperty("skuAttrs")
   public void setSkuAttrs(List<Arrays> skuAttrs) {
      this.skuAttrs = skuAttrs;
   }

   @JsonProperty("skuAttrs")
   public List<Arrays> getSkuAttrs() {
      return this.skuAttrs;
   }

   @JsonProperty("skuMarketings")
   public void setSkuMarketings(List<Arrays> skuMarketings) {
      this.skuMarketings = skuMarketings;
   }

   @JsonProperty("skuMarketings")
   public List<Arrays> getSkuMarketings() {
      return this.skuMarketings;
   }
}
