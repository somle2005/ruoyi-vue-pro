package com.jd.open.api.sdk.request.Omni_channel;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.Omni_channel.PerformancePlatformServiceCallCancelOrderResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class PerformancePlatformServiceCallCancelOrderRequest extends AbstractRequest implements JdRequest<PerformancePlatformServiceCallCancelOrderResponse> {
   private String authKey;
   private String pin;
   private String reason;
   private String orderId;
   private String reasonId;

   public void setAuthKey(String authKey) {
      this.authKey = authKey;
   }

   public String getAuthKey() {
      return this.authKey;
   }

   public void setPin(String pin) {
      this.pin = pin;
   }

   public String getPin() {
      return this.pin;
   }

   public void setReason(String reason) {
      this.reason = reason;
   }

   public String getReason() {
      return this.reason;
   }

   public void setOrderId(String orderId) {
      this.orderId = orderId;
   }

   public String getOrderId() {
      return this.orderId;
   }

   public void setReasonId(String reasonId) {
      this.reasonId = reasonId;
   }

   public String getReasonId() {
      return this.reasonId;
   }

   public String getApiMethod() {
      return "jingdong.PerformancePlatformService.callCancelOrder";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("authKey", this.authKey);
      pmap.put("pin", this.pin);
      pmap.put("reason", this.reason);
      pmap.put("orderId", this.orderId);
      pmap.put("reasonId", this.reasonId);
      return JsonUtil.toJson(pmap);
   }

   public Class<PerformancePlatformServiceCallCancelOrderResponse> getResponseClass() {
      return PerformancePlatformServiceCallCancelOrderResponse.class;
   }
}
