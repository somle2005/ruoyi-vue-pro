package com.jd.open.api.sdk.response.hudong;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.hudong.GiftActivityReadService.response.findRuleByIdAndType.GiftRuleActivity;
import com.jd.open.api.sdk.response.AbstractResponse;
import java.util.List;

public class InteractCenterApiServiceReadGiftActivityReadServiceFindRuleByIdAndTypeResponse extends AbstractResponse {
   private List<GiftRuleActivity> returnType;

   @JsonProperty("returnType")
   public void setReturnType(List<GiftRuleActivity> returnType) {
      this.returnType = returnType;
   }

   @JsonProperty("returnType")
   public List<GiftRuleActivity> getReturnType() {
      return this.returnType;
   }
}
