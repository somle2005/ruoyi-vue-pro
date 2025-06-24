package com.jd.open.api.sdk.request.mall;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.mall.QueryOrderPayResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class QueryOrderPayRequest extends AbstractRequest implements JdRequest<QueryOrderPayResponse> {
   private String pin;
   private String merchantId;
   private String orderId;
   private String appToken;
   private String appId;
   private String systemNo;
   private String merchantOrderNo;

   public void setPin(String pin) {
      this.pin = pin;
   }

   public String getPin() {
      return this.pin;
   }

   public void setMerchantId(String merchantId) {
      this.merchantId = merchantId;
   }

   public String getMerchantId() {
      return this.merchantId;
   }

   public void setOrderId(String orderId) {
      this.orderId = orderId;
   }

   public String getOrderId() {
      return this.orderId;
   }

   public void setAppToken(String appToken) {
      this.appToken = appToken;
   }

   public String getAppToken() {
      return this.appToken;
   }

   public void setAppId(String appId) {
      this.appId = appId;
   }

   public String getAppId() {
      return this.appId;
   }

   public void setSystemNo(String systemNo) {
      this.systemNo = systemNo;
   }

   public String getSystemNo() {
      return this.systemNo;
   }

   public void setMerchantOrderNo(String merchantOrderNo) {
      this.merchantOrderNo = merchantOrderNo;
   }

   public String getMerchantOrderNo() {
      return this.merchantOrderNo;
   }

   public String getApiMethod() {
      return "jingdong.queryOrderPay";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("pin", this.pin);
      pmap.put("merchantId", this.merchantId);
      pmap.put("orderId", this.orderId);
      pmap.put("appToken", this.appToken);
      pmap.put("appId", this.appId);
      pmap.put("systemNo", this.systemNo);
      pmap.put("merchantOrderNo", this.merchantOrderNo);
      return JsonUtil.toJson(pmap);
   }

   public Class<QueryOrderPayResponse> getResponseClass() {
      return QueryOrderPayResponse.class;
   }
}
