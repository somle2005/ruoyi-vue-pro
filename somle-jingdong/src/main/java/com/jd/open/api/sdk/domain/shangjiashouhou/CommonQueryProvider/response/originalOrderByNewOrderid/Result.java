package com.jd.open.api.sdk.domain.shangjiashouhou.CommonQueryProvider.response.originalOrderByNewOrderid;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class Result implements Serializable {
   private String msg;
   private String code;
   private boolean success;
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
   public void setCode(String code) {
      this.code = code;
   }

   @JsonProperty("code")
   public String getCode() {
      return this.code;
   }

   @JsonProperty("success")
   public void setSuccess(boolean success) {
      this.success = success;
   }

   @JsonProperty("success")
   public boolean getSuccess() {
      return this.success;
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
