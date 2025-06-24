package com.jd.open.api.sdk.response.ECLP;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.queryStoreInfo.StoreResponse;
import com.jd.open.api.sdk.response.AbstractResponse;

public class EclpMasterQueryStoreInfoResponse extends AbstractResponse {
   private StoreResponse queryStoreInfoResult;

   @JsonProperty("queryStoreInfo_result")
   public void setQueryStoreInfoResult(StoreResponse queryStoreInfoResult) {
      this.queryStoreInfoResult = queryStoreInfoResult;
   }

   @JsonProperty("queryStoreInfo_result")
   public StoreResponse getQueryStoreInfoResult() {
      return this.queryStoreInfoResult;
   }
}
