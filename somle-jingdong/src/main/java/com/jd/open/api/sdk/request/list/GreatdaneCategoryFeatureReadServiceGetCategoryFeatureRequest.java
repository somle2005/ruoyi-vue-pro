package com.jd.open.api.sdk.request.list;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.list.CategoryFeatureReadService.request.getCategoryFeature.GetCategoryFeatureParam;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.list.GreatdaneCategoryFeatureReadServiceGetCategoryFeatureResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class GreatdaneCategoryFeatureReadServiceGetCategoryFeatureRequest extends AbstractRequest implements JdRequest<GreatdaneCategoryFeatureReadServiceGetCategoryFeatureResponse> {
   private GetCategoryFeatureParam GetCategoryFeatureParam;

   public String getApiMethod() {
      return "jingdong.greatdane.CategoryFeatureReadService.getCategoryFeature";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("GetCategoryFeatureParam", this.GetCategoryFeatureParam);
      return JsonUtil.toJson(pmap);
   }

   public Class<GreatdaneCategoryFeatureReadServiceGetCategoryFeatureResponse> getResponseClass() {
      return GreatdaneCategoryFeatureReadServiceGetCategoryFeatureResponse.class;
   }

   @JsonProperty("GetCategoryFeatureParam")
   public void setGetCategoryFeatureParam(GetCategoryFeatureParam GetCategoryFeatureParam) {
      this.GetCategoryFeatureParam = GetCategoryFeatureParam;
   }

   @JsonProperty("GetCategoryFeatureParam")
   public GetCategoryFeatureParam getGetCategoryFeatureParam() {
      return this.GetCategoryFeatureParam;
   }
}
