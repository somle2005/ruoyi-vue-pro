package com.jd.open.api.sdk.response.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.order.SkuFareTemplateService.response.getTemplates.SkuFareTemplateResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class SkuFareTemplateServiceGetTemplatesResponse extends AbstractResponse {
   private SkuFareTemplateResult querySkuFareTemplateResult;

   @JsonProperty("query_skuFareTemplate_result")
   public void setQuerySkuFareTemplateResult(SkuFareTemplateResult querySkuFareTemplateResult) {
      this.querySkuFareTemplateResult = querySkuFareTemplateResult;
   }

   @JsonProperty("query_skuFareTemplate_result")
   public SkuFareTemplateResult getQuerySkuFareTemplateResult() {
      return this.querySkuFareTemplateResult;
   }
}
