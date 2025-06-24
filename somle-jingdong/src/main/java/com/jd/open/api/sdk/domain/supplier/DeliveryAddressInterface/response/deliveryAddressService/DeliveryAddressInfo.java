package com.jd.open.api.sdk.domain.supplier.DeliveryAddressInterface.response.deliveryAddressService;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class DeliveryAddressInfo implements Serializable {
   private Integer addressId;
   private String address;

   @JsonProperty("addressId")
   public void setAddressId(Integer addressId) {
      this.addressId = addressId;
   }

   @JsonProperty("addressId")
   public Integer getAddressId() {
      return this.addressId;
   }

   @JsonProperty("address")
   public void setAddress(String address) {
      this.address = address;
   }

   @JsonProperty("address")
   public String getAddress() {
      return this.address;
   }
}
