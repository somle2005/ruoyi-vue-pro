package com.jd.open.api.sdk.domain.order.IOrderService.response.getmobilelist;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class OrderPrivacyModel implements Serializable {
   private Long oderId;
   private Long venderId;
   private String customerPhone;
   private String consMobilePhone;
   private String expiration;
   private String consMobilePhoneFuzzy;

   @JsonProperty("oderId")
   public void setOderId(Long oderId) {
      this.oderId = oderId;
   }

   @JsonProperty("oderId")
   public Long getOderId() {
      return this.oderId;
   }

   @JsonProperty("venderId")
   public void setVenderId(Long venderId) {
      this.venderId = venderId;
   }

   @JsonProperty("venderId")
   public Long getVenderId() {
      return this.venderId;
   }

   @JsonProperty("customerPhone")
   public void setCustomerPhone(String customerPhone) {
      this.customerPhone = customerPhone;
   }

   @JsonProperty("customerPhone")
   public String getCustomerPhone() {
      return this.customerPhone;
   }

   @JsonProperty("consMobilePhone")
   public void setConsMobilePhone(String consMobilePhone) {
      this.consMobilePhone = consMobilePhone;
   }

   @JsonProperty("consMobilePhone")
   public String getConsMobilePhone() {
      return this.consMobilePhone;
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
