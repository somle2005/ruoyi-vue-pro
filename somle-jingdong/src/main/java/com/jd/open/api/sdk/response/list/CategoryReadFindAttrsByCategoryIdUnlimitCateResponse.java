package com.jd.open.api.sdk.response.list;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.list.CategoryAttrReadService.response.findAttrsByCategoryIdUnlimitCate.CategoryAttrUnlimit;
import com.jd.open.api.sdk.response.AbstractResponse;
import java.util.List;

public class CategoryReadFindAttrsByCategoryIdUnlimitCateResponse extends AbstractResponse {
   private List<CategoryAttrUnlimit> findattrsbycategoryidunlimitcateResult;

   @JsonProperty("findattrsbycategoryidunlimitcate_result")
   public void setFindattrsbycategoryidunlimitcateResult(List<CategoryAttrUnlimit> findattrsbycategoryidunlimitcateResult) {
      this.findattrsbycategoryidunlimitcateResult = findattrsbycategoryidunlimitcateResult;
   }

   @JsonProperty("findattrsbycategoryidunlimitcate_result")
   public List<CategoryAttrUnlimit> getFindattrsbycategoryidunlimitcateResult() {
      return this.findattrsbycategoryidunlimitcateResult;
   }
}
