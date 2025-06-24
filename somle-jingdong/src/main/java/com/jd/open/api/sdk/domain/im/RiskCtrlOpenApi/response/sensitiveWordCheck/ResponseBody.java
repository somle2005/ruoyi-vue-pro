package com.jd.open.api.sdk.domain.im.RiskCtrlOpenApi.response.sensitiveWordCheck;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class ResponseBody implements Serializable {
   private String resultCode;
   private String resultMsg;
   private boolean containSensitiveWord;

   @JsonProperty("resultCode")
   public void setResultCode(String resultCode) {
      this.resultCode = resultCode;
   }

   @JsonProperty("resultCode")
   public String getResultCode() {
      return this.resultCode;
   }

   @JsonProperty("resultMsg")
   public void setResultMsg(String resultMsg) {
      this.resultMsg = resultMsg;
   }

   @JsonProperty("resultMsg")
   public String getResultMsg() {
      return this.resultMsg;
   }

   @JsonProperty("containSensitiveWord")
   public void setContainSensitiveWord(boolean containSensitiveWord) {
      this.containSensitiveWord = containSensitiveWord;
   }

   @JsonProperty("containSensitiveWord")
   public boolean getContainSensitiveWord() {
      return this.containSensitiveWord;
   }
}
