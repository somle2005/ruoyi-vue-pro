package com.jd.open.api.sdk.domain.shangjiashouhou.ServiceAuditProvider.request.customerDeliveryStoreApply;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class AddressInfo implements Serializable {
   private Integer province;
   private Integer city;
   private Integer county;
   private Integer village;
   private String detailAddress;

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
}
