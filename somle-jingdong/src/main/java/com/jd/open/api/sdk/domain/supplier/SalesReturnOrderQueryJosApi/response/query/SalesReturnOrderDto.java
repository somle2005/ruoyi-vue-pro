package com.jd.open.api.sdk.domain.supplier.SalesReturnOrderQueryJosApi.response.query;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class SalesReturnOrderDto implements Serializable {
   private Date createTime;
   private Long orderId;
   private String returnOrderId;
   private List<ReturnExecutionOrderDto> returnExecutionOrderList;
   private UserReturnExecutionOrderDto userReturnReturnExecutionOrder;

   @JsonProperty("createTime")
   public void setCreateTime(Date createTime) {
      this.createTime = createTime;
   }

   @JsonProperty("createTime")
   public Date getCreateTime() {
      return this.createTime;
   }

   @JsonProperty("orderId")
   public void setOrderId(Long orderId) {
      this.orderId = orderId;
   }

   @JsonProperty("orderId")
   public Long getOrderId() {
      return this.orderId;
   }

   @JsonProperty("returnOrderId")
   public void setReturnOrderId(String returnOrderId) {
      this.returnOrderId = returnOrderId;
   }

   @JsonProperty("returnOrderId")
   public String getReturnOrderId() {
      return this.returnOrderId;
   }

   @JsonProperty("returnExecutionOrderList")
   public void setReturnExecutionOrderList(List<ReturnExecutionOrderDto> returnExecutionOrderList) {
      this.returnExecutionOrderList = returnExecutionOrderList;
   }

   @JsonProperty("returnExecutionOrderList")
   public List<ReturnExecutionOrderDto> getReturnExecutionOrderList() {
      return this.returnExecutionOrderList;
   }

   @JsonProperty("userReturnReturnExecutionOrder")
   public void setUserReturnReturnExecutionOrder(UserReturnExecutionOrderDto userReturnReturnExecutionOrder) {
      this.userReturnReturnExecutionOrder = userReturnReturnExecutionOrder;
   }

   @JsonProperty("userReturnReturnExecutionOrder")
   public UserReturnExecutionOrderDto getUserReturnReturnExecutionOrder() {
      return this.userReturnReturnExecutionOrder;
   }
}
