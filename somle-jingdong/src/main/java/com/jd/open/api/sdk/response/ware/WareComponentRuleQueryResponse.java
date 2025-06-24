package com.jd.open.api.sdk.response.ware;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ware.ProductPublishTemplateService.response.query.JdResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class WareComponentRuleQueryResponse extends AbstractResponse {
   private JdResult josResult;

   @JsonProperty("josResult")
   public void setJosResult(JdResult josResult) {
      this.josResult = josResult;
   }

   @JsonProperty("josResult")
   public JdResult getJosResult() {
      return this.josResult;
   }
}
