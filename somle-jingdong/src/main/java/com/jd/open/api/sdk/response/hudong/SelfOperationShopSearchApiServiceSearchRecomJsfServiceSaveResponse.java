package com.jd.open.api.sdk.response.hudong;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.hudong.SearchRecomJsfService.response.save.Results;
import com.jd.open.api.sdk.response.AbstractResponse;

public class SelfOperationShopSearchApiServiceSearchRecomJsfServiceSaveResponse extends AbstractResponse {
   private Results returnType;

   @JsonProperty("returnType")
   public void setReturnType(Results returnType) {
      this.returnType = returnType;
   }

   @JsonProperty("returnType")
   public Results getReturnType() {
      return this.returnType;
   }
}
