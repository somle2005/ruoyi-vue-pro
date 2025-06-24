package com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.queryAdventGoodsStock;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class AdventGoodsStockResponse implements Serializable {
   private String deptNo;
   private String warehouseNo;
   private List<AdventGoodsStockDetail> details;

   @JsonProperty("deptNo")
   public void setDeptNo(String deptNo) {
      this.deptNo = deptNo;
   }

   @JsonProperty("deptNo")
   public String getDeptNo() {
      return this.deptNo;
   }

   @JsonProperty("warehouseNo")
   public void setWarehouseNo(String warehouseNo) {
      this.warehouseNo = warehouseNo;
   }

   @JsonProperty("warehouseNo")
   public String getWarehouseNo() {
      return this.warehouseNo;
   }

   @JsonProperty("details")
   public void setDetails(List<AdventGoodsStockDetail> details) {
      this.details = details;
   }

   @JsonProperty("details")
   public List<AdventGoodsStockDetail> getDetails() {
      return this.details;
   }
}
