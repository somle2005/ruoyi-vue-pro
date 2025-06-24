package com.jd.open.api.sdk.domain.order.WaybillJosService.response.update;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class JosResponse implements Serializable {
   private String msg;
   private Integer code;
   private Void data;

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
   public void setData(Void data) {
      this.data = data;
   }

   @JsonProperty("data")
   public Void getData() {
      return this.data;
   }
}
