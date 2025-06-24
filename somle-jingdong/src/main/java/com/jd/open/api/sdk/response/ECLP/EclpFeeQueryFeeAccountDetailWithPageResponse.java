package com.jd.open.api.sdk.response.ECLP;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.queryFeeAccountDetailWithPage.PageableResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class EclpFeeQueryFeeAccountDetailWithPageResponse extends AbstractResponse {
   private PageableResult querystockWithPageResult;

   @JsonProperty("querystock_withPage_result")
   public void setQuerystockWithPageResult(PageableResult querystockWithPageResult) {
      this.querystockWithPageResult = querystockWithPageResult;
   }

   @JsonProperty("querystock_withPage_result")
   public PageableResult getQuerystockWithPageResult() {
      return this.querystockWithPageResult;
   }
}
