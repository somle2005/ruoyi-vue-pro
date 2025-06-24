package com.jd.open.api.sdk.domain.jiyunshang.ConsolidatorOutOperationJsfService.response.productweigh;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class DataVO implements Serializable {
   private int isSuccess;
   private String message;

   @JsonProperty("isSuccess")
   public void setIsSuccess(int isSuccess) {
      this.isSuccess = isSuccess;
   }

   @JsonProperty("isSuccess")
   public int getIsSuccess() {
      return this.isSuccess;
   }

   @JsonProperty("message")
   public void setMessage(String message) {
      this.message = message;
   }

   @JsonProperty("message")
   public String getMessage() {
      return this.message;
   }
}
