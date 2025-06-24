package com.jd.open.api.sdk.response.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.response.AbstractResponse;

public class OrderVenderRemarkQueryByOrderIdResponse extends AbstractResponse {
   private VenderRemarkQueryResult venderRemarkQueryResult;

   @JsonProperty("venderRemarkQueryResult")
   public void setVenderRemarkQueryResult(VenderRemarkQueryResult venderRemarkQueryResult) {
      this.venderRemarkQueryResult = venderRemarkQueryResult;
   }

   @JsonProperty("venderRemarkQueryResult")
   public VenderRemarkQueryResult getVenderRemarkQueryResult() {
      return this.venderRemarkQueryResult;
   }
}
