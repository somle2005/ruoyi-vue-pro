package com.jd.open.api.sdk.domain.order.OrderListOpenService.response.merge;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class Response implements Serializable {
   private String code;
   private String msg;
   private OrderMergeCollectionDto data;

   @JsonProperty("code")
   public void setCode(String code) {
      this.code = code;
   }

   @JsonProperty("code")
   public String getCode() {
      return this.code;
   }

   @JsonProperty("msg")
   public void setMsg(String msg) {
      this.msg = msg;
   }

   @JsonProperty("msg")
   public String getMsg() {
      return this.msg;
   }

   @JsonProperty("data")
   public void setData(OrderMergeCollectionDto data) {
      this.data = data;
   }

   @JsonProperty("data")
   public OrderMergeCollectionDto getData() {
      return this.data;
   }
}
