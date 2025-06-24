package com.jd.open.api.sdk.response.supplier;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.supplier.AccountReconciliationJosService.response.getAccountReconciliation.JosListOrderResultDTO;
import com.jd.open.api.sdk.response.AbstractResponse;

public class EdiArGetAccountReconciliationResponse extends AbstractResponse {
   private JosListOrderResultDTO result;

   @JsonProperty("result")
   public void setResult(JosListOrderResultDTO result) {
      this.result = result;
   }

   @JsonProperty("result")
   public JosListOrderResultDTO getResult() {
      return this.result;
   }
}
