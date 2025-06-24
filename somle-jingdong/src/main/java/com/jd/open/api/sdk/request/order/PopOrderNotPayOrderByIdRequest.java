package com.jd.open.api.sdk.request.order;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.order.PopOrderNotPayOrderByIdResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class PopOrderNotPayOrderByIdRequest extends AbstractRequest implements JdRequest<PopOrderNotPayOrderByIdResponse> {
   private long orderId;

   public void setOrderId(long orderId) {
      this.orderId = orderId;
   }

   public long getOrderId() {
      return this.orderId;
   }

   public String getApiMethod() {
      return "jingdong.pop.order.notPayOrderById";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("orderId", this.orderId);
      return JsonUtil.toJson(pmap);
   }

   public Class<PopOrderNotPayOrderByIdResponse> getResponseClass() {
      return PopOrderNotPayOrderByIdResponse.class;
   }
}
