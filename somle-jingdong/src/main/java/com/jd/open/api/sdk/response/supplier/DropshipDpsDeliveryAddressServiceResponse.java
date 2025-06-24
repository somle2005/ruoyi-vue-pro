package com.jd.open.api.sdk.response.supplier;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.supplier.DeliveryAddressInterface.response.deliveryAddressService.DropshipResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class DropshipDpsDeliveryAddressServiceResponse extends AbstractResponse {
   private DropshipResult deliveryAddressQueryResult;

   @JsonProperty("deliveryAddressQueryResult")
   public void setDeliveryAddressQueryResult(DropshipResult deliveryAddressQueryResult) {
      this.deliveryAddressQueryResult = deliveryAddressQueryResult;
   }

   @JsonProperty("deliveryAddressQueryResult")
   public DropshipResult getDeliveryAddressQueryResult() {
      return this.deliveryAddressQueryResult;
   }
}
