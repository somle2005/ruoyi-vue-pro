package com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.queryOrderList;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class OrderDetailResult implements Serializable {
   private String eclpSoNo;
   private String isvUUID;
   private String shopNo;
   private String departmentNo;
   private String warehouseNo;
   private String shipperNo;
   private String shipperName;
   private String salesPlatformOrderNo;
   private String salePlatformSource;
   private Date salesPlatformCreateTime;
   private Double receivable;
   private String consigneeRemark;
   private String currentStatus;
   private String currentStatusName;
   private Integer totalPage;
   private Integer totalNum;
   private String wayBill;
   private List<OrderDetail> orderDetailList;
   private Date createTime;

   @JsonProperty("eclpSoNo")
   public void setEclpSoNo(String eclpSoNo) {
      this.eclpSoNo = eclpSoNo;
   }

   @JsonProperty("eclpSoNo")
   public String getEclpSoNo() {
      return this.eclpSoNo;
   }

   @JsonProperty("isvUUID")
   public void setIsvUUID(String isvUUID) {
      this.isvUUID = isvUUID;
   }

   @JsonProperty("isvUUID")
   public String getIsvUUID() {
      return this.isvUUID;
   }

   @JsonProperty("shopNo")
   public void setShopNo(String shopNo) {
      this.shopNo = shopNo;
   }

   @JsonProperty("shopNo")
   public String getShopNo() {
      return this.shopNo;
   }

   @JsonProperty("departmentNo")
   public void setDepartmentNo(String departmentNo) {
      this.departmentNo = departmentNo;
   }

   @JsonProperty("departmentNo")
   public String getDepartmentNo() {
      return this.departmentNo;
   }

   @JsonProperty("warehouseNo")
   public void setWarehouseNo(String warehouseNo) {
      this.warehouseNo = warehouseNo;
   }

   @JsonProperty("warehouseNo")
   public String getWarehouseNo() {
      return this.warehouseNo;
   }

   @JsonProperty("shipperNo")
   public void setShipperNo(String shipperNo) {
      this.shipperNo = shipperNo;
   }

   @JsonProperty("shipperNo")
   public String getShipperNo() {
      return this.shipperNo;
   }

   @JsonProperty("shipperName")
   public void setShipperName(String shipperName) {
      this.shipperName = shipperName;
   }

   @JsonProperty("shipperName")
   public String getShipperName() {
      return this.shipperName;
   }

   @JsonProperty("salesPlatformOrderNo")
   public void setSalesPlatformOrderNo(String salesPlatformOrderNo) {
      this.salesPlatformOrderNo = salesPlatformOrderNo;
   }

   @JsonProperty("salesPlatformOrderNo")
   public String getSalesPlatformOrderNo() {
      return this.salesPlatformOrderNo;
   }

   @JsonProperty("salePlatformSource")
   public void setSalePlatformSource(String salePlatformSource) {
      this.salePlatformSource = salePlatformSource;
   }

   @JsonProperty("salePlatformSource")
   public String getSalePlatformSource() {
      return this.salePlatformSource;
   }

   @JsonProperty("salesPlatformCreateTime")
   public void setSalesPlatformCreateTime(Date salesPlatformCreateTime) {
      this.salesPlatformCreateTime = salesPlatformCreateTime;
   }

   @JsonProperty("salesPlatformCreateTime")
   public Date getSalesPlatformCreateTime() {
      return this.salesPlatformCreateTime;
   }

   @JsonProperty("receivable")
   public void setReceivable(Double receivable) {
      this.receivable = receivable;
   }

   @JsonProperty("receivable")
   public Double getReceivable() {
      return this.receivable;
   }

   @JsonProperty("consigneeRemark")
   public void setConsigneeRemark(String consigneeRemark) {
      this.consigneeRemark = consigneeRemark;
   }

   @JsonProperty("consigneeRemark")
   public String getConsigneeRemark() {
      return this.consigneeRemark;
   }

   @JsonProperty("currentStatus")
   public void setCurrentStatus(String currentStatus) {
      this.currentStatus = currentStatus;
   }

   @JsonProperty("currentStatus")
   public String getCurrentStatus() {
      return this.currentStatus;
   }

   @JsonProperty("currentStatusName")
   public void setCurrentStatusName(String currentStatusName) {
      this.currentStatusName = currentStatusName;
   }

   @JsonProperty("currentStatusName")
   public String getCurrentStatusName() {
      return this.currentStatusName;
   }

   @JsonProperty("totalPage")
   public void setTotalPage(Integer totalPage) {
      this.totalPage = totalPage;
   }

   @JsonProperty("totalPage")
   public Integer getTotalPage() {
      return this.totalPage;
   }

   @JsonProperty("totalNum")
   public void setTotalNum(Integer totalNum) {
      this.totalNum = totalNum;
   }

   @JsonProperty("totalNum")
   public Integer getTotalNum() {
      return this.totalNum;
   }

   @JsonProperty("wayBill")
   public void setWayBill(String wayBill) {
      this.wayBill = wayBill;
   }

   @JsonProperty("wayBill")
   public String getWayBill() {
      return this.wayBill;
   }

   @JsonProperty("orderDetailList")
   public void setOrderDetailList(List<OrderDetail> orderDetailList) {
      this.orderDetailList = orderDetailList;
   }

   @JsonProperty("orderDetailList")
   public List<OrderDetail> getOrderDetailList() {
      return this.orderDetailList;
   }

   @JsonProperty("createTime")
   public void setCreateTime(Date createTime) {
      this.createTime = createTime;
   }

   @JsonProperty("createTime")
   public Date getCreateTime() {
      return this.createTime;
   }
}
