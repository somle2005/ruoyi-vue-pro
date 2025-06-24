package com.jd.open.api.sdk.response.ECLP;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.queryOrderCustoms.DeclaredResult;
import com.jd.open.api.sdk.response.AbstractResponse;
import java.util.List;

public class EclpOrderQueryOrderCustomsResponse extends AbstractResponse {
   private List<DeclaredResult> queryordercustomsResult;

   @JsonProperty("queryordercustoms_result")
   public void setQueryordercustomsResult(List<DeclaredResult> queryordercustomsResult) {
      this.queryordercustomsResult = queryordercustomsResult;
   }

   @JsonProperty("queryordercustoms_result")
   public List<DeclaredResult> getQueryordercustomsResult() {
      return this.queryordercustomsResult;
   }
}
