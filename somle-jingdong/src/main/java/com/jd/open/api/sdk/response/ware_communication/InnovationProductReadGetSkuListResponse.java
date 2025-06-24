package com.jd.open.api.sdk.response.ware_communication;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ware_communication.ProductSearchResource.response.getSkuList.PageResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class InnovationProductReadGetSkuListResponse extends AbstractResponse {
   private PageResult result;

   @JsonProperty("result")
   public void setResult(PageResult result) {
      this.result = result;
   }

   @JsonProperty("result")
   public PageResult getResult() {
      return this.result;
   }
}
