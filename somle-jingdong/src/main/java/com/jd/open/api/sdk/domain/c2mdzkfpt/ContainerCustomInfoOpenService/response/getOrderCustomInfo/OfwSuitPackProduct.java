package com.jd.open.api.sdk.domain.c2mdzkfpt.ContainerCustomInfoOpenService.response.getOrderCustomInfo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class OfwSuitPackProduct implements Serializable {
   private String skuId;
   private Integer skuCount;
   private Integer suitSkuType;

   @JsonProperty("skuId")
   public void setSkuId(String skuId) {
      this.skuId = skuId;
   }

   @JsonProperty("skuId")
   public String getSkuId() {
      return this.skuId;
   }

   @JsonProperty("skuCount")
   public void setSkuCount(Integer skuCount) {
      this.skuCount = skuCount;
   }

   @JsonProperty("skuCount")
   public Integer getSkuCount() {
      return this.skuCount;
   }

   @JsonProperty("suitSkuType")
   public void setSuitSkuType(Integer suitSkuType) {
      this.suitSkuType = suitSkuType;
   }

   @JsonProperty("suitSkuType")
   public Integer getSuitSkuType() {
      return this.suitSkuType;
   }
}
