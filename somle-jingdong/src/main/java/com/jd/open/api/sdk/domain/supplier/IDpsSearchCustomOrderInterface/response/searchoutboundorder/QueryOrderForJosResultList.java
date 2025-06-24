package com.jd.open.api.sdk.domain.supplier.IDpsSearchCustomOrderInterface.response.searchoutboundorder;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class QueryOrderForJosResultList implements Serializable {
   private Integer status;
   private String errorMessage;
   private String errorCode;
   private Integer recordCount;
   private List<QueryOrderForJosResult> resultDtoList;

   @JsonProperty("status")
   public void setStatus(Integer status) {
      this.status = status;
   }

   @JsonProperty("status")
   public Integer getStatus() {
      return this.status;
   }

   @JsonProperty("errorMessage")
   public void setErrorMessage(String errorMessage) {
      this.errorMessage = errorMessage;
   }

   @JsonProperty("errorMessage")
   public String getErrorMessage() {
      return this.errorMessage;
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

   @JsonProperty("resultDtoList")
   public void setResultDtoList(List<QueryOrderForJosResult> resultDtoList) {
      this.resultDtoList = resultDtoList;
   }

   @JsonProperty("resultDtoList")
   public List<QueryOrderForJosResult> getResultDtoList() {
      return this.resultDtoList;
   }
}
