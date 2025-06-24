package com.jd.open.api.sdk.response.xfylapi;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.xfylapi.ThirdDataExportService.response.pushGoodsStoreInfo.JsfResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class HealthcarePushGoodsStoreInfoResponse extends AbstractResponse {
   private JsfResult Result;

   @JsonProperty("Result")
   public void setResult(JsfResult Result) {
      this.Result = Result;
   }

   @JsonProperty("Result")
   public JsfResult getResult() {
      return this.Result;
   }
}
