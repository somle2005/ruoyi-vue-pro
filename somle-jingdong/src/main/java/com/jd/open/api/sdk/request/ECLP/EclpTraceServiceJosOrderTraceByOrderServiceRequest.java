package com.jd.open.api.sdk.request.ECLP;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ECLP.EclpTraceServiceJosOrderTraceByOrderServiceResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class EclpTraceServiceJosOrderTraceByOrderServiceRequest extends AbstractRequest implements JdRequest<EclpTraceServiceJosOrderTraceByOrderServiceResponse> {
   private String orderId;
   private String role;
   private String userId;

   public void setOrderId(String orderId) {
      this.orderId = orderId;
   }

   public String getOrderId() {
      return this.orderId;
   }

   public void setRole(String role) {
      this.role = role;
   }

   public String getRole() {
      return this.role;
   }

   public void setUserId(String userId) {
      this.userId = userId;
   }

   public String getUserId() {
      return this.userId;
   }

   public String getApiMethod() {
      return "jingdong.eclp.trace.service.jos.OrderTraceByOrderService";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("orderId", this.orderId);
      pmap.put("role", this.role);
      pmap.put("userId", this.userId);
      return JsonUtil.toJson(pmap);
   }

   public Class<EclpTraceServiceJosOrderTraceByOrderServiceResponse> getResponseClass() {
      return EclpTraceServiceJosOrderTraceByOrderServiceResponse.class;
   }
}
