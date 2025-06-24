package com.jd.open.api.sdk.domain.supplier.SalesOutWarehouseJosService.response.get;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;

public class JosSalesOutWarehouseDto implements Serializable {
   private String[] vendorCode;
   private String[] serialNo;
   private String[] ckBusId;
   private Date[] saleOrdTm;
   private Date[] ckTime;
   private String[] userPayablePayAmount;

   @JsonProperty("vendorCode")
   public void setVendorCode(String[] vendorCode) {
      this.vendorCode = vendorCode;
   }

   @JsonProperty("vendorCode")
   public String[] getVendorCode() {
      return this.vendorCode;
   }

   @JsonProperty("serialNo")
   public void setSerialNo(String[] serialNo) {
      this.serialNo = serialNo;
   }

   @JsonProperty("serialNo")
   public String[] getSerialNo() {
      return this.serialNo;
   }

   @JsonProperty("ckBusId")
   public void setCkBusId(String[] ckBusId) {
      this.ckBusId = ckBusId;
   }

   @JsonProperty("ckBusId")
   public String[] getCkBusId() {
      return this.ckBusId;
   }

   @JsonProperty("saleOrdTm")
   public void setSaleOrdTm(Date[] saleOrdTm) {
      this.saleOrdTm = saleOrdTm;
   }

   @JsonProperty("saleOrdTm")
   public Date[] getSaleOrdTm() {
      return this.saleOrdTm;
   }

   @JsonProperty("ckTime")
   public void setCkTime(Date[] ckTime) {
      this.ckTime = ckTime;
   }

   @JsonProperty("ckTime")
   public Date[] getCkTime() {
      return this.ckTime;
   }

   @JsonProperty("userPayablePayAmount")
   public void setUserPayablePayAmount(String[] userPayablePayAmount) {
      this.userPayablePayAmount = userPayablePayAmount;
   }

   @JsonProperty("userPayablePayAmount")
   public String[] getUserPayablePayAmount() {
      return this.userPayablePayAmount;
   }
}
