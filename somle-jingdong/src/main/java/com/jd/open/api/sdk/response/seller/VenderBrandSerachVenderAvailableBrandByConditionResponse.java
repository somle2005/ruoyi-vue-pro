package com.jd.open.api.sdk.response.seller;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.seller.VenderAvailableBrandQueryService.response.serachVenderAvailableBrandByCondition.VenderAvailableBrandResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class VenderBrandSerachVenderAvailableBrandByConditionResponse extends AbstractResponse {
   private VenderAvailableBrandResult VenderAvailableBrandResult;

   @JsonProperty("VenderAvailableBrandResult")
   public void setVenderAvailableBrandResult(VenderAvailableBrandResult VenderAvailableBrandResult) {
      this.VenderAvailableBrandResult = VenderAvailableBrandResult;
   }

   @JsonProperty("VenderAvailableBrandResult")
   public VenderAvailableBrandResult getVenderAvailableBrandResult() {
      return this.VenderAvailableBrandResult;
   }
}
