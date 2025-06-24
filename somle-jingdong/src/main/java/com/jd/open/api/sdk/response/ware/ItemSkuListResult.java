package com.jd.open.api.sdk.response.ware;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class ItemSkuListResult implements Serializable {
   private List<ItemSkuResult> itemSkuResult;
   private int total;

   @JsonProperty("item_sku_result")
   public void setItemSkuResult(List<ItemSkuResult> itemSkuResult) {
      this.itemSkuResult = itemSkuResult;
   }

   @JsonProperty("item_sku_result")
   public List<ItemSkuResult> getItemSkuResult() {
      return this.itemSkuResult;
   }

   @JsonProperty("total")
   public void setTotal(int total) {
      this.total = total;
   }

   @JsonProperty("total")
   public int getTotal() {
      return this.total;
   }
}
