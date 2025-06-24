package com.jd.open.api.sdk.domain.sku.IOaidService.response.decrypt;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class OrderReceiverInfoModel implements Serializable {
   private Long orderId;
   private String oaid;
   private String customerName;
   private String consMobilePhone;
   private Boolean privacyProtection;
   private String address;
   private String customerPhone;
   private String expiration;
   private String consMobilePhoneFuzzy;

   @JsonProperty("orderId")
   public void setOrderId(Long orderId) {
      this.orderId = orderId;
   }

   @JsonProperty("orderId")
   public Long getOrderId() {
      return this.orderId;
   }

   @JsonProperty("oaid")
   public void setOaid(String oaid) {
      this.oaid = oaid;
   }

   @JsonProperty("oaid")
   public String getOaid() {
      return this.oaid;
   }

   @JsonProperty("customerName")
   public void setCustomerName(String customerName) {
      this.customerName = customerName;
   }

   @JsonProperty("customerName")
   public String getCustomerName() {
      return this.customerName;
   }

   @JsonProperty("consMobilePhone")
   public void setConsMobilePhone(String consMobilePhone) {
      this.consMobilePhone = consMobilePhone;
   }

   @JsonProperty("consMobilePhone")
   public String getConsMobilePhone() {
      return this.consMobilePhone;
   }

   @JsonProperty("privacyProtection")
   public void setPrivacyProtection(Boolean privacyProtection) {
      this.privacyProtection = privacyProtection;
   }

   @JsonProperty("privacyProtection")
   public Boolean getPrivacyProtection() {
      return this.privacyProtection;
   }

   @JsonProperty("address")
   public void setAddress(String address) {
      this.address = address;
   }

   @JsonProperty("address")
   public String getAddress() {
      return this.address;
   }

   @JsonProperty("customerPhone")
   public void setCustomerPhone(String customerPhone) {
      this.customerPhone = customerPhone;
   }

   @JsonProperty("customerPhone")
   public String getCustomerPhone() {
      return this.customerPhone;
   }

   @JsonProperty("expiration")
   public void setExpiration(String expiration) {
      this.expiration = expiration;
   }

   @JsonProperty("expiration")
   public String getExpiration() {
      return this.expiration;
   }

   @JsonProperty("consMobilePhoneFuzzy")
   public void setConsMobilePhoneFuzzy(String consMobilePhoneFuzzy) {
      this.consMobilePhoneFuzzy = consMobilePhoneFuzzy;
   }

   @JsonProperty("consMobilePhoneFuzzy")
   public String getConsMobilePhoneFuzzy() {
      return this.consMobilePhoneFuzzy;
   }
}
