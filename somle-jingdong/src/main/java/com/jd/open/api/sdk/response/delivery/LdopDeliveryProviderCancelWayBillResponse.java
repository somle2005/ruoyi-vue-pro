package com.jd.open.api.sdk.response.delivery;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.delivery.OrderCancelApi.response.cancelWayBill.ResponseDTO;
import com.jd.open.api.sdk.response.AbstractResponse;

public class LdopDeliveryProviderCancelWayBillResponse extends AbstractResponse {
   private ResponseDTO responseDTO;

   @JsonProperty("responseDTO")
   public void setResponseDTO(ResponseDTO responseDTO) {
      this.responseDTO = responseDTO;
   }

   @JsonProperty("responseDTO")
   public ResponseDTO getResponseDTO() {
      return this.responseDTO;
   }
}
