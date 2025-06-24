package com.jd.open.api.sdk.domain.supplier.SalesReturnOrderQueryJosApi.response.query;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;

public class UserReturnExecutionOrderDto implements Serializable {
   private String cpCode;
   private Date shippedTime;
   private String cpName;
   private String waybillCode;

   @JsonProperty("cpCode")
   public void setCpCode(String cpCode) {
      this.cpCode = cpCode;
   }

   @JsonProperty("cpCode")
   public String getCpCode() {
      return this.cpCode;
   }

   @JsonProperty("shippedTime")
   public void setShippedTime(Date shippedTime) {
      this.shippedTime = shippedTime;
   }

   @JsonProperty("shippedTime")
   public Date getShippedTime() {
      return this.shippedTime;
   }

   @JsonProperty("cpName")
   public void setCpName(String cpName) {
      this.cpName = cpName;
   }

   @JsonProperty("cpName")
   public String getCpName() {
      return this.cpName;
   }

   @JsonProperty("waybillCode")
   public void setWaybillCode(String waybillCode) {
      this.waybillCode = waybillCode;
   }

   @JsonProperty("waybillCode")
   public String getWaybillCode() {
      return this.waybillCode;
   }
}
