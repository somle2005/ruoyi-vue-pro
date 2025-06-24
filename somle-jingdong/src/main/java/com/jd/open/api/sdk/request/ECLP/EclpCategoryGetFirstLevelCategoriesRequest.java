package com.jd.open.api.sdk.request.ECLP;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ECLP.EclpCategoryGetFirstLevelCategoriesResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class EclpCategoryGetFirstLevelCategoriesRequest extends AbstractRequest implements JdRequest<EclpCategoryGetFirstLevelCategoriesResponse> {
   public String getApiMethod() {
      return "jingdong.eclp.category.getFirstLevelCategories";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      return JsonUtil.toJson(pmap);
   }

   public Class<EclpCategoryGetFirstLevelCategoriesResponse> getResponseClass() {
      return EclpCategoryGetFirstLevelCategoriesResponse.class;
   }
}
