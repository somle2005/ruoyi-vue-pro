package com.jd.open.api.sdk.request.plgz;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.plgz.CategoryOptionalOperateFacade.request.batchJudgeCategorySelect.CallerParam;
import com.jd.open.api.sdk.domain.plgz.CategoryOptionalOperateFacade.request.batchJudgeCategorySelect.CategoryOperateQuery;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.plgz.SellerQuaCenterCategoryOptionalOperateFacadeBatchJudgeCategorySelectResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class SellerQuaCenterCategoryOptionalOperateFacadeBatchJudgeCategorySelectRequest extends AbstractRequest implements JdRequest<SellerQuaCenterCategoryOptionalOperateFacadeBatchJudgeCategorySelectResponse> {
   private CategoryOperateQuery categoryOperateQuery;
   private CallerParam callerParam;

   public String getApiMethod() {
      return "jingdong.seller.qua.center.CategoryOptionalOperateFacade.batchJudgeCategorySelect";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("categoryOperateQuery", this.categoryOperateQuery);
      pmap.put("callerParam", this.callerParam);
      return JsonUtil.toJson(pmap);
   }

   public Class<SellerQuaCenterCategoryOptionalOperateFacadeBatchJudgeCategorySelectResponse> getResponseClass() {
      return SellerQuaCenterCategoryOptionalOperateFacadeBatchJudgeCategorySelectResponse.class;
   }

   @JsonProperty("categoryOperateQuery")
   public void setCategoryOperateQuery(CategoryOperateQuery categoryOperateQuery) {
      this.categoryOperateQuery = categoryOperateQuery;
   }

   @JsonProperty("categoryOperateQuery")
   public CategoryOperateQuery getCategoryOperateQuery() {
      return this.categoryOperateQuery;
   }

   @JsonProperty("callerParam")
   public void setCallerParam(CallerParam callerParam) {
      this.callerParam = callerParam;
   }

   @JsonProperty("callerParam")
   public CallerParam getCallerParam() {
      return this.callerParam;
   }
}
