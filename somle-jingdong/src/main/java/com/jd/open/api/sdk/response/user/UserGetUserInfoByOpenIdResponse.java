package com.jd.open.api.sdk.response.user;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.user.UserRelatedRpcService.response.getUserInfoByOpenId.Result;
import com.jd.open.api.sdk.response.AbstractResponse;

public class UserGetUserInfoByOpenIdResponse extends AbstractResponse {
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
