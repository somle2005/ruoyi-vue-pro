package com.jd.open.api.sdk.request.list;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.list.BrandReadService.request.getBrandByIds.GetBrandByIdsParam;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.list.GetBrandByIdsResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class GetBrandByIdsRequest extends AbstractRequest implements JdRequest<GetBrandByIdsResponse> {
   private GetBrandByIdsParam GetBrandByIdsParam;

   public String getApiMethod() {
      return "jingdong.getBrandByIds";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("GetBrandByIdsParam", this.GetBrandByIdsParam);
      return JsonUtil.toJson(pmap);
   }

   public Class<GetBrandByIdsResponse> getResponseClass() {
      return GetBrandByIdsResponse.class;
   }

   @JsonProperty("GetBrandByIdsParam")
   public void setGetBrandByIdsParam(GetBrandByIdsParam GetBrandByIdsParam) {
      this.GetBrandByIdsParam = GetBrandByIdsParam;
   }

   @JsonProperty("GetBrandByIdsParam")
   public GetBrandByIdsParam getGetBrandByIdsParam() {
      return this.GetBrandByIdsParam;
   }
}
