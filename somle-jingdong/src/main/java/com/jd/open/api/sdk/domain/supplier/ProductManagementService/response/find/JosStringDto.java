package com.jd.open.api.sdk.domain.supplier.ProductManagementService.response.find;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class JosStringDto implements Serializable {
   private long count;
   private List<String> result;
   private boolean success;
   private String returnCode;
   private String returnMessage;

   @JsonProperty("count")
   public void setCount(long count) {
      this.count = count;
   }

   @JsonProperty("count")
   public long getCount() {
      return this.count;
   }

   @JsonProperty("result")
   public void setResult(List<String> result) {
      this.result = result;
   }

   @JsonProperty("result")
   public List<String> getResult() {
      return this.result;
   }

   @JsonProperty("success")
   public void setSuccess(boolean success) {
      this.success = success;
   }

   @JsonProperty("success")
   public boolean getSuccess() {
      return this.success;
   }

   @JsonProperty("return_code")
   public void setReturnCode(String returnCode) {
      this.returnCode = returnCode;
   }

   @JsonProperty("return_code")
   public String getReturnCode() {
      return this.returnCode;
   }

   @JsonProperty("return_message")
   public void setReturnMessage(String returnMessage) {
      this.returnMessage = returnMessage;
   }

   @JsonProperty("return_message")
   public String getReturnMessage() {
      return this.returnMessage;
   }
}
