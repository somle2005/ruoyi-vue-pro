package com.jd.open.api.sdk.request.delivery;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.delivery.LdopDeliveryProviderCancelWayBillResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class LdopDeliveryProviderCancelWayBillRequest extends AbstractRequest implements JdRequest<LdopDeliveryProviderCancelWayBillResponse> {
   private String userPin;
   private String waybillCode;
   private String customerCode;
   private String source;
   private String cancelReason;
   private String operatorName;
   private String openIdBuyer;
   private String xidBuyer;

   public void setUserPin(String userPin) {
      this.userPin = userPin;
   }

   public String getUserPin() {
      return this.userPin;
   }

   public void setWaybillCode(String waybillCode) {
      this.waybillCode = waybillCode;
   }

   public String getWaybillCode() {
      return this.waybillCode;
   }

   public void setCustomerCode(String customerCode) {
      this.customerCode = customerCode;
   }

   public String getCustomerCode() {
      return this.customerCode;
   }

   public void setSource(String source) {
      this.source = source;
   }

   public String getSource() {
      return this.source;
   }

   public void setCancelReason(String cancelReason) {
      this.cancelReason = cancelReason;
   }

   public String getCancelReason() {
      return this.cancelReason;
   }

   public void setOperatorName(String operatorName) {
      this.operatorName = operatorName;
   }

   public String getOperatorName() {
      return this.operatorName;
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
      return "jingdong.ldop.delivery.provider.cancelWayBill";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("userPin", this.userPin);
      pmap.put("waybillCode", this.waybillCode);
      pmap.put("customerCode", this.customerCode);
      pmap.put("source", this.source);
      pmap.put("cancelReason", this.cancelReason);
      pmap.put("operatorName", this.operatorName);
      pmap.put("open_id_buyer", this.openIdBuyer);
      pmap.put("xid_buyer", this.xidBuyer);
      return JsonUtil.toJson(pmap);
   }

   public Class<LdopDeliveryProviderCancelWayBillResponse> getResponseClass() {
      return LdopDeliveryProviderCancelWayBillResponse.class;
   }
}
