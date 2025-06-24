package com.jd.open.api.sdk.domain.gongzhonghao.JzoneJosService.response.pushCoupon;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class ResultData implements Serializable {
   private String code;
   private String message;
   private String data;

   @JsonProperty("code")
   public void setCode(String code) {
      this.code = code;
   }

   @JsonProperty("code")
   public String getCode() {
      return this.code;
   }

   @JsonProperty("message")
   public void setMessage(String message) {
      this.message = message;
   }

   @JsonProperty("message")
   public String getMessage() {
      return this.message;
   }

   @JsonProperty("data")
   public void setData(String data) {
      this.data = data;
   }

   @JsonProperty("data")
   public String getData() {
      return this.data;
   }
}
