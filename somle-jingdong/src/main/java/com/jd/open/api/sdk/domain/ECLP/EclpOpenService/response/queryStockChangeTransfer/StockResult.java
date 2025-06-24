package com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.queryStockChangeTransfer;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class StockResult implements Serializable {
   private String resultCode;
   private String message;
   private List<StockChangeHeader> content;

   @JsonProperty("resultCode")
   public void setResultCode(String resultCode) {
      this.resultCode = resultCode;
   }

   @JsonProperty("resultCode")
   public String getResultCode() {
      return this.resultCode;
   }

   @JsonProperty("message")
   public void setMessage(String message) {
      this.message = message;
   }

   @JsonProperty("message")
   public String getMessage() {
      return this.message;
   }

   @JsonProperty("content")
   public void setContent(List<StockChangeHeader> content) {
      this.content = content;
   }

   @JsonProperty("content")
   public List<StockChangeHeader> getContent() {
      return this.content;
   }
}
