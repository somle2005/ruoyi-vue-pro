package com.jd.open.api.sdk.response.promotion;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.promotion.PromoActivityWriteService.response.addSkus.AddParticipantResponse;
import com.jd.open.api.sdk.response.AbstractResponse;

public class PromoActivityAddSkusResponse extends AbstractResponse {
   private AddParticipantResponse returnType;

   @JsonProperty("returnType")
   public void setReturnType(AddParticipantResponse returnType) {
      this.returnType = returnType;
   }

   @JsonProperty("returnType")
   public AddParticipantResponse getReturnType() {
      return this.returnType;
   }
}
