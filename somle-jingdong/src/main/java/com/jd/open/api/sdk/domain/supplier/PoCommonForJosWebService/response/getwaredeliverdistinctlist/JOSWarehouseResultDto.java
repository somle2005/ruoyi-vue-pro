package com.jd.open.api.sdk.domain.supplier.PoCommonForJosWebService.response.getwaredeliverdistinctlist;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class JOSWarehouseResultDto implements Serializable {
   private List<WarehouseDto> warehouseList;
   private boolean success;
   private String resultCode;
   private String resultMessage;

   @JsonProperty("warehouse_list")
   public void setWarehouseList(List<WarehouseDto> warehouseList) {
      this.warehouseList = warehouseList;
   }

   @JsonProperty("warehouse_list")
   public List<WarehouseDto> getWarehouseList() {
      return this.warehouseList;
   }

   @JsonProperty("success")
   public void setSuccess(boolean success) {
      this.success = success;
   }

   @JsonProperty("success")
   public boolean getSuccess() {
      return this.success;
   }

   @JsonProperty("result_code")
   public void setResultCode(String resultCode) {
      this.resultCode = resultCode;
   }

   @JsonProperty("result_code")
   public String getResultCode() {
      return this.resultCode;
   }

   @JsonProperty("result_message")
   public void setResultMessage(String resultMessage) {
      this.resultMessage = resultMessage;
   }

   @JsonProperty("result_message")
   public String getResultMessage() {
      return this.resultMessage;
   }
}
