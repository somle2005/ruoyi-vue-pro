package com.jd.open.api.sdk.response.ware;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.response.AbstractResponse;

public class EccItemAddResponse extends AbstractResponse {
   private ItemProxyResult itemProxyResult;

   @JsonProperty("item_proxy_result")
   public void setItemProxyResult(ItemProxyResult itemProxyResult) {
      this.itemProxyResult = itemProxyResult;
   }

   @JsonProperty("item_proxy_result")
   public ItemProxyResult getItemProxyResult() {
      return this.itemProxyResult;
   }
}
