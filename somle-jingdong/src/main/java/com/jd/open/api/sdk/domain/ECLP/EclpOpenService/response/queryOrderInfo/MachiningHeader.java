package com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.queryOrderInfo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class MachiningHeader implements Serializable {
   private String machiningNo;
   private String machiningType;
   private String status;
   private String warehouseNo;
   private String tenantId;
   private Date createTime;
   private List<MachiningSrcDetail> machiningSrcDetailList;
   private List<MachiningDestDetail> machiningDestDetailList;

   @JsonProperty("machiningNo")
   public void setMachiningNo(String machiningNo) {
      this.machiningNo = machiningNo;
   }

   @JsonProperty("machiningNo")
   public String getMachiningNo() {
      return this.machiningNo;
   }

   @JsonProperty("machiningType")
   public void setMachiningType(String machiningType) {
      this.machiningType = machiningType;
   }

   @JsonProperty("machiningType")
   public String getMachiningType() {
      return this.machiningType;
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

   @JsonProperty("machiningSrcDetailList")
   public void setMachiningSrcDetailList(List<MachiningSrcDetail> machiningSrcDetailList) {
      this.machiningSrcDetailList = machiningSrcDetailList;
   }

   @JsonProperty("machiningSrcDetailList")
   public List<MachiningSrcDetail> getMachiningSrcDetailList() {
      return this.machiningSrcDetailList;
   }

   @JsonProperty("machiningDestDetailList")
   public void setMachiningDestDetailList(List<MachiningDestDetail> machiningDestDetailList) {
      this.machiningDestDetailList = machiningDestDetailList;
   }

   @JsonProperty("machiningDestDetailList")
   public List<MachiningDestDetail> getMachiningDestDetailList() {
      return this.machiningDestDetailList;
   }
}
