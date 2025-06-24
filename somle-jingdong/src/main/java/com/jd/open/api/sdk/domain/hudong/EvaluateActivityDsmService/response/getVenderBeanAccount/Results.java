package com.jd.open.api.sdk.domain.hudong.EvaluateActivityDsmService.response.getVenderBeanAccount;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class Results implements Serializable {
   private String msg;
   private Long code;
   private Long data;

   @JsonProperty("msg")
   public void setMsg(String msg) {
      this.msg = msg;
   }

   @JsonProperty("msg")
   public String getMsg() {
      return this.msg;
   }

   @JsonProperty("code")
   public void setCode(Long code) {
      this.code = code;
   }

   @JsonProperty("code")
   public Long getCode() {
      return this.code;
   }

   @JsonProperty("data")
   public void setData(Long data) {
      this.data = data;
   }

   @JsonProperty("data")
   public Long getData() {
      return this.data;
   }
}
