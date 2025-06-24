package com.jd.open.api.sdk.domain.supplier.VcOutboundOrderJosAPI.response.list;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;

public class VcWareHouseOutJosDto implements Serializable {
   private String vendorCode;
   private String stockOutNo;
   private String companyCode;
   private String distribCenterCode;
   private String warehouseCode;
   private Integer stockOutStatus;
   private String stockOutStatusName;
   private String stockOutType;
   private String stockOutTypeName;
   private Date createTime;
   private Date checkTime;
   private String remark1;
   private String remark2;
   private String remark3;
   private String remark4;
   private String remark5;

   @JsonProperty("vendorCode")
   public void setVendorCode(String vendorCode) {
      this.vendorCode = vendorCode;
   }

   @JsonProperty("vendorCode")
   public String getVendorCode() {
      return this.vendorCode;
   }

   @JsonProperty("stockOutNo")
   public void setStockOutNo(String stockOutNo) {
      this.stockOutNo = stockOutNo;
   }

   @JsonProperty("stockOutNo")
   public String getStockOutNo() {
      return this.stockOutNo;
   }

   @JsonProperty("companyCode")
   public void setCompanyCode(String companyCode) {
      this.companyCode = companyCode;
   }

   @JsonProperty("companyCode")
   public String getCompanyCode() {
      return this.companyCode;
   }

   @JsonProperty("distribCenterCode")
   public void setDistribCenterCode(String distribCenterCode) {
      this.distribCenterCode = distribCenterCode;
   }

   @JsonProperty("distribCenterCode")
   public String getDistribCenterCode() {
      return this.distribCenterCode;
   }

   @JsonProperty("warehouseCode")
   public void setWarehouseCode(String warehouseCode) {
      this.warehouseCode = warehouseCode;
   }

   @JsonProperty("warehouseCode")
   public String getWarehouseCode() {
      return this.warehouseCode;
   }

   @JsonProperty("stockOutStatus")
   public void setStockOutStatus(Integer stockOutStatus) {
      this.stockOutStatus = stockOutStatus;
   }

   @JsonProperty("stockOutStatus")
   public Integer getStockOutStatus() {
      return this.stockOutStatus;
   }

   @JsonProperty("stockOutStatusName")
   public void setStockOutStatusName(String stockOutStatusName) {
      this.stockOutStatusName = stockOutStatusName;
   }

   @JsonProperty("stockOutStatusName")
   public String getStockOutStatusName() {
      return this.stockOutStatusName;
   }

   @JsonProperty("stockOutType")
   public void setStockOutType(String stockOutType) {
      this.stockOutType = stockOutType;
   }

   @JsonProperty("stockOutType")
   public String getStockOutType() {
      return this.stockOutType;
   }

   @JsonProperty("stockOutTypeName")
   public void setStockOutTypeName(String stockOutTypeName) {
      this.stockOutTypeName = stockOutTypeName;
   }

   @JsonProperty("stockOutTypeName")
   public String getStockOutTypeName() {
      return this.stockOutTypeName;
   }

   @JsonProperty("createTime")
   public void setCreateTime(Date createTime) {
      this.createTime = createTime;
   }

   @JsonProperty("createTime")
   public Date getCreateTime() {
      return this.createTime;
   }

   @JsonProperty("checkTime")
   public void setCheckTime(Date checkTime) {
      this.checkTime = checkTime;
   }

   @JsonProperty("checkTime")
   public Date getCheckTime() {
      return this.checkTime;
   }

   @JsonProperty("remark1")
   public void setRemark1(String remark1) {
      this.remark1 = remark1;
   }

   @JsonProperty("remark1")
   public String getRemark1() {
      return this.remark1;
   }

   @JsonProperty("remark2")
   public void setRemark2(String remark2) {
      this.remark2 = remark2;
   }

   @JsonProperty("remark2")
   public String getRemark2() {
      return this.remark2;
   }

   @JsonProperty("remark3")
   public void setRemark3(String remark3) {
      this.remark3 = remark3;
   }

   @JsonProperty("remark3")
   public String getRemark3() {
      return this.remark3;
   }

   @JsonProperty("remark4")
   public void setRemark4(String remark4) {
      this.remark4 = remark4;
   }

   @JsonProperty("remark4")
   public String getRemark4() {
      return this.remark4;
   }

   @JsonProperty("remark5")
   public void setRemark5(String remark5) {
      this.remark5 = remark5;
   }

   @JsonProperty("remark5")
   public String getRemark5() {
      return this.remark5;
   }
}
