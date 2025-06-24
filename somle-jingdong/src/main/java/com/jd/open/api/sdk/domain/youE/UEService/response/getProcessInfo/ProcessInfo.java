package com.jd.open.api.sdk.domain.youE.UEService.response.getProcessInfo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class ProcessInfo implements Serializable {
   private String date;
   private String orderNo;
   private String saleOrderNo;
   private String shOrderNo;
   private String type;
   private String resultType;
   private String resultDesc;

   @JsonProperty("date")
   public void setDate(String date) {
      this.date = date;
   }

   @JsonProperty("date")
   public String getDate() {
      return this.date;
   }

   @JsonProperty("orderNo")
   public void setOrderNo(String orderNo) {
      this.orderNo = orderNo;
   }

   @JsonProperty("orderNo")
   public String getOrderNo() {
      return this.orderNo;
   }

   @JsonProperty("saleOrderNo")
   public void setSaleOrderNo(String saleOrderNo) {
      this.saleOrderNo = saleOrderNo;
   }

   @JsonProperty("saleOrderNo")
   public String getSaleOrderNo() {
      return this.saleOrderNo;
   }

   @JsonProperty("shOrderNo")
   public void setShOrderNo(String shOrderNo) {
      this.shOrderNo = shOrderNo;
   }

   @JsonProperty("shOrderNo")
   public String getShOrderNo() {
      return this.shOrderNo;
   }

   @JsonProperty("type")
   public void setType(String type) {
      this.type = type;
   }

   @JsonProperty("type")
   public String getType() {
      return this.type;
   }

   @JsonProperty("resultType")
   public void setResultType(String resultType) {
      this.resultType = resultType;
   }

   @JsonProperty("resultType")
   public String getResultType() {
      return this.resultType;
   }

   @JsonProperty("resultDesc")
   public void setResultDesc(String resultDesc) {
      this.resultDesc = resultDesc;
   }

   @JsonProperty("resultDesc")
   public String getResultDesc() {
      return this.resultDesc;
   }
}
