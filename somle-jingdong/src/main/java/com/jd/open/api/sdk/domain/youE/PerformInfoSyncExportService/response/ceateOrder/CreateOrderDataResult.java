package com.jd.open.api.sdk.domain.youE.PerformInfoSyncExportService.response.ceateOrder;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class CreateOrderDataResult implements Serializable {
   private String saleOrderNo;
   private String orderNo;
   private Integer resultCode;
   private String errMsg;
   private Integer orderStat;
   private String businessLabel;

   @JsonProperty("saleOrderNo")
   public void setSaleOrderNo(String saleOrderNo) {
      this.saleOrderNo = saleOrderNo;
   }

   @JsonProperty("saleOrderNo")
   public String getSaleOrderNo() {
      return this.saleOrderNo;
   }

   @JsonProperty("orderNo")
   public void setOrderNo(String orderNo) {
      this.orderNo = orderNo;
   }

   @JsonProperty("orderNo")
   public String getOrderNo() {
      return this.orderNo;
   }

   @JsonProperty("resultCode")
   public void setResultCode(Integer resultCode) {
      this.resultCode = resultCode;
   }

   @JsonProperty("resultCode")
   public Integer getResultCode() {
      return this.resultCode;
   }

   @JsonProperty("errMsg")
   public void setErrMsg(String errMsg) {
      this.errMsg = errMsg;
   }

   @JsonProperty("errMsg")
   public String getErrMsg() {
      return this.errMsg;
   }

   @JsonProperty("orderStat")
   public void setOrderStat(Integer orderStat) {
      this.orderStat = orderStat;
   }

   @JsonProperty("orderStat")
   public Integer getOrderStat() {
      return this.orderStat;
   }

   @JsonProperty("businessLabel")
   public void setBusinessLabel(String businessLabel) {
      this.businessLabel = businessLabel;
   }

   @JsonProperty("businessLabel")
   public String getBusinessLabel() {
      return this.businessLabel;
   }
}
