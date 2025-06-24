package com.jd.open.api.sdk.domain.supplier.SalesOutWarehouseJosService.response.get;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class JosSalesOutWarehouseResultDto implements Serializable {
   private Integer recordCount;
   private List<JosSalesOutWarehouseDto> salesOutWarehouseList;
   private boolean success;
   private String resultMessage;

   @JsonProperty("recordCount")
   public void setRecordCount(Integer recordCount) {
      this.recordCount = recordCount;
   }

   @JsonProperty("recordCount")
   public Integer getRecordCount() {
      return this.recordCount;
   }

   @JsonProperty("salesOutWarehouseList")
   public void setSalesOutWarehouseList(List<JosSalesOutWarehouseDto> salesOutWarehouseList) {
      this.salesOutWarehouseList = salesOutWarehouseList;
   }

   @JsonProperty("salesOutWarehouseList")
   public List<JosSalesOutWarehouseDto> getSalesOutWarehouseList() {
      return this.salesOutWarehouseList;
   }

   @JsonProperty("success")
   public void setSuccess(boolean success) {
      this.success = success;
   }

   @JsonProperty("success")
   public boolean getSuccess() {
      return this.success;
   }

   @JsonProperty("resultMessage")
   public void setResultMessage(String resultMessage) {
      this.resultMessage = resultMessage;
   }

   @JsonProperty("resultMessage")
   public String getResultMessage() {
      return this.resultMessage;
   }
}
