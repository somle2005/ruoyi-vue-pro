package com.jd.open.api.sdk.response.ECLP;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.response.AbstractResponse;

public class EclpMasterUpdateCustomerInfoResponse extends AbstractResponse {
   private boolean updateCustomerResult;

   @JsonProperty("updateCustomer_result")
   public void setUpdateCustomerResult(boolean updateCustomerResult) {
      this.updateCustomerResult = updateCustomerResult;
   }

   @JsonProperty("updateCustomer_result")
   public boolean getUpdateCustomerResult() {
      return this.updateCustomerResult;
   }
}
