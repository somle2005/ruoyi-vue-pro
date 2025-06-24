package com.jd.open.api.sdk.response.supplier;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.supplier.ReturnOrderJosService.response.get.JosReturnOrderResultDTO;
import com.jd.open.api.sdk.response.AbstractResponse;

public class EdiRoGetResponse extends AbstractResponse {
   private JosReturnOrderResultDTO returnOrderResult;

   @JsonProperty("returnOrderResult")
   public void setReturnOrderResult(JosReturnOrderResultDTO returnOrderResult) {
      this.returnOrderResult = returnOrderResult;
   }

   @JsonProperty("returnOrderResult")
   public JosReturnOrderResultDTO getReturnOrderResult() {
      return this.returnOrderResult;
   }
}
