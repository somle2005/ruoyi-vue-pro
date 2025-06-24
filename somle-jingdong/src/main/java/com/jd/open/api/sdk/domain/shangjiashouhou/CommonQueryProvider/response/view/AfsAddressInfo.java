package com.jd.open.api.sdk.domain.shangjiashouhou.CommonQueryProvider.response.view;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class AfsAddressInfo implements Serializable {
   private Integer companyId;
   private Integer typeId;
   private Integer addressId;
   private String contactName;
   private String contactTel;
   private String contactZipcode;
   private int provinceCode;
   private String detailAddress;

   @JsonProperty("companyId")
   public void setCompanyId(Integer companyId) {
      this.companyId = companyId;
   }

   @JsonProperty("companyId")
   public Integer getCompanyId() {
      return this.companyId;
   }

   @JsonProperty("typeId")
   public void setTypeId(Integer typeId) {
      this.typeId = typeId;
   }

   @JsonProperty("typeId")
   public Integer getTypeId() {
      return this.typeId;
   }

   @JsonProperty("addressId")
   public void setAddressId(Integer addressId) {
      this.addressId = addressId;
   }

   @JsonProperty("addressId")
   public Integer getAddressId() {
      return this.addressId;
   }

   @JsonProperty("contactName")
   public void setContactName(String contactName) {
      this.contactName = contactName;
   }

   @JsonProperty("contactName")
   public String getContactName() {
      return this.contactName;
   }

   @JsonProperty("contactTel")
   public void setContactTel(String contactTel) {
      this.contactTel = contactTel;
   }

   @JsonProperty("contactTel")
   public String getContactTel() {
      return this.contactTel;
   }

   @JsonProperty("contactZipcode")
   public void setContactZipcode(String contactZipcode) {
      this.contactZipcode = contactZipcode;
   }

   @JsonProperty("contactZipcode")
   public String getContactZipcode() {
      return this.contactZipcode;
   }

   @JsonProperty("provinceCode")
   public void setProvinceCode(int provinceCode) {
      this.provinceCode = provinceCode;
   }

   @JsonProperty("provinceCode")
   public int getProvinceCode() {
      return this.provinceCode;
   }

   @JsonProperty("detailAddress")
   public void setDetailAddress(String detailAddress) {
      this.detailAddress = detailAddress;
   }

   @JsonProperty("detailAddress")
   public String getDetailAddress() {
      return this.detailAddress;
   }
}
