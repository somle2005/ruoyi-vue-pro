package com.jd.open.api.sdk.domain.ware.ProductManagementService.response.getCnEnBrandList;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class JosStringDto implements Serializable {
   private List<String> result;
   private String returnMessage;
   private boolean isSuccess;

   @JsonProperty("result")
   public void setResult(List<String> result) {
      this.result = result;
   }

   @JsonProperty("result")
   public List<String> getResult() {
      return this.result;
   }

   @JsonProperty("returnMessage")
   public void setReturnMessage(String returnMessage) {
      this.returnMessage = returnMessage;
   }

   @JsonProperty("returnMessage")
   public String getReturnMessage() {
      return this.returnMessage;
   }

   @JsonProperty("isSuccess")
   public void setIsSuccess(boolean isSuccess) {
      this.isSuccess = isSuccess;
   }

   @JsonProperty("isSuccess")
   public boolean getIsSuccess() {
      return this.isSuccess;
   }
}
