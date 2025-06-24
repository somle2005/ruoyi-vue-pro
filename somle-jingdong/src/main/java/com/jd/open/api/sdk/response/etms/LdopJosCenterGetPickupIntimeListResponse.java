package com.jd.open.api.sdk.response.etms;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.etms.PickupTimeRangeApi.response.getPickupIntimeList.ResponseDTO;
import com.jd.open.api.sdk.response.AbstractResponse;

public class LdopJosCenterGetPickupIntimeListResponse extends AbstractResponse {
   private ResponseDTO result;

   @JsonProperty("result")
   public void setResult(ResponseDTO result) {
      this.result = result;
   }

   @JsonProperty("result")
   public ResponseDTO getResult() {
      return this.result;
   }
}
