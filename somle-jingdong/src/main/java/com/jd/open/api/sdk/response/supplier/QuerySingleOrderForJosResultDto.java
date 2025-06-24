package com.jd.open.api.sdk.response.supplier;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class QuerySingleOrderForJosResultDto implements Serializable {
   private Integer status;
   private String message;
   private String errorCode;
   private Integer recordCount;
   private QueryOrderForJosResultDto resultSingleDto;

   @JsonProperty("status")
   public void setStatus(Integer status) {
      this.status = status;
   }

   @JsonProperty("status")
   public Integer getStatus() {
      return this.status;
   }

   @JsonProperty("message")
   public void setMessage(String message) {
      this.message = message;
   }

   @JsonProperty("message")
   public String getMessage() {
      return this.message;
   }

   @JsonProperty("errorCode")
   public void setErrorCode(String errorCode) {
      this.errorCode = errorCode;
   }

   @JsonProperty("errorCode")
   public String getErrorCode() {
      return this.errorCode;
   }

   @JsonProperty("recordCount")
   public void setRecordCount(Integer recordCount) {
      this.recordCount = recordCount;
   }

   @JsonProperty("recordCount")
   public Integer getRecordCount() {
      return this.recordCount;
   }

   @JsonProperty("resultSingleDto")
   public void setResultSingleDto(QueryOrderForJosResultDto resultSingleDto) {
      this.resultSingleDto = resultSingleDto;
   }

   @JsonProperty("resultSingleDto")
   public QueryOrderForJosResultDto getResultSingleDto() {
      return this.resultSingleDto;
   }
}
