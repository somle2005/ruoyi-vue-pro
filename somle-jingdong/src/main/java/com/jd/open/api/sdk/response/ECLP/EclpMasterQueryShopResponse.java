package com.jd.open.api.sdk.response.ECLP;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.queryShop.ShopOut;
import com.jd.open.api.sdk.response.AbstractResponse;
import java.util.List;

public class EclpMasterQueryShopResponse extends AbstractResponse {
   private List<ShopOut> queryshopResult;

   @JsonProperty("queryshop_result")
   public void setQueryshopResult(List<ShopOut> queryshopResult) {
      this.queryshopResult = queryshopResult;
   }

   @JsonProperty("queryshop_result")
   public List<ShopOut> getQueryshopResult() {
      return this.queryshopResult;
   }
}
