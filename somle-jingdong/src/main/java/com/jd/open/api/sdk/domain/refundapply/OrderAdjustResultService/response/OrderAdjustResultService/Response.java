package com.jd.open.api.sdk.domain.refundapply.OrderAdjustResultService.response.OrderAdjustResultService;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class Response implements Serializable {
   private String msg;
   private Integer code;
   private Boolean success;
   private String serverIp;
   private List<AdjustProgressDto> data;

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

   @JsonProperty("serverIp")
   public void setServerIp(String serverIp) {
      this.serverIp = serverIp;
   }

   @JsonProperty("serverIp")
   public String getServerIp() {
      return this.serverIp;
   }

   @JsonProperty("data")
   public void setData(List<AdjustProgressDto> data) {
      this.data = data;
   }

   @JsonProperty("data")
   public List<AdjustProgressDto> getData() {
      return this.data;
   }
}
