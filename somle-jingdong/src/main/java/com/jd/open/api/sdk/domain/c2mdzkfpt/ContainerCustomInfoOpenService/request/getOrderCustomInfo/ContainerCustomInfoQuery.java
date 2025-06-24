package com.jd.open.api.sdk.domain.c2mdzkfpt.ContainerCustomInfoOpenService.request.getOrderCustomInfo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class ContainerCustomInfoQuery implements Serializable {
   private Integer deliveryId;
   private Integer warehouseId;
   private String supplier;
   private String pickContainerNo;

   @JsonProperty("deliveryId")
   public void setDeliveryId(Integer deliveryId) {
      this.deliveryId = deliveryId;
   }

   @JsonProperty("deliveryId")
   public Integer getDeliveryId() {
      return this.deliveryId;
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

   @JsonProperty("pickContainerNo")
   public void setPickContainerNo(String pickContainerNo) {
      this.pickContainerNo = pickContainerNo;
   }

   @JsonProperty("pickContainerNo")
   public String getPickContainerNo() {
      return this.pickContainerNo;
   }
}
