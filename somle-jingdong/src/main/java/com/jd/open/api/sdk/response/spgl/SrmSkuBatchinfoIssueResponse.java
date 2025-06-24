package com.jd.open.api.sdk.response.spgl;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.spgl.BatchPoJsfService.response.issue.SrmWsResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class SrmSkuBatchinfoIssueResponse extends AbstractResponse {
   private SrmWsResult returnType;

   @JsonProperty("returnType")
   public void setReturnType(SrmWsResult returnType) {
      this.returnType = returnType;
   }

   @JsonProperty("returnType")
   public SrmWsResult getReturnType() {
      return this.returnType;
   }
}
