package com.jd.open.api.sdk.domain.unboundedShop.JzoneMedicineJsfService.response.sendWxTemplateMessageByPin;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class ResultData implements Serializable {
   private String code;
   private String message;
   private List<String> attribute2;

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

   @JsonProperty("attribute2")
   public void setAttribute2(List<String> attribute2) {
      this.attribute2 = attribute2;
   }

   @JsonProperty("attribute2")
   public List<String> getAttribute2() {
      return this.attribute2;
   }
}
