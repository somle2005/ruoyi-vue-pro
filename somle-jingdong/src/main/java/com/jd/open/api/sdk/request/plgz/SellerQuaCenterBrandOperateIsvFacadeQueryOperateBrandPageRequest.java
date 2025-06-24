package com.jd.open.api.sdk.request.plgz;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.plgz.BrandOperateIsvFacade.request.queryOperateBrandPage.BrandOperateQuery;
import com.jd.open.api.sdk.domain.plgz.BrandOperateIsvFacade.request.queryOperateBrandPage.CallerParam;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.plgz.SellerQuaCenterBrandOperateIsvFacadeQueryOperateBrandPageResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class SellerQuaCenterBrandOperateIsvFacadeQueryOperateBrandPageRequest extends AbstractRequest implements JdRequest<SellerQuaCenterBrandOperateIsvFacadeQueryOperateBrandPageResponse> {
   private BrandOperateQuery brandOperateDto;
   private CallerParam callerParam;

   public String getApiMethod() {
      return "jingdong.seller.qua.center.BrandOperateIsvFacade.queryOperateBrandPage";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("brandOperateDto", this.brandOperateDto);
      pmap.put("callerParam", this.callerParam);
      return JsonUtil.toJson(pmap);
   }

   public Class<SellerQuaCenterBrandOperateIsvFacadeQueryOperateBrandPageResponse> getResponseClass() {
      return SellerQuaCenterBrandOperateIsvFacadeQueryOperateBrandPageResponse.class;
   }

   @JsonProperty("brandOperateDto")
   public void setBrandOperateDto(BrandOperateQuery brandOperateDto) {
      this.brandOperateDto = brandOperateDto;
   }

   @JsonProperty("brandOperateDto")
   public BrandOperateQuery getBrandOperateDto() {
      return this.brandOperateDto;
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
