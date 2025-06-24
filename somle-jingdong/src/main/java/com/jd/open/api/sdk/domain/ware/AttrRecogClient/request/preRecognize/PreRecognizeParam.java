package com.jd.open.api.sdk.domain.ware.AttrRecogClient.request.preRecognize;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Set;

public class PreRecognizeParam implements Serializable {
   private String lastCateId;
   private String requestId;
   private String spuId;
   private Set<String> skuIds;

   @JsonProperty("lastCateId")
   public void setLastCateId(String lastCateId) {
      this.lastCateId = lastCateId;
   }

   @JsonProperty("lastCateId")
   public String getLastCateId() {
      return this.lastCateId;
   }

   @JsonProperty("requestId")
   public void setRequestId(String requestId) {
      this.requestId = requestId;
   }

   @JsonProperty("requestId")
   public String getRequestId() {
      return this.requestId;
   }

   @JsonProperty("spuId")
   public void setSpuId(String spuId) {
      this.spuId = spuId;
   }

   @JsonProperty("spuId")
   public String getSpuId() {
      return this.spuId;
   }

   @JsonProperty("skuIds")
   public void setSkuIds(Set<String> skuIds) {
      this.skuIds = skuIds;
   }

   @JsonProperty("skuIds")
   public Set<String> getSkuIds() {
      return this.skuIds;
   }
}
