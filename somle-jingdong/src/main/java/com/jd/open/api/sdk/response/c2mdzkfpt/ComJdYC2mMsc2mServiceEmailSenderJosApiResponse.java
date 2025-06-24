package com.jd.open.api.sdk.response.c2mdzkfpt;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.c2mdzkfpt.EmailSenderJosApi.response.EmailSenderJosApi.DataResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class ComJdYC2mMsc2mServiceEmailSenderJosApiResponse extends AbstractResponse {
   private DataResult returnType;

   @JsonProperty("returnType")
   public void setReturnType(DataResult returnType) {
      this.returnType = returnType;
   }

   @JsonProperty("returnType")
   public DataResult getReturnType() {
      return this.returnType;
   }
}
