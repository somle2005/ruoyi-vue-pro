package com.jd.open.api.sdk.domain.stock.StoreService.response.queryStoreHouseRentlist;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;

public class RentStoreInfo implements Serializable {
   private Long[] comId;
   private String[] comName;
   private Long[] orgId;
   private Long[] whId;
   private String[] orgName;
   private String[] whName;
   private String[] customName;
   private int[] areaRent;
   private Date[] applyTime;
   private int[] status;
   private String[] address;
   private String[] contract;
   private String[] phone;
   private String[] zipCode;
   private String[] backName;
   private String[] backPhone;

   @JsonProperty("com_id")
   public void setComId(Long[] comId) {
      this.comId = comId;
   }

   @JsonProperty("com_id")
   public Long[] getComId() {
      return this.comId;
   }

   @JsonProperty("com_name")
   public void setComName(String[] comName) {
      this.comName = comName;
   }

   @JsonProperty("com_name")
   public String[] getComName() {
      return this.comName;
   }

   @JsonProperty("org_id")
   public void setOrgId(Long[] orgId) {
      this.orgId = orgId;
   }

   @JsonProperty("org_id")
   public Long[] getOrgId() {
      return this.orgId;
   }

   @JsonProperty("wh_id")
   public void setWhId(Long[] whId) {
      this.whId = whId;
   }

   @JsonProperty("wh_id")
   public Long[] getWhId() {
      return this.whId;
   }

   @JsonProperty("org_name")
   public void setOrgName(String[] orgName) {
      this.orgName = orgName;
   }

   @JsonProperty("org_name")
   public String[] getOrgName() {
      return this.orgName;
   }

   @JsonProperty("wh_name")
   public void setWhName(String[] whName) {
      this.whName = whName;
   }

   @JsonProperty("wh_name")
   public String[] getWhName() {
      return this.whName;
   }

   @JsonProperty("custom_name")
   public void setCustomName(String[] customName) {
      this.customName = customName;
   }

   @JsonProperty("custom_name")
   public String[] getCustomName() {
      return this.customName;
   }

   @JsonProperty("areaRent")
   public void setAreaRent(int[] areaRent) {
      this.areaRent = areaRent;
   }

   @JsonProperty("areaRent")
   public int[] getAreaRent() {
      return this.areaRent;
   }

   @JsonProperty("apply_time")
   public void setApplyTime(Date[] applyTime) {
      this.applyTime = applyTime;
   }

   @JsonProperty("apply_time")
   public Date[] getApplyTime() {
      return this.applyTime;
   }

   @JsonProperty("status")
   public void setStatus(int[] status) {
      this.status = status;
   }

   @JsonProperty("status")
   public int[] getStatus() {
      return this.status;
   }

   @JsonProperty("address")
   public void setAddress(String[] address) {
      this.address = address;
   }

   @JsonProperty("address")
   public String[] getAddress() {
      return this.address;
   }

   @JsonProperty("contract")
   public void setContract(String[] contract) {
      this.contract = contract;
   }

   @JsonProperty("contract")
   public String[] getContract() {
      return this.contract;
   }

   @JsonProperty("phone")
   public void setPhone(String[] phone) {
      this.phone = phone;
   }

   @JsonProperty("phone")
   public String[] getPhone() {
      return this.phone;
   }

   @JsonProperty("zip_code")
   public void setZipCode(String[] zipCode) {
      this.zipCode = zipCode;
   }

   @JsonProperty("zip_code")
   public String[] getZipCode() {
      return this.zipCode;
   }

   @JsonProperty("back_name")
   public void setBackName(String[] backName) {
      this.backName = backName;
   }

   @JsonProperty("back_name")
   public String[] getBackName() {
      return this.backName;
   }

   @JsonProperty("back_phone")
   public void setBackPhone(String[] backPhone) {
      this.backPhone = backPhone;
   }

   @JsonProperty("back_phone")
   public String[] getBackPhone() {
      return this.backPhone;
   }
}
