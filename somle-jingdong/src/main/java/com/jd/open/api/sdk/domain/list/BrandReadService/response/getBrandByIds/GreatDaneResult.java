package com.jd.open.api.sdk.domain.list.BrandReadService.response.getBrandByIds;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Map;

public class GreatDaneResult implements Serializable {
   private String errorMessage;
   private String errorCode;
   private Map<String, Brand> result;
   private String bu;

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

   @JsonProperty("result")
   public void setResult(Map<String, Brand> result) {
      this.result = result;
   }

   @JsonProperty("result")
   public Map<String, Brand> getResult() {
      return this.result;
   }

   @JsonProperty("bu")
   public void setBu(String bu) {
      this.bu = bu;
   }

   @JsonProperty("bu")
   public String getBu() {
      return this.bu;
   }
}
