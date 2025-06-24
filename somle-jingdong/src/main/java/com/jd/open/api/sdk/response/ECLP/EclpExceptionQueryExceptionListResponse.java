package com.jd.open.api.sdk.response.ECLP;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ECLP.JosExceptionQueryService.response.queryExceptionList.JosExceptionQueryResult;
import com.jd.open.api.sdk.response.AbstractResponse;
import java.util.List;

public class EclpExceptionQueryExceptionListResponse extends AbstractResponse {
   private List<JosExceptionQueryResult> josExceptionQueryResultList;

   @JsonProperty("josExceptionQueryResultList")
   public void setJosExceptionQueryResultList(List<JosExceptionQueryResult> josExceptionQueryResultList) {
      this.josExceptionQueryResultList = josExceptionQueryResultList;
   }

   @JsonProperty("josExceptionQueryResultList")
   public List<JosExceptionQueryResult> getJosExceptionQueryResultList() {
      return this.josExceptionQueryResultList;
   }
}
