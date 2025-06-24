package com.jd.open.api.sdk.response.list;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.list.CategoryAttrValueReadService.response.findValuesByIdUnlimit.CategoryAttrValueUnlimit;
import com.jd.open.api.sdk.response.AbstractResponse;

public class CategoryReadFindValuesByIdUnlimitResponse extends AbstractResponse {
   private CategoryAttrValueUnlimit findvaluesbyidunlimitResult;

   @JsonProperty("findvaluesbyidunlimit_result")
   public void setFindvaluesbyidunlimitResult(CategoryAttrValueUnlimit findvaluesbyidunlimitResult) {
      this.findvaluesbyidunlimitResult = findvaluesbyidunlimitResult;
   }

   @JsonProperty("findvaluesbyidunlimit_result")
   public CategoryAttrValueUnlimit getFindvaluesbyidunlimitResult() {
      return this.findvaluesbyidunlimitResult;
   }
}
