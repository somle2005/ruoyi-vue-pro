package com.jd.open.api.sdk.response.ECLP;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ECLP.IbService4Isv.response.queryOutsideMain.QueryOutsideMainResult4Isv;
import com.jd.open.api.sdk.response.AbstractResponse;

public class EclpIbQueryOutsideMainResponse extends AbstractResponse {
   private QueryOutsideMainResult4Isv queryOutsideMainResult;

   @JsonProperty("queryOutsideMainResult")
   public void setQueryOutsideMainResult(QueryOutsideMainResult4Isv queryOutsideMainResult) {
      this.queryOutsideMainResult = queryOutsideMainResult;
   }

   @JsonProperty("queryOutsideMainResult")
   public QueryOutsideMainResult4Isv getQueryOutsideMainResult() {
      return this.queryOutsideMainResult;
   }
}
