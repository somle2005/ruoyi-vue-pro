package com.jd.open.api.sdk.response.seller;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.seller.AuthSafService.response.findUser.AuthLoginResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class VenderAuthFindUserResponse extends AbstractResponse {
   private AuthLoginResult result;

   @JsonProperty("result")
   public void setResult(AuthLoginResult result) {
      this.result = result;
   }

   @JsonProperty("result")
   public AuthLoginResult getResult() {
      return this.result;
   }
}
