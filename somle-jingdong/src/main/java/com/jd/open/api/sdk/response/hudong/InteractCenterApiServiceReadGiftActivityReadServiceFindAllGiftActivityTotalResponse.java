package com.jd.open.api.sdk.response.hudong;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.response.AbstractResponse;

public class InteractCenterApiServiceReadGiftActivityReadServiceFindAllGiftActivityTotalResponse extends AbstractResponse {
   private Long returnNum;

   @JsonProperty("returnNum")
   public void setReturnNum(Long returnNum) {
      this.returnNum = returnNum;
   }

   @JsonProperty("returnNum")
   public Long getReturnNum() {
      return this.returnNum;
   }
}
