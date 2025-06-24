package com.jd.open.api.sdk.request.ECLP;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ECLP.EclpOrderAddOrderResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class EclpOrderAddOrderRequest extends AbstractRequest implements JdRequest<EclpOrderAddOrderResponse> {
   private String isvUUID;
   private String isvSource;
   private String shopNo;
   private String bdOwnerNo;
   private String departmentNo;
   private String warehouseNo;
   private String shipperNo;
   private String salesPlatformOrderNo;
   private String salePlatformSource;
   private Date salesPlatformCreateTime;
   private String soType;
   private String consigneeName;
   private String consigneeMobile;
   private String consigneePhone;
   private String consigneeEmail;
   private Date expectDate;
   private String addressProvince;
   private String addressCity;
   private String addressCounty;
   private String addressTown;
   private String consigneeAddress;
   private String consigneePostcode;
   private Double receivable;
   private String consigneeRemark;
   private String orderMark;
   private String thirdWayBill;
   private String packageMark;
   private String businessType;
   private String destinationCode;
   private String destinationName;
   private String sendWebsiteCode;
   private String sendWebsiteName;
   private Byte sendMode;
   private Byte receiveMode;
   private String appointDeliveryTime;
   private Byte insuredPriceFlag;
   private Double insuredValue;
   private Byte thirdPayment;
   private String monthlyAccount;
   private String shipment;
   private String sellerRemark;
   private String thirdSite;
   private String gatherCenterName;
   private String customsStatus;
   private String customerName;
   private String invoiceTitle;
   private String invoiceContent;
   private String goodsType;
   private String goodsLevel;
   private String customsPort;
   private String billType;
   private Double orderPrice;
   private String wlyInfo;
   private String customerId;
   private Integer urgency;
   private String customerNo;
   private String storeName;
   private String invoiceState;
   private String invoiceType;
   private String invoiceNo;
   private String invoiceTax;
   private String bankName;
   private String bankAccount;
   private String address;
   private String phoneNumber;
   private Byte signType;
   private String signIDCode;
   private String supplierNo;
   private String agingType;
   private String sellerNote;
   private String supervisionCode;
   private String invoiceChecker;
   private String paymentType;
   private String saleType;
   private String inStorageNo;
   private Date inStorageTime;
   private String inStorageRemark;
   private String grossReturnName;
   private String grossReturnPhone;
   private String grossReturnMobile;
   private String grossReturnAddress;
   private String isvPackTypeNo;
   private Byte addrAnalysis;
   private String printExtendInfo;
   private String logicParam;
   private String combineNo;
   private String activationService;
   private Integer randomInspection;
   private String VIPDeliWarehouse;
   private String customField;
   private Double longitude;
   private Double latitude;
   private Integer agingProductType;
   private String crossDockPriority;
   private String isvCompanyNo;
   private String orderPriority;
   private String orderBatchNo;
   private Integer orderBatchQty;
   private String productCode;
   private String vehicleType;
   private String isvSoType;
   private String checkDelivery;
   private String isvSoTypeName;
   private Byte quarantineCert;
   private Byte deliveryService;
   private Integer selfDeliverySiteId;
   private Byte deliveryIntoWarehouse;
   private Byte deliveryWarehouseType;
   private Byte unPack;
   private Byte deliveryBeforeCommand;
   private String pickUpCode;
   private String isvShopNo;
   private String expecTransport;
   private String inDependent;
   private String storeBrand;
   private String storeId;
   private String unloadFlag;
   private String relationNo;
   private String deliveryProductCode;
   private String sellerWarehouseNo;
   private Byte peaceMindReceive;
   private Byte yardInner;
   private String warehouseProductNo;
   private String deliveryProductNo;
   private String payTime;
   private String goodsNo;
   private String skuGoodsLevel;
   private String goodsName;
   private String type;
   private String unit;
   private String remark;
   private String rate;
   private String amount;
   private String price;
   private String quantity;
   private String pAttributes;
   private String isvLotattrs;
   private String isvGoodsNo;
   private String installVenderId;
   private String orderLine;
   private String batAttrs;
   private String productionDate;
   private String expirationDate;
   private String packBatchNo;
   private String poNo;
   private String lot;
   private String serialNo;
   private String jdPackageType;
   private String serviceProductJson;
   private String payAmount;
   private String sellerGoodsRemark;
   private String leftExpirationPercent;
   private String leftExpirationPercentOperate;
   private String batAttrRangeJson;
   private String cloudPrintInfoJson;
   private String goodsDiscountPrice;

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

   public void setShopNo(String shopNo) {
      this.shopNo = shopNo;
   }

   public String getShopNo() {
      return this.shopNo;
   }

   public void setBdOwnerNo(String bdOwnerNo) {
      this.bdOwnerNo = bdOwnerNo;
   }

   public String getBdOwnerNo() {
      return this.bdOwnerNo;
   }

   public void setDepartmentNo(String departmentNo) {
      this.departmentNo = departmentNo;
   }

   public String getDepartmentNo() {
      return this.departmentNo;
   }

   public void setWarehouseNo(String warehouseNo) {
      this.warehouseNo = warehouseNo;
   }

   public String getWarehouseNo() {
      return this.warehouseNo;
   }

   public void setShipperNo(String shipperNo) {
      this.shipperNo = shipperNo;
   }

   public String getShipperNo() {
      return this.shipperNo;
   }

   public void setSalesPlatformOrderNo(String salesPlatformOrderNo) {
      this.salesPlatformOrderNo = salesPlatformOrderNo;
   }

   public String getSalesPlatformOrderNo() {
      return this.salesPlatformOrderNo;
   }

   public void setSalePlatformSource(String salePlatformSource) {
      this.salePlatformSource = salePlatformSource;
   }

   public String getSalePlatformSource() {
      return this.salePlatformSource;
   }

   public void setSalesPlatformCreateTime(Date salesPlatformCreateTime) {
      this.salesPlatformCreateTime = salesPlatformCreateTime;
   }

   public Date getSalesPlatformCreateTime() {
      return this.salesPlatformCreateTime;
   }

   public void setSoType(String soType) {
      this.soType = soType;
   }

   public String getSoType() {
      return this.soType;
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

   public void setExpectDate(Date expectDate) {
      this.expectDate = expectDate;
   }

   public Date getExpectDate() {
      return this.expectDate;
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

   public void setOrderMark(String orderMark) {
      this.orderMark = orderMark;
   }

   public String getOrderMark() {
      return this.orderMark;
   }

   public void setThirdWayBill(String thirdWayBill) {
      this.thirdWayBill = thirdWayBill;
   }

   public String getThirdWayBill() {
      return this.thirdWayBill;
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

   public void setSendMode(Byte sendMode) {
      this.sendMode = sendMode;
   }

   public Byte getSendMode() {
      return this.sendMode;
   }

   public void setReceiveMode(Byte receiveMode) {
      this.receiveMode = receiveMode;
   }

   public Byte getReceiveMode() {
      return this.receiveMode;
   }

   public void setAppointDeliveryTime(String appointDeliveryTime) {
      this.appointDeliveryTime = appointDeliveryTime;
   }

   public String getAppointDeliveryTime() {
      return this.appointDeliveryTime;
   }

   public void setInsuredPriceFlag(Byte insuredPriceFlag) {
      this.insuredPriceFlag = insuredPriceFlag;
   }

   public Byte getInsuredPriceFlag() {
      return this.insuredPriceFlag;
   }

   public void setInsuredValue(Double insuredValue) {
      this.insuredValue = insuredValue;
   }

   public Double getInsuredValue() {
      return this.insuredValue;
   }

   public void setThirdPayment(Byte thirdPayment) {
      this.thirdPayment = thirdPayment;
   }

   public Byte getThirdPayment() {
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

   public void setGatherCenterName(String gatherCenterName) {
      this.gatherCenterName = gatherCenterName;
   }

   public String getGatherCenterName() {
      return this.gatherCenterName;
   }

   public void setCustomsStatus(String customsStatus) {
      this.customsStatus = customsStatus;
   }

   public String getCustomsStatus() {
      return this.customsStatus;
   }

   public void setCustomerName(String customerName) {
      this.customerName = customerName;
   }

   public String getCustomerName() {
      return this.customerName;
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

   public void setGoodsType(String goodsType) {
      this.goodsType = goodsType;
   }

   public String getGoodsType() {
      return this.goodsType;
   }

   public void setGoodsLevel(String goodsLevel) {
      this.goodsLevel = goodsLevel;
   }

   public String getGoodsLevel() {
      return this.goodsLevel;
   }

   public void setCustomsPort(String customsPort) {
      this.customsPort = customsPort;
   }

   public String getCustomsPort() {
      return this.customsPort;
   }

   public void setBillType(String billType) {
      this.billType = billType;
   }

   public String getBillType() {
      return this.billType;
   }

   public void setOrderPrice(Double orderPrice) {
      this.orderPrice = orderPrice;
   }

   public Double getOrderPrice() {
      return this.orderPrice;
   }

   public void setWlyInfo(String wlyInfo) {
      this.wlyInfo = wlyInfo;
   }

   public String getWlyInfo() {
      return this.wlyInfo;
   }

   public void setCustomerId(String customerId) {
      this.customerId = customerId;
   }

   public String getCustomerId() {
      return this.customerId;
   }

   public void setUrgency(Integer urgency) {
      this.urgency = urgency;
   }

   public Integer getUrgency() {
      return this.urgency;
   }

   public void setCustomerNo(String customerNo) {
      this.customerNo = customerNo;
   }

   public String getCustomerNo() {
      return this.customerNo;
   }

   public void setStoreName(String storeName) {
      this.storeName = storeName;
   }

   public String getStoreName() {
      return this.storeName;
   }

   public void setInvoiceState(String invoiceState) {
      this.invoiceState = invoiceState;
   }

   public String getInvoiceState() {
      return this.invoiceState;
   }

   public void setInvoiceType(String invoiceType) {
      this.invoiceType = invoiceType;
   }

   public String getInvoiceType() {
      return this.invoiceType;
   }

   public void setInvoiceNo(String invoiceNo) {
      this.invoiceNo = invoiceNo;
   }

   public String getInvoiceNo() {
      return this.invoiceNo;
   }

   public void setInvoiceTax(String invoiceTax) {
      this.invoiceTax = invoiceTax;
   }

   public String getInvoiceTax() {
      return this.invoiceTax;
   }

   public void setBankName(String bankName) {
      this.bankName = bankName;
   }

   public String getBankName() {
      return this.bankName;
   }

   public void setBankAccount(String bankAccount) {
      this.bankAccount = bankAccount;
   }

   public String getBankAccount() {
      return this.bankAccount;
   }

   public void setAddress(String address) {
      this.address = address;
   }

   public String getAddress() {
      return this.address;
   }

   public void setPhoneNumber(String phoneNumber) {
      this.phoneNumber = phoneNumber;
   }

   public String getPhoneNumber() {
      return this.phoneNumber;
   }

   public void setSignType(Byte signType) {
      this.signType = signType;
   }

   public Byte getSignType() {
      return this.signType;
   }

   public void setSignIDCode(String signIDCode) {
      this.signIDCode = signIDCode;
   }

   public String getSignIDCode() {
      return this.signIDCode;
   }

   public void setSupplierNo(String supplierNo) {
      this.supplierNo = supplierNo;
   }

   public String getSupplierNo() {
      return this.supplierNo;
   }

   public void setAgingType(String agingType) {
      this.agingType = agingType;
   }

   public String getAgingType() {
      return this.agingType;
   }

   public void setSellerNote(String sellerNote) {
      this.sellerNote = sellerNote;
   }

   public String getSellerNote() {
      return this.sellerNote;
   }

   public void setSupervisionCode(String supervisionCode) {
      this.supervisionCode = supervisionCode;
   }

   public String getSupervisionCode() {
      return this.supervisionCode;
   }

   public void setInvoiceChecker(String invoiceChecker) {
      this.invoiceChecker = invoiceChecker;
   }

   public String getInvoiceChecker() {
      return this.invoiceChecker;
   }

   public void setPaymentType(String paymentType) {
      this.paymentType = paymentType;
   }

   public String getPaymentType() {
      return this.paymentType;
   }

   public void setSaleType(String saleType) {
      this.saleType = saleType;
   }

   public String getSaleType() {
      return this.saleType;
   }

   public void setInStorageNo(String inStorageNo) {
      this.inStorageNo = inStorageNo;
   }

   public String getInStorageNo() {
      return this.inStorageNo;
   }

   public void setInStorageTime(Date inStorageTime) {
      this.inStorageTime = inStorageTime;
   }

   public Date getInStorageTime() {
      return this.inStorageTime;
   }

   public void setInStorageRemark(String inStorageRemark) {
      this.inStorageRemark = inStorageRemark;
   }

   public String getInStorageRemark() {
      return this.inStorageRemark;
   }

   public void setGrossReturnName(String grossReturnName) {
      this.grossReturnName = grossReturnName;
   }

   public String getGrossReturnName() {
      return this.grossReturnName;
   }

   public void setGrossReturnPhone(String grossReturnPhone) {
      this.grossReturnPhone = grossReturnPhone;
   }

   public String getGrossReturnPhone() {
      return this.grossReturnPhone;
   }

   public void setGrossReturnMobile(String grossReturnMobile) {
      this.grossReturnMobile = grossReturnMobile;
   }

   public String getGrossReturnMobile() {
      return this.grossReturnMobile;
   }

   public void setGrossReturnAddress(String grossReturnAddress) {
      this.grossReturnAddress = grossReturnAddress;
   }

   public String getGrossReturnAddress() {
      return this.grossReturnAddress;
   }

   public void setIsvPackTypeNo(String isvPackTypeNo) {
      this.isvPackTypeNo = isvPackTypeNo;
   }

   public String getIsvPackTypeNo() {
      return this.isvPackTypeNo;
   }

   public void setAddrAnalysis(Byte addrAnalysis) {
      this.addrAnalysis = addrAnalysis;
   }

   public Byte getAddrAnalysis() {
      return this.addrAnalysis;
   }

   public void setPrintExtendInfo(String printExtendInfo) {
      this.printExtendInfo = printExtendInfo;
   }

   public String getPrintExtendInfo() {
      return this.printExtendInfo;
   }

   public void setLogicParam(String logicParam) {
      this.logicParam = logicParam;
   }

   public String getLogicParam() {
      return this.logicParam;
   }

   public void setCombineNo(String combineNo) {
      this.combineNo = combineNo;
   }

   public String getCombineNo() {
      return this.combineNo;
   }

   public void setActivationService(String activationService) {
      this.activationService = activationService;
   }

   public String getActivationService() {
      return this.activationService;
   }

   public void setRandomInspection(Integer randomInspection) {
      this.randomInspection = randomInspection;
   }

   public Integer getRandomInspection() {
      return this.randomInspection;
   }

   public void setVIPDeliWarehouse(String VIPDeliWarehouse) {
      this.VIPDeliWarehouse = VIPDeliWarehouse;
   }

   public String getVIPDeliWarehouse() {
      return this.VIPDeliWarehouse;
   }

   public void setCustomField(String customField) {
      this.customField = customField;
   }

   public String getCustomField() {
      return this.customField;
   }

   public void setLongitude(Double longitude) {
      this.longitude = longitude;
   }

   public Double getLongitude() {
      return this.longitude;
   }

   public void setLatitude(Double latitude) {
      this.latitude = latitude;
   }

   public Double getLatitude() {
      return this.latitude;
   }

   public void setAgingProductType(Integer agingProductType) {
      this.agingProductType = agingProductType;
   }

   public Integer getAgingProductType() {
      return this.agingProductType;
   }

   public void setCrossDockPriority(String crossDockPriority) {
      this.crossDockPriority = crossDockPriority;
   }

   public String getCrossDockPriority() {
      return this.crossDockPriority;
   }

   public void setIsvCompanyNo(String isvCompanyNo) {
      this.isvCompanyNo = isvCompanyNo;
   }

   public String getIsvCompanyNo() {
      return this.isvCompanyNo;
   }

   public void setOrderPriority(String orderPriority) {
      this.orderPriority = orderPriority;
   }

   public String getOrderPriority() {
      return this.orderPriority;
   }

   public void setOrderBatchNo(String orderBatchNo) {
      this.orderBatchNo = orderBatchNo;
   }

   public String getOrderBatchNo() {
      return this.orderBatchNo;
   }

   public void setOrderBatchQty(Integer orderBatchQty) {
      this.orderBatchQty = orderBatchQty;
   }

   public Integer getOrderBatchQty() {
      return this.orderBatchQty;
   }

   public void setProductCode(String productCode) {
      this.productCode = productCode;
   }

   public String getProductCode() {
      return this.productCode;
   }

   public void setVehicleType(String vehicleType) {
      this.vehicleType = vehicleType;
   }

   public String getVehicleType() {
      return this.vehicleType;
   }

   public void setIsvSoType(String isvSoType) {
      this.isvSoType = isvSoType;
   }

   public String getIsvSoType() {
      return this.isvSoType;
   }

   public void setCheckDelivery(String checkDelivery) {
      this.checkDelivery = checkDelivery;
   }

   public String getCheckDelivery() {
      return this.checkDelivery;
   }

   public void setIsvSoTypeName(String isvSoTypeName) {
      this.isvSoTypeName = isvSoTypeName;
   }

   public String getIsvSoTypeName() {
      return this.isvSoTypeName;
   }

   public void setQuarantineCert(Byte quarantineCert) {
      this.quarantineCert = quarantineCert;
   }

   public Byte getQuarantineCert() {
      return this.quarantineCert;
   }

   public void setDeliveryService(Byte deliveryService) {
      this.deliveryService = deliveryService;
   }

   public Byte getDeliveryService() {
      return this.deliveryService;
   }

   public void setSelfDeliverySiteId(Integer selfDeliverySiteId) {
      this.selfDeliverySiteId = selfDeliverySiteId;
   }

   public Integer getSelfDeliverySiteId() {
      return this.selfDeliverySiteId;
   }

   public void setDeliveryIntoWarehouse(Byte deliveryIntoWarehouse) {
      this.deliveryIntoWarehouse = deliveryIntoWarehouse;
   }

   public Byte getDeliveryIntoWarehouse() {
      return this.deliveryIntoWarehouse;
   }

   public void setDeliveryWarehouseType(Byte deliveryWarehouseType) {
      this.deliveryWarehouseType = deliveryWarehouseType;
   }

   public Byte getDeliveryWarehouseType() {
      return this.deliveryWarehouseType;
   }

   public void setUnPack(Byte unPack) {
      this.unPack = unPack;
   }

   public Byte getUnPack() {
      return this.unPack;
   }

   public void setDeliveryBeforeCommand(Byte deliveryBeforeCommand) {
      this.deliveryBeforeCommand = deliveryBeforeCommand;
   }

   public Byte getDeliveryBeforeCommand() {
      return this.deliveryBeforeCommand;
   }

   public void setPickUpCode(String pickUpCode) {
      this.pickUpCode = pickUpCode;
   }

   public String getPickUpCode() {
      return this.pickUpCode;
   }

   public void setIsvShopNo(String isvShopNo) {
      this.isvShopNo = isvShopNo;
   }

   public String getIsvShopNo() {
      return this.isvShopNo;
   }

   public void setExpecTransport(String expecTransport) {
      this.expecTransport = expecTransport;
   }

   public String getExpecTransport() {
      return this.expecTransport;
   }

   public void setInDependent(String inDependent) {
      this.inDependent = inDependent;
   }

   public String getInDependent() {
      return this.inDependent;
   }

   public void setStoreBrand(String storeBrand) {
      this.storeBrand = storeBrand;
   }

   public String getStoreBrand() {
      return this.storeBrand;
   }

   public void setStoreId(String storeId) {
      this.storeId = storeId;
   }

   public String getStoreId() {
      return this.storeId;
   }

   public void setUnloadFlag(String unloadFlag) {
      this.unloadFlag = unloadFlag;
   }

   public String getUnloadFlag() {
      return this.unloadFlag;
   }

   public void setRelationNo(String relationNo) {
      this.relationNo = relationNo;
   }

   public String getRelationNo() {
      return this.relationNo;
   }

   public void setDeliveryProductCode(String deliveryProductCode) {
      this.deliveryProductCode = deliveryProductCode;
   }

   public String getDeliveryProductCode() {
      return this.deliveryProductCode;
   }

   public void setSellerWarehouseNo(String sellerWarehouseNo) {
      this.sellerWarehouseNo = sellerWarehouseNo;
   }

   public String getSellerWarehouseNo() {
      return this.sellerWarehouseNo;
   }

   public void setPeaceMindReceive(Byte peaceMindReceive) {
      this.peaceMindReceive = peaceMindReceive;
   }

   public Byte getPeaceMindReceive() {
      return this.peaceMindReceive;
   }

   public void setYardInner(Byte yardInner) {
      this.yardInner = yardInner;
   }

   public Byte getYardInner() {
      return this.yardInner;
   }

   public void setWarehouseProductNo(String warehouseProductNo) {
      this.warehouseProductNo = warehouseProductNo;
   }

   public String getWarehouseProductNo() {
      return this.warehouseProductNo;
   }

   public void setDeliveryProductNo(String deliveryProductNo) {
      this.deliveryProductNo = deliveryProductNo;
   }

   public String getDeliveryProductNo() {
      return this.deliveryProductNo;
   }

   public void setPayTime(String payTime) {
      this.payTime = payTime;
   }

   public String getPayTime() {
      return this.payTime;
   }

   public void setGoodsNo(String goodsNo) {
      this.goodsNo = goodsNo;
   }

   public String getGoodsNo() {
      return this.goodsNo;
   }

   public void setSkuGoodsLevel(String skuGoodsLevel) {
      this.skuGoodsLevel = skuGoodsLevel;
   }

   public String getSkuGoodsLevel() {
      return this.skuGoodsLevel;
   }

   public void setGoodsName(String goodsName) {
      this.goodsName = goodsName;
   }

   public String getGoodsName() {
      return this.goodsName;
   }

   public void setType(String type) {
      this.type = type;
   }

   public String getType() {
      return this.type;
   }

   public void setUnit(String unit) {
      this.unit = unit;
   }

   public String getUnit() {
      return this.unit;
   }

   public void setRemark(String remark) {
      this.remark = remark;
   }

   public String getRemark() {
      return this.remark;
   }

   public void setRate(String rate) {
      this.rate = rate;
   }

   public String getRate() {
      return this.rate;
   }

   public void setAmount(String amount) {
      this.amount = amount;
   }

   public String getAmount() {
      return this.amount;
   }

   public void setPrice(String price) {
      this.price = price;
   }

   public String getPrice() {
      return this.price;
   }

   public void setQuantity(String quantity) {
      this.quantity = quantity;
   }

   public String getQuantity() {
      return this.quantity;
   }

   public void setPAttributes(String pAttributes) {
      this.pAttributes = pAttributes;
   }

   public String getPAttributes() {
      return this.pAttributes;
   }

   public void setIsvLotattrs(String isvLotattrs) {
      this.isvLotattrs = isvLotattrs;
   }

   public String getIsvLotattrs() {
      return this.isvLotattrs;
   }

   public void setIsvGoodsNo(String isvGoodsNo) {
      this.isvGoodsNo = isvGoodsNo;
   }

   public String getIsvGoodsNo() {
      return this.isvGoodsNo;
   }

   public void setInstallVenderId(String installVenderId) {
      this.installVenderId = installVenderId;
   }

   public String getInstallVenderId() {
      return this.installVenderId;
   }

   public void setOrderLine(String orderLine) {
      this.orderLine = orderLine;
   }

   public String getOrderLine() {
      return this.orderLine;
   }

   public void setBatAttrs(String batAttrs) {
      this.batAttrs = batAttrs;
   }

   public String getBatAttrs() {
      return this.batAttrs;
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

   public void setSerialNo(String serialNo) {
      this.serialNo = serialNo;
   }

   public String getSerialNo() {
      return this.serialNo;
   }

   public void setJdPackageType(String jdPackageType) {
      this.jdPackageType = jdPackageType;
   }

   public String getJdPackageType() {
      return this.jdPackageType;
   }

   public void setServiceProductJson(String serviceProductJson) {
      this.serviceProductJson = serviceProductJson;
   }

   public String getServiceProductJson() {
      return this.serviceProductJson;
   }

   public void setPayAmount(String payAmount) {
      this.payAmount = payAmount;
   }

   public String getPayAmount() {
      return this.payAmount;
   }

   public void setSellerGoodsRemark(String sellerGoodsRemark) {
      this.sellerGoodsRemark = sellerGoodsRemark;
   }

   public String getSellerGoodsRemark() {
      return this.sellerGoodsRemark;
   }

   public void setLeftExpirationPercent(String leftExpirationPercent) {
      this.leftExpirationPercent = leftExpirationPercent;
   }

   public String getLeftExpirationPercent() {
      return this.leftExpirationPercent;
   }

   public void setLeftExpirationPercentOperate(String leftExpirationPercentOperate) {
      this.leftExpirationPercentOperate = leftExpirationPercentOperate;
   }

   public String getLeftExpirationPercentOperate() {
      return this.leftExpirationPercentOperate;
   }

   public void setBatAttrRangeJson(String batAttrRangeJson) {
      this.batAttrRangeJson = batAttrRangeJson;
   }

   public String getBatAttrRangeJson() {
      return this.batAttrRangeJson;
   }

   public void setCloudPrintInfoJson(String cloudPrintInfoJson) {
      this.cloudPrintInfoJson = cloudPrintInfoJson;
   }

   public String getCloudPrintInfoJson() {
      return this.cloudPrintInfoJson;
   }

   public void setGoodsDiscountPrice(String goodsDiscountPrice) {
      this.goodsDiscountPrice = goodsDiscountPrice;
   }

   public String getGoodsDiscountPrice() {
      return this.goodsDiscountPrice;
   }

   public String getApiMethod() {
      return "jingdong.eclp.order.addOrder";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("isvUUID", this.isvUUID);
      pmap.put("isvSource", this.isvSource);
      pmap.put("shopNo", this.shopNo);
      pmap.put("bdOwnerNo", this.bdOwnerNo);
      pmap.put("departmentNo", this.departmentNo);
      pmap.put("warehouseNo", this.warehouseNo);
      pmap.put("shipperNo", this.shipperNo);
      pmap.put("salesPlatformOrderNo", this.salesPlatformOrderNo);
      pmap.put("salePlatformSource", this.salePlatformSource);

      try {
         if (this.salesPlatformCreateTime != null) {
            pmap.put("salesPlatformCreateTime", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.salesPlatformCreateTime));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      pmap.put("soType", this.soType);
      pmap.put("consigneeName", this.consigneeName);
      pmap.put("consigneeMobile", this.consigneeMobile);
      pmap.put("consigneePhone", this.consigneePhone);
      pmap.put("consigneeEmail", this.consigneeEmail);

      try {
         if (this.expectDate != null) {
            pmap.put("expectDate", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.expectDate));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      pmap.put("addressProvince", this.addressProvince);
      pmap.put("addressCity", this.addressCity);
      pmap.put("addressCounty", this.addressCounty);
      pmap.put("addressTown", this.addressTown);
      pmap.put("consigneeAddress", this.consigneeAddress);
      pmap.put("consigneePostcode", this.consigneePostcode);
      pmap.put("receivable", this.receivable);
      pmap.put("consigneeRemark", this.consigneeRemark);
      pmap.put("orderMark", this.orderMark);
      pmap.put("thirdWayBill", this.thirdWayBill);
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
      pmap.put("thirdPayment", this.thirdPayment);
      pmap.put("monthlyAccount", this.monthlyAccount);
      pmap.put("shipment", this.shipment);
      pmap.put("sellerRemark", this.sellerRemark);
      pmap.put("thirdSite", this.thirdSite);
      pmap.put("gatherCenterName", this.gatherCenterName);
      pmap.put("customsStatus", this.customsStatus);
      pmap.put("customerName", this.customerName);
      pmap.put("invoiceTitle", this.invoiceTitle);
      pmap.put("invoiceContent", this.invoiceContent);
      pmap.put("goodsType", this.goodsType);
      pmap.put("goodsLevel", this.goodsLevel);
      pmap.put("customsPort", this.customsPort);
      pmap.put("billType", this.billType);
      pmap.put("orderPrice", this.orderPrice);
      pmap.put("wlyInfo", this.wlyInfo);
      pmap.put("customerId", this.customerId);
      pmap.put("urgency", this.urgency);
      pmap.put("customerNo", this.customerNo);
      pmap.put("storeName", this.storeName);
      pmap.put("invoiceState", this.invoiceState);
      pmap.put("invoiceType", this.invoiceType);
      pmap.put("invoiceNo", this.invoiceNo);
      pmap.put("invoiceTax", this.invoiceTax);
      pmap.put("bankName", this.bankName);
      pmap.put("bankAccount", this.bankAccount);
      pmap.put("address", this.address);
      pmap.put("phoneNumber", this.phoneNumber);
      pmap.put("signType", this.signType);
      pmap.put("signIDCode", this.signIDCode);
      pmap.put("supplierNo", this.supplierNo);
      pmap.put("agingType", this.agingType);
      pmap.put("sellerNote", this.sellerNote);
      pmap.put("supervisionCode", this.supervisionCode);
      pmap.put("invoiceChecker", this.invoiceChecker);
      pmap.put("paymentType", this.paymentType);
      pmap.put("saleType", this.saleType);
      pmap.put("inStorageNo", this.inStorageNo);

      try {
         if (this.inStorageTime != null) {
            pmap.put("inStorageTime", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.inStorageTime));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      pmap.put("inStorageRemark", this.inStorageRemark);
      pmap.put("grossReturnName", this.grossReturnName);
      pmap.put("grossReturnPhone", this.grossReturnPhone);
      pmap.put("grossReturnMobile", this.grossReturnMobile);
      pmap.put("grossReturnAddress", this.grossReturnAddress);
      pmap.put("isvPackTypeNo", this.isvPackTypeNo);
      pmap.put("addrAnalysis", this.addrAnalysis);
      pmap.put("printExtendInfo", this.printExtendInfo);
      pmap.put("logicParam", this.logicParam);
      pmap.put("combineNo", this.combineNo);
      pmap.put("activationService", this.activationService);
      pmap.put("randomInspection", this.randomInspection);
      pmap.put("VIPDeliWarehouse", this.VIPDeliWarehouse);
      pmap.put("customField", this.customField);
      pmap.put("longitude", this.longitude);
      pmap.put("latitude", this.latitude);
      pmap.put("agingProductType", this.agingProductType);
      pmap.put("crossDockPriority", this.crossDockPriority);
      pmap.put("isvCompanyNo", this.isvCompanyNo);
      pmap.put("orderPriority", this.orderPriority);
      pmap.put("orderBatchNo", this.orderBatchNo);
      pmap.put("orderBatchQty", this.orderBatchQty);
      pmap.put("productCode", this.productCode);
      pmap.put("vehicleType", this.vehicleType);
      pmap.put("isvSoType", this.isvSoType);
      pmap.put("checkDelivery", this.checkDelivery);
      pmap.put("isvSoTypeName", this.isvSoTypeName);
      pmap.put("quarantineCert", this.quarantineCert);
      pmap.put("deliveryService", this.deliveryService);
      pmap.put("selfDeliverySiteId", this.selfDeliverySiteId);
      pmap.put("deliveryIntoWarehouse", this.deliveryIntoWarehouse);
      pmap.put("deliveryWarehouseType", this.deliveryWarehouseType);
      pmap.put("unPack", this.unPack);
      pmap.put("deliveryBeforeCommand", this.deliveryBeforeCommand);
      pmap.put("pickUpCode", this.pickUpCode);
      pmap.put("isvShopNo", this.isvShopNo);
      pmap.put("expecTransport", this.expecTransport);
      pmap.put("inDependent", this.inDependent);
      pmap.put("storeBrand", this.storeBrand);
      pmap.put("storeId", this.storeId);
      pmap.put("unloadFlag", this.unloadFlag);
      pmap.put("relationNo", this.relationNo);
      pmap.put("deliveryProductCode", this.deliveryProductCode);
      pmap.put("sellerWarehouseNo", this.sellerWarehouseNo);
      pmap.put("peaceMindReceive", this.peaceMindReceive);
      pmap.put("yardInner", this.yardInner);
      pmap.put("warehouseProductNo", this.warehouseProductNo);
      pmap.put("deliveryProductNo", this.deliveryProductNo);
      pmap.put("payTime", this.payTime);
      pmap.put("goodsNo", this.goodsNo);
      pmap.put("skuGoodsLevel", this.skuGoodsLevel);
      pmap.put("goodsName", this.goodsName);
      pmap.put("type", this.type);
      pmap.put("unit", this.unit);
      pmap.put("remark", this.remark);
      pmap.put("rate", this.rate);
      pmap.put("amount", this.amount);
      pmap.put("price", this.price);
      pmap.put("quantity", this.quantity);
      pmap.put("pAttributes", this.pAttributes);
      pmap.put("isvLotattrs", this.isvLotattrs);
      pmap.put("isvGoodsNo", this.isvGoodsNo);
      pmap.put("installVenderId", this.installVenderId);
      pmap.put("orderLine", this.orderLine);
      pmap.put("batAttrs", this.batAttrs);
      pmap.put("productionDate", this.productionDate);
      pmap.put("expirationDate", this.expirationDate);
      pmap.put("packBatchNo", this.packBatchNo);
      pmap.put("poNo", this.poNo);
      pmap.put("lot", this.lot);
      pmap.put("serialNo", this.serialNo);
      pmap.put("jdPackageType", this.jdPackageType);
      pmap.put("serviceProductJson", this.serviceProductJson);
      pmap.put("payAmount", this.payAmount);
      pmap.put("sellerGoodsRemark", this.sellerGoodsRemark);
      pmap.put("leftExpirationPercent", this.leftExpirationPercent);
      pmap.put("leftExpirationPercentOperate", this.leftExpirationPercentOperate);
      pmap.put("batAttrRangeJson", this.batAttrRangeJson);
      pmap.put("cloudPrintInfoJson", this.cloudPrintInfoJson);
      pmap.put("goodsDiscountPrice", this.goodsDiscountPrice);
      return JsonUtil.toJson(pmap);
   }

   public Class<EclpOrderAddOrderResponse> getResponseClass() {
      return EclpOrderAddOrderResponse.class;
   }
}
