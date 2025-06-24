package com.jd.open.api.sdk.domain.order;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

@JsonFilter("OrderDetailInfo")
public class OrderInfo {
   private String orderId;
   private String venderId;
   private String payType;
   private String orderTotalPrice;
   private String orderSellerPrice;
   private String orderPayment;
   private String freightPrice;
   private String sellerDiscount;
   private String orderState;
   private String orderStateRemark;
   private String deliveryType;
   private String invoiceInfo;
   private String orderRemark;
   private String orderStartTime;
   private String orderEndTime;
   private UserInfo consigneeInfo;
   private List<ItemInfo> itemInfoList;
   private List<CouponDetail> couponDetailList;
   private String venderRemark;
   private String balanceUsed;
   private String pin;
   private String returnOrder;
   private String paymentConfirmTime;
   private String waybill;
   private String logisticsId;
   private VatInvoiceInfo vatInvoiceInfo;
   private String modified;
   private String parentOrderId;
   private String customs;
   private String customsModel;
   private String orderSign;
   private String storeOrder;

   @JsonProperty("store_order")
   public String getStoreOrder() {
      return this.storeOrder;
   }

   @JsonProperty("store_order")
   public void setStoreOrder(String storeOrder) {
      this.storeOrder = storeOrder;
   }

   @JsonProperty("order_sign")
   public String getOrderSign() {
      return this.orderSign;
   }

   @JsonProperty("order_sign")
   public void setOrderSign(String orderSign) {
      this.orderSign = orderSign;
   }

   @JsonProperty("customs")
   public String getCustoms() {
      return this.customs;
   }

   @JsonProperty("customs")
   public void setCustoms(String customs) {
      this.customs = customs;
   }

   @JsonProperty("customs_model")
   public String getCustomsModel() {
      return this.customsModel;
   }

   @JsonProperty("customs_model")
   public void setCustomsModel(String customsModel) {
      this.customsModel = customsModel;
   }

   @JsonProperty("parent_order_id")
   public String getParentOrderId() {
      return this.parentOrderId;
   }

   @JsonProperty("parent_order_id")
   public void setParentOrderId(String parentOrderId) {
      this.parentOrderId = parentOrderId;
   }

   @JsonProperty("modified")
   public String getModified() {
      return this.modified;
   }

   @JsonProperty("modified")
   public void setModified(String modified) {
      this.modified = modified;
   }

   @JsonProperty("waybill")
   public String getWaybill() {
      return this.waybill;
   }

   @JsonProperty("waybill")
   public void setWaybill(String waybill) {
      this.waybill = waybill;
   }

   @JsonProperty("logistics_id")
   public String getLogisticsId() {
      return this.logisticsId;
   }

   @JsonProperty("logistics_id")
   public void setLogisticsId(String logisticsId) {
      this.logisticsId = logisticsId;
   }

   @JsonProperty("vat_invoice_info")
   public VatInvoiceInfo getVatInvoiceInfo() {
      return this.vatInvoiceInfo;
   }

   @JsonProperty("vat_invoice_info")
   public void setVatInvoiceInfo(VatInvoiceInfo vatInvoiceInfo) {
      this.vatInvoiceInfo = vatInvoiceInfo;
   }

   @JsonProperty("payment_confirm_time")
   public String getPaymentConfirmTime() {
      return this.paymentConfirmTime;
   }

   @JsonProperty("payment_confirm_time")
   public void setPaymentConfirmTime(String paymentConfirmTime) {
      this.paymentConfirmTime = paymentConfirmTime;
   }

   @JsonProperty("return_order")
   public String getReturnOrder() {
      return this.returnOrder;
   }

   @JsonProperty("return_order")
   public void setReturnOrder(String returnOrder) {
      this.returnOrder = returnOrder;
   }

   @JsonProperty("pin")
   public String getPin() {
      return this.pin;
   }

   @JsonProperty("pin")
   public void setPin(String pin) {
      this.pin = pin;
   }

   @JsonProperty("balance_used")
   public String getBalanceUsed() {
      return this.balanceUsed;
   }

   @JsonProperty("balance_used")
   public void setBalanceUsed(String balanceUsed) {
      this.balanceUsed = balanceUsed;
   }

   @JsonProperty("order_id")
   public String getOrderId() {
      return this.orderId;
   }

   @JsonProperty("order_id")
   public void setOrderId(String orderId) {
      this.orderId = orderId;
   }

   @JsonProperty("vender_id")
   public String getVenderId() {
      return this.venderId;
   }

