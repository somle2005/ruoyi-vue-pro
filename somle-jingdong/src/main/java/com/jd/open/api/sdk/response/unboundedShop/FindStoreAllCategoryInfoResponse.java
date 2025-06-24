package com.jd.open.api.sdk.response.unboundedShop;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.unboundedShop.StoreCategoryProvider.response.findStoreAllCategoryInfo.StoreCategoryBasicInfoTo;
import com.jd.open.api.sdk.response.AbstractResponse;
import java.util.List;

public class FindStoreAllCategoryInfoResponse extends AbstractResponse {
   private List<StoreCategoryBasicInfoTo> result;

   @JsonProperty("result")
   public void setResult(List<StoreCategoryBasicInfoTo> result) {
      this.result = result;
   }

   @JsonProperty("result")
   public List<StoreCategoryBasicInfoTo> getResult() {
      return this.result;
   }
}
