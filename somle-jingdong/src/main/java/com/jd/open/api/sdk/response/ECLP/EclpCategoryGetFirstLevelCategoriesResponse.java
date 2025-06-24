package com.jd.open.api.sdk.response.ECLP;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.getFirstLevelCategories.Category;
import com.jd.open.api.sdk.response.AbstractResponse;
import java.util.List;

public class EclpCategoryGetFirstLevelCategoriesResponse extends AbstractResponse {
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
