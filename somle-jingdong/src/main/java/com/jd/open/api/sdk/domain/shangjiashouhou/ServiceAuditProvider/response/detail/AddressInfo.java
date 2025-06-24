package com.jd.open.api.sdk.domain.shangjiashouhou.ServiceAuditProvider.response.detail;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class AddressInfo implements Serializable {
   private int provinceCode;
   private int cityCode;
   private int countyCode;
   private int villageCode;
   private String detailAddress;
   private String extJsonStr;
   private String oaid;

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

   @JsonProperty("oaid")
   public void setOaid(String oaid) {
      this.oaid = oaid;
   }

   @JsonProperty("oaid")
   public String getOaid() {
      return this.oaid;
   }
}
