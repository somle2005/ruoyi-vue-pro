package com.jd.open.api.sdk.domain.B2B.OrderMiddleProvider.response.queryOrderList;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class OrderResp implements Serializable {
   private String ENO;
   private Integer orderPlatform;
   private Integer orderSource;
   private String pin;
   private String clientId;
   private Integer orderChannel;
   private Long jdOrderId;
   private String thirdOrderId;
   private Long parentJdOrderId;
   private BigDecimal orderAmount;
   private BigDecimal orderNeedMoney;
   private Integer orderType;
   private Integer orderTier;
   private Integer deliverState;
   private Integer orderState;
   private Integer jdOrderState;
   private Integer priceType;
   private Integer orderBizType;
   private Integer confirmState;
   private Integer submitFlag;
   private String remark;
   private String orderguid;
   private String customerIP;
   private Date createOrderTime;
   private Date submitOrderTime;
   private Date outTime;
   private Date arriveTime;
   private Date completeTime;
   private Date accountCheckingTime;
   private Date cancelTime;
   private String canceledRemark;
   private Integer confirmedBy;
   private BigDecimal freight;
   private BigDecimal jdFreight;
   private String cetusOrgId;
   private Date trackUpdateTime;
   private Integer cetusIndustryId;
   private BigDecimal serviceRate;
   private Long lotteryId;
   private String lotteryContacts;
   private Date jdOrderStateChangetime;
   private Integer orderIndustry;
   private Integer orgId;
   private Date created;
   private Date modified;
   private java.util.Map<String, String> extAttr;
   private OrderConsigneeResp orderConsignee;
   private OrderInvoiceResp orderInvoice;
   private OrderShipmentResp orderShipment;
   private OrderPaymentResp orderPayment;
   private List<OrderSuitResp> orderSuits;
   private List<OrderSkuResp> orderSkus;
   private List<OrderSnapshotResp> snapshots;
   private OrderExtInfoResp orderExtInfoResp;

   @JsonProperty("ENO")
   public void setENO(String ENO) {
      this.ENO = ENO;
   }

   @JsonProperty("ENO")
   public String getENO() {
      return this.ENO;
   }

   @JsonProperty("orderPlatform")
   public void setOrderPlatform(Integer orderPlatform) {
      this.orderPlatform = orderPlatform;
   }

   @JsonProperty("orderPlatform")
   public Integer getOrderPlatform() {
      return this.orderPlatform;
   }

   @JsonProperty("orderSource")
   public void setOrderSource(Integer orderSource) {
      this.orderSource = orderSource;
   }

   @JsonProperty("orderSource")
   public Integer getOrderSource() {
      return this.orderSource;
   }

   @JsonProperty("pin")
   public void setPin(String pin) {
      this.pin = pin;
   }

   @JsonProperty("pin")
   public String getPin() {
      return this.pin;
   }

   @JsonProperty("clientId")
   public void setClientId(String clientId) {
      this.clientId = clientId;
   }

   @JsonProperty("clientId")
   public String getClientId() {
      return this.clientId;
   }

   @JsonProperty("orderChannel")
   public void setOrderChannel(Integer orderChannel) {
      this.orderChannel = orderChannel;
   }

   @JsonProperty("orderChannel")
   public Integer getOrderChannel() {
      return this.orderChannel;
   }

   @JsonProperty("jdOrderId")
   public void setJdOrderId(Long jdOrderId) {
      this.jdOrderId = jdOrderId;
   }

   @JsonProperty("jdOrderId")
   public Long getJdOrderId() {
      return this.jdOrderId;
   }

   @JsonProperty("thirdOrderId")
   public void setThirdOrderId(String thirdOrderId) {
      this.thirdOrderId = thirdOrderId;
   }

   @JsonProperty("thirdOrderId")
   public String getThirdOrderId() {
      return this.thirdOrderId;
   }

   @JsonProperty("parentJdOrderId")
   public void setParentJdOrderId(Long parentJdOrderId) {
      this.parentJdOrderId = parentJdOrderId;
   }

   @JsonProperty("parentJdOrderId")
   public Long getParentJdOrderId() {
      return this.parentJdOrderId;
   }

   @JsonProperty("orderAmount")
   public void setOrderAmount(BigDecimal orderAmount) {
      this.orderAmount = orderAmount;
   }

   @JsonProperty("orderAmount")
   public BigDecimal getOrderAmount() {
      return this.orderAmount;
   }

   @JsonProperty("orderNeedMoney")
   public void setOrderNeedMoney(BigDecimal orderNeedMoney) {
      this.orderNeedMoney = orderNeedMoney;
   }

   @JsonProperty("orderNeedMoney")
   public BigDecimal getOrderNeedMoney() {
      return this.orderNeedMoney;
   }

   @JsonProperty("orderType")
   public void setOrderType(Integer orderType) {
      this.orderType = orderType;
   }

   @JsonProperty("orderType")
   public Integer getOrderType() {
      return this.orderType;
   }

   @JsonProperty("orderTier")
   public void setOrderTier(Integer orderTier) {
      this.orderTier = orderTier;
   }

   @JsonProperty("orderTier")
   public Integer getOrderTier() {
      return this.orderTier;
   }

   @JsonProperty("deliverState")
   public void setDeliverState(Integer deliverState) {
      this.deliverState = deliverState;
   }

   @JsonProperty("deliverState")
   public Integer getDeliverState() {
      return this.deliverState;
   }

   @JsonProperty("orderState")
   public void setOrderState(Integer orderState) {
      this.orderState = orderState;
   }

   @JsonProperty("orderState")
   public Integer getOrderState() {
      return this.orderState;
   }

   @JsonProperty("jdOrderState")
   public void setJdOrderState(Integer jdOrderState) {
      this.jdOrderState = jdOrderState;
   }

   @JsonProperty("jdOrderState")
   public Integer getJdOrderState() {
      return this.jdOrderState;
   }

   @JsonProperty("priceType")
   public void setPriceType(Integer priceType) {
      this.priceType = priceType;
   }

   @JsonProperty("priceType")
   public Integer getPriceType() {
      return this.priceType;
   }

   @JsonProperty("orderBizType")
   public void setOrderBizType(Integer orderBizType) {
      this.orderBizType = orderBizType;
   }

   @JsonProperty("orderBizType")
   public Integer getOrderBizType() {
      return this.orderBizType;
   }

   @JsonProperty("confirmState")
   public void setConfirmState(Integer confirmState) {
      this.confirmState = confirmState;
   }

   @JsonProperty("confirmState")
   public Integer getConfirmState() {
      return this.confirmState;
   }

   @JsonProperty("submitFlag")
   public void setSubmitFlag(Integer submitFlag) {
      this.submitFlag = submitFlag;
   }

   @JsonProperty("submitFlag")
   public Integer getSubmitFlag() {
      return this.submitFlag;
   }

   @JsonProperty("remark")
   public void setRemark(String remark) {
      this.remark = remark;
   }

   @JsonProperty("remark")
   public String getRemark() {
      return this.remark;
   }

   @JsonProperty("orderguid")
   public void setOrderguid(String orderguid) {
      this.orderguid = orderguid;
   }

   @JsonProperty("orderguid")
   public String getOrderguid() {
      return this.orderguid;
   }

   @JsonProperty("customerIP")
   public void setCustomerIP(String customerIP) {
      this.customerIP = customerIP;
   }

   @JsonProperty("customerIP")
   public String getCustomerIP() {
      return this.customerIP;
   }

   @JsonProperty("createOrderTime")
   public void setCreateOrderTime(Date createOrderTime) {
      this.createOrderTime = createOrderTime;
   }

   @JsonProperty("createOrderTime")
   public Date getCreateOrderTime() {
      return this.createOrderTime;
   }

   @JsonProperty("submitOrderTime")
   public void setSubmitOrderTime(Date submitOrderTime) {
      this.submitOrderTime = submitOrderTime;
   }

   @JsonProperty("submitOrderTime")
   public Date getSubmitOrderTime() {
      return this.submitOrderTime;
   }

   @JsonProperty("outTime")
   public void setOutTime(Date outTime) {
      this.outTime = outTime;
   }

   @JsonProperty("outTime")
   public Date getOutTime() {
      return this.outTime;
   }

   @JsonProperty("arriveTime")
   public void setArriveTime(Date arriveTime) {
      this.arriveTime = arriveTime;
   }

   @JsonProperty("arriveTime")
   public Date getArriveTime() {
      return this.arriveTime;
   }

   @JsonProperty("completeTime")
   public void setCompleteTime(Date completeTime) {
      this.completeTime = completeTime;
   }

   @JsonProperty("completeTime")
   public Date getCompleteTime() {
      return this.completeTime;
   }

   @JsonProperty("accountCheckingTime")
   public void setAccountCheckingTime(Date accountCheckingTime) {
      this.accountCheckingTime = accountCheckingTime;
   }

   @JsonProperty("accountCheckingTime")
   public Date getAccountCheckingTime() {
      return this.accountCheckingTime;
   }

   @JsonProperty("cancelTime")
   public void setCancelTime(Date cancelTime) {
      this.cancelTime = cancelTime;
   }

   @JsonProperty("cancelTime")
   public Date getCancelTime() {
      return this.cancelTime;
   }

   @JsonProperty("canceledRemark")
   public void setCanceledRemark(String canceledRemark) {
      this.canceledRemark = canceledRemark;
   }

   @JsonProperty("canceledRemark")
   public String getCanceledRemark() {
      return this.canceledRemark;
   }

   @JsonProperty("confirmedBy")
   public void setConfirmedBy(Integer confirmedBy) {
      this.confirmedBy = confirmedBy;
   }

   @JsonProperty("confirmedBy")
   public Integer getConfirmedBy() {
      return this.confirmedBy;
   }

   @JsonProperty("freight")
   public void setFreight(BigDecimal freight) {
      this.freight = freight;
   }

   @JsonProperty("freight")
   public BigDecimal getFreight() {
      return this.freight;
   }

   @JsonProperty("jdFreight")
   public void setJdFreight(BigDecimal jdFreight) {
      this.jdFreight = jdFreight;
   }

   @JsonProperty("jdFreight")
   public BigDecimal getJdFreight() {
      return this.jdFreight;
   }

   @JsonProperty("cetusOrgId")
   public void setCetusOrgId(String cetusOrgId) {
      this.cetusOrgId = cetusOrgId;
   }

   @JsonProperty("cetusOrgId")
   public String getCetusOrgId() {
      return this.cetusOrgId;
   }

   @JsonProperty("trackUpdateTime")
   public void setTrackUpdateTime(Date trackUpdateTime) {
      this.trackUpdateTime = trackUpdateTime;
   }

   @JsonProperty("trackUpdateTime")
   public Date getTrackUpdateTime() {
      return this.trackUpdateTime;
   }

   @JsonProperty("cetusIndustryId")
   public void setCetusIndustryId(Integer cetusIndustryId) {
      this.cetusIndustryId = cetusIndustryId;
   }

   @JsonProperty("cetusIndustryId")
   public Integer getCetusIndustryId() {
      return this.cetusIndustryId;
   }

   @JsonProperty("serviceRate")
   public void setServiceRate(BigDecimal serviceRate) {
      this.serviceRate = serviceRate;
   }

   @JsonProperty("serviceRate")
   public BigDecimal getServiceRate() {
      return this.serviceRate;
   }

   @JsonProperty("lotteryId")
   public void setLotteryId(Long lotteryId) {
      this.lotteryId = lotteryId;
   }

   @JsonProperty("lotteryId")
   public Long getLotteryId() {
      return this.lotteryId;
   }

   @JsonProperty("lotteryContacts")
   public void setLotteryContacts(String lotteryContacts) {
      this.lotteryContacts = lotteryContacts;
   }

   @JsonProperty("lotteryContacts")
   public String getLotteryContacts() {
      return this.lotteryContacts;
   }

   @JsonProperty("jdOrderStateChangetime")
   public void setJdOrderStateChangetime(Date jdOrderStateChangetime) {
      this.jdOrderStateChangetime = jdOrderStateChangetime;
   }

   @JsonProperty("jdOrderStateChangetime")
   public Date getJdOrderStateChangetime() {
      return this.jdOrderStateChangetime;
   }

   @JsonProperty("orderIndustry")
   public void setOrderIndustry(Integer orderIndustry) {
      this.orderIndustry = orderIndustry;
   }

   @JsonProperty("orderIndustry")
   public Integer getOrderIndustry() {
      return this.orderIndustry;
   }

   @JsonProperty("orgId")
   public void setOrgId(Integer orgId) {
      this.orgId = orgId;
   }

   @JsonProperty("orgId")
   public Integer getOrgId() {
      return this.orgId;
   }

   @JsonProperty("created")
   public void setCreated(Date created) {
      this.created = created;
   }

   @JsonProperty("created")
   public Date getCreated() {
      return this.created;
   }

   @JsonProperty("modified")
   public void setModified(Date modified) {
      this.modified = modified;
   }

   @JsonProperty("modified")
   public Date getModified() {
      return this.modified;
   }

   @JsonProperty("extAttr")
   public void setExtAttr(java.util.Map<String, String> extAttr) {
      this.extAttr = extAttr;
   }

   @JsonProperty("extAttr")
   public java.util.Map<String, String> getExtAttr() {
      return this.extAttr;
   }

   @JsonProperty("orderConsignee")
   public void setOrderConsignee(OrderConsigneeResp orderConsignee) {
      this.orderConsignee = orderConsignee;
   }

   @JsonProperty("orderConsignee")
   public OrderConsigneeResp getOrderConsignee() {
      return this.orderConsignee;
   }

   @JsonProperty("orderInvoice")
   public void setOrderInvoice(OrderInvoiceResp orderInvoice) {
      this.orderInvoice = orderInvoice;
   }

   @JsonProperty("orderInvoice")
   public OrderInvoiceResp getOrderInvoice() {
      return this.orderInvoice;
   }

   @JsonProperty("orderShipment")
   public void setOrderShipment(OrderShipmentResp orderShipment) {
      this.orderShipment = orderShipment;
   }

   @JsonProperty("orderShipment")
   public OrderShipmentResp getOrderShipment() {
      return this.orderShipment;
   }

   @JsonProperty("orderPayment")
   public void setOrderPayment(OrderPaymentResp orderPayment) {
      this.orderPayment = orderPayment;
   }

   @JsonProperty("orderPayment")
   public OrderPaymentResp getOrderPayment() {
      return this.orderPayment;
   }

   @JsonProperty("orderSuits")
   public void setOrderSuits(List<OrderSuitResp> orderSuits) {
      this.orderSuits = orderSuits;
   }

   @JsonProperty("orderSuits")
   public List<OrderSuitResp> getOrderSuits() {
      return this.orderSuits;
   }

   @JsonProperty("orderSkus")
   public void setOrderSkus(List<OrderSkuResp> orderSkus) {
      this.orderSkus = orderSkus;
   }

   @JsonProperty("orderSkus")
   public List<OrderSkuResp> getOrderSkus() {
      return this.orderSkus;
   }

   @JsonProperty("snapshots")
   public void setSnapshots(List<OrderSnapshotResp> snapshots) {
      this.snapshots = snapshots;
   }

   @JsonProperty("snapshots")
   public List<OrderSnapshotResp> getSnapshots() {
      return this.snapshots;
   }

   @JsonProperty("orderExtInfoResp")
   public void setOrderExtInfoResp(OrderExtInfoResp orderExtInfoResp) {
      this.orderExtInfoResp = orderExtInfoResp;
   }

   @JsonProperty("orderExtInfoResp")
   public OrderExtInfoResp getOrderExtInfoResp() {
      return this.orderExtInfoResp;
   }
}
