package com.jd.open.api.sdk.response.c2mdzkfpt;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.c2mdzkfpt.SaveSkuStockOpenService.response.updateSkuStockInfo.StockSaveResultEntity;
import com.jd.open.api.sdk.response.AbstractResponse;

public class YipProductionUpdateSkuStockInfoResponse extends AbstractResponse {
   private StockSaveResultEntity returnType;

   @JsonProperty("returnType")
   public void setReturnType(StockSaveResultEntity returnType) {
      this.returnType = returnType;
   }

   @JsonProperty("returnType")
   public StockSaveResultEntity getReturnType() {
      return this.returnType;
   }
}
