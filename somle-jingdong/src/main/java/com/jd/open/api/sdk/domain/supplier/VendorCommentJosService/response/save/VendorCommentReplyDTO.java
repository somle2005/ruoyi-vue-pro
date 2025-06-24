package com.jd.open.api.sdk.domain.supplier.VendorCommentJosService.response.save;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class VendorCommentReplyDTO implements Serializable {
   private boolean success;
   private String result;
   private String resultCode;

   @JsonProperty("success")
   public void setSuccess(boolean success) {
      this.success = success;
   }

   @JsonProperty("success")
   public boolean getSuccess() {
      return this.success;
   }

   @JsonProperty("result")
   public void setResult(String result) {
      this.result = result;
   }

   @JsonProperty("result")
   public String getResult() {
      return this.result;
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
