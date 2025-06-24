package com.jd.open.api.sdk.response.list;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.list.CategoryAttrReadService.response.findAttrByIdUnlimitCate.CategoryAttrUnlimit;
import com.jd.open.api.sdk.response.AbstractResponse;

public class CategoryReadFindAttrByIdUnlimitCateResponse extends AbstractResponse {
   private CategoryAttrUnlimit findattrbyidunlimitcateResult;

   @JsonProperty("findattrbyidunlimitcate_result")
   public void setFindattrbyidunlimitcateResult(CategoryAttrUnlimit findattrbyidunlimitcateResult) {
      this.findattrbyidunlimitcateResult = findattrbyidunlimitcateResult;
   }

   @JsonProperty("findattrbyidunlimitcate_result")
   public CategoryAttrUnlimit getFindattrbyidunlimitcateResult() {
      return this.findattrbyidunlimitcateResult;
   }
}
