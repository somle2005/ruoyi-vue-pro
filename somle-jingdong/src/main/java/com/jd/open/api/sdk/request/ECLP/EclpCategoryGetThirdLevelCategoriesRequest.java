package com.jd.open.api.sdk.request.ECLP;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ECLP.EclpCategoryGetThirdLevelCategoriesResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class EclpCategoryGetThirdLevelCategoriesRequest extends AbstractRequest implements JdRequest<EclpCategoryGetThirdLevelCategoriesResponse> {
   private Long secondCategoryNo;
   private Long thirdCategoryNo;

   public void setSecondCategoryNo(Long secondCategoryNo) {
      this.secondCategoryNo = secondCategoryNo;
   }

   public Long getSecondCategoryNo() {
      return this.secondCategoryNo;
   }

   public void setThirdCategoryNo(Long thirdCategoryNo) {
      this.thirdCategoryNo = thirdCategoryNo;
   }

   public Long getThirdCategoryNo() {
      return this.thirdCategoryNo;
   }

   public String getApiMethod() {
      return "jingdong.eclp.category.getThirdLevelCategories";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("secondCategoryNo", this.secondCategoryNo);
      pmap.put("thirdCategoryNo", this.thirdCategoryNo);
      return JsonUtil.toJson(pmap);
   }

   public Class<EclpCategoryGetThirdLevelCategoriesResponse> getResponseClass() {
      return EclpCategoryGetThirdLevelCategoriesResponse.class;
   }
}
