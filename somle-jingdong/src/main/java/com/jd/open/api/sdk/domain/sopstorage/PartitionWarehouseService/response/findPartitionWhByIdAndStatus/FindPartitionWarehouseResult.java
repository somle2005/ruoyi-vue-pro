package com.jd.open.api.sdk.domain.sopstorage.PartitionWarehouseService.response.findPartitionWhByIdAndStatus;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class FindPartitionWarehouseResult implements Serializable {
   private boolean success;
   private String message;
   private List<PartitionWarehouse> result;

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
   public void setResult(List<PartitionWarehouse> result) {
      this.result = result;
   }

   @JsonProperty("result")
   public List<PartitionWarehouse> getResult() {
      return this.result;
   }
}
