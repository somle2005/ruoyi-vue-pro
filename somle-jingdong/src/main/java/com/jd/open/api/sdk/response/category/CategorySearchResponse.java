package com.jd.open.api.sdk.response.category;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.category.Category;
import com.jd.open.api.sdk.response.AbstractResponse;
import java.util.List;

public class CategorySearchResponse extends AbstractResponse {
   private int total;
   private List<Category> category;

   public int getTotal() {
      return this.total;
   }

   public void setTotal(int total) {
      this.total = total;
   }

   @JsonProperty("item_cats")
   public List<Category> getCategory() {
      return this.category;
   }

   @JsonProperty("item_cats")
   public void setCategory(List<Category> category) {
      this.category = category;
   }
}
