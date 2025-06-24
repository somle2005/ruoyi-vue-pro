package com.jd.open.api.sdk.domain.supplier.ISupplierStockSoaService.response.batchAddOrUpdateSupplierStock;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class ValidationInfo implements Serializable {
   private int successNum;
   private int failtureNum;
   private List<AssetExecuteResult> failtureList;

   @JsonProperty("successNum")
   public void setSuccessNum(int successNum) {
      this.successNum = successNum;
   }

   @JsonProperty("successNum")
   public int getSuccessNum() {
      return this.successNum;
   }

   @JsonProperty("failtureNum")
   public void setFailtureNum(int failtureNum) {
      this.failtureNum = failtureNum;
   }

   @JsonProperty("failtureNum")
   public int getFailtureNum() {
      return this.failtureNum;
   }

   @JsonProperty("failtureList")
   public void setFailtureList(List<AssetExecuteResult> failtureList) {
      this.failtureList = failtureList;
   }

   @JsonProperty("failtureList")
   public List<AssetExecuteResult> getFailtureList() {
      return this.failtureList;
   }
}
