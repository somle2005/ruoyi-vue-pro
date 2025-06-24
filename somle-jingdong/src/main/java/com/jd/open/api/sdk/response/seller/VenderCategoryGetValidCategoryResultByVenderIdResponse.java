package com.jd.open.api.sdk.response.seller;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.seller.CategorySafService.response.getValidCategoryResultByVenderId.CategoryResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class VenderCategoryGetValidCategoryResultByVenderIdResponse extends AbstractResponse {
   private CategoryResult getvalidcategoryresultbyvenderidResult;

   @JsonProperty("getvalidcategoryresultbyvenderid_result")
   public void setGetvalidcategoryresultbyvenderidResult(CategoryResult getvalidcategoryresultbyvenderidResult) {
      this.getvalidcategoryresultbyvenderidResult = getvalidcategoryresultbyvenderidResult;
   }

   @JsonProperty("getvalidcategoryresultbyvenderid_result")
   public CategoryResult getGetvalidcategoryresultbyvenderidResult() {
      return this.getvalidcategoryresultbyvenderidResult;
   }
}
