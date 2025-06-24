package com.jd.open.api.sdk.domain.youE.OrderQueryJsfService.response.queryUnHandleOrders;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;

public class ProgressInfo implements Serializable {
   private String productSn;
   private Integer inOrOut;
   private String failureName;
   private String deliverCompany;
   private String deliverNo;
   private String deliverArriveDate;
   private Integer verifyCodeFlag;
   private Integer isFreeInstall;
   private String reserveDeliverTime;
   private String reserveSetupTime;
   private String orderExpectedReceiptTime;
   private String deviceProperty;
   private String engineerId;
   private String engineerName;
   private String engineerMobile;
   private String siteId;
   private String userMobile;
   private Date phoneBindTimeout;
   private String wishBookDate;
   private String siteName;
   private Integer installRule;
   private String deviceInfo;
   private String invoiceInfo;
   private Integer isSettleBill;
   private Integer isDelivery;
   private Integer isPackagePurchase;
   private String afterSalesOrderId;
   private String reserveDateBegin;
   private String reserveDateEnd;
   private String afterSalesApplyDate;
   private String onePriceService;
   private Integer skuFlag;
   private String userRealMobile;
   private String extFields;
   private String recycleOrderNo;
   private Integer modelCode;
   private Integer reservationType;
   private Integer isVerification;
   private String failureCode;
   private String storesName;
   private String venderId;
   private String venderName;
   private Integer skuMode;
   private String purchaserId;
   private String purchaserName;

   @JsonProperty("productSn")
   public void setProductSn(String productSn) {
      this.productSn = productSn;
   }

   @JsonProperty("productSn")
   public String getProductSn() {
      return this.productSn;
   }

   @JsonProperty("inOrOut")
   public void setInOrOut(Integer inOrOut) {
      this.inOrOut = inOrOut;
   }

   @JsonProperty("inOrOut")
   public Integer getInOrOut() {
      return this.inOrOut;
   }

   @JsonProperty("failureName")
   public void setFailureName(String failureName) {
      this.failureName = failureName;
   }

   @JsonProperty("failureName")
   public String getFailureName() {
      return this.failureName;
   }

   @JsonProperty("deliverCompany")
   public void setDeliverCompany(String deliverCompany) {
      this.deliverCompany = deliverCompany;
   }

   @JsonProperty("deliverCompany")
   public String getDeliverCompany() {
      return this.deliverCompany;
   }

   @JsonProperty("deliverNo")
   public void setDeliverNo(String deliverNo) {
      this.deliverNo = deliverNo;
   }

   @JsonProperty("deliverNo")
   public String getDeliverNo() {
      return this.deliverNo;
   }

   @JsonProperty("deliverArriveDate")
   public void setDeliverArriveDate(String deliverArriveDate) {
      this.deliverArriveDate = deliverArriveDate;
   }

   @JsonProperty("deliverArriveDate")
   public String getDeliverArriveDate() {
      return this.deliverArriveDate;
   }

   @JsonProperty("verifyCodeFlag")
   public void setVerifyCodeFlag(Integer verifyCodeFlag) {
      this.verifyCodeFlag = verifyCodeFlag;
   }

   @JsonProperty("verifyCodeFlag")
   public Integer getVerifyCodeFlag() {
      return this.verifyCodeFlag;
   }

   @JsonProperty("isFreeInstall")
   public void setIsFreeInstall(Integer isFreeInstall) {
      this.isFreeInstall = isFreeInstall;
   }

   @JsonProperty("isFreeInstall")
   public Integer getIsFreeInstall() {
      return this.isFreeInstall;
   }

   @JsonProperty("reserveDeliverTime")
   public void setReserveDeliverTime(String reserveDeliverTime) {
      this.reserveDeliverTime = reserveDeliverTime;
   }

   @JsonProperty("reserveDeliverTime")
   public String getReserveDeliverTime() {
      return this.reserveDeliverTime;
   }

   @JsonProperty("reserveSetupTime")
   public void setReserveSetupTime(String reserveSetupTime) {
      this.reserveSetupTime = reserveSetupTime;
   }

   @JsonProperty("reserveSetupTime")
   public String getReserveSetupTime() {
      return this.reserveSetupTime;
   }

   @JsonProperty("orderExpectedReceiptTime")
   public void setOrderExpectedReceiptTime(String orderExpectedReceiptTime) {
      this.orderExpectedReceiptTime = orderExpectedReceiptTime;
   }

