package com.jd.open.api.sdk.domain.supplier.ISupplierStockSoaService.request.batchAddOrUpdateSupplierStock;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class BatchSupplierStockDto implements Serializable {
   private List<SupplierStockDto> supplierStockDtoList;
   private String supplierName;

   @JsonProperty("supplierStockDtoList")
   public void setSupplierStockDtoList(List<SupplierStockDto> supplierStockDtoList) {
      this.supplierStockDtoList = supplierStockDtoList;
   }

   @JsonProperty("supplierStockDtoList")
   public List<SupplierStockDto> getSupplierStockDtoList() {
      return this.supplierStockDtoList;
   }

   @JsonProperty("supplierName")
   public void setSupplierName(String supplierName) {
      this.supplierName = supplierName;
   }

   @JsonProperty("supplierName")
   public String getSupplierName() {
      return this.supplierName;
   }
}
