package com.jd.open.api.sdk.domain.order.OrderQueryJsfService.response.get;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class OrderPrintDataConsignee implements Serializable {
   private String consName;
   private String consAddress;
   private String consPhone;
   private String consHandset;
   private String oaid;
   private String desenConsPhone;
   private String desenConsHandset;

   @JsonProperty("cons_name")
   public void setConsName(String consName) {
      this.consName = consName;
   }

   @JsonProperty("cons_name")
   public String getConsName() {
      return this.consName;
   }

   @JsonProperty("cons_address")
   public void setConsAddress(String consAddress) {
      this.consAddress = consAddress;
   }

   @JsonProperty("cons_address")
   public String getConsAddress() {
      return this.consAddress;
   }

   @JsonProperty("cons_phone")
   public void setConsPhone(String consPhone) {
      this.consPhone = consPhone;
   }

   @JsonProperty("cons_phone")
   public String getConsPhone() {
      return this.consPhone;
   }

   @JsonProperty("cons_handset")
   public void setConsHandset(String consHandset) {
      this.consHandset = consHandset;
   }

   @JsonProperty("cons_handset")
   public String getConsHandset() {
      return this.consHandset;
   }

   @JsonProperty("oaid")
   public void setOaid(String oaid) {
      this.oaid = oaid;
   }

   @JsonProperty("oaid")
   public String getOaid() {
      return this.oaid;
   }

   @JsonProperty("desen_cons_phone")
   public void setDesenConsPhone(String desenConsPhone) {
      this.desenConsPhone = desenConsPhone;
   }

   @JsonProperty("desen_cons_phone")
   public String getDesenConsPhone() {
      return this.desenConsPhone;
   }

   @JsonProperty("desen_cons_handset")
   public void setDesenConsHandset(String desenConsHandset) {
      this.desenConsHandset = desenConsHandset;
   }

   @JsonProperty("desen_cons_handset")
   public String getDesenConsHandset() {
      return this.desenConsHandset;
   }
}
