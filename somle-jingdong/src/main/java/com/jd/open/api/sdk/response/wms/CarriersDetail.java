package com.jd.open.api.sdk.response.wms;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class CarriersDetail implements Serializable {
   private String carriersId;
   private String carriersName;
   private String carriersPhone;

   @JsonProperty("carriers_id")
   public void setCarriersId(String carriersId) {
      this.carriersId = carriersId;
   }

   @JsonProperty("carriers_id")
   public String getCarriersId() {
      return this.carriersId;
   }

   @JsonProperty("carriers_name")
   public void setCarriersName(String carriersName) {
      this.carriersName = carriersName;
   }

   @JsonProperty("carriers_name")
   public String getCarriersName() {
      return this.carriersName;
   }

   @JsonProperty("carriers_phone")
   public void setCarriersPhone(String carriersPhone) {
      this.carriersPhone = carriersPhone;
   }

   @JsonProperty("carriers_phone")
   public String getCarriersPhone() {
      return this.carriersPhone;
   }
}
