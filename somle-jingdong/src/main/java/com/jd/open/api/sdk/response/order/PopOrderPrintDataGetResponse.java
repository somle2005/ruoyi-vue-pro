package com.jd.open.api.sdk.response.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.order.OrderQueryJsfService.response.get.OrderPrintDataResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class PopOrderPrintDataGetResponse extends AbstractResponse {
   private OrderPrintDataResult getorderprintdataResult;

   @JsonProperty("getorderprintdata_result")
   public void setGetorderprintdataResult(OrderPrintDataResult getorderprintdataResult) {
      this.getorderprintdataResult = getorderprintdataResult;
   }

   @JsonProperty("getorderprintdata_result")
   public OrderPrintDataResult getGetorderprintdataResult() {
      return this.getorderprintdataResult;
   }
}
