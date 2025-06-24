package com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.queryCheckStockProfit;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class IsvCheckStock implements Serializable {
   private String[] checkStockNo;
   private String[] warehouseId;
   private Date[] createTime;
   private String[] deptNo;
   private List<IsvCheckStockDetail> details;

   @JsonProperty("checkStockNo")
   public void setCheckStockNo(String[] checkStockNo) {
      this.checkStockNo = checkStockNo;
   }

   @JsonProperty("checkStockNo")
   public String[] getCheckStockNo() {
      return this.checkStockNo;
   }

   @JsonProperty("warehouseId")
   public void setWarehouseId(String[] warehouseId) {
      this.warehouseId = warehouseId;
   }

   @JsonProperty("warehouseId")
   public String[] getWarehouseId() {
      return this.warehouseId;
   }

   @JsonProperty("createTime")
   public void setCreateTime(Date[] createTime) {
      this.createTime = createTime;
   }

   @JsonProperty("createTime")
   public Date[] getCreateTime() {
      return this.createTime;
   }

   @JsonProperty("deptNo")
   public void setDeptNo(String[] deptNo) {
      this.deptNo = deptNo;
   }

   @JsonProperty("deptNo")
   public String[] getDeptNo() {
      return this.deptNo;
   }

   @JsonProperty("details")
   public void setDetails(List<IsvCheckStockDetail> details) {
      this.details = details;
   }

   @JsonProperty("details")
   public List<IsvCheckStockDetail> getDetails() {
      return this.details;
   }
}
