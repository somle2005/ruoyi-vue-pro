package com.jd.open.api.sdk.request.order;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.order.PopOrderFbpGetResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class PopOrderFbpGetRequest extends AbstractRequest implements JdRequest<PopOrderFbpGetResponse> {
   private String orderState;
   private int colType;
   private String optionalFields;
   private long orderId;

   public void setOrderState(String orderState) {
      this.orderState = orderState;
   }

   public String getOrderState() {
      return this.orderState;
   }

   public void setColType(int colType) {
      this.colType = colType;
   }

   public int getColType() {
      return this.colType;
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
      return "jingdong.pop.order.fbp.get";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("orderState", this.orderState);
      pmap.put("colType", this.colType);
      pmap.put("optionalFields", this.optionalFields);
      pmap.put("orderId", this.orderId);
      return JsonUtil.toJson(pmap);
   }

   public Class<PopOrderFbpGetResponse> getResponseClass() {
      return PopOrderFbpGetResponse.class;
   }
}
