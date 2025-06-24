package com.jd.open.api.sdk.domain.supplier.JosBrandPerformanceInfoService.response.searchBrandPerformanceInfo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class Message implements Serializable {
   private Boolean success;
   private String code;
   private String msg;
   private Page result;

   @JsonProperty("success")
   public void setSuccess(Boolean success) {
      this.success = success;
   }

   @JsonProperty("success")
   public Boolean getSuccess() {
      return this.success;
   }

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

   @JsonProperty("result")
   public void setResult(Page result) {
      this.result = result;
   }

   @JsonProperty("result")
   public Page getResult() {
      return this.result;
   }
}
