package com.jd.open.api.sdk.response.list;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.list.CategoryReadService.response.findById.Category;
import com.jd.open.api.sdk.response.AbstractResponse;

public class CategoryReadFindByIdResponse extends AbstractResponse {
   private Category category;

   @JsonProperty("category")
   public void setCategory(Category category) {
      this.category = category;
   }

   @JsonProperty("category")
   public Category getCategory() {
      return this.category;
   }
}
