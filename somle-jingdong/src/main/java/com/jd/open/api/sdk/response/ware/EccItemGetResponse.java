package com.jd.open.api.sdk.response.ware;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.response.AbstractResponse;

public class EccItemGetResponse extends AbstractResponse {
   private ItemProxyResult ItemProxyResult;

   @JsonProperty("item_proxy_result")
   public void setItemProxyResult(ItemProxyResult ItemProxyResult) {
      this.ItemProxyResult = ItemProxyResult;
   }

   @JsonProperty("item_proxy_result")
   public ItemProxyResult getItemProxyResult() {
      return this.ItemProxyResult;
   }
}
