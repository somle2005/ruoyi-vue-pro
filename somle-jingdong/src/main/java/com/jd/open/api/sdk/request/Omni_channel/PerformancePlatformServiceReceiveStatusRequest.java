package com.jd.open.api.sdk.request.Omni_channel;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.Omni_channel.PerformancePlatformServiceReceiveStatusResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class PerformancePlatformServiceReceiveStatusRequest extends AbstractRequest implements JdRequest<PerformancePlatformServiceReceiveStatusResponse> {
   private String authKey;
   private String pin;
   private String distributorName;
   private String distributorPhone;
   private String orderId;
   private Long updateTime;
   private Integer source;
   private String receiptCode;
   private Integer performancer;
   private String cancelReason;
   private String distributor;
   private String waybillNo;
   private String status;

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

   public void setDistributorName(String distributorName) {
      this.distributorName = distributorName;
   }

   public String getDistributorName() {
      return this.distributorName;
   }

   public void setDistributorPhone(String distributorPhone) {
      this.distributorPhone = distributorPhone;
   }

   public String getDistributorPhone() {
      return this.distributorPhone;
   }

   public void setOrderId(String orderId) {
      this.orderId = orderId;
   }

   public String getOrderId() {
      return this.orderId;
   }

   public void setUpdateTime(Long updateTime) {
      this.updateTime = updateTime;
   }

   public Long getUpdateTime() {
      return this.updateTime;
   }

   public void setSource(Integer source) {
      this.source = source;
   }

   public Integer getSource() {
      return this.source;
   }

   public void setReceiptCode(String receiptCode) {
      this.receiptCode = receiptCode;
   }

   public String getReceiptCode() {
      return this.receiptCode;
   }

   public void setPerformancer(Integer performancer) {
      this.performancer = performancer;
   }

   public Integer getPerformancer() {
      return this.performancer;
   }

   public void setCancelReason(String cancelReason) {
      this.cancelReason = cancelReason;
   }

   public String getCancelReason() {
      return this.cancelReason;
   }

   public void setDistributor(String distributor) {
      this.distributor = distributor;
   }

   public String getDistributor() {
      return this.distributor;
   }

   public void setWaybillNo(String waybillNo) {
      this.waybillNo = waybillNo;
   }

   public String getWaybillNo() {
      return this.waybillNo;
   }

   public void setStatus(String status) {
      this.status = status;
   }

   public String getStatus() {
      return this.status;
   }

   public String getApiMethod() {
      return "jingdong.performancePlatformService.receiveStatus";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("authKey", this.authKey);
      pmap.put("pin", this.pin);
      pmap.put("distributorName", this.distributorName);
      pmap.put("distributorPhone", this.distributorPhone);
      pmap.put("orderId", this.orderId);
      pmap.put("updateTime", this.updateTime);
      pmap.put("source", this.source);
      pmap.put("receiptCode", this.receiptCode);
      pmap.put("performancer", this.performancer);
      pmap.put("cancelReason", this.cancelReason);
      pmap.put("distributor", this.distributor);
      pmap.put("waybillNo", this.waybillNo);
      pmap.put("status", this.status);
      return JsonUtil.toJson(pmap);
   }

   public Class<PerformancePlatformServiceReceiveStatusResponse> getResponseClass() {
      return PerformancePlatformServiceReceiveStatusResponse.class;
   }
}
