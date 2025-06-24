package com.jd.open.api.sdk.response.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.order.VenderStoresGroupServiceProvider.response.createEntityStoresGroup.ResultBean;
import com.jd.open.api.sdk.response.AbstractResponse;

public class CreateEntityStoresGroupResponse extends AbstractResponse {
   private ResultBean createentitystoresgroupResult;

   @JsonProperty("createentitystoresgroup_result")
   public void setCreateentitystoresgroupResult(ResultBean createentitystoresgroupResult) {
      this.createentitystoresgroupResult = createentitystoresgroupResult;
   }

   @JsonProperty("createentitystoresgroup_result")
   public ResultBean getCreateentitystoresgroupResult() {
      return this.createentitystoresgroupResult;
   }
}
