package com.jd.open.api.sdk.domain.youE.OrderQueryJsfService.response.queryUnHandleOrders;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class PerformResult implements Serializable {
   private String msg;
   private Integer resultCode;
   private List<OrderUnHandleInfo> data;

   @JsonProperty("msg")
   public void setMsg(String msg) {
      this.msg = msg;
   }

   @JsonProperty("msg")
   public String getMsg() {
      return this.msg;
   }

   @JsonProperty("resultCode")
   public void setResultCode(Integer resultCode) {
      this.resultCode = resultCode;
   }

   @JsonProperty("resultCode")
   public Integer getResultCode() {
      return this.resultCode;
   }

   @JsonProperty("data")
   public void setData(List<OrderUnHandleInfo> data) {
      this.data = data;
   }

   @JsonProperty("data")
   public List<OrderUnHandleInfo> getData() {
      return this.data;
   }
}
