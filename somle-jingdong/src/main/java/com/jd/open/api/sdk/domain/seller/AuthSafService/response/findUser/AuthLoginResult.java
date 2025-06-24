package com.jd.open.api.sdk.domain.seller.AuthSafService.response.findUser;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class AuthLoginResult implements Serializable {
   private boolean success;
   private AuthLogin authLogin;

   @JsonProperty("success")
   public void setSuccess(boolean success) {
      this.success = success;
   }

   @JsonProperty("success")
   public boolean getSuccess() {
      return this.success;
   }

   @JsonProperty("authLogin")
   public void setAuthLogin(AuthLogin authLogin) {
      this.authLogin = authLogin;
   }

   @JsonProperty("authLogin")
   public AuthLogin getAuthLogin() {
      return this.authLogin;
   }
}
