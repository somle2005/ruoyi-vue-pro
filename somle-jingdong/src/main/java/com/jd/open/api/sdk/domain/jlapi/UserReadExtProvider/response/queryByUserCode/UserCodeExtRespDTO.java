package com.jd.open.api.sdk.domain.jlapi.UserReadExtProvider.response.queryByUserCode;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class UserCodeExtRespDTO implements Serializable {
   private String encryptPin;
   private String mobile;

   @JsonProperty("encryptPin")
   public void setEncryptPin(String encryptPin) {
      this.encryptPin = encryptPin;
   }

   @JsonProperty("encryptPin")
   public String getEncryptPin() {
      return this.encryptPin;
   }

   @JsonProperty("mobile")
   public void setMobile(String mobile) {
      this.mobile = mobile;
   }

   @JsonProperty("mobile")
   public String getMobile() {
      return this.mobile;
   }
}
