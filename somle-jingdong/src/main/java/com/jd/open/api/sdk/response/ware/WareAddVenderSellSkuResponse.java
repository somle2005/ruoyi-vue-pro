package com.jd.open.api.sdk.response.ware;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.request.ware.WareAddVenderSellSkuRequest;
import com.jd.open.api.sdk.response.AbstractResponse;

public class WareAddVenderSellSkuResponse extends AbstractResponse {
   public WareAddVenderSellSkuRequest wareAddVenderSellSkuRequest;

   public WareAddVenderSellSkuResponse() {
   }

   public WareAddVenderSellSkuResponse(WareAddVenderSellSkuRequest wareAddVenderSellSkuRequest) {
      this.wareAddVenderSellSkuRequest = wareAddVenderSellSkuRequest;
   }

   @JsonProperty("wareaddvender_sellsku")
   public WareAddVenderSellSkuRequest getWareAddVenderSellSkuRequest() {
      return this.wareAddVenderSellSkuRequest;
   }

   @JsonProperty("wareaddvender_sellsku")
   public void setWareAddVenderSellSkuRequest(WareAddVenderSellSkuRequest wareAddVenderSellSkuRequest) {
      this.wareAddVenderSellSkuRequest = wareAddVenderSellSkuRequest;
   }
}
