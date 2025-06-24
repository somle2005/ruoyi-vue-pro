package com.jd.open.api.sdk.response.hudong;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.hudong.EvaluateActivityDsmService.response.getVenderBeanAccount.Results;
import com.jd.open.api.sdk.response.AbstractResponse;

public class InteractCenterServiceReadEvaluateEvaluateActivityDsmServiceGetVenderBeanAccountResponse extends AbstractResponse {
   private Results returnType;

   @JsonProperty("returnType")
   public void setReturnType(Results returnType) {
      this.returnType = returnType;
   }

   @JsonProperty("returnType")
   public Results getReturnType() {
      return this.returnType;
   }
}
