package com.jd.open.api.sdk.domain.ware.SaleAttributeService.response.getSaleAttUpAuth;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class DsmResult implements Serializable {
   private String msg;
   private String traceId;
   private Integer code;
   private Boolean data;

   @JsonProperty("msg")
   public void setMsg(String msg) {
      this.msg = msg;
   }

   @JsonProperty("msg")
   public String getMsg() {
      return this.msg;
   }

   @JsonProperty("traceId")
   public void setTraceId(String traceId) {
      this.traceId = traceId;
   }

   @JsonProperty("traceId")
   public String getTraceId() {
      return this.traceId;
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
   public void setData(Boolean data) {
      this.data = data;
   }

   @JsonProperty("data")
   public Boolean getData() {
      return this.data;
   }
}
