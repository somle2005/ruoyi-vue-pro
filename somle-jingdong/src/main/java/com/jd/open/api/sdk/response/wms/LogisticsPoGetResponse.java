package com.jd.open.api.sdk.response.wms;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.response.AbstractResponse;
import java.util.List;

public class LogisticsPoGetResponse extends AbstractResponse {
   private String inboundNo;
   private String poNo;
   private String receivingStatus;
   private List<ReceivingTask> taskDetails;

   @JsonProperty("inboundNo")
   public void setInboundNo(String inboundNo) {
      this.inboundNo = inboundNo;
   }

   @JsonProperty("inboundNo")
   public String getInboundNo() {
      return this.inboundNo;
   }

   @JsonProperty("poNo")
   public void setPoNo(String poNo) {
      this.poNo = poNo;
   }

   @JsonProperty("poNo")
   public String getPoNo() {
      return this.poNo;
   }

   @JsonProperty("receivingStatus")
   public void setReceivingStatus(String receivingStatus) {
      this.receivingStatus = receivingStatus;
   }

   @JsonProperty("receivingStatus")
   public String getReceivingStatus() {
      return this.receivingStatus;
   }

   @JsonProperty("task_details")
   public void setTaskDetails(List<ReceivingTask> taskDetails) {
      this.taskDetails = taskDetails;
   }

   @JsonProperty("task_details")
   public List<ReceivingTask> getTaskDetails() {
      return this.taskDetails;
   }
}
