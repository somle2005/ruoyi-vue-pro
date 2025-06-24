package com.jd.open.api.sdk.request.sku;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.sku.OrderListOpenService.request.search.OrderListOpenQuery;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.sku.JosOrderOaidSearchResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class JosOrderOaidSearchRequest extends AbstractRequest implements JdRequest<JosOrderOaidSearchResponse> {
   private OrderListOpenQuery request;

   public String getApiMethod() {
      return "jingdong.jos.order.oaid.search";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("request", this.request);
      return JsonUtil.toJson(pmap);
   }

   public Class<JosOrderOaidSearchResponse> getResponseClass() {
      return JosOrderOaidSearchResponse.class;
   }

   @JsonProperty("request")
   public void setRequest(OrderListOpenQuery request) {
      this.request = request;
   }

   @JsonProperty("request")
   public OrderListOpenQuery getRequest() {
      return this.request;
   }
}
