package com.jd.open.api.sdk.response.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.order.StoreCenterServiceProvider.response.updateEntityStore.ResultBean;
import com.jd.open.api.sdk.response.AbstractResponse;

public class UpdateEntityStoreResponse extends AbstractResponse {
   private ResultBean updateentitystoreResult;

   @JsonProperty("updateentitystore_result")
   public void setUpdateentitystoreResult(ResultBean updateentitystoreResult) {
      this.updateentitystoreResult = updateentitystoreResult;
   }

   @JsonProperty("updateentitystore_result")
   public ResultBean getUpdateentitystoreResult() {
      return this.updateentitystoreResult;
   }
}
