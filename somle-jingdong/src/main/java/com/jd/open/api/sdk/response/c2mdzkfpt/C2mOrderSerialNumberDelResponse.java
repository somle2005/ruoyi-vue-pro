package com.jd.open.api.sdk.response.c2mdzkfpt;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.c2mdzkfpt.SerialNumberOpenService.response.del.SerialNumberResultEntity;
import com.jd.open.api.sdk.response.AbstractResponse;

public class C2mOrderSerialNumberDelResponse extends AbstractResponse {
   private SerialNumberResultEntity returnType;

   @JsonProperty("returnType")
   public void setReturnType(SerialNumberResultEntity returnType) {
      this.returnType = returnType;
   }

   @JsonProperty("returnType")
   public SerialNumberResultEntity getReturnType() {
      return this.returnType;
   }
}
