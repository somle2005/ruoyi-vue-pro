package com.jd.open.api.sdk.request.order;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.order.OrderSoplPrintDataGetResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class OrderSoplPrintDataGetRequest extends AbstractRequest implements JdRequest<OrderSoplPrintDataGetResponse> {
   private String orderId;

   public String getApiMethod() {
      return "360buy.order.sopl.print.data.get";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, String> map = new TreeMap();
      map.put("order_id", this.orderId);
      return JsonUtil.toJson(map);
   }

   public Class<OrderSoplPrintDataGetResponse> getResponseClass() {
      return OrderSoplPrintDataGetResponse.class;
   }

   public String getOrderId() {
      return this.orderId;
   }

   public void setOrderId(String orderId) {
      this.orderId = orderId;
   }
}
