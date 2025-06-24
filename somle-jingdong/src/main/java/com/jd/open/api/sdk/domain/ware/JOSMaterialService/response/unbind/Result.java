package com.jd.open.api.sdk.domain.ware.JOSMaterialService.response.unbind;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class Result implements Serializable {
   private Integer code;
   private String message;
   private JosUnbindResult data;

   @JsonProperty("code")
   public void setCode(Integer code) {
      this.code = code;
   }

   @JsonProperty("code")
   public Integer getCode() {
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
   public void setData(JosUnbindResult data) {
      this.data = data;
   }

   @JsonProperty("data")
   public JosUnbindResult getData() {
      return this.data;
   }
}
