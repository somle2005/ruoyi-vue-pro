package com.jd.open.api.sdk.domain.supplier.ProductManagementService.response.find;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class JosMyProductInfoDto implements Serializable {
   private List<MyProductInfoDto> result;
   private Integer count;
   private boolean isSuccess;
   private String returnCode;
   private String returnMessage;

   @JsonProperty("result")
   public void setResult(List<MyProductInfoDto> result) {
      this.result = result;
   }

   @JsonProperty("result")
   public List<MyProductInfoDto> getResult() {
      return this.result;
   }

   @JsonProperty("count")
   public void setCount(Integer count) {
      this.count = count;
   }

   @JsonProperty("count")
   public Integer getCount() {
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
