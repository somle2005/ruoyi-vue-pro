package com.jd.open.api.sdk.domain.O2O.LocOrderCodeSoaService.response.search;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class LocOrderModel implements Serializable {
   private List<LocOrderItemModel> locOrderItemList;
   private Long orderId;
   private Date orderCreateTime;
   private Long venderId;

   @JsonProperty("locOrderItemList")
   public void setLocOrderItemList(List<LocOrderItemModel> locOrderItemList) {
      this.locOrderItemList = locOrderItemList;
   }

   @JsonProperty("locOrderItemList")
   public List<LocOrderItemModel> getLocOrderItemList() {
      return this.locOrderItemList;
   }

   @JsonProperty("orderId")
   public void setOrderId(Long orderId) {
      this.orderId = orderId;
   }

   @JsonProperty("orderId")
   public Long getOrderId() {
      return this.orderId;
   }

   @JsonProperty("orderCreateTime")
   public void setOrderCreateTime(Date orderCreateTime) {
      this.orderCreateTime = orderCreateTime;
   }

   @JsonProperty("orderCreateTime")
   public Date getOrderCreateTime() {
      return this.orderCreateTime;
   }

   @JsonProperty("venderId")
   public void setVenderId(Long venderId) {
      this.venderId = venderId;
   }

   @JsonProperty("venderId")
   public Long getVenderId() {
      return this.venderId;
   }
}
