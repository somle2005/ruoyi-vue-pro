package com.jd.open.api.sdk.domain.ware.ReserveProductJosService.request.query;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class QueryReserveProductParam implements Serializable {
   private Integer[] storeId;
   private Long[] skuId;

   @JsonProperty("storeId")
   public void setStoreId(Integer[] storeId) {
      this.storeId = storeId;
   }

   @JsonProperty("storeId")
   public Integer[] getStoreId() {
      return this.storeId;
   }

   @JsonProperty("skuId")
   public void setSkuId(Long[] skuId) {
      this.skuId = skuId;
   }

   @JsonProperty("skuId")
   public Long[] getSkuId() {
      return this.skuId;
   }
}
