package com.jd.open.api.sdk.request.ECLP;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ECLP.EclpAfsCreateServiceOrderResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class EclpAfsCreateServiceOrderRequest extends AbstractRequest implements JdRequest<EclpAfsCreateServiceOrderResponse> {
   private String isvUUId;
   private String isvSource;
   private String shopNo;
   private String departmentNo;
   private String shipperNo;
   private String eclpOrderId;
   private String salePlatformSource;
   private String salesPlatformCreateTime;
   private String sourceType;
   private String pickupType;
   private String isInvoice;
   private String invoiceNo;
   private String isPackage;
   private String isTestReport;
   private String customerName;
   private String customerTel;
   private String provinceNo;
   private String provinceName;
   private String cityName;
   private String cityNo;
   private String countyName;
   private String countyNo;
   private String townName;
   private String townNo;
   private String customerAddress;
   private String pickupAddress;
   private String operatorId;
   private String operatorName;
   private String operateTime;
   private String pickupNo;
   private String questionDesc;
   private String applyReason;
   private String amsAuditComment;
   private String waybill;
   private String pickwaretype;
   private String isvGoodsNo;
   private String quantity;
   private String weight;
   private String sn;
   private String attachmentDetails;
   private String wareType;
   private Integer isCreatePickup;
   private String businessPhone;
   private Byte outPickupType;
   private String afterSalesChangeNo;
   private Long spOrderId;

   public void setIsvUUId(String isvUUId) {
      this.isvUUId = isvUUId;
   }

   public String getIsvUUId() {
      return this.isvUUId;
   }

   public void setIsvSource(String isvSource) {
      this.isvSource = isvSource;
   }

   public String getIsvSource() {
      return this.isvSource;
   }

   public void setShopNo(String shopNo) {
      this.shopNo = shopNo;
   }

   public String getShopNo() {
      return this.shopNo;
   }

   public void setDepartmentNo(String departmentNo) {
      this.departmentNo = departmentNo;
   }

   public String getDepartmentNo() {
      return this.departmentNo;
   }

   public void setShipperNo(String shipperNo) {
      this.shipperNo = shipperNo;
   }

   public String getShipperNo() {
      return this.shipperNo;
   }

   public void setEclpOrderId(String eclpOrderId) {
      this.eclpOrderId = eclpOrderId;
   }

   public String getEclpOrderId() {
      return this.eclpOrderId;
   }

   public void setSalePlatformSource(String salePlatformSource) {
      this.salePlatformSource = salePlatformSource;
   }

   public String getSalePlatformSource() {
      return this.salePlatformSource;
   }

   public void setSalesPlatformCreateTime(String salesPlatformCreateTime) {
      this.salesPlatformCreateTime = salesPlatformCreateTime;
   }

   public String getSalesPlatformCreateTime() {
      return this.salesPlatformCreateTime;
   }

   public void setSourceType(String sourceType) {
      this.sourceType = sourceType;
   }

   public String getSourceType() {
      return this.sourceType;
   }

   public void setPickupType(String pickupType) {
      this.pickupType = pickupType;
   }

   public String getPickupType() {
      return this.pickupType;
   }

   public void setIsInvoice(String isInvoice) {
      this.isInvoice = isInvoice;
   }

   public String getIsInvoice() {
      return this.isInvoice;
   }

   public void setInvoiceNo(String invoiceNo) {
      this.invoiceNo = invoiceNo;
   }

   public String getInvoiceNo() {
      return this.invoiceNo;
   }

   public void setIsPackage(String isPackage) {
      this.isPackage = isPackage;
   }

   public String getIsPackage() {
      return this.isPackage;
   }

   public void setIsTestReport(String isTestReport) {
      this.isTestReport = isTestReport;
   }

   public String getIsTestReport() {
      return this.isTestReport;
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

   public void setProvinceNo(String provinceNo) {
      this.provinceNo = provinceNo;
   }

   public String getProvinceNo() {
      return this.provinceNo;
   }

   public void setProvinceName(String provinceName) {
      this.provinceName = provinceName;
   }

   public String getProvinceName() {
      return this.provinceName;
   }

   public void setCityName(String cityName) {
      this.cityName = cityName;
   }

   public String getCityName() {
      return this.cityName;
   }

   public void setCityNo(String cityNo) {
      this.cityNo = cityNo;
   }

   public String getCityNo() {
      return this.cityNo;
   }

   public void setCountyName(String countyName) {
      this.countyName = countyName;
   }

   public String getCountyName() {
      return this.countyName;
   }

   public void setCountyNo(String countyNo) {
      this.countyNo = countyNo;
   }

   public String getCountyNo() {
      return this.countyNo;
   }

   public void setTownName(String townName) {
      this.townName = townName;
   }

   public String getTownName() {
      return this.townName;
   }

   public void setTownNo(String townNo) {
      this.townNo = townNo;
   }

   public String getTownNo() {
      return this.townNo;
   }

   public void setCustomerAddress(String customerAddress) {
      this.customerAddress = customerAddress;
   }

   public String getCustomerAddress() {
      return this.customerAddress;
   }

   public void setPickupAddress(String pickupAddress) {
      this.pickupAddress = pickupAddress;
   }

   public String getPickupAddress() {
      return this.pickupAddress;
   }

   public void setOperatorId(String operatorId) {
      this.operatorId = operatorId;
   }

   public String getOperatorId() {
      return this.operatorId;
   }

   public void setOperatorName(String operatorName) {
      this.operatorName = operatorName;
   }

   public String getOperatorName() {
      return this.operatorName;
   }

   public void setOperateTime(String operateTime) {
      this.operateTime = operateTime;
   }

   public String getOperateTime() {
      return this.operateTime;
   }

   public void setPickupNo(String pickupNo) {
      this.pickupNo = pickupNo;
   }

   public String getPickupNo() {
      return this.pickupNo;
   }

   public void setQuestionDesc(String questionDesc) {
      this.questionDesc = questionDesc;
   }

   public String getQuestionDesc() {
      return this.questionDesc;
   }

   public void setApplyReason(String applyReason) {
      this.applyReason = applyReason;
   }

   public String getApplyReason() {
      return this.applyReason;
   }

   public void setAmsAuditComment(String amsAuditComment) {
      this.amsAuditComment = amsAuditComment;
   }

   public String getAmsAuditComment() {
      return this.amsAuditComment;
   }

   public void setWaybill(String waybill) {
      this.waybill = waybill;
   }

   public String getWaybill() {
      return this.waybill;
   }

   public void setPickwaretype(String pickwaretype) {
      this.pickwaretype = pickwaretype;
   }

   public String getPickwaretype() {
      return this.pickwaretype;
   }

   public void setIsvGoodsNo(String isvGoodsNo) {
      this.isvGoodsNo = isvGoodsNo;
   }

   public String getIsvGoodsNo() {
      return this.isvGoodsNo;
   }

   public void setQuantity(String quantity) {
      this.quantity = quantity;
   }

   public String getQuantity() {
      return this.quantity;
   }

   public void setWeight(String weight) {
      this.weight = weight;
   }

   public String getWeight() {
      return this.weight;
   }

   public void setSn(String sn) {
      this.sn = sn;
   }

   public String getSn() {
      return this.sn;
   }

   public void setAttachmentDetails(String attachmentDetails) {
      this.attachmentDetails = attachmentDetails;
   }

   public String getAttachmentDetails() {
      return this.attachmentDetails;
   }

   public void setWareType(String wareType) {
      this.wareType = wareType;
   }

   public String getWareType() {
      return this.wareType;
   }

   public void setIsCreatePickup(Integer isCreatePickup) {
      this.isCreatePickup = isCreatePickup;
   }

   public Integer getIsCreatePickup() {
      return this.isCreatePickup;
   }

   public void setBusinessPhone(String businessPhone) {
      this.businessPhone = businessPhone;
   }

   public String getBusinessPhone() {
      return this.businessPhone;
   }

   public void setOutPickupType(Byte outPickupType) {
      this.outPickupType = outPickupType;
   }

   public Byte getOutPickupType() {
      return this.outPickupType;
   }

   public void setAfterSalesChangeNo(String afterSalesChangeNo) {
      this.afterSalesChangeNo = afterSalesChangeNo;
   }

   public String getAfterSalesChangeNo() {
      return this.afterSalesChangeNo;
   }

   public void setSpOrderId(Long spOrderId) {
      this.spOrderId = spOrderId;
   }

   public Long getSpOrderId() {
      return this.spOrderId;
   }

   public String getApiMethod() {
      return "jingdong.eclp.afs.createServiceOrder";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("isvUUId", this.isvUUId);
      pmap.put("isvSource", this.isvSource);
      pmap.put("shopNo", this.shopNo);
      pmap.put("departmentNo", this.departmentNo);
      pmap.put("shipperNo", this.shipperNo);
      pmap.put("eclpOrderId", this.eclpOrderId);
      pmap.put("salePlatformSource", this.salePlatformSource);
      pmap.put("salesPlatformCreateTime", this.salesPlatformCreateTime);
      pmap.put("sourceType", this.sourceType);
      pmap.put("pickupType", this.pickupType);
      pmap.put("isInvoice", this.isInvoice);
      pmap.put("invoiceNo", this.invoiceNo);
      pmap.put("isPackage", this.isPackage);
      pmap.put("isTestReport", this.isTestReport);
      pmap.put("customerName", this.customerName);
      pmap.put("customerTel", this.customerTel);
      pmap.put("provinceNo", this.provinceNo);
      pmap.put("provinceName", this.provinceName);
      pmap.put("cityName", this.cityName);
      pmap.put("cityNo", this.cityNo);
      pmap.put("countyName", this.countyName);
      pmap.put("countyNo", this.countyNo);
      pmap.put("townName", this.townName);
      pmap.put("townNo", this.townNo);
      pmap.put("customerAddress", this.customerAddress);
      pmap.put("pickupAddress", this.pickupAddress);
      pmap.put("operatorId", this.operatorId);
      pmap.put("operatorName", this.operatorName);
      pmap.put("operateTime", this.operateTime);
      pmap.put("pickupNo", this.pickupNo);
      pmap.put("questionDesc", this.questionDesc);
      pmap.put("applyReason", this.applyReason);
      pmap.put("amsAuditComment", this.amsAuditComment);
      pmap.put("waybill", this.waybill);
      pmap.put("pickwaretype", this.pickwaretype);
      pmap.put("isvGoodsNo", this.isvGoodsNo);
      pmap.put("quantity", this.quantity);
      pmap.put("weight", this.weight);
      pmap.put("sn", this.sn);
      pmap.put("attachmentDetails", this.attachmentDetails);
      pmap.put("wareType", this.wareType);
      pmap.put("isCreatePickup", this.isCreatePickup);
      pmap.put("businessPhone", this.businessPhone);
      pmap.put("outPickupType", this.outPickupType);
      pmap.put("afterSalesChangeNo", this.afterSalesChangeNo);
      pmap.put("spOrderId", this.spOrderId);
      return JsonUtil.toJson(pmap);
   }

   public Class<EclpAfsCreateServiceOrderResponse> getResponseClass() {
      return EclpAfsCreateServiceOrderResponse.class;
   }
}
