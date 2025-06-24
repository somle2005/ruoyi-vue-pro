package com.jd.open.api.sdk.response.josaq;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.josaq.UserRelatedRpcService.response.getUserInfoByXId.Result;
import com.jd.open.api.sdk.response.AbstractResponse;

public class UserGetUserInfoByXIdResponse extends AbstractResponse {
   private Result getuserinfobyappidandopenidResult;

   @JsonProperty("getuserinfobyappidandopenid_result")
   public void setGetuserinfobyappidandopenidResult(Result getuserinfobyappidandopenidResult) {
      this.getuserinfobyappidandopenidResult = getuserinfobyappidandopenidResult;
   }

   @JsonProperty("getuserinfobyappidandopenid_result")
   public Result getGetuserinfobyappidandopenidResult() {
      return this.getuserinfobyappidandopenidResult;
   }
}
