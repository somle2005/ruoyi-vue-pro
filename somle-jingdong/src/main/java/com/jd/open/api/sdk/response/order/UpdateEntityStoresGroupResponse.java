package com.jd.open.api.sdk.response.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.order.VenderStoresGroupServiceProvider.response.updateEntityStoresGroup.ResultBean;
import com.jd.open.api.sdk.response.AbstractResponse;

public class UpdateEntityStoresGroupResponse extends AbstractResponse {
   private ResultBean updateentitystoresgroupResult;

   @JsonProperty("updateentitystoresgroup_result")
   public void setUpdateentitystoresgroupResult(ResultBean updateentitystoresgroupResult) {
      this.updateentitystoresgroupResult = updateentitystoresgroupResult;
   }

   @JsonProperty("updateentitystoresgroup_result")
   public ResultBean getUpdateentitystoresgroupResult() {
      return this.updateentitystoresgroupResult;
   }
}
