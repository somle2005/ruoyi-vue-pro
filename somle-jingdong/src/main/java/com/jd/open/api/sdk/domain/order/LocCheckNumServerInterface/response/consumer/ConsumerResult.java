package com.jd.open.api.sdk.domain.order.LocCheckNumServerInterface.response.consumer;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class ConsumerResult implements Serializable {
   private Integer resultCode;
   private String rsudoesultMessage;
   private Boolean isSuccess;

   @JsonProperty("result_code")
   public void setResultCode(Integer resultCode) {
      this.resultCode = resultCode;
   }

   @JsonProperty("result_code")
   public Integer getResultCode() {
      return this.resultCode;
   }

   @JsonProperty("rsudoesult_message")
   public void setRsudoesultMessage(String rsudoesultMessage) {
      this.rsudoesultMessage = rsudoesultMessage;
   }

   @JsonProperty("rsudoesult_message")
   public String getRsudoesultMessage() {
      return this.rsudoesultMessage;
   }

   @JsonProperty("is_success")
   public void setIsSuccess(Boolean isSuccess) {
      this.isSuccess = isSuccess;
   }

   @JsonProperty("is_success")
   public Boolean getIsSuccess() {
      return this.isSuccess;
   }
}
