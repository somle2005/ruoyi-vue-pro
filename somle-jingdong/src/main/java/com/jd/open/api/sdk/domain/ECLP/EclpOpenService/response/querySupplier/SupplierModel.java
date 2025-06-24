package com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.querySupplier;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class SupplierModel implements Serializable {
   private String[] deptNo;
   private String[] deptName;
   private String[] eclpSupplierNo;
   private String[] supplierName;
   private String[] supplierType;
   private String[] status;
   private String[] contacts;
   private String[] phone;
   private String[] fax;
   private String[] email;
   private String[] province;
   private String[] city;
   private String[] county;
   private String[] town;
   private String[] address;
   private String[] ext1;
   private String[] ext2;
   private String[] ext3;
   private String[] ext4;
   private String[] ext5;

   @JsonProperty("deptNo")
   public void setDeptNo(String[] deptNo) {
      this.deptNo = deptNo;
   }

   @JsonProperty("deptNo")
   public String[] getDeptNo() {
      return this.deptNo;
   }

   @JsonProperty("deptName")
   public void setDeptName(String[] deptName) {
      this.deptName = deptName;
   }

   @JsonProperty("deptName")
   public String[] getDeptName() {
      return this.deptName;
   }

   @JsonProperty("eclpSupplierNo")
   public void setEclpSupplierNo(String[] eclpSupplierNo) {
      this.eclpSupplierNo = eclpSupplierNo;
   }

   @JsonProperty("eclpSupplierNo")
   public String[] getEclpSupplierNo() {
      return this.eclpSupplierNo;
   }

   @JsonProperty("supplierName")
   public void setSupplierName(String[] supplierName) {
      this.supplierName = supplierName;
   }

   @JsonProperty("supplierName")
   public String[] getSupplierName() {
      return this.supplierName;
   }

   @JsonProperty("supplierType")
   public void setSupplierType(String[] supplierType) {
      this.supplierType = supplierType;
   }

   @JsonProperty("supplierType")
   public String[] getSupplierType() {
      return this.supplierType;
   }

   @JsonProperty("status")
   public void setStatus(String[] status) {
      this.status = status;
   }

   @JsonProperty("status")
   public String[] getStatus() {
      return this.status;
   }

   @JsonProperty("contacts")
   public void setContacts(String[] contacts) {
      this.contacts = contacts;
   }

   @JsonProperty("contacts")
   public String[] getContacts() {
      return this.contacts;
   }

   @JsonProperty("phone")
   public void setPhone(String[] phone) {
      this.phone = phone;
   }

   @JsonProperty("phone")
   public String[] getPhone() {
      return this.phone;
   }

   @JsonProperty("fax")
   public void setFax(String[] fax) {
      this.fax = fax;
   }

   @JsonProperty("fax")
   public String[] getFax() {
      return this.fax;
   }

   @JsonProperty("email")
   public void setEmail(String[] email) {
      this.email = email;
   }

   @JsonProperty("email")
   public String[] getEmail() {
      return this.email;
   }

   @JsonProperty("province")
   public void setProvince(String[] province) {
      this.province = province;
   }

   @JsonProperty("province")
   public String[] getProvince() {
      return this.province;
   }

   @JsonProperty("city")
   public void setCity(String[] city) {
      this.city = city;
   }

   @JsonProperty("city")
   public String[] getCity() {
      return this.city;
   }

   @JsonProperty("county")
   public void setCounty(String[] county) {
      this.county = county;
   }

   @JsonProperty("county")
   public String[] getCounty() {
      return this.county;
   }

   @JsonProperty("town")
   public void setTown(String[] town) {
      this.town = town;
   }

   @JsonProperty("town")
   public String[] getTown() {
      return this.town;
   }

   @JsonProperty("address")
   public void setAddress(String[] address) {
      this.address = address;
   }

   @JsonProperty("address")
   public String[] getAddress() {
      return this.address;
   }

   @JsonProperty("ext1")
   public void setExt1(String[] ext1) {
      this.ext1 = ext1;
   }

   @JsonProperty("ext1")
   public String[] getExt1() {
      return this.ext1;
   }

   @JsonProperty("ext2")
   public void setExt2(String[] ext2) {
      this.ext2 = ext2;
   }

   @JsonProperty("ext2")
   public String[] getExt2() {
      return this.ext2;
   }

   @JsonProperty("ext3")
   public void setExt3(String[] ext3) {
      this.ext3 = ext3;
   }

   @JsonProperty("ext3")
   public String[] getExt3() {
      return this.ext3;
   }

   @JsonProperty("ext4")
   public void setExt4(String[] ext4) {
      this.ext4 = ext4;
   }

   @JsonProperty("ext4")
   public String[] getExt4() {
      return this.ext4;
   }

   @JsonProperty("ext5")
   public void setExt5(String[] ext5) {
      this.ext5 = ext5;
   }

   @JsonProperty("ext5")
   public String[] getExt5() {
      return this.ext5;
   }
}
