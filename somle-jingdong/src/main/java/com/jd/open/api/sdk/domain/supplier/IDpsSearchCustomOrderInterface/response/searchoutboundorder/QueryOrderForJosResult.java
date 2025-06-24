package com.jd.open.api.sdk.domain.supplier.IDpsSearchCustomOrderInterface.response.searchoutboundorder;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class QueryOrderForJosResult implements Serializable {
   private Long customOrderId;
   private BigDecimal pay;
   private Integer operatorState;
   private String consigneeName;
   private String postcode;
   private Date expectedDeliveryTime;
   private String telephone;
   private String phone;
   private String email;
   private String address;
   private Date orderTime;
   private String orderRemark;
   private Date orderCreateDate;
   private Integer isNotice;
   private String sendPay;
   private String orderSource;
   private String paymentCategory;
   private String paymentCategoryDispName;
   private Date createDate;
   private String pin;
   private String memoByVendor;
   private int refundSourceFlag;
   private String provinceName;
   private String cityName;
   private String countyName;
   private String townName;
   private Long parentOrderId;
   private List<OrderDetailForJos> orderDetailList;
   private Integer vendorStoreId;
   private String vendorStoreName;
   private String extInfo;
   private String consolidatorInfo;
   private Long updateDate;
   private String oaid;
   private String opPickDate;
   private String opDeliveredDate;
   private String promisePickDate;
   private String ouId;
   private String ouName;
   private String wxStoreId;
   private String wxStoreName;
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

   @JsonProperty("orderTime")
   public void setOrderTime(Date orderTime) {
      this.orderTime = orderTime;
   }

   @JsonProperty("orderTime")
   public Date getOrderTime() {
      return this.orderTime;
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

   @JsonProperty("isNotice")
   public void setIsNotice(Integer isNotice) {
      this.isNotice = isNotice;
   }

   @JsonProperty("isNotice")
   public Integer getIsNotice() {
      return this.isNotice;
   }

   @JsonProperty("sendPay")
   public void setSendPay(String sendPay) {
      this.sendPay = sendPay;
   }

   @JsonProperty("sendPay")
   public String getSendPay() {
      return this.sendPay;
   }

   @JsonProperty("orderSource")
   public void setOrderSource(String orderSource) {
      this.orderSource = orderSource;
   }

   @JsonProperty("orderSource")
   public String getOrderSource() {
      return this.orderSource;
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

   @JsonProperty("memoByVendor")
   public void setMemoByVendor(String memoByVendor) {
      this.memoByVendor = memoByVendor;
   }

   @JsonProperty("memoByVendor")
   public String getMemoByVendor() {
      return this.memoByVendor;
   }

   @JsonProperty("refundSourceFlag")
   public void setRefundSourceFlag(int refundSourceFlag) {
      this.refundSourceFlag = refundSourceFlag;
   }

   @JsonProperty("refundSourceFlag")
   public int getRefundSourceFlag() {
      return this.refundSourceFlag;
   }

   @JsonProperty("provinceName")
   public void setProvinceName(String provinceName) {
      this.provinceName = provinceName;
   }

   @JsonProperty("provinceName")
   public String getProvinceName() {
      return this.provinceName;
   }

   @JsonProperty("cityName")
   public void setCityName(String cityName) {
      this.cityName = cityName;
   }

   @JsonProperty("cityName")
   public String getCityName() {
      return this.cityName;
   }

   @JsonProperty("countyName")
   public void setCountyName(String countyName) {
      this.countyName = countyName;
   }

   @JsonProperty("countyName")
   public String getCountyName() {
      return this.countyName;
   }

   @JsonProperty("townName")
   public void setTownName(String townName) {
      this.townName = townName;
   }

   @JsonProperty("townName")
   public String getTownName() {
      return this.townName;
   }

   @JsonProperty("parentOrderId")
   public void setParentOrderId(Long parentOrderId) {
      this.parentOrderId = parentOrderId;
   }

   @JsonProperty("parentOrderId")
   public Long getParentOrderId() {
      return this.parentOrderId;
   }

   @JsonProperty("orderDetailList")
   public void setOrderDetailList(List<OrderDetailForJos> orderDetailList) {
      this.orderDetailList = orderDetailList;
   }

   @JsonProperty("orderDetailList")
   public List<OrderDetailForJos> getOrderDetailList() {
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

   @JsonProperty("ouId")
   public void setOuId(String ouId) {
      this.ouId = ouId;
   }

   @JsonProperty("ouId")
   public String getOuId() {
      return this.ouId;
   }

   @JsonProperty("ouName")
   public void setOuName(String ouName) {
      this.ouName = ouName;
   }

   @JsonProperty("ouName")
   public String getOuName() {
      return this.ouName;
   }

   @JsonProperty("wxStoreId")
   public void setWxStoreId(String wxStoreId) {
      this.wxStoreId = wxStoreId;
   }

   @JsonProperty("wxStoreId")
   public String getWxStoreId() {
      return this.wxStoreId;
   }

   @JsonProperty("wxStoreName")
   public void setWxStoreName(String wxStoreName) {
      this.wxStoreName = wxStoreName;
   }

   @JsonProperty("wxStoreName")
   public String getWxStoreName() {
      return this.wxStoreName;
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
