package com.jd.open.api.sdk.domain.stock.StoreService.response.queryStockOutBill;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class QueryStockOutResult implements Serializable {
   private Boolean success;
   private String errorCode;
   private String errorMsg;
   private Long venderId;
   private List<StockBillInfo> stockbillinfoList;

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

   @JsonProperty("vender_id")
   public void setVenderId(Long venderId) {
      this.venderId = venderId;
   }

   @JsonProperty("vender_id")
   public Long getVenderId() {
      return this.venderId;
   }

   @JsonProperty("stockbillinfo_list")
   public void setStockbillinfoList(List<StockBillInfo> stockbillinfoList) {
      this.stockbillinfoList = stockbillinfoList;
   }

   @JsonProperty("stockbillinfo_list")
   public List<StockBillInfo> getStockbillinfoList() {
      return this.stockbillinfoList;
   }
}
