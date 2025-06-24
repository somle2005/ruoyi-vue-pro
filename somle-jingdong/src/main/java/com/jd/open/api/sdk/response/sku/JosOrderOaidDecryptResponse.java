package com.jd.open.api.sdk.response.sku;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.sku.IOaidService.response.decrypt.ResponseData;
import com.jd.open.api.sdk.response.AbstractResponse;

public class JosOrderOaidDecryptResponse extends AbstractResponse {
   private ResponseData returnType;

   @JsonProperty("returnType")
   public void setReturnType(ResponseData returnType) {
      this.returnType = returnType;
   }

   @JsonProperty("returnType")
   public ResponseData getReturnType() {
      return this.returnType;
   }
}
