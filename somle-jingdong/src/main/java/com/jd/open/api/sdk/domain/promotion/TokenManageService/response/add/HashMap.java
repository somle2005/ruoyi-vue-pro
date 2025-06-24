package com.jd.open.api.sdk.domain.promotion.TokenManageService.response.add;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class HashMap implements Serializable {
   private String realPin;
   private String openIdBuyer;
   private String xidBuyer;

   @JsonProperty("realPin")
   public void setRealPin(String realPin) {
      this.realPin = realPin;
   }

   @JsonProperty("realPin")
   public String getRealPin() {
      return this.realPin;
   }

   @JsonProperty("open_id_buyer")
   public void setOpenIdBuyer(String openIdBuyer) {
      this.openIdBuyer = openIdBuyer;
   }

   @JsonProperty("open_id_buyer")
   public String getOpenIdBuyer() {
      return this.openIdBuyer;
   }

   @JsonProperty("xid_buyer")
   public void setXidBuyer(String xidBuyer) {
      this.xidBuyer = xidBuyer;
   }

   @JsonProperty("xid_buyer")
   public String getXidBuyer() {
      return this.xidBuyer;
   }
}
