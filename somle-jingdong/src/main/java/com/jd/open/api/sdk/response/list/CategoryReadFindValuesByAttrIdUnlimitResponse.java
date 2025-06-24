package com.jd.open.api.sdk.response.list;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.list.CategoryAttrValueReadService.response.findValuesByAttrIdUnlimit.CategoryAttrValueUnlimit;
import com.jd.open.api.sdk.response.AbstractResponse;
import java.util.List;

public class CategoryReadFindValuesByAttrIdUnlimitResponse extends AbstractResponse {
   private List<CategoryAttrValueUnlimit> findvaluesbyattridunlimitResult;

   @JsonProperty("findvaluesbyattridunlimit_result")
   public void setFindvaluesbyattridunlimitResult(List<CategoryAttrValueUnlimit> findvaluesbyattridunlimitResult) {
      this.findvaluesbyattridunlimitResult = findvaluesbyattridunlimitResult;
   }

   @JsonProperty("findvaluesbyattridunlimit_result")
   public List<CategoryAttrValueUnlimit> getFindvaluesbyattridunlimitResult() {
      return this.findvaluesbyattridunlimitResult;
   }
}
