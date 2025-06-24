package com.jd.open.api.sdk.domain.youE.UserInfoService.response.getUserPhone;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class Result implements Serializable {
   private String msg;
   private Integer code;
   private PhoneBindVO data;

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
   public void setData(PhoneBindVO data) {
      this.data = data;
   }

   @JsonProperty("data")
   public PhoneBindVO getData() {
      return this.data;
   }
}
