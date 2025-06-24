package com.jd.open.api.sdk.response.jialilue;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.jialilue.SkuService.response.updateCheckStatusBatch.NormalResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class UpdateCheckStatusBatchResponse extends AbstractResponse {
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
