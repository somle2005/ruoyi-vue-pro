package com.jd.open.api.sdk.request.customsglobalAPI;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.customsglobalAPI.PopCustomsCenterServiceSoaDlzClearanceCustomClearanceResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class PopCustomsCenterServiceSoaDlzClearanceCustomClearanceRequest extends AbstractRequest implements JdRequest<PopCustomsCenterServiceSoaDlzClearanceCustomClearanceResponse> {
   private String customsId;
   private String serviceId;
   private String orderId;
   private String platformId;
   private int result;
   private String message;
   private int goodsCheck;

   public void setCustomsId(String customsId) {
      this.customsId = customsId;
   }

   public String getCustomsId() {
      return this.customsId;
   }

   public void setServiceId(String serviceId) {
      this.serviceId = serviceId;
   }

   public String getServiceId() {
      return this.serviceId;
   }

   public void setOrderId(String orderId) {
      this.orderId = orderId;
   }

   public String getOrderId() {
      return this.orderId;
   }

   public void setPlatformId(String platformId) {
      this.platformId = platformId;
   }

   public String getPlatformId() {
      return this.platformId;
   }

   public void setResult(int result) {
      this.result = result;
   }

   public int getResult() {
      return this.result;
   }

   public void setMessage(String message) {
      this.message = message;
   }

   public String getMessage() {
      return this.message;
   }

   public void setGoodsCheck(int goodsCheck) {
      this.goodsCheck = goodsCheck;
   }

   public int getGoodsCheck() {
      return this.goodsCheck;
   }

   public String getApiMethod() {
      return "jingdong.pop.customs.center.service.soa.dlz.clearance.customClearance";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("customsId", this.customsId);
      pmap.put("serviceId", this.serviceId);
      pmap.put("orderId", this.orderId);
      pmap.put("platformId", this.platformId);
      pmap.put("result", this.result);
      pmap.put("message", this.message);
      pmap.put("goodsCheck", this.goodsCheck);
      return JsonUtil.toJson(pmap);
   }

   public Class<PopCustomsCenterServiceSoaDlzClearanceCustomClearanceResponse> getResponseClass() {
      return PopCustomsCenterServiceSoaDlzClearanceCustomClearanceResponse.class;
   }
}
