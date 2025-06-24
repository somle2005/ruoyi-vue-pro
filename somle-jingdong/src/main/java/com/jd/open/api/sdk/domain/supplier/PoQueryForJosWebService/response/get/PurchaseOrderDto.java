package com.jd.open.api.sdk.domain.supplier.PoQueryForJosWebService.response.get;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class PurchaseOrderDto implements Serializable {
   private Long orderId;
   private Date createdDate;
   private Date completeDate;
   private String providerCode;
   private String providerName;
   private Integer deliverCenterId;
   private String deliverCenterName;
   private BigDecimal totalPrices;
   private String purchaserErpCode;
   private String purchaserName;
   private Boolean isCanConfirm;
   private Integer status;
   private String statusName;
   private Integer accountPeriod;
   private String ou;
   private String ynPaid;
   private String ynContainTax;
   private String chargeTransit;
   private String transitType;
   private Integer arrivalDays;
   private Integer checkType;
   private String checkTypeName;
   private String deliveryAddress;
   private String receiverName;
   private String warehousePhone;
   private String address;
   private Integer purchaseType;
   private String purchaseTypeName;
   private Integer orderType;
   private String orderTypeName;
   private Integer orderAttribute;
   private String orderAttributeName;
   private Integer originalTotalNum;
   private Integer wareVariety;
   private Integer customOrderId;
   private Integer confirmState;
   private String confirmStateName;
   private Integer state;
   private String stateName;

   @JsonProperty("orderId")
   public void setOrderId(Long orderId) {
      this.orderId = orderId;
   }

   @JsonProperty("orderId")
   public Long getOrderId() {
      return this.orderId;
   }

   @JsonProperty("createdDate")
   public void setCreatedDate(Date createdDate) {
      this.createdDate = createdDate;
   }

   @JsonProperty("createdDate")
   public Date getCreatedDate() {
      return this.createdDate;
   }

   @JsonProperty("completeDate")
   public void setCompleteDate(Date completeDate) {
      this.completeDate = completeDate;
   }

   @JsonProperty("completeDate")
   public Date getCompleteDate() {
      return this.completeDate;
   }

   @JsonProperty("providerCode")
   public void setProviderCode(String providerCode) {
      this.providerCode = providerCode;
   }

   @JsonProperty("providerCode")
   public String getProviderCode() {
      return this.providerCode;
   }

   @JsonProperty("providerName")
   public void setProviderName(String providerName) {
      this.providerName = providerName;
   }

   @JsonProperty("providerName")
   public String getProviderName() {
      return this.providerName;
   }

   @JsonProperty("deliverCenterId")
   public void setDeliverCenterId(Integer deliverCenterId) {
      this.deliverCenterId = deliverCenterId;
   }

   @JsonProperty("deliverCenterId")
   public Integer getDeliverCenterId() {
      return this.deliverCenterId;
   }

   @JsonProperty("deliverCenterName")
   public void setDeliverCenterName(String deliverCenterName) {
      this.deliverCenterName = deliverCenterName;
   }

   @JsonProperty("deliverCenterName")
   public String getDeliverCenterName() {
      return this.deliverCenterName;
   }

   @JsonProperty("totalPrices")
   public void setTotalPrices(BigDecimal totalPrices) {
      this.totalPrices = totalPrices;
   }

   @JsonProperty("totalPrices")
   public BigDecimal getTotalPrices() {
      return this.totalPrices;
   }

   @JsonProperty("purchaserErpCode")
   public void setPurchaserErpCode(String purchaserErpCode) {
      this.purchaserErpCode = purchaserErpCode;
   }

   @JsonProperty("purchaserErpCode")
   public String getPurchaserErpCode() {
      return this.purchaserErpCode;
   }

   @JsonProperty("purchaserName")
   public void setPurchaserName(String purchaserName) {
      this.purchaserName = purchaserName;
   }

   @JsonProperty("purchaserName")
   public String getPurchaserName() {
      return this.purchaserName;
   }

   @JsonProperty("isCanConfirm")
   public void setIsCanConfirm(Boolean isCanConfirm) {
      this.isCanConfirm = isCanConfirm;
   }

   @JsonProperty("isCanConfirm")
   public Boolean getIsCanConfirm() {
      return this.isCanConfirm;
   }

   @JsonProperty("status")
   public void setStatus(Integer status) {
      this.status = status;
   }

   @JsonProperty("status")
   public Integer getStatus() {
      return this.status;
   }

   @JsonProperty("statusName")
   public void setStatusName(String statusName) {
      this.statusName = statusName;
   }

   @JsonProperty("statusName")
   public String getStatusName() {
      return this.statusName;
   }

   @JsonProperty("accountPeriod")
   public void setAccountPeriod(Integer accountPeriod) {
      this.accountPeriod = accountPeriod;
   }

   @JsonProperty("accountPeriod")
   public Integer getAccountPeriod() {
      return this.accountPeriod;
   }

   @JsonProperty("ou")
   public void setOu(String ou) {
      this.ou = ou;
   }

   @JsonProperty("ou")
   public String getOu() {
      return this.ou;
   }

   @JsonProperty("ynPaid")
   public void setYnPaid(String ynPaid) {
      this.ynPaid = ynPaid;
   }

   @JsonProperty("ynPaid")
   public String getYnPaid() {
      return this.ynPaid;
   }

   @JsonProperty("ynContainTax")
   public void setYnContainTax(String ynContainTax) {
      this.ynContainTax = ynContainTax;
   }

   @JsonProperty("ynContainTax")
   public String getYnContainTax() {
      return this.ynContainTax;
   }

   @JsonProperty("chargeTransit")
   public void setChargeTransit(String chargeTransit) {
      this.chargeTransit = chargeTransit;
   }

   @JsonProperty("chargeTransit")
   public String getChargeTransit() {
      return this.chargeTransit;
   }

   @JsonProperty("transitType")
   public void setTransitType(String transitType) {
      this.transitType = transitType;
   }

   @JsonProperty("transitType")
   public String getTransitType() {
      return this.transitType;
   }

   @JsonProperty("arrivalDays")
   public void setArrivalDays(Integer arrivalDays) {
      this.arrivalDays = arrivalDays;
   }

   @JsonProperty("arrivalDays")
   public Integer getArrivalDays() {
      return this.arrivalDays;
   }

   @JsonProperty("checkType")
   public void setCheckType(Integer checkType) {
      this.checkType = checkType;
   }

   @JsonProperty("checkType")
   public Integer getCheckType() {
      return this.checkType;
   }

   @JsonProperty("checkTypeName")
   public void setCheckTypeName(String checkTypeName) {
      this.checkTypeName = checkTypeName;
   }

   @JsonProperty("checkTypeName")
   public String getCheckTypeName() {
      return this.checkTypeName;
   }

   @JsonProperty("deliveryAddress")
   public void setDeliveryAddress(String deliveryAddress) {
      this.deliveryAddress = deliveryAddress;
   }

   @JsonProperty("deliveryAddress")
   public String getDeliveryAddress() {
      return this.deliveryAddress;
   }

   @JsonProperty("receiverName")
   public void setReceiverName(String receiverName) {
      this.receiverName = receiverName;
   }

   @JsonProperty("receiverName")
   public String getReceiverName() {
      return this.receiverName;
   }

   @JsonProperty("warehousePhone")
   public void setWarehousePhone(String warehousePhone) {
      this.warehousePhone = warehousePhone;
   }

   @JsonProperty("warehousePhone")
   public String getWarehousePhone() {
      return this.warehousePhone;
   }

   @JsonProperty("address")
   public void setAddress(String address) {
      this.address = address;
   }

   @JsonProperty("address")
   public String getAddress() {
      return this.address;
   }

   @JsonProperty("purchaseType")
   public void setPurchaseType(Integer purchaseType) {
      this.purchaseType = purchaseType;
   }

   @JsonProperty("purchaseType")
   public Integer getPurchaseType() {
      return this.purchaseType;
   }

   @JsonProperty("purchaseTypeName")
   public void setPurchaseTypeName(String purchaseTypeName) {
      this.purchaseTypeName = purchaseTypeName;
   }

   @JsonProperty("purchaseTypeName")
   public String getPurchaseTypeName() {
      return this.purchaseTypeName;
   }

   @JsonProperty("orderType")
   public void setOrderType(Integer orderType) {
      this.orderType = orderType;
   }

   @JsonProperty("orderType")
   public Integer getOrderType() {
      return this.orderType;
   }

   @JsonProperty("orderTypeName")
   public void setOrderTypeName(String orderTypeName) {
      this.orderTypeName = orderTypeName;
   }

   @JsonProperty("orderTypeName")
   public String getOrderTypeName() {
      return this.orderTypeName;
   }

   @JsonProperty("orderAttribute")
   public void setOrderAttribute(Integer orderAttribute) {
      this.orderAttribute = orderAttribute;
   }

   @JsonProperty("orderAttribute")
   public Integer getOrderAttribute() {
      return this.orderAttribute;
   }

   @JsonProperty("orderAttributeName")
   public void setOrderAttributeName(String orderAttributeName) {
      this.orderAttributeName = orderAttributeName;
   }

   @JsonProperty("orderAttributeName")
   public String getOrderAttributeName() {
      return this.orderAttributeName;
   }

   @JsonProperty("originalTotalNum")
   public void setOriginalTotalNum(Integer originalTotalNum) {
      this.originalTotalNum = originalTotalNum;
   }

   @JsonProperty("originalTotalNum")
   public Integer getOriginalTotalNum() {
      return this.originalTotalNum;
   }

   @JsonProperty("wareVariety")
   public void setWareVariety(Integer wareVariety) {
      this.wareVariety = wareVariety;
   }

   @JsonProperty("wareVariety")
   public Integer getWareVariety() {
      return this.wareVariety;
   }

   @JsonProperty("customOrderId")
   public void setCustomOrderId(Integer customOrderId) {
      this.customOrderId = customOrderId;
   }

   @JsonProperty("customOrderId")
   public Integer getCustomOrderId() {
      return this.customOrderId;
   }

   @JsonProperty("confirmState")
   public void setConfirmState(Integer confirmState) {
      this.confirmState = confirmState;
   }

   @JsonProperty("confirmState")
   public Integer getConfirmState() {
      return this.confirmState;
   }

   @JsonProperty("confirmStateName")
   public void setConfirmStateName(String confirmStateName) {
      this.confirmStateName = confirmStateName;
   }

   @JsonProperty("confirmStateName")
   public String getConfirmStateName() {
      return this.confirmStateName;
   }

   @JsonProperty("state")
   public void setState(Integer state) {
      this.state = state;
   }

   @JsonProperty("state")
   public Integer getState() {
      return this.state;
   }

   @JsonProperty("stateName")
   public void setStateName(String stateName) {
      this.stateName = stateName;
   }

   @JsonProperty("stateName")
   public String getStateName() {
      return this.stateName;
   }
}
