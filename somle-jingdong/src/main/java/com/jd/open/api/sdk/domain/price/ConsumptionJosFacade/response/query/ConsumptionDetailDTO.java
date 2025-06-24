package com.jd.open.api.sdk.domain.price.ConsumptionJosFacade.response.query;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;

public class ConsumptionDetailDTO implements Serializable {
   private Integer quantity;
   private String userPin;
   private String faceValue;
   private Long typeId;
   private long consumptionId;
   private String requestId;
   private Date sendDate;
   private Integer status;
   private String statusDesc;
   private String remark;
   private String typeName;
   private String unit;
   private Long amount;
   private String cardNo;
   private String failureMessage;
   private String failureCode;
   private String openIdBuyer;
   private String xidBuyer;

   @JsonProperty("quantity")
   public void setQuantity(Integer quantity) {
      this.quantity = quantity;
   }

   @JsonProperty("quantity")
   public Integer getQuantity() {
      return this.quantity;
   }

   @JsonProperty("user_pin")
   public void setUserPin(String userPin) {
      this.userPin = userPin;
   }

   @JsonProperty("user_pin")
   public String getUserPin() {
      return this.userPin;
   }

   @JsonProperty("face_value")
   public void setFaceValue(String faceValue) {
      this.faceValue = faceValue;
   }

   @JsonProperty("face_value")
   public String getFaceValue() {
      return this.faceValue;
   }

   @JsonProperty("type_id")
   public void setTypeId(Long typeId) {
      this.typeId = typeId;
   }

   @JsonProperty("type_id")
   public Long getTypeId() {
      return this.typeId;
   }

   @JsonProperty("consumption_id")
   public void setConsumptionId(long consumptionId) {
      this.consumptionId = consumptionId;
   }

   @JsonProperty("consumption_id")
   public long getConsumptionId() {
      return this.consumptionId;
   }

   @JsonProperty("request_id")
   public void setRequestId(String requestId) {
      this.requestId = requestId;
   }

   @JsonProperty("request_id")
   public String getRequestId() {
      return this.requestId;
   }

   @JsonProperty("send_date")
   public void setSendDate(Date sendDate) {
      this.sendDate = sendDate;
   }

   @JsonProperty("send_date")
   public Date getSendDate() {
      return this.sendDate;
   }

   @JsonProperty("status")
   public void setStatus(Integer status) {
      this.status = status;
   }

   @JsonProperty("status")
   public Integer getStatus() {
      return this.status;
   }

   @JsonProperty("status_desc")
   public void setStatusDesc(String statusDesc) {
      this.statusDesc = statusDesc;
   }

   @JsonProperty("status_desc")
   public String getStatusDesc() {
      return this.statusDesc;
   }

   @JsonProperty("remark")
   public void setRemark(String remark) {
      this.remark = remark;
   }

   @JsonProperty("remark")
   public String getRemark() {
      return this.remark;
   }

   @JsonProperty("type_name")
   public void setTypeName(String typeName) {
      this.typeName = typeName;
   }

   @JsonProperty("type_name")
   public String getTypeName() {
      return this.typeName;
   }

   @JsonProperty("unit")
   public void setUnit(String unit) {
      this.unit = unit;
   }

   @JsonProperty("unit")
   public String getUnit() {
      return this.unit;
   }

   @JsonProperty("amount")
   public void setAmount(Long amount) {
      this.amount = amount;
   }

   @JsonProperty("amount")
   public Long getAmount() {
      return this.amount;
   }

   @JsonProperty("card_no")
   public void setCardNo(String cardNo) {
      this.cardNo = cardNo;
   }

   @JsonProperty("card_no")
   public String getCardNo() {
      return this.cardNo;
   }

   @JsonProperty("failureMessage")
   public void setFailureMessage(String failureMessage) {
      this.failureMessage = failureMessage;
   }

   @JsonProperty("failureMessage")
   public String getFailureMessage() {
      return this.failureMessage;
   }

   @JsonProperty("failureCode")
   public void setFailureCode(String failureCode) {
      this.failureCode = failureCode;
   }

   @JsonProperty("failureCode")
   public String getFailureCode() {
      return this.failureCode;
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
