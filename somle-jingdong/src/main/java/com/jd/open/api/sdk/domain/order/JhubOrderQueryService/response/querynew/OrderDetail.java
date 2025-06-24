package com.jd.open.api.sdk.domain.order.JhubOrderQueryService.response.querynew;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class OrderDetail implements Serializable {
   private Long orderId;
   private Integer orderType;
   private Long orderTotalFee;
   private Integer payStatus;
   private Integer orderStatus;
   private Boolean needReceipt;
   private List<ProductInfo> productInfoList;
   private List<PayInfo> payInfoList;
   private ReceiptInfo receiptInfo;
   private AddressInfo addressInfo;
   private Date payTime;
   private Date createTime;
   private Map<String, String> features;

   @JsonProperty("orderId")
   public void setOrderId(Long orderId) {
      this.orderId = orderId;
   }

   @JsonProperty("orderId")
   public Long getOrderId() {
      return this.orderId;
   }

   @JsonProperty("orderType")
   public void setOrderType(Integer orderType) {
      this.orderType = orderType;
   }

   @JsonProperty("orderType")
   public Integer getOrderType() {
      return this.orderType;
   }

   @JsonProperty("orderTotalFee")
   public void setOrderTotalFee(Long orderTotalFee) {
      this.orderTotalFee = orderTotalFee;
   }

   @JsonProperty("orderTotalFee")
   public Long getOrderTotalFee() {
      return this.orderTotalFee;
   }

   @JsonProperty("payStatus")
   public void setPayStatus(Integer payStatus) {
      this.payStatus = payStatus;
   }

   @JsonProperty("payStatus")
   public Integer getPayStatus() {
      return this.payStatus;
   }

   @JsonProperty("orderStatus")
   public void setOrderStatus(Integer orderStatus) {
      this.orderStatus = orderStatus;
   }

   @JsonProperty("orderStatus")
   public Integer getOrderStatus() {
      return this.orderStatus;
   }

   @JsonProperty("needReceipt")
   public void setNeedReceipt(Boolean needReceipt) {
      this.needReceipt = needReceipt;
   }

   @JsonProperty("needReceipt")
   public Boolean getNeedReceipt() {
      return this.needReceipt;
   }

   @JsonProperty("productInfoList")
   public void setProductInfoList(List<ProductInfo> productInfoList) {
      this.productInfoList = productInfoList;
   }

   @JsonProperty("productInfoList")
   public List<ProductInfo> getProductInfoList() {
      return this.productInfoList;
   }

   @JsonProperty("payInfoList")
   public void setPayInfoList(List<PayInfo> payInfoList) {
      this.payInfoList = payInfoList;
   }

   @JsonProperty("payInfoList")
   public List<PayInfo> getPayInfoList() {
      return this.payInfoList;
   }

   @JsonProperty("receiptInfo")
   public void setReceiptInfo(ReceiptInfo receiptInfo) {
      this.receiptInfo = receiptInfo;
   }

   @JsonProperty("receiptInfo")
   public ReceiptInfo getReceiptInfo() {
      return this.receiptInfo;
   }

   @JsonProperty("addressInfo")
   public void setAddressInfo(AddressInfo addressInfo) {
      this.addressInfo = addressInfo;
   }

   @JsonProperty("addressInfo")
   public AddressInfo getAddressInfo() {
      return this.addressInfo;
   }

   @JsonProperty("payTime")
   public void setPayTime(Date payTime) {
      this.payTime = payTime;
   }

   @JsonProperty("payTime")
   public Date getPayTime() {
      return this.payTime;
   }

   @JsonProperty("createTime")
   public void setCreateTime(Date createTime) {
      this.createTime = createTime;
   }

   @JsonProperty("createTime")
   public Date getCreateTime() {
      return this.createTime;
   }

   @JsonProperty("features")
   public void setFeatures(Map<String, String> features) {
      this.features = features;
   }

   @JsonProperty("features")
   public Map<String, String> getFeatures() {
      return this.features;
   }
}
