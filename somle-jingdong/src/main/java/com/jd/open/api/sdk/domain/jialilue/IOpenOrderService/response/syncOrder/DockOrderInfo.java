package com.jd.open.api.sdk.domain.jialilue.IOpenOrderService.response.syncOrder;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class DockOrderInfo implements Serializable {
   private List<SkuInfo> skuInfoList;
   private OrderInfo orderInfo;
   private OrderMoney orderMoney;

   @JsonProperty("skuInfoList")
   public void setSkuInfoList(List<SkuInfo> skuInfoList) {
      this.skuInfoList = skuInfoList;
   }

   @JsonProperty("skuInfoList")
   public List<SkuInfo> getSkuInfoList() {
      return this.skuInfoList;
   }

   @JsonProperty("orderInfo")
   public void setOrderInfo(OrderInfo orderInfo) {
      this.orderInfo = orderInfo;
   }

   @JsonProperty("orderInfo")
   public OrderInfo getOrderInfo() {
      return this.orderInfo;
   }

   @JsonProperty("orderMoney")
   public void setOrderMoney(OrderMoney orderMoney) {
      this.orderMoney = orderMoney;
   }

   @JsonProperty("orderMoney")
   public OrderMoney getOrderMoney() {
      return this.orderMoney;
   }
}
