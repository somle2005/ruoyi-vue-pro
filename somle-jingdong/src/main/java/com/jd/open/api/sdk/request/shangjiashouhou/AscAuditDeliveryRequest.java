package com.jd.open.api.sdk.request.shangjiashouhou;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.shangjiashouhou.AscAuditDeliveryResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class AscAuditDeliveryRequest extends AbstractRequest implements JdRequest<AscAuditDeliveryResponse> {
   private String buId;
   private String operatePin;
   private String operateNick;
   private Long serviceId;
   private Long orderId;
   private String approveNotes;
   private Integer sysVersion;
   private Integer approveReasonCid1;
   private Integer approveReasonCid2;
   private String returnContactName;
   private String returnContactTel;
   private String returnContactMobile;
   private String returnZipcode;
   private int returnProvince;
   private int returnCity;
   private int returnCounty;
   private int returnVillage;
   private String returnDetailAddress;
   private String invoiceNo;
   private int invoiceType;
   private boolean pickPackage;
   private boolean pickDetctPaper;
   private String applyDetailIdLongList;
   private String operateRemark;
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

   public void setReturnContactName(String returnContactName) {
      this.returnContactName = returnContactName;
   }

   public String getReturnContactName() {
      return this.returnContactName;
   }

   public void setReturnContactTel(String returnContactTel) {
      this.returnContactTel = returnContactTel;
   }

   public String getReturnContactTel() {
      return this.returnContactTel;
   }

   public void setReturnContactMobile(String returnContactMobile) {
      this.returnContactMobile = returnContactMobile;
   }

   public String getReturnContactMobile() {
      return this.returnContactMobile;
   }

   public void setReturnZipcode(String returnZipcode) {
      this.returnZipcode = returnZipcode;
   }

   public String getReturnZipcode() {
      return this.returnZipcode;
   }

   public void setReturnProvince(int returnProvince) {
      this.returnProvince = returnProvince;
   }

   public int getReturnProvince() {
      return this.returnProvince;
   }

   public void setReturnCity(int returnCity) {
      this.returnCity = returnCity;
   }

   public int getReturnCity() {
      return this.returnCity;
   }

   public void setReturnCounty(int returnCounty) {
      this.returnCounty = returnCounty;
   }

   public int getReturnCounty() {
      return this.returnCounty;
   }

   public void setReturnVillage(int returnVillage) {
      this.returnVillage = returnVillage;
   }

   public int getReturnVillage() {
      return this.returnVillage;
   }

   public void setReturnDetailAddress(String returnDetailAddress) {
      this.returnDetailAddress = returnDetailAddress;
   }

   public String getReturnDetailAddress() {
      return this.returnDetailAddress;
   }

   public void setInvoiceNo(String invoiceNo) {
      this.invoiceNo = invoiceNo;
   }

   public String getInvoiceNo() {
      return this.invoiceNo;
   }

   public void setInvoiceType(int invoiceType) {
      this.invoiceType = invoiceType;
   }

   public int getInvoiceType() {
      return this.invoiceType;
   }

   public void setPickPackage(boolean pickPackage) {
      this.pickPackage = pickPackage;
   }

   public boolean getPickPackage() {
      return this.pickPackage;
   }

   public void setPickDetctPaper(boolean pickDetctPaper) {
      this.pickDetctPaper = pickDetctPaper;
   }

   public boolean getPickDetctPaper() {
      return this.pickDetctPaper;
   }

   public void setApplyDetailIdLongList(String applyDetailIdLongList) {
      this.applyDetailIdLongList = applyDetailIdLongList;
   }

   public String getApplyDetailIdLongList() {
      return this.applyDetailIdLongList;
   }

   public void setOperateRemark(String operateRemark) {
      this.operateRemark = operateRemark;
   }

   public String getOperateRemark() {
      return this.operateRemark;
   }

   public void setExtJsonStr(String extJsonStr) {
      this.extJsonStr = extJsonStr;
   }

   public String getExtJsonStr() {
      return this.extJsonStr;
   }

   public String getApiMethod() {
      return "jingdong.asc.audit.delivery";
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
      pmap.put("returnContactName", this.returnContactName);
      pmap.put("returnContactTel", this.returnContactTel);
      pmap.put("returnContactMobile", this.returnContactMobile);
      pmap.put("returnZipcode", this.returnZipcode);
      pmap.put("returnProvince", this.returnProvince);
      pmap.put("returnCity", this.returnCity);
      pmap.put("returnCounty", this.returnCounty);
      pmap.put("returnVillage", this.returnVillage);
      pmap.put("returnDetailAddress", this.returnDetailAddress);
      pmap.put("invoiceNo", this.invoiceNo);
      pmap.put("invoiceType", this.invoiceType);
      pmap.put("pickPackage", this.pickPackage);
      pmap.put("pickDetctPaper", this.pickDetctPaper);
      pmap.put("applyDetailIdLongList", this.applyDetailIdLongList);
      pmap.put("operateRemark", this.operateRemark);
      pmap.put("extJsonStr", this.extJsonStr);
      return JsonUtil.toJson(pmap);
   }

   public Class<AscAuditDeliveryResponse> getResponseClass() {
      return AscAuditDeliveryResponse.class;
   }
}
