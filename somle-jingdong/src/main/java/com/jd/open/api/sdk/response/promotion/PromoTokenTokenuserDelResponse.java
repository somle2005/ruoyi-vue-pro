package com.jd.open.api.sdk.response.promotion;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.promotion.TokenManageService.response.del.RespResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class PromoTokenTokenuserDelResponse extends AbstractResponse {
   private RespResult addtokenuserResult;

   @JsonProperty("addtokenuser_result")
   public void setAddtokenuserResult(RespResult addtokenuserResult) {
      this.addtokenuserResult = addtokenuserResult;
   }

   @JsonProperty("addtokenuser_result")
   public RespResult getAddtokenuserResult() {
      return this.addtokenuserResult;
   }
}
