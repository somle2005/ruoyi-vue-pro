package com.jd.open.api.sdk.domain.etms.AbnormalOrderRequestApi.response.get;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;

public class AbnormalOrderInfoDTO implements Serializable {
   private String[] orderId;
   private String[] deliveryId;
   private Date[] operateTime;
   private String[] mainTypeName;
   private String[] reqestComment;
   private Integer currentAuditCounter;
   private Integer totalAuditCounter;

   @JsonProperty("orderId")
   public void setOrderId(String[] orderId) {
      this.orderId = orderId;
   }

   @JsonProperty("orderId")
   public String[] getOrderId() {
      return this.orderId;
   }

   @JsonProperty("deliveryId")
   public void setDeliveryId(String[] deliveryId) {
      this.deliveryId = deliveryId;
   }

   @JsonProperty("deliveryId")
   public String[] getDeliveryId() {
      return this.deliveryId;
   }

   @JsonProperty("operateTime")
   public void setOperateTime(Date[] operateTime) {
      this.operateTime = operateTime;
   }

   @JsonProperty("operateTime")
   public Date[] getOperateTime() {
      return this.operateTime;
   }

   @JsonProperty("mainTypeName")
   public void setMainTypeName(String[] mainTypeName) {
      this.mainTypeName = mainTypeName;
   }

   @JsonProperty("mainTypeName")
   public String[] getMainTypeName() {
      return this.mainTypeName;
   }

   @JsonProperty("reqestComment")
   public void setReqestComment(String[] reqestComment) {
      this.reqestComment = reqestComment;
   }

   @JsonProperty("reqestComment")
   public String[] getReqestComment() {
      return this.reqestComment;
   }

   @JsonProperty("currentAuditCounter")
   public void setCurrentAuditCounter(Integer currentAuditCounter) {
      this.currentAuditCounter = currentAuditCounter;
   }

   @JsonProperty("currentAuditCounter")
   public Integer getCurrentAuditCounter() {
      return this.currentAuditCounter;
   }

   @JsonProperty("totalAuditCounter")
   public void setTotalAuditCounter(Integer totalAuditCounter) {
      this.totalAuditCounter = totalAuditCounter;
   }

   @JsonProperty("totalAuditCounter")
   public Integer getTotalAuditCounter() {
      return this.totalAuditCounter;
   }
}
