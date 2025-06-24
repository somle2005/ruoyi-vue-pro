package com.jd.open.api.sdk.response.ware;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ware.ReserveProductJosService.response.list.OpenResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class WareReserveDataListResponse extends AbstractResponse {
   private OpenResult result;

   @JsonProperty("result")
   public void setResult(OpenResult result) {
      this.result = result;
   }

   @JsonProperty("result")
   public OpenResult getResult() {
      return this.result;
   }
}
