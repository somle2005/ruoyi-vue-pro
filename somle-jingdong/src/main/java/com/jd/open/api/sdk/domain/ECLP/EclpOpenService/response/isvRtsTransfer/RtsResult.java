package com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.isvRtsTransfer;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class RtsResult implements Serializable {
   private String eclpRtsNo;
   private String isvRtsNum;
   private String deptNo;
   private String deliveryMode;
   private String supplierNo;
   private String rtsOrderStatus;
   private String operatorTime;
   private String operatorUser;
   private String source;
   private String remark;
   private String receiver;
   private String receiverPhone;
   private String email;
   private String province;
   private String city;
   private String county;
   private String town;
   private String warehouseNo;
   private List<RtsDetail> rtsDetailList;
   private String resultCode;
   private String failMsg;

   @JsonProperty("eclpRtsNo")
   public void setEclpRtsNo(String eclpRtsNo) {
      this.eclpRtsNo = eclpRtsNo;
   }

   @JsonProperty("eclpRtsNo")
   public String getEclpRtsNo() {
      return this.eclpRtsNo;
   }

   @JsonProperty("isvRtsNum")
   public void setIsvRtsNum(String isvRtsNum) {
      this.isvRtsNum = isvRtsNum;
   }

   @JsonProperty("isvRtsNum")
   public String getIsvRtsNum() {
      return this.isvRtsNum;
   }

   @JsonProperty("deptNo")
   public void setDeptNo(String deptNo) {
      this.deptNo = deptNo;
   }

   @JsonProperty("deptNo")
   public String getDeptNo() {
      return this.deptNo;
   }

   @JsonProperty("deliveryMode")
   public void setDeliveryMode(String deliveryMode) {
      this.deliveryMode = deliveryMode;
   }

   @JsonProperty("deliveryMode")
   public String getDeliveryMode() {
      return this.deliveryMode;
   }

   @JsonProperty("supplierNo")
   public void setSupplierNo(String supplierNo) {
      this.supplierNo = supplierNo;
   }

   @JsonProperty("supplierNo")
   public String getSupplierNo() {
      return this.supplierNo;
   }

   @JsonProperty("rtsOrderStatus")
   public void setRtsOrderStatus(String rtsOrderStatus) {
      this.rtsOrderStatus = rtsOrderStatus;
   }

   @JsonProperty("rtsOrderStatus")
   public String getRtsOrderStatus() {
      return this.rtsOrderStatus;
   }

   @JsonProperty("operatorTime")
   public void setOperatorTime(String operatorTime) {
      this.operatorTime = operatorTime;
   }

   @JsonProperty("operatorTime")
   public String getOperatorTime() {
      return this.operatorTime;
   }

   @JsonProperty("operatorUser")
   public void setOperatorUser(String operatorUser) {
      this.operatorUser = operatorUser;
   }

   @JsonProperty("operatorUser")
   public String getOperatorUser() {
      return this.operatorUser;
   }

   @JsonProperty("source")
   public void setSource(String source) {
      this.source = source;
   }

   @JsonProperty("source")
   public String getSource() {
      return this.source;
   }

   @JsonProperty("remark")
   public void setRemark(String remark) {
      this.remark = remark;
   }

   @JsonProperty("remark")
   public String getRemark() {
      return this.remark;
   }

   @JsonProperty("receiver")
   public void setReceiver(String receiver) {
      this.receiver = receiver;
   }

   @JsonProperty("receiver")
   public String getReceiver() {
      return this.receiver;
   }

   @JsonProperty("receiverPhone")
   public void setReceiverPhone(String receiverPhone) {
      this.receiverPhone = receiverPhone;
   }

   @JsonProperty("receiverPhone")
   public String getReceiverPhone() {
      return this.receiverPhone;
   }

   @JsonProperty("email")
   public void setEmail(String email) {
      this.email = email;
   }

   @JsonProperty("email")
   public String getEmail() {
      return this.email;
   }

   @JsonProperty("province")
   public void setProvince(String province) {
      this.province = province;
   }

   @JsonProperty("province")
   public String getProvince() {
      return this.province;
   }

   @JsonProperty("city")
   public void setCity(String city) {
      this.city = city;
   }

   @JsonProperty("city")
   public String getCity() {
      return this.city;
   }

   @JsonProperty("county")
   public void setCounty(String county) {
      this.county = county;
   }

   @JsonProperty("county")
   public String getCounty() {
      return this.county;
   }

   @JsonProperty("town")
   public void setTown(String town) {
      this.town = town;
   }

   @JsonProperty("town")
   public String getTown() {
      return this.town;
   }

   @JsonProperty("warehouseNo")
   public void setWarehouseNo(String warehouseNo) {
      this.warehouseNo = warehouseNo;
   }

   @JsonProperty("warehouseNo")
   public String getWarehouseNo() {
      return this.warehouseNo;
   }

   @JsonProperty("rtsDetailList")
   public void setRtsDetailList(List<RtsDetail> rtsDetailList) {
      this.rtsDetailList = rtsDetailList;
   }

   @JsonProperty("rtsDetailList")
   public List<RtsDetail> getRtsDetailList() {
      return this.rtsDetailList;
   }

   @JsonProperty("resultCode")
   public void setResultCode(String resultCode) {
      this.resultCode = resultCode;
   }

   @JsonProperty("resultCode")
   public String getResultCode() {
      return this.resultCode;
   }

   @JsonProperty("failMsg")
   public void setFailMsg(String failMsg) {
      this.failMsg = failMsg;
   }

   @JsonProperty("failMsg")
   public String getFailMsg() {
      return this.failMsg;
   }
}
