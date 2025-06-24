package com.jd.open.api.sdk.response.ware;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.request.ware.WareUpdateVenderSellSkuRequest;
import com.jd.open.api.sdk.response.AbstractResponse;

public class WareUpdateVenderSellSkuResponse extends AbstractResponse {
   public WareUpdateVenderSellSkuRequest wareupdateVenderSellSkuRequest;

   public WareUpdateVenderSellSkuResponse() {
   }

   public WareUpdateVenderSellSkuResponse(WareUpdateVenderSellSkuRequest wareupdateVenderSellSkuRequest) {
      this.wareupdateVenderSellSkuRequest = wareupdateVenderSellSkuRequest;
   }

   @JsonProperty("wareupdatevender_sellsku")
   public WareUpdateVenderSellSkuRequest getWareupdateVenderSellSkuRequest() {
      return this.wareupdateVenderSellSkuRequest;
   }

   @JsonProperty("wareupdatevender_sellsku")
   public void setWareupdateVenderSellSkuRequest(WareUpdateVenderSellSkuRequest wareupdateVenderSellSkuRequest) {
      this.wareupdateVenderSellSkuRequest = wareupdateVenderSellSkuRequest;
   }
}
