package com.jd.open.api.sdk.domain.etms.OrderTraceByWaybillService.response.getOrderTraceByWaybillIdAndVenderCode;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Map;

public class TraceDetail implements Serializable {
   private Map<String, Integer> extension;
   private String waybillId;
   private String content;
   private String operationTime;
   private String operater;

   @JsonProperty("extension")
   public void setExtension(Map<String, Integer> extension) {
      this.extension = extension;
   }

   @JsonProperty("extension")
   public Map<String, Integer> getExtension() {
      return this.extension;
   }

   @JsonProperty("waybillId")
   public void setWaybillId(String waybillId) {
      this.waybillId = waybillId;
   }

   @JsonProperty("waybillId")
   public String getWaybillId() {
      return this.waybillId;
   }

   @JsonProperty("content")
   public void setContent(String content) {
      this.content = content;
   }

   @JsonProperty("content")
   public String getContent() {
      return this.content;
   }

   @JsonProperty("operationTime")
   public void setOperationTime(String operationTime) {
      this.operationTime = operationTime;
   }

   @JsonProperty("operationTime")
   public String getOperationTime() {
      return this.operationTime;
   }

   @JsonProperty("operater")
   public void setOperater(String operater) {
      this.operater = operater;
   }

   @JsonProperty("operater")
   public String getOperater() {
      return this.operater;
   }
}
