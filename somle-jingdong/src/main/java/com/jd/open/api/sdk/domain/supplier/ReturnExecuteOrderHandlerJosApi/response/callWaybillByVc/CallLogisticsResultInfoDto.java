package com.jd.open.api.sdk.domain.supplier.ReturnExecuteOrderHandlerJosApi.response.callWaybillByVc;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class CallLogisticsResultInfoDto implements Serializable {
   private String cpCode;
   private String cpName;
   private String returnExecutionOrderId;
   private String waybillCode;

   @JsonProperty("cpCode")
   public void setCpCode(String cpCode) {
      this.cpCode = cpCode;
   }

   @JsonProperty("cpCode")
   public String getCpCode() {
      return this.cpCode;
   }

   @JsonProperty("cpName")
   public void setCpName(String cpName) {
      this.cpName = cpName;
   }

   @JsonProperty("cpName")
   public String getCpName() {
      return this.cpName;
   }

   @JsonProperty("returnExecutionOrderId")
   public void setReturnExecutionOrderId(String returnExecutionOrderId) {
      this.returnExecutionOrderId = returnExecutionOrderId;
   }

   @JsonProperty("returnExecutionOrderId")
   public String getReturnExecutionOrderId() {
      return this.returnExecutionOrderId;
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
