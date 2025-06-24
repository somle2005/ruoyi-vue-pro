package com.jd.open.api.sdk.response.video;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.response.AbstractResponse;

public class PopVideoReapplyResponse extends AbstractResponse {
   private Boolean reApplyResult;

   @JsonProperty("re_apply_result")
   public void setReApplyResult(Boolean reApplyResult) {
      this.reApplyResult = reApplyResult;
   }

   @JsonProperty("re_apply_result")
   public Boolean getReApplyResult() {
      return this.reApplyResult;
   }
}
