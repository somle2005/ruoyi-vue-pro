package com.jd.open.api.sdk.request.list;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.list.CategoryFeatureReadService.request.get.GetCategoryFeatureByKeyRecursiveParam;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.list.GreatdaneCategoryFeatureRecursiveGetResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class GreatdaneCategoryFeatureRecursiveGetRequest extends AbstractRequest implements JdRequest<GreatdaneCategoryFeatureRecursiveGetResponse> {
   private GetCategoryFeatureByKeyRecursiveParam getCategoryFeatureByKeyRecursiveParam;

   public String getApiMethod() {
      return "jingdong.greatdane.category.feature.recursive.get";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("getCategoryFeatureByKeyRecursiveParam", this.getCategoryFeatureByKeyRecursiveParam);
      return JsonUtil.toJson(pmap);
   }

   public Class<GreatdaneCategoryFeatureRecursiveGetResponse> getResponseClass() {
      return GreatdaneCategoryFeatureRecursiveGetResponse.class;
   }

   @JsonProperty("getCategoryFeatureByKeyRecursiveParam")
   public void setGetCategoryFeatureByKeyRecursiveParam(GetCategoryFeatureByKeyRecursiveParam getCategoryFeatureByKeyRecursiveParam) {
      this.getCategoryFeatureByKeyRecursiveParam = getCategoryFeatureByKeyRecursiveParam;
   }

   @JsonProperty("getCategoryFeatureByKeyRecursiveParam")
   public GetCategoryFeatureByKeyRecursiveParam getGetCategoryFeatureByKeyRecursiveParam() {
      return this.getCategoryFeatureByKeyRecursiveParam;
   }
}
