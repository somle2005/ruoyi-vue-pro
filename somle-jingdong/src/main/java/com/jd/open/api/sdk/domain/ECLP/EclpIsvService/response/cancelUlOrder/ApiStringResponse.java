package com.jd.open.api.sdk.domain.ECLP.EclpIsvService.response.cancelUlOrder;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class ApiStringResponse implements Serializable {
   private String code;
   private String msg;

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
}
