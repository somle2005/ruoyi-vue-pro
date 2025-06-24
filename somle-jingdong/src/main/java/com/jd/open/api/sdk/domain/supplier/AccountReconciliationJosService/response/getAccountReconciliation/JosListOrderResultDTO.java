package com.jd.open.api.sdk.domain.supplier.AccountReconciliationJosService.response.getAccountReconciliation;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class JosListOrderResultDTO implements Serializable {
   private List<JosArResultDetailDTO> orderList;
   private boolean success;
   private String resultMessage;

   @JsonProperty("orderList")
   public void setOrderList(List<JosArResultDetailDTO> orderList) {
      this.orderList = orderList;
   }

   @JsonProperty("orderList")
   public List<JosArResultDetailDTO> getOrderList() {
      return this.orderList;
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
