package com.jd.open.api.sdk.response.supplier;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.supplier.ReturnOrderJosService.response.get.JosReturnOrderDetailResultDTO;
import com.jd.open.api.sdk.response.AbstractResponse;

public class EdiRoDetailGetResponse extends AbstractResponse {
   private JosReturnOrderDetailResultDTO returnOrderDetailResult;

   @JsonProperty("returnOrderDetailResult")
   public void setReturnOrderDetailResult(JosReturnOrderDetailResultDTO returnOrderDetailResult) {
      this.returnOrderDetailResult = returnOrderDetailResult;
   }

   @JsonProperty("returnOrderDetailResult")
   public JosReturnOrderDetailResultDTO getReturnOrderDetailResult() {
      return this.returnOrderDetailResult;
   }
}
