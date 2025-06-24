package com.jd.open.api.sdk.domain.supplier.ReturnOrderJosService.response.get;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class JosReturnOrderDetailResultDTO implements Serializable {
   private Integer recordCount;
   private List<JosReturnOrderLineDTO> returnOrderLineList;
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

   @JsonProperty("returnOrderLineList")
   public void setReturnOrderLineList(List<JosReturnOrderLineDTO> returnOrderLineList) {
      this.returnOrderLineList = returnOrderLineList;
   }

   @JsonProperty("returnOrderLineList")
   public List<JosReturnOrderLineDTO> getReturnOrderLineList() {
      return this.returnOrderLineList;
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
