package com.jd.open.api.sdk.response.hudong;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.response.AbstractResponse;

public class InteractCenterApiJosJosFansActivityWriteServiceCloseGiftActivityResponse extends AbstractResponse {
   private Boolean returnType;

   @JsonProperty("returnType")
   public void setReturnType(Boolean returnType) {
      this.returnType = returnType;
   }

   @JsonProperty("returnType")
   public Boolean getReturnType() {
      return this.returnType;
   }
}
