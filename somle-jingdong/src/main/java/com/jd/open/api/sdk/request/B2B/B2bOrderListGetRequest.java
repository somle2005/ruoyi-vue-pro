package com.jd.open.api.sdk.request.B2B;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.B2B.B2BOrderMiddleProvider.request.get.OrderPaginationReq;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.B2B.B2bOrderListGetResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class B2bOrderListGetRequest extends AbstractRequest implements JdRequest<B2bOrderListGetResponse> {
   private OrderPaginationReq req;

   public String getApiMethod() {
      return "jingdong.b2b.order.list.get";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("req", this.req);
      return JsonUtil.toJson(pmap);
   }

   public Class<B2bOrderListGetResponse> getResponseClass() {
      return B2bOrderListGetResponse.class;
   }

   @JsonProperty("req")
   public void setReq(OrderPaginationReq req) {
      this.req = req;
   }

   @JsonProperty("req")
   public OrderPaginationReq getReq() {
      return this.req;
   }
}
