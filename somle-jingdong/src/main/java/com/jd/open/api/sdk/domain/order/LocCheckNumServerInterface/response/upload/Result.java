package com.jd.open.api.sdk.domain.order.LocCheckNumServerInterface.response.upload;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class Result implements Serializable {
   private Integer resultCode;
   private String resultMessage;
   private Boolean isSuccess;

   @JsonProperty("result_code")
   public void setResultCode(Integer resultCode) {
      this.resultCode = resultCode;
   }

   @JsonProperty("result_code")
   public Integer getResultCode() {
      return this.resultCode;
   }

   @JsonProperty("result_message")
   public void setResultMessage(String resultMessage) {
      this.resultMessage = resultMessage;
   }

   @JsonProperty("result_message")
   public String getResultMessage() {
      return this.resultMessage;
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
