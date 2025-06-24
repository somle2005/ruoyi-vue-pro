package com.jd.open.api.sdk.domain.wujiemiandan.StockQueryApi.response.queryByProviderCode;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class ResponseDTO implements Serializable {
   private Integer statusCode;
   private String statusMessage;
   private List<WaybillStockDTO> data;

   @JsonProperty("statusCode")
   public void setStatusCode(Integer statusCode) {
      this.statusCode = statusCode;
   }

   @JsonProperty("statusCode")
   public Integer getStatusCode() {
      return this.statusCode;
   }

   @JsonProperty("statusMessage")
   public void setStatusMessage(String statusMessage) {
      this.statusMessage = statusMessage;
   }

   @JsonProperty("statusMessage")
   public String getStatusMessage() {
      return this.statusMessage;
   }

   @JsonProperty("data")
   public void setData(List<WaybillStockDTO> data) {
      this.data = data;
   }

   @JsonProperty("data")
   public List<WaybillStockDTO> getData() {
      return this.data;
   }
}
