package com.jd.open.api.sdk.response.supplier;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.supplier.PoQueryForJosWebService.response.get.OrderResultDto;
import com.jd.open.api.sdk.response.AbstractResponse;

public class PoListPageGetResponse extends AbstractResponse {
   private OrderResultDto orderResultDto;

   @JsonProperty("orderResultDto")
   public void setOrderResultDto(OrderResultDto orderResultDto) {
      this.orderResultDto = orderResultDto;
   }

   @JsonProperty("orderResultDto")
   public OrderResultDto getOrderResultDto() {
      return this.orderResultDto;
   }
}
