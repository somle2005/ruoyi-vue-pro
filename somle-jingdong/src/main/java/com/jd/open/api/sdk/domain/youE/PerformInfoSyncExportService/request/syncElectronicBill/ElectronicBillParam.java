package com.jd.open.api.sdk.domain.youE.PerformInfoSyncExportService.request.syncElectronicBill;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class ElectronicBillParam implements Serializable {
   private Integer chargeFlag;
   private BigDecimal preferentialAmount;
   private String orderNo;
   private Integer flag;
   private Date payTime;
   private List<ElectronicBillPreferentialDetail> preferentialList;
   private BigDecimal subtotalAmount;
   private Integer orderState;
   private List<ElectronicBillOrderDetail> orderDetailList;
   private Date orderTime;
   private BigDecimal actuallyPayAmount;
   private String payTimeStr;
   private String orderTimeStr;

   @JsonProperty("chargeFlag")
   public void setChargeFlag(Integer chargeFlag) {
      this.chargeFlag = chargeFlag;
   }

   @JsonProperty("chargeFlag")
   public Integer getChargeFlag() {
      return this.chargeFlag;
   }

   @JsonProperty("preferentialAmount")
   public void setPreferentialAmount(BigDecimal preferentialAmount) {
      this.preferentialAmount = preferentialAmount;
   }

   @JsonProperty("preferentialAmount")
   public BigDecimal getPreferentialAmount() {
      return this.preferentialAmount;
   }

   @JsonProperty("orderNo")
   public void setOrderNo(String orderNo) {
      this.orderNo = orderNo;
   }

   @JsonProperty("orderNo")
   public String getOrderNo() {
      return this.orderNo;
   }

   @JsonProperty("flag")
   public void setFlag(Integer flag) {
      this.flag = flag;
   }

   @JsonProperty("flag")
   public Integer getFlag() {
      return this.flag;
   }

   @JsonProperty("payTime")
   public void setPayTime(Date payTime) {
      this.payTime = payTime;
   }

   @JsonProperty("payTime")
   public Date getPayTime() {
      return this.payTime;
   }

   @JsonProperty("preferentialList")
   public void setPreferentialList(List<ElectronicBillPreferentialDetail> preferentialList) {
      this.preferentialList = preferentialList;
   }

   @JsonProperty("preferentialList")
   public List<ElectronicBillPreferentialDetail> getPreferentialList() {
      return this.preferentialList;
   }

   @JsonProperty("subtotalAmount")
   public void setSubtotalAmount(BigDecimal subtotalAmount) {
      this.subtotalAmount = subtotalAmount;
   }

   @JsonProperty("subtotalAmount")
   public BigDecimal getSubtotalAmount() {
      return this.subtotalAmount;
   }

   @JsonProperty("orderState")
   public void setOrderState(Integer orderState) {
      this.orderState = orderState;
   }

   @JsonProperty("orderState")
   public Integer getOrderState() {
      return this.orderState;
   }

   @JsonProperty("orderDetailList")
   public void setOrderDetailList(List<ElectronicBillOrderDetail> orderDetailList) {
      this.orderDetailList = orderDetailList;
   }

   @JsonProperty("orderDetailList")
   public List<ElectronicBillOrderDetail> getOrderDetailList() {
      return this.orderDetailList;
   }

   @JsonProperty("orderTime")
   public void setOrderTime(Date orderTime) {
      this.orderTime = orderTime;
   }

   @JsonProperty("orderTime")
   public Date getOrderTime() {
      return this.orderTime;
   }

   @JsonProperty("actuallyPayAmount")
   public void setActuallyPayAmount(BigDecimal actuallyPayAmount) {
      this.actuallyPayAmount = actuallyPayAmount;
   }

   @JsonProperty("actuallyPayAmount")
   public BigDecimal getActuallyPayAmount() {
      return this.actuallyPayAmount;
   }

   @JsonProperty("payTimeStr")
   public void setPayTimeStr(String payTimeStr) {
      this.payTimeStr = payTimeStr;
   }

   @JsonProperty("payTimeStr")
   public String getPayTimeStr() {
      return this.payTimeStr;
   }

   @JsonProperty("orderTimeStr")
   public void setOrderTimeStr(String orderTimeStr) {
      this.orderTimeStr = orderTimeStr;
   }

   @JsonProperty("orderTimeStr")
   public String getOrderTimeStr() {
      return this.orderTimeStr;
   }
}
