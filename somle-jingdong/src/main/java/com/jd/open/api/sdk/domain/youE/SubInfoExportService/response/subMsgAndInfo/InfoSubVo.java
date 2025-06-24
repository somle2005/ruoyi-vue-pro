package com.jd.open.api.sdk.domain.youE.SubInfoExportService.response.subMsgAndInfo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class InfoSubVo implements Serializable {
   private boolean result;
   private Integer code;
   private String message;

   @JsonProperty("result")
   public void setResult(boolean result) {
      this.result = result;
   }

   @JsonProperty("result")
   public boolean getResult() {
      return this.result;
   }

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
}
