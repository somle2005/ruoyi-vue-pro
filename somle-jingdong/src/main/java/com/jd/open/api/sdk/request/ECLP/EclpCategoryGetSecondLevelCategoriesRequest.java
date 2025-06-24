package com.jd.open.api.sdk.request.ECLP;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ECLP.EclpCategoryGetSecondLevelCategoriesResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class EclpCategoryGetSecondLevelCategoriesRequest extends AbstractRequest implements JdRequest<EclpCategoryGetSecondLevelCategoriesResponse> {
   private Long firstCategoryNo;
   private Long secondCategoryNo;

   public void setFirstCategoryNo(Long firstCategoryNo) {
      this.firstCategoryNo = firstCategoryNo;
   }

   public Long getFirstCategoryNo() {
      return this.firstCategoryNo;
   }

   public void setSecondCategoryNo(Long secondCategoryNo) {
      this.secondCategoryNo = secondCategoryNo;
   }

   public Long getSecondCategoryNo() {
      return this.secondCategoryNo;
   }

   public String getApiMethod() {
      return "jingdong.eclp.category.getSecondLevelCategories";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("firstCategoryNo", this.firstCategoryNo);
      pmap.put("secondCategoryNo", this.secondCategoryNo);
      return JsonUtil.toJson(pmap);
   }

   public Class<EclpCategoryGetSecondLevelCategoriesResponse> getResponseClass() {
      return EclpCategoryGetSecondLevelCategoriesResponse.class;
   }
}
