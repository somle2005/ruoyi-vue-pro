package com.jd.open.api.sdk.domain.B2B.BWareReadService.response.get;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class SdkResult implements Serializable {
   private String resultCode;
   private String resultMessage;
   private String reqId;
   private boolean success;
   private List<BWareInfoDto> result;

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

   @JsonProperty("reqId")
   public void setReqId(String reqId) {
      this.reqId = reqId;
   }

   @JsonProperty("reqId")
   public String getReqId() {
      return this.reqId;
   }

   @JsonProperty("success")
   public void setSuccess(boolean success) {
      this.success = success;
   }

   @JsonProperty("success")
   public boolean getSuccess() {
      return this.success;
   }

   @JsonProperty("result")
   public void setResult(List<BWareInfoDto> result) {
      this.result = result;
   }

   @JsonProperty("result")
   public List<BWareInfoDto> getResult() {
      return this.result;
   }
}
