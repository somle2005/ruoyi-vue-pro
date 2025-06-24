package com.jd.open.api.sdk.response.youE;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.youE.VirtualMobileJsfService.response.findUserVirtualPhone.BaseResultInfo;
import com.jd.open.api.sdk.response.AbstractResponse;

public class UeRecoveryOrderFindUserVirtualPhoneResponse extends AbstractResponse {
   private BaseResultInfo returnType;

   @JsonProperty("returnType")
   public void setReturnType(BaseResultInfo returnType) {
      this.returnType = returnType;
   }

   @JsonProperty("returnType")
   public BaseResultInfo getReturnType() {
      return this.returnType;
   }
}
