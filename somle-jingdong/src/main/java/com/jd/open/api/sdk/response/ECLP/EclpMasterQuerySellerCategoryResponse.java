package com.jd.open.api.sdk.response.ECLP;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.querySellerCategory.SellerCategory;
import com.jd.open.api.sdk.response.AbstractResponse;

public class EclpMasterQuerySellerCategoryResponse extends AbstractResponse {
   private SellerCategory querySellerCategoryResult;

   @JsonProperty("querySellerCategory_result")
   public void setQuerySellerCategoryResult(SellerCategory querySellerCategoryResult) {
      this.querySellerCategoryResult = querySellerCategoryResult;
   }

   @JsonProperty("querySellerCategory_result")
   public SellerCategory getQuerySellerCategoryResult() {
      return this.querySellerCategoryResult;
   }
}