   @JsonProperty("orderExpectedReceiptTime")
   public String getOrderExpectedReceiptTime() {
      return this.orderExpectedReceiptTime;
   }

   @JsonProperty("deviceProperty")
   public void setDeviceProperty(String deviceProperty) {
      this.deviceProperty = deviceProperty;
   }

   @JsonProperty("deviceProperty")
   public String getDeviceProperty() {
      return this.deviceProperty;
   }

   @JsonProperty("engineerId")
   public void setEngineerId(String engineerId) {
      this.engineerId = engineerId;
   }

   @JsonProperty("engineerId")
   public String getEngineerId() {
      return this.engineerId;
   }

   @JsonProperty("engineerName")
   public void setEngineerName(String engineerName) {
      this.engineerName = engineerName;
   }

   @JsonProperty("engineerName")
   public String getEngineerName() {
      return this.engineerName;
   }

   @JsonProperty("engineerMobile")
   public void setEngineerMobile(String engineerMobile) {
      this.engineerMobile = engineerMobile;
   }

   @JsonProperty("engineerMobile")
   public String getEngineerMobile() {
      return this.engineerMobile;
   }

   @JsonProperty("siteId")
   public void setSiteId(String siteId) {
      this.siteId = siteId;
   }

   @JsonProperty("siteId")
   public String getSiteId() {
      return this.siteId;
   }

   @JsonProperty("userMobile")
   public void setUserMobile(String userMobile) {
      this.userMobile = userMobile;
   }

   @JsonProperty("userMobile")
   public String getUserMobile() {
      return this.userMobile;
   }

   @JsonProperty("phoneBindTimeout")
   public void setPhoneBindTimeout(Date phoneBindTimeout) {
      this.phoneBindTimeout = phoneBindTimeout;
   }

   @JsonProperty("phoneBindTimeout")
   public Date getPhoneBindTimeout() {
      return this.phoneBindTimeout;
   }

   @JsonProperty("wishBookDate")
   public void setWishBookDate(String wishBookDate) {
      this.wishBookDate = wishBookDate;
   }

   @JsonProperty("wishBookDate")
   public String getWishBookDate() {
      return this.wishBookDate;
   }

   @JsonProperty("siteName")
   public void setSiteName(String siteName) {
      this.siteName = siteName;
   }

   @JsonProperty("siteName")
   public String getSiteName() {
      return this.siteName;
   }

   @JsonProperty("installRule")
   public void setInstallRule(Integer installRule) {
      this.installRule = installRule;
   }

   @JsonProperty("installRule")
   public Integer getInstallRule() {
      return this.installRule;
   }

   @JsonProperty("deviceInfo")
   public void setDeviceInfo(String deviceInfo) {
      this.deviceInfo = deviceInfo;
   }

   @JsonProperty("deviceInfo")
   public String getDeviceInfo() {
      return this.deviceInfo;
   }

   @JsonProperty("invoiceInfo")
   public void setInvoiceInfo(String invoiceInfo) {
      this.invoiceInfo = invoiceInfo;
   }

   @JsonProperty("invoiceInfo")
   public String getInvoiceInfo() {
      return this.invoiceInfo;
   }

   @JsonProperty("isSettleBill")
   public void setIsSettleBill(Integer isSettleBill) {
      this.isSettleBill = isSettleBill;
   }

   @JsonProperty("isSettleBill")
   public Integer getIsSettleBill() {
      return this.isSettleBill;
   }

   @JsonProperty("isDelivery")
   public void setIsDelivery(Integer isDelivery) {
      this.isDelivery = isDelivery;
   }

   @JsonProperty("isDelivery")
   public Integer getIsDelivery() {
      return this.isDelivery;
   }

   @JsonProperty("isPackagePurchase")
   public void setIsPackagePurchase(Integer isPackagePurchase) {
      this.isPackagePurchase = isPackagePurchase;
   }

   @JsonProperty("isPackagePurchase")
   public Integer getIsPackagePurchase() {
      return this.isPackagePurchase;
   }

   @JsonProperty("afterSalesOrderId")
   public void setAfterSalesOrderId(String afterSalesOrderId) {
      this.afterSalesOrderId = afterSalesOrderId;
   }

   @JsonProperty("afterSalesOrderId")
   public String getAfterSalesOrderId() {
      return this.afterSalesOrderId;
   }

   @JsonProperty("reserveDateBegin")
   public void setReserveDateBegin(String reserveDateBegin) {
      this.reserveDateBegin = reserveDateBegin;
   }

