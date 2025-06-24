package com.jd.open.api.sdk.request.order;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.order.OrderFbpGetResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class OrderFbpGetRequest extends AbstractRequest implements JdRequest<OrderFbpGetResponse> {
   private String orderId;
   private String optionalFields;

   public String getApiMethod() {
      return "360buy.order.fbp.get";
   }

   public Class<OrderFbpGetResponse> getResponseClass() {
      return OrderFbpGetResponse.class;
   }

   public String getAppJsonParams() throws IOException {
      Map<String, String> map = new TreeMap();
      map.put("order_id", this.orderId);
      map.put("optional_fields", this.optionalFields);
      return JsonUtil.toJson(map);
   }

   public String getOrderId() {
      return this.orderId;
   }

   public void setOrderId(String orderId) {
      this.orderId = orderId;
   }

   public String getOptionalFields() {
      return this.optionalFields;
   }

   public void setOptionalFields(String optionalFields) {
      this.optionalFields = optionalFields;
   }
}
