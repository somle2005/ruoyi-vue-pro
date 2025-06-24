package com.jd.open.api.sdk.domain.shangjiashouhou.ServiceQueryProvider.response.view;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class ContactInfo implements Serializable {
   private String contactName;
   private String contactTel;
   private String contactMobile;
   private String contactZipcode;
   private int provinceCode;
   private int cityCode;
   private int countyCode;
   private int villageCode;
   private String detailAddress;
   private String extJsonStr;

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

   @JsonProperty("contactMobile")
   public void setContactMobile(String contactMobile) {
      this.contactMobile = contactMobile;
   }

   @JsonProperty("contactMobile")
   public String getContactMobile() {
      return this.contactMobile;
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

   @JsonProperty("cityCode")
   public void setCityCode(int cityCode) {
      this.cityCode = cityCode;
   }

   @JsonProperty("cityCode")
   public int getCityCode() {
      return this.cityCode;
   }

   @JsonProperty("countyCode")
   public void setCountyCode(int countyCode) {
      this.countyCode = countyCode;
   }

   @JsonProperty("countyCode")
   public int getCountyCode() {
      return this.countyCode;
   }

   @JsonProperty("villageCode")
   public void setVillageCode(int villageCode) {
      this.villageCode = villageCode;
   }

   @JsonProperty("villageCode")
   public int getVillageCode() {
      return this.villageCode;
   }

   @JsonProperty("detailAddress")
   public void setDetailAddress(String detailAddress) {
      this.detailAddress = detailAddress;
   }

   @JsonProperty("detailAddress")
   public String getDetailAddress() {
      return this.detailAddress;
   }

   @JsonProperty("extJsonStr")
   public void setExtJsonStr(String extJsonStr) {
      this.extJsonStr = extJsonStr;
   }

   @JsonProperty("extJsonStr")
   public String getExtJsonStr() {
      return this.extJsonStr;
   }
}
