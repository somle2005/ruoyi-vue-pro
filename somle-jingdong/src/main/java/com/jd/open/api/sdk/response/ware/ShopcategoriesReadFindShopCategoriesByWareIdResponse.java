package com.jd.open.api.sdk.response.ware;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.response.AbstractResponse;
import java.util.Set;

public class ShopcategoriesReadFindShopCategoriesByWareIdResponse extends AbstractResponse {
   private Set<Long> shopCategories;

   @JsonProperty("shopCategories")
   public void setShopCategories(Set<Long> shopCategories) {
      this.shopCategories = shopCategories;
   }

   @JsonProperty("shopCategories")
   public Set<Long> getShopCategories() {
      return this.shopCategories;
   }
}
