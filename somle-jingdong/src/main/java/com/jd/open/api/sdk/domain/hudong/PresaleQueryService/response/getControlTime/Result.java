package com.jd.open.api.sdk.domain.hudong.PresaleQueryService.response.getControlTime;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class Result implements Serializable {
   private String msg;
   private Integer code;
   private Boolean success;
   private PresaleTimeResult presaleTimeResult;

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

   @JsonProperty("success")
   public void setSuccess(Boolean success) {
      this.success = success;
   }

   @JsonProperty("success")
   public Boolean getSuccess() {
      return this.success;
   }

   @JsonProperty("presaleTimeResult")
   public void setPresaleTimeResult(PresaleTimeResult presaleTimeResult) {
      this.presaleTimeResult = presaleTimeResult;
   }

   @JsonProperty("presaleTimeResult")
   public PresaleTimeResult getPresaleTimeResult() {
      return this.presaleTimeResult;
   }
}
