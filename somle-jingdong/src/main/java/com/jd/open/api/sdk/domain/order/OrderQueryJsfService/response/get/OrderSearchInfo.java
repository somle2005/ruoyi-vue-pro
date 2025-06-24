package com.jd.open.api.sdk.domain.order.OrderQueryJsfService.response.get;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class OrderSearchInfo implements Serializable {
   private String orderId;
   private String venderId;
   private String orderType;
   private String payType;
   private String orderTotalPrice;
   private String orderSellerPrice;
   private String orderPayment;
   private String freightPrice;
   private String sellerDiscount;
   private String orderState;
   private String orderStateRemark;
   private String deliveryType;
   private InvoiceEasyInfo invoiceEasyInfo;
   private String invoiceInfo;
   private String invoiceCode;
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
   private VatIncoiceInfo vatInfo;
   private String modified;
   private String directParentOrderId;
   private String parentOrderId;
   private String customs;
   private String customsModel;
   private String orderSource;
   private String storeOrder;
   private Integer idSopShipmenttype;
   private String scDT;
   private String serviceFee;
   private OrderInfoResultPauseBizInfo pauseBizInfo;
   private String taxFee;
   private String tuiHuoWuYou;
   private String orderSign;
   private String storeId;
   private String menDianId;
   private String mdbStoreId;
   private String salesPin;
   private UserInfo originalConsigneeInfo;
   private String orderExt;
   private Map<String, String> orderMarkDesc;
   private String realPin;
   private String sendpayMap;
   private OutPlatformOrderInfo ctpOrderInfo;
   private List<PartialLogisticsInfoModel> partialLogisticsInfoModel;
   private String popSignMap;
   private String promisePickDate;
   private String opPickDate;
   private String opDeliveredDate;
   private String declarationStatus;
   private String declarationDesc;
   private String totalOriginalPrice;
   private String totalSellerDiscount;
   private String totalSellerReceivable;
   private String shouldPay;
   private String actualPay;
   private String payDiscount;
   private String paymentDetailList;
   private String logisticsExt;
   private Long tradeOrderId;
   private Long tradeVendorId;
   private VenderInfo tradeVenderInfo;
   private String venderRemarkFlagAlias;
   private String venderRemarkLevelFlag;
   private SpecialStatusReasonInfo specialStatusReasonInfo;
   private String openIdBuyer;
   private String xidBuyer;
   private String openIdSeller;
   private String xidSeller;

   @JsonProperty("orderId")
   public void setOrderId(String orderId) {
      this.orderId = orderId;
   }

   @JsonProperty("orderId")
   public String getOrderId() {
      return this.orderId;
   }

   @JsonProperty("venderId")
   public void setVenderId(String venderId) {
      this.venderId = venderId;
   }

   @JsonProperty("venderId")
   public String getVenderId() {
      return this.venderId;
   }

   @JsonProperty("orderType")
   public void setOrderType(String orderType) {
      this.orderType = orderType;
   }

   @JsonProperty("orderType")
   public String getOrderType() {
      return this.orderType;
   }

   @JsonProperty("payType")
   public void setPayType(String payType) {
      this.payType = payType;
   }

   @JsonProperty("payType")
   public String getPayType() {
      return this.payType;
   }

   @JsonProperty("orderTotalPrice")
   public void setOrderTotalPrice(String orderTotalPrice) {
      this.orderTotalPrice = orderTotalPrice;
   }

   @JsonProperty("orderTotalPrice")
   public String getOrderTotalPrice() {
      return this.orderTotalPrice;
   }

   @JsonProperty("orderSellerPrice")
   public void setOrderSellerPrice(String orderSellerPrice) {
      this.orderSellerPrice = orderSellerPrice;
   }

   @JsonProperty("orderSellerPrice")
   public String getOrderSellerPrice() {
      return this.orderSellerPrice;
   }

   @JsonProperty("orderPayment")
   public void setOrderPayment(String orderPayment) {
      this.orderPayment = orderPayment;
   }

   @JsonProperty("orderPayment")
   public String getOrderPayment() {
      return this.orderPayment;
   }

   @JsonProperty("freightPrice")
   public void setFreightPrice(String freightPrice) {
      this.freightPrice = freightPrice;
   }

   @JsonProperty("freightPrice")
   public String getFreightPrice() {
      return this.freightPrice;
   }

   @JsonProperty("sellerDiscount")
   public void setSellerDiscount(String sellerDiscount) {
      this.sellerDiscount = sellerDiscount;
   }

   @JsonProperty("sellerDiscount")
   public String getSellerDiscount() {
      return this.sellerDiscount;
   }

   @JsonProperty("orderState")
   public void setOrderState(String orderState) {
      this.orderState = orderState;
   }

   @JsonProperty("orderState")
   public String getOrderState() {
      return this.orderState;
   }

   @JsonProperty("orderStateRemark")
   public void setOrderStateRemark(String orderStateRemark) {
      this.orderStateRemark = orderStateRemark;
   }

   @JsonProperty("orderStateRemark")
   public String getOrderStateRemark() {
      return this.orderStateRemark;
   }

   @JsonProperty("deliveryType")
   public void setDeliveryType(String deliveryType) {
      this.deliveryType = deliveryType;
   }

   @JsonProperty("deliveryType")
   public String getDeliveryType() {
      return this.deliveryType;
   }

   @JsonProperty("invoiceEasyInfo")
   public void setInvoiceEasyInfo(InvoiceEasyInfo invoiceEasyInfo) {
      this.invoiceEasyInfo = invoiceEasyInfo;
   }

   @JsonProperty("invoiceEasyInfo")
   public InvoiceEasyInfo getInvoiceEasyInfo() {
      return this.invoiceEasyInfo;
   }

   @JsonProperty("invoiceInfo")
   public void setInvoiceInfo(String invoiceInfo) {
      this.invoiceInfo = invoiceInfo;
   }

   @JsonProperty("invoiceInfo")
   public String getInvoiceInfo() {
      return this.invoiceInfo;
   }

   @JsonProperty("invoiceCode")
   public void setInvoiceCode(String invoiceCode) {
      this.invoiceCode = invoiceCode;
   }

   @JsonProperty("invoiceCode")
   public String getInvoiceCode() {
      return this.invoiceCode;
   }

   @JsonProperty("orderRemark")
   public void setOrderRemark(String orderRemark) {
      this.orderRemark = orderRemark;
   }

   @JsonProperty("orderRemark")
   public String getOrderRemark() {
      return this.orderRemark;
   }

   @JsonProperty("orderStartTime")
   public void setOrderStartTime(String orderStartTime) {
      this.orderStartTime = orderStartTime;
   }

   @JsonProperty("orderStartTime")
   public String getOrderStartTime() {
      return this.orderStartTime;
   }

   @JsonProperty("orderEndTime")
   public void setOrderEndTime(String orderEndTime) {
      this.orderEndTime = orderEndTime;
   }

   @JsonProperty("orderEndTime")
   public String getOrderEndTime() {
      return this.orderEndTime;
   }

   @JsonProperty("consigneeInfo")
   public void setConsigneeInfo(UserInfo consigneeInfo) {
      this.consigneeInfo = consigneeInfo;
   }

   @JsonProperty("consigneeInfo")
   public UserInfo getConsigneeInfo() {
      return this.consigneeInfo;
   }

   @JsonProperty("itemInfoList")
   public void setItemInfoList(List<ItemInfo> itemInfoList) {
      this.itemInfoList = itemInfoList;
   }

   @JsonProperty("itemInfoList")
   public List<ItemInfo> getItemInfoList() {
      return this.itemInfoList;
   }

   @JsonProperty("couponDetailList")
   public void setCouponDetailList(List<CouponDetail> couponDetailList) {
      this.couponDetailList = couponDetailList;
   }

   @JsonProperty("couponDetailList")
   public List<CouponDetail> getCouponDetailList() {
      return this.couponDetailList;
   }

   @JsonProperty("venderRemark")
   public void setVenderRemark(String venderRemark) {
      this.venderRemark = venderRemark;
   }

   @JsonProperty("venderRemark")
   public String getVenderRemark() {
      return this.venderRemark;
   }

   @JsonProperty("balanceUsed")
   public void setBalanceUsed(String balanceUsed) {
      this.balanceUsed = balanceUsed;
   }

   @JsonProperty("balanceUsed")
   public String getBalanceUsed() {
      return this.balanceUsed;
   }

   @JsonProperty("pin")
   public void setPin(String pin) {
      this.pin = pin;
   }

   @JsonProperty("pin")
   public String getPin() {
      return this.pin;
   }

   @JsonProperty("returnOrder")
   public void setReturnOrder(String returnOrder) {
      this.returnOrder = returnOrder;
   }

   @JsonProperty("returnOrder")
   public String getReturnOrder() {
      return this.returnOrder;
   }

   @JsonProperty("paymentConfirmTime")
   public void setPaymentConfirmTime(String paymentConfirmTime) {
      this.paymentConfirmTime = paymentConfirmTime;
   }

   @JsonProperty("paymentConfirmTime")
   public String getPaymentConfirmTime() {
      return this.paymentConfirmTime;
   }

   @JsonProperty("waybill")
   public void setWaybill(String waybill) {
      this.waybill = waybill;
   }

   @JsonProperty("waybill")
   public String getWaybill() {
      return this.waybill;
   }

   @JsonProperty("logisticsId")
   public void setLogisticsId(String logisticsId) {
      this.logisticsId = logisticsId;
   }

   @JsonProperty("logisticsId")
   public String getLogisticsId() {
      return this.logisticsId;
   }

   @JsonProperty("vatInfo")
   public void setVatInfo(VatIncoiceInfo vatInfo) {
      this.vatInfo = vatInfo;
   }

   @JsonProperty("vatInfo")
   public VatIncoiceInfo getVatInfo() {
      return this.vatInfo;
   }

   @JsonProperty("modified")
   public void setModified(String modified) {
      this.modified = modified;
   }

   @JsonProperty("modified")
   public String getModified() {
      return this.modified;
   }

   @JsonProperty("directParentOrderId")
   public void setDirectParentOrderId(String directParentOrderId) {
      this.directParentOrderId = directParentOrderId;
   }

   @JsonProperty("directParentOrderId")
   public String getDirectParentOrderId() {
      return this.directParentOrderId;
   }

   @JsonProperty("parentOrderId")
   public void setParentOrderId(String parentOrderId) {
      this.parentOrderId = parentOrderId;
   }

   @JsonProperty("parentOrderId")
   public String getParentOrderId() {
      return this.parentOrderId;
   }

   @JsonProperty("customs")
   public void setCustoms(String customs) {
      this.customs = customs;
   }

   @JsonProperty("customs")
   public String getCustoms() {
      return this.customs;
   }

   @JsonProperty("customsModel")
   public void setCustomsModel(String customsModel) {
      this.customsModel = customsModel;
   }

   @JsonProperty("customsModel")
   public String getCustomsModel() {
      return this.customsModel;
   }

   @JsonProperty("orderSource")
   public void setOrderSource(String orderSource) {
      this.orderSource = orderSource;
   }

   @JsonProperty("orderSource")
   public String getOrderSource() {
      return this.orderSource;
   }

   @JsonProperty("storeOrder")
   public void setStoreOrder(String storeOrder) {
      this.storeOrder = storeOrder;
   }

   @JsonProperty("storeOrder")
   public String getStoreOrder() {
      return this.storeOrder;
   }

   @JsonProperty("idSopShipmenttype")
   public void setIdSopShipmenttype(Integer idSopShipmenttype) {
      this.idSopShipmenttype = idSopShipmenttype;
   }

   @JsonProperty("idSopShipmenttype")
   public Integer getIdSopShipmenttype() {
      return this.idSopShipmenttype;
   }

   @JsonProperty("scDT")
   public void setScDT(String scDT) {
      this.scDT = scDT;
   }

   @JsonProperty("scDT")
   public String getScDT() {
      return this.scDT;
   }

   @JsonProperty("serviceFee")
   public void setServiceFee(String serviceFee) {
      this.serviceFee = serviceFee;
   }

   @JsonProperty("serviceFee")
   public String getServiceFee() {
      return this.serviceFee;
   }

   @JsonProperty("pauseBizInfo")
   public void setPauseBizInfo(OrderInfoResultPauseBizInfo pauseBizInfo) {
      this.pauseBizInfo = pauseBizInfo;
   }

   @JsonProperty("pauseBizInfo")
   public OrderInfoResultPauseBizInfo getPauseBizInfo() {
      return this.pauseBizInfo;
   }

   @JsonProperty("taxFee")
   public void setTaxFee(String taxFee) {
      this.taxFee = taxFee;
   }

   @JsonProperty("taxFee")
   public String getTaxFee() {
      return this.taxFee;
   }

   @JsonProperty("tuiHuoWuYou")
   public void setTuiHuoWuYou(String tuiHuoWuYou) {
      this.tuiHuoWuYou = tuiHuoWuYou;
   }

   @JsonProperty("tuiHuoWuYou")
   public String getTuiHuoWuYou() {
      return this.tuiHuoWuYou;
   }

   @JsonProperty("orderSign")
   public void setOrderSign(String orderSign) {
      this.orderSign = orderSign;
   }

   @JsonProperty("orderSign")
   public String getOrderSign() {
      return this.orderSign;
   }

   @JsonProperty("storeId")
   public void setStoreId(String storeId) {
      this.storeId = storeId;
   }

   @JsonProperty("storeId")
   public String getStoreId() {
      return this.storeId;
   }

   @JsonProperty("menDianId")
   public void setMenDianId(String menDianId) {
      this.menDianId = menDianId;
   }

   @JsonProperty("menDianId")
   public String getMenDianId() {
      return this.menDianId;
   }

   @JsonProperty("mdbStoreId")
   public void setMdbStoreId(String mdbStoreId) {
      this.mdbStoreId = mdbStoreId;
   }

   @JsonProperty("mdbStoreId")
   public String getMdbStoreId() {
      return this.mdbStoreId;
   }

   @JsonProperty("salesPin")
   public void setSalesPin(String salesPin) {
      this.salesPin = salesPin;
   }

   @JsonProperty("salesPin")
   public String getSalesPin() {
      return this.salesPin;
   }

   @JsonProperty("originalConsigneeInfo")
   public void setOriginalConsigneeInfo(UserInfo originalConsigneeInfo) {
      this.originalConsigneeInfo = originalConsigneeInfo;
   }

   @JsonProperty("originalConsigneeInfo")
   public UserInfo getOriginalConsigneeInfo() {
      return this.originalConsigneeInfo;
   }

   @JsonProperty("orderExt")
   public void setOrderExt(String orderExt) {
      this.orderExt = orderExt;
   }

   @JsonProperty("orderExt")
   public String getOrderExt() {
      return this.orderExt;
   }

   @JsonProperty("orderMarkDesc")
   public void setOrderMarkDesc(Map<String, String> orderMarkDesc) {
      this.orderMarkDesc = orderMarkDesc;
   }

   @JsonProperty("orderMarkDesc")
   public Map<String, String> getOrderMarkDesc() {
      return this.orderMarkDesc;
   }

   @JsonProperty("realPin")
   public void setRealPin(String realPin) {
      this.realPin = realPin;
   }

   @JsonProperty("realPin")
   public String getRealPin() {
      return this.realPin;
   }

   @JsonProperty("sendpayMap")
   public void setSendpayMap(String sendpayMap) {
      this.sendpayMap = sendpayMap;
   }

   @JsonProperty("sendpayMap")
   public String getSendpayMap() {
      return this.sendpayMap;
   }

   @JsonProperty("ctpOrderInfo")
   public void setCtpOrderInfo(OutPlatformOrderInfo ctpOrderInfo) {
      this.ctpOrderInfo = ctpOrderInfo;
   }

   @JsonProperty("ctpOrderInfo")
   public OutPlatformOrderInfo getCtpOrderInfo() {
      return this.ctpOrderInfo;
   }

   @JsonProperty("partialLogisticsInfoModel")
   public void setPartialLogisticsInfoModel(List<PartialLogisticsInfoModel> partialLogisticsInfoModel) {
      this.partialLogisticsInfoModel = partialLogisticsInfoModel;
   }

   @JsonProperty("partialLogisticsInfoModel")
   public List<PartialLogisticsInfoModel> getPartialLogisticsInfoModel() {
      return this.partialLogisticsInfoModel;
   }

   @JsonProperty("popSignMap")
   public void setPopSignMap(String popSignMap) {
      this.popSignMap = popSignMap;
   }

   @JsonProperty("popSignMap")
   public String getPopSignMap() {
      return this.popSignMap;
   }

   @JsonProperty("promisePickDate")
   public void setPromisePickDate(String promisePickDate) {
      this.promisePickDate = promisePickDate;
   }

   @JsonProperty("promisePickDate")
   public String getPromisePickDate() {
      return this.promisePickDate;
   }

   @JsonProperty("opPickDate")
   public void setOpPickDate(String opPickDate) {
      this.opPickDate = opPickDate;
   }

   @JsonProperty("opPickDate")
   public String getOpPickDate() {
      return this.opPickDate;
   }

   @JsonProperty("opDeliveredDate")
   public void setOpDeliveredDate(String opDeliveredDate) {
      this.opDeliveredDate = opDeliveredDate;
   }

   @JsonProperty("opDeliveredDate")
   public String getOpDeliveredDate() {
      return this.opDeliveredDate;
   }

   @JsonProperty("declarationStatus")
   public void setDeclarationStatus(String declarationStatus) {
      this.declarationStatus = declarationStatus;
   }

   @JsonProperty("declarationStatus")
   public String getDeclarationStatus() {
      return this.declarationStatus;
   }

   @JsonProperty("declarationDesc")
   public void setDeclarationDesc(String declarationDesc) {
      this.declarationDesc = declarationDesc;
   }

   @JsonProperty("declarationDesc")
   public String getDeclarationDesc() {
      return this.declarationDesc;
   }

   @JsonProperty("totalOriginalPrice")
   public void setTotalOriginalPrice(String totalOriginalPrice) {
      this.totalOriginalPrice = totalOriginalPrice;
   }

   @JsonProperty("totalOriginalPrice")
   public String getTotalOriginalPrice() {
      return this.totalOriginalPrice;
   }

   @JsonProperty("totalSellerDiscount")
   public void setTotalSellerDiscount(String totalSellerDiscount) {
      this.totalSellerDiscount = totalSellerDiscount;
   }

   @JsonProperty("totalSellerDiscount")
   public String getTotalSellerDiscount() {
      return this.totalSellerDiscount;
   }

   @JsonProperty("totalSellerReceivable")
   public void setTotalSellerReceivable(String totalSellerReceivable) {
      this.totalSellerReceivable = totalSellerReceivable;
   }

   @JsonProperty("totalSellerReceivable")
   public String getTotalSellerReceivable() {
      return this.totalSellerReceivable;
   }

   @JsonProperty("shouldPay")
   public void setShouldPay(String shouldPay) {
      this.shouldPay = shouldPay;
   }

   @JsonProperty("shouldPay")
   public String getShouldPay() {
      return this.shouldPay;
   }

   @JsonProperty("actualPay")
   public void setActualPay(String actualPay) {
      this.actualPay = actualPay;
   }

   @JsonProperty("actualPay")
   public String getActualPay() {
      return this.actualPay;
   }

   @JsonProperty("payDiscount")
   public void setPayDiscount(String payDiscount) {
      this.payDiscount = payDiscount;
   }

   @JsonProperty("payDiscount")
   public String getPayDiscount() {
      return this.payDiscount;
   }

   @JsonProperty("paymentDetailList")
   public void setPaymentDetailList(String paymentDetailList) {
      this.paymentDetailList = paymentDetailList;
   }

   @JsonProperty("paymentDetailList")
   public String getPaymentDetailList() {
      return this.paymentDetailList;
   }

   @JsonProperty("logisticsExt")
   public void setLogisticsExt(String logisticsExt) {
      this.logisticsExt = logisticsExt;
   }

   @JsonProperty("logisticsExt")
   public String getLogisticsExt() {
      return this.logisticsExt;
   }

   @JsonProperty("tradeOrderId")
   public void setTradeOrderId(Long tradeOrderId) {
      this.tradeOrderId = tradeOrderId;
   }

   @JsonProperty("tradeOrderId")
   public Long getTradeOrderId() {
      return this.tradeOrderId;
   }

   @JsonProperty("tradeVendorId")
   public void setTradeVendorId(Long tradeVendorId) {
      this.tradeVendorId = tradeVendorId;
   }

   @JsonProperty("tradeVendorId")
   public Long getTradeVendorId() {
      return this.tradeVendorId;
   }

   @JsonProperty("tradeVenderInfo")
   public void setTradeVenderInfo(VenderInfo tradeVenderInfo) {
      this.tradeVenderInfo = tradeVenderInfo;
   }

   @JsonProperty("tradeVenderInfo")
   public VenderInfo getTradeVenderInfo() {
      return this.tradeVenderInfo;
   }

   @JsonProperty("venderRemarkFlagAlias")
   public void setVenderRemarkFlagAlias(String venderRemarkFlagAlias) {
      this.venderRemarkFlagAlias = venderRemarkFlagAlias;
   }

   @JsonProperty("venderRemarkFlagAlias")
   public String getVenderRemarkFlagAlias() {
      return this.venderRemarkFlagAlias;
   }

   @JsonProperty("venderRemarkLevelFlag")
   public void setVenderRemarkLevelFlag(String venderRemarkLevelFlag) {
      this.venderRemarkLevelFlag = venderRemarkLevelFlag;
   }

   @JsonProperty("venderRemarkLevelFlag")
   public String getVenderRemarkLevelFlag() {
      return this.venderRemarkLevelFlag;
   }

   @JsonProperty("specialStatusReasonInfo")
   public void setSpecialStatusReasonInfo(SpecialStatusReasonInfo specialStatusReasonInfo) {
      this.specialStatusReasonInfo = specialStatusReasonInfo;
   }

   @JsonProperty("specialStatusReasonInfo")
   public SpecialStatusReasonInfo getSpecialStatusReasonInfo() {
      return this.specialStatusReasonInfo;
   }

   @JsonProperty("open_id_buyer")
   public void setOpenIdBuyer(String openIdBuyer) {
      this.openIdBuyer = openIdBuyer;
   }

   @JsonProperty("open_id_buyer")
   public String getOpenIdBuyer() {
      return this.openIdBuyer;
   }

   @JsonProperty("xid_buyer")
   public void setXidBuyer(String xidBuyer) {
      this.xidBuyer = xidBuyer;
   }

   @JsonProperty("xid_buyer")
   public String getXidBuyer() {
      return this.xidBuyer;
   }

   @JsonProperty("open_id_seller")
   public void setOpenIdSeller(String openIdSeller) {
      this.openIdSeller = openIdSeller;
   }

   @JsonProperty("open_id_seller")
   public String getOpenIdSeller() {
      return this.openIdSeller;
   }

   @JsonProperty("xid_seller")
   public void setXidSeller(String xidSeller) {
      this.xidSeller = xidSeller;
   }

   @JsonProperty("xid_seller")
   public String getXidSeller() {
      return this.xidSeller;
   }
}
