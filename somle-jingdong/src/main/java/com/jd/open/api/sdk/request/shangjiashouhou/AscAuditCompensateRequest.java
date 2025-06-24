package com.jd.open.api.sdk.request.shangjiashouhou;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.shangjiashouhou.AscAuditCompensateResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class AscAuditCompensateRequest extends AbstractRequest implements JdRequest<AscAuditCompensateResponse> {
   private String buId;
   private String operatePin;
   private String operateNick;
   private Long serviceId;
   private Long orderId;
   private String approveNotes;
   private Integer sysVersion;
   private Integer approveReasonCid1;
   private Integer approveReasonCid2;
   private Integer deliveryCenterId;
   private String deliveryCenterName;
   private Integer storeId;
   private String customerContactName;
   private String customerContactTel;
   private String customerContactMobile;
   private String customerZipcode;
   private int customerProvince;
   private int customerCity;
   private int customerCounty;
   private int customerVillage;
   private String customerDetailAddress;
   private String oaid;
   private String skuId;
   private String wareName;
   private String warePrice;
   private String wareNum;
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

   public void setOrderId(Long orderId) {
      this.orderId = orderId;
   }

   public Long getOrderId() {
      return this.orderId;
   }

   public void setApproveNotes(String approveNotes) {
      this.approveNotes = approveNotes;
   }

   public String getApproveNotes() {
      return this.approveNotes;
   }

   public void setSysVersion(Integer sysVersion) {
      this.sysVersion = sysVersion;
   }

   public Integer getSysVersion() {
      return this.sysVersion;
   }

   public void setApproveReasonCid1(Integer approveReasonCid1) {
      this.approveReasonCid1 = approveReasonCid1;
   }

   public Integer getApproveReasonCid1() {
      return this.approveReasonCid1;
   }

   public void setApproveReasonCid2(Integer approveReasonCid2) {
      this.approveReasonCid2 = approveReasonCid2;
   }

   public Integer getApproveReasonCid2() {
      return this.approveReasonCid2;
   }

   public void setDeliveryCenterId(Integer deliveryCenterId) {
      this.deliveryCenterId = deliveryCenterId;
   }

   public Integer getDeliveryCenterId() {
      return this.deliveryCenterId;
   }

   public void setDeliveryCenterName(String deliveryCenterName) {
      this.deliveryCenterName = deliveryCenterName;
   }

   public String getDeliveryCenterName() {
      return this.deliveryCenterName;
   }

   public void setStoreId(Integer storeId) {
      this.storeId = storeId;
   }

   public Integer getStoreId() {
      return this.storeId;
   }

   public void setCustomerContactName(String customerContactName) {
      this.customerContactName = customerContactName;
   }

   public String getCustomerContactName() {
      return this.customerContactName;
   }

   public void setCustomerContactTel(String customerContactTel) {
      this.customerContactTel = customerContactTel;
   }

   public String getCustomerContactTel() {
      return this.customerContactTel;
   }

   public void setCustomerContactMobile(String customerContactMobile) {
      this.customerContactMobile = customerContactMobile;
   }

   public String getCustomerContactMobile() {
      return this.customerContactMobile;
   }

   public void setCustomerZipcode(String customerZipcode) {
      this.customerZipcode = customerZipcode;
   }

   public String getCustomerZipcode() {
      return this.customerZipcode;
   }

   public void setCustomerProvince(int customerProvince) {
      this.customerProvince = customerProvince;
   }

   public int getCustomerProvince() {
      return this.customerProvince;
   }

   public void setCustomerCity(int customerCity) {
      this.customerCity = customerCity;
   }

   public int getCustomerCity() {
      return this.customerCity;
   }

   public void setCustomerCounty(int customerCounty) {
      this.customerCounty = customerCounty;
   }

   public int getCustomerCounty() {
      return this.customerCounty;
   }

   public void setCustomerVillage(int customerVillage) {
      this.customerVillage = customerVillage;
   }

   public int getCustomerVillage() {
      return this.customerVillage;
   }

   public void setCustomerDetailAddress(String customerDetailAddress) {
      this.customerDetailAddress = customerDetailAddress;
   }

   public String getCustomerDetailAddress() {
      return this.customerDetailAddress;
   }

   public void setOaid(String oaid) {
      this.oaid = oaid;
   }

   public String getOaid() {
      return this.oaid;
   }

   public void setSkuId(String skuId) {
      this.skuId = skuId;
   }

   public String getSkuId() {
      return this.skuId;
   }

   public void setWareName(String wareName) {
      this.wareName = wareName;
   }

   public String getWareName() {
      return this.wareName;
   }

   public void setWarePrice(String warePrice) {
      this.warePrice = warePrice;
   }

   public String getWarePrice() {
      return this.warePrice;
   }

   public void setWareNum(String wareNum) {
      this.wareNum = wareNum;
   }

   public String getWareNum() {
      return this.wareNum;
   }

   public void setExtJsonStr(String extJsonStr) {
      this.extJsonStr = extJsonStr;
   }

   public String getExtJsonStr() {
      return this.extJsonStr;
   }

   public String getApiMethod() {
      return "jingdong.asc.audit.compensate";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("buId", this.buId);
      pmap.put("operatePin", this.operatePin);
      pmap.put("operateNick", this.operateNick);
      pmap.put("serviceId", this.serviceId);
      pmap.put("orderId", this.orderId);
      pmap.put("approveNotes", this.approveNotes);
      pmap.put("sysVersion", this.sysVersion);
      pmap.put("approveReasonCid1", this.approveReasonCid1);
      pmap.put("approveReasonCid2", this.approveReasonCid2);
      pmap.put("deliveryCenterId", this.deliveryCenterId);
      pmap.put("deliveryCenterName", this.deliveryCenterName);
      pmap.put("storeId", this.storeId);
      pmap.put("customerContactName", this.customerContactName);
      pmap.put("customerContactTel", this.customerContactTel);
      pmap.put("customerContactMobile", this.customerContactMobile);
      pmap.put("customerZipcode", this.customerZipcode);
      pmap.put("customerProvince", this.customerProvince);
      pmap.put("customerCity", this.customerCity);
      pmap.put("customerCounty", this.customerCounty);
      pmap.put("customerVillage", this.customerVillage);
      pmap.put("customerDetailAddress", this.customerDetailAddress);
      pmap.put("oaid", this.oaid);
      pmap.put("skuId", this.skuId);
      pmap.put("wareName", this.wareName);
      pmap.put("warePrice", this.warePrice);
      pmap.put("wareNum", this.wareNum);
      pmap.put("extJsonStr", this.extJsonStr);
      return JsonUtil.toJson(pmap);
   }

   public Class<AscAuditCompensateResponse> getResponseClass() {
      return AscAuditCompensateResponse.class;
   }
}
