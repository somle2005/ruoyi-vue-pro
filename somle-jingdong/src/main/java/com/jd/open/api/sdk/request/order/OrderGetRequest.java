package com.jd.open.api.sdk.request.order;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.order.OrderGetResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class OrderGetRequest extends AbstractRequest implements JdRequest<OrderGetResponse> {
   private String orderId;
   private String optionalFields;
   private String orderState;

   public String getApiMethod() {
      return "360buy.order.get";
   }

   public Class<OrderGetResponse> getResponseClass() {
      return OrderGetResponse.class;
   }

   public String getAppJsonParams() throws IOException {
      Map<String, String> map = new TreeMap();
      map.put("order_id", this.orderId);
      map.put("order_state", this.orderState);
      map.put("optional_fields", this.optionalFields);
      return JsonUtil.toJson(map);
   }

   public String getOrderState() {
      return this.orderState;
   }

   public void setOrderState(String orderState) {
      this.orderState = orderState;
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
