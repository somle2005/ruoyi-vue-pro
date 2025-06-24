package com.jd.open.api.sdk.domain.supplier.DpsStockInterface.response.queryStockInfo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class DropshipResult implements Serializable {
   private boolean success;
   private String message;
   private String resultCode;
   private List<StockInfo> stockInfos;

   @JsonProperty("success")
   public void setSuccess(boolean success) {
      this.success = success;
   }

   @JsonProperty("success")
   public boolean getSuccess() {
      return this.success;
   }

   @JsonProperty("message")
   public void setMessage(String message) {
      this.message = message;
   }

   @JsonProperty("message")
   public String getMessage() {
      return this.message;
   }

   @JsonProperty("resultCode")
   public void setResultCode(String resultCode) {
      this.resultCode = resultCode;
   }

   @JsonProperty("resultCode")
   public String getResultCode() {
      return this.resultCode;
   }

   @JsonProperty("stockInfos")
   public void setStockInfos(List<StockInfo> stockInfos) {
      this.stockInfos = stockInfos;
   }

   @JsonProperty("stockInfos")
   public List<StockInfo> getStockInfos() {
      return this.stockInfos;
   }
}
