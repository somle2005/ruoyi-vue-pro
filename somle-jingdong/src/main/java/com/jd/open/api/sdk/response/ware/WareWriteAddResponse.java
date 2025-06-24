package com.jd.open.api.sdk.response.ware;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.Ware;
import com.jd.open.api.sdk.response.AbstractResponse;

public class WareWriteAddResponse extends AbstractResponse {
   private Ware ware;

   @JsonProperty("ware")
   public void setWare(Ware ware) {
      this.ware = ware;
   }

   @JsonProperty("ware")
   public Ware getWare() {
      return this.ware;
   }
}
