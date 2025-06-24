package com.jd.open.api.sdk.response.Omni_channel;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.Omni_channel.PerformancePlatformService.response.receiveStatus.NormalResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class PerformancePlatformServiceReceiveStatusResponse extends AbstractResponse {
   private NormalResult returnType;

   @JsonProperty("returnType")
   public void setReturnType(NormalResult returnType) {
      this.returnType = returnType;
   }

   @JsonProperty("returnType")
   public NormalResult getReturnType() {
      return this.returnType;
   }
}
