package com.jd.open.api.sdk.domain.customsglobalAPI.BatchDataDecrypt.response.batchDecrypt;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class CommonResult implements Serializable {
   private int resultCode;
   private String resultMessage;
   private List<String> resultData;

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

   @JsonProperty("resultData")
   public void setResultData(List<String> resultData) {
      this.resultData = resultData;
   }

   @JsonProperty("resultData")
   public List<String> getResultData() {
      return this.resultData;
   }
}
