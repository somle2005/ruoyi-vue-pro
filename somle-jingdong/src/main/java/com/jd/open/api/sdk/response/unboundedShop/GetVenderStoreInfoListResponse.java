package com.jd.open.api.sdk.response.unboundedShop;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.unboundedShop.DjcsServiceProvider.response.getVenderStoreInfoList.Page;
import com.jd.open.api.sdk.response.AbstractResponse;

public class GetVenderStoreInfoListResponse extends AbstractResponse {
   private Page getVenderStoreInfoListResult;

   @JsonProperty("getVenderStoreInfoList_result")
   public void setGetVenderStoreInfoListResult(Page getVenderStoreInfoListResult) {
      this.getVenderStoreInfoListResult = getVenderStoreInfoListResult;
   }

   @JsonProperty("getVenderStoreInfoList_result")
   public Page getGetVenderStoreInfoListResult() {
      return this.getVenderStoreInfoListResult;
   }
}
