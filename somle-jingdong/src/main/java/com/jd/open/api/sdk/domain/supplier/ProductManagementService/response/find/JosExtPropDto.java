package com.jd.open.api.sdk.domain.supplier.ProductManagementService.response.find;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class JosExtPropDto implements Serializable {
   private List<ExtPropDtow> result;
   private long count;
   private boolean isSuccess;
   private String returnCode;
   private String returnMessage;

   @JsonProperty("result")
   public void setResult(List<ExtPropDtow> result) {
      this.result = result;
   }

   @JsonProperty("result")
   public List<ExtPropDtow> getResult() {
      return this.result;
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
