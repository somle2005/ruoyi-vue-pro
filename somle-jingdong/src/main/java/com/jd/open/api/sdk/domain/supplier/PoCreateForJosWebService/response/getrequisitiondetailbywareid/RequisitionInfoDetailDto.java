package com.jd.open.api.sdk.domain.supplier.PoCreateForJosWebService.response.getrequisitiondetailbywareid;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class RequisitionInfoDetailDto implements Serializable {
   private String wareName;
   private String price;
   private List<WarehouseDto> warehouseList;
   private Integer repleQty;

   @JsonProperty("ware_name")
   public void setWareName(String wareName) {
      this.wareName = wareName;
   }

   @JsonProperty("ware_name")
   public String getWareName() {
      return this.wareName;
   }

   @JsonProperty("price")
   public void setPrice(String price) {
      this.price = price;
   }

   @JsonProperty("price")
   public String getPrice() {
      return this.price;
   }

   @JsonProperty("warehouse_list")
   public void setWarehouseList(List<WarehouseDto> warehouseList) {
      this.warehouseList = warehouseList;
   }

   @JsonProperty("warehouse_list")
   public List<WarehouseDto> getWarehouseList() {
      return this.warehouseList;
   }

   @JsonProperty("reple_qty")
   public void setRepleQty(Integer repleQty) {
      this.repleQty = repleQty;
   }

   @JsonProperty("reple_qty")
   public Integer getRepleQty() {
      return this.repleQty;
   }
}
