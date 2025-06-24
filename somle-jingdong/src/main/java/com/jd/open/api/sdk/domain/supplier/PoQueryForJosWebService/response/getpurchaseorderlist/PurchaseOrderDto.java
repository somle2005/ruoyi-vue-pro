package com.jd.open.api.sdk.domain.supplier.PoQueryForJosWebService.response.getpurchaseorderlist;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class PurchaseOrderDto implements Serializable {
   private Long orderId;
   private Date createdDate;
   private String providerCode;
   private String providerName;
   private BigDecimal totalPrice;
   private Integer deliverCenterId;
   private String deliverCenterName;
   private String purchaserName;
   private String purchaserErpCode;
   private Integer status;
   private String statusName;
   private Boolean isEptCustomized;
   private Integer state;
   private String stateName;
   private Date completeDate;
   private Date updateDate;
   private Integer accountPeriod;
   private String receiverName;
   private String warehousePhone;
   private String address;
   private Integer orderType;
   private String orderTypeName;
   private Integer orderAttribute;
   private String orderAttributeName;
   private Integer confirmState;
   private String confirmStateName;
   private Long customOrderId;
   private Integer wareVariety;
   private Date deliveryTime;
   private Boolean isCanConfirm;
   private Integer isExistActualNumDif;
   private Boolean balanceStatus;
   private Date storageTime;
   private Integer tcFlag;
   private String tcFlagName;
   private Date bookTime;
   private String currency;

   @JsonProperty("order_id")
   public void setOrderId(Long orderId) {
      this.orderId = orderId;
   }

   @JsonProperty("order_id")
   public Long getOrderId() {
      return this.orderId;
   }

   @JsonProperty("created_date")
   public void setCreatedDate(Date createdDate) {
      this.createdDate = createdDate;
   }

   @JsonProperty("created_date")
   public Date getCreatedDate() {
      return this.createdDate;
   }

   @JsonProperty("provider_code")
   public void setProviderCode(String providerCode) {
      this.providerCode = providerCode;
   }

   @JsonProperty("provider_code")
   public String getProviderCode() {
      return this.providerCode;
   }

   @JsonProperty("provider_name")
   public void setProviderName(String providerName) {
      this.providerName = providerName;
   }

   @JsonProperty("provider_name")
   public String getProviderName() {
      return this.providerName;
   }

   @JsonProperty("total_price")
   public void setTotalPrice(BigDecimal totalPrice) {
      this.totalPrice = totalPrice;
   }

   @JsonProperty("total_price")
   public BigDecimal getTotalPrice() {
      return this.totalPrice;
   }

   @JsonProperty("deliver_center_id")
   public void setDeliverCenterId(Integer deliverCenterId) {
      this.deliverCenterId = deliverCenterId;
   }

   @JsonProperty("deliver_center_id")
   public Integer getDeliverCenterId() {
      return this.deliverCenterId;
   }

   @JsonProperty("deliver_center_name")
   public void setDeliverCenterName(String deliverCenterName) {
      this.deliverCenterName = deliverCenterName;
   }

   @JsonProperty("deliver_center_name")
   public String getDeliverCenterName() {
      return this.deliverCenterName;
   }

   @JsonProperty("purchaser_name")
   public void setPurchaserName(String purchaserName) {
      this.purchaserName = purchaserName;
   }

   @JsonProperty("purchaser_name")
   public String getPurchaserName() {
      return this.purchaserName;
   }

   @JsonProperty("purchaser_erp_code")
   public void setPurchaserErpCode(String purchaserErpCode) {
      this.purchaserErpCode = purchaserErpCode;
   }

   @JsonProperty("purchaser_erp_code")
   public String getPurchaserErpCode() {
      return this.purchaserErpCode;
   }

   @JsonProperty("status")
   public void setStatus(Integer status) {
      this.status = status;
   }

   @JsonProperty("status")
   public Integer getStatus() {
      return this.status;
   }

   @JsonProperty("status_name")
   public void setStatusName(String statusName) {
      this.statusName = statusName;
   }

   @JsonProperty("status_name")
   public String getStatusName() {
      return this.statusName;
   }

   @JsonProperty("is_ept_customized")
   public void setIsEptCustomized(Boolean isEptCustomized) {
      this.isEptCustomized = isEptCustomized;
   }

   @JsonProperty("is_ept_customized")
   public Boolean getIsEptCustomized() {
      return this.isEptCustomized;
   }

   @JsonProperty("state")
   public void setState(Integer state) {
      this.state = state;
   }

   @JsonProperty("state")
   public Integer getState() {
      return this.state;
   }

   @JsonProperty("state_name")
   public void setStateName(String stateName) {
      this.stateName = stateName;
   }

   @JsonProperty("state_name")
   public String getStateName() {
      return this.stateName;
   }

   @JsonProperty("complete_date")
   public void setCompleteDate(Date completeDate) {
      this.completeDate = completeDate;
   }

   @JsonProperty("complete_date")
   public Date getCompleteDate() {
      return this.completeDate;
   }

   @JsonProperty("update_date")
   public void setUpdateDate(Date updateDate) {
      this.updateDate = updateDate;
   }

   @JsonProperty("update_date")
   public Date getUpdateDate() {
      return this.updateDate;
   }

   @JsonProperty("account_period")
   public void setAccountPeriod(Integer accountPeriod) {
      this.accountPeriod = accountPeriod;
   }

   @JsonProperty("account_period")
   public Integer getAccountPeriod() {
      return this.accountPeriod;
   }

   @JsonProperty("receiver_name")
   public void setReceiverName(String receiverName) {
      this.receiverName = receiverName;
   }

   @JsonProperty("receiver_name")
   public String getReceiverName() {
      return this.receiverName;
   }

   @JsonProperty("warehouse_phone")
   public void setWarehousePhone(String warehousePhone) {
      this.warehousePhone = warehousePhone;
   }

   @JsonProperty("warehouse_phone")
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

   @JsonProperty("order_type")
   public void setOrderType(Integer orderType) {
      this.orderType = orderType;
   }

   @JsonProperty("order_type")
   public Integer getOrderType() {
      return this.orderType;
   }

   @JsonProperty("order_type_name")
   public void setOrderTypeName(String orderTypeName) {
      this.orderTypeName = orderTypeName;
   }

   @JsonProperty("order_type_name")
   public String getOrderTypeName() {
      return this.orderTypeName;
   }

   @JsonProperty("order_attribute")
   public void setOrderAttribute(Integer orderAttribute) {
      this.orderAttribute = orderAttribute;
   }

   @JsonProperty("order_attribute")
   public Integer getOrderAttribute() {
      return this.orderAttribute;
   }

   @JsonProperty("order_attribute_name")
   public void setOrderAttributeName(String orderAttributeName) {
      this.orderAttributeName = orderAttributeName;
   }

   @JsonProperty("order_attribute_name")
   public String getOrderAttributeName() {
      return this.orderAttributeName;
   }

   @JsonProperty("confirm_state")
   public void setConfirmState(Integer confirmState) {
      this.confirmState = confirmState;
   }

   @JsonProperty("confirm_state")
   public Integer getConfirmState() {
      return this.confirmState;
   }

   @JsonProperty("confirm_state_name")
   public void setConfirmStateName(String confirmStateName) {
      this.confirmStateName = confirmStateName;
   }

   @JsonProperty("confirm_state_name")
   public String getConfirmStateName() {
      return this.confirmStateName;
   }

   @JsonProperty("custom_order_id")
   public void setCustomOrderId(Long customOrderId) {
      this.customOrderId = customOrderId;
   }

   @JsonProperty("custom_order_id")
   public Long getCustomOrderId() {
      return this.customOrderId;
   }

   @JsonProperty("ware_variety")
   public void setWareVariety(Integer wareVariety) {
      this.wareVariety = wareVariety;
   }

   @JsonProperty("ware_variety")
   public Integer getWareVariety() {
      return this.wareVariety;
   }

   @JsonProperty("delivery_time")
   public void setDeliveryTime(Date deliveryTime) {
      this.deliveryTime = deliveryTime;
   }

   @JsonProperty("delivery_time")
   public Date getDeliveryTime() {
      return this.deliveryTime;
   }

   @JsonProperty("is_can_confirm")
   public void setIsCanConfirm(Boolean isCanConfirm) {
      this.isCanConfirm = isCanConfirm;
   }

   @JsonProperty("is_can_confirm")
   public Boolean getIsCanConfirm() {
      return this.isCanConfirm;
   }

   @JsonProperty("is_exist_actual_num_dif")
   public void setIsExistActualNumDif(Integer isExistActualNumDif) {
      this.isExistActualNumDif = isExistActualNumDif;
   }

   @JsonProperty("is_exist_actual_num_dif")
   public Integer getIsExistActualNumDif() {
      return this.isExistActualNumDif;
   }

   @JsonProperty("balance_status")
   public void setBalanceStatus(Boolean balanceStatus) {
      this.balanceStatus = balanceStatus;
   }

   @JsonProperty("balance_status")
   public Boolean getBalanceStatus() {
      return this.balanceStatus;
   }

   @JsonProperty("storage_time")
   public void setStorageTime(Date storageTime) {
      this.storageTime = storageTime;
   }

   @JsonProperty("storage_time")
   public Date getStorageTime() {
      return this.storageTime;
   }

   @JsonProperty("tc_flag")
   public void setTcFlag(Integer tcFlag) {
      this.tcFlag = tcFlag;
   }

   @JsonProperty("tc_flag")
   public Integer getTcFlag() {
      return this.tcFlag;
   }

   @JsonProperty("tc_flag_name")
   public void setTcFlagName(String tcFlagName) {
      this.tcFlagName = tcFlagName;
   }

   @JsonProperty("tc_flag_name")
   public String getTcFlagName() {
      return this.tcFlagName;
   }

   @JsonProperty("book_time")
   public void setBookTime(Date bookTime) {
      this.bookTime = bookTime;
   }

   @JsonProperty("book_time")
   public Date getBookTime() {
      return this.bookTime;
   }

   @JsonProperty("currency")
   public void setCurrency(String currency) {
      this.currency = currency;
   }

   @JsonProperty("currency")
   public String getCurrency() {
      return this.currency;
   }
}
