package com.jd.open.api.sdk.response.supplier;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.supplier.DpsStockInterface.response.modifyStockInfo.DropshipResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class DropshipDpsModifyStockInfoResponse extends AbstractResponse {
   private DropshipResult modifyStockResult;

   @JsonProperty("modifyStockResult")
   public void setModifyStockResult(DropshipResult modifyStockResult) {
      this.modifyStockResult = modifyStockResult;
   }

   @JsonProperty("modifyStockResult")
   public DropshipResult getModifyStockResult() {
      return this.modifyStockResult;
   }
}
