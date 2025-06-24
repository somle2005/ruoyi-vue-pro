package com.jd.open.api.sdk.domain.B2B.B2BOrderProvider.response.get;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class ResultBase implements Serializable {
   private boolean success;
   private String resultCode;
   private String resultMessage;
   private OrderTrack result;

   @JsonProperty("success")
   public void setSuccess(boolean success) {
      this.success = success;
   }

   @JsonProperty("success")
   public boolean getSuccess() {
      return this.success;
   }

   @JsonProperty("resultCode")
   public void setResultCode(String resultCode) {
      this.resultCode = resultCode;
   }

   @JsonProperty("resultCode")
   public String getResultCode() {
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
   public void setResult(OrderTrack result) {
      this.result = result;
   }

   @JsonProperty("result")
   public OrderTrack getResult() {
      return this.result;
   }
}
