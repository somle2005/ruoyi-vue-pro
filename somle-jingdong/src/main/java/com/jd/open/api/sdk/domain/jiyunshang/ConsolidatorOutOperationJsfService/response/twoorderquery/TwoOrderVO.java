package com.jd.open.api.sdk.domain.jiyunshang.ConsolidatorOutOperationJsfService.response.twoorderquery;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;

public class TwoOrderVO implements Serializable {
   private Long twoOrderId;
   private Integer orderStatus;
   private Long shippingAmount;
   private Date orderTime;
   private Date updateTime;
   private Date payTime;
   private Long returnAmount;
   private Long valueServiceAmount;
   private Long actualAmount;
   private String destCountryName;
   private String consigneeName;
   private String consigneeAddress;
   private String consigneePhone;
   private String consigneeEmail;
   private String zipCode;
   private String pin;
   private String extStr;
   private TwoOrderItemVO[] twoOrderItems;
   private TwoOrderValueServiceVO[] valueServiceItems;
   private String consolidatorServiceCode;
   private String consolidatorServiceName;
   private Long idPickSite;
   private String idPickSiteName;
   private String customsInformation;

   @JsonProperty("twoOrderId")
   public void setTwoOrderId(Long twoOrderId) {
      this.twoOrderId = twoOrderId;
   }

   @JsonProperty("twoOrderId")
   public Long getTwoOrderId() {
      return this.twoOrderId;
   }

   @JsonProperty("orderStatus")
   public void setOrderStatus(Integer orderStatus) {
      this.orderStatus = orderStatus;
   }

   @JsonProperty("orderStatus")
   public Integer getOrderStatus() {
      return this.orderStatus;
   }

   @JsonProperty("shippingAmount")
   public void setShippingAmount(Long shippingAmount) {
      this.shippingAmount = shippingAmount;
   }

   @JsonProperty("shippingAmount")
   public Long getShippingAmount() {
      return this.shippingAmount;
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

   @JsonProperty("payTime")
   public void setPayTime(Date payTime) {
      this.payTime = payTime;
   }

   @JsonProperty("payTime")
   public Date getPayTime() {
      return this.payTime;
   }

   @JsonProperty("returnAmount")
   public void setReturnAmount(Long returnAmount) {
      this.returnAmount = returnAmount;
   }

   @JsonProperty("returnAmount")
   public Long getReturnAmount() {
      return this.returnAmount;
   }

   @JsonProperty("valueServiceAmount")
   public void setValueServiceAmount(Long valueServiceAmount) {
      this.valueServiceAmount = valueServiceAmount;
   }

   @JsonProperty("valueServiceAmount")
   public Long getValueServiceAmount() {
      return this.valueServiceAmount;
   }

   @JsonProperty("actualAmount")
   public void setActualAmount(Long actualAmount) {
      this.actualAmount = actualAmount;
   }

   @JsonProperty("actualAmount")
   public Long getActualAmount() {
      return this.actualAmount;
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

   @JsonProperty("twoOrderItems")
   public void setTwoOrderItems(TwoOrderItemVO[] twoOrderItems) {
      this.twoOrderItems = twoOrderItems;
   }

   @JsonProperty("twoOrderItems")
   public TwoOrderItemVO[] getTwoOrderItems() {
      return this.twoOrderItems;
   }

   @JsonProperty("valueServiceItems")
   public void setValueServiceItems(TwoOrderValueServiceVO[] valueServiceItems) {
      this.valueServiceItems = valueServiceItems;
   }

   @JsonProperty("valueServiceItems")
   public TwoOrderValueServiceVO[] getValueServiceItems() {
      return this.valueServiceItems;
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

   @JsonProperty("customsInformation")
   public void setCustomsInformation(String customsInformation) {
      this.customsInformation = customsInformation;
   }

   @JsonProperty("customsInformation")
   public String getCustomsInformation() {
      return this.customsInformation;
   }
}
