package com.jd.open.api.sdk.response.ECLP;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.queryOrderPacks.OrderDefaultResult;
import com.jd.open.api.sdk.response.AbstractResponse;
import java.util.List;

public class EclpOrderQueryOrderPacksResponse extends AbstractResponse {
   private List<OrderDefaultResult> queryorderpacksResult;

   @JsonProperty("queryorderpacks_result")
   public void setQueryorderpacksResult(List<OrderDefaultResult> queryorderpacksResult) {
      this.queryorderpacksResult = queryorderpacksResult;
   }

   @JsonProperty("queryorderpacks_result")
   public List<OrderDefaultResult> getQueryorderpacksResult() {
      return this.queryorderpacksResult;
   }
}
