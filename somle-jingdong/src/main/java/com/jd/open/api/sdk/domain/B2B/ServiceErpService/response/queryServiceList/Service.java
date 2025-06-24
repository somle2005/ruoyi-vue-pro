package com.jd.open.api.sdk.domain.B2B.ServiceErpService.response.queryServiceList;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Service implements Serializable {
   private Long purchaseId;
   private String serviceId;
   private BigDecimal purchaseOrderPrice;
   private BigDecimal freight;
   private BigDecimal purchaseOrderTotalPrice;
   private Date submitDate;
   private Date applyDate;
   private Date completeDate;
   private BigDecimal price;
   private Integer purchaseNum;
   private Integer userExpectation;
   private Integer purchaseOrderStatus;
   private String feedbackMsg;
   private OrderSku orderSku;
   private String sellerShopName;
   private Integer sellerId;
   private Date created;
   private String applyTime;
   private String dealTime;
   private Integer serviceStatus;
   private Date updateTime;

   @JsonProperty("purchaseId")
   public void setPurchaseId(Long purchaseId) {
      this.purchaseId = purchaseId;
   }

   @JsonProperty("purchaseId")
   public Long getPurchaseId() {
      return this.purchaseId;
   }

   @JsonProperty("serviceId")
   public void setServiceId(String serviceId) {
      this.serviceId = serviceId;
   }

   @JsonProperty("serviceId")
   public String getServiceId() {
      return this.serviceId;
   }

   @JsonProperty("purchaseOrderPrice")
   public void setPurchaseOrderPrice(BigDecimal purchaseOrderPrice) {
      this.purchaseOrderPrice = purchaseOrderPrice;
   }

   @JsonProperty("purchaseOrderPrice")
   public BigDecimal getPurchaseOrderPrice() {
      return this.purchaseOrderPrice;
   }

   @JsonProperty("freight")
   public void setFreight(BigDecimal freight) {
      this.freight = freight;
   }

   @JsonProperty("freight")
   public BigDecimal getFreight() {
      return this.freight;
   }

   @JsonProperty("purchaseOrderTotalPrice")
   public void setPurchaseOrderTotalPrice(BigDecimal purchaseOrderTotalPrice) {
      this.purchaseOrderTotalPrice = purchaseOrderTotalPrice;
   }

   @JsonProperty("purchaseOrderTotalPrice")
   public BigDecimal getPurchaseOrderTotalPrice() {
      return this.purchaseOrderTotalPrice;
   }

   @JsonProperty("submitDate")
   public void setSubmitDate(Date submitDate) {
      this.submitDate = submitDate;
   }

   @JsonProperty("submitDate")
   public Date getSubmitDate() {
      return this.submitDate;
   }

   @JsonProperty("applyDate")
   public void setApplyDate(Date applyDate) {
      this.applyDate = applyDate;
   }

   @JsonProperty("applyDate")
   public Date getApplyDate() {
      return this.applyDate;
   }

   @JsonProperty("completeDate")
   public void setCompleteDate(Date completeDate) {
      this.completeDate = completeDate;
   }

   @JsonProperty("completeDate")
   public Date getCompleteDate() {
      return this.completeDate;
   }

   @JsonProperty("price")
   public void setPrice(BigDecimal price) {
      this.price = price;
   }

   @JsonProperty("price")
   public BigDecimal getPrice() {
      return this.price;
   }

   @JsonProperty("purchaseNum")
   public void setPurchaseNum(Integer purchaseNum) {
      this.purchaseNum = purchaseNum;
   }

   @JsonProperty("purchaseNum")
   public Integer getPurchaseNum() {
      return this.purchaseNum;
   }

   @JsonProperty("userExpectation")
   public void setUserExpectation(Integer userExpectation) {
      this.userExpectation = userExpectation;
   }

   @JsonProperty("userExpectation")
   public Integer getUserExpectation() {
      return this.userExpectation;
   }

   @JsonProperty("purchaseOrderStatus")
   public void setPurchaseOrderStatus(Integer purchaseOrderStatus) {
      this.purchaseOrderStatus = purchaseOrderStatus;
   }

   @JsonProperty("purchaseOrderStatus")
   public Integer getPurchaseOrderStatus() {
      return this.purchaseOrderStatus;
   }

   @JsonProperty("feedbackMsg")
   public void setFeedbackMsg(String feedbackMsg) {
      this.feedbackMsg = feedbackMsg;
   }

   @JsonProperty("feedbackMsg")
   public String getFeedbackMsg() {
      return this.feedbackMsg;
   }

   @JsonProperty("orderSku")
   public void setOrderSku(OrderSku orderSku) {
      this.orderSku = orderSku;
   }

   @JsonProperty("orderSku")
   public OrderSku getOrderSku() {
      return this.orderSku;
   }

   @JsonProperty("sellerShopName")
   public void setSellerShopName(String sellerShopName) {
      this.sellerShopName = sellerShopName;
   }

   @JsonProperty("sellerShopName")
   public String getSellerShopName() {
      return this.sellerShopName;
   }

   @JsonProperty("sellerId")
   public void setSellerId(Integer sellerId) {
      this.sellerId = sellerId;
   }

   @JsonProperty("sellerId")
   public Integer getSellerId() {
      return this.sellerId;
   }

   @JsonProperty("created")
   public void setCreated(Date created) {
      this.created = created;
   }

   @JsonProperty("created")
   public Date getCreated() {
      return this.created;
   }

   @JsonProperty("applyTime")
   public void setApplyTime(String applyTime) {
      this.applyTime = applyTime;
   }

   @JsonProperty("applyTime")
   public String getApplyTime() {
      return this.applyTime;
   }

   @JsonProperty("dealTime")
   public void setDealTime(String dealTime) {
      this.dealTime = dealTime;
   }

   @JsonProperty("dealTime")
   public String getDealTime() {
      return this.dealTime;
   }

   @JsonProperty("serviceStatus")
   public void setServiceStatus(Integer serviceStatus) {
      this.serviceStatus = serviceStatus;
   }

   @JsonProperty("serviceStatus")
   public Integer getServiceStatus() {
      return this.serviceStatus;
   }

   @JsonProperty("updateTime")
   public void setUpdateTime(Date updateTime) {
      this.updateTime = updateTime;
   }

   @JsonProperty("updateTime")
   public Date getUpdateTime() {
      return this.updateTime;
   }
}
