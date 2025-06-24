package com.jd.open.api.sdk.response.list;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.list.CategoryReadService.response.findByPId.Category;
import com.jd.open.api.sdk.response.AbstractResponse;
import java.util.List;

public class CategoryReadFindByPIdResponse extends AbstractResponse {
   private List<Category> categories;

   @JsonProperty("categories")
   public void setCategories(List<Category> categories) {
      this.categories = categories;
   }

   @JsonProperty("categories")
   public List<Category> getCategories() {
      return this.categories;
   }
}
