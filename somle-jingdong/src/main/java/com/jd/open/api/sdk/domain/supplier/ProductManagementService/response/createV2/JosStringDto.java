package com.jd.open.api.sdk.domain.supplier.ProductManagementService.response.createV2;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class JosStringDto implements Serializable {
   private String returnCode;
   private String singleObj;
   private String returnMessage;
   private boolean isSuccess;

   @JsonProperty("return_code")
   public void setReturnCode(String returnCode) {
      this.returnCode = returnCode;
   }

   @JsonProperty("return_code")
   public String getReturnCode() {
      return this.returnCode;
   }

   @JsonProperty("single_obj")
   public void setSingleObj(String singleObj) {
      this.singleObj = singleObj;
   }

   @JsonProperty("single_obj")
   public String getSingleObj() {
      return this.singleObj;
   }

   @JsonProperty("return_message")
   public void setReturnMessage(String returnMessage) {
      this.returnMessage = returnMessage;
   }

   @JsonProperty("return_message")
   public String getReturnMessage() {
      return this.returnMessage;
   }

   @JsonProperty("is_success")
   public void setIsSuccess(boolean isSuccess) {
      this.isSuccess = isSuccess;
   }

   @JsonProperty("is_success")
   public boolean getIsSuccess() {
      return this.isSuccess;
   }
}
