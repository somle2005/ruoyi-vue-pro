package com.jd.open.api.sdk.response.vopdz;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.vopdz.QueryAddressOpenProvider.response.queryJdAreaIdList.OpenRpcResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class VopAddressQueryJdAreaIdListResponse extends AbstractResponse {
   private OpenRpcResult openRpcResult;

   @JsonProperty("openRpcResult")
   public void setOpenRpcResult(OpenRpcResult openRpcResult) {
      this.openRpcResult = openRpcResult;
   }

   @JsonProperty("openRpcResult")
   public OpenRpcResult getOpenRpcResult() {
      return this.openRpcResult;
   }
}
