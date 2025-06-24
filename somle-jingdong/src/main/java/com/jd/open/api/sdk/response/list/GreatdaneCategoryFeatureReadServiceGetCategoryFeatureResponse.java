package com.jd.open.api.sdk.response.list;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.list.CategoryFeatureReadService.response.getCategoryFeature.GreatDaneResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class GreatdaneCategoryFeatureReadServiceGetCategoryFeatureResponse extends AbstractResponse {
   private GreatDaneResult greatDaneResult;

   @JsonProperty("greatDaneResult")
   public void setGreatDaneResult(GreatDaneResult greatDaneResult) {
      this.greatDaneResult = greatDaneResult;
   }

   @JsonProperty("greatDaneResult")
   public GreatDaneResult getGreatDaneResult() {
      return this.greatDaneResult;
   }
}
