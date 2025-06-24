package com.jd.open.api.sdk.response.ECLP;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.querySupplier.SupplierModel;
import com.jd.open.api.sdk.response.AbstractResponse;
import java.util.List;

public class EclpMasterQuerySupplierResponse extends AbstractResponse {
   private List<SupplierModel> querysupplierResult;

   @JsonProperty("querysupplier_result")
   public void setQuerysupplierResult(List<SupplierModel> querysupplierResult) {
      this.querysupplierResult = querysupplierResult;
   }

   @JsonProperty("querysupplier_result")
   public List<SupplierModel> getQuerysupplierResult() {
      return this.querysupplierResult;
   }
}
