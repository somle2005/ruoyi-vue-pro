package com.jd.open.api.sdk.request.plgz;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.plgz.BrandOperateFacade.request.queryOperateBrand.BrandOperateQuery;
import com.jd.open.api.sdk.domain.plgz.BrandOperateFacade.request.queryOperateBrand.CallerParam;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.plgz.SellerQuaCenterBrandOperateFacadeQueryOperateBrandResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class SellerQuaCenterBrandOperateFacadeQueryOperateBrandRequest extends AbstractRequest implements JdRequest<SellerQuaCenterBrandOperateFacadeQueryOperateBrandResponse> {
   private BrandOperateQuery brandOperateQuery;
   private CallerParam callerParam;

   public String getApiMethod() {
      return "jingdong.seller.qua.center.BrandOperateFacade.queryOperateBrand";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("brandOperateQuery", this.brandOperateQuery);
      pmap.put("callerParam", this.callerParam);
      return JsonUtil.toJson(pmap);
   }

   public Class<SellerQuaCenterBrandOperateFacadeQueryOperateBrandResponse> getResponseClass() {
      return SellerQuaCenterBrandOperateFacadeQueryOperateBrandResponse.class;
   }

   @JsonProperty("brandOperateQuery")
   public void setBrandOperateQuery(BrandOperateQuery brandOperateQuery) {
      this.brandOperateQuery = brandOperateQuery;
   }

   @JsonProperty("brandOperateQuery")
   public BrandOperateQuery getBrandOperateQuery() {
      return this.brandOperateQuery;
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
