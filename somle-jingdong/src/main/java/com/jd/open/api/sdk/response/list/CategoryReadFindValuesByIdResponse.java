package com.jd.open.api.sdk.response.list;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.list.CategoryAttrValueReadService.response.findValuesById.CategoryAttrValue;
import com.jd.open.api.sdk.response.AbstractResponse;

public class CategoryReadFindValuesByIdResponse extends AbstractResponse {
   private CategoryAttrValue categoryAttrValue;

   @JsonProperty("categoryAttrValue")
   public void setCategoryAttrValue(CategoryAttrValue categoryAttrValue) {
      this.categoryAttrValue = categoryAttrValue;
   }

   @JsonProperty("categoryAttrValue")
   public CategoryAttrValue getCategoryAttrValue() {
      return this.categoryAttrValue;
   }
}
