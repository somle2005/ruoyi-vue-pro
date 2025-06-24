package com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.queryTransOrder;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class TransMainExtMain implements Serializable {
   private String deptName;
   private String orderType;
   private String destWarehouseNo;
   private String sellerName;
   private String sellerNo;
   private String orderStatus;
   private String outWarehouseTime;
   private String startWarehouseNo;
   private String transNo;
   private String deptNo;
   private String tranferNo;
   private String startWarehouseName;
   private String referTransNo;
   private String destWarehouseName;
   private String createTime;
   private String restockTime;
   private String createUser;
   private List<TransMainExtItem> itemList;
   private String operatingType;

   @JsonProperty("deptName")
   public void setDeptName(String deptName) {
      this.deptName = deptName;
   }

   @JsonProperty("deptName")
   public String getDeptName() {
      return this.deptName;
   }

   @JsonProperty("orderType")
   public void setOrderType(String orderType) {
      this.orderType = orderType;
   }

   @JsonProperty("orderType")
   public String getOrderType() {
      return this.orderType;
   }

   @JsonProperty("destWarehouseNo")
   public void setDestWarehouseNo(String destWarehouseNo) {
      this.destWarehouseNo = destWarehouseNo;
   }

   @JsonProperty("destWarehouseNo")
   public String getDestWarehouseNo() {
      return this.destWarehouseNo;
   }

   @JsonProperty("sellerName")
   public void setSellerName(String sellerName) {
      this.sellerName = sellerName;
   }

   @JsonProperty("sellerName")
   public String getSellerName() {
      return this.sellerName;
   }

   @JsonProperty("sellerNo")
   public void setSellerNo(String sellerNo) {
      this.sellerNo = sellerNo;
   }

   @JsonProperty("sellerNo")
   public String getSellerNo() {
      return this.sellerNo;
   }

   @JsonProperty("orderStatus")
   public void setOrderStatus(String orderStatus) {
      this.orderStatus = orderStatus;
   }

   @JsonProperty("orderStatus")
   public String getOrderStatus() {
      return this.orderStatus;
   }

   @JsonProperty("outWarehouseTime")
   public void setOutWarehouseTime(String outWarehouseTime) {
      this.outWarehouseTime = outWarehouseTime;
   }

   @JsonProperty("outWarehouseTime")
   public String getOutWarehouseTime() {
      return this.outWarehouseTime;
   }

   @JsonProperty("startWarehouseNo")
   public void setStartWarehouseNo(String startWarehouseNo) {
      this.startWarehouseNo = startWarehouseNo;
   }

   @JsonProperty("startWarehouseNo")
   public String getStartWarehouseNo() {
      return this.startWarehouseNo;
   }

   @JsonProperty("transNo")
   public void setTransNo(String transNo) {
      this.transNo = transNo;
   }

   @JsonProperty("transNo")
   public String getTransNo() {
      return this.transNo;
   }

   @JsonProperty("deptNo")
   public void setDeptNo(String deptNo) {
      this.deptNo = deptNo;
   }

   @JsonProperty("deptNo")
   public String getDeptNo() {
      return this.deptNo;
   }

   @JsonProperty("tranferNo")
   public void setTranferNo(String tranferNo) {
      this.tranferNo = tranferNo;
   }

   @JsonProperty("tranferNo")
   public String getTranferNo() {
      return this.tranferNo;
   }

   @JsonProperty("startWarehouseName")
   public void setStartWarehouseName(String startWarehouseName) {
      this.startWarehouseName = startWarehouseName;
   }

   @JsonProperty("startWarehouseName")
   public String getStartWarehouseName() {
      return this.startWarehouseName;
   }

   @JsonProperty("referTransNo")
   public void setReferTransNo(String referTransNo) {
      this.referTransNo = referTransNo;
   }

   @JsonProperty("referTransNo")
   public String getReferTransNo() {
      return this.referTransNo;
   }

   @JsonProperty("destWarehouseName")
   public void setDestWarehouseName(String destWarehouseName) {
      this.destWarehouseName = destWarehouseName;
   }

   @JsonProperty("destWarehouseName")
   public String getDestWarehouseName() {
      return this.destWarehouseName;
   }

   @JsonProperty("createTime")
   public void setCreateTime(String createTime) {
      this.createTime = createTime;
   }

   @JsonProperty("createTime")
   public String getCreateTime() {
      return this.createTime;
   }

   @JsonProperty("restockTime")
   public void setRestockTime(String restockTime) {
      this.restockTime = restockTime;
   }

   @JsonProperty("restockTime")
   public String getRestockTime() {
      return this.restockTime;
   }

   @JsonProperty("createUser")
   public void setCreateUser(String createUser) {
      this.createUser = createUser;
   }

   @JsonProperty("createUser")
   public String getCreateUser() {
      return this.createUser;
   }

   @JsonProperty("itemList")
   public void setItemList(List<TransMainExtItem> itemList) {
      this.itemList = itemList;
   }

   @JsonProperty("itemList")
   public List<TransMainExtItem> getItemList() {
      return this.itemList;
   }

   @JsonProperty("operatingType")
   public void setOperatingType(String operatingType) {
      this.operatingType = operatingType;
   }

   @JsonProperty("operatingType")
   public String getOperatingType() {
      return this.operatingType;
   }
}
