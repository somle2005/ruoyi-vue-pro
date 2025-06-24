package com.jd.open.api.sdk.domain.supplier.SalesReturnJosService.response.get;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class JosSalesReturnResultDto implements Serializable {
   private Integer recordCount;
   private List<JosSalesReturnDto> salesReturnList;
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

   @JsonProperty("salesReturnList")
   public void setSalesReturnList(List<JosSalesReturnDto> salesReturnList) {
      this.salesReturnList = salesReturnList;
   }

   @JsonProperty("salesReturnList")
   public List<JosSalesReturnDto> getSalesReturnList() {
      return this.salesReturnList;
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
