package com.jd.open.api.sdk.domain.ware.AttrRecogClient.response.preRecognize;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class RecogInfo implements Serializable {
   private List<RecogAttrInfo> spuAttrInfos;
   private Map<String, List> skuAttrInfos;

   @JsonProperty("spuAttrInfos")
   public void setSpuAttrInfos(List<RecogAttrInfo> spuAttrInfos) {
      this.spuAttrInfos = spuAttrInfos;
   }

   @JsonProperty("spuAttrInfos")
   public List<RecogAttrInfo> getSpuAttrInfos() {
      return this.spuAttrInfos;
   }

   @JsonProperty("skuAttrInfos")
   public void setSkuAttrInfos(Map<String, List> skuAttrInfos) {
      this.skuAttrInfos = skuAttrInfos;
   }

   @JsonProperty("skuAttrInfos")
   public Map<String, List> getSkuAttrInfos() {
      return this.skuAttrInfos;
   }
}
