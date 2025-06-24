package com.jd.open.api.sdk.request.promotion;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.promotion.ApiSmsModelConfigWriteServiceSendSmsResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class ApiSmsModelConfigWriteServiceSendSmsRequest extends AbstractRequest implements JdRequest<ApiSmsModelConfigWriteServiceSendSmsResponse> {
   private Long id;
   private String orderId;
   private String pin;
   private String batchNo;
   private String phoneNo;
   private String openIdBuyer;
   private String xidBuyer;

   public void setId(Long id) {
      this.id = id;
   }

   public Long getId() {
      return this.id;
   }

   public void setOrderId(String orderId) {
      this.orderId = orderId;
   }

   public String getOrderId() {
      return this.orderId;
   }

   public void setPin(String pin) {
      this.pin = pin;
   }

   public String getPin() {
      return this.pin;
   }

   public void setBatchNo(String batchNo) {
      this.batchNo = batchNo;
   }

   public String getBatchNo() {
      return this.batchNo;
   }

   public void setPhoneNo(String phoneNo) {
      this.phoneNo = phoneNo;
   }

   public String getPhoneNo() {
      return this.phoneNo;
   }

   public void setOpenIdBuyer(String openIdBuyer) {
      this.openIdBuyer = openIdBuyer;
   }

   public String getOpenIdBuyer() {
      return this.openIdBuyer;
   }

   public void setXidBuyer(String xidBuyer) {
      this.xidBuyer = xidBuyer;
   }

   public String getXidBuyer() {
      return this.xidBuyer;
   }

   public String getApiMethod() {
      return "jingdong.api.SmsModelConfigWriteService.sendSms";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("id", this.id);
      pmap.put("orderId", this.orderId);
      pmap.put("pin", this.pin);
      pmap.put("batchNo", this.batchNo);
      pmap.put("phoneNo", this.phoneNo);
      pmap.put("open_id_buyer", this.openIdBuyer);
      pmap.put("xid_buyer", this.xidBuyer);
      return JsonUtil.toJson(pmap);
   }

   public Class<ApiSmsModelConfigWriteServiceSendSmsResponse> getResponseClass() {
      return ApiSmsModelConfigWriteServiceSendSmsResponse.class;
   }
}
