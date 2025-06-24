package com.jd.open.api.sdk.response.mall;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.mall.InteractiveMarketingInfoService.response.doInteractiveAssignment.InteractiveAssignmentResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class InteractiveDoInteractiveAssignmentResponse extends AbstractResponse {
   private InteractiveAssignmentResult interactiveAssignmentResult;

   @JsonProperty("interactiveAssignmentResult")
   public void setInteractiveAssignmentResult(InteractiveAssignmentResult interactiveAssignmentResult) {
      this.interactiveAssignmentResult = interactiveAssignmentResult;
   }

   @JsonProperty("interactiveAssignmentResult")
   public InteractiveAssignmentResult getInteractiveAssignmentResult() {
      return this.interactiveAssignmentResult;
   }
}
