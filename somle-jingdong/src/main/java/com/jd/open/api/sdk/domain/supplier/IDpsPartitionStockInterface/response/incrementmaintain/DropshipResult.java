package com.jd.open.api.sdk.domain.supplier.IDpsPartitionStockInterface.response.incrementmaintain;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class DropshipResult implements Serializable {
   private boolean success;
   private String resultCode;
   private String resultMessage;

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
}
