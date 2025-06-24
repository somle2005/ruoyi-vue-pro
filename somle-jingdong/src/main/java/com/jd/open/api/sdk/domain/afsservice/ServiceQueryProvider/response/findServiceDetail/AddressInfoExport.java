package com.jd.open.api.sdk.domain.afsservice.ServiceQueryProvider.response.findServiceDetail;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class AddressInfoExport implements Serializable {
   private int province;
   private int city;
   private int county;
   private int village;
   private String detailAddress;
   private String oaid;

   @JsonProperty("province")
   public void setProvince(int province) {
      this.province = province;
   }

   @JsonProperty("province")
   public int getProvince() {
      return this.province;
   }

   @JsonProperty("city")
   public void setCity(int city) {
      this.city = city;
   }

   @JsonProperty("city")
   public int getCity() {
      return this.city;
   }

   @JsonProperty("county")
   public void setCounty(int county) {
      this.county = county;
   }

   @JsonProperty("county")
   public int getCounty() {
      return this.county;
   }

   @JsonProperty("village")
   public void setVillage(int village) {
      this.village = village;
   }

   @JsonProperty("village")
   public int getVillage() {
      return this.village;
   }

   @JsonProperty("detailAddress")
   public void setDetailAddress(String detailAddress) {
      this.detailAddress = detailAddress;
   }

   @JsonProperty("detailAddress")
   public String getDetailAddress() {
      return this.detailAddress;
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
