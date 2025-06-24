package com.jd.open.api.sdk.response.digitalstore;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.digitalstore.CloudPosPayExportService.response.forceExpirePreOrderId.PhoebusResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class PayForceExpirePreOrderIdResponse extends AbstractResponse {
   private PhoebusResult PhoebusResult;

   @JsonProperty("PhoebusResult")
   public void setPhoebusResult(PhoebusResult PhoebusResult) {
      this.PhoebusResult = PhoebusResult;
   }

   @JsonProperty("PhoebusResult")
   public PhoebusResult getPhoebusResult() {
      return this.PhoebusResult;
   }
}
