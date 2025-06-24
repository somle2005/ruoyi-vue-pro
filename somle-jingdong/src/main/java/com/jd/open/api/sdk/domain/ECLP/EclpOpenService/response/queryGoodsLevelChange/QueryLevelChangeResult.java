package com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.queryGoodsLevelChange;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class QueryLevelChangeResult implements Serializable {
   private String deptNo;
   private String orderNo;
   private Long warehouseId;
   private String createTime;
   private List<QueryLevelChangeItemResult> details;
   private String warehouseNo;

   @JsonProperty("deptNo")
   public void setDeptNo(String deptNo) {
      this.deptNo = deptNo;
   }

   @JsonProperty("deptNo")
   public String getDeptNo() {
      return this.deptNo;
   }

   @JsonProperty("orderNo")
   public void setOrderNo(String orderNo) {
      this.orderNo = orderNo;
   }

   @JsonProperty("orderNo")
   public String getOrderNo() {
      return this.orderNo;
   }

   @JsonProperty("warehouseId")
   public void setWarehouseId(Long warehouseId) {
      this.warehouseId = warehouseId;
   }

   @JsonProperty("warehouseId")
   public Long getWarehouseId() {
      return this.warehouseId;
   }

   @JsonProperty("createTime")
   public void setCreateTime(String createTime) {
      this.createTime = createTime;
   }

   @JsonProperty("createTime")
   public String getCreateTime() {
      return this.createTime;
   }

   @JsonProperty("details")
   public void setDetails(List<QueryLevelChangeItemResult> details) {
      this.details = details;
   }

   @JsonProperty("details")
   public List<QueryLevelChangeItemResult> getDetails() {
      return this.details;
   }

   @JsonProperty("warehouseNo")
   public void setWarehouseNo(String warehouseNo) {
      this.warehouseNo = warehouseNo;
   }

   @JsonProperty("warehouseNo")
   public String getWarehouseNo() {
      return this.warehouseNo;
   }
}
