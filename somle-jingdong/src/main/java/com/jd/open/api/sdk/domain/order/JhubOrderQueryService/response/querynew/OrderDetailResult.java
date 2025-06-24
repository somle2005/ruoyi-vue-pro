package com.jd.open.api.sdk.domain.order.JhubOrderQueryService.response.querynew;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class OrderDetailResult implements Serializable {
   private Integer resultCode;
   private String message;
   private List<OrderDetail> data;

   @JsonProperty("resultCode")
   public void setResultCode(Integer resultCode) {
      this.resultCode = resultCode;
   }

   @JsonProperty("resultCode")
   public Integer getResultCode() {
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

   @JsonProperty("data")
   public void setData(List<OrderDetail> data) {
      this.data = data;
   }

   @JsonProperty("data")
   public List<OrderDetail> getData() {
      return this.data;
   }
}
