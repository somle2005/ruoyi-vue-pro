package com.jd.open.api.sdk.request.alpha;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.alpha.OrderTrackGetTrackShowResultResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class OrderTrackGetTrackShowResultRequest extends AbstractRequest implements JdRequest<OrderTrackGetTrackShowResultResponse> {
   private String userPin;
   private String orderId;
   private String userIP;

   public void setUserPin(String userPin) {
      this.userPin = userPin;
   }

   public String getUserPin() {
      return this.userPin;
   }

   public void setOrderId(String orderId) {
      this.orderId = orderId;
   }

   public String getOrderId() {
      return this.orderId;
   }

   public void setUserIP(String userIP) {
      this.userIP = userIP;
   }

   public String getUserIP() {
      return this.userIP;
   }

   public String getApiMethod() {
      return "jingdong.order.track.getTrackShowResult";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("userPin", this.userPin);
      pmap.put("orderId", this.orderId);
      pmap.put("userIP", this.userIP);
      return JsonUtil.toJson(pmap);
   }

   public Class<OrderTrackGetTrackShowResultResponse> getResponseClass() {
      return OrderTrackGetTrackShowResultResponse.class;
   }
}
