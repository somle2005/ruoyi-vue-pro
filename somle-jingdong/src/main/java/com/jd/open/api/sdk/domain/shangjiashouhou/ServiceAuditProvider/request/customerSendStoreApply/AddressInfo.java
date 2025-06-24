package com.jd.open.api.sdk.domain.shangjiashouhou.ServiceAuditProvider.request.customerSendStoreApply;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class AddressInfo implements Serializable {
   private Integer province;
   private Integer city;
   private Integer county;
   private Integer village;
   private String detailAddress;
   private Integer province1;
   private Integer city1;
   private Integer county1;
   private Integer village1;
   private String detailAddress1;

   @JsonProperty("province")
   public void setProvince(Integer province) {
      this.province = province;
   }

   @JsonProperty("province")
   public Integer getProvince() {
      return this.province;
   }

   @JsonProperty("city")
   public void setCity(Integer city) {
      this.city = city;
   }

   @JsonProperty("city")
   public Integer getCity() {
      return this.city;
   }

   @JsonProperty("county")
   public void setCounty(Integer county) {
      this.county = county;
   }

   @JsonProperty("county")
   public Integer getCounty() {
      return this.county;
   }

   @JsonProperty("village")
   public void setVillage(Integer village) {
      this.village = village;
   }

   @JsonProperty("village")
   public Integer getVillage() {
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

   @JsonProperty("province1")
   public void setProvince1(Integer province1) {
      this.province1 = province1;
   }

   @JsonProperty("province1")
   public Integer getProvince1() {
      return this.province1;
   }

   @JsonProperty("city1")
   public void setCity1(Integer city1) {
      this.city1 = city1;
   }

   @JsonProperty("city1")
   public Integer getCity1() {
      return this.city1;
   }

   @JsonProperty("county1")
   public void setCounty1(Integer county1) {
      this.county1 = county1;
   }

   @JsonProperty("county1")
   public Integer getCounty1() {
      return this.county1;
   }

   @JsonProperty("village1")
   public void setVillage1(Integer village1) {
      this.village1 = village1;
   }

   @JsonProperty("village1")
   public Integer getVillage1() {
      return this.village1;
   }

   @JsonProperty("detailAddress1")
   public void setDetailAddress1(String detailAddress1) {
      this.detailAddress1 = detailAddress1;
   }

   @JsonProperty("detailAddress1")
   public String getDetailAddress1() {
      return this.detailAddress1;
   }
}
