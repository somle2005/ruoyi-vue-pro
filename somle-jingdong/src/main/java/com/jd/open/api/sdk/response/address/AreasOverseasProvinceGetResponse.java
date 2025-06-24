package com.jd.open.api.sdk.response.address;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.address.BaseAreaService.response.get.BaseAreaServiceResponse;
import com.jd.open.api.sdk.response.AbstractResponse;

public class AreasOverseasProvinceGetResponse extends AbstractResponse {
   private BaseAreaServiceResponse result;

   @JsonProperty("result")
   public void setResult(BaseAreaServiceResponse result) {
      this.result = result;
   }

   @JsonProperty("result")
   public BaseAreaServiceResponse getResult() {
      return this.result;
   }
}
