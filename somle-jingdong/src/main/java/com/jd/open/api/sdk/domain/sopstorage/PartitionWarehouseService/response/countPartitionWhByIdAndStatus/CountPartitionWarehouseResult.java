package com.jd.open.api.sdk.domain.sopstorage.PartitionWarehouseService.response.countPartitionWhByIdAndStatus;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class CountPartitionWarehouseResult implements Serializable {
   private boolean success;
   private String message;
   private int result;

   @JsonProperty("success")
   public void setSuccess(boolean success) {
      this.success = success;
   }

   @JsonProperty("success")
   public boolean getSuccess() {
      return this.success;
   }

   @JsonProperty("message")
   public void setMessage(String message) {
      this.message = message;
   }

   @JsonProperty("message")
   public String getMessage() {
      return this.message;
   }

   @JsonProperty("result")
   public void setResult(int result) {
      this.result = result;
   }

   @JsonProperty("result")
   public int getResult() {
      return this.result;
   }
}
