package com.jd.open.api.sdk.domain.B2B.OrderMiddleProvider.response.queryOrderList;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class RPCResult implements Serializable {
   private Boolean success;
   private String code;
   private String errorMsg;
   private String errorField;
   private String extMessage;
   private String errorId;
   private PaginationResp result;

   @JsonProperty("success")
   public void setSuccess(Boolean success) {
      this.success = success;
   }

   @JsonProperty("success")
   public Boolean getSuccess() {
      return this.success;
   }

   @JsonProperty("code")
   public void setCode(String code) {
      this.code = code;
   }

   @JsonProperty("code")
   public String getCode() {
      return this.code;
   }

   @JsonProperty("errorMsg")
   public void setErrorMsg(String errorMsg) {
      this.errorMsg = errorMsg;
   }

   @JsonProperty("errorMsg")
   public String getErrorMsg() {
      return this.errorMsg;
   }

   @JsonProperty("errorField")
   public void setErrorField(String errorField) {
      this.errorField = errorField;
   }

   @JsonProperty("errorField")
   public String getErrorField() {
      return this.errorField;
   }

   @JsonProperty("extMessage")
   public void setExtMessage(String extMessage) {
      this.extMessage = extMessage;
   }

   @JsonProperty("extMessage")
   public String getExtMessage() {
      return this.extMessage;
   }

   @JsonProperty("errorId")
   public void setErrorId(String errorId) {
      this.errorId = errorId;
   }

   @JsonProperty("errorId")
   public String getErrorId() {
      return this.errorId;
   }

   @JsonProperty("result")
   public void setResult(PaginationResp result) {
      this.result = result;
   }

   @JsonProperty("result")
   public PaginationResp getResult() {
      return this.result;
   }
}
