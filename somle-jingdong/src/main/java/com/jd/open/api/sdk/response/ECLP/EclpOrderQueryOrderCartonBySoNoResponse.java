package com.jd.open.api.sdk.response.ECLP;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.queryOrderCartonBySoNo.OrderDTO;
import com.jd.open.api.sdk.response.AbstractResponse;

public class EclpOrderQueryOrderCartonBySoNoResponse extends AbstractResponse {
   private OrderDTO result;

   @JsonProperty("result")
   public void setResult(OrderDTO result) {
      this.result = result;
   }

   @JsonProperty("result")
   public OrderDTO getResult() {
      return this.result;
   }
}
