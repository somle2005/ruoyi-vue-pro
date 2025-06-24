package com.jd.open.api.sdk.domain.jiyunshang.ConsolidatorOutOperationJsfService.response.productweigh;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class ResultVO implements Serializable {
   private String code;
   private String msg;
   private Long time;
   private String version;
   private DataVO data;

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

   @JsonProperty("time")
   public void setTime(Long time) {
      this.time = time;
   }

   @JsonProperty("time")
   public Long getTime() {
      return this.time;
   }

   @JsonProperty("version")
   public void setVersion(String version) {
      this.version = version;
   }

   @JsonProperty("version")
   public String getVersion() {
      return this.version;
   }

   @JsonProperty("data")
   public void setData(DataVO data) {
      this.data = data;
   }

   @JsonProperty("data")
   public DataVO getData() {
      return this.data;
   }
}
