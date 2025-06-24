package com.jd.open.api.sdk.domain.stock.StoreService.response.createStockInBill;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class StockInResult implements Serializable {
   private Boolean success;
   private String errorCode;
   private String errorMsg;
   private Long stockInBillId;
   private Date stockInTime;
   private List<SkuInfo> skuinfoList;

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

   @JsonProperty("stock_in_time")
   public void setStockInTime(Date stockInTime) {
      this.stockInTime = stockInTime;
   }

   @JsonProperty("stock_in_time")
   public Date getStockInTime() {
      return this.stockInTime;
   }

   @JsonProperty("skuinfo_list")
   public void setSkuinfoList(List<SkuInfo> skuinfoList) {
      this.skuinfoList = skuinfoList;
   }

   @JsonProperty("skuinfo_list")
   public List<SkuInfo> getSkuinfoList() {
      return this.skuinfoList;
   }
}
