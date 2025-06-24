package com.jd.open.api.sdk.response.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.order.VenderStoresGroupServiceProvider.response.findStoresGroupList.ResultBean;
import com.jd.open.api.sdk.response.AbstractResponse;

public class FindStoresGroupListResponse extends AbstractResponse {
   private ResultBean findstoresgrouplistResult;

   @JsonProperty("findstoresgrouplist_result")
   public void setFindstoresgrouplistResult(ResultBean findstoresgrouplistResult) {
      this.findstoresgrouplistResult = findstoresgrouplistResult;
   }

   @JsonProperty("findstoresgrouplist_result")
   public ResultBean getFindstoresgrouplistResult() {
      return this.findstoresgrouplistResult;
   }
}
