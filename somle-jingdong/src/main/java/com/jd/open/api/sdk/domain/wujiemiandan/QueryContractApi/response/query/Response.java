package com.jd.open.api.sdk.domain.wujiemiandan.QueryContractApi.response.query;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class Response implements Serializable {
   private String statusMessage;
   private Integer statusCode;
   private List<QueryContractResponse> data;

   @JsonProperty("statusMessage")
   public void setStatusMessage(String statusMessage) {
      this.statusMessage = statusMessage;
   }

   @JsonProperty("statusMessage")
   public String getStatusMessage() {
      return this.statusMessage;
   }

   @JsonProperty("statusCode")
   public void setStatusCode(Integer statusCode) {
      this.statusCode = statusCode;
   }

   @JsonProperty("statusCode")
   public Integer getStatusCode() {
      return this.statusCode;
   }

   @JsonProperty("data")
   public void setData(List<QueryContractResponse> data) {
      this.data = data;
   }

   @JsonProperty("data")
   public List<QueryContractResponse> getData() {
      return this.data;
   }
}
