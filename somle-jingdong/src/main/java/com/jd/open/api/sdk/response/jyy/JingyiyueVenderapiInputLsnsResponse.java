package com.jd.open.api.sdk.response.jyy;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.jyy.VenderAppointOrderFacade.response.inputLsns.SoaResponse;
import com.jd.open.api.sdk.response.AbstractResponse;

public class JingyiyueVenderapiInputLsnsResponse extends AbstractResponse {
   private SoaResponse response;

   @JsonProperty("response")
   public void setResponse(SoaResponse response) {
      this.response = response;
   }

   @JsonProperty("response")
   public SoaResponse getResponse() {
      return this.response;
   }
}
