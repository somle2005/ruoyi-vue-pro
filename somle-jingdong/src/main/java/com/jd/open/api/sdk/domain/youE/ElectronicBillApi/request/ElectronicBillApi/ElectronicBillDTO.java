package com.jd.open.api.sdk.domain.youE.ElectronicBillApi.request.ElectronicBillApi;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class ElectronicBillDTO implements Serializable {
   private Integer flag;
   private Date payTime;
   private List<TServiceOrderPreferential> preferentialList;
   private Integer orderState;
   private Date orderTime;
   private BigDecimal price;
   private BigDecimal subtotalPrice;
   private List<TServiceOrderDetail> orderDetailList;
   private String workOrderId;
   private BigDecimal preferentialPrice;

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
   public void setPreferentialList(List<TServiceOrderPreferential> preferentialList) {
      this.preferentialList = preferentialList;
   }

   @JsonProperty("preferentialList")
   public List<TServiceOrderPreferential> getPreferentialList() {
      return this.preferentialList;
   }

   @JsonProperty("orderState")
   public void setOrderState(Integer orderState) {
      this.orderState = orderState;
   }

   @JsonProperty("orderState")
   public Integer getOrderState() {
      return this.orderState;
   }

   @JsonProperty("orderTime")
   public void setOrderTime(Date orderTime) {
      this.orderTime = orderTime;
   }

   @JsonProperty("orderTime")
   public Date getOrderTime() {
      return this.orderTime;
   }

   @JsonProperty("price")
   public void setPrice(BigDecimal price) {
      this.price = price;
   }

   @JsonProperty("price")
   public BigDecimal getPrice() {
      return this.price;
   }

   @JsonProperty("subtotalPrice")
   public void setSubtotalPrice(BigDecimal subtotalPrice) {
      this.subtotalPrice = subtotalPrice;
   }

   @JsonProperty("subtotalPrice")
   public BigDecimal getSubtotalPrice() {
      return this.subtotalPrice;
   }

   @JsonProperty("orderDetailList")
   public void setOrderDetailList(List<TServiceOrderDetail> orderDetailList) {
      this.orderDetailList = orderDetailList;
   }

   @JsonProperty("orderDetailList")
   public List<TServiceOrderDetail> getOrderDetailList() {
      return this.orderDetailList;
   }

   @JsonProperty("workOrderId")
   public void setWorkOrderId(String workOrderId) {
      this.workOrderId = workOrderId;
   }

   @JsonProperty("workOrderId")
   public String getWorkOrderId() {
      return this.workOrderId;
   }

   @JsonProperty("preferentialPrice")
   public void setPreferentialPrice(BigDecimal preferentialPrice) {
      this.preferentialPrice = preferentialPrice;
   }

   @JsonProperty("preferentialPrice")
   public BigDecimal getPreferentialPrice() {
      return this.preferentialPrice;
   }
}
