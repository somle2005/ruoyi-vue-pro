package com.jd.open.api.sdk.response.promotion;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.response.AbstractResponse;

public class SellerPromotionV2ResumeResponse extends AbstractResponse {
   private boolean resumeResult;

   @JsonProperty("resume_result")
   public void setResumeResult(boolean resumeResult) {
      this.resumeResult = resumeResult;
   }

   @JsonProperty("resume_result")
   public boolean getResumeResult() {
      return this.resumeResult;
   }
}
