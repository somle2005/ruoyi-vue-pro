package com.jd.open.api.sdk.domain.supplier.ReturnOrderJosService.response.get;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class JosReturnOrderResultDTO implements Serializable {
   private Integer recordCount;
   private List<JosReturnOrderDTO> returnOrderList;
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

   @JsonProperty("returnOrderList")
   public void setReturnOrderList(List<JosReturnOrderDTO> returnOrderList) {
      this.returnOrderList = returnOrderList;
   }

   @JsonProperty("returnOrderList")
   public List<JosReturnOrderDTO> getReturnOrderList() {
      return this.returnOrderList;
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
