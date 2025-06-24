package com.jd.open.api.sdk.request.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.order.OrderListOpenService.request.merge.OrderMergeOpenQuery;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.order.JosOrderOaidMergeResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class JosOrderOaidMergeRequest extends AbstractRequest implements JdRequest<JosOrderOaidMergeResponse> {
   private OrderMergeOpenQuery request;

   public String getApiMethod() {
      return "jingdong.jos.order.oaid.merge";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("request", this.request);
      return JsonUtil.toJson(pmap);
   }

   public Class<JosOrderOaidMergeResponse> getResponseClass() {
      return JosOrderOaidMergeResponse.class;
   }

   @JsonProperty("request")
   public void setRequest(OrderMergeOpenQuery request) {
      this.request = request;
   }

   @JsonProperty("request")
   public OrderMergeOpenQuery getRequest() {
      return this.request;
   }
}
