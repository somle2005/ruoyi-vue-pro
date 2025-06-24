package com.jd.open.api.sdk.response.yjs;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.yjs.StoreOrderJosService.response.getIncrementOrderList.ApiResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class MedicineDsOrderGetIncrementOrderListResponse extends AbstractResponse {
   private ApiResult ApiResult;

   @JsonProperty("ApiResult")
   public void setApiResult(ApiResult ApiResult) {
      this.ApiResult = ApiResult;
   }

   @JsonProperty("ApiResult")
   public ApiResult getApiResult() {
      return this.ApiResult;
   }
}
