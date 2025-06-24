package com.jd.open.api.sdk.request.sku;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.sku.JosOrderOaidWaitingResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class JosOrderOaidWaitingRequest extends AbstractRequest implements JdRequest<JosOrderOaidWaitingResponse> {
   private String orderType;
   private Boolean isTelephoneCalculate;
   private String orderId;

   public void setOrderType(String orderType) {
      this.orderType = orderType;
   }

   public String getOrderType() {
      return this.orderType;
   }

   public void setIsTelephoneCalculate(Boolean isTelephoneCalculate) {
      this.isTelephoneCalculate = isTelephoneCalculate;
   }

   public Boolean getIsTelephoneCalculate() {
      return this.isTelephoneCalculate;
   }

   public void setOrderId(String orderId) {
      this.orderId = orderId;
   }

   public String getOrderId() {
      return this.orderId;
   }

   public String getApiMethod() {
      return "jingdong.jos.order.oaid.waiting";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("orderType", this.orderType);
      pmap.put("isTelephoneCalculate", this.isTelephoneCalculate);
      pmap.put("orderId", this.orderId);
      return JsonUtil.toJson(pmap);
   }

   public Class<JosOrderOaidWaitingResponse> getResponseClass() {
      return JosOrderOaidWaitingResponse.class;
   }
}
