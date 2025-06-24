package com.jd.open.api.sdk.response.list;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.list.CategoryAttrValueReadService.response.findValuesByAttrId.CategoryAttrValue;
import com.jd.open.api.sdk.response.AbstractResponse;
import java.util.List;

public class CategoryReadFindValuesByAttrIdResponse extends AbstractResponse {
   private List<CategoryAttrValue> categoryAttrValues;

   @JsonProperty("categoryAttrValues")
   public void setCategoryAttrValues(List<CategoryAttrValue> categoryAttrValues) {
      this.categoryAttrValues = categoryAttrValues;
   }

   @JsonProperty("categoryAttrValues")
   public List<CategoryAttrValue> getCategoryAttrValues() {
      return this.categoryAttrValues;
   }
}
