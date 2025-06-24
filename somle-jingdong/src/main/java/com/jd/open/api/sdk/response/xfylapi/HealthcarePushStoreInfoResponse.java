package com.jd.open.api.sdk.response.xfylapi;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.xfylapi.ThirdDataExportService.response.pushStoreInfo.JsfResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class HealthcarePushStoreInfoResponse extends AbstractResponse {
   private JsfResult JsfResult;

   @JsonProperty("JsfResult")
   public void setJsfResult(JsfResult JsfResult) {
      this.JsfResult = JsfResult;
   }

   @JsonProperty("JsfResult")
   public JsfResult getJsfResult() {
      return this.JsfResult;
   }
}
