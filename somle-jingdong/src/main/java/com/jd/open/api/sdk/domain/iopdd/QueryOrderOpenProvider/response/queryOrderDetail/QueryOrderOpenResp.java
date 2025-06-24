package com.jd.open.api.sdk.domain.iopdd.QueryOrderOpenProvider.response.queryOrderDetail;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class QueryOrderOpenResp implements Serializable {
   private Integer orderType;
   private Long parentJdOrderId;
   private Date orderCreateTime;
   private Integer parentType;
   private List<SkuInfoOrderOpenResp> skuInfoList;
   private String thirdOrderId;
   private Date orderFinishTime;
   private Long jdOrderId;
   private List<Long> childJdOrderIdList;
   private StateOrderOpenResp orderState;
   private PriceOrderOpenResp orderPrice;
   private PaymentInfoOrderOpenResp orderPaymentInfo;
   private DeliveryInfoOrderOpenResp orderDeliveryInfo;
   private InvoiceInfoOrderOpenResp orderInvoiceInfo;

   @JsonProperty("orderType")
   public void setOrderType(Integer orderType) {
      this.orderType = orderType;
   }

   @JsonProperty("orderType")
   public Integer getOrderType() {
      return this.orderType;
   }

   @JsonProperty("parentJdOrderId")
   public void setParentJdOrderId(Long parentJdOrderId) {
      this.parentJdOrderId = parentJdOrderId;
   }

   @JsonProperty("parentJdOrderId")
   public Long getParentJdOrderId() {
      return this.parentJdOrderId;
   }

   @JsonProperty("orderCreateTime")
   public void setOrderCreateTime(Date orderCreateTime) {
      this.orderCreateTime = orderCreateTime;
   }

   @JsonProperty("orderCreateTime")
   public Date getOrderCreateTime() {
      return this.orderCreateTime;
   }

   @JsonProperty("parentType")
   public void setParentType(Integer parentType) {
      this.parentType = parentType;
   }

   @JsonProperty("parentType")
   public Integer getParentType() {
      return this.parentType;
   }

   @JsonProperty("skuInfoList")
   public void setSkuInfoList(List<SkuInfoOrderOpenResp> skuInfoList) {
      this.skuInfoList = skuInfoList;
   }

   @JsonProperty("skuInfoList")
   public List<SkuInfoOrderOpenResp> getSkuInfoList() {
      return this.skuInfoList;
   }

   @JsonProperty("thirdOrderId")
   public void setThirdOrderId(String thirdOrderId) {
      this.thirdOrderId = thirdOrderId;
   }

   @JsonProperty("thirdOrderId")
   public String getThirdOrderId() {
      return this.thirdOrderId;
   }

   @JsonProperty("orderFinishTime")
   public void setOrderFinishTime(Date orderFinishTime) {
      this.orderFinishTime = orderFinishTime;
   }

   @JsonProperty("orderFinishTime")
   public Date getOrderFinishTime() {
      return this.orderFinishTime;
   }

   @JsonProperty("jdOrderId")
   public void setJdOrderId(Long jdOrderId) {
      this.jdOrderId = jdOrderId;
   }

   @JsonProperty("jdOrderId")
   public Long getJdOrderId() {
      return this.jdOrderId;
   }

   @JsonProperty("childJdOrderIdList")
   public void setChildJdOrderIdList(List<Long> childJdOrderIdList) {
      this.childJdOrderIdList = childJdOrderIdList;
   }

   @JsonProperty("childJdOrderIdList")
   public List<Long> getChildJdOrderIdList() {
      return this.childJdOrderIdList;
   }

   @JsonProperty("orderState")
   public void setOrderState(StateOrderOpenResp orderState) {
      this.orderState = orderState;
   }

   @JsonProperty("orderState")
   public StateOrderOpenResp getOrderState() {
      return this.orderState;
   }

   @JsonProperty("orderPrice")
   public void setOrderPrice(PriceOrderOpenResp orderPrice) {
      this.orderPrice = orderPrice;
   }

   @JsonProperty("orderPrice")
   public PriceOrderOpenResp getOrderPrice() {
      return this.orderPrice;
   }

   @JsonProperty("orderPaymentInfo")
   public void setOrderPaymentInfo(PaymentInfoOrderOpenResp orderPaymentInfo) {
      this.orderPaymentInfo = orderPaymentInfo;
   }

   @JsonProperty("orderPaymentInfo")
   public PaymentInfoOrderOpenResp getOrderPaymentInfo() {
      return this.orderPaymentInfo;
   }

   @JsonProperty("orderDeliveryInfo")
   public void setOrderDeliveryInfo(DeliveryInfoOrderOpenResp orderDeliveryInfo) {
      this.orderDeliveryInfo = orderDeliveryInfo;
   }

   @JsonProperty("orderDeliveryInfo")
   public DeliveryInfoOrderOpenResp getOrderDeliveryInfo() {
      return this.orderDeliveryInfo;
   }

   @JsonProperty("orderInvoiceInfo")
   public void setOrderInvoiceInfo(InvoiceInfoOrderOpenResp orderInvoiceInfo) {
      this.orderInvoiceInfo = orderInvoiceInfo;
   }

   @JsonProperty("orderInvoiceInfo")
   public InvoiceInfoOrderOpenResp getOrderInvoiceInfo() {
      return this.orderInvoiceInfo;
   }
}
