package com.jd.open.api.sdk.domain.supplier.VcInboundOrderJosAPI.response.list;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;

public class VcWareHouseInJosDto implements Serializable {
   private String vendorCode;
   private String docNo;
   private String companyCode;
   private String distribCenterCode;
   private String warehouseCode;
   private String stockInType;
   private String stockInTypeName;
   private String stockOutStatusName;
   private String docStatus;
   private String docStatusName;
   private Date createTime;
   private String pickwareId;
   private Date unpackingTime;
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

   @JsonProperty("docNo")
   public void setDocNo(String docNo) {
      this.docNo = docNo;
   }

   @JsonProperty("docNo")
   public String getDocNo() {
      return this.docNo;
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

   @JsonProperty("stockInType")
   public void setStockInType(String stockInType) {
      this.stockInType = stockInType;
   }

   @JsonProperty("stockInType")
   public String getStockInType() {
      return this.stockInType;
   }

   @JsonProperty("stockInTypeName")
   public void setStockInTypeName(String stockInTypeName) {
      this.stockInTypeName = stockInTypeName;
   }

   @JsonProperty("stockInTypeName")
   public String getStockInTypeName() {
      return this.stockInTypeName;
   }

   @JsonProperty("stockOutStatusName")
   public void setStockOutStatusName(String stockOutStatusName) {
      this.stockOutStatusName = stockOutStatusName;
   }

   @JsonProperty("stockOutStatusName")
   public String getStockOutStatusName() {
      return this.stockOutStatusName;
   }

   @JsonProperty("docStatus")
   public void setDocStatus(String docStatus) {
      this.docStatus = docStatus;
   }

   @JsonProperty("docStatus")
   public String getDocStatus() {
      return this.docStatus;
   }

   @JsonProperty("docStatusName")
   public void setDocStatusName(String docStatusName) {
      this.docStatusName = docStatusName;
   }

   @JsonProperty("docStatusName")
   public String getDocStatusName() {
      return this.docStatusName;
   }

   @JsonProperty("createTime")
   public void setCreateTime(Date createTime) {
      this.createTime = createTime;
   }

   @JsonProperty("createTime")
   public Date getCreateTime() {
      return this.createTime;
   }

   @JsonProperty("pickwareId")
   public void setPickwareId(String pickwareId) {
      this.pickwareId = pickwareId;
   }

   @JsonProperty("pickwareId")
   public String getPickwareId() {
      return this.pickwareId;
   }

   @JsonProperty("unpackingTime")
   public void setUnpackingTime(Date unpackingTime) {
      this.unpackingTime = unpackingTime;
   }

   @JsonProperty("unpackingTime")
   public Date getUnpackingTime() {
      return this.unpackingTime;
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
