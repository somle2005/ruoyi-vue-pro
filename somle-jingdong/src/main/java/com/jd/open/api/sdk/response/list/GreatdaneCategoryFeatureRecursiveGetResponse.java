package com.jd.open.api.sdk.response.list;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.list.CategoryFeatureReadService.response.get.GreatDaneResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class GreatdaneCategoryFeatureRecursiveGetResponse extends AbstractResponse {
   private GreatDaneResult getCategoryFeatureByKeyRecursiveResponse;

   @JsonProperty("getCategoryFeatureByKeyRecursiveResponse")
   public void setGetCategoryFeatureByKeyRecursiveResponse(GreatDaneResult getCategoryFeatureByKeyRecursiveResponse) {
      this.getCategoryFeatureByKeyRecursiveResponse = getCategoryFeatureByKeyRecursiveResponse;
   }

   @JsonProperty("getCategoryFeatureByKeyRecursiveResponse")
   public GreatDaneResult getGetCategoryFeatureByKeyRecursiveResponse() {
      return this.getCategoryFeatureByKeyRecursiveResponse;
   }
}
