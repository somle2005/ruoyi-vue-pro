package com.jd.open.api.sdk.response.afsservice;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.afsservice.NegotiationOperateSoaService.response.create.PublicResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class AfsNegotiationOperateCreateResponse extends AbstractResponse {
   private PublicResult returnType;

   @JsonProperty("returnType")
   public void setReturnType(PublicResult returnType) {
      this.returnType = returnType;
   }

   @JsonProperty("returnType")
   public PublicResult getReturnType() {
      return this.returnType;
   }
}
