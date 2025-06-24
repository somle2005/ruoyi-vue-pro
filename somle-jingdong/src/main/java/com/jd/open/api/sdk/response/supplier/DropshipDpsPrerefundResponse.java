package com.jd.open.api.sdk.response.supplier;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.response.AbstractResponse;

public class DropshipDpsPrerefundResponse extends AbstractResponse {
   private Result prerefundResult;

   @JsonProperty("prerefundResult")
   public void setPrerefundResult(Result prerefundResult) {
      this.prerefundResult = prerefundResult;
   }

   @JsonProperty("prerefundResult")
   public Result getPrerefundResult() {
      return this.prerefundResult;
   }
}
