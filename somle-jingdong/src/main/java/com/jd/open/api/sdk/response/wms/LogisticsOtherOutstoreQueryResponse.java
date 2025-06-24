package com.jd.open.api.sdk.response.wms;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.response.AbstractResponse;
import java.util.Date;
import java.util.List;

public class LogisticsOtherOutstoreQueryResponse extends AbstractResponse {
   private int processCode;
   private String processStatus;
   private String errorMessage;
   private String joslOutboundNo;
   private String isvOutboundNo;
   private String joslStatus;
   private Date completeTime;
   private List<ResponseOrderOtherDetail> orderDetails;
   private String carriersId;
   private String carriersName;
   private List<String> deliveryNoList;

   @JsonProperty("process_code")
   public void setProcessCode(int processCode) {
      this.processCode = processCode;
   }

   @JsonProperty("process_code")
   public int getProcessCode() {
      return this.processCode;
   }

   @JsonProperty("process_status")
   public void setProcessStatus(String processStatus) {
      this.processStatus = processStatus;
   }

   @JsonProperty("process_status")
   public String getProcessStatus() {
      return this.processStatus;
   }

   @JsonProperty("error_message")
   public void setErrorMessage(String errorMessage) {
      this.errorMessage = errorMessage;
   }

   @JsonProperty("error_message")
   public String getErrorMessage() {
      return this.errorMessage;
   }

   @JsonProperty("josl_outbound_no")
   public void setJoslOutboundNo(String joslOutboundNo) {
      this.joslOutboundNo = joslOutboundNo;
   }

   @JsonProperty("josl_outbound_no")
   public String getJoslOutboundNo() {
      return this.joslOutboundNo;
   }

   @JsonProperty("isv_outbound_no")
   public void setIsvOutboundNo(String isvOutboundNo) {
      this.isvOutboundNo = isvOutboundNo;
   }

   @JsonProperty("isv_outbound_no")
   public String getIsvOutboundNo() {
      return this.isvOutboundNo;
   }

   @JsonProperty("josl_status")
   public void setJoslStatus(String joslStatus) {
      this.joslStatus = joslStatus;
   }

   @JsonProperty("josl_status")
   public String getJoslStatus() {
      return this.joslStatus;
   }

   @JsonProperty("complete_time")
   public void setCompleteTime(Date completeTime) {
      this.completeTime = completeTime;
   }

   @JsonProperty("complete_time")
   public Date getCompleteTime() {
      return this.completeTime;
   }

   @JsonProperty("order_details")
   public void setOrderDetails(List<ResponseOrderOtherDetail> orderDetails) {
      this.orderDetails = orderDetails;
   }

   @JsonProperty("order_details")
   public List<ResponseOrderOtherDetail> getOrderDetails() {
      return this.orderDetails;
   }

   @JsonProperty("carriers_id")
   public void setCarriersId(String carriersId) {
      this.carriersId = carriersId;
   }

   @JsonProperty("carriers_id")
   public String getCarriersId() {
      return this.carriersId;
   }

   @JsonProperty("carriers_name")
   public void setCarriersName(String carriersName) {
      this.carriersName = carriersName;
   }

   @JsonProperty("carriers_name")
   public String getCarriersName() {
      return this.carriersName;
   }

   @JsonProperty("delivery_no_list")
   public void setDeliveryNoList(List<String> deliveryNoList) {
      this.deliveryNoList = deliveryNoList;
   }

   @JsonProperty("delivery_no_list")
   public List<String> getDeliveryNoList() {
      return this.deliveryNoList;
   }
}
