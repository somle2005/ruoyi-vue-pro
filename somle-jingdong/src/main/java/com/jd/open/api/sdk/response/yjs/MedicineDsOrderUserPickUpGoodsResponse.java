package com.jd.open.api.sdk.response.yjs;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.yjs.StoreOrderJosService.response.userPickUpGoods.ApiResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class MedicineDsOrderUserPickUpGoodsResponse extends AbstractResponse {
   private ApiResult apiResult;

   @JsonProperty("apiResult")
   public void setApiResult(ApiResult apiResult) {
      this.apiResult = apiResult;
   }

   @JsonProperty("apiResult")
   public ApiResult getApiResult() {
      return this.apiResult;
   }
}
