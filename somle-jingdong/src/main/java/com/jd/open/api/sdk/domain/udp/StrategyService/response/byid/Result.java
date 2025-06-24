package com.jd.open.api.sdk.domain.udp.StrategyService.response.byid;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class Result implements Serializable {
   private String msg;
   private int code;
   private String requestId;
   private List<Err> errors;
   private StrategyComputeResponseDTO data;

   @JsonProperty("msg")
   public void setMsg(String msg) {
      this.msg = msg;
   }

   @JsonProperty("msg")
   public String getMsg() {
      return this.msg;
   }

   @JsonProperty("code")
   public void setCode(int code) {
      this.code = code;
   }

   @JsonProperty("code")
   public int getCode() {
      return this.code;
   }

   @JsonProperty("requestId")
   public void setRequestId(String requestId) {
      this.requestId = requestId;
   }

   @JsonProperty("requestId")
   public String getRequestId() {
      return this.requestId;
   }

   @JsonProperty("errors")
   public void setErrors(List<Err> errors) {
      this.errors = errors;
   }

   @JsonProperty("errors")
   public List<Err> getErrors() {
      return this.errors;
   }

   @JsonProperty("data")
   public void setData(StrategyComputeResponseDTO data) {
      this.data = data;
   }

   @JsonProperty("data")
   public StrategyComputeResponseDTO getData() {
      return this.data;
   }
}
