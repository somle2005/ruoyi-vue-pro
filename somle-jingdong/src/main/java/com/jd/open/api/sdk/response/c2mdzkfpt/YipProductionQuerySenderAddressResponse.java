package com.jd.open.api.sdk.response.c2mdzkfpt;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.c2mdzkfpt.SenderAddressOpenService.response.querySenderAddress.SenderAddressResultEntity;
import com.jd.open.api.sdk.response.AbstractResponse;

public class YipProductionQuerySenderAddressResponse extends AbstractResponse {
   private SenderAddressResultEntity returnType;

   @JsonProperty("returnType")
   public void setReturnType(SenderAddressResultEntity returnType) {
      this.returnType = returnType;
   }

   @JsonProperty("returnType")
   public SenderAddressResultEntity getReturnType() {
      return this.returnType;
   }
}
