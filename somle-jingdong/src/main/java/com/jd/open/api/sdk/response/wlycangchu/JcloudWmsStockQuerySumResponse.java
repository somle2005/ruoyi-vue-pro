package com.jd.open.api.sdk.response.wlycangchu;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.wlycangchu.StockQueryServiceHandler.response.sum.StockDto;
import com.jd.open.api.sdk.response.AbstractResponse;
import java.util.List;

public class JcloudWmsStockQuerySumResponse extends AbstractResponse {
   private String resultCode;
   private String message;
   private List<StockDto> content;

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
   public void setContent(List<StockDto> content) {
      this.content = content;
   }

   @JsonProperty("content")
   public List<StockDto> getContent() {
      return this.content;
   }
}
