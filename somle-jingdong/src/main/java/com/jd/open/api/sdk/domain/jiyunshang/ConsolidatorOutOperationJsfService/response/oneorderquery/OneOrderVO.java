package com.jd.open.api.sdk.domain.jiyunshang.ConsolidatorOutOperationJsfService.response.oneorderquery;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;

public class OneOrderVO implements Serializable {
   private Long oneOrderId;
   private Date orderTime;
   private Date updateTime;
   private Integer orderStatus;
   private String waybillNumber;
   private String destCountryName;
   private String consigneeName;
   private String consigneeAddress;
   private String consigneePhone;
   private String consigneeEmail;
   private String zipCode;
   private String pin;
   private String extStr;
   private OneOrderItemVO[] oneOrderItems;
   private String consolidatorServiceCode;
   private String consolidatorServiceName;
   private Long idPickSite;
   private String idPickSiteName;

   @JsonProperty("oneOrderId")
   public void setOneOrderId(Long oneOrderId) {
      this.oneOrderId = oneOrderId;
   }

   @JsonProperty("oneOrderId")
   public Long getOneOrderId() {
      return this.oneOrderId;
   }

   @JsonProperty("orderTime")
   public void setOrderTime(Date orderTime) {
      this.orderTime = orderTime;
   }

   @JsonProperty("orderTime")
   public Date getOrderTime() {
      return this.orderTime;
   }

   @JsonProperty("updateTime")
   public void setUpdateTime(Date updateTime) {
      this.updateTime = updateTime;
   }

   @JsonProperty("updateTime")
   public Date getUpdateTime() {
      return this.updateTime;
   }

   @JsonProperty("orderStatus")
   public void setOrderStatus(Integer orderStatus) {
      this.orderStatus = orderStatus;
   }

   @JsonProperty("orderStatus")
   public Integer getOrderStatus() {
      return this.orderStatus;
   }

   @JsonProperty("waybillNumber")
   public void setWaybillNumber(String waybillNumber) {
      this.waybillNumber = waybillNumber;
   }

   @JsonProperty("waybillNumber")
   public String getWaybillNumber() {
      return this.waybillNumber;
   }

   @JsonProperty("destCountryName")
   public void setDestCountryName(String destCountryName) {
      this.destCountryName = destCountryName;
   }

   @JsonProperty("destCountryName")
   public String getDestCountryName() {
      return this.destCountryName;
   }

   @JsonProperty("consigneeName")
   public void setConsigneeName(String consigneeName) {
      this.consigneeName = consigneeName;
   }

   @JsonProperty("consigneeName")
   public String getConsigneeName() {
      return this.consigneeName;
   }

   @JsonProperty("consigneeAddress")
   public void setConsigneeAddress(String consigneeAddress) {
      this.consigneeAddress = consigneeAddress;
   }

   @JsonProperty("consigneeAddress")
   public String getConsigneeAddress() {
      return this.consigneeAddress;
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

   @JsonProperty("zipCode")
   public void setZipCode(String zipCode) {
      this.zipCode = zipCode;
   }

   @JsonProperty("zipCode")
   public String getZipCode() {
      return this.zipCode;
   }

   @JsonProperty("pin")
   public void setPin(String pin) {
      this.pin = pin;
   }

   @JsonProperty("pin")
   public String getPin() {
      return this.pin;
   }

   @JsonProperty("extStr")
   public void setExtStr(String extStr) {
      this.extStr = extStr;
   }

   @JsonProperty("extStr")
   public String getExtStr() {
      return this.extStr;
   }

   @JsonProperty("oneOrderItems")
   public void setOneOrderItems(OneOrderItemVO[] oneOrderItems) {
      this.oneOrderItems = oneOrderItems;
   }

   @JsonProperty("oneOrderItems")
   public OneOrderItemVO[] getOneOrderItems() {
      return this.oneOrderItems;
   }

   @JsonProperty("consolidatorServiceCode")
   public void setConsolidatorServiceCode(String consolidatorServiceCode) {
      this.consolidatorServiceCode = consolidatorServiceCode;
   }

   @JsonProperty("consolidatorServiceCode")
   public String getConsolidatorServiceCode() {
      return this.consolidatorServiceCode;
   }

   @JsonProperty("consolidatorServiceName")
   public void setConsolidatorServiceName(String consolidatorServiceName) {
      this.consolidatorServiceName = consolidatorServiceName;
   }

   @JsonProperty("consolidatorServiceName")
   public String getConsolidatorServiceName() {
      return this.consolidatorServiceName;
   }

   @JsonProperty("idPickSite")
   public void setIdPickSite(Long idPickSite) {
      this.idPickSite = idPickSite;
   }

   @JsonProperty("idPickSite")
   public Long getIdPickSite() {
      return this.idPickSite;
   }

   @JsonProperty("idPickSiteName")
   public void setIdPickSiteName(String idPickSiteName) {
      this.idPickSiteName = idPickSiteName;
   }

   @JsonProperty("idPickSiteName")
   public String getIdPickSiteName() {
      return this.idPickSiteName;
   }
}
