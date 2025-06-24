package com.jd.open.api.sdk.request.ECLP;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ECLP.EclpMasterUpdateCustomerInfoResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class EclpMasterUpdateCustomerInfoRequest extends AbstractRequest implements JdRequest<EclpMasterUpdateCustomerInfoResponse> {
   private String sellerNo;
   private String deptNo;
   private String customerNo;
   private String customerName;
   private String contacts;
   private String phone;
   private String customerEmail;
   private String customerAddress;
   private Byte customerType;
   private Byte transitType;
   private String warehouseName;
   private String provinceName;
   private String cityName;
   private String countyName;
   private String townName;
   private Byte rection;
   private String customerRemark;
   private String licenseAddr;
   private String licenseUnit;
   private String licenseUnitNo;
   private String warehouseNo;
   private String sellerName;
   private String medicineEnterpriseNature;

   public void setSellerNo(String sellerNo) {
      this.sellerNo = sellerNo;
   }

   public String getSellerNo() {
      return this.sellerNo;
   }

   public void setDeptNo(String deptNo) {
      this.deptNo = deptNo;
   }

   public String getDeptNo() {
      return this.deptNo;
   }

   public void setCustomerNo(String customerNo) {
      this.customerNo = customerNo;
   }

   public String getCustomerNo() {
      return this.customerNo;
   }

   public void setCustomerName(String customerName) {
      this.customerName = customerName;
   }

   public String getCustomerName() {
      return this.customerName;
   }

   public void setContacts(String contacts) {
      this.contacts = contacts;
   }

   public String getContacts() {
      return this.contacts;
   }

   public void setPhone(String phone) {
      this.phone = phone;
   }

   public String getPhone() {
      return this.phone;
   }

   public void setCustomerEmail(String customerEmail) {
      this.customerEmail = customerEmail;
   }

   public String getCustomerEmail() {
      return this.customerEmail;
   }

   public void setCustomerAddress(String customerAddress) {
      this.customerAddress = customerAddress;
   }

   public String getCustomerAddress() {
      return this.customerAddress;
   }

   public void setCustomerType(Byte customerType) {
      this.customerType = customerType;
   }

   public Byte getCustomerType() {
      return this.customerType;
   }

   public void setTransitType(Byte transitType) {
      this.transitType = transitType;
   }

   public Byte getTransitType() {
      return this.transitType;
   }

   public void setWarehouseName(String warehouseName) {
      this.warehouseName = warehouseName;
   }

   public String getWarehouseName() {
      return this.warehouseName;
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

   public void setCountyName(String countyName) {
      this.countyName = countyName;
   }

   public String getCountyName() {
      return this.countyName;
   }

   public void setTownName(String townName) {
      this.townName = townName;
   }

   public String getTownName() {
      return this.townName;
   }

   public void setRection(Byte rection) {
      this.rection = rection;
   }

   public Byte getRection() {
      return this.rection;
   }

   public void setCustomerRemark(String customerRemark) {
      this.customerRemark = customerRemark;
   }

   public String getCustomerRemark() {
      return this.customerRemark;
   }

   public void setLicenseAddr(String licenseAddr) {
      this.licenseAddr = licenseAddr;
   }

   public String getLicenseAddr() {
      return this.licenseAddr;
   }

   public void setLicenseUnit(String licenseUnit) {
      this.licenseUnit = licenseUnit;
   }

   public String getLicenseUnit() {
      return this.licenseUnit;
   }

   public void setLicenseUnitNo(String licenseUnitNo) {
      this.licenseUnitNo = licenseUnitNo;
   }

   public String getLicenseUnitNo() {
      return this.licenseUnitNo;
   }

   public void setWarehouseNo(String warehouseNo) {
      this.warehouseNo = warehouseNo;
   }

   public String getWarehouseNo() {
      return this.warehouseNo;
   }

   public void setSellerName(String sellerName) {
      this.sellerName = sellerName;
   }

   public String getSellerName() {
      return this.sellerName;
   }

   public void setMedicineEnterpriseNature(String medicineEnterpriseNature) {
      this.medicineEnterpriseNature = medicineEnterpriseNature;
   }

   public String getMedicineEnterpriseNature() {
      return this.medicineEnterpriseNature;
   }

   public String getApiMethod() {
      return "jingdong.eclp.master.updateCustomerInfo";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("sellerNo", this.sellerNo);
      pmap.put("deptNo", this.deptNo);
      pmap.put("customerNo", this.customerNo);
      pmap.put("customerName", this.customerName);
      pmap.put("contacts", this.contacts);
      pmap.put("phone", this.phone);
      pmap.put("customerEmail", this.customerEmail);
      pmap.put("customerAddress", this.customerAddress);
      pmap.put("customerType", this.customerType);
      pmap.put("transitType", this.transitType);
      pmap.put("warehouseName", this.warehouseName);
      pmap.put("provinceName", this.provinceName);
      pmap.put("cityName", this.cityName);
      pmap.put("countyName", this.countyName);
      pmap.put("townName", this.townName);
      pmap.put("rection", this.rection);
      pmap.put("customerRemark", this.customerRemark);
      pmap.put("licenseAddr", this.licenseAddr);
      pmap.put("licenseUnit", this.licenseUnit);
      pmap.put("licenseUnitNo", this.licenseUnitNo);
      pmap.put("warehouseNo", this.warehouseNo);
      pmap.put("sellerName", this.sellerName);
      pmap.put("medicineEnterpriseNature", this.medicineEnterpriseNature);
      return JsonUtil.toJson(pmap);
   }

   public Class<EclpMasterUpdateCustomerInfoResponse> getResponseClass() {
      return EclpMasterUpdateCustomerInfoResponse.class;
   }
}
