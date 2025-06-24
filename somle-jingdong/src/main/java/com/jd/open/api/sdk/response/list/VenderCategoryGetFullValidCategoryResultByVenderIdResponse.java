package com.jd.open.api.sdk.response.list;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.list.CategorySafService.response.getFullValidCategoryResultByVenderId.CategoryResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class VenderCategoryGetFullValidCategoryResultByVenderIdResponse extends AbstractResponse {
   private CategoryResult returnType;

   @JsonProperty("returnType")
   public void setReturnType(CategoryResult returnType) {
      this.returnType = returnType;
   }

   @JsonProperty("returnType")
   public CategoryResult getReturnType() {
      return this.returnType;
   }
}
