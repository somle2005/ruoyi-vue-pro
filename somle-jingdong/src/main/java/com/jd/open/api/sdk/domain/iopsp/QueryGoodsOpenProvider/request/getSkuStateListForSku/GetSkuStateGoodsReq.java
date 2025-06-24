package com.jd.open.api.sdk.domain.iopsp.QueryGoodsOpenProvider.request.getSkuStateListForSku;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class GetSkuStateGoodsReq implements Serializable {
   private List<Long> skuIdList;

   @JsonProperty("skuIdList")
   public void setSkuIdList(List<Long> skuIdList) {
      this.skuIdList = skuIdList;
   }

   @JsonProperty("skuIdList")
   public List<Long> getSkuIdList() {
      return this.skuIdList;
   }
}
