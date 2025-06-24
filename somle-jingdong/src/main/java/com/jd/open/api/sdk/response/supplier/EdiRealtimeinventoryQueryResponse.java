package com.jd.open.api.sdk.response.supplier;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.supplier.RealTimeInventoryJosService.response.query.JosRealTimeInventoryResultDTO;
import com.jd.open.api.sdk.response.AbstractResponse;

public class EdiRealtimeinventoryQueryResponse extends AbstractResponse {
   private JosRealTimeInventoryResultDTO result;

   @JsonProperty("result")
   public void setResult(JosRealTimeInventoryResultDTO result) {
      this.result = result;
   }

   @JsonProperty("result")
   public JosRealTimeInventoryResultDTO getResult() {
      return this.result;
   }
}
