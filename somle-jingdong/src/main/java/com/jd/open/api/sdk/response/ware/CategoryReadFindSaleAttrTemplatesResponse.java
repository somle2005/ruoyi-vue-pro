package com.jd.open.api.sdk.response.ware;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ware.CategoryAttrReadService.response.findSaleAttrTemplates.CategoryAttrTemplates;
import com.jd.open.api.sdk.response.AbstractResponse;

public class CategoryReadFindSaleAttrTemplatesResponse extends AbstractResponse {
   private CategoryAttrTemplates categoryAttrTemplates;

   @JsonProperty("categoryAttrTemplates")
   public void setCategoryAttrTemplates(CategoryAttrTemplates categoryAttrTemplates) {
      this.categoryAttrTemplates = categoryAttrTemplates;
   }

   @JsonProperty("categoryAttrTemplates")
   public CategoryAttrTemplates getCategoryAttrTemplates() {
      return this.categoryAttrTemplates;
   }
}
