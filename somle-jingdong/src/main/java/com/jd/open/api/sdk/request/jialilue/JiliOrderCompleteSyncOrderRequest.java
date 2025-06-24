package com.jd.open.api.sdk.request.jialilue;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.jialilue.JiliOrderCompleteSyncOrderResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class JiliOrderCompleteSyncOrderRequest extends AbstractRequest implements JdRequest<JiliOrderCompleteSyncOrderResponse> {
   private Long tenantId;
   private String orderId;

   public void setTenantId(Long tenantId) {
      this.tenantId = tenantId;
   }

   public Long getTenantId() {
      return this.tenantId;
   }

   public void setOrderId(String orderId) {
      this.orderId = orderId;
   }

   public String getOrderId() {
      return this.orderId;
   }

   public String getApiMethod() {
      return "jingdong.jili.order.complete.syncOrder";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("tenantId", this.tenantId);
      pmap.put("orderId", this.orderId);
      return JsonUtil.toJson(pmap);
   }

   public Class<JiliOrderCompleteSyncOrderResponse> getResponseClass() {
      return JiliOrderCompleteSyncOrderResponse.class;
   }
}
