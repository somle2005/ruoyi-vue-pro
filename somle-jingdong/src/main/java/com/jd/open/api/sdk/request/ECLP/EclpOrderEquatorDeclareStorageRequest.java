package com.jd.open.api.sdk.request.ECLP;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ECLP.EclpOrderEquatorDeclareStorageResponse;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class EclpOrderEquatorDeclareStorageRequest extends AbstractRequest implements JdRequest<EclpOrderEquatorDeclareStorageResponse> {
   private String isvUUID;
   private String isvSource;
   private String platformId;
   private String platformName;
   private String platformType;
   private String spSoNo;
   private String deptNo;
   private String inJdwms;
   private Date salesPlatformCreateTime;
   private String venderId;
   private String venderName;
   private String consigneeName;
   private String consigneeMobile;
   private String consigneePhone;
   private String consigneeEmail;
   private String consigneeAddress;
   private String consigneePostcode;
   private String consigneeCountry;
   private String addressProvince;
   private String addressCity;
   private String addressCounty;
   private String addressTown;
   private String soType;
   private Date expectDate;
   private String invoiceTitle;
   private String invoiceContent;
   private String declareOrder;
   private String ccProvider;
   private String ccProviderName;
   private String postType;
   private String pattern;
   private String customs;
   private String warehouseNo;
   private String ebpCode;
   private String ebpName;
   private String ebcCode;
   private String ebcName;
   private String delivery;
   private Double discount;
   private String discountNote;
   private String istax;
   private Double taxTotal;
   private Double freight;
   private Double otherPrice;
   private Double goodsValue;
   private Double weight;
   private Double netWeight;
   private String batchNumbers;
   private String buyerRegNo;
   private String buyerPhone;
   private String buyerName;
   private String buyerIdType;
   private String buyerIdNumber;
   private String senderName;
   private String senderCompanyName;
   private String senderCountry;
   private String senderZip;
   private String senderCity;
   private String senderProvince;
   private String senderTel;
   private String senderAddr;
   private String customsRemark;
   private String declarePaymentList;
   private String paymentType;
   private String payCode;
   private String payName;
   private String payTransactionId;
   private String currency;
   private String paymentConfirmTime;
   private Double shouldPay;
   private String receiveNo;
   private String payRemark;
   private String declareWaybill;
   private String logisticsCode;
   private String logisticsName;
   private String bdOwnerNo;
   private String logisticsNo;
   private Integer packNo;
   private String logisticsRemark;
   private int isDelivery;
   private Double receivable;
   private String consigneeRemark;
   private String packageMark;
   private String businessType;
   private String destinationCode;
   private String destinationName;
   private String sendWebsiteCode;
   private String sendWebsiteName;
   private String sendMode;
   private String receiveMode;
   private String appointDeliveryTime;
   private String insuredPriceFlag;
   private Double insuredValue;
   private Double insuredFee;
   private String thirdPayment;
   private String monthlyAccount;
   private String shipment;
   private String sellerRemark;
   private String thirdSite;
   private String shopNo;
   private Byte isSupervise;
   private String initalRequest;
   private String initalResponse;
   private String payTransactionIdYh;
   private String isvParentId;
   private String isvOrderIdList;
   private BigDecimal totalAmount;
   private Byte verDept;
   private Byte payType;
   private String recpAccount;
   private String recpCode;
   private String recpName;
   private String consNameEN;
   private String consAddressEN;
   private String senderNameEN;
   private String senderCityEN;
   private String senderAddrEN;
   private String wrapType;
   private String consigneeIdType;
   private String oaid;
   private String gnum;
   private String isvGoodsNo;
   private String spGoodsNo;
   private String quantity;
   private String price;
   private String goodsRemark;
   private String itemLink;
   private String productionDate;
   private String expirationDate;
   private String packBatchNo;
   private String poNo;
   private String lot;

   public void setIsvUUID(String isvUUID) {
      this.isvUUID = isvUUID;
   }

   public String getIsvUUID() {
      return this.isvUUID;
   }

   public void setIsvSource(String isvSource) {
      this.isvSource = isvSource;
   }

   public String getIsvSource() {
      return this.isvSource;
   }

   public void setPlatformId(String platformId) {
      this.platformId = platformId;
   }

   public String getPlatformId() {
      return this.platformId;
   }

   public void setPlatformName(String platformName) {
      this.platformName = platformName;
   }

   public String getPlatformName() {
      return this.platformName;
   }

   public void setPlatformType(String platformType) {
      this.platformType = platformType;
   }

   public String getPlatformType() {
      return this.platformType;
   }

   public void setSpSoNo(String spSoNo) {
      this.spSoNo = spSoNo;
   }

   public String getSpSoNo() {
      return this.spSoNo;
   }

   public void setDeptNo(String deptNo) {
      this.deptNo = deptNo;
   }

   public String getDeptNo() {
      return this.deptNo;
   }

   public void setInJdwms(String inJdwms) {
      this.inJdwms = inJdwms;
   }

   public String getInJdwms() {
      return this.inJdwms;
   }

   public void setSalesPlatformCreateTime(Date salesPlatformCreateTime) {
      this.salesPlatformCreateTime = salesPlatformCreateTime;
   }

   public Date getSalesPlatformCreateTime() {
      return this.salesPlatformCreateTime;
   }

   public void setVenderId(String venderId) {
      this.venderId = venderId;
   }

   public String getVenderId() {
      return this.venderId;
   }

   public void setVenderName(String venderName) {
      this.venderName = venderName;
   }

   public String getVenderName() {
      return this.venderName;
   }

   public void setConsigneeName(String consigneeName) {
      this.consigneeName = consigneeName;
   }

   public String getConsigneeName() {
      return this.consigneeName;
   }

   public void setConsigneeMobile(String consigneeMobile) {
      this.consigneeMobile = consigneeMobile;
   }

   public String getConsigneeMobile() {
      return this.consigneeMobile;
   }

   public void setConsigneePhone(String consigneePhone) {
      this.consigneePhone = consigneePhone;
   }

   public String getConsigneePhone() {
      return this.consigneePhone;
   }

   public void setConsigneeEmail(String consigneeEmail) {
      this.consigneeEmail = consigneeEmail;
   }

   public String getConsigneeEmail() {
      return this.consigneeEmail;
   }

   public void setConsigneeAddress(String consigneeAddress) {
      this.consigneeAddress = consigneeAddress;
   }

   public String getConsigneeAddress() {
      return this.consigneeAddress;
   }

   public void setConsigneePostcode(String consigneePostcode) {
      this.consigneePostcode = consigneePostcode;
   }

   public String getConsigneePostcode() {
      return this.consigneePostcode;
   }

   public void setConsigneeCountry(String consigneeCountry) {
      this.consigneeCountry = consigneeCountry;
   }

   public String getConsigneeCountry() {
      return this.consigneeCountry;
   }

   public void setAddressProvince(String addressProvince) {
      this.addressProvince = addressProvince;
   }

   public String getAddressProvince() {
      return this.addressProvince;
   }

   public void setAddressCity(String addressCity) {
      this.addressCity = addressCity;
   }

   public String getAddressCity() {
      return this.addressCity;
   }

   public void setAddressCounty(String addressCounty) {
      this.addressCounty = addressCounty;
   }

   public String getAddressCounty() {
      return this.addressCounty;
   }

   public void setAddressTown(String addressTown) {
      this.addressTown = addressTown;
   }

   public String getAddressTown() {
      return this.addressTown;
   }

   public void setSoType(String soType) {
      this.soType = soType;
   }

   public String getSoType() {
      return this.soType;
   }

   public void setExpectDate(Date expectDate) {
      this.expectDate = expectDate;
   }

   public Date getExpectDate() {
      return this.expectDate;
   }

   public void setInvoiceTitle(String invoiceTitle) {
      this.invoiceTitle = invoiceTitle;
   }

   public String getInvoiceTitle() {
      return this.invoiceTitle;
   }

   public void setInvoiceContent(String invoiceContent) {
      this.invoiceContent = invoiceContent;
   }

   public String getInvoiceContent() {
      return this.invoiceContent;
   }

   public void setDeclareOrder(String declareOrder) {
      this.declareOrder = declareOrder;
   }

   public String getDeclareOrder() {
      return this.declareOrder;
   }

   public void setCcProvider(String ccProvider) {
      this.ccProvider = ccProvider;
   }

   public String getCcProvider() {
      return this.ccProvider;
   }

   public void setCcProviderName(String ccProviderName) {
      this.ccProviderName = ccProviderName;
   }

   public String getCcProviderName() {
      return this.ccProviderName;
   }

   public void setPostType(String postType) {
      this.postType = postType;
   }

   public String getPostType() {
      return this.postType;
   }

   public void setPattern(String pattern) {
      this.pattern = pattern;
   }

   public String getPattern() {
      return this.pattern;
   }

   public void setCustoms(String customs) {
      this.customs = customs;
   }

   public String getCustoms() {
      return this.customs;
   }

   public void setWarehouseNo(String warehouseNo) {
      this.warehouseNo = warehouseNo;
   }

   public String getWarehouseNo() {
      return this.warehouseNo;
   }

   public void setEbpCode(String ebpCode) {
      this.ebpCode = ebpCode;
   }

   public String getEbpCode() {
      return this.ebpCode;
   }

   public void setEbpName(String ebpName) {
      this.ebpName = ebpName;
   }

   public String getEbpName() {
      return this.ebpName;
   }

   public void setEbcCode(String ebcCode) {
      this.ebcCode = ebcCode;
   }

   public String getEbcCode() {
      return this.ebcCode;
   }

   public void setEbcName(String ebcName) {
      this.ebcName = ebcName;
   }

   public String getEbcName() {
      return this.ebcName;
   }

   public void setDelivery(String delivery) {
      this.delivery = delivery;
   }

   public String getDelivery() {
      return this.delivery;
   }

   public void setDiscount(Double discount) {
      this.discount = discount;
   }

   public Double getDiscount() {
      return this.discount;
   }

   public void setDiscountNote(String discountNote) {
      this.discountNote = discountNote;
   }

   public String getDiscountNote() {
      return this.discountNote;
   }

   public void setIstax(String istax) {
      this.istax = istax;
   }

   public String getIstax() {
      return this.istax;
   }

   public void setTaxTotal(Double taxTotal) {
      this.taxTotal = taxTotal;
   }

   public Double getTaxTotal() {
      return this.taxTotal;
   }

   public void setFreight(Double freight) {
      this.freight = freight;
   }

   public Double getFreight() {
      return this.freight;
   }

   public void setOtherPrice(Double otherPrice) {
      this.otherPrice = otherPrice;
   }

   public Double getOtherPrice() {
      return this.otherPrice;
   }

   public void setGoodsValue(Double goodsValue) {
      this.goodsValue = goodsValue;
   }

   public Double getGoodsValue() {
      return this.goodsValue;
   }

   public void setWeight(Double weight) {
      this.weight = weight;
   }

   public Double getWeight() {
      return this.weight;
   }

   public void setNetWeight(Double netWeight) {
      this.netWeight = netWeight;
   }

   public Double getNetWeight() {
      return this.netWeight;
   }

   public void setBatchNumbers(String batchNumbers) {
      this.batchNumbers = batchNumbers;
   }

   public String getBatchNumbers() {
      return this.batchNumbers;
   }

   public void setBuyerRegNo(String buyerRegNo) {
      this.buyerRegNo = buyerRegNo;
   }

   public String getBuyerRegNo() {
      return this.buyerRegNo;
   }

   public void setBuyerPhone(String buyerPhone) {
      this.buyerPhone = buyerPhone;
   }

   public String getBuyerPhone() {
      return this.buyerPhone;
   }

   public void setBuyerName(String buyerName) {
      this.buyerName = buyerName;
   }

   public String getBuyerName() {
      return this.buyerName;
   }

   public void setBuyerIdType(String buyerIdType) {
      this.buyerIdType = buyerIdType;
   }

   public String getBuyerIdType() {
      return this.buyerIdType;
   }

   public void setBuyerIdNumber(String buyerIdNumber) {
      this.buyerIdNumber = buyerIdNumber;
   }

   public String getBuyerIdNumber() {
      return this.buyerIdNumber;
   }

   public void setSenderName(String senderName) {
      this.senderName = senderName;
   }

   public String getSenderName() {
      return this.senderName;
   }

   public void setSenderCompanyName(String senderCompanyName) {
      this.senderCompanyName = senderCompanyName;
   }

   public String getSenderCompanyName() {
      return this.senderCompanyName;
   }

   public void setSenderCountry(String senderCountry) {
      this.senderCountry = senderCountry;
   }

   public String getSenderCountry() {
      return this.senderCountry;
   }

   public void setSenderZip(String senderZip) {
      this.senderZip = senderZip;
   }

   public String getSenderZip() {
      return this.senderZip;
   }

   public void setSenderCity(String senderCity) {
      this.senderCity = senderCity;
   }

   public String getSenderCity() {
      return this.senderCity;
   }

   public void setSenderProvince(String senderProvince) {
      this.senderProvince = senderProvince;
   }

   public String getSenderProvince() {
      return this.senderProvince;
   }

   public void setSenderTel(String senderTel) {
      this.senderTel = senderTel;
   }

   public String getSenderTel() {
      return this.senderTel;
   }

   public void setSenderAddr(String senderAddr) {
      this.senderAddr = senderAddr;
   }

   public String getSenderAddr() {
      return this.senderAddr;
   }

   public void setCustomsRemark(String customsRemark) {
      this.customsRemark = customsRemark;
   }

   public String getCustomsRemark() {
      return this.customsRemark;
   }

   public void setDeclarePaymentList(String declarePaymentList) {
      this.declarePaymentList = declarePaymentList;
   }

   public String getDeclarePaymentList() {
      return this.declarePaymentList;
   }

   public void setPaymentType(String paymentType) {
      this.paymentType = paymentType;
   }

   public String getPaymentType() {
      return this.paymentType;
   }

   public void setPayCode(String payCode) {
      this.payCode = payCode;
   }

   public String getPayCode() {
      return this.payCode;
   }

   public void setPayName(String payName) {
      this.payName = payName;
   }

   public String getPayName() {
      return this.payName;
   }

   public void setPayTransactionId(String payTransactionId) {
      this.payTransactionId = payTransactionId;
   }

   public String getPayTransactionId() {
      return this.payTransactionId;
   }

   public void setCurrency(String currency) {
      this.currency = currency;
   }

   public String getCurrency() {
      return this.currency;
   }

   public void setPaymentConfirmTime(String paymentConfirmTime) {
      this.paymentConfirmTime = paymentConfirmTime;
   }

   public String getPaymentConfirmTime() {
      return this.paymentConfirmTime;
   }

   public void setShouldPay(Double shouldPay) {
      this.shouldPay = shouldPay;
   }

   public Double getShouldPay() {
      return this.shouldPay;
   }

   public void setReceiveNo(String receiveNo) {
      this.receiveNo = receiveNo;
   }

   public String getReceiveNo() {
      return this.receiveNo;
   }

   public void setPayRemark(String payRemark) {
      this.payRemark = payRemark;
   }

   public String getPayRemark() {
      return this.payRemark;
   }

   public void setDeclareWaybill(String declareWaybill) {
      this.declareWaybill = declareWaybill;
   }

   public String getDeclareWaybill() {
      return this.declareWaybill;
   }

   public void setLogisticsCode(String logisticsCode) {
      this.logisticsCode = logisticsCode;
   }

   public String getLogisticsCode() {
      return this.logisticsCode;
   }

   public void setLogisticsName(String logisticsName) {
      this.logisticsName = logisticsName;
   }

   public String getLogisticsName() {
      return this.logisticsName;
   }

   public void setBdOwnerNo(String bdOwnerNo) {
      this.bdOwnerNo = bdOwnerNo;
   }

   public String getBdOwnerNo() {
      return this.bdOwnerNo;
   }

   public void setLogisticsNo(String logisticsNo) {
      this.logisticsNo = logisticsNo;
   }

   public String getLogisticsNo() {
      return this.logisticsNo;
   }

   public void setPackNo(Integer packNo) {
      this.packNo = packNo;
   }

   public Integer getPackNo() {
      return this.packNo;
   }

   public void setLogisticsRemark(String logisticsRemark) {
      this.logisticsRemark = logisticsRemark;
   }

   public String getLogisticsRemark() {
      return this.logisticsRemark;
   }

   public void setIsDelivery(int isDelivery) {
      this.isDelivery = isDelivery;
   }

   public int getIsDelivery() {
      return this.isDelivery;
   }

   public void setReceivable(Double receivable) {
      this.receivable = receivable;
   }

   public Double getReceivable() {
      return this.receivable;
   }

   public void setConsigneeRemark(String consigneeRemark) {
      this.consigneeRemark = consigneeRemark;
   }

   public String getConsigneeRemark() {
      return this.consigneeRemark;
   }

   public void setPackageMark(String packageMark) {
      this.packageMark = packageMark;
   }

   public String getPackageMark() {
      return this.packageMark;
   }

   public void setBusinessType(String businessType) {
      this.businessType = businessType;
   }

   public String getBusinessType() {
      return this.businessType;
   }

   public void setDestinationCode(String destinationCode) {
      this.destinationCode = destinationCode;
   }

   public String getDestinationCode() {
      return this.destinationCode;
   }

   public void setDestinationName(String destinationName) {
      this.destinationName = destinationName;
   }

   public String getDestinationName() {
      return this.destinationName;
   }

   public void setSendWebsiteCode(String sendWebsiteCode) {
      this.sendWebsiteCode = sendWebsiteCode;
   }

   public String getSendWebsiteCode() {
      return this.sendWebsiteCode;
   }

   public void setSendWebsiteName(String sendWebsiteName) {
      this.sendWebsiteName = sendWebsiteName;
   }

   public String getSendWebsiteName() {
      return this.sendWebsiteName;
   }

   public void setSendMode(String sendMode) {
      this.sendMode = sendMode;
   }

   public String getSendMode() {
      return this.sendMode;
   }

   public void setReceiveMode(String receiveMode) {
      this.receiveMode = receiveMode;
   }

   public String getReceiveMode() {
      return this.receiveMode;
   }

   public void setAppointDeliveryTime(String appointDeliveryTime) {
      this.appointDeliveryTime = appointDeliveryTime;
   }

   public String getAppointDeliveryTime() {
      return this.appointDeliveryTime;
   }

   public void setInsuredPriceFlag(String insuredPriceFlag) {
      this.insuredPriceFlag = insuredPriceFlag;
   }

   public String getInsuredPriceFlag() {
      return this.insuredPriceFlag;
   }

   public void setInsuredValue(Double insuredValue) {
      this.insuredValue = insuredValue;
   }

   public Double getInsuredValue() {
      return this.insuredValue;
   }

   public void setInsuredFee(Double insuredFee) {
      this.insuredFee = insuredFee;
   }

   public Double getInsuredFee() {
      return this.insuredFee;
   }

   public void setThirdPayment(String thirdPayment) {
      this.thirdPayment = thirdPayment;
   }

   public String getThirdPayment() {
      return this.thirdPayment;
   }

   public void setMonthlyAccount(String monthlyAccount) {
      this.monthlyAccount = monthlyAccount;
   }

   public String getMonthlyAccount() {
      return this.monthlyAccount;
   }

   public void setShipment(String shipment) {
      this.shipment = shipment;
   }

   public String getShipment() {
      return this.shipment;
   }

   public void setSellerRemark(String sellerRemark) {
      this.sellerRemark = sellerRemark;
   }

   public String getSellerRemark() {
      return this.sellerRemark;
   }

   public void setThirdSite(String thirdSite) {
      this.thirdSite = thirdSite;
   }

   public String getThirdSite() {
      return this.thirdSite;
   }

   public void setShopNo(String shopNo) {
      this.shopNo = shopNo;
   }

   public String getShopNo() {
      return this.shopNo;
   }

   public void setIsSupervise(Byte isSupervise) {
      this.isSupervise = isSupervise;
   }

   public Byte getIsSupervise() {
      return this.isSupervise;
   }

   public void setInitalRequest(String initalRequest) {
      this.initalRequest = initalRequest;
   }

   public String getInitalRequest() {
      return this.initalRequest;
   }

   public void setInitalResponse(String initalResponse) {
      this.initalResponse = initalResponse;
   }

   public String getInitalResponse() {
      return this.initalResponse;
   }

   public void setPayTransactionIdYh(String payTransactionIdYh) {
      this.payTransactionIdYh = payTransactionIdYh;
   }

   public String getPayTransactionIdYh() {
      return this.payTransactionIdYh;
   }

   public void setIsvParentId(String isvParentId) {
      this.isvParentId = isvParentId;
   }

   public String getIsvParentId() {
      return this.isvParentId;
   }

   public void setIsvOrderIdList(String isvOrderIdList) {
      this.isvOrderIdList = isvOrderIdList;
   }

   public String getIsvOrderIdList() {
      return this.isvOrderIdList;
   }

   public void setTotalAmount(BigDecimal totalAmount) {
      this.totalAmount = totalAmount;
   }

   public BigDecimal getTotalAmount() {
      return this.totalAmount;
   }

   public void setVerDept(Byte verDept) {
      this.verDept = verDept;
   }

   public Byte getVerDept() {
      return this.verDept;
   }

   public void setPayType(Byte payType) {
      this.payType = payType;
   }

   public Byte getPayType() {
      return this.payType;
   }

   public void setRecpAccount(String recpAccount) {
      this.recpAccount = recpAccount;
   }

   public String getRecpAccount() {
      return this.recpAccount;
   }

   public void setRecpCode(String recpCode) {
      this.recpCode = recpCode;
   }

   public String getRecpCode() {
      return this.recpCode;
   }

   public void setRecpName(String recpName) {
      this.recpName = recpName;
   }

   public String getRecpName() {
      return this.recpName;
   }

   public void setConsNameEN(String consNameEN) {
      this.consNameEN = consNameEN;
   }

   public String getConsNameEN() {
      return this.consNameEN;
   }

   public void setConsAddressEN(String consAddressEN) {
      this.consAddressEN = consAddressEN;
   }

   public String getConsAddressEN() {
      return this.consAddressEN;
   }

   public void setSenderNameEN(String senderNameEN) {
      this.senderNameEN = senderNameEN;
   }

   public String getSenderNameEN() {
      return this.senderNameEN;
   }

   public void setSenderCityEN(String senderCityEN) {
      this.senderCityEN = senderCityEN;
   }

   public String getSenderCityEN() {
      return this.senderCityEN;
   }

   public void setSenderAddrEN(String senderAddrEN) {
      this.senderAddrEN = senderAddrEN;
   }

   public String getSenderAddrEN() {
      return this.senderAddrEN;
   }

   public void setWrapType(String wrapType) {
      this.wrapType = wrapType;
   }

   public String getWrapType() {
      return this.wrapType;
   }

   public void setConsigneeIdType(String consigneeIdType) {
      this.consigneeIdType = consigneeIdType;
   }

   public String getConsigneeIdType() {
      return this.consigneeIdType;
   }

   public void setOaid(String oaid) {
      this.oaid = oaid;
   }

   public String getOaid() {
      return this.oaid;
   }

   public void setGnum(String gnum) {
      this.gnum = gnum;
   }

   public String getGnum() {
      return this.gnum;
   }

   public void setIsvGoodsNo(String isvGoodsNo) {
      this.isvGoodsNo = isvGoodsNo;
   }

   public String getIsvGoodsNo() {
      return this.isvGoodsNo;
   }

   public void setSpGoodsNo(String spGoodsNo) {
      this.spGoodsNo = spGoodsNo;
   }

   public String getSpGoodsNo() {
      return this.spGoodsNo;
   }

   public void setQuantity(String quantity) {
      this.quantity = quantity;
   }

   public String getQuantity() {
      return this.quantity;
   }

   public void setPrice(String price) {
      this.price = price;
   }

   public String getPrice() {
      return this.price;
   }

   public void setGoodsRemark(String goodsRemark) {
      this.goodsRemark = goodsRemark;
   }

   public String getGoodsRemark() {
      return this.goodsRemark;
   }

   public void setItemLink(String itemLink) {
      this.itemLink = itemLink;
   }

   public String getItemLink() {
      return this.itemLink;
   }

   public void setProductionDate(String productionDate) {
      this.productionDate = productionDate;
   }

   public String getProductionDate() {
      return this.productionDate;
   }

   public void setExpirationDate(String expirationDate) {
      this.expirationDate = expirationDate;
   }

   public String getExpirationDate() {
      return this.expirationDate;
   }

   public void setPackBatchNo(String packBatchNo) {
      this.packBatchNo = packBatchNo;
   }

   public String getPackBatchNo() {
      return this.packBatchNo;
   }

   public void setPoNo(String poNo) {
      this.poNo = poNo;
   }

   public String getPoNo() {
      return this.poNo;
   }

   public void setLot(String lot) {
      this.lot = lot;
   }

   public String getLot() {
      return this.lot;
   }

   public String getApiMethod() {
      return "jingdong.eclp.order.equatorDeclareStorage";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("isvUUID", this.isvUUID);
      pmap.put("isvSource", this.isvSource);
      pmap.put("platformId", this.platformId);
      pmap.put("platformName", this.platformName);
      pmap.put("platformType", this.platformType);
      pmap.put("spSoNo", this.spSoNo);
      pmap.put("deptNo", this.deptNo);
      pmap.put("inJdwms", this.inJdwms);

      try {
         if (this.salesPlatformCreateTime != null) {
            pmap.put("salesPlatformCreateTime", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.salesPlatformCreateTime));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      pmap.put("venderId", this.venderId);
      pmap.put("venderName", this.venderName);
      pmap.put("consigneeName", this.consigneeName);
      pmap.put("consigneeMobile", this.consigneeMobile);
      pmap.put("consigneePhone", this.consigneePhone);
      pmap.put("consigneeEmail", this.consigneeEmail);
      pmap.put("consigneeAddress", this.consigneeAddress);
      pmap.put("consigneePostcode", this.consigneePostcode);
      pmap.put("consigneeCountry", this.consigneeCountry);
      pmap.put("addressProvince", this.addressProvince);
      pmap.put("addressCity", this.addressCity);
      pmap.put("addressCounty", this.addressCounty);
      pmap.put("addressTown", this.addressTown);
      pmap.put("soType", this.soType);

      try {
         if (this.expectDate != null) {
            pmap.put("expectDate", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.expectDate));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      pmap.put("invoiceTitle", this.invoiceTitle);
      pmap.put("invoiceContent", this.invoiceContent);
      pmap.put("declareOrder", this.declareOrder);
      pmap.put("ccProvider", this.ccProvider);
      pmap.put("ccProviderName", this.ccProviderName);
      pmap.put("postType", this.postType);
      pmap.put("pattern", this.pattern);
      pmap.put("customs", this.customs);
      pmap.put("warehouseNo", this.warehouseNo);
      pmap.put("ebpCode", this.ebpCode);
      pmap.put("ebpName", this.ebpName);
      pmap.put("ebcCode", this.ebcCode);
      pmap.put("ebcName", this.ebcName);
      pmap.put("delivery", this.delivery);
      pmap.put("discount", this.discount);
      pmap.put("discountNote", this.discountNote);
      pmap.put("istax", this.istax);
      pmap.put("taxTotal", this.taxTotal);
      pmap.put("freight", this.freight);
      pmap.put("otherPrice", this.otherPrice);
      pmap.put("goodsValue", this.goodsValue);
      pmap.put("weight", this.weight);
      pmap.put("netWeight", this.netWeight);
      pmap.put("batchNumbers", this.batchNumbers);
      pmap.put("buyerRegNo", this.buyerRegNo);
      pmap.put("buyerPhone", this.buyerPhone);
      pmap.put("buyerName", this.buyerName);
      pmap.put("buyerIdType", this.buyerIdType);
      pmap.put("buyerIdNumber", this.buyerIdNumber);
      pmap.put("senderName", this.senderName);
      pmap.put("senderCompanyName", this.senderCompanyName);
      pmap.put("senderCountry", this.senderCountry);
      pmap.put("senderZip", this.senderZip);
      pmap.put("senderCity", this.senderCity);
      pmap.put("senderProvince", this.senderProvince);
      pmap.put("senderTel", this.senderTel);
      pmap.put("senderAddr", this.senderAddr);
      pmap.put("customsRemark", this.customsRemark);
      pmap.put("declarePaymentList", this.declarePaymentList);
      pmap.put("paymentType", this.paymentType);
      pmap.put("payCode", this.payCode);
      pmap.put("payName", this.payName);
      pmap.put("payTransactionId", this.payTransactionId);
      pmap.put("currency", this.currency);
      pmap.put("paymentConfirmTime", this.paymentConfirmTime);
      pmap.put("shouldPay", this.shouldPay);
      pmap.put("receiveNo", this.receiveNo);
      pmap.put("payRemark", this.payRemark);
      pmap.put("declareWaybill", this.declareWaybill);
      pmap.put("logisticsCode", this.logisticsCode);
      pmap.put("logisticsName", this.logisticsName);
      pmap.put("bdOwnerNo", this.bdOwnerNo);
      pmap.put("logisticsNo", this.logisticsNo);
      pmap.put("packNo", this.packNo);
      pmap.put("logisticsRemark", this.logisticsRemark);
      pmap.put("isDelivery", this.isDelivery);
      pmap.put("receivable", this.receivable);
      pmap.put("consigneeRemark", this.consigneeRemark);
      pmap.put("packageMark", this.packageMark);
      pmap.put("businessType", this.businessType);
      pmap.put("destinationCode", this.destinationCode);
      pmap.put("destinationName", this.destinationName);
      pmap.put("sendWebsiteCode", this.sendWebsiteCode);
      pmap.put("sendWebsiteName", this.sendWebsiteName);
      pmap.put("sendMode", this.sendMode);
      pmap.put("receiveMode", this.receiveMode);
      pmap.put("appointDeliveryTime", this.appointDeliveryTime);
      pmap.put("insuredPriceFlag", this.insuredPriceFlag);
      pmap.put("insuredValue", this.insuredValue);
      pmap.put("insuredFee", this.insuredFee);
      pmap.put("thirdPayment", this.thirdPayment);
      pmap.put("monthlyAccount", this.monthlyAccount);
      pmap.put("shipment", this.shipment);
      pmap.put("sellerRemark", this.sellerRemark);
      pmap.put("thirdSite", this.thirdSite);
      pmap.put("shopNo", this.shopNo);
      pmap.put("isSupervise", this.isSupervise);
      pmap.put("initalRequest", this.initalRequest);
      pmap.put("initalResponse", this.initalResponse);
      pmap.put("payTransactionIdYh", this.payTransactionIdYh);
      pmap.put("isvParentId", this.isvParentId);
      pmap.put("isvOrderIdList", this.isvOrderIdList);
      pmap.put("totalAmount", this.totalAmount);
      pmap.put("verDept", this.verDept);
      pmap.put("payType", this.payType);
      pmap.put("recpAccount", this.recpAccount);
      pmap.put("recpCode", this.recpCode);
      pmap.put("recpName", this.recpName);
      pmap.put("consNameEN", this.consNameEN);
      pmap.put("consAddressEN", this.consAddressEN);
      pmap.put("senderNameEN", this.senderNameEN);
      pmap.put("senderCityEN", this.senderCityEN);
      pmap.put("senderAddrEN", this.senderAddrEN);
      pmap.put("wrapType", this.wrapType);
      pmap.put("consigneeIdType", this.consigneeIdType);
      pmap.put("oaid", this.oaid);
      pmap.put("gnum", this.gnum);
      pmap.put("isvGoodsNo", this.isvGoodsNo);
      pmap.put("spGoodsNo", this.spGoodsNo);
      pmap.put("quantity", this.quantity);
      pmap.put("price", this.price);
      pmap.put("goodsRemark", this.goodsRemark);
      pmap.put("itemLink", this.itemLink);
      pmap.put("productionDate", this.productionDate);
      pmap.put("expirationDate", this.expirationDate);
      pmap.put("packBatchNo", this.packBatchNo);
      pmap.put("poNo", this.poNo);
      pmap.put("lot", this.lot);
      return JsonUtil.toJson(pmap);
   }

   public Class<EclpOrderEquatorDeclareStorageResponse> getResponseClass() {
      return EclpOrderEquatorDeclareStorageResponse.class;
   }
}
