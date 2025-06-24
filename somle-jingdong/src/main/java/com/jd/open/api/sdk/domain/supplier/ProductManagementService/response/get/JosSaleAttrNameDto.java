package com.jd.open.api.sdk.domain.supplier.ProductManagementService.response.get;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class JosSaleAttrNameDto implements Serializable {
   private List<SaleAttributeDto> result;
   private String returnCode;
   private long count;
   private String returnMessage;
   private boolean success;

   @JsonProperty("result")
   public void setResult(List<SaleAttributeDto> result) {
      this.result = result;
   }

   @JsonProperty("result")
   public List<SaleAttributeDto> getResult() {
      return this.result;
   }

   @JsonProperty("return_code")
   public void setReturnCode(String returnCode) {
      this.returnCode = returnCode;
   }

   @JsonProperty("return_code")
   public String getReturnCode() {
      return this.returnCode;
   }

   @JsonProperty("count")
   public void setCount(long count) {
      this.count = count;
   }

   @JsonProperty("count")
   public long getCount() {
      return this.count;
   }

   @JsonProperty("returnMessage")
   public void setReturnMessage(String returnMessage) {
      this.returnMessage = returnMessage;
   }

   @JsonProperty("returnMessage")
   public String getReturnMessage() {
      return this.returnMessage;
   }

   @JsonProperty("success")
   public void setSuccess(boolean success) {
      this.success = success;
   }

   @JsonProperty("success")
   public boolean getSuccess() {
      return this.success;
   }
}
