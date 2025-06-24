package com.jd.open.api.sdk.response.hudong;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.hudong.JosFansActivityWriteService.response.createGiftActivityWithResult.GiftActivity;
import com.jd.open.api.sdk.response.AbstractResponse;

public class InteractCenterApiJosJosFansActivityWriteServiceCreateGiftActivityWithResultResponse extends AbstractResponse {
   private GiftActivity returnType;

   @JsonProperty("returnType")
   public void setReturnType(GiftActivity returnType) {
      this.returnType = returnType;
   }

   @JsonProperty("returnType")
   public GiftActivity getReturnType() {
      return this.returnType;
   }
}
