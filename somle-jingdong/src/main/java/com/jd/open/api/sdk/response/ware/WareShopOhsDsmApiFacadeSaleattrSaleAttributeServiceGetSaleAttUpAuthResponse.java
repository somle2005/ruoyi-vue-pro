package com.jd.open.api.sdk.response.ware;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ware.SaleAttributeService.response.getSaleAttUpAuth.DsmResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class WareShopOhsDsmApiFacadeSaleattrSaleAttributeServiceGetSaleAttUpAuthResponse extends AbstractResponse {
   private DsmResult dsmResult;

   @JsonProperty("dsmResult")
   public void setDsmResult(DsmResult dsmResult) {
      this.dsmResult = dsmResult;
   }

   @JsonProperty("dsmResult")
   public DsmResult getDsmResult() {
      return this.dsmResult;
   }
}
