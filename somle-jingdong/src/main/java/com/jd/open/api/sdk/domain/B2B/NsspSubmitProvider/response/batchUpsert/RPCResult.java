package com.jd.open.api.sdk.domain.B2B.NsspSubmitProvider.response.batchUpsert;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class RPCResult implements Serializable {
   private Long result;
   private String errorField;
   private String code;
   private boolean success;
   private String errorMsg;
   private String reqId;

   @JsonProperty("result")
   public void setResult(Long result) {
      this.result = result;
   }

   @JsonProperty("result")
   public Long getResult() {
      return this.result;
   }

   @JsonProperty("errorField")
   public void setErrorField(String errorField) {
      this.errorField = errorField;
   }

   @JsonProperty("errorField")
   public String getErrorField() {
      return this.errorField;
   }

   @JsonProperty("code")
   public void setCode(String code) {
      this.code = code;
   }

   @JsonProperty("code")
   public String getCode() {
      return this.code;
   }

   @JsonProperty("success")
   public void setSuccess(boolean success) {
      this.success = success;
   }

   @JsonProperty("success")
   public boolean getSuccess() {
      return this.success;
   }

   @JsonProperty("errorMsg")
   public void setErrorMsg(String errorMsg) {
      this.errorMsg = errorMsg;
   }

   @JsonProperty("errorMsg")
   public String getErrorMsg() {
      return this.errorMsg;
   }

   @JsonProperty("reqId")
   public void setReqId(String reqId) {
      this.reqId = reqId;
   }

   @JsonProperty("reqId")
   public String getReqId() {
      return this.reqId;
   }
}
