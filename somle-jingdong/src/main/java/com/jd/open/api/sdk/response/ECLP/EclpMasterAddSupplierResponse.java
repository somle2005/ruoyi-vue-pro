package com.jd.open.api.sdk.response.ECLP;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.response.AbstractResponse;

public class EclpMasterAddSupplierResponse extends AbstractResponse {
   private String addsupplierResult;

   @JsonProperty("addsupplier_result")
   public void setAddsupplierResult(String addsupplierResult) {
      this.addsupplierResult = addsupplierResult;
   }

   @JsonProperty("addsupplier_result")
   public String getAddsupplierResult() {
      return this.addsupplierResult;
   }
}
