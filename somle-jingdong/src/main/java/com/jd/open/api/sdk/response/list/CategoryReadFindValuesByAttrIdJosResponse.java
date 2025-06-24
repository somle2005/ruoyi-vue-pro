package com.jd.open.api.sdk.response.list;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.list.CategoryAttrValueReadService.response.findValuesByAttrIdJos.CategoryAttrValueJos;
import com.jd.open.api.sdk.response.AbstractResponse;
import java.util.List;

public class CategoryReadFindValuesByAttrIdJosResponse extends AbstractResponse {
   private List<CategoryAttrValueJos> categoryAttrValues;

   @JsonProperty("categoryAttrValues")
   public void setCategoryAttrValues(List<CategoryAttrValueJos> categoryAttrValues) {
      this.categoryAttrValues = categoryAttrValues;
   }

   @JsonProperty("categoryAttrValues")
   public List<CategoryAttrValueJos> getCategoryAttrValues() {
      return this.categoryAttrValues;
   }
}
