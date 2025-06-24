package com.jd.open.api.sdk.domain.jinsuanpan.JosStatementQueryServiceProvider.response.queryRefundBill;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class RpcResponse implements Serializable {
   private boolean success;
   private PageModel value;
   private String message;
   private String resultCode;

   @JsonProperty("success")
   public void setSuccess(boolean success) {
      this.success = success;
   }

   @JsonProperty("success")
   public boolean getSuccess() {
      return this.success;
   }

   @JsonProperty("value")
   public void setValue(PageModel value) {
      this.value = value;
   }

   @JsonProperty("value")
   public PageModel getValue() {
      return this.value;
   }

   @JsonProperty("message")
   public void setMessage(String message) {
      this.message = message;
   }

   @JsonProperty("message")
   public String getMessage() {
      return this.message;
   }

   @JsonProperty("resultCode")
   public void setResultCode(String resultCode) {
      this.resultCode = resultCode;
   }

   @JsonProperty("resultCode")
   public String getResultCode() {
      return this.resultCode;
   }
}
