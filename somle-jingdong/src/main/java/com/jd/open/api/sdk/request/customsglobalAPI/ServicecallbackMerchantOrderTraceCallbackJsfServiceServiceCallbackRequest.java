package com.jd.open.api.sdk.request.customsglobalAPI;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.customsglobalAPI.ServicecallbackMerchantOrderTraceCallbackJsfServiceServiceCallbackResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class ServicecallbackMerchantOrderTraceCallbackJsfServiceServiceCallbackRequest extends AbstractRequest implements JdRequest<ServicecallbackMerchantOrderTraceCallbackJsfServiceServiceCallbackResponse> {
   private String customsId;
   private String serviceId;
   private String orderId;
   private Integer methodType;
   private Integer operateType;
   private Date operateTime;

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

   public void setMethodType(Integer methodType) {
      this.methodType = methodType;
   }

   public Integer getMethodType() {
      return this.methodType;
   }

   public void setOperateType(Integer operateType) {
      this.operateType = operateType;
   }

   public Integer getOperateType() {
      return this.operateType;
   }

   public void setOperateTime(Date operateTime) {
      this.operateTime = operateTime;
   }

   public Date getOperateTime() {
      return this.operateTime;
   }

   public String getApiMethod() {
      return "jingdong.servicecallback.MerchantOrderTraceCallbackJsfService.serviceCallback";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("customsId", this.customsId);
      pmap.put("serviceId", this.serviceId);
      pmap.put("orderId", this.orderId);
      pmap.put("methodType", this.methodType);
      pmap.put("operateType", this.operateType);

      try {
         if (this.operateTime != null) {
            pmap.put("operateTime", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.operateTime));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      return JsonUtil.toJson(pmap);
   }

   public Class<ServicecallbackMerchantOrderTraceCallbackJsfServiceServiceCallbackResponse> getResponseClass() {
      return ServicecallbackMerchantOrderTraceCallbackJsfServiceServiceCallbackResponse.class;
   }
}
