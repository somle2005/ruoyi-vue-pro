package com.jd.open.api.sdk.response.ware;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.response.AbstractResponse;

public class EccSkuSearchResponse extends AbstractResponse {
   private ItemSkuListResult itemSkuResultList;

   @JsonProperty("item_sku_result_list")
   public void setItemSkuResultList(ItemSkuListResult itemSkuResultList) {
      this.itemSkuResultList = itemSkuResultList;
   }

   @JsonProperty("item_sku_result_list")
   public ItemSkuListResult getItemSkuResultList() {
      return this.itemSkuResultList;
   }
}
