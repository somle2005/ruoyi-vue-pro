package com.jd.open.api.sdk.domain.O2O.LocOrderCodeSoaService.response.revokeCheckNumber;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class Result implements Serializable {
   private boolean success;
   private int resultCode;
   private String resultMessage;
   private int totalCount;
   private Boolean resultList;

   @JsonProperty("success")
   public void setSuccess(boolean success) {
      this.success = success;
   }

   @JsonProperty("success")
   public boolean getSuccess() {
      return this.success;
   }

   @JsonProperty("resultCode")
   public void setResultCode(int resultCode) {
      this.resultCode = resultCode;
   }

   @JsonProperty("resultCode")
   public int getResultCode() {
      return this.resultCode;
   }

   @JsonProperty("resultMessage")
   public void setResultMessage(String resultMessage) {
      this.resultMessage = resultMessage;
   }

   @JsonProperty("resultMessage")
   public String getResultMessage() {
      return this.resultMessage;
   }

   @JsonProperty("totalCount")
   public void setTotalCount(int totalCount) {
      this.totalCount = totalCount;
   }

   @JsonProperty("totalCount")
   public int getTotalCount() {
      return this.totalCount;
   }

   @JsonProperty("resultList")
   public void setResultList(Boolean resultList) {
      this.resultList = resultList;
   }

   @JsonProperty("resultList")
   public Boolean getResultList() {
      return this.resultList;
   }
}
