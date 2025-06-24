package com.jd.open.api.sdk.domain.order;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OrderPrintDataConsignee {
   private String consName;
   private String consAddress;
   private String consPhone;
   private String consHandset;

   @JsonProperty("cons_name")
   public String getConsName() {
      return this.consName;
   }

   @JsonProperty("cons_name")
   public void setConsName(String consName) {
      this.consName = consName;
   }

   @JsonProperty("cons_address")
   public String getConsAddress() {
      return this.consAddress;
   }

   @JsonProperty("cons_address")
   public void setConsAddress(String consAddress) {
      this.consAddress = consAddress;
   }

   @JsonProperty("cons_phone")
   public String getConsPhone() {
      return this.consPhone;
   }

   @JsonProperty("cons_phone")
   public void setConsPhone(String consPhone) {
      this.consPhone = consPhone;
   }

   @JsonProperty("cons_handset")
   public String getConsHandset() {
      return this.consHandset;
   }

   @JsonProperty("cons_handset")
   public void setConsHandset(String consHandset) {
      this.consHandset = consHandset;
   }
}
