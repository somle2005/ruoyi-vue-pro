package com.jd.open.api.sdk.response.c2mdzkfpt;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.c2mdzkfpt.CustomServiceOrderTrackService.response.writeOrderTrack.BaseResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class YipProductionWriteOrderTrackResponse extends AbstractResponse {
   private BaseResult returnType;

   @JsonProperty("returnType")
   public void setReturnType(BaseResult returnType) {
      this.returnType = returnType;
   }

   @JsonProperty("returnType")
   public BaseResult getReturnType() {
      return this.returnType;
   }
}
