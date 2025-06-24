package com.jd.open.api.sdk.domain.c2mdzkfpt.SenderAddressOpenService.response.querySenderAddress;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class SenderAddressEntity implements Serializable {
   private String address;
   private Long addressId;

   @JsonProperty("address")
   public void setAddress(String address) {
      this.address = address;
   }

   @JsonProperty("address")
   public String getAddress() {
      return this.address;
   }

   @JsonProperty("addressId")
   public void setAddressId(Long addressId) {
      this.addressId = addressId;
   }

   @JsonProperty("addressId")
   public Long getAddressId() {
      return this.addressId;
   }
}
