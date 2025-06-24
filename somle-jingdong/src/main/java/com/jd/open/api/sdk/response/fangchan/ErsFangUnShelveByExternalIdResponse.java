package com.jd.open.api.sdk.response.fangchan;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.fangchan.HouseResourceSoaService.response.unShelveByExternalId.Result;
import com.jd.open.api.sdk.response.AbstractResponse;

public class ErsFangUnShelveByExternalIdResponse extends AbstractResponse {
   private Result deletebyexternalidResult;

   @JsonProperty("deletebyexternalid_result")
   public void setDeletebyexternalidResult(Result deletebyexternalidResult) {
      this.deletebyexternalidResult = deletebyexternalidResult;
   }

   @JsonProperty("deletebyexternalid_result")
   public Result getDeletebyexternalidResult() {
      return this.deletebyexternalidResult;
   }
}
