package com.jd.open.api.sdk.domain.c2mdzkfpt.OrderListQueryOpenService.response.orderList;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class OrderBaseEntity implements Serializable {
   private Integer refundSourceFlag;
   private BigDecimal totalPrice;
   private Long coId;
   private String remark;
   private Integer cityId;
   private Integer townId;
   private Long roId;
   private Long orgId;
   private String productStageName;
   private Long poId;
   private String vendorCode;
   private Integer paymentType;
   private Integer orderState;
   private Date orderCreateDate;
   private String pin;
   private String cityName;
   private BigDecimal totalPurchasePrice;
   private Integer countyId;
   private String vendorRemark;
   private String tel;
   private BigDecimal totalCarriage;
   private String email;
   private String countyName;
   private String zip;
   private BigDecimal reduce;
   private String townName;
   private String address;
   private String orgName;
   private Long productStageId;
   private BigDecimal pay;
   private Long storeId;
   private Integer provinceId;
   private Integer presale;
   private String customerName;
   private Long deliverId;
   private Integer isJdexpress;
   private String phone;
   private String provinceName;
   private String deliverName;
   private Date modifiedDate;
   private String oaid;
   private String openIdBuyer;
   private String xidBuyer;

   @JsonProperty("refundSourceFlag")
   public void setRefundSourceFlag(Integer refundSourceFlag) {
      this.refundSourceFlag = refundSourceFlag;
   }

   @JsonProperty("refundSourceFlag")
   public Integer getRefundSourceFlag() {
      return this.refundSourceFlag;
   }

   @JsonProperty("totalPrice")
   public void setTotalPrice(BigDecimal totalPrice) {
      this.totalPrice = totalPrice;
   }

   @JsonProperty("totalPrice")
   public BigDecimal getTotalPrice() {
      return this.totalPrice;
   }

   @JsonProperty("coId")
   public void setCoId(Long coId) {
      this.coId = coId;
   }

   @JsonProperty("coId")
   public Long getCoId() {
      return this.coId;
   }

   @JsonProperty("remark")
   public void setRemark(String remark) {
      this.remark = remark;
   }

   @JsonProperty("remark")
   public String getRemark() {
      return this.remark;
   }

   @JsonProperty("cityId")
   public void setCityId(Integer cityId) {
      this.cityId = cityId;
   }

   @JsonProperty("cityId")
   public Integer getCityId() {
      return this.cityId;
   }

   @JsonProperty("townId")
   public void setTownId(Integer townId) {
      this.townId = townId;
   }

   @JsonProperty("townId")
   public Integer getTownId() {
      return this.townId;
   }

   @JsonProperty("roId")
   public void setRoId(Long roId) {
      this.roId = roId;
   }

   @JsonProperty("roId")
   public Long getRoId() {
      return this.roId;
   }

   @JsonProperty("orgId")
   public void setOrgId(Long orgId) {
      this.orgId = orgId;
   }

   @JsonProperty("orgId")
   public Long getOrgId() {
      return this.orgId;
   }

   @JsonProperty("productStageName")
   public void setProductStageName(String productStageName) {
      this.productStageName = productStageName;
   }

   @JsonProperty("productStageName")
   public String getProductStageName() {
      return this.productStageName;
   }

   @JsonProperty("poId")
   public void setPoId(Long poId) {
      this.poId = poId;
   }

   @JsonProperty("poId")
   public Long getPoId() {
      return this.poId;
   }

   @JsonProperty("vendorCode")
   public void setVendorCode(String vendorCode) {
      this.vendorCode = vendorCode;
   }

   @JsonProperty("vendorCode")
   public String getVendorCode() {
      return this.vendorCode;
   }

   @JsonProperty("paymentType")
   public void setPaymentType(Integer paymentType) {
      this.paymentType = paymentType;
   }

   @JsonProperty("paymentType")
   public Integer getPaymentType() {
      return this.paymentType;
   }

   @JsonProperty("orderState")
   public void setOrderState(Integer orderState) {
      this.orderState = orderState;
   }

   @JsonProperty("orderState")
   public Integer getOrderState() {
      return this.orderState;
   }

   @JsonProperty("orderCreateDate")
   public void setOrderCreateDate(Date orderCreateDate) {
      this.orderCreateDate = orderCreateDate;
   }

   @JsonProperty("orderCreateDate")
   public Date getOrderCreateDate() {
      return this.orderCreateDate;
   }

   @JsonProperty("pin")
   public void setPin(String pin) {
      this.pin = pin;
   }

   @JsonProperty("pin")
   public String getPin() {
      return this.pin;
   }

   @JsonProperty("cityName")
   public void setCityName(String cityName) {
      this.cityName = cityName;
   }

   @JsonProperty("cityName")
   public String getCityName() {
      return this.cityName;
   }

   @JsonProperty("totalPurchasePrice")
   public void setTotalPurchasePrice(BigDecimal totalPurchasePrice) {
      this.totalPurchasePrice = totalPurchasePrice;
   }

   @JsonProperty("totalPurchasePrice")
   public BigDecimal getTotalPurchasePrice() {
      return this.totalPurchasePrice;
   }

   @JsonProperty("countyId")
   public void setCountyId(Integer countyId) {
      this.countyId = countyId;
   }

   @JsonProperty("countyId")
   public Integer getCountyId() {
      return this.countyId;
   }

   @JsonProperty("vendorRemark")
   public void setVendorRemark(String vendorRemark) {
      this.vendorRemark = vendorRemark;
   }

   @JsonProperty("vendorRemark")
   public String getVendorRemark() {
      return this.vendorRemark;
   }

   @JsonProperty("tel")
   public void setTel(String tel) {
      this.tel = tel;
   }

   @JsonProperty("tel")
   public String getTel() {
      return this.tel;
   }

   @JsonProperty("totalCarriage")
   public void setTotalCarriage(BigDecimal totalCarriage) {
      this.totalCarriage = totalCarriage;
   }

   @JsonProperty("totalCarriage")
   public BigDecimal getTotalCarriage() {
      return this.totalCarriage;
   }

   @JsonProperty("email")
   public void setEmail(String email) {
      this.email = email;
   }

   @JsonProperty("email")
   public String getEmail() {
      return this.email;
   }

   @JsonProperty("countyName")
   public void setCountyName(String countyName) {
      this.countyName = countyName;
   }

   @JsonProperty("countyName")
   public String getCountyName() {
      return this.countyName;
   }

   @JsonProperty("zip")
   public void setZip(String zip) {
      this.zip = zip;
   }

   @JsonProperty("zip")
   public String getZip() {
      return this.zip;
   }

   @JsonProperty("reduce")
   public void setReduce(BigDecimal reduce) {
      this.reduce = reduce;
   }

   @JsonProperty("reduce")
   public BigDecimal getReduce() {
      return this.reduce;
   }

   @JsonProperty("townName")
   public void setTownName(String townName) {
      this.townName = townName;
   }

   @JsonProperty("townName")
   public String getTownName() {
      return this.townName;
   }

   @JsonProperty("address")
   public void setAddress(String address) {
      this.address = address;
   }

   @JsonProperty("address")
   public String getAddress() {
      return this.address;
   }

   @JsonProperty("orgName")
   public void setOrgName(String orgName) {
      this.orgName = orgName;
   }

   @JsonProperty("orgName")
   public String getOrgName() {
      return this.orgName;
   }

   @JsonProperty("productStageId")
   public void setProductStageId(Long productStageId) {
      this.productStageId = productStageId;
   }

   @JsonProperty("productStageId")
   public Long getProductStageId() {
      return this.productStageId;
   }

   @JsonProperty("pay")
   public void setPay(BigDecimal pay) {
      this.pay = pay;
   }

   @JsonProperty("pay")
   public BigDecimal getPay() {
      return this.pay;
   }

   @JsonProperty("storeId")
   public void setStoreId(Long storeId) {
      this.storeId = storeId;
   }

   @JsonProperty("storeId")
   public Long getStoreId() {
      return this.storeId;
   }

   @JsonProperty("provinceId")
   public void setProvinceId(Integer provinceId) {
      this.provinceId = provinceId;
   }

   @JsonProperty("provinceId")
   public Integer getProvinceId() {
      return this.provinceId;
   }

   @JsonProperty("presale")
   public void setPresale(Integer presale) {
      this.presale = presale;
   }

   @JsonProperty("presale")
   public Integer getPresale() {
      return this.presale;
   }

   @JsonProperty("customerName")
   public void setCustomerName(String customerName) {
      this.customerName = customerName;
   }

   @JsonProperty("customerName")
   public String getCustomerName() {
      return this.customerName;
   }

   @JsonProperty("deliverId")
   public void setDeliverId(Long deliverId) {
      this.deliverId = deliverId;
   }

   @JsonProperty("deliverId")
   public Long getDeliverId() {
      return this.deliverId;
   }

   @JsonProperty("isJdexpress")
   public void setIsJdexpress(Integer isJdexpress) {
      this.isJdexpress = isJdexpress;
   }

   @JsonProperty("isJdexpress")
   public Integer getIsJdexpress() {
      return this.isJdexpress;
   }

   @JsonProperty("phone")
   public void setPhone(String phone) {
      this.phone = phone;
   }

   @JsonProperty("phone")
   public String getPhone() {
      return this.phone;
   }

   @JsonProperty("provinceName")
   public void setProvinceName(String provinceName) {
      this.provinceName = provinceName;
   }

   @JsonProperty("provinceName")
   public String getProvinceName() {
      return this.provinceName;
   }

   @JsonProperty("deliverName")
   public void setDeliverName(String deliverName) {
      this.deliverName = deliverName;
   }

   @JsonProperty("deliverName")
   public String getDeliverName() {
      return this.deliverName;
   }

   @JsonProperty("modifiedDate")
   public void setModifiedDate(Date modifiedDate) {
      this.modifiedDate = modifiedDate;
   }

   @JsonProperty("modifiedDate")
   public Date getModifiedDate() {
      return this.modifiedDate;
   }

   @JsonProperty("oaid")
   public void setOaid(String oaid) {
      this.oaid = oaid;
   }

   @JsonProperty("oaid")
   public String getOaid() {
      return this.oaid;
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
