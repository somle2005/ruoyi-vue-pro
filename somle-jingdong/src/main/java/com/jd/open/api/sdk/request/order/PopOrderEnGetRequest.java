package com.jd.open.api.sdk.request.order;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.order.PopOrderEnGetResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class PopOrderEnGetRequest extends AbstractRequest implements JdRequest<PopOrderEnGetResponse> {
   private String orderState;
   private String optionalFields;
   private long orderId;

   public void setOrderState(String orderState) {
      this.orderState = orderState;
   }

   public String getOrderState() {
      return this.orderState;
   }

   public void setOptionalFields(String optionalFields) {
      this.optionalFields = optionalFields;
   }

   public String getOptionalFields() {
      return this.optionalFields;
   }

   public void setOrderId(long orderId) {
      this.orderId = orderId;
   }

   public long getOrderId() {
      return this.orderId;
   }

   public String getApiMethod() {
      return "jingdong.pop.order.enGet";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("order_state", this.orderState);
      pmap.put("optional_fields", this.optionalFields);
      pmap.put("order_id", this.orderId);
      return JsonUtil.toJson(pmap);
   }

   public Class<PopOrderEnGetResponse> getResponseClass() {
      return PopOrderEnGetResponse.class;
   }
}
