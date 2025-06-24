package com.jd.open.api.sdk.response.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.order.SkuFareTemplateService.response.getTemplateRules.SkuFareTemplateRuleResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class SkuFareTemplateServiceGetTemplateRulesResponse extends AbstractResponse {
   private SkuFareTemplateRuleResult querySkuFareTemplateRuleResult;

   @JsonProperty("query_skuFare_template_ruleResult")
   public void setQuerySkuFareTemplateRuleResult(SkuFareTemplateRuleResult querySkuFareTemplateRuleResult) {
      this.querySkuFareTemplateRuleResult = querySkuFareTemplateRuleResult;
   }

   @JsonProperty("query_skuFare_template_ruleResult")
   public SkuFareTemplateRuleResult getQuerySkuFareTemplateRuleResult() {
      return this.querySkuFareTemplateRuleResult;
   }
}
