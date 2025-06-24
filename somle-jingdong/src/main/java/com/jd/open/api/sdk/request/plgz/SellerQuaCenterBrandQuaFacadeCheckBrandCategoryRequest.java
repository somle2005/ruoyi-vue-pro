package com.jd.open.api.sdk.request.plgz;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.plgz.BrandQuaFacade.request.checkBrandCategory.BrandCategoryCheckParam;
import com.jd.open.api.sdk.domain.plgz.BrandQuaFacade.request.checkBrandCategory.CallerParam;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.plgz.SellerQuaCenterBrandQuaFacadeCheckBrandCategoryResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class SellerQuaCenterBrandQuaFacadeCheckBrandCategoryRequest extends AbstractRequest implements JdRequest<SellerQuaCenterBrandQuaFacadeCheckBrandCategoryResponse> {
   private BrandCategoryCheckParam brandCategoryCheckParam;
   private CallerParam callerParam;

   public String getApiMethod() {
      return "jingdong.seller.qua.center.BrandQuaFacade.checkBrandCategory";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("brandCategoryCheckParam", this.brandCategoryCheckParam);
      pmap.put("callerParam", this.callerParam);
      return JsonUtil.toJson(pmap);
   }

   public Class<SellerQuaCenterBrandQuaFacadeCheckBrandCategoryResponse> getResponseClass() {
      return SellerQuaCenterBrandQuaFacadeCheckBrandCategoryResponse.class;
   }

   @JsonProperty("brandCategoryCheckParam")
   public void setBrandCategoryCheckParam(BrandCategoryCheckParam brandCategoryCheckParam) {
      this.brandCategoryCheckParam = brandCategoryCheckParam;
   }

   @JsonProperty("brandCategoryCheckParam")
   public BrandCategoryCheckParam getBrandCategoryCheckParam() {
      return this.brandCategoryCheckParam;
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
