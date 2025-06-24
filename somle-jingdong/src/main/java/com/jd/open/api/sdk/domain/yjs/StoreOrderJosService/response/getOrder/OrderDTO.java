package com.jd.open.api.sdk.domain.yjs.StoreOrderJosService.response.getOrder;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class OrderDTO implements Serializable {
   private Date promiseStartTime;
   private Integer promiseType;
   private String orderId;
   private Long venderId;
   private String orderRemark;
   private Integer orderStatus;
   private Date promiseEndTime;
   private List<ItemInfoDTO> itemInfo;
   private Long storeId;
   private String orderStateRemark;
   private Integer rxtype;
   private List<OperateRecordDTO> operateRecord;
   private Date orderDate;
   private PaymentDTO payment;
   private InvoiceInfoDTO invoiceInfo;
   private RxInfoDTO rxInfo;
   private ConsigneeInfoDTO consigneeInfo;
   private Integer deliveryStatus;
   private String deliveryStatusDesc;
   private String waybillNo;
   private Integer agingType;
   private Integer serialNum;
   private Integer distribution;
   private List<RxInfoDTO> rxInfoList;

   @JsonProperty("promiseStartTime")
   public void setPromiseStartTime(Date promiseStartTime) {
      this.promiseStartTime = promiseStartTime;
   }

   @JsonProperty("promiseStartTime")
   public Date getPromiseStartTime() {
      return this.promiseStartTime;
   }

   @JsonProperty("promiseType")
   public void setPromiseType(Integer promiseType) {
      this.promiseType = promiseType;
   }

   @JsonProperty("promiseType")
   public Integer getPromiseType() {
      return this.promiseType;
   }

   @JsonProperty("orderId")
   public void setOrderId(String orderId) {
      this.orderId = orderId;
   }

   @JsonProperty("orderId")
   public String getOrderId() {
      return this.orderId;
   }

   @JsonProperty("venderId")
   public void setVenderId(Long venderId) {
      this.venderId = venderId;
   }

   @JsonProperty("venderId")
   public Long getVenderId() {
      return this.venderId;
   }

   @JsonProperty("orderRemark")
   public void setOrderRemark(String orderRemark) {
      this.orderRemark = orderRemark;
   }

   @JsonProperty("orderRemark")
   public String getOrderRemark() {
      return this.orderRemark;
   }

   @JsonProperty("orderStatus")
   public void setOrderStatus(Integer orderStatus) {
      this.orderStatus = orderStatus;
   }

   @JsonProperty("orderStatus")
   public Integer getOrderStatus() {
      return this.orderStatus;
   }

   @JsonProperty("promiseEndTime")
   public void setPromiseEndTime(Date promiseEndTime) {
      this.promiseEndTime = promiseEndTime;
   }

   @JsonProperty("promiseEndTime")
   public Date getPromiseEndTime() {
      return this.promiseEndTime;
   }

   @JsonProperty("itemInfo")
   public void setItemInfo(List<ItemInfoDTO> itemInfo) {
      this.itemInfo = itemInfo;
   }

   @JsonProperty("itemInfo")
   public List<ItemInfoDTO> getItemInfo() {
      return this.itemInfo;
   }

   @JsonProperty("storeId")
   public void setStoreId(Long storeId) {
      this.storeId = storeId;
   }

   @JsonProperty("storeId")
   public Long getStoreId() {
      return this.storeId;
   }

   @JsonProperty("orderStateRemark")
   public void setOrderStateRemark(String orderStateRemark) {
      this.orderStateRemark = orderStateRemark;
   }

   @JsonProperty("orderStateRemark")
   public String getOrderStateRemark() {
      return this.orderStateRemark;
   }

   @JsonProperty("rxtype")
   public void setRxtype(Integer rxtype) {
      this.rxtype = rxtype;
   }

   @JsonProperty("rxtype")
   public Integer getRxtype() {
      return this.rxtype;
   }

   @JsonProperty("operateRecord")
   public void setOperateRecord(List<OperateRecordDTO> operateRecord) {
      this.operateRecord = operateRecord;
   }

   @JsonProperty("operateRecord")
   public List<OperateRecordDTO> getOperateRecord() {
      return this.operateRecord;
   }

   @JsonProperty("orderDate")
   public void setOrderDate(Date orderDate) {
      this.orderDate = orderDate;
   }

   @JsonProperty("orderDate")
   public Date getOrderDate() {
      return this.orderDate;
   }

   @JsonProperty("payment")
   public void setPayment(PaymentDTO payment) {
      this.payment = payment;
   }

   @JsonProperty("payment")
   public PaymentDTO getPayment() {
      return this.payment;
   }

   @JsonProperty("invoiceInfo")
   public void setInvoiceInfo(InvoiceInfoDTO invoiceInfo) {
      this.invoiceInfo = invoiceInfo;
   }

   @JsonProperty("invoiceInfo")
   public InvoiceInfoDTO getInvoiceInfo() {
      return this.invoiceInfo;
   }

   @JsonProperty("rxInfo")
   public void setRxInfo(RxInfoDTO rxInfo) {
      this.rxInfo = rxInfo;
   }

   @JsonProperty("rxInfo")
   public RxInfoDTO getRxInfo() {
      return this.rxInfo;
   }

   @JsonProperty("consigneeInfo")
   public void setConsigneeInfo(ConsigneeInfoDTO consigneeInfo) {
      this.consigneeInfo = consigneeInfo;
   }

   @JsonProperty("consigneeInfo")
   public ConsigneeInfoDTO getConsigneeInfo() {
      return this.consigneeInfo;
   }

   @JsonProperty("deliveryStatus")
   public void setDeliveryStatus(Integer deliveryStatus) {
      this.deliveryStatus = deliveryStatus;
   }

   @JsonProperty("deliveryStatus")
   public Integer getDeliveryStatus() {
      return this.deliveryStatus;
   }

   @JsonProperty("deliveryStatusDesc")
   public void setDeliveryStatusDesc(String deliveryStatusDesc) {
      this.deliveryStatusDesc = deliveryStatusDesc;
   }

   @JsonProperty("deliveryStatusDesc")
   public String getDeliveryStatusDesc() {
      return this.deliveryStatusDesc;
   }

   @JsonProperty("waybillNo")
   public void setWaybillNo(String waybillNo) {
      this.waybillNo = waybillNo;
   }

   @JsonProperty("waybillNo")
   public String getWaybillNo() {
      return this.waybillNo;
   }

   @JsonProperty("agingType")
   public void setAgingType(Integer agingType) {
      this.agingType = agingType;
   }

   @JsonProperty("agingType")
   public Integer getAgingType() {
      return this.agingType;
   }

   @JsonProperty("serialNum")
   public void setSerialNum(Integer serialNum) {
      this.serialNum = serialNum;
   }

   @JsonProperty("serialNum")
   public Integer getSerialNum() {
      return this.serialNum;
   }

   @JsonProperty("distribution")
   public void setDistribution(Integer distribution) {
      this.distribution = distribution;
   }

   @JsonProperty("distribution")
   public Integer getDistribution() {
      return this.distribution;
   }

   @JsonProperty("rxInfoList")
   public void setRxInfoList(List<RxInfoDTO> rxInfoList) {
      this.rxInfoList = rxInfoList;
   }

   @JsonProperty("rxInfoList")
   public List<RxInfoDTO> getRxInfoList() {
      return this.rxInfoList;
   }
}
