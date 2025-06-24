package com.jd.open.api.sdk.response.ECLP;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ECLP.BaseModifyService.response.modify.BaseResponse;
import com.jd.open.api.sdk.response.AbstractResponse;

public class OpenOmbJosModifyResponse extends AbstractResponse {
   private BaseResponse response;

   @JsonProperty("response")
   public void setResponse(BaseResponse response) {
      this.response = response;
   }

   @JsonProperty("response")
   public BaseResponse getResponse() {
      return this.response;
   }
}
