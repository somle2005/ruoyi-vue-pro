package com.jd.open.api.sdk.domain.jlapi.UserReadExtProvider.response.queryByMobile;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class UserExtRespDTO implements Serializable {
   private String desensitizeNickName;
   private String encryptPin;
   private Long platformId;
   private String desensitizePin;

   @JsonProperty("desensitizeNickName")
   public void setDesensitizeNickName(String desensitizeNickName) {
      this.desensitizeNickName = desensitizeNickName;
   }

   @JsonProperty("desensitizeNickName")
   public String getDesensitizeNickName() {
      return this.desensitizeNickName;
   }

   @JsonProperty("encryptPin")
   public void setEncryptPin(String encryptPin) {
      this.encryptPin = encryptPin;
   }

   @JsonProperty("encryptPin")
   public String getEncryptPin() {
      return this.encryptPin;
   }

   @JsonProperty("platformId")
   public void setPlatformId(Long platformId) {
      this.platformId = platformId;
   }

   @JsonProperty("platformId")
   public Long getPlatformId() {
      return this.platformId;
   }

   @JsonProperty("desensitizePin")
   public void setDesensitizePin(String desensitizePin) {
      this.desensitizePin = desensitizePin;
   }

   @JsonProperty("desensitizePin")
   public String getDesensitizePin() {
      return this.desensitizePin;
   }
}
