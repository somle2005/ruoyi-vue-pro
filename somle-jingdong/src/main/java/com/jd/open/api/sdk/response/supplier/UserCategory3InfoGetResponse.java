package com.jd.open.api.sdk.response.supplier;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.response.AbstractResponse;

public class UserCategory3InfoGetResponse extends AbstractResponse {
   private UserCategory3InfoDto userCategory3Info;

   @JsonProperty("userCategory3Info")
   public void setUserCategory3Info(UserCategory3InfoDto userCategory3Info) {
      this.userCategory3Info = userCategory3Info;
   }

   @JsonProperty("userCategory3Info")
   public UserCategory3InfoDto getUserCategory3Info() {
      return this.userCategory3Info;
   }
}
