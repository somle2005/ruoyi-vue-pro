package com.jd.open.api.sdk.domain.supplier.StockInfoJosService.response.get;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class JosStockInfoResultDto implements Serializable {
   private Integer recordCount;
   private List<JosStockInfoDto> stockInfoList;
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

   @JsonProperty("stockInfoList")
   public void setStockInfoList(List<JosStockInfoDto> stockInfoList) {
      this.stockInfoList = stockInfoList;
   }

   @JsonProperty("stockInfoList")
   public List<JosStockInfoDto> getStockInfoList() {
      return this.stockInfoList;
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
