package com.jd.open.api.sdk.response.wms;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class WarehouseDetail implements Serializable {
   private String warehouseNo;
   private String warehouseName;
   private String warehouseAddress;
   private String warehousePhone;

   @JsonProperty("warehouse_no")
   public void setWarehouseNo(String warehouseNo) {
      this.warehouseNo = warehouseNo;
   }

   @JsonProperty("warehouse_no")
   public String getWarehouseNo() {
      return this.warehouseNo;
   }

   @JsonProperty("warehouse_name")
   public void setWarehouseName(String warehouseName) {
      this.warehouseName = warehouseName;
   }

   @JsonProperty("warehouse_name")
   public String getWarehouseName() {
      return this.warehouseName;
   }

   @JsonProperty("warehouse_address")
   public void setWarehouseAddress(String warehouseAddress) {
      this.warehouseAddress = warehouseAddress;
   }

   @JsonProperty("warehouse_address")
   public String getWarehouseAddress() {
      return this.warehouseAddress;
   }

   @JsonProperty("warehouse_phone")
   public void setWarehousePhone(String warehousePhone) {
      this.warehousePhone = warehousePhone;
   }

   @JsonProperty("warehouse_phone")
   public String getWarehousePhone() {
      return this.warehousePhone;
   }
}
