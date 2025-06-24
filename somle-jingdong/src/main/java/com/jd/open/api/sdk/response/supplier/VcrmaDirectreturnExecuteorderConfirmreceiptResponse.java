package com.jd.open.api.sdk.response.supplier;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.supplier.ReturnExecuteOrderHandlerJosApi.response.confirmreceipt.JosDataResponseDto;
import com.jd.open.api.sdk.response.AbstractResponse;

public class VcrmaDirectreturnExecuteorderConfirmreceiptResponse extends AbstractResponse {
   private JosDataResponseDto result;

   @JsonProperty("result")
   public void setResult(JosDataResponseDto result) {
      this.result = result;
   }

   @JsonProperty("result")
   public JosDataResponseDto getResult() {
      return this.result;
   }
}