   @JsonProperty("reserveDateBegin")
   public String getReserveDateBegin() {
      return this.reserveDateBegin;
   }

   @JsonProperty("reserveDateEnd")
   public void setReserveDateEnd(String reserveDateEnd) {
      this.reserveDateEnd = reserveDateEnd;
   }

   @JsonProperty("reserveDateEnd")
   public String getReserveDateEnd() {
      return this.reserveDateEnd;
   }

   @JsonProperty("afterSalesApplyDate")
   public void setAfterSalesApplyDate(String afterSalesApplyDate) {
      this.afterSalesApplyDate = afterSalesApplyDate;
   }

   @JsonProperty("afterSalesApplyDate")
   public String getAfterSalesApplyDate() {
      return this.afterSalesApplyDate;
   }

   @JsonProperty("onePriceService")
   public void setOnePriceService(String onePriceService) {
      this.onePriceService = onePriceService;
   }

   @JsonProperty("onePriceService")
   public String getOnePriceService() {
      return this.onePriceService;
   }

   @JsonProperty("skuFlag")
   public void setSkuFlag(Integer skuFlag) {
      this.skuFlag = skuFlag;
   }

   @JsonProperty("skuFlag")
   public Integer getSkuFlag() {
      return this.skuFlag;
   }

   @JsonProperty("userRealMobile")
   public void setUserRealMobile(String userRealMobile) {
      this.userRealMobile = userRealMobile;
   }

   @JsonProperty("userRealMobile")
   public String getUserRealMobile() {
      return this.userRealMobile;
   }

   @JsonProperty("extFields")
   public void setExtFields(String extFields) {
      this.extFields = extFields;
   }

   @JsonProperty("extFields")
   public String getExtFields() {
      return this.extFields;
   }

   @JsonProperty("recycleOrderNo")
   public void setRecycleOrderNo(String recycleOrderNo) {
      this.recycleOrderNo = recycleOrderNo;
   }

   @JsonProperty("recycleOrderNo")
   public String getRecycleOrderNo() {
      return this.recycleOrderNo;
   }

   @JsonProperty("modelCode")
   public void setModelCode(Integer modelCode) {
      this.modelCode = modelCode;
   }

   @JsonProperty("modelCode")
   public Integer getModelCode() {
      return this.modelCode;
   }

   @JsonProperty("reservationType")
   public void setReservationType(Integer reservationType) {
      this.reservationType = reservationType;
   }

   @JsonProperty("reservationType")
   public Integer getReservationType() {
      return this.reservationType;
   }

   @JsonProperty("isVerification")
   public void setIsVerification(Integer isVerification) {
      this.isVerification = isVerification;
   }

   @JsonProperty("isVerification")
   public Integer getIsVerification() {
      return this.isVerification;
   }

   @JsonProperty("failureCode")
   public void setFailureCode(String failureCode) {
      this.failureCode = failureCode;
   }

   @JsonProperty("failureCode")
   public String getFailureCode() {
      return this.failureCode;
   }

   @JsonProperty("storesName")
   public void setStoresName(String storesName) {
      this.storesName = storesName;
   }

   @JsonProperty("storesName")
   public String getStoresName() {
      return this.storesName;
   }

   @JsonProperty("venderId")
   public void setVenderId(String venderId) {
      this.venderId = venderId;
   }

   @JsonProperty("venderId")
   public String getVenderId() {
      return this.venderId;
   }

   @JsonProperty("venderName")
   public void setVenderName(String venderName) {
      this.venderName = venderName;
   }

   @JsonProperty("venderName")
   public String getVenderName() {
      return this.venderName;
   }

   @JsonProperty("skuMode")
   public void setSkuMode(Integer skuMode) {
      this.skuMode = skuMode;
   }

   @JsonProperty("skuMode")
   public Integer getSkuMode() {
      return this.skuMode;
   }

   @JsonProperty("purchaserId")
   public void setPurchaserId(String purchaserId) {
      this.purchaserId = purchaserId;
   }

   @JsonProperty("purchaserId")
   public String getPurchaserId() {
      return this.purchaserId;
   }

   @JsonProperty("purchaserName")
   public void setPurchaserName(String purchaserName) {
      this.purchaserName = purchaserName;
   }

   @JsonProperty("purchaserName")
   public String getPurchaserName() {
      return this.purchaserName;
   }
}
