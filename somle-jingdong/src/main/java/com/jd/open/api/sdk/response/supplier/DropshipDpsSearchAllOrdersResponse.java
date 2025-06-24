package com.jd.open.api.sdk.response.supplier;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.supplier.IDpsSearchAllOrdersInterface.response.searchAllOrders.QueryAllOrdersForJosResultList;
import com.jd.open.api.sdk.response.AbstractResponse;

public class DropshipDpsSearchAllOrdersResponse extends AbstractResponse {
   private QueryAllOrdersForJosResultList searchallordersResult;

   @JsonProperty("searchallorders_result")
   public void setSearchallordersResult(QueryAllOrdersForJosResultList searchallordersResult) {
      this.searchallordersResult = searchallordersResult;
   }

   @JsonProperty("searchallorders_result")
   public QueryAllOrdersForJosResultList getSearchallordersResult() {
      return this.searchallordersResult;
   }
}
