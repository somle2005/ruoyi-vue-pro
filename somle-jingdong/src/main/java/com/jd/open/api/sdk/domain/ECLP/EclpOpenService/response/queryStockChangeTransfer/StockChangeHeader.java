package com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.queryStockChangeTransfer;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class StockChangeHeader implements Serializable {
   private String changeNo;
   private String changeType;
   private String status;
   private String warehouseNo;
   private String tenantId;
   private Date createTime;
   private List<StockChangeDetail> stockChangeDetailList;

   @JsonProperty("changeNo")
   public void setChangeNo(String changeNo) {
      this.changeNo = changeNo;
   }

   @JsonProperty("changeNo")
   public String getChangeNo() {
      return this.changeNo;
   }

   @JsonProperty("changeType")
   public void setChangeType(String changeType) {
      this.changeType = changeType;
   }

   @JsonProperty("changeType")
   public String getChangeType() {
      return this.changeType;
   }

   @JsonProperty("status")
   public void setStatus(String status) {
      this.status = status;
   }

   @JsonProperty("status")
   public String getStatus() {
      return this.status;
   }

   @JsonProperty("warehouseNo")
   public void setWarehouseNo(String warehouseNo) {
      this.warehouseNo = warehouseNo;
   }

   @JsonProperty("warehouseNo")
   public String getWarehouseNo() {
      return this.warehouseNo;
   }

   @JsonProperty("tenantId")
   public void setTenantId(String tenantId) {
      this.tenantId = tenantId;
   }

   @JsonProperty("tenantId")
   public String getTenantId() {
      return this.tenantId;
   }

   @JsonProperty("createTime")
   public void setCreateTime(Date createTime) {
      this.createTime = createTime;
   }

   @JsonProperty("createTime")
   public Date getCreateTime() {
      return this.createTime;
   }

   @JsonProperty("stockChangeDetailList")
   public void setStockChangeDetailList(List<StockChangeDetail> stockChangeDetailList) {
      this.stockChangeDetailList = stockChangeDetailList;
   }

   @JsonProperty("stockChangeDetailList")
   public List<StockChangeDetail> getStockChangeDetailList() {
      return this.stockChangeDetailList;
   }
}
