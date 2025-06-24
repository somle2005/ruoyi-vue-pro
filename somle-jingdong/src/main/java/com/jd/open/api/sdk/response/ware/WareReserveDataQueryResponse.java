package com.jd.open.api.sdk.response.ware;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ware.ReserveProductJosService.response.query.OpenResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class WareReserveDataQueryResponse extends AbstractResponse {
   private OpenResult response;

   @JsonProperty("response")
   public void setResponse(OpenResult response) {
      this.response = response;
   }

   @JsonProperty("response")
   public OpenResult getResponse() {
      return this.response;
   }
}
