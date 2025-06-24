package com.jd.open.api.sdk.domain.jyy.VenderAppointOrderFacade.response.getAppointList;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class AppointVO implements Serializable {
   private Long appointOrderId;
   private String cardNo;
   private String skuId;
   private String skuName;
   private String appointStartTime;
   private Integer appointStatus;
   private String chAppointStatus;
   private String customerName;
   private String customerPhone;
   private String customerAddress;
   private String created;
   private String oaid;

   @JsonProperty("appointOrderId")
   public void setAppointOrderId(Long appointOrderId) {
      this.appointOrderId = appointOrderId;
   }

   @JsonProperty("appointOrderId")
   public Long getAppointOrderId() {
      return this.appointOrderId;
   }

   @JsonProperty("cardNo")
   public void setCardNo(String cardNo) {
      this.cardNo = cardNo;
   }

   @JsonProperty("cardNo")
   public String getCardNo() {
      return this.cardNo;
   }

   @JsonProperty("skuId")
   public void setSkuId(String skuId) {
      this.skuId = skuId;
   }

   @JsonProperty("skuId")
   public String getSkuId() {
      return this.skuId;
   }

   @JsonProperty("skuName")
   public void setSkuName(String skuName) {
      this.skuName = skuName;
   }

   @JsonProperty("skuName")
   public String getSkuName() {
      return this.skuName;
   }

   @JsonProperty("appointStartTime")
   public void setAppointStartTime(String appointStartTime) {
      this.appointStartTime = appointStartTime;
   }

   @JsonProperty("appointStartTime")
   public String getAppointStartTime() {
      return this.appointStartTime;
   }

   @JsonProperty("appointStatus")
   public void setAppointStatus(Integer appointStatus) {
      this.appointStatus = appointStatus;
   }

   @JsonProperty("appointStatus")
   public Integer getAppointStatus() {
      return this.appointStatus;
   }

   @JsonProperty("chAppointStatus")
   public void setChAppointStatus(String chAppointStatus) {
      this.chAppointStatus = chAppointStatus;
   }

   @JsonProperty("chAppointStatus")
   public String getChAppointStatus() {
      return this.chAppointStatus;
   }

   @JsonProperty("customerName")
   public void setCustomerName(String customerName) {
      this.customerName = customerName;
   }

   @JsonProperty("customerName")
   public String getCustomerName() {
      return this.customerName;
   }

   @JsonProperty("customerPhone")
   public void setCustomerPhone(String customerPhone) {
      this.customerPhone = customerPhone;
   }

   @JsonProperty("customerPhone")
   public String getCustomerPhone() {
      return this.customerPhone;
   }

   @JsonProperty("customerAddress")
   public void setCustomerAddress(String customerAddress) {
      this.customerAddress = customerAddress;
   }

   @JsonProperty("customerAddress")
   public String getCustomerAddress() {
      return this.customerAddress;
   }

   @JsonProperty("created")
   public void setCreated(String created) {
      this.created = created;
   }

   @JsonProperty("created")
   public String getCreated() {
      return this.created;
   }

   @JsonProperty("oaid")
   public void setOaid(String oaid) {
      this.oaid = oaid;
   }

   @JsonProperty("oaid")
   public String getOaid() {
      return this.oaid;
   }
}
