package com.jd.open.api.sdk.response.ECLP;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.closePo.PoCloseJosResponse;
import com.jd.open.api.sdk.response.AbstractResponse;

public class EclpPoClosePoResponse extends AbstractResponse {
   private PoCloseJosResponse poCloseJosResponse;

   @JsonProperty("poCloseJosResponse")
   public void setPoCloseJosResponse(PoCloseJosResponse poCloseJosResponse) {
      this.poCloseJosResponse = poCloseJosResponse;
   }

   @JsonProperty("poCloseJosResponse")
   public PoCloseJosResponse getPoCloseJosResponse() {
      return this.poCloseJosResponse;
   }
}
