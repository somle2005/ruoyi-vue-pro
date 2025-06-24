package com.jd.open.api.sdk.domain.order.PresaleOrderExportServiceForJOS.response.getPresaleOrderByPage;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class PresaleOrderVO implements Serializable {
   private Long id;
   private String userPin;
   private Long presaleId;
   private Long skuID;
   private Integer skuCount;
   private Long orderId;
   private Long shopID;
   private BigDecimal freight;
   private Integer orderStatus;
   private BigDecimal payBargainReal;
   private BigDecimal payBargainPlan;
   private Date bargainTime;
   private BigDecimal payBalanceReal;
   private BigDecimal payBalancePlan;
   private Date balanceTime;
   private Date createTime;
   private Date updateTime;
   private Integer orderType;
   private Integer yn;
   private Date orderTime;
   private Date balanceEndTimePlan;
   private Integer companyid;
   private BigDecimal yushouPrice;
   private Integer orderPayType;
   private String productName;
   private Date balanceStartTime;
   private Date balanceEndTime;

   @JsonProperty("id")
   public void setId(Long id) {
      this.id = id;
   }

   @JsonProperty("id")
   public Long getId() {
      return this.id;
   }

   @JsonProperty("userPin")
   public void setUserPin(String userPin) {
      this.userPin = userPin;
   }

   @JsonProperty("userPin")
   public String getUserPin() {
      return this.userPin;
   }

   @JsonProperty("presaleId")
   public void setPresaleId(Long presaleId) {
      this.presaleId = presaleId;
   }

   @JsonProperty("presaleId")
   public Long getPresaleId() {
      return this.presaleId;
   }

   @JsonProperty("skuID")
   public void setSkuID(Long skuID) {
      this.skuID = skuID;
   }

   @JsonProperty("skuID")
   public Long getSkuID() {
      return this.skuID;
   }

   @JsonProperty("skuCount")
   public void setSkuCount(Integer skuCount) {
      this.skuCount = skuCount;
   }

   @JsonProperty("skuCount")
   public Integer getSkuCount() {
      return this.skuCount;
   }

   @JsonProperty("orderId")
   public void setOrderId(Long orderId) {
      this.orderId = orderId;
   }

   @JsonProperty("orderId")
   public Long getOrderId() {
      return this.orderId;
   }

   @JsonProperty("shopID")
   public void setShopID(Long shopID) {
      this.shopID = shopID;
   }

   @JsonProperty("shopID")
   public Long getShopID() {
      return this.shopID;
   }

   @JsonProperty("freight")
   public void setFreight(BigDecimal freight) {
      this.freight = freight;
   }

   @JsonProperty("freight")
   public BigDecimal getFreight() {
      return this.freight;
   }

   @JsonProperty("orderStatus")
   public void setOrderStatus(Integer orderStatus) {
      this.orderStatus = orderStatus;
   }

   @JsonProperty("orderStatus")
   public Integer getOrderStatus() {
      return this.orderStatus;
   }

   @JsonProperty("payBargainReal")
   public void setPayBargainReal(BigDecimal payBargainReal) {
      this.payBargainReal = payBargainReal;
   }

   @JsonProperty("payBargainReal")
   public BigDecimal getPayBargainReal() {
      return this.payBargainReal;
   }

   @JsonProperty("payBargainPlan")
   public void setPayBargainPlan(BigDecimal payBargainPlan) {
      this.payBargainPlan = payBargainPlan;
   }

   @JsonProperty("payBargainPlan")
   public BigDecimal getPayBargainPlan() {
      return this.payBargainPlan;
   }

   @JsonProperty("bargainTime")
   public void setBargainTime(Date bargainTime) {
      this.bargainTime = bargainTime;
   }

   @JsonProperty("bargainTime")
   public Date getBargainTime() {
      return this.bargainTime;
   }

   @JsonProperty("payBalanceReal")
   public void setPayBalanceReal(BigDecimal payBalanceReal) {
      this.payBalanceReal = payBalanceReal;
   }

   @JsonProperty("payBalanceReal")
   public BigDecimal getPayBalanceReal() {
      return this.payBalanceReal;
   }

   @JsonProperty("payBalancePlan")
   public void setPayBalancePlan(BigDecimal payBalancePlan) {
      this.payBalancePlan = payBalancePlan;
   }

   @JsonProperty("payBalancePlan")
   public BigDecimal getPayBalancePlan() {
      return this.payBalancePlan;
   }

   @JsonProperty("balanceTime")
   public void setBalanceTime(Date balanceTime) {
      this.balanceTime = balanceTime;
   }

   @JsonProperty("balanceTime")
   public Date getBalanceTime() {
      return this.balanceTime;
   }

   @JsonProperty("createTime")
   public void setCreateTime(Date createTime) {
      this.createTime = createTime;
   }

   @JsonProperty("createTime")
   public Date getCreateTime() {
      return this.createTime;
   }

   @JsonProperty("updateTime")
   public void setUpdateTime(Date updateTime) {
      this.updateTime = updateTime;
   }

   @JsonProperty("updateTime")
   public Date getUpdateTime() {
      return this.updateTime;
   }

   @JsonProperty("orderType")
   public void setOrderType(Integer orderType) {
      this.orderType = orderType;
   }

   @JsonProperty("orderType")
   public Integer getOrderType() {
      return this.orderType;
   }

   @JsonProperty("yn")
   public void setYn(Integer yn) {
      this.yn = yn;
   }

   @JsonProperty("yn")
   public Integer getYn() {
      return this.yn;
   }

   @JsonProperty("orderTime")
   public void setOrderTime(Date orderTime) {
      this.orderTime = orderTime;
   }

   @JsonProperty("orderTime")
   public Date getOrderTime() {
      return this.orderTime;
   }

   @JsonProperty("balanceEndTimePlan")
   public void setBalanceEndTimePlan(Date balanceEndTimePlan) {
      this.balanceEndTimePlan = balanceEndTimePlan;
   }

   @JsonProperty("balanceEndTimePlan")
   public Date getBalanceEndTimePlan() {
      return this.balanceEndTimePlan;
   }

   @JsonProperty("companyid")
   public void setCompanyid(Integer companyid) {
      this.companyid = companyid;
   }

   @JsonProperty("companyid")
   public Integer getCompanyid() {
      return this.companyid;
   }

   @JsonProperty("yushouPrice")
   public void setYushouPrice(BigDecimal yushouPrice) {
      this.yushouPrice = yushouPrice;
   }

   @JsonProperty("yushouPrice")
   public BigDecimal getYushouPrice() {
      return this.yushouPrice;
   }

   @JsonProperty("orderPayType")
   public void setOrderPayType(Integer orderPayType) {
      this.orderPayType = orderPayType;
   }

   @JsonProperty("orderPayType")
   public Integer getOrderPayType() {
      return this.orderPayType;
   }

   @JsonProperty("productName")
   public void setProductName(String productName) {
      this.productName = productName;
   }

   @JsonProperty("productName")
   public String getProductName() {
      return this.productName;
   }

   @JsonProperty("balanceStartTime")
   public void setBalanceStartTime(Date balanceStartTime) {
      this.balanceStartTime = balanceStartTime;
   }

   @JsonProperty("balanceStartTime")
   public Date getBalanceStartTime() {
      return this.balanceStartTime;
   }

   @JsonProperty("balanceEndTime")
   public void setBalanceEndTime(Date balanceEndTime) {
      this.balanceEndTime = balanceEndTime;
   }

   @JsonProperty("balanceEndTime")
   public Date getBalanceEndTime() {
      return this.balanceEndTime;
   }
}
