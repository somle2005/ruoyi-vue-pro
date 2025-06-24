package com.jd.open.api.sdk.response.seller;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.response.AbstractResponse;

public class VenderInfoQueryByPinResponse extends AbstractResponse {
   private VenderInfoResult venderInfoResult;

   @JsonProperty("vender_info_result")
   public void setVenderInfoResult(VenderInfoResult venderInfoResult) {
      this.venderInfoResult = venderInfoResult;
   }

   @JsonProperty("vender_info_result")
   public VenderInfoResult getVenderInfoResult() {
      return this.venderInfoResult;
   }
}
