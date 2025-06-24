package com.jd.open.api.sdk.response.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.order.OrderNotPayService.response.notPayOrderInfo.PaginatedInfo;
import com.jd.open.api.sdk.response.AbstractResponse;

public class PopOrderNotPayOrderInfoResponse extends AbstractResponse {
   private PaginatedInfo paginatedInfo;

   @JsonProperty("paginatedInfo")
   public void setPaginatedInfo(PaginatedInfo paginatedInfo) {
      this.paginatedInfo = paginatedInfo;
   }

   @JsonProperty("paginatedInfo")
   public PaginatedInfo getPaginatedInfo() {
      return this.paginatedInfo;
   }
}
