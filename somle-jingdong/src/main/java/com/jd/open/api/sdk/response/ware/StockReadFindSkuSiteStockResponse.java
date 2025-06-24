package com.jd.open.api.sdk.response.ware;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ware.StockReadService.response.findSkuSiteStock.SkuSiteStock;
import com.jd.open.api.sdk.response.AbstractResponse;

public class StockReadFindSkuSiteStockResponse extends AbstractResponse {
   private SkuSiteStock appParams;

   @JsonProperty("app_params")
   public void setAppParams(SkuSiteStock appParams) {
      this.appParams = appParams;
   }

   @JsonProperty("app_params")
   public SkuSiteStock getAppParams() {
      return this.appParams;
   }
}
