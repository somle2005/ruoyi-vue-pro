package com.jd.open.api.sdk.domain.supplier.IDpsQueryExpressInfoInterface.response.queryExpressInfo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class Result implements Serializable {
   private Integer status;
   private String message;
   private String errorCode;
   private List<ExpressInfoDto> resultDtoList;

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

   @JsonProperty("resultDtoList")
   public void setResultDtoList(List<ExpressInfoDto> resultDtoList) {
      this.resultDtoList = resultDtoList;
   }

   @JsonProperty("resultDtoList")
   public List<ExpressInfoDto> getResultDtoList() {
      return this.resultDtoList;
   }
}
