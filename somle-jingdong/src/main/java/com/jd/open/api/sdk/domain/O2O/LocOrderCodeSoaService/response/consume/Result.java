package com.jd.open.api.sdk.domain.O2O.LocOrderCodeSoaService.response.consume;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class Result implements Serializable {
   private boolean success;
   private int resultCode;
   private String resultMessage;
   private Boolean result;

   @JsonProperty("success")
   public void setSuccess(boolean success) {
      this.success = success;
   }

   @JsonProperty("success")
   public boolean getSuccess() {
      return this.success;
   }

   @JsonProperty("resultCode")
   public void setResultCode(int resultCode) {
      this.resultCode = resultCode;
   }

   @JsonProperty("resultCode")
   public int getResultCode() {
      return this.resultCode;
   }

   @JsonProperty("resultMessage")
   public void setResultMessage(String resultMessage) {
      this.resultMessage = resultMessage;
   }

   @JsonProperty("resultMessage")
   public String getResultMessage() {
      return this.resultMessage;
   }

   @JsonProperty("result")
   public void setResult(Boolean result) {
      this.result = result;
   }

   @JsonProperty("result")
   public Boolean getResult() {
      return this.result;
   }
}
