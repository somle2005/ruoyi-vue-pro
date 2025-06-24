package com.jd.open.api.sdk.response.im;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.im.RiskCtrlOpenApi.response.sensitiveWordCheck.OpenApiResponse;
import com.jd.open.api.sdk.response.AbstractResponse;

public class RiskSensitiveWordCheckResponse extends AbstractResponse {
   private OpenApiResponse returnType;

   @JsonProperty("returnType")
   public void setReturnType(OpenApiResponse returnType) {
      this.returnType = returnType;
   }

   @JsonProperty("returnType")
   public OpenApiResponse getReturnType() {
      return this.returnType;
   }
}
