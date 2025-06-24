package com.jd.open.api.sdk.domain.user.FollowVenderReadRpcService.response.queryForCountByVid;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class Result implements Serializable {
   private String code;
   private String msg;
   private Integer data;

   @JsonProperty("code")
   public void setCode(String code) {
      this.code = code;
   }

   @JsonProperty("code")
   public String getCode() {
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
   public void setData(Integer data) {
      this.data = data;
   }

   @JsonProperty("data")
   public Integer getData() {
      return this.data;
   }
}
