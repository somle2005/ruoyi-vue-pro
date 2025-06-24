package com.jd.open.api.sdk.domain.order.LocCheckNumServerInterface.response.get;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class CheckNumberResult implements Serializable {
   private Integer resultCode;
   private String resultMessage;
   private Boolean isSuccess;
   private List<ConsumerCode> checkNumbers;

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

   @JsonProperty("check_numbers")
   public void setCheckNumbers(List<ConsumerCode> checkNumbers) {
      this.checkNumbers = checkNumbers;
   }

   @JsonProperty("check_numbers")
   public List<ConsumerCode> getCheckNumbers() {
      return this.checkNumbers;
   }
}
