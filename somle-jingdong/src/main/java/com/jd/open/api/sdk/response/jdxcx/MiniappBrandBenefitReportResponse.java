package com.jd.open.api.sdk.response.jdxcx;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.jdxcx.MiniAppBrandBenefitJsfService.response.report.JsfResponseResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class MiniappBrandBenefitReportResponse extends AbstractResponse {
   private JsfResponseResult jsfResponseResult;

   @JsonProperty("jsfResponseResult")
   public void setJsfResponseResult(JsfResponseResult jsfResponseResult) {
      this.jsfResponseResult = jsfResponseResult;
   }

   @JsonProperty("jsfResponseResult")
   public JsfResponseResult getJsfResponseResult() {
      return this.jsfResponseResult;
   }
}
