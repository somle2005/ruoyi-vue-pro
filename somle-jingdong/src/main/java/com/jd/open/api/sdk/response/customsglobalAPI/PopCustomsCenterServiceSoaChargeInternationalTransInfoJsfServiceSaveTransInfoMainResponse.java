package com.jd.open.api.sdk.response.customsglobalAPI;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.customsglobalAPI.InternationalTransInfoJsfService.response.saveTransInfoMain.InternationalTransInfoResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class PopCustomsCenterServiceSoaChargeInternationalTransInfoJsfServiceSaveTransInfoMainResponse extends AbstractResponse {
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
