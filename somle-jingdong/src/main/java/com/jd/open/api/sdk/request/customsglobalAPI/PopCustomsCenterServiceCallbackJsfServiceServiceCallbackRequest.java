package com.jd.open.api.sdk.request.customsglobalAPI;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.customsglobalAPI.PopCustomsCenterServiceCallbackJsfServiceServiceCallbackResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class PopCustomsCenterServiceCallbackJsfServiceServiceCallbackRequest extends AbstractRequest implements JdRequest<PopCustomsCenterServiceCallbackJsfServiceServiceCallbackResponse> {
   private Long orderId;
   private String serviceId;
   private String customsId;
   private Integer orderStatus;
   private String orderDesc;
   private int goodsCheck;
   private String orderIdStr;

   public void setOrderId(Long orderId) {
      this.orderId = orderId;
   }

   public Long getOrderId() {
      return this.orderId;
   }

   public void setServiceId(String serviceId) {
      this.serviceId = serviceId;
   }

   public String getServiceId() {
      return this.serviceId;
   }

   public void setCustomsId(String customsId) {
      this.customsId = customsId;
   }

   public String getCustomsId() {
      return this.customsId;
   }

   public void setOrderStatus(Integer orderStatus) {
      this.orderStatus = orderStatus;
   }

   public Integer getOrderStatus() {
      return this.orderStatus;
   }

   public void setOrderDesc(String orderDesc) {
      this.orderDesc = orderDesc;
   }

   public String getOrderDesc() {
      return this.orderDesc;
   }

   public void setGoodsCheck(int goodsCheck) {
      this.goodsCheck = goodsCheck;
   }

   public int getGoodsCheck() {
      return this.goodsCheck;
   }

   public void setOrderIdStr(String orderIdStr) {
      this.orderIdStr = orderIdStr;
   }

   public String getOrderIdStr() {
      return this.orderIdStr;
   }

   public String getApiMethod() {
      return "jingdong.pop.customs.center.ServiceCallbackJsfService.serviceCallback";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("orderId", this.orderId);
      pmap.put("serviceId", this.serviceId);
      pmap.put("customsId", this.customsId);
      pmap.put("orderStatus", this.orderStatus);
      pmap.put("orderDesc", this.orderDesc);
      pmap.put("goodsCheck", this.goodsCheck);
      pmap.put("orderIdStr", this.orderIdStr);
      return JsonUtil.toJson(pmap);
   }

   public Class<PopCustomsCenterServiceCallbackJsfServiceServiceCallbackResponse> getResponseClass() {
      return PopCustomsCenterServiceCallbackJsfServiceServiceCallbackResponse.class;
   }
}
