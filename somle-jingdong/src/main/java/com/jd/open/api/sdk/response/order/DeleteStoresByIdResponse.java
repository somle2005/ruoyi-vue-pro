package com.jd.open.api.sdk.response.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.order.StoreCenterServiceProvider.response.deleteStoresById.ResultBean;
import com.jd.open.api.sdk.response.AbstractResponse;

public class DeleteStoresByIdResponse extends AbstractResponse {
   private ResultBean deletestoresbyidResult;

   @JsonProperty("deletestoresbyid_result")
   public void setDeletestoresbyidResult(ResultBean deletestoresbyidResult) {
      this.deletestoresbyidResult = deletestoresbyidResult;
   }

   @JsonProperty("deletestoresbyid_result")
   public ResultBean getDeletestoresbyidResult() {
      return this.deletestoresbyidResult;
   }
}
