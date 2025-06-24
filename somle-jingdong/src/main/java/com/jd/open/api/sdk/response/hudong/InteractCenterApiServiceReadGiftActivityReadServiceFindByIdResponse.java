package com.jd.open.api.sdk.response.hudong;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.hudong.GiftActivityReadService.response.findById.GiftActivity;
import com.jd.open.api.sdk.response.AbstractResponse;

public class InteractCenterApiServiceReadGiftActivityReadServiceFindByIdResponse extends AbstractResponse {
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
