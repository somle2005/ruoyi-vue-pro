package com.jd.open.api.sdk.response.HouseEI;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.HouseEI.ZeroStockJosExternalJSFService.response.search.JosPage;
import com.jd.open.api.sdk.response.AbstractResponse;

public class LasSpareZerostockServiceSearchResponse extends AbstractResponse {
   private JosPage result;

   @JsonProperty("result")
   public void setResult(JosPage result) {
      this.result = result;
   }

   @JsonProperty("result")
   public JosPage getResult() {
      return this.result;
   }
}
