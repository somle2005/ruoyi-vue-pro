package com.jd.open.api.sdk.request.B2B;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.B2B.B2bOrderChildOrderListResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class B2bOrderChildOrderListRequest extends AbstractRequest implements JdRequest<B2bOrderChildOrderListResponse> {
   private String orderId;
   private String customKeys;

   public void setOrderId(String orderId) {
      this.orderId = orderId;
   }

   public String getOrderId() {
      return this.orderId;
   }

   public void setCustomKeys(String customKeys) {
      this.customKeys = customKeys;
   }

   public String getCustomKeys() {
      return this.customKeys;
   }

   public String getApiMethod() {
      return "jingdong.b2b.order.childOrderList";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("orderId", this.orderId);
      pmap.put("customKeys", this.customKeys);
      return JsonUtil.toJson(pmap);
   }

   public Class<B2bOrderChildOrderListResponse> getResponseClass() {
      return B2bOrderChildOrderListResponse.class;
   }
}
