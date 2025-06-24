package com.jd.open.api.sdk.domain.B2B.B2BPromotionProvider.request.get;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class UserInfo implements Serializable {
   private String pin;
   private String ip;

   @JsonProperty("pin")
   public void setPin(String pin) {
      this.pin = pin;
   }

   @JsonProperty("pin")
   public String getPin() {
      return this.pin;
   }

   @JsonProperty("ip")
   public void setIp(String ip) {
      this.ip = ip;
   }

   @JsonProperty("ip")
   public String getIp() {
      return this.ip;
   }
}
