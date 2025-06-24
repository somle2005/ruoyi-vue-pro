package com.jd.open.api.sdk.domain.ware.JosDraftWriteService.response.updateProduct;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class CommonResult implements Serializable {
   private String message;
   private String code;
   private Boolean success;
   private JosDraftBaseInfoBO obj;

   @JsonProperty("message")
   public void setMessage(String message) {
      this.message = message;
   }

   @JsonProperty("message")
   public String getMessage() {
      return this.message;
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
   public void setSuccess(Boolean success) {
      this.success = success;
   }

   @JsonProperty("success")
   public Boolean getSuccess() {
      return this.success;
   }

   @JsonProperty("obj")
   public void setObj(JosDraftBaseInfoBO obj) {
      this.obj = obj;
   }

   @JsonProperty("obj")
   public JosDraftBaseInfoBO getObj() {
      return this.obj;
   }
}
