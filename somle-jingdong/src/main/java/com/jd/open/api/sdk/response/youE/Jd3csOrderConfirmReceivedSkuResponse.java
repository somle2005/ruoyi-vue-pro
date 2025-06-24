package com.jd.open.api.sdk.response.youE;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.youE.PerformInfoSyncExportService.response.confirmReceivedSku.PerformResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class Jd3csOrderConfirmReceivedSkuResponse extends AbstractResponse {
   private PerformResult returnType;

   @JsonProperty("returnType")
   public void setReturnType(PerformResult returnType) {
      this.returnType = returnType;
   }

   @JsonProperty("returnType")
   public PerformResult getReturnType() {
      return this.returnType;
   }
}
