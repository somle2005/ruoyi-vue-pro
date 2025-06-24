package com.jd.open.api.sdk.response.ECLP;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ECLP.B2BElectronicBusinessCloudService.response.getSellerInfo.SellerInfoResponse;
import com.jd.open.api.sdk.response.AbstractResponse;

public class EclpMasterGetSellerInfoResponse extends AbstractResponse {
   private SellerInfoResponse getsellerinfoResult;

   @JsonProperty("getsellerinfo_result")
   public void setGetsellerinfoResult(SellerInfoResponse getsellerinfoResult) {
      this.getsellerinfoResult = getsellerinfoResult;
   }

   @JsonProperty("getsellerinfo_result")
   public SellerInfoResponse getGetsellerinfoResult() {
      return this.getsellerinfoResult;
   }
}
