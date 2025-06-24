package com.jd.open.api.sdk.response.yjs;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.yjs.StoreOrderJosService.response.vendorSelfDeliveryComplete.VendorSelfDeliveryCompleteResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class MedicineDsOrderVendorSelfDeliveryCompleteResponse extends AbstractResponse {
   private VendorSelfDeliveryCompleteResult apiResult;

   @JsonProperty("apiResult")
   public void setApiResult(VendorSelfDeliveryCompleteResult apiResult) {
      this.apiResult = apiResult;
   }

   @JsonProperty("apiResult")
   public VendorSelfDeliveryCompleteResult getApiResult() {
      return this.apiResult;
   }
}
