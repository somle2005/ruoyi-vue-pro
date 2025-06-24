package com.jd.open.api.sdk.request.refundapply;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.refundapply.ComJdEcoCancelorderGatewayApiOrderAdjustResultServiceResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class ComJdEcoCancelorderGatewayApiOrderAdjustResultServiceRequest extends AbstractRequest implements JdRequest<ComJdEcoCancelorderGatewayApiOrderAdjustResultServiceResponse> {
   private String appName;
   private String trackId;
   private String appId;
   private String clientIp;
   private Long orderId;
   private Long requestId;

   public void setAppName(String appName) {
      this.appName = appName;
   }

   public String getAppName() {
      return this.appName;
   }

   public void setTrackId(String trackId) {
      this.trackId = trackId;
   }

   public String getTrackId() {
      return this.trackId;
   }

   public void setAppId(String appId) {
      this.appId = appId;
   }

   public String getAppId() {
      return this.appId;
   }

   public void setClientIp(String clientIp) {
      this.clientIp = clientIp;
   }

   public String getClientIp() {
      return this.clientIp;
   }

   public void setOrderId(Long orderId) {
      this.orderId = orderId;
   }

   public Long getOrderId() {
      return this.orderId;
   }

   public void setRequestId(Long requestId) {
      this.requestId = requestId;
   }

   public Long getRequestId() {
      return this.requestId;
   }

   public String getApiMethod() {
      return "jingdong.com.jd.eco.cancelorder.gateway.api.OrderAdjustResultService";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("appName", this.appName);
      pmap.put("trackId", this.trackId);
      pmap.put("appId", this.appId);
      pmap.put("clientIp", this.clientIp);
      pmap.put("orderId", this.orderId);
      pmap.put("requestId", this.requestId);
      return JsonUtil.toJson(pmap);
   }

   public Class<ComJdEcoCancelorderGatewayApiOrderAdjustResultServiceResponse> getResponseClass() {
      return ComJdEcoCancelorderGatewayApiOrderAdjustResultServiceResponse.class;
   }
}
