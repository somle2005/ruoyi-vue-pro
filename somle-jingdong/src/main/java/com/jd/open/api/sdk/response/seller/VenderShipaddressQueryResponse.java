package com.jd.open.api.sdk.response.seller;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.seller.VenderContactSafService.response.query.ShipAddressResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class VenderShipaddressQueryResponse extends AbstractResponse {
   private ShipAddressResult returnAddressResult;

   @JsonProperty("returnAddressResult")
   public void setReturnAddressResult(ShipAddressResult returnAddressResult) {
      this.returnAddressResult = returnAddressResult;
   }

   @JsonProperty("returnAddressResult")
   public ShipAddressResult getReturnAddressResult() {
      return this.returnAddressResult;
   }
}
