package com.jd.open.api.sdk.domain.customsglobalAPI.EclpDlzClearanceCallbackJsfService.response.customClearance;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class EclpDlzCustomClearanceResponse implements Serializable {
   private int resultCode;
   private String resultMessage;

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
}
