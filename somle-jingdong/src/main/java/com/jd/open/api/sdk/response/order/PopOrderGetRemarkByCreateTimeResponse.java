package com.jd.open.api.sdk.response.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.order.OrderRemarkService.response.getRemarkByCreateTime.OrderRemarkResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class PopOrderGetRemarkByCreateTimeResponse extends AbstractResponse {
   private OrderRemarkResult getremarkbymodifytimeResult;

   @JsonProperty("getremarkbymodifytime_result")
   public void setGetremarkbymodifytimeResult(OrderRemarkResult getremarkbymodifytimeResult) {
      this.getremarkbymodifytimeResult = getremarkbymodifytimeResult;
   }

   @JsonProperty("getremarkbymodifytime_result")
   public OrderRemarkResult getGetremarkbymodifytimeResult() {
      return this.getremarkbymodifytimeResult;
   }
}
