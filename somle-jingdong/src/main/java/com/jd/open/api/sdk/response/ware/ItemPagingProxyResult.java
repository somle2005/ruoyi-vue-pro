package com.jd.open.api.sdk.response.ware;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class ItemPagingProxyResult implements Serializable {
   private List<ItemProxyResult> itemProxyResults;
   private int totalSize;

   @JsonProperty("item_proxy_results")
   public void setItemProxyResults(List<ItemProxyResult> itemProxyResults) {
      this.itemProxyResults = itemProxyResults;
   }

   @JsonProperty("item_proxy_results")
   public List<ItemProxyResult> getItemProxyResults() {
      return this.itemProxyResults;
   }

   @JsonProperty("total_size")
   public void setTotalSize(int totalSize) {
      this.totalSize = totalSize;
   }

   @JsonProperty("total_size")
   public int getTotalSize() {
      return this.totalSize;
   }
}
