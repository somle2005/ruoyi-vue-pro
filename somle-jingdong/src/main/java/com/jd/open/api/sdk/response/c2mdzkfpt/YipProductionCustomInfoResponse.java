package com.jd.open.api.sdk.response.c2mdzkfpt;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.c2mdzkfpt.CustomInfoQueryOpenService.response.customInfo.CustomInfoResultEntity;
import com.jd.open.api.sdk.response.AbstractResponse;

public class YipProductionCustomInfoResponse extends AbstractResponse {
   private CustomInfoResultEntity result;

   @JsonProperty("result")
   public void setResult(CustomInfoResultEntity result) {
      this.result = result;
   }

   @JsonProperty("result")
   public CustomInfoResultEntity getResult() {
      return this.result;
   }
}
