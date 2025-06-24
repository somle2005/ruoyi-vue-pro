package com.jd.open.api.sdk.response.unboundedShop;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.unboundedShop.StoreCenterServiceProvider.response.createEntityStore.ResultBean;
import com.jd.open.api.sdk.response.AbstractResponse;

public class CreateEntityStoreResponse extends AbstractResponse {
   private ResultBean createentitystoreResult;

   @JsonProperty("createentitystore_result")
   public void setCreateentitystoreResult(ResultBean createentitystoreResult) {
      this.createentitystoreResult = createentitystoreResult;
   }

   @JsonProperty("createentitystore_result")
   public ResultBean getCreateentitystoreResult() {
      return this.createentitystoreResult;
   }
}
