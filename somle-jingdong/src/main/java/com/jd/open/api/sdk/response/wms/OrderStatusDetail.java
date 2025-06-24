package com.jd.open.api.sdk.response.wms;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class OrderStatusDetail implements Serializable {
   private int status;
   private String statusName;
   private String completeTime;

   @JsonProperty("status")
   public void setStatus(int status) {
      this.status = status;
   }

   @JsonProperty("status")
   public int getStatus() {
      return this.status;
   }

   @JsonProperty("status_name")
   public void setStatusName(String statusName) {
      this.statusName = statusName;
   }

   @JsonProperty("status_name")
   public String getStatusName() {
      return this.statusName;
   }

   @JsonProperty("complete_time")
   public void setCompleteTime(String completeTime) {
      this.completeTime = completeTime;
   }

   @JsonProperty("complete_time")
   public String getCompleteTime() {
      return this.completeTime;
   }
}
