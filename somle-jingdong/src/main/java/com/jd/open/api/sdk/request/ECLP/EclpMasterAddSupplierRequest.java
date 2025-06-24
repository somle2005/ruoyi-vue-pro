package com.jd.open.api.sdk.request.ECLP;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ECLP.EclpMasterAddSupplierResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class EclpMasterAddSupplierRequest extends AbstractRequest implements JdRequest<EclpMasterAddSupplierResponse> {
   private String deptNo;
   private String isvSupplierNo;
   private String supplierName;
   private String contacts;
   private String phone;
   private String fax;
   private String email;
   private String province;
   private String city;
   private String county;
   private String town;
   private String address;
   private String ext1;
   private String ext2;
   private String ext3;
   private String ext4;
   private String ext5;
   private String pictureUrls;
   private String medicineEnterpriseNature;

   public void setDeptNo(String deptNo) {
      this.deptNo = deptNo;
   }

   public String getDeptNo() {
      return this.deptNo;
   }

   public void setIsvSupplierNo(String isvSupplierNo) {
      this.isvSupplierNo = isvSupplierNo;
   }

   public String getIsvSupplierNo() {
      return this.isvSupplierNo;
   }

   public void setSupplierName(String supplierName) {
      this.supplierName = supplierName;
   }

   public String getSupplierName() {
      return this.supplierName;
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

   public void setFax(String fax) {
      this.fax = fax;
   }

   public String getFax() {
      return this.fax;
   }

   public void setEmail(String email) {
      this.email = email;
   }

   public String getEmail() {
      return this.email;
   }

   public void setProvince(String province) {
      this.province = province;
   }

   public String getProvince() {
      return this.province;
   }

   public void setCity(String city) {
      this.city = city;
   }

   public String getCity() {
      return this.city;
   }

   public void setCounty(String county) {
      this.county = county;
   }

   public String getCounty() {
      return this.county;
   }

   public void setTown(String town) {
      this.town = town;
   }

   public String getTown() {
      return this.town;
   }

   public void setAddress(String address) {
      this.address = address;
   }

   public String getAddress() {
      return this.address;
   }

   public void setExt1(String ext1) {
      this.ext1 = ext1;
   }

   public String getExt1() {
      return this.ext1;
   }

   public void setExt2(String ext2) {
      this.ext2 = ext2;
   }

   public String getExt2() {
      return this.ext2;
   }

   public void setExt3(String ext3) {
      this.ext3 = ext3;
   }

   public String getExt3() {
      return this.ext3;
   }

   public void setExt4(String ext4) {
      this.ext4 = ext4;
   }

   public String getExt4() {
      return this.ext4;
   }

   public void setExt5(String ext5) {
      this.ext5 = ext5;
   }

   public String getExt5() {
      return this.ext5;
   }

   public void setPictureUrls(String pictureUrls) {
      this.pictureUrls = pictureUrls;
   }

   public String getPictureUrls() {
      return this.pictureUrls;
   }

   public void setMedicineEnterpriseNature(String medicineEnterpriseNature) {
      this.medicineEnterpriseNature = medicineEnterpriseNature;
   }

   public String getMedicineEnterpriseNature() {
      return this.medicineEnterpriseNature;
   }

   public String getApiMethod() {
      return "jingdong.eclp.master.addSupplier";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("deptNo", this.deptNo);
      pmap.put("isvSupplierNo", this.isvSupplierNo);
      pmap.put("supplierName", this.supplierName);
      pmap.put("contacts", this.contacts);
      pmap.put("phone", this.phone);
      pmap.put("fax", this.fax);
      pmap.put("email", this.email);
      pmap.put("province", this.province);
      pmap.put("city", this.city);
      pmap.put("county", this.county);
      pmap.put("town", this.town);
      pmap.put("address", this.address);
      pmap.put("ext1", this.ext1);
      pmap.put("ext2", this.ext2);
      pmap.put("ext3", this.ext3);
      pmap.put("ext4", this.ext4);
      pmap.put("ext5", this.ext5);
      pmap.put("pictureUrls", this.pictureUrls);
      pmap.put("medicineEnterpriseNature", this.medicineEnterpriseNature);
      return JsonUtil.toJson(pmap);
   }

   public Class<EclpMasterAddSupplierResponse> getResponseClass() {
      return EclpMasterAddSupplierResponse.class;
   }
}
