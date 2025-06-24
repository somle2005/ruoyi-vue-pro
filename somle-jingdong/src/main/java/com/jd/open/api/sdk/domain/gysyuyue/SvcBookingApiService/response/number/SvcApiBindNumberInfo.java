package com.jd.open.api.sdk.domain.gysyuyue.SvcBookingApiService.response.number;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class SvcApiBindNumberInfo implements Serializable {
   private String extension;
   private String phoneNumberX;
   private String mobile;
   private String expiration;

   @JsonProperty("extension")
   public void setExtension(String extension) {
      this.extension = extension;
   }

   @JsonProperty("extension")
   public String getExtension() {
      return this.extension;
   }

   @JsonProperty("phoneNumberX")
   public void setPhoneNumberX(String phoneNumberX) {
      this.phoneNumberX = phoneNumberX;
   }

   @JsonProperty("phoneNumberX")
   public String getPhoneNumberX() {
      return this.phoneNumberX;
   }

   @JsonProperty("mobile")
   public void setMobile(String mobile) {
      this.mobile = mobile;
   }

   @JsonProperty("mobile")
   public String getMobile() {
      return this.mobile;
   }

   @JsonProperty("expiration")
   public void setExpiration(String expiration) {
      this.expiration = expiration;
   }

   @JsonProperty("expiration")
   public String getExpiration() {
      return this.expiration;
   }
}
