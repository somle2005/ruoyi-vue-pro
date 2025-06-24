package com.jd.open.api.sdk.domain.ECLP.B2BElectronicBusinessCloudService.response.getSellerInfo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class ShopWarehouseInfo implements Serializable {
   private String[] deptNo;
   private String[] shopNos;
   private String[] warehouseNos;

   @JsonProperty("deptNo")
   public void setDeptNo(String[] deptNo) {
      this.deptNo = deptNo;
   }

   @JsonProperty("deptNo")
   public String[] getDeptNo() {
      return this.deptNo;
   }

   @JsonProperty("shopNos")
   public void setShopNos(String[] shopNos) {
      this.shopNos = shopNos;
   }

   @JsonProperty("shopNos")
   public String[] getShopNos() {
      return this.shopNos;
   }

   @JsonProperty("warehouseNos")
   public void setWarehouseNos(String[] warehouseNos) {
      this.warehouseNos = warehouseNos;
   }

   @JsonProperty("warehouseNos")
   public String[] getWarehouseNos() {
      return this.warehouseNos;
   }
}
