package com.jd.open.api.sdk.response.alpha;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.alpha.AlphaJOSService.response.getVenderCarrier.StandardGenericResponse;
import com.jd.open.api.sdk.response.AbstractResponse;

public class FceAlphaGetVenderCarrierResponse extends AbstractResponse {
   private StandardGenericResponse StandardGenericResponse;

   @JsonProperty("StandardGenericResponse")
   public void setStandardGenericResponse(StandardGenericResponse StandardGenericResponse) {
      this.StandardGenericResponse = StandardGenericResponse;
   }

   @JsonProperty("StandardGenericResponse")
   public StandardGenericResponse getStandardGenericResponse() {
      return this.StandardGenericResponse;
   }
}
