package com.jd.open.api.sdk.domain.iopsp.QueryGoodsOpenProvider.response.getSkuStateListForSku;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class GetSkuStateGoodsResp implements Serializable {
   private int skuState;
   private long skuId;

   @JsonProperty("skuState")
   public void setSkuState(int skuState) {
      this.skuState = skuState;
   }

   @JsonProperty("skuState")
   public int getSkuState() {
      return this.skuState;
   }

   @JsonProperty("skuId")
   public void setSkuId(long skuId) {
      this.skuId = skuId;
   }

   @JsonProperty("skuId")
   public long getSkuId() {
      return this.skuId;
   }
}
