package com.jd.open.api.sdk.request.order;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.order.PopOrderOcsQueryResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class PopOrderOcsQueryRequest extends AbstractRequest implements JdRequest<PopOrderOcsQueryResponse> {
   private Long orderId;

   public void setOrderId(Long orderId) {
      this.orderId = orderId;
   }

   public Long getOrderId() {
      return this.orderId;
   }

   public String getApiMethod() {
      return "jingdong.pop.order.ocs.query";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("orderId", this.orderId);
      return JsonUtil.toJson(pmap);
   }

   public Class<PopOrderOcsQueryResponse> getResponseClass() {
      return PopOrderOcsQueryResponse.class;
   }
}
