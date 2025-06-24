package com.jd.open.api.sdk.response.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.order.LocCheckNumServerInterface.response.consumer.ConsumerResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class PopOtoCheckNumberConsumerResponse extends AbstractResponse {
   private ConsumerResult consumeResult;

   @JsonProperty("consume_result")
   public void setConsumeResult(ConsumerResult consumeResult) {
      this.consumeResult = consumeResult;
   }

   @JsonProperty("consume_result")
   public ConsumerResult getConsumeResult() {
      return this.consumeResult;
   }
}
