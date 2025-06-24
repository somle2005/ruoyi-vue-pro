package com.jd.open.api.sdk.response.gxpt;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.gxpt.PurchaseOrderJosService.response.page.GxListPageResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class PurchaseOrderSelectInfosPageResponse extends AbstractResponse {
   private GxListPageResult result;

   @JsonProperty("result")
   public void setResult(GxListPageResult result) {
      this.result = result;
   }

   @JsonProperty("result")
   public GxListPageResult getResult() {
      return this.result;
   }
}
