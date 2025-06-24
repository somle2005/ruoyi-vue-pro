package com.jd.open.api.sdk.request.plgz;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.plgz.BrandCategoryCheckIsvFacade.request.batchCheckBrandCategory.BrandCategoryBatchCheckParam;
import com.jd.open.api.sdk.domain.plgz.BrandCategoryCheckIsvFacade.request.batchCheckBrandCategory.CallerParam;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.plgz.SellerQuaCenterBrandCategoryCheckIsvFacadeBatchCheckBrandCategoryResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class SellerQuaCenterBrandCategoryCheckIsvFacadeBatchCheckBrandCategoryRequest extends AbstractRequest implements JdRequest<SellerQuaCenterBrandCategoryCheckIsvFacadeBatchCheckBrandCategoryResponse> {
   private BrandCategoryBatchCheckParam brandCategoryBatchCheckParam;
   private CallerParam callerParam;

   public String getApiMethod() {
      return "jingdong.seller.qua.center.BrandCategoryCheckIsvFacade.batchCheckBrandCategory";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("brandCategoryBatchCheckParam", this.brandCategoryBatchCheckParam);
      pmap.put("callerParam", this.callerParam);
      return JsonUtil.toJson(pmap);
   }

   public Class<SellerQuaCenterBrandCategoryCheckIsvFacadeBatchCheckBrandCategoryResponse> getResponseClass() {
      return SellerQuaCenterBrandCategoryCheckIsvFacadeBatchCheckBrandCategoryResponse.class;
   }

   @JsonProperty("brandCategoryBatchCheckParam")
   public void setBrandCategoryBatchCheckParam(BrandCategoryBatchCheckParam brandCategoryBatchCheckParam) {
      this.brandCategoryBatchCheckParam = brandCategoryBatchCheckParam;
   }

   @JsonProperty("brandCategoryBatchCheckParam")
   public BrandCategoryBatchCheckParam getBrandCategoryBatchCheckParam() {
      return this.brandCategoryBatchCheckParam;
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
