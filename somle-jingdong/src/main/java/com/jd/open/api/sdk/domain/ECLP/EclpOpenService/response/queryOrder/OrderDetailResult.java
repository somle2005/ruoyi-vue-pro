package com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.queryOrder;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class OrderDetailResult implements Serializable {
   private String eclpSoNo;
   private String isvUUID;
   private String shopNo;
   private String departmentNo;
   private String warehouseNo;
   private String shipperNo;
   private String shipperName;
   private String salesPlatformOrderNo;
   private String salePlatformSource;
   private Date salesPlatformCreateTime;
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
   private String afterSalesName;
   private String afterSalesMobile;
   private String afterSalesAddress;
   private String pinAccount;
   private String splitFlag;
   private String currentStatus;
   private String wayBill;
   private List<OrderDetail> orderDetailList;
   private List<LocateDetail> orderLocateList;
   private String splitEclpSoNos;
   private List<OrderPackage> orderPackageList;
   private List<OrderStatus> orderStatusList;
   private Integer transType;
   private Date expectDeliveryDate;
   private String soWeight;
   private List<BatchDetailResult> batchDetailList;
   private List<ProductInfo> productInfoList;
   private Byte pieceType;
   private String logicParam;
   private String tpWayBill;
   private String signDisclaimer;
   private String sellerWarehouseNo;
   private List<OrderRejectDetail> orderRejectDetailList;
   private List<String> rejectPicUrlList;

   @JsonProperty("eclpSoNo")
   public void setEclpSoNo(String eclpSoNo) {
      this.eclpSoNo = eclpSoNo;
   }

   @JsonProperty("eclpSoNo")
   public String getEclpSoNo() {
      return this.eclpSoNo;
   }

   @JsonProperty("isvUUID")
   public void setIsvUUID(String isvUUID) {
      this.isvUUID = isvUUID;
   }

   @JsonProperty("isvUUID")
   public String getIsvUUID() {
      return this.isvUUID;
   }

   @JsonProperty("shopNo")
   public void setShopNo(String shopNo) {
      this.shopNo = shopNo;
   }

   @JsonProperty("shopNo")
   public String getShopNo() {
      return this.shopNo;
   }

   @JsonProperty("departmentNo")
   public void setDepartmentNo(String departmentNo) {
      this.departmentNo = departmentNo;
   }

   @JsonProperty("departmentNo")
   public String getDepartmentNo() {
      return this.departmentNo;
   }

   @JsonProperty("warehouseNo")
   public void setWarehouseNo(String warehouseNo) {
      this.warehouseNo = warehouseNo;
   }

   @JsonProperty("warehouseNo")
   public String getWarehouseNo() {
      return this.warehouseNo;
   }

   @JsonProperty("shipperNo")
   public void setShipperNo(String shipperNo) {
      this.shipperNo = shipperNo;
   }

   @JsonProperty("shipperNo")
   public String getShipperNo() {
      return this.shipperNo;
   }

   @JsonProperty("shipperName")
   public void setShipperName(String shipperName) {
      this.shipperName = shipperName;
   }

   @JsonProperty("shipperName")
   public String getShipperName() {
      return this.shipperName;
   }

   @JsonProperty("salesPlatformOrderNo")
   public void setSalesPlatformOrderNo(String salesPlatformOrderNo) {
      this.salesPlatformOrderNo = salesPlatformOrderNo;
   }

   @JsonProperty("salesPlatformOrderNo")
   public String getSalesPlatformOrderNo() {
      return this.salesPlatformOrderNo;
   }

   @JsonProperty("salePlatformSource")
   public void setSalePlatformSource(String salePlatformSource) {
      this.salePlatformSource = salePlatformSource;
   }

   @JsonProperty("salePlatformSource")
   public String getSalePlatformSource() {
      return this.salePlatformSource;
   }

   @JsonProperty("salesPlatformCreateTime")
   public void setSalesPlatformCreateTime(Date salesPlatformCreateTime) {
      this.salesPlatformCreateTime = salesPlatformCreateTime;
   }

   @JsonProperty("salesPlatformCreateTime")
   public Date getSalesPlatformCreateTime() {
      return this.salesPlatformCreateTime;
   }

   @JsonProperty("consigneeName")
   public void setConsigneeName(String consigneeName) {
      this.consigneeName = consigneeName;
   }

   @JsonProperty("consigneeName")
   public String getConsigneeName() {
      return this.consigneeName;
   }

   @JsonProperty("consigneeMobile")
   public void setConsigneeMobile(String consigneeMobile) {
      this.consigneeMobile = consigneeMobile;
   }

   @JsonProperty("consigneeMobile")
   public String getConsigneeMobile() {
      return this.consigneeMobile;
   }

   @JsonProperty("consigneePhone")
   public void setConsigneePhone(String consigneePhone) {
      this.consigneePhone = consigneePhone;
   }

   @JsonProperty("consigneePhone")
   public String getConsigneePhone() {
      return this.consigneePhone;
   }

   @JsonProperty("consigneeEmail")
   public void setConsigneeEmail(String consigneeEmail) {
      this.consigneeEmail = consigneeEmail;
   }

   @JsonProperty("consigneeEmail")
   public String getConsigneeEmail() {
      return this.consigneeEmail;
   }

   @JsonProperty("expectDate")
   public void setExpectDate(Date expectDate) {
      this.expectDate = expectDate;
   }

   @JsonProperty("expectDate")
   public Date getExpectDate() {
      return this.expectDate;
   }

   @JsonProperty("addressProvince")
   public void setAddressProvince(String addressProvince) {
      this.addressProvince = addressProvince;
   }

   @JsonProperty("addressProvince")
   public String getAddressProvince() {
      return this.addressProvince;
   }

   @JsonProperty("addressCity")
   public void setAddressCity(String addressCity) {
      this.addressCity = addressCity;
   }

   @JsonProperty("addressCity")
   public String getAddressCity() {
      return this.addressCity;
   }

   @JsonProperty("addressCounty")
   public void setAddressCounty(String addressCounty) {
      this.addressCounty = addressCounty;
   }

   @JsonProperty("addressCounty")
   public String getAddressCounty() {
      return this.addressCounty;
   }

   @JsonProperty("addressTown")
   public void setAddressTown(String addressTown) {
      this.addressTown = addressTown;
   }

   @JsonProperty("addressTown")
   public String getAddressTown() {
      return this.addressTown;
   }

   @JsonProperty("consigneeAddress")
   public void setConsigneeAddress(String consigneeAddress) {
      this.consigneeAddress = consigneeAddress;
   }

   @JsonProperty("consigneeAddress")
   public String getConsigneeAddress() {
      return this.consigneeAddress;
   }

   @JsonProperty("consigneePostcode")
   public void setConsigneePostcode(String consigneePostcode) {
      this.consigneePostcode = consigneePostcode;
   }

   @JsonProperty("consigneePostcode")
   public String getConsigneePostcode() {
      return this.consigneePostcode;
   }

   @JsonProperty("receivable")
   public void setReceivable(Double receivable) {
      this.receivable = receivable;
   }

   @JsonProperty("receivable")
   public Double getReceivable() {
      return this.receivable;
   }

   @JsonProperty("consigneeRemark")
   public void setConsigneeRemark(String consigneeRemark) {
      this.consigneeRemark = consigneeRemark;
   }

   @JsonProperty("consigneeRemark")
   public String getConsigneeRemark() {
      return this.consigneeRemark;
   }

   @JsonProperty("orderMark")
   public void setOrderMark(String orderMark) {
      this.orderMark = orderMark;
   }

   @JsonProperty("orderMark")
   public String getOrderMark() {
      return this.orderMark;
   }

   @JsonProperty("afterSalesName")
   public void setAfterSalesName(String afterSalesName) {
      this.afterSalesName = afterSalesName;
   }

   @JsonProperty("afterSalesName")
   public String getAfterSalesName() {
      return this.afterSalesName;
   }

   @JsonProperty("afterSalesMobile")
   public void setAfterSalesMobile(String afterSalesMobile) {
      this.afterSalesMobile = afterSalesMobile;
   }

   @JsonProperty("afterSalesMobile")
   public String getAfterSalesMobile() {
      return this.afterSalesMobile;
   }

   @JsonProperty("afterSalesAddress")
   public void setAfterSalesAddress(String afterSalesAddress) {
      this.afterSalesAddress = afterSalesAddress;
   }

   @JsonProperty("afterSalesAddress")
   public String getAfterSalesAddress() {
      return this.afterSalesAddress;
   }

   @JsonProperty("pinAccount")
   public void setPinAccount(String pinAccount) {
      this.pinAccount = pinAccount;
   }

   @JsonProperty("pinAccount")
   public String getPinAccount() {
      return this.pinAccount;
   }

   @JsonProperty("splitFlag")
   public void setSplitFlag(String splitFlag) {
      this.splitFlag = splitFlag;
   }

   @JsonProperty("splitFlag")
   public String getSplitFlag() {
      return this.splitFlag;
   }

   @JsonProperty("currentStatus")
   public void setCurrentStatus(String currentStatus) {
      this.currentStatus = currentStatus;
   }

   @JsonProperty("currentStatus")
   public String getCurrentStatus() {
      return this.currentStatus;
   }

   @JsonProperty("wayBill")
   public void setWayBill(String wayBill) {
      this.wayBill = wayBill;
   }

   @JsonProperty("wayBill")
   public String getWayBill() {
      return this.wayBill;
   }

   @JsonProperty("orderDetailList")
   public void setOrderDetailList(List<OrderDetail> orderDetailList) {
      this.orderDetailList = orderDetailList;
   }

   @JsonProperty("orderDetailList")
   public List<OrderDetail> getOrderDetailList() {
      return this.orderDetailList;
   }

   @JsonProperty("orderLocateList")
   public void setOrderLocateList(List<LocateDetail> orderLocateList) {
      this.orderLocateList = orderLocateList;
   }

   @JsonProperty("orderLocateList")
   public List<LocateDetail> getOrderLocateList() {
      return this.orderLocateList;
   }

   @JsonProperty("splitEclpSoNos")
   public void setSplitEclpSoNos(String splitEclpSoNos) {
      this.splitEclpSoNos = splitEclpSoNos;
   }

   @JsonProperty("splitEclpSoNos")
   public String getSplitEclpSoNos() {
      return this.splitEclpSoNos;
   }

   @JsonProperty("orderPackageList")
   public void setOrderPackageList(List<OrderPackage> orderPackageList) {
      this.orderPackageList = orderPackageList;
   }

   @JsonProperty("orderPackageList")
   public List<OrderPackage> getOrderPackageList() {
      return this.orderPackageList;
   }

   @JsonProperty("orderStatusList")
   public void setOrderStatusList(List<OrderStatus> orderStatusList) {
      this.orderStatusList = orderStatusList;
   }

   @JsonProperty("orderStatusList")
   public List<OrderStatus> getOrderStatusList() {
      return this.orderStatusList;
   }

   @JsonProperty("transType")
   public void setTransType(Integer transType) {
      this.transType = transType;
   }

   @JsonProperty("transType")
   public Integer getTransType() {
      return this.transType;
   }

   @JsonProperty("expectDeliveryDate")
   public void setExpectDeliveryDate(Date expectDeliveryDate) {
      this.expectDeliveryDate = expectDeliveryDate;
   }

   @JsonProperty("expectDeliveryDate")
   public Date getExpectDeliveryDate() {
      return this.expectDeliveryDate;
   }

   @JsonProperty("soWeight")
   public void setSoWeight(String soWeight) {
      this.soWeight = soWeight;
   }

   @JsonProperty("soWeight")
   public String getSoWeight() {
      return this.soWeight;
   }

   @JsonProperty("batchDetailList")
   public void setBatchDetailList(List<BatchDetailResult> batchDetailList) {
      this.batchDetailList = batchDetailList;
   }

   @JsonProperty("batchDetailList")
   public List<BatchDetailResult> getBatchDetailList() {
      return this.batchDetailList;
   }

   @JsonProperty("productInfoList")
   public void setProductInfoList(List<ProductInfo> productInfoList) {
      this.productInfoList = productInfoList;
   }

   @JsonProperty("productInfoList")
   public List<ProductInfo> getProductInfoList() {
      return this.productInfoList;
   }

   @JsonProperty("pieceType")
   public void setPieceType(Byte pieceType) {
      this.pieceType = pieceType;
   }

   @JsonProperty("pieceType")
   public Byte getPieceType() {
      return this.pieceType;
   }

   @JsonProperty("logicParam")
   public void setLogicParam(String logicParam) {
      this.logicParam = logicParam;
   }

   @JsonProperty("logicParam")
   public String getLogicParam() {
      return this.logicParam;
   }

   @JsonProperty("tpWayBill")
   public void setTpWayBill(String tpWayBill) {
      this.tpWayBill = tpWayBill;
   }

   @JsonProperty("tpWayBill")
   public String getTpWayBill() {
      return this.tpWayBill;
   }

   @JsonProperty("signDisclaimer")
   public void setSignDisclaimer(String signDisclaimer) {
      this.signDisclaimer = signDisclaimer;
   }

   @JsonProperty("signDisclaimer")
   public String getSignDisclaimer() {
      return this.signDisclaimer;
   }

   @JsonProperty("sellerWarehouseNo")
   public void setSellerWarehouseNo(String sellerWarehouseNo) {
      this.sellerWarehouseNo = sellerWarehouseNo;
   }

   @JsonProperty("sellerWarehouseNo")
   public String getSellerWarehouseNo() {
      return this.sellerWarehouseNo;
   }

   @JsonProperty("orderRejectDetailList")
   public void setOrderRejectDetailList(List<OrderRejectDetail> orderRejectDetailList) {
      this.orderRejectDetailList = orderRejectDetailList;
   }

   @JsonProperty("orderRejectDetailList")
   public List<OrderRejectDetail> getOrderRejectDetailList() {
      return this.orderRejectDetailList;
   }

   @JsonProperty("rejectPicUrlList")
   public void setRejectPicUrlList(List<String> rejectPicUrlList) {
      this.rejectPicUrlList = rejectPicUrlList;
   }

   @JsonProperty("rejectPicUrlList")
   public List<String> getRejectPicUrlList() {
      return this.rejectPicUrlList;
   }
}
