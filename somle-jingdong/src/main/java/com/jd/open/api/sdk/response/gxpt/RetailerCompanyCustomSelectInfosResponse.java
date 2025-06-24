package com.jd.open.api.sdk.response.gxpt;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.gxpt.PurchaseOrderJosService.response.infos.GxCompanyInfoResponse;
import com.jd.open.api.sdk.response.AbstractResponse;

public class RetailerCompanyCustomSelectInfosResponse extends AbstractResponse {
   private GxCompanyInfoResponse result;

   @JsonProperty("result")
   public void setResult(GxCompanyInfoResponse result) {
      this.result = result;
   }

   @JsonProperty("result")
   public GxCompanyInfoResponse getResult() {
      return this.result;
   }
}
