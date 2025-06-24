package com.jd.open.api.sdk.domain.aqyzzx.SafeAuthenticationService.response.eliminateRisk;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class SafeCResult implements Serializable {
   private boolean result;
   private int resultCode;
   private String rKey;
   private String resultMessage;

   @JsonProperty("result")
   public void setResult(boolean result) {
      this.result = result;
   }

   @JsonProperty("result")
   public boolean getResult() {
      return this.result;
   }

   @JsonProperty("resultCode")
   public void setResultCode(int resultCode) {
      this.resultCode = resultCode;
   }

   @JsonProperty("resultCode")
   public int getResultCode() {
      return this.resultCode;
   }

   @JsonProperty("rKey")
   public void setRKey(String rKey) {
      this.rKey = rKey;
   }

   @JsonProperty("rKey")
   public String getRKey() {
      return this.rKey;
   }

   @JsonProperty("resultMessage")
   public void setResultMessage(String resultMessage) {
      this.resultMessage = resultMessage;
   }

   @JsonProperty("resultMessage")
   public String getResultMessage() {
      return this.resultMessage;
   }
}
