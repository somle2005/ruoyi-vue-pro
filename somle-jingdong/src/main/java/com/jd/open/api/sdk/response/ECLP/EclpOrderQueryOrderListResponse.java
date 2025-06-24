package com.jd.open.api.sdk.response.ECLP;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.queryOrderList.OrderDetailResult;
import com.jd.open.api.sdk.response.AbstractResponse;
import java.util.List;

public class EclpOrderQueryOrderListResponse extends AbstractResponse {
   private List<OrderDetailResult> queryordervmiResult;

   @JsonProperty("queryordervmi_result")
   public void setQueryordervmiResult(List<OrderDetailResult> queryordervmiResult) {
      this.queryordervmiResult = queryordervmiResult;
   }

   @JsonProperty("queryordervmi_result")
   public List<OrderDetailResult> getQueryordervmiResult() {
      return this.queryordervmiResult;
   }
}
