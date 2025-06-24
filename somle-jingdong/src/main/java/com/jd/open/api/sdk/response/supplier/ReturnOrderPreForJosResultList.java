package com.jd.open.api.sdk.response.supplier;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class ReturnOrderPreForJosResultList implements Serializable {
   private Integer status;
   private String message;
   private String code;
   private Integer recordCount;
   private List<ReturnOrderPreForJosResult> resultDtoList;

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

   @JsonProperty("code")
   public void setCode(String code) {
      this.code = code;
   }

   @JsonProperty("code")
   public String getCode() {
      return this.code;
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
   public void setResultDtoList(List<ReturnOrderPreForJosResult> resultDtoList) {
      this.resultDtoList = resultDtoList;
   }

   @JsonProperty("resultDtoList")
   public List<ReturnOrderPreForJosResult> getResultDtoList() {
      return this.resultDtoList;
   }
}
