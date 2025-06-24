package com.jd.open.api.sdk.request.customsglobalAPI;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.customsglobalAPI.PopCustomsCenterServiceSoaDlzServicecallbackServiceCallbackResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class PopCustomsCenterServiceSoaDlzServicecallbackServiceCallbackRequest extends AbstractRequest implements JdRequest<PopCustomsCenterServiceSoaDlzServicecallbackServiceCallbackResponse> {
   private String customsId;
   private String serviceId;
   private String orderId;
   private String platformId;
   private Integer orderStatus;
   private String orderDesc;
   private Integer goodsCheck;
   private Integer subCode;
   private String subDesc;

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

   public void setGoodsCheck(Integer goodsCheck) {
      this.goodsCheck = goodsCheck;
   }

   public Integer getGoodsCheck() {
      return this.goodsCheck;
   }

   public void setSubCode(Integer subCode) {
      this.subCode = subCode;
   }

   public Integer getSubCode() {
      return this.subCode;
   }

   public void setSubDesc(String subDesc) {
      this.subDesc = subDesc;
   }

   public String getSubDesc() {
      return this.subDesc;
   }

   public String getApiMethod() {
      return "jingdong.pop.customs.center.service.soa.dlz.servicecallback.serviceCallback";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("customsId", this.customsId);
      pmap.put("serviceId", this.serviceId);
      pmap.put("orderId", this.orderId);
      pmap.put("platformId", this.platformId);
      pmap.put("orderStatus", this.orderStatus);
      pmap.put("orderDesc", this.orderDesc);
      pmap.put("goodsCheck", this.goodsCheck);
      pmap.put("subCode", this.subCode);
      pmap.put("subDesc", this.subDesc);
      return JsonUtil.toJson(pmap);
   }

   public Class<PopCustomsCenterServiceSoaDlzServicecallbackServiceCallbackResponse> getResponseClass() {
      return PopCustomsCenterServiceSoaDlzServicecallbackServiceCallbackResponse.class;
   }
}
