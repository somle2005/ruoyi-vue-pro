package com.jd.open.api.sdk.request.B2B;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.B2B.BrandInfoServiceQueryBrandInfoByBidResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class BrandInfoServiceQueryBrandInfoByBidRequest extends AbstractRequest implements JdRequest<BrandInfoServiceQueryBrandInfoByBidResponse> {
   private Long brandId;

   public void setBrandId(Long brandId) {
      this.brandId = brandId;
   }

   public Long getBrandId() {
      return this.brandId;
   }

   public String getApiMethod() {
      return "jingdong.BrandInfoService.queryBrandInfoByBid";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("brandId", this.brandId);
      return JsonUtil.toJson(pmap);
   }

   public Class<BrandInfoServiceQueryBrandInfoByBidResponse> getResponseClass() {
      return BrandInfoServiceQueryBrandInfoByBidResponse.class;
   }
}
