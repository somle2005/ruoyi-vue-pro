package com.jd.open.api.sdk.domain.user.UserRelatedRpcService.response.getUserInfoByOpenId;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class Result implements Serializable {
   private Integer code;
   private String msg;
   private OAuthUserInfo data;

   @JsonProperty("code")
   public void setCode(Integer code) {
      this.code = code;
   }

   @JsonProperty("code")
   public Integer getCode() {
      return this.code;
   }

   @JsonProperty("msg")
   public void setMsg(String msg) {
      this.msg = msg;
   }

   @JsonProperty("msg")
   public String getMsg() {
      return this.msg;
   }

   @JsonProperty("data")
   public void setData(OAuthUserInfo data) {
      this.data = data;
   }

   @JsonProperty("data")
   public OAuthUserInfo getData() {
      return this.data;
   }
}
