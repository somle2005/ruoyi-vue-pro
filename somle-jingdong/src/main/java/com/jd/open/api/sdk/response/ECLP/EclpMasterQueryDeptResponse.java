package com.jd.open.api.sdk.response.ECLP;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.queryDept.DeptOut;
import com.jd.open.api.sdk.response.AbstractResponse;
import java.util.List;

public class EclpMasterQueryDeptResponse extends AbstractResponse {
   private List<DeptOut> querydeptResult;

   @JsonProperty("querydept_result")
   public void setQuerydeptResult(List<DeptOut> querydeptResult) {
      this.querydeptResult = querydeptResult;
   }

   @JsonProperty("querydept_result")
   public List<DeptOut> getQuerydeptResult() {
      return this.querydeptResult;
   }
}
