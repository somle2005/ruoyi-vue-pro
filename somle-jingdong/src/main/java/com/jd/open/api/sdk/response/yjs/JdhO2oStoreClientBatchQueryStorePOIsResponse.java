package com.jd.open.api.sdk.response.yjs;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.yjs.StoreClient.response.batchQueryStorePOIs.StorePOIResponse;
import com.jd.open.api.sdk.response.AbstractResponse;

public class JdhO2oStoreClientBatchQueryStorePOIsResponse extends AbstractResponse {
   private StorePOIResponse returnType;

   @JsonProperty("returnType")
   public void setReturnType(StorePOIResponse returnType) {
      this.returnType = returnType;
   }

   @JsonProperty("returnType")
   public StorePOIResponse getReturnType() {
      return this.returnType;
   }
}
