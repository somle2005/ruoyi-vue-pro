package com.jd.open.api.sdk.domain.ECLP.TraceDynamicQueryService.response.queryB2CTrace;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class TraceQueryResponse implements Serializable {
   private String msg;
   private Integer code;
   private List<TraceInfo> data;

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
   public void setData(List<TraceInfo> data) {
      this.data = data;
   }

   @JsonProperty("data")
   public List<TraceInfo> getData() {
      return this.data;
   }
}
