package com.jd.open.api.sdk.domain.supplier.RealTimeInventoryJosService.response.query;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class JosRealTimeInventoryResultDTO implements Serializable {
   private List<JosRealTimeInventoryDTO> realTimeInventorys;
   private boolean success;
   private String resultMessage;

   @JsonProperty("realTimeInventorys")
   public void setRealTimeInventorys(List<JosRealTimeInventoryDTO> realTimeInventorys) {
      this.realTimeInventorys = realTimeInventorys;
   }

   @JsonProperty("realTimeInventorys")
   public List<JosRealTimeInventoryDTO> getRealTimeInventorys() {
      return this.realTimeInventorys;
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
