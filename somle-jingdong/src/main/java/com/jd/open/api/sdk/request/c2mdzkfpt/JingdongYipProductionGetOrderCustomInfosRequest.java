package com.jd.open.api.sdk.request.c2mdzkfpt;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.c2mdzkfpt.CustomOrderInfoOpenService.request.getOrderCustomInfos.CustomOrderInfoBatchQueryEntity;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.c2mdzkfpt.JingdongYipProductionGetOrderCustomInfosResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class JingdongYipProductionGetOrderCustomInfosRequest extends AbstractRequest implements JdRequest<JingdongYipProductionGetOrderCustomInfosResponse> {
   private CustomOrderInfoBatchQueryEntity query;
   private String venderId;

   public String getApiMethod() {
      return "jingdong.jingdong.yip.production.getOrderCustomInfos";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("query", this.query);
      pmap.put("venderId", this.venderId);
      return JsonUtil.toJson(pmap);
   }

   public Class<JingdongYipProductionGetOrderCustomInfosResponse> getResponseClass() {
      return JingdongYipProductionGetOrderCustomInfosResponse.class;
   }

   @JsonProperty("query")
   public void setQuery(CustomOrderInfoBatchQueryEntity query) {
      this.query = query;
   }

   @JsonProperty("query")
   public CustomOrderInfoBatchQueryEntity getQuery() {
      return this.query;
   }

   @JsonProperty("venderId")
   public void setVenderId(String venderId) {
      this.venderId = venderId;
   }

   @JsonProperty("venderId")
   public String getVenderId() {
      return this.venderId;
   }
}
