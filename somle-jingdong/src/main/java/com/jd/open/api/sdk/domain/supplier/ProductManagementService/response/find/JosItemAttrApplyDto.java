package com.jd.open.api.sdk.domain.supplier.ProductManagementService.response.find;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class JosItemAttrApplyDto implements Serializable {
   private List<ItemAttrApplyDto> result;
   private long totle;
   private boolean success;
   private String returnCode;
   private String returnMessage;

   @JsonProperty("result")
   public void setResult(List<ItemAttrApplyDto> result) {
      this.result = result;
   }

   @JsonProperty("result")
   public List<ItemAttrApplyDto> getResult() {
      return this.result;
   }

   @JsonProperty("totle")
   public void setTotle(long totle) {
      this.totle = totle;
   }

   @JsonProperty("totle")
   public long getTotle() {
      return this.totle;
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
