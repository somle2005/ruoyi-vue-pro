package com.jd.open.api.sdk.request.order;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.order.OrderVenderRemarkQueryByOrderIdResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class OrderVenderRemarkQueryByOrderIdRequest extends AbstractRequest implements JdRequest<OrderVenderRemarkQueryByOrderIdResponse> {
   private long orderId;

   public void setOrderId(long orderId) {
      this.orderId = orderId;
   }

   public long getOrderId() {
      return this.orderId;
   }

   public String getApiMethod() {
      return "jingdong.order.venderRemark.queryByOrderId";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("order_id", this.orderId);
      return JsonUtil.toJson(pmap);
   }

   public Class<OrderVenderRemarkQueryByOrderIdResponse> getResponseClass() {
      return OrderVenderRemarkQueryByOrderIdResponse.class;
   }
}
