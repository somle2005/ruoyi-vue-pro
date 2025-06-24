package com.jd.open.api.sdk.response.list;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.list.CategoryAttrReadService.response.findAttrById.CategoryAttr;
import com.jd.open.api.sdk.response.AbstractResponse;

public class CategoryReadFindAttrByIdResponse extends AbstractResponse {
   private CategoryAttr categoryAttr;

   @JsonProperty("categoryAttr")
   public void setCategoryAttr(CategoryAttr categoryAttr) {
      this.categoryAttr = categoryAttr;
   }

   @JsonProperty("categoryAttr")
   public CategoryAttr getCategoryAttr() {
      return this.categoryAttr;
   }
}
