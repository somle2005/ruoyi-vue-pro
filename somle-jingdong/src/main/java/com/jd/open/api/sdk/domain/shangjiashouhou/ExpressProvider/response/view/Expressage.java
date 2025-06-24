package com.jd.open.api.sdk.domain.shangjiashouhou.ExpressProvider.response.view;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class Expressage implements Serializable {
   private Long serviceId;
   private String expressCode;
   private String expressCompany;
   private BigDecimal finalFreightMoney;
   private BigDecimal freightMoney;
   private BigDecimal modifiedMoney;
   private Boolean repeatFreightFlag;
   private Date deliveryDate;
   private Date firstUploadDate;
   private Integer shipWayId;
   private List<FreightLog> freightLogList;
   private String extJsonStr;

   @JsonProperty("serviceId")
   public void setServiceId(Long serviceId) {
      this.serviceId = serviceId;
   }

   @JsonProperty("serviceId")
   public Long getServiceId() {
      return this.serviceId;
   }

   @JsonProperty("expressCode")
   public void setExpressCode(String expressCode) {
      this.expressCode = expressCode;
   }

   @JsonProperty("expressCode")
   public String getExpressCode() {
      return this.expressCode;
   }

   @JsonProperty("expressCompany")
   public void setExpressCompany(String expressCompany) {
      this.expressCompany = expressCompany;
   }

   @JsonProperty("expressCompany")
   public String getExpressCompany() {
      return this.expressCompany;
   }

   @JsonProperty("finalFreightMoney")
   public void setFinalFreightMoney(BigDecimal finalFreightMoney) {
      this.finalFreightMoney = finalFreightMoney;
   }

   @JsonProperty("finalFreightMoney")
   public BigDecimal getFinalFreightMoney() {
      return this.finalFreightMoney;
   }

   @JsonProperty("freightMoney")
   public void setFreightMoney(BigDecimal freightMoney) {
      this.freightMoney = freightMoney;
   }

   @JsonProperty("freightMoney")
   public BigDecimal getFreightMoney() {
      return this.freightMoney;
   }

   @JsonProperty("modifiedMoney")
   public void setModifiedMoney(BigDecimal modifiedMoney) {
      this.modifiedMoney = modifiedMoney;
   }

   @JsonProperty("modifiedMoney")
   public BigDecimal getModifiedMoney() {
      return this.modifiedMoney;
   }

   @JsonProperty("repeatFreightFlag")
   public void setRepeatFreightFlag(Boolean repeatFreightFlag) {
      this.repeatFreightFlag = repeatFreightFlag;
   }

   @JsonProperty("repeatFreightFlag")
   public Boolean getRepeatFreightFlag() {
      return this.repeatFreightFlag;
   }

   @JsonProperty("deliveryDate")
   public void setDeliveryDate(Date deliveryDate) {
      this.deliveryDate = deliveryDate;
   }

   @JsonProperty("deliveryDate")
   public Date getDeliveryDate() {
      return this.deliveryDate;
   }

   @JsonProperty("firstUploadDate")
   public void setFirstUploadDate(Date firstUploadDate) {
      this.firstUploadDate = firstUploadDate;
   }

   @JsonProperty("firstUploadDate")
   public Date getFirstUploadDate() {
      return this.firstUploadDate;
   }

   @JsonProperty("shipWayId")
   public void setShipWayId(Integer shipWayId) {
      this.shipWayId = shipWayId;
   }

   @JsonProperty("shipWayId")
   public Integer getShipWayId() {
      return this.shipWayId;
   }

   @JsonProperty("freightLogList")
   public void setFreightLogList(List<FreightLog> freightLogList) {
      this.freightLogList = freightLogList;
   }

   @JsonProperty("freightLogList")
   public List<FreightLog> getFreightLogList() {
      return this.freightLogList;
   }

   @JsonProperty("extJsonStr")
   public void setExtJsonStr(String extJsonStr) {
      this.extJsonStr = extJsonStr;
   }

   @JsonProperty("extJsonStr")
   public String getExtJsonStr() {
      return this.extJsonStr;
   }
}
