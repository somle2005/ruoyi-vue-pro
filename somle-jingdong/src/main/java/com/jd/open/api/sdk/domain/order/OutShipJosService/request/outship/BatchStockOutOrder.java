package com.jd.open.api.sdk.domain.order.OutShipJosService.request.outship;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class BatchStockOutOrder implements Serializable {
   private Integer deliveryType;
   private List<Long> orderIds;
   private Long venderTaskAddressId;
   private List<DeliveryNumberDto> deliveryNumberDtoList;

   @JsonProperty("deliveryType")
   public void setDeliveryType(Integer deliveryType) {
      this.deliveryType = deliveryType;
   }

   @JsonProperty("deliveryType")
   public Integer getDeliveryType() {
      return this.deliveryType;
   }

   @JsonProperty("orderIds")
   public void setOrderIds(List<Long> orderIds) {
      this.orderIds = orderIds;
   }

   @JsonProperty("orderIds")
   public List<Long> getOrderIds() {
      return this.orderIds;
   }

   @JsonProperty("venderTaskAddressId")
   public void setVenderTaskAddressId(Long venderTaskAddressId) {
      this.venderTaskAddressId = venderTaskAddressId;
   }

   @JsonProperty("venderTaskAddressId")
   public Long getVenderTaskAddressId() {
      return this.venderTaskAddressId;
   }

   @JsonProperty("deliveryNumberDtoList")
   public void setDeliveryNumberDtoList(List<DeliveryNumberDto> deliveryNumberDtoList) {
      this.deliveryNumberDtoList = deliveryNumberDtoList;
   }

   @JsonProperty("deliveryNumberDtoList")
   public List<DeliveryNumberDto> getDeliveryNumberDtoList() {
      return this.deliveryNumberDtoList;
   }
}
