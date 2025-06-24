package com.jd.open.api.sdk.request.ECLP;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ECLP.EclpTraceServiceJosOrderTraceByOrderServiceGetOrderTraceByISVOrderIdResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class EclpTraceServiceJosOrderTraceByOrderServiceGetOrderTraceByISVOrderIdRequest extends AbstractRequest implements JdRequest<EclpTraceServiceJosOrderTraceByOrderServiceGetOrderTraceByISVOrderIdResponse> {
   private String role;
   private String orderId;
   private String carrierCode;
   private Integer businessType;
   private String userId;

   public void setRole(String role) {
      this.role = role;
   }

   public String getRole() {
      return this.role;
   }

   public void setOrderId(String orderId) {
      this.orderId = orderId;
   }

   public String getOrderId() {
      return this.orderId;
   }

   public void setCarrierCode(String carrierCode) {
      this.carrierCode = carrierCode;
   }

   public String getCarrierCode() {
      return this.carrierCode;
   }

   public void setBusinessType(Integer businessType) {
      this.businessType = businessType;
   }

   public Integer getBusinessType() {
      return this.businessType;
   }

   public void setUserId(String userId) {
      this.userId = userId;
   }

   public String getUserId() {
      return this.userId;
   }

   public String getApiMethod() {
      return "jingdong.eclp.trace.service.jos.OrderTraceByOrderService.getOrderTraceByISVOrderId";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("role", this.role);
      pmap.put("orderId", this.orderId);
      pmap.put("carrierCode", this.carrierCode);
      pmap.put("businessType", this.businessType);
      pmap.put("userId", this.userId);
      return JsonUtil.toJson(pmap);
   }

   public Class<EclpTraceServiceJosOrderTraceByOrderServiceGetOrderTraceByISVOrderIdResponse> getResponseClass() {
      return EclpTraceServiceJosOrderTraceByOrderServiceGetOrderTraceByISVOrderIdResponse.class;
   }
}
