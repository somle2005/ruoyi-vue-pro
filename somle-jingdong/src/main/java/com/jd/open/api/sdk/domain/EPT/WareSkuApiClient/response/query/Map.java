package com.jd.open.api.sdk.domain.EPT.WareSkuApiClient.response.query;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class Map implements Serializable {
   private List<WareSku> skuMapList;

   @JsonProperty("skuMapList")
   public void setSkuMapList(List<WareSku> skuMapList) {
      this.skuMapList = skuMapList;
   }

   @JsonProperty("skuMapList")
   public List<WareSku> getSkuMapList() {
      return this.skuMapList;
   }
}
