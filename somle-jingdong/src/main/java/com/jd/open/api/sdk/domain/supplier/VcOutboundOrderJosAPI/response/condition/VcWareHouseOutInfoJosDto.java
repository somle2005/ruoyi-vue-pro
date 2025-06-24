package com.jd.open.api.sdk.domain.supplier.VcOutboundOrderJosAPI.response.condition;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class VcWareHouseOutInfoJosDto implements Serializable {
   private Boolean success;
   private String resultMessage;
   private String vendorCode;
   private String stockOutNo;
   private String companyCode;
   private String distribCenterCode;
   private String warehouseCode;
   private String companyName;
   private String distribCenterName;
   private String warehouseName;
   private Integer stockOutStatus;
   private String stockOutStatusName;
   private BigDecimal returnPrice;
   private Integer returnNum;
   private String erpCode;
   private Date createTime;
   private String settlementCode;
   private String returnCode;
   private String remarkForOutBound;
   private List<VcWareHouseOutSpareCodeJosDto> vcWareHouseOutSpareCodeJosDtoList;

   @JsonProperty("success")
   public void setSuccess(Boolean success) {
      this.success = success;
   }

   @JsonProperty("success")
   public Boolean getSuccess() {
      return this.success;
   }

   @JsonProperty("resultMessage")
   public void setResultMessage(String resultMessage) {
      this.resultMessage = resultMessage;
   }

   @JsonProperty("resultMessage")
   public String getResultMessage() {
      return this.resultMessage;
   }

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

   @JsonProperty("companyName")
   public void setCompanyName(String companyName) {
      this.companyName = companyName;
   }

   @JsonProperty("companyName")
   public String getCompanyName() {
      return this.companyName;
   }

   @JsonProperty("distribCenterName")
   public void setDistribCenterName(String distribCenterName) {
      this.distribCenterName = distribCenterName;
   }

   @JsonProperty("distribCenterName")
   public String getDistribCenterName() {
      return this.distribCenterName;
   }

   @JsonProperty("warehouseName")
   public void setWarehouseName(String warehouseName) {
      this.warehouseName = warehouseName;
   }

   @JsonProperty("warehouseName")
   public String getWarehouseName() {
      return this.warehouseName;
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

   @JsonProperty("returnPrice")
   public void setReturnPrice(BigDecimal returnPrice) {
      this.returnPrice = returnPrice;
   }

   @JsonProperty("returnPrice")
   public BigDecimal getReturnPrice() {
      return this.returnPrice;
   }

   @JsonProperty("returnNum")
   public void setReturnNum(Integer returnNum) {
      this.returnNum = returnNum;
   }

   @JsonProperty("returnNum")
   public Integer getReturnNum() {
      return this.returnNum;
   }

   @JsonProperty("erpCode")
   public void setErpCode(String erpCode) {
      this.erpCode = erpCode;
   }

   @JsonProperty("erpCode")
   public String getErpCode() {
      return this.erpCode;
   }

   @JsonProperty("createTime")
   public void setCreateTime(Date createTime) {
      this.createTime = createTime;
   }

   @JsonProperty("createTime")
   public Date getCreateTime() {
      return this.createTime;
   }

   @JsonProperty("settlementCode")
   public void setSettlementCode(String settlementCode) {
      this.settlementCode = settlementCode;
   }

   @JsonProperty("settlementCode")
   public String getSettlementCode() {
      return this.settlementCode;
   }

   @JsonProperty("returnCode")
   public void setReturnCode(String returnCode) {
      this.returnCode = returnCode;
   }

   @JsonProperty("returnCode")
   public String getReturnCode() {
      return this.returnCode;
   }

   @JsonProperty("remarkForOutBound")
   public void setRemarkForOutBound(String remarkForOutBound) {
      this.remarkForOutBound = remarkForOutBound;
   }

   @JsonProperty("remarkForOutBound")
   public String getRemarkForOutBound() {
      return this.remarkForOutBound;
   }

   @JsonProperty("vcWareHouseOutSpareCodeJosDtoList")
   public void setVcWareHouseOutSpareCodeJosDtoList(List<VcWareHouseOutSpareCodeJosDto> vcWareHouseOutSpareCodeJosDtoList) {
      this.vcWareHouseOutSpareCodeJosDtoList = vcWareHouseOutSpareCodeJosDtoList;
   }

   @JsonProperty("vcWareHouseOutSpareCodeJosDtoList")
   public List<VcWareHouseOutSpareCodeJosDto> getVcWareHouseOutSpareCodeJosDtoList() {
      return this.vcWareHouseOutSpareCodeJosDtoList;
   }
}
