package com.jd.open.api.sdk.domain.stock.StoreService.response.deleteStockInBill;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;

public class StockInDeleteResult implements Serializable {
   private Boolean success;
   private String errorCode;
   private String errorMsg;
   private Long stockInBillId;
   private Date stockInDeleteTime;

   @JsonProperty("success")
   public void setSuccess(Boolean success) {
      this.success = success;
   }

   @JsonProperty("success")
   public Boolean getSuccess() {
      return this.success;
   }

   @JsonProperty("error_code")
   public void setErrorCode(String errorCode) {
      this.errorCode = errorCode;
   }

   @JsonProperty("error_code")
   public String getErrorCode() {
      return this.errorCode;
   }

   @JsonProperty("error_msg")
   public void setErrorMsg(String errorMsg) {
      this.errorMsg = errorMsg;
   }

   @JsonProperty("error_msg")
   public String getErrorMsg() {
      return this.errorMsg;
   }

   @JsonProperty("stock_in_bill_id")
   public void setStockInBillId(Long stockInBillId) {
      this.stockInBillId = stockInBillId;
   }

   @JsonProperty("stock_in_bill_id")
   public Long getStockInBillId() {
      return this.stockInBillId;
   }

   @JsonProperty("stock_in_delete_time")
   public void setStockInDeleteTime(Date stockInDeleteTime) {
      this.stockInDeleteTime = stockInDeleteTime;
   }

   @JsonProperty("stock_in_delete_time")
   public Date getStockInDeleteTime() {
      return this.stockInDeleteTime;
   }
}
