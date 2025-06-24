package com.jd.open.api.sdk.request.shangjiashouhou;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.shangjiashouhou.AscAuditCountResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class AscAuditCountRequest extends AbstractRequest implements JdRequest<AscAuditCountResponse> {
   private String buId;
   private String operatePin;
   private String operateNick;
   private Long serviceId;
   private Integer customerExpect;
   private Integer serviceStatus;
   private Boolean timeoutFlag;
   private Long orderId;
   private Integer orderType;
   private Long skuId;
   private String customerPin;
   private String customerName;
   private String customerTel;
   private String verificationCode;
   private String extJsonStr;

   public void setBuId(String buId) {
      this.buId = buId;
   }

   public String getBuId() {
      return this.buId;
   }

   public void setOperatePin(String operatePin) {
      this.operatePin = operatePin;
   }

   public String getOperatePin() {
      return this.operatePin;
   }

   public void setOperateNick(String operateNick) {
      this.operateNick = operateNick;
   }

   public String getOperateNick() {
      return this.operateNick;
   }

   public void setServiceId(Long serviceId) {
      this.serviceId = serviceId;
   }

   public Long getServiceId() {
      return this.serviceId;
   }

   public void setCustomerExpect(Integer customerExpect) {
      this.customerExpect = customerExpect;
   }

   public Integer getCustomerExpect() {
      return this.customerExpect;
   }

   public void setServiceStatus(Integer serviceStatus) {
      this.serviceStatus = serviceStatus;
   }

   public Integer getServiceStatus() {
      return this.serviceStatus;
   }

   public void setTimeoutFlag(Boolean timeoutFlag) {
      this.timeoutFlag = timeoutFlag;
   }

   public Boolean getTimeoutFlag() {
      return this.timeoutFlag;
   }

   public void setOrderId(Long orderId) {
      this.orderId = orderId;
   }

   public Long getOrderId() {
      return this.orderId;
   }

   public void setOrderType(Integer orderType) {
      this.orderType = orderType;
   }

   public Integer getOrderType() {
      return this.orderType;
   }

   public void setSkuId(Long skuId) {
      this.skuId = skuId;
   }

   public Long getSkuId() {
      return this.skuId;
   }

   public void setCustomerPin(String customerPin) {
      this.customerPin = customerPin;
   }

   public String getCustomerPin() {
      return this.customerPin;
   }

   public void setCustomerName(String customerName) {
      this.customerName = customerName;
   }

   public String getCustomerName() {
      return this.customerName;
   }

   public void setCustomerTel(String customerTel) {
      this.customerTel = customerTel;
   }

   public String getCustomerTel() {
      return this.customerTel;
   }

   public void setVerificationCode(String verificationCode) {
      this.verificationCode = verificationCode;
   }

   public String getVerificationCode() {
      return this.verificationCode;
   }

   public void setExtJsonStr(String extJsonStr) {
      this.extJsonStr = extJsonStr;
   }

   public String getExtJsonStr() {
      return this.extJsonStr;
   }

   public String getApiMethod() {
      return "jingdong.asc.audit.count";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("buId", this.buId);
      pmap.put("operatePin", this.operatePin);
      pmap.put("operateNick", this.operateNick);
      pmap.put("serviceId", this.serviceId);
      pmap.put("customerExpect", this.customerExpect);
      pmap.put("serviceStatus", this.serviceStatus);
      pmap.put("timeoutFlag", this.timeoutFlag);
      pmap.put("orderId", this.orderId);
      pmap.put("orderType", this.orderType);
      pmap.put("skuId", this.skuId);
      pmap.put("customerPin", this.customerPin);
      pmap.put("customerName", this.customerName);
      pmap.put("customerTel", this.customerTel);
      pmap.put("verificationCode", this.verificationCode);
      pmap.put("extJsonStr", this.extJsonStr);
      return JsonUtil.toJson(pmap);
   }

   public Class<AscAuditCountResponse> getResponseClass() {
      return AscAuditCountResponse.class;
   }
}
