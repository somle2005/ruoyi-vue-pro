package com.jd.open.api.sdk.response.ECLP;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.insertCategory.Result;
import com.jd.open.api.sdk.response.AbstractResponse;

public class EclpMasterInsertCategoryResponse extends AbstractResponse {
   private Result updateCustomerResult;

   @JsonProperty("updateCustomer_result")
   public void setUpdateCustomerResult(Result updateCustomerResult) {
      this.updateCustomerResult = updateCustomerResult;
   }

   @JsonProperty("updateCustomer_result")
   public Result getUpdateCustomerResult() {
      return this.updateCustomerResult;
   }
}
