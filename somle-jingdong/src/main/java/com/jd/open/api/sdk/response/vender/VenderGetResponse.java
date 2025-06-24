package com.jd.open.api.sdk.response.vender;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.vender.Vender;
import com.jd.open.api.sdk.response.AbstractResponse;

public class VenderGetResponse extends AbstractResponse {
   private Vender vender;

   @JsonProperty("vender")
   public Vender getVender() {
      return this.vender;
   }

   @JsonProperty("vender")
   public void setVender(Vender vender) {
      this.vender = vender;
   }
}
