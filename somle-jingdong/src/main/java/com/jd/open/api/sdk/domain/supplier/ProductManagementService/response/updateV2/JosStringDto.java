package com.jd.open.api.sdk.domain.supplier.ProductManagementService.response.updateV2;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class JosStringDto implements Serializable {
   private String returnCode;
   private String applyId;
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

   @JsonProperty("apply_id")
   public void setApplyId(String applyId) {
      this.applyId = applyId;
   }

   @JsonProperty("apply_id")
   public String getApplyId() {
      return this.applyId;
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
