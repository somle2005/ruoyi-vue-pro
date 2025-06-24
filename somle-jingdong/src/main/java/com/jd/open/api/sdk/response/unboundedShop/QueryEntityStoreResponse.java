package com.jd.open.api.sdk.response.unboundedShop;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.unboundedShop.StoreCenterServiceProvider.response.queryEntityStore.ResultBean;
import com.jd.open.api.sdk.response.AbstractResponse;

public class QueryEntityStoreResponse extends AbstractResponse {
   private ResultBean queryentitystoreResult;

   @JsonProperty("queryentitystore_result")
   public void setQueryentitystoreResult(ResultBean queryentitystoreResult) {
      this.queryentitystoreResult = queryentitystoreResult;
   }

   @JsonProperty("queryentitystore_result")
   public ResultBean getQueryentitystoreResult() {
      return this.queryentitystoreResult;
   }
}
