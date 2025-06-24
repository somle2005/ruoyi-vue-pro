package com.jd.open.api.sdk.domain.seller.AuthSafService.response.findUser;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class AuthLogin implements Serializable {
   private int userType;
   private int status;

   @JsonProperty("userType")
   public void setUserType(int userType) {
      this.userType = userType;
   }

   @JsonProperty("userType")
   public int getUserType() {
      return this.userType;
   }

   @JsonProperty("status")
   public void setStatus(int status) {
      this.status = status;
   }

   @JsonProperty("status")
   public int getStatus() {
      return this.status;
   }
}
