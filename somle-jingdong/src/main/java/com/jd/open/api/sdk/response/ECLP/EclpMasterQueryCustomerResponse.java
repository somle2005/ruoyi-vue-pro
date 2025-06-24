package com.jd.open.api.sdk.response.ECLP;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.queryCustomer.CustomerOut;
import com.jd.open.api.sdk.response.AbstractResponse;
import java.util.List;

public class EclpMasterQueryCustomerResponse extends AbstractResponse {
   private List<CustomerOut> queryCustomerResult;

   @JsonProperty("queryCustomer_result")
   public void setQueryCustomerResult(List<CustomerOut> queryCustomerResult) {
      this.queryCustomerResult = queryCustomerResult;
   }

   @JsonProperty("queryCustomer_result")
   public List<CustomerOut> getQueryCustomerResult() {
      return this.queryCustomerResult;
   }
}
