package com.jd.open.api.sdk.domain.josaq.UserRelatedRpcService.response.getUserInfoByXId;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class Result implements Serializable {
   private String msg;
   private Integer code;
   private OAuthUserInfo data;

   @JsonProperty("msg")
   public void setMsg(String msg) {
      this.msg = msg;
   }

   @JsonProperty("msg")
   public String getMsg() {
      return this.msg;
   }

   @JsonProperty("code")
   public void setCode(Integer code) {
      this.code = code;
   }

   @JsonProperty("code")
   public Integer getCode() {
      return this.code;
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
