package com.jd.open.api.sdk.domain.seller.VenderContactSafService.response.query;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;

public class ReturnAddressVO implements Serializable {
   private Long id;
   private String contact;
   private String phone;
   private String zipCode;
   private String fullAddress;
   private String fullAreaId;
   private Integer addressType;
   private Date createTime;
   private Date modifyTime;

   @JsonProperty("id")
   public void setId(Long id) {
      this.id = id;
   }

   @JsonProperty("id")
   public Long getId() {
      return this.id;
   }

   @JsonProperty("contact")
   public void setContact(String contact) {
      this.contact = contact;
   }

   @JsonProperty("contact")
   public String getContact() {
      return this.contact;
   }

   @JsonProperty("phone")
   public void setPhone(String phone) {
      this.phone = phone;
   }

   @JsonProperty("phone")
   public String getPhone() {
      return this.phone;
   }

   @JsonProperty("zip_code")
   public void setZipCode(String zipCode) {
      this.zipCode = zipCode;
   }

   @JsonProperty("zip_code")
   public String getZipCode() {
      return this.zipCode;
   }

   @JsonProperty("full_address")
   public void setFullAddress(String fullAddress) {
      this.fullAddress = fullAddress;
   }

   @JsonProperty("full_address")
   public String getFullAddress() {
      return this.fullAddress;
   }

   @JsonProperty("full_area_id")
   public void setFullAreaId(String fullAreaId) {
      this.fullAreaId = fullAreaId;
   }

   @JsonProperty("full_area_id")
   public String getFullAreaId() {
      return this.fullAreaId;
   }

   @JsonProperty("address_type")
   public void setAddressType(Integer addressType) {
      this.addressType = addressType;
   }

   @JsonProperty("address_type")
   public Integer getAddressType() {
      return this.addressType;
   }

   @JsonProperty("create_time")
   public void setCreateTime(Date createTime) {
      this.createTime = createTime;
   }

   @JsonProperty("create_time")
   public Date getCreateTime() {
      return this.createTime;
   }

   @JsonProperty("modify_time")
   public void setModifyTime(Date modifyTime) {
      this.modifyTime = modifyTime;
   }

   @JsonProperty("modify_time")
   public Date getModifyTime() {
      return this.modifyTime;
   }
}
