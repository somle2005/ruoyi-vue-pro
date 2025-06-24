package com.jd.open.api.sdk.response.list;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.list.CategoryAttrReadService.response.findAttrByIdJos.CategoryAttrJos;
import com.jd.open.api.sdk.response.AbstractResponse;

public class CategoryReadFindAttrByIdJosResponse extends AbstractResponse {
   private CategoryAttrJos categoryAttr;

   @JsonProperty("categoryAttr")
   public void setCategoryAttr(CategoryAttrJos categoryAttr) {
      this.categoryAttr = categoryAttr;
   }

   @JsonProperty("categoryAttr")
   public CategoryAttrJos getCategoryAttr() {
      return this.categoryAttr;
   }
}
