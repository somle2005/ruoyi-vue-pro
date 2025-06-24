package com.jd.open.api.sdk.response.ECLP;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.queryRtw.RtwResult;
import com.jd.open.api.sdk.response.AbstractResponse;
import java.util.List;

public class EclpRtwQueryRtwResponse extends AbstractResponse {
   private List<RtwResult> queryrtwResult;

   @JsonProperty("queryrtw_result")
   public void setQueryrtwResult(List<RtwResult> queryrtwResult) {
      this.queryrtwResult = queryrtwResult;
   }

   @JsonProperty("queryrtw_result")
   public List<RtwResult> getQueryrtwResult() {
      return this.queryrtwResult;
   }
}
