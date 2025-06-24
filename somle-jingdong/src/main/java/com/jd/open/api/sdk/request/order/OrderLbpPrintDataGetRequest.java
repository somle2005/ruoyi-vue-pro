package com.jd.open.api.sdk.request.order;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.order.OrderLbpPrintDataGetResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class OrderLbpPrintDataGetRequest extends AbstractRequest implements JdRequest<OrderLbpPrintDataGetResponse> {
   private String orderId;

   public String getApiMethod() {
      return "360buy.order.lbp.print.data.get";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, String> map = new TreeMap();
      map.put("order_id", this.orderId);
      return JsonUtil.toJson(map);
   }

   public Class<OrderLbpPrintDataGetResponse> getResponseClass() {
      return OrderLbpPrintDataGetResponse.class;
   }

   public String getOrderId() {
      return this.orderId;
   }

   public void setOrderId(String orderId) {
      this.orderId = orderId;
   }
}
