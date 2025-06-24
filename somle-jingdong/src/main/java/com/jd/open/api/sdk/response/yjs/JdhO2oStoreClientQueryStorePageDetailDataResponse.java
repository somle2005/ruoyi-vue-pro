package com.jd.open.api.sdk.response.yjs;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.yjs.StoreClient.response.queryStorePageDetailData.StorePageDetailResponse;
import com.jd.open.api.sdk.response.AbstractResponse;

public class JdhO2oStoreClientQueryStorePageDetailDataResponse extends AbstractResponse {
   private StorePageDetailResponse returnType;

   @JsonProperty("returnType")
   public void setReturnType(StorePageDetailResponse returnType) {
      this.returnType = returnType;
   }

   @JsonProperty("returnType")
   public StorePageDetailResponse getReturnType() {
      return this.returnType;
   }
}
