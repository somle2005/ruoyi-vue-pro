package com.jd.open.api.sdk.response.ware;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ware.JOSMaterialService.response.unbind.Result;
import com.jd.open.api.sdk.response.AbstractResponse;

public class MediaMaterialImageUnbindResponse extends AbstractResponse {
   private Result materialResult;

   @JsonProperty("materialResult")
   public void setMaterialResult(Result materialResult) {
      this.materialResult = materialResult;
   }

   @JsonProperty("materialResult")
   public Result getMaterialResult() {
      return this.materialResult;
   }
}