   @JsonProperty("vender_id")
   public void setVenderId(String venderId) {
      this.venderId = venderId;
   }

   @JsonProperty("pay_type")
   public String getPayType() {
      return this.payType;
   }

   @JsonProperty("pay_type")
   public void setPayType(String payType) {
      this.payType = payType;
   }

   @JsonProperty("order_total_price")
   public String getOrderTotalPrice() {
      return this.orderTotalPrice;
   }

   @JsonProperty("order_total_price")
   public void setOrderTotalPrice(String orderTotalPrice) {
      this.orderTotalPrice = orderTotalPrice;
   }

   @JsonProperty("order_seller_price")
   public String getOrderSellerPrice() {
      return this.orderSellerPrice;
   }

   @JsonProperty("order_seller_price")
   public void setOrderSellerPrice(String orderSellerPrice) {
      this.orderSellerPrice = orderSellerPrice;
   }

   @JsonProperty("order_payment")
   public String getOrderPayment() {
      return this.orderPayment;
   }

   @JsonProperty("order_payment")
   public void setOrderPayment(String orderPayment) {
      this.orderPayment = orderPayment;
   }

   @JsonProperty("freight_price")
   public String getFreightPrice() {
      return this.freightPrice;
   }

   @JsonProperty("freight_price")
   public void setFreightPrice(String freightPrice) {
      this.freightPrice = freightPrice;
   }

   @JsonProperty("seller_discount")
   public String getSellerDiscount() {
      return this.sellerDiscount;
   }

   @JsonProperty("seller_discount")
   public void setSellerDiscount(String sellerDiscount) {
      this.sellerDiscount = sellerDiscount;
   }

   @JsonProperty("order_state")
   public String getOrderState() {
      return this.orderState;
   }

   @JsonProperty("order_state")
   public void setOrderState(String orderState) {
      this.orderState = orderState;
   }

   @JsonProperty("order_state_remark")
   public String getOrderStateRemark() {
      return this.orderStateRemark;
   }

   @JsonProperty("order_state_remark")
   public void setOrderStateRemark(String orderStateRemark) {
      this.orderStateRemark = orderStateRemark;
   }

   @JsonProperty("delivery_type")
   public String getDeliveryType() {
      return this.deliveryType;
   }

   @JsonProperty("delivery_type")
   public void setDeliveryType(String deliveryType) {
      this.deliveryType = deliveryType;
   }

   @JsonProperty("invoice_info")
   public String getInvoiceInfo() {
      return this.invoiceInfo;
   }

   @JsonProperty("invoice_info")
   public void setInvoiceInfo(String invoiceInfo) {
      this.invoiceInfo = invoiceInfo;
   }

   @JsonProperty("order_remark")
   public String getOrderRemark() {
      return this.orderRemark;
   }

   @JsonProperty("order_remark")
   public void setOrderRemark(String orderRemark) {
      this.orderRemark = orderRemark;
   }

   @JsonProperty("order_start_time")
   public String getOrderStartTime() {
      return this.orderStartTime;
   }

   @JsonProperty("order_start_time")
   public void setOrderStartTime(String orderStartTime) {
      this.orderStartTime = orderStartTime;
   }

   @JsonProperty("order_end_time")
   public String getOrderEndTime() {
      return this.orderEndTime;
   }

   @JsonProperty("order_end_time")
   public void setOrderEndTime(String orderEndTime) {
      this.orderEndTime = orderEndTime;
   }

   @JsonProperty("consignee_info")
   public UserInfo getConsigneeInfo() {
      return this.consigneeInfo;
   }

   @JsonProperty("consignee_info")
   public void setConsigneeInfo(UserInfo consigneeInfo) {
      this.consigneeInfo = consigneeInfo;
   }

   @JsonProperty("item_info_list")
   public List<ItemInfo> getItemInfoList() {
      return this.itemInfoList;
   }

   @JsonProperty("item_info_list")
   public void setItemInfoList(List<ItemInfo> itemInfoList) {
      this.itemInfoList = itemInfoList;
   }

   @JsonProperty("coupon_detail_list")
   public List<CouponDetail> getCouponDetailList() {
      return this.couponDetailList;
   }

   @JsonProperty("coupon_detail_list")
   public void setCouponDetailList(List<CouponDetail> couponDetailList) {
      this.couponDetailList = couponDetailList;
   }

   @JsonProperty("vender_remark")
   public String getVenderRemark() {
      return this.venderRemark;
   }

   @JsonProperty("vender_remark")
   public void setVenderRemark(String venderRemark) {
      this.venderRemark = venderRemark;
   }
}
