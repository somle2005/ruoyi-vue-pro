package com.jd.open.api.sdk.request.hudong;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.hudong.SelfOperationShopSearchApiServiceSearchRecomJsfServiceDeleteResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class SelfOperationShopSearchApiServiceSearchRecomJsfServiceDeleteRequest extends AbstractRequest implements JdRequest<SelfOperationShopSearchApiServiceSearchRecomJsfServiceDeleteResponse> {
   private Long recomId;

   public void setRecomId(Long recomId) {
      this.recomId = recomId;
   }

   public Long getRecomId() {
      return this.recomId;
   }

   public String getApiMethod() {
      return "jingdong.self.operation.shop.search.api.service.SearchRecomJsfService.delete";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("recomId", this.recomId);
      return JsonUtil.toJson(pmap);
   }

   public Class<SelfOperationShopSearchApiServiceSearchRecomJsfServiceDeleteResponse> getResponseClass() {
      return SelfOperationShopSearchApiServiceSearchRecomJsfServiceDeleteResponse.class;
   }
}
