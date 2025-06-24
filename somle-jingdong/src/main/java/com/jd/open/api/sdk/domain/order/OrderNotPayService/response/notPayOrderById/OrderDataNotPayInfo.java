package com.jd.open.api.sdk.domain.order.OrderNotPayService.response.notPayOrderById;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class OrderDataNotPayInfo implements Serializable {
   private Long id;
   private Long orderId;
   private Long venderId;
   private Integer payment;
   private Integer orderType;
   private Long parentId;
   private String orderCreated;
   private Integer status;
   private String userName;
   private String address;
   private String mobile;
   private String phone;
   private Date created;
   private Date modified;
   private String pin;
   private String sendPay;
   private List<OrderItemNotPayInfo> itemList;
   private Integer provinceId;
   private Integer cityId;
   private Integer countyId;
   private Integer townId;
   private Map<String, String> orderMarkDesc;
   private String oaid;
   private String desenMobile;
   private String desenPhone;
   private String openIdBuyer;
   private String xidBuyer;

   @JsonProperty("id")
   public void setId(Long id) {
      this.id = id;
   }

   @JsonProperty("id")
   public Long getId() {
      return this.id;
   }

   @JsonProperty("orderId")
   public void setOrderId(Long orderId) {
      this.orderId = orderId;
   }

   @JsonProperty("orderId")
   public Long getOrderId() {
      return this.orderId;
   }

   @JsonProperty("venderId")
   public void setVenderId(Long venderId) {
      this.venderId = venderId;
   }

   @JsonProperty("venderId")
   public Long getVenderId() {
      return this.venderId;
   }

   @JsonProperty("payment")
   public void setPayment(Integer payment) {
      this.payment = payment;
   }

   @JsonProperty("payment")
   public Integer getPayment() {
      return this.payment;
   }

   @JsonProperty("orderType")
   public void setOrderType(Integer orderType) {
      this.orderType = orderType;
   }

   @JsonProperty("orderType")
   public Integer getOrderType() {
      return this.orderType;
   }

   @JsonProperty("parentId")
   public void setParentId(Long parentId) {
      this.parentId = parentId;
   }

   @JsonProperty("parentId")
   public Long getParentId() {
      return this.parentId;
   }

   @JsonProperty("orderCreated")
   public void setOrderCreated(String orderCreated) {
      this.orderCreated = orderCreated;
   }

   @JsonProperty("orderCreated")
   public String getOrderCreated() {
      return this.orderCreated;
   }

   @JsonProperty("status")
   public void setStatus(Integer status) {
      this.status = status;
   }

   @JsonProperty("status")
   public Integer getStatus() {
      return this.status;
   }

   @JsonProperty("userName")
   public void setUserName(String userName) {
      this.userName = userName;
   }

   @JsonProperty("userName")
   public String getUserName() {
      return this.userName;
   }

   @JsonProperty("address")
   public void setAddress(String address) {
      this.address = address;
   }

   @JsonProperty("address")
   public String getAddress() {
      return this.address;
   }

   @JsonProperty("mobile")
   public void setMobile(String mobile) {
      this.mobile = mobile;
   }

   @JsonProperty("mobile")
   public String getMobile() {
      return this.mobile;
   }

   @JsonProperty("phone")
   public void setPhone(String phone) {
      this.phone = phone;
   }

   @JsonProperty("phone")
   public String getPhone() {
      return this.phone;
   }

   @JsonProperty("created")
   public void setCreated(Date created) {
      this.created = created;
   }

   @JsonProperty("created")
   public Date getCreated() {
      return this.created;
   }

   @JsonProperty("modified")
   public void setModified(Date modified) {
      this.modified = modified;
   }

   @JsonProperty("modified")
   public Date getModified() {
      return this.modified;
   }

   @JsonProperty("pin")
   public void setPin(String pin) {
      this.pin = pin;
   }

   @JsonProperty("pin")
   public String getPin() {
      return this.pin;
   }

   @JsonProperty("sendPay")
   public void setSendPay(String sendPay) {
      this.sendPay = sendPay;
   }

   @JsonProperty("sendPay")
   public String getSendPay() {
      return this.sendPay;
   }

   @JsonProperty("itemList")
   public void setItemList(List<OrderItemNotPayInfo> itemList) {
      this.itemList = itemList;
   }

   @JsonProperty("itemList")
   public List<OrderItemNotPayInfo> getItemList() {
      return this.itemList;
   }

   @JsonProperty("provinceId")
   public void setProvinceId(Integer provinceId) {
      this.provinceId = provinceId;
   }

   @JsonProperty("provinceId")
   public Integer getProvinceId() {
      return this.provinceId;
   }

   @JsonProperty("cityId")
   public void setCityId(Integer cityId) {
      this.cityId = cityId;
   }

   @JsonProperty("cityId")
   public Integer getCityId() {
      return this.cityId;
   }

   @JsonProperty("countyId")
   public void setCountyId(Integer countyId) {
      this.countyId = countyId;
   }

   @JsonProperty("countyId")
   public Integer getCountyId() {
      return this.countyId;
   }

   @JsonProperty("townId")
   public void setTownId(Integer townId) {
      this.townId = townId;
   }

   @JsonProperty("townId")
   public Integer getTownId() {
      return this.townId;
   }

   @JsonProperty("orderMarkDesc")
   public void setOrderMarkDesc(Map<String, String> orderMarkDesc) {
      this.orderMarkDesc = orderMarkDesc;
   }

   @JsonProperty("orderMarkDesc")
   public Map<String, String> getOrderMarkDesc() {
      return this.orderMarkDesc;
   }

   @JsonProperty("oaid")
   public void setOaid(String oaid) {
      this.oaid = oaid;
   }

   @JsonProperty("oaid")
   public String getOaid() {
      return this.oaid;
   }

   @JsonProperty("desen_mobile")
   public void setDesenMobile(String desenMobile) {
      this.desenMobile = desenMobile;
   }

   @JsonProperty("desen_mobile")
   public String getDesenMobile() {
      return this.desenMobile;
   }

   @JsonProperty("desen_phone")
   public void setDesenPhone(String desenPhone) {
      this.desenPhone = desenPhone;
   }

   @JsonProperty("desen_phone")
   public String getDesenPhone() {
      return this.desenPhone;
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
