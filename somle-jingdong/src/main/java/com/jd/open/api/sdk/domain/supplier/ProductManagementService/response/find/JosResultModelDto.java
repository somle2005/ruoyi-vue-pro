package com.jd.open.api.sdk.domain.supplier.ProductManagementService.response.find;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class JosResultModelDto implements Serializable {
   private JosModelDto singleObj;
   private long count;
   private boolean success;
   private String returnCode;
   private String returnMessage;

   @JsonProperty("single_obj")
   public void setSingleObj(JosModelDto singleObj) {
      this.singleObj = singleObj;
   }

   @JsonProperty("single_obj")
   public JosModelDto getSingleObj() {
      return this.singleObj;
   }

   @JsonProperty("count")
   public void setCount(long count) {
      this.count = count;
   }

   @JsonProperty("count")
   public long getCount() {
      return this.count;
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
