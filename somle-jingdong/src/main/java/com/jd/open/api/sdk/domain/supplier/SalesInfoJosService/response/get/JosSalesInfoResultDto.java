package com.jd.open.api.sdk.domain.supplier.SalesInfoJosService.response.get;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class JosSalesInfoResultDto implements Serializable {
   private Integer recordCount;
   private List<JosSalesInfoDto> salesInfoList;
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

   @JsonProperty("salesInfoList")
   public void setSalesInfoList(List<JosSalesInfoDto> salesInfoList) {
      this.salesInfoList = salesInfoList;
   }

   @JsonProperty("salesInfoList")
   public List<JosSalesInfoDto> getSalesInfoList() {
      return this.salesInfoList;
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
