package com.jd.open.api.sdk.domain.supplier.ProductManagementService.response.get;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class JosProductApplyDto implements Serializable {
   private ProductApplyDto singleObj;
   private long count;
   private boolean isSuccess;
   private String returnCode;
   private String returnMessage;

   @JsonProperty("single_obj")
   public void setSingleObj(ProductApplyDto singleObj) {
      this.singleObj = singleObj;
   }

   @JsonProperty("single_obj")
   public ProductApplyDto getSingleObj() {
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

   @JsonProperty("is_success")
   public void setIsSuccess(boolean isSuccess) {
      this.isSuccess = isSuccess;
   }

   @JsonProperty("is_success")
   public boolean getIsSuccess() {
      return this.isSuccess;
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
