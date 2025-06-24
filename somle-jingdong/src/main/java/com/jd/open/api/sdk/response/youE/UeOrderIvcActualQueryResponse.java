package com.jd.open.api.sdk.response.youE;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.youE.IvcActualQueryUeService.response.ivcActualQuery.ServerResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class UeOrderIvcActualQueryResponse extends AbstractResponse {
   private ServerResult serverResult;

   @JsonProperty("serverResult")
   public void setServerResult(ServerResult serverResult) {
      this.serverResult = serverResult;
   }

   @JsonProperty("serverResult")
   public ServerResult getServerResult() {
      return this.serverResult;
   }
}
