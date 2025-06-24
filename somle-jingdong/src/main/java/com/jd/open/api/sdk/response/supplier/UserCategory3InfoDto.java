package com.jd.open.api.sdk.response.supplier;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class UserCategory3InfoDto implements Serializable {
   private String providerCode;
   private List<UserCategory3Dto> userCategory3Dtos;

   @JsonProperty("providerCode")
   public void setProviderCode(String providerCode) {
      this.providerCode = providerCode;
   }

   @JsonProperty("providerCode")
   public String getProviderCode() {
      return this.providerCode;
   }

   @JsonProperty("userCategory3Dtos")
   public void setUserCategory3Dtos(List<UserCategory3Dto> userCategory3Dtos) {
      this.userCategory3Dtos = userCategory3Dtos;
   }

   @JsonProperty("userCategory3Dtos")
   public List<UserCategory3Dto> getUserCategory3Dtos() {
      return this.userCategory3Dtos;
   }
}
