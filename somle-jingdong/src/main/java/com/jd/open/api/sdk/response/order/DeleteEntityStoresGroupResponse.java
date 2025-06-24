package com.jd.open.api.sdk.response.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.order.VenderStoresGroupServiceProvider.response.deleteEntityStoresGroup.ResultBean;
import com.jd.open.api.sdk.response.AbstractResponse;

public class DeleteEntityStoresGroupResponse extends AbstractResponse {
   private ResultBean deleteentitystoresgroupResult;

   @JsonProperty("deleteentitystoresgroup_result")
   public void setDeleteentitystoresgroupResult(ResultBean deleteentitystoresgroupResult) {
      this.deleteentitystoresgroupResult = deleteentitystoresgroupResult;
   }

   @JsonProperty("deleteentitystoresgroup_result")
   public ResultBean getDeleteentitystoresgroupResult() {
      return this.deleteentitystoresgroupResult;
   }
}
