package com.jd.open.api.sdk.domain.c2mdzkfpt.ContainerCustomInfoOpenService.response.getOrderCustomInfo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class ContainerCustomInfoEntity implements Serializable {
   private Integer deliveryId;
   private String sloganNo;
   private Integer warehouseId;
   private String supplier;
   private List<OrderCustomInfoEntity> orderCustomInfoList;
   private String pickContainerNo;

   @JsonProperty("deliveryId")
   public void setDeliveryId(Integer deliveryId) {
      this.deliveryId = deliveryId;
   }

   @JsonProperty("deliveryId")
   public Integer getDeliveryId() {
      return this.deliveryId;
   }

   @JsonProperty("sloganNo")
   public void setSloganNo(String sloganNo) {
      this.sloganNo = sloganNo;
   }

   @JsonProperty("sloganNo")
   public String getSloganNo() {
      return this.sloganNo;
   }

   @JsonProperty("warehouseId")
   public void setWarehouseId(Integer warehouseId) {
      this.warehouseId = warehouseId;
   }

   @JsonProperty("warehouseId")
   public Integer getWarehouseId() {
      return this.warehouseId;
   }

   @JsonProperty("supplier")
   public void setSupplier(String supplier) {
      this.supplier = supplier;
   }

   @JsonProperty("supplier")
   public String getSupplier() {
      return this.supplier;
   }

   @JsonProperty("orderCustomInfoList")
   public void setOrderCustomInfoList(List<OrderCustomInfoEntity> orderCustomInfoList) {
      this.orderCustomInfoList = orderCustomInfoList;
   }

   @JsonProperty("orderCustomInfoList")
   public List<OrderCustomInfoEntity> getOrderCustomInfoList() {
      return this.orderCustomInfoList;
   }

   @JsonProperty("pickContainerNo")
   public void setPickContainerNo(String pickContainerNo) {
      this.pickContainerNo = pickContainerNo;
   }

   @JsonProperty("pickContainerNo")
   public String getPickContainerNo() {
      return this.pickContainerNo;
   }
}
