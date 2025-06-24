package com.jd.open.api.sdk.request.hudong;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.hudong.SelfOperationShopSearchApiServiceSearchRecomJsfServiceGetSearchRecomListResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class SelfOperationShopSearchApiServiceSearchRecomJsfServiceGetSearchRecomListRequest extends AbstractRequest implements JdRequest<SelfOperationShopSearchApiServiceSearchRecomJsfServiceGetSearchRecomListResponse> {
   private String version;

   public void setVersion(String version) {
      this.version = version;
   }

   public String getVersion() {
      return this.version;
   }

   public String getApiMethod() {
      return "jingdong.self.operation.shop.search.api.service.SearchRecomJsfService.getSearchRecomList";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("version", this.version);
      return JsonUtil.toJson(pmap);
   }

   public Class<SelfOperationShopSearchApiServiceSearchRecomJsfServiceGetSearchRecomListResponse> getResponseClass() {
      return SelfOperationShopSearchApiServiceSearchRecomJsfServiceGetSearchRecomListResponse.class;
   }
}
