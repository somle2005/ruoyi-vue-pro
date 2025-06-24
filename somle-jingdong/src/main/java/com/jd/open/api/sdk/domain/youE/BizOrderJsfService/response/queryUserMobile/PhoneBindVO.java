package com.jd.open.api.sdk.domain.youE.BizOrderJsfService.response.queryUserMobile;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class PhoneBindVO implements Serializable {
   private String phoneBindNumber;
   private String phoneBindTimeout;

   @JsonProperty("phoneBindNumber")
   public void setPhoneBindNumber(String phoneBindNumber) {
      this.phoneBindNumber = phoneBindNumber;
   }

   @JsonProperty("phoneBindNumber")
   public String getPhoneBindNumber() {
      return this.phoneBindNumber;
   }

   @JsonProperty("phoneBindTimeout")
   public void setPhoneBindTimeout(String phoneBindTimeout) {
      this.phoneBindTimeout = phoneBindTimeout;
   }

   @JsonProperty("phoneBindTimeout")
   public String getPhoneBindTimeout() {
      return this.phoneBindTimeout;
   }
}
