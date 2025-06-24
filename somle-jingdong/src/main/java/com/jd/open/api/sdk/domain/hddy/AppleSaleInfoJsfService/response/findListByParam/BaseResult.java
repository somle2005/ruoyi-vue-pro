package com.jd.open.api.sdk.domain.hddy.AppleSaleInfoJsfService.response.findListByParam;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class BaseResult implements Serializable {
   private String code;
   private String message;
   private Page data;

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
   public void setData(Page data) {
      this.data = data;
   }

   @JsonProperty("data")
   public Page getData() {
      return this.data;
   }
}
