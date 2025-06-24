package com.jd.open.api.sdk.domain.qqdkfptjq.OmnicOmcJosService.response.orderList;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class OrderModel implements Serializable {
   private Integer smartFulfilmentMark;
   private List<OrderDetail> orderDetailList;
   private Map<String, Object> orderInfo;
   private Map<String, Object> orderShip;

   @JsonProperty("smartFulfilmentMark")
   public void setSmartFulfilmentMark(Integer smartFulfilmentMark) {
      this.smartFulfilmentMark = smartFulfilmentMark;
   }

   @JsonProperty("smartFulfilmentMark")
   public Integer getSmartFulfilmentMark() {
      return this.smartFulfilmentMark;
   }

   @JsonProperty("orderDetailList")
   public void setOrderDetailList(List<OrderDetail> orderDetailList) {
      this.orderDetailList = orderDetailList;
   }

   @JsonProperty("orderDetailList")
   public List<OrderDetail> getOrderDetailList() {
      return this.orderDetailList;
   }

   @JsonProperty("orderInfo")
   public void setOrderInfo(Map<String, Object> orderInfo) {
      this.orderInfo = orderInfo;
   }

   @JsonProperty("orderInfo")
   public Map<String, Object> getOrderInfo() {
      return this.orderInfo;
   }

   @JsonProperty("orderShip")
   public void setOrderShip(Map<String, Object> orderShip) {
      this.orderShip = orderShip;
   }

   @JsonProperty("orderShip")
   public Map<String, Object> getOrderShip() {
      return this.orderShip;
   }
}
