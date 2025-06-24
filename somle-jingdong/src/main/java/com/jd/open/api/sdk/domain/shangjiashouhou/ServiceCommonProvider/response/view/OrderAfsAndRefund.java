package com.jd.open.api.sdk.domain.shangjiashouhou.ServiceCommonProvider.response.view;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class OrderAfsAndRefund implements Serializable {
   private SameOrderServiceBill sameOrderServiceBill;
   private Long afsRefundId;
   private BigDecimal refoundAmount;
   private Date completeTime;
   private Integer status;

   @JsonProperty("sameOrderServiceBill")
   public void setSameOrderServiceBill(SameOrderServiceBill sameOrderServiceBill) {
      this.sameOrderServiceBill = sameOrderServiceBill;
   }

   @JsonProperty("sameOrderServiceBill")
   public SameOrderServiceBill getSameOrderServiceBill() {
      return this.sameOrderServiceBill;
   }

   @JsonProperty("afsRefundId")
   public void setAfsRefundId(Long afsRefundId) {
      this.afsRefundId = afsRefundId;
   }

   @JsonProperty("afsRefundId")
   public Long getAfsRefundId() {
      return this.afsRefundId;
   }

   @JsonProperty("refoundAmount")
   public void setRefoundAmount(BigDecimal refoundAmount) {
      this.refoundAmount = refoundAmount;
   }

   @JsonProperty("refoundAmount")
   public BigDecimal getRefoundAmount() {
      return this.refoundAmount;
   }

   @JsonProperty("completeTime")
   public void setCompleteTime(Date completeTime) {
      this.completeTime = completeTime;
   }

   @JsonProperty("completeTime")
   public Date getCompleteTime() {
      return this.completeTime;
   }

   @JsonProperty("status")
   public void setStatus(Integer status) {
      this.status = status;
   }

   @JsonProperty("status")
   public Integer getStatus() {
      return this.status;
   }
}
