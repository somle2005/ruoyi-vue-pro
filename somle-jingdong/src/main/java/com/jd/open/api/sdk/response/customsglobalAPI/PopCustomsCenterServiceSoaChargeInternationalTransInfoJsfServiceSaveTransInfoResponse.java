package com.jd.open.api.sdk.response.customsglobalAPI;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.customsglobalAPI.InternationalTransInfoJsfService.response.saveTransInfo.InternationalTransInfoResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class PopCustomsCenterServiceSoaChargeInternationalTransInfoJsfServiceSaveTransInfoResponse extends AbstractResponse {
   private InternationalTransInfoResult saveResult;

   @JsonProperty("save_result")
   public void setSaveResult(InternationalTransInfoResult saveResult) {
      this.saveResult = saveResult;
   }

   @JsonProperty("save_result")
   public InternationalTransInfoResult getSaveResult() {
      return this.saveResult;
   }
}
