package com.jd.open.api.sdk.response.yjs;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.yjs.StoreOrderJosService.response.vendorSelfDelivery.VendorSelfDeliveryResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class MedicineDsOrderVendorSelfDeliveryResponse extends AbstractResponse {
   private VendorSelfDeliveryResult apiResult;

   @JsonProperty("apiResult")
   public void setApiResult(VendorSelfDeliveryResult apiResult) {
      this.apiResult = apiResult;
   }

   @JsonProperty("apiResult")
   public VendorSelfDeliveryResult getApiResult() {
      return this.apiResult;
   }
}
