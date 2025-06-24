package com.jd.open.api.sdk.domain.supplier.SalesReturnOrderQueryJosApi.response.query;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class JosDataResponseDto implements Serializable {
   private Long total;
   private String code;
   private String message;
   private Boolean isSuccess;
   private List<SalesReturnOrderDto> body;

   @JsonProperty("total")
   public void setTotal(Long total) {
      this.total = total;
   }

   @JsonProperty("total")
   public Long getTotal() {
      return this.total;
   }

   @JsonProperty("code")
   public void setCode(String code) {
      this.code = code;
   }

   @JsonProperty("code")
   public String getCode() {
      return this.code;
   }

   @JsonProperty("message")
   public void setMessage(String message) {
      this.message = message;
   }

   @JsonProperty("message")
   public String getMessage() {
      return this.message;
   }

   @JsonProperty("isSuccess")
   public void setIsSuccess(Boolean isSuccess) {
      this.isSuccess = isSuccess;
   }

   @JsonProperty("isSuccess")
   public Boolean getIsSuccess() {
      return this.isSuccess;
   }

   @JsonProperty("body")
   public void setBody(List<SalesReturnOrderDto> body) {
      this.body = body;
   }

   @JsonProperty("body")
   public List<SalesReturnOrderDto> getBody() {
      return this.body;
   }
}
