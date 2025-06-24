package com.jd.open.api.sdk.domain.supplier.IDpsSearchAllOrdersInterface.response.searchAllOrders;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class QueryAllOrdersForJosResult implements Serializable {
   private Long customOrderId;
   private BigDecimal pay;
   private Integer operatorState;
   private Integer orderState;
   private String consigneeName;
   private String postcode;
   private Date expectedDeliveryTime;
   private String telephone;
   private String phone;
   private String email;
   private String address;
   private String orderRemark;
   private Date orderCreateDate;
   private Integer isNotNotice;
   private String sendPay;
   private String paymentCategory;
   private String paymentCategoryDispName;
   private Date createDate;
   private String pin;
   private Integer refundSourceFlag;
   private Integer provinceId;
   private String provinceName;
   private Integer cityId;
   private String cityName;
   private Integer countyId;
   private String countyName;
   private Integer townId;
   private String townName;
   private String memoByVendor;
   private Long parentOrderId;
   private String sku;
   private String commodityName;
   private String upc;
   private Integer commodityNum;
   private BigDecimal jdPrice;
   private BigDecimal discount;
   private BigDecimal reduceCount;
   private BigDecimal totalCarriage;
   private BigDecimal cost;
   private List<QueryListOrderDetailInfo> orderDetailList;
   private Integer vendorStoreId;
   private String vendorStoreName;
   private String branchName;
   private String extInfo;
   private String consolidatorInfo;
   private Long updateDate;
   private OutPlatformOrderInfo outPlatformOrderInfo;
   private String oaid;
   private String opPickDate;
   private String opDeliveredDate;
   private String promisePickDate;
   private Integer userLevelType;
   private String openIdBuyer;
   private String xidBuyer;

   @JsonProperty("customOrderId")
   public void setCustomOrderId(Long customOrderId) {
      this.customOrderId = customOrderId;
   }

   @JsonProperty("customOrderId")
   public Long getCustomOrderId() {
      return this.customOrderId;
   }

   @JsonProperty("pay")
   public void setPay(BigDecimal pay) {
      this.pay = pay;
   }

   @JsonProperty("pay")
   public BigDecimal getPay() {
      return this.pay;
   }

   @JsonProperty("operatorState")
   public void setOperatorState(Integer operatorState) {
      this.operatorState = operatorState;
   }

   @JsonProperty("operatorState")
   public Integer getOperatorState() {
      return this.operatorState;
   }

   @JsonProperty("orderState")
   public void setOrderState(Integer orderState) {
      this.orderState = orderState;
   }

   @JsonProperty("orderState")
   public Integer getOrderState() {
      return this.orderState;
   }

   @JsonProperty("consigneeName")
   public void setConsigneeName(String consigneeName) {
      this.consigneeName = consigneeName;
   }

   @JsonProperty("consigneeName")
   public String getConsigneeName() {
      return this.consigneeName;
   }

   @JsonProperty("postcode")
   public void setPostcode(String postcode) {
      this.postcode = postcode;
   }

   @JsonProperty("postcode")
   public String getPostcode() {
      return this.postcode;
   }

   @JsonProperty("expectedDeliveryTime")
   public void setExpectedDeliveryTime(Date expectedDeliveryTime) {
      this.expectedDeliveryTime = expectedDeliveryTime;
   }

   @JsonProperty("expectedDeliveryTime")
   public Date getExpectedDeliveryTime() {
      return this.expectedDeliveryTime;
   }

   @JsonProperty("telephone")
   public void setTelephone(String telephone) {
      this.telephone = telephone;
   }

   @JsonProperty("telephone")
   public String getTelephone() {
      return this.telephone;
   }

   @JsonProperty("phone")
   public void setPhone(String phone) {
      this.phone = phone;
   }

   @JsonProperty("phone")
   public String getPhone() {
      return this.phone;
   }

   @JsonProperty("email")
   public void setEmail(String email) {
      this.email = email;
   }

   @JsonProperty("email")
   public String getEmail() {
      return this.email;
   }

   @JsonProperty("address")
   public void setAddress(String address) {
      this.address = address;
   }

   @JsonProperty("address")
   public String getAddress() {
      return this.address;
   }

   @JsonProperty("orderRemark")
   public void setOrderRemark(String orderRemark) {
      this.orderRemark = orderRemark;
   }

   @JsonProperty("orderRemark")
   public String getOrderRemark() {
      return this.orderRemark;
   }

   @JsonProperty("orderCreateDate")
   public void setOrderCreateDate(Date orderCreateDate) {
      this.orderCreateDate = orderCreateDate;
   }

   @JsonProperty("orderCreateDate")
   public Date getOrderCreateDate() {
      return this.orderCreateDate;
   }

   @JsonProperty("isNotNotice")
   public void setIsNotNotice(Integer isNotNotice) {
      this.isNotNotice = isNotNotice;
   }

   @JsonProperty("isNotNotice")
   public Integer getIsNotNotice() {
      return this.isNotNotice;
   }

   @JsonProperty("sendPay")
   public void setSendPay(String sendPay) {
      this.sendPay = sendPay;
   }

   @JsonProperty("sendPay")
   public String getSendPay() {
      return this.sendPay;
   }

   @JsonProperty("paymentCategory")
   public void setPaymentCategory(String paymentCategory) {
      this.paymentCategory = paymentCategory;
   }

   @JsonProperty("paymentCategory")
   public String getPaymentCategory() {
      return this.paymentCategory;
   }

   @JsonProperty("paymentCategoryDispName")
   public void setPaymentCategoryDispName(String paymentCategoryDispName) {
      this.paymentCategoryDispName = paymentCategoryDispName;
   }

   @JsonProperty("paymentCategoryDispName")
   public String getPaymentCategoryDispName() {
      return this.paymentCategoryDispName;
   }

   @JsonProperty("createDate")
   public void setCreateDate(Date createDate) {
      this.createDate = createDate;
   }

   @JsonProperty("createDate")
   public Date getCreateDate() {
      return this.createDate;
   }

   @JsonProperty("pin")
   public void setPin(String pin) {
      this.pin = pin;
   }

   @JsonProperty("pin")
   public String getPin() {
      return this.pin;
   }

   @JsonProperty("refundSourceFlag")
   public void setRefundSourceFlag(Integer refundSourceFlag) {
      this.refundSourceFlag = refundSourceFlag;
   }

   @JsonProperty("refundSourceFlag")
   public Integer getRefundSourceFlag() {
      return this.refundSourceFlag;
   }

   @JsonProperty("provinceId")
   public void setProvinceId(Integer provinceId) {
      this.provinceId = provinceId;
   }

   @JsonProperty("provinceId")
   public Integer getProvinceId() {
      return this.provinceId;
   }

   @JsonProperty("provinceName")
   public void setProvinceName(String provinceName) {
      this.provinceName = provinceName;
   }

   @JsonProperty("provinceName")
   public String getProvinceName() {
      return this.provinceName;
   }

   @JsonProperty("cityId")
   public void setCityId(Integer cityId) {
      this.cityId = cityId;
   }

   @JsonProperty("cityId")
   public Integer getCityId() {
      return this.cityId;
   }

   @JsonProperty("cityName")
   public void setCityName(String cityName) {
      this.cityName = cityName;
   }

   @JsonProperty("cityName")
   public String getCityName() {
      return this.cityName;
   }

   @JsonProperty("countyId")
   public void setCountyId(Integer countyId) {
      this.countyId = countyId;
   }

   @JsonProperty("countyId")
   public Integer getCountyId() {
      return this.countyId;
   }

   @JsonProperty("countyName")
   public void setCountyName(String countyName) {
      this.countyName = countyName;
   }

   @JsonProperty("countyName")
   public String getCountyName() {
      return this.countyName;
   }

   @JsonProperty("townId")
   public void setTownId(Integer townId) {
      this.townId = townId;
   }

   @JsonProperty("townId")
   public Integer getTownId() {
      return this.townId;
   }

   @JsonProperty("townName")
   public void setTownName(String townName) {
      this.townName = townName;
   }

   @JsonProperty("townName")
   public String getTownName() {
      return this.townName;
   }

   @JsonProperty("memoByVendor")
   public void setMemoByVendor(String memoByVendor) {
      this.memoByVendor = memoByVendor;
   }

   @JsonProperty("memoByVendor")
   public String getMemoByVendor() {
      return this.memoByVendor;
   }

   @JsonProperty("parentOrderId")
   public void setParentOrderId(Long parentOrderId) {
      this.parentOrderId = parentOrderId;
   }

   @JsonProperty("parentOrderId")
   public Long getParentOrderId() {
      return this.parentOrderId;
   }

   @JsonProperty("sku")
   public void setSku(String sku) {
      this.sku = sku;
   }

   @JsonProperty("sku")
   public String getSku() {
      return this.sku;
   }

   @JsonProperty("commodityName")
   public void setCommodityName(String commodityName) {
      this.commodityName = commodityName;
   }

   @JsonProperty("commodityName")
   public String getCommodityName() {
      return this.commodityName;
   }

   @JsonProperty("upc")
   public void setUpc(String upc) {
      this.upc = upc;
   }

   @JsonProperty("upc")
   public String getUpc() {
      return this.upc;
   }

   @JsonProperty("commodityNum")
   public void setCommodityNum(Integer commodityNum) {
      this.commodityNum = commodityNum;
   }

   @JsonProperty("commodityNum")
   public Integer getCommodityNum() {
      return this.commodityNum;
   }

   @JsonProperty("jdPrice")
   public void setJdPrice(BigDecimal jdPrice) {
      this.jdPrice = jdPrice;
   }

   @JsonProperty("jdPrice")
   public BigDecimal getJdPrice() {
      return this.jdPrice;
   }

   @JsonProperty("discount")
   public void setDiscount(BigDecimal discount) {
      this.discount = discount;
   }

   @JsonProperty("discount")
   public BigDecimal getDiscount() {
      return this.discount;
   }

   @JsonProperty("reduceCount")
   public void setReduceCount(BigDecimal reduceCount) {
      this.reduceCount = reduceCount;
   }

   @JsonProperty("reduceCount")
   public BigDecimal getReduceCount() {
      return this.reduceCount;
   }

   @JsonProperty("totalCarriage")
   public void setTotalCarriage(BigDecimal totalCarriage) {
      this.totalCarriage = totalCarriage;
   }

   @JsonProperty("totalCarriage")
   public BigDecimal getTotalCarriage() {
      return this.totalCarriage;
   }

   @JsonProperty("cost")
   public void setCost(BigDecimal cost) {
      this.cost = cost;
   }

   @JsonProperty("cost")
   public BigDecimal getCost() {
      return this.cost;
   }

   @JsonProperty("orderDetailList")
   public void setOrderDetailList(List<QueryListOrderDetailInfo> orderDetailList) {
      this.orderDetailList = orderDetailList;
   }

   @JsonProperty("orderDetailList")
   public List<QueryListOrderDetailInfo> getOrderDetailList() {
      return this.orderDetailList;
   }

   @JsonProperty("vendorStoreId")
   public void setVendorStoreId(Integer vendorStoreId) {
      this.vendorStoreId = vendorStoreId;
   }

   @JsonProperty("vendorStoreId")
   public Integer getVendorStoreId() {
      return this.vendorStoreId;
   }

   @JsonProperty("vendorStoreName")
   public void setVendorStoreName(String vendorStoreName) {
      this.vendorStoreName = vendorStoreName;
   }

   @JsonProperty("vendorStoreName")
   public String getVendorStoreName() {
      return this.vendorStoreName;
   }

   @JsonProperty("branchName")
   public void setBranchName(String branchName) {
      this.branchName = branchName;
   }

   @JsonProperty("branchName")
   public String getBranchName() {
      return this.branchName;
   }

   @JsonProperty("extInfo")
   public void setExtInfo(String extInfo) {
      this.extInfo = extInfo;
   }

   @JsonProperty("extInfo")
   public String getExtInfo() {
      return this.extInfo;
   }

   @JsonProperty("consolidatorInfo")
   public void setConsolidatorInfo(String consolidatorInfo) {
      this.consolidatorInfo = consolidatorInfo;
   }

   @JsonProperty("consolidatorInfo")
   public String getConsolidatorInfo() {
      return this.consolidatorInfo;
   }

   @JsonProperty("updateDate")
   public void setUpdateDate(Long updateDate) {
      this.updateDate = updateDate;
   }

   @JsonProperty("updateDate")
   public Long getUpdateDate() {
      return this.updateDate;
   }

   @JsonProperty("outPlatformOrderInfo")
   public void setOutPlatformOrderInfo(OutPlatformOrderInfo outPlatformOrderInfo) {
      this.outPlatformOrderInfo = outPlatformOrderInfo;
   }

   @JsonProperty("outPlatformOrderInfo")
   public OutPlatformOrderInfo getOutPlatformOrderInfo() {
      return this.outPlatformOrderInfo;
   }

   @JsonProperty("oaid")
   public void setOaid(String oaid) {
      this.oaid = oaid;
   }

   @JsonProperty("oaid")
   public String getOaid() {
      return this.oaid;
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

   @JsonProperty("promisePickDate")
   public void setPromisePickDate(String promisePickDate) {
      this.promisePickDate = promisePickDate;
   }

   @JsonProperty("promisePickDate")
   public String getPromisePickDate() {
      return this.promisePickDate;
   }

   @JsonProperty("userLevelType")
   public void setUserLevelType(Integer userLevelType) {
      this.userLevelType = userLevelType;
   }

   @JsonProperty("userLevelType")
   public Integer getUserLevelType() {
      return this.userLevelType;
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
}
