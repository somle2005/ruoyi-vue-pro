package com.jd.open.api.sdk.response.user;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.response.AbstractResponse;

public class GetUserPlusLevelQueryResponse extends AbstractResponse {
   private String userPlusLevel;

   @JsonProperty("userPlusLevel")
   public void setUserPlusLevel(String userPlusLevel) {
      this.userPlusLevel = userPlusLevel;
   }

   @JsonProperty("userPlusLevel")
   public String getUserPlusLevel() {
      return this.userPlusLevel;
   }
}
