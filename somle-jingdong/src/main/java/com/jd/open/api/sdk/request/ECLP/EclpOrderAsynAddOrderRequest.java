package com.jd.open.api.sdk.request.ECLP;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ECLP.EclpOrderAsynAddOrderResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class EclpOrderAsynAddOrderRequest extends AbstractRequest implements JdRequest<EclpOrderAsynAddOrderResponse> {
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
   private Double insuredFee;
   private Byte thirdPayment;
   private String monthlyAccount;
   private String shipment;
   private String sellerRemark;
   private String thirdSite;
   private String customsStatus;
   private String customerName;
   private String invoiceTitle;
   private String invoiceContent;
   private String goodsType;
   private String goodsLevel;
   private String customsPort;
   private String billType;
   private Double orderPrice;
   private String orderBatchNo;
   private Integer orderBatchQty;
   private Byte transactionSource;
   private String countrycode;
   private String goodsNo;
   private String price;
   private String quantity;
   private String serialNo;
   private String printName;

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

   public void setInsuredFee(Double insuredFee) {
      this.insuredFee = insuredFee;
   }

   public Double getInsuredFee() {
      return this.insuredFee;
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

   public void setTransactionSource(Byte transactionSource) {
      this.transactionSource = transactionSource;
   }

   public Byte getTransactionSource() {
      return this.transactionSource;
   }

   public void setCountrycode(String countrycode) {
      this.countrycode = countrycode;
   }

   public String getCountrycode() {
      return this.countrycode;
   }

   public void setGoodsNo(String goodsNo) {
      this.goodsNo = goodsNo;
   }

   public String getGoodsNo() {
      return this.goodsNo;
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

   public void setSerialNo(String serialNo) {
      this.serialNo = serialNo;
   }

   public String getSerialNo() {
      return this.serialNo;
   }

   public void setPrintName(String printName) {
      this.printName = printName;
   }

   public String getPrintName() {
      return this.printName;
   }

   public String getApiMethod() {
      return "jingdong.eclp.order.asynAddOrder";
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
      pmap.put("insuredFee", this.insuredFee);
      pmap.put("thirdPayment", this.thirdPayment);
      pmap.put("monthlyAccount", this.monthlyAccount);
      pmap.put("shipment", this.shipment);
      pmap.put("sellerRemark", this.sellerRemark);
      pmap.put("thirdSite", this.thirdSite);
      pmap.put("customsStatus", this.customsStatus);
      pmap.put("customerName", this.customerName);
      pmap.put("invoiceTitle", this.invoiceTitle);
      pmap.put("invoiceContent", this.invoiceContent);
      pmap.put("goodsType", this.goodsType);
      pmap.put("goodsLevel", this.goodsLevel);
      pmap.put("customsPort", this.customsPort);
      pmap.put("billType", this.billType);
      pmap.put("orderPrice", this.orderPrice);
      pmap.put("orderBatchNo", this.orderBatchNo);
      pmap.put("orderBatchQty", this.orderBatchQty);
      pmap.put("transactionSource", this.transactionSource);
      pmap.put("countrycode", this.countrycode);
      pmap.put("goodsNo", this.goodsNo);
      pmap.put("price", this.price);
      pmap.put("quantity", this.quantity);
      pmap.put("serialNo", this.serialNo);
      pmap.put("printName", this.printName);
      return JsonUtil.toJson(pmap);
   }

   public Class<EclpOrderAsynAddOrderResponse> getResponseClass() {
      return EclpOrderAsynAddOrderResponse.class;
   }
}
