package com.jd.open.api.sdk.response.wms;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class ResponseStock implements Serializable {
   private String processCode;
   private String processStatus;
   private String errorMessage;
   private int totalPage;
   private List<StockDetail> stockDetails;

   @JsonProperty("process_code")
   public void setProcessCode(String processCode) {
      this.processCode = processCode;
   }

   @JsonProperty("process_code")
   public String getProcessCode() {
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

   @JsonProperty("total_page")
   public void setTotalPage(int totalPage) {
      this.totalPage = totalPage;
   }

   @JsonProperty("total_page")
   public int getTotalPage() {
      return this.totalPage;
   }

   @JsonProperty("stock_details")
   public void setStockDetails(List<StockDetail> stockDetails) {
      this.stockDetails = stockDetails;
   }

   @JsonProperty("stock_details")
   public List<StockDetail> getStockDetails() {
      return this.stockDetails;
   }
}
