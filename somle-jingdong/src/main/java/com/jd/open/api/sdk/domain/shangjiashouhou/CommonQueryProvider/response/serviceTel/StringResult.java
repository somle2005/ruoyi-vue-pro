package com.jd.open.api.sdk.domain.shangjiashouhou.CommonQueryProvider.response.serviceTel;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class StringResult implements Serializable {
   private boolean success;
   private String code;
   private String msg;
   private String data;
   private String desenData;

   @JsonProperty("success")
   public void setSuccess(boolean success) {
      this.success = success;
   }

   @JsonProperty("success")
   public boolean getSuccess() {
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

   @JsonProperty("data")
   public void setData(String data) {
      this.data = data;
   }

   @JsonProperty("data")
   public String getData() {
      return this.data;
   }

   @JsonProperty("desen_data")
   public void setDesenData(String desenData) {
      this.desenData = desenData;
   }

   @JsonProperty("desen_data")
   public String getDesenData() {
      return this.desenData;
   }
}
