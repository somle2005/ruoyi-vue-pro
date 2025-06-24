package com.jd.open.api.sdk.domain.unboundedShop.EmployeeServiceProvider.response.listEmployee;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class VenderStoreEmployeeDTO implements Serializable {
   private Long venderId;
   private Long storeId;
   private String name;
   private Long employeeId;
   private String phone;
   private Long caccountId;
   private Long openId;
   private String userName;
   private String imitateIp;
   private Long brandId;
   private Long bizId;
   private Integer sourceType;
   private Integer employeeType;
   private Long venderEmployeeId;

   @JsonProperty("venderId")
   public void setVenderId(Long venderId) {
      this.venderId = venderId;
   }

   @JsonProperty("venderId")
   public Long getVenderId() {
      return this.venderId;
   }

   @JsonProperty("storeId")
   public void setStoreId(Long storeId) {
      this.storeId = storeId;
   }

   @JsonProperty("storeId")
   public Long getStoreId() {
      return this.storeId;
   }

   @JsonProperty("name")
   public void setName(String name) {
      this.name = name;
   }

   @JsonProperty("name")
   public String getName() {
      return this.name;
   }

   @JsonProperty("employeeId")
   public void setEmployeeId(Long employeeId) {
      this.employeeId = employeeId;
   }

   @JsonProperty("employeeId")
   public Long getEmployeeId() {
      return this.employeeId;
   }

   @JsonProperty("phone")
   public void setPhone(String phone) {
      this.phone = phone;
   }

   @JsonProperty("phone")
   public String getPhone() {
      return this.phone;
   }

   @JsonProperty("caccountId")
   public void setCaccountId(Long caccountId) {
      this.caccountId = caccountId;
   }

   @JsonProperty("caccountId")
   public Long getCaccountId() {
      return this.caccountId;
   }

   @JsonProperty("openId")
   public void setOpenId(Long openId) {
      this.openId = openId;
   }

   @JsonProperty("openId")
   public Long getOpenId() {
      return this.openId;
   }

   @JsonProperty("userName")
   public void setUserName(String userName) {
      this.userName = userName;
   }

   @JsonProperty("userName")
   public String getUserName() {
      return this.userName;
   }

   @JsonProperty("imitateIp")
   public void setImitateIp(String imitateIp) {
      this.imitateIp = imitateIp;
   }

   @JsonProperty("imitateIp")
   public String getImitateIp() {
      return this.imitateIp;
   }

   @JsonProperty("brandId")
   public void setBrandId(Long brandId) {
      this.brandId = brandId;
   }

   @JsonProperty("brandId")
   public Long getBrandId() {
      return this.brandId;
   }

   @JsonProperty("bizId")
   public void setBizId(Long bizId) {
      this.bizId = bizId;
   }

   @JsonProperty("bizId")
   public Long getBizId() {
      return this.bizId;
   }

   @JsonProperty("sourceType")
   public void setSourceType(Integer sourceType) {
      this.sourceType = sourceType;
   }

   @JsonProperty("sourceType")
   public Integer getSourceType() {
      return this.sourceType;
   }

   @JsonProperty("employeeType")
   public void setEmployeeType(Integer employeeType) {
      this.employeeType = employeeType;
   }

   @JsonProperty("employeeType")
   public Integer getEmployeeType() {
      return this.employeeType;
   }

   @JsonProperty("venderEmployeeId")
   public void setVenderEmployeeId(Long venderEmployeeId) {
      this.venderEmployeeId = venderEmployeeId;
   }

   @JsonProperty("venderEmployeeId")
   public Long getVenderEmployeeId() {
      return this.venderEmployeeId;
   }
}
