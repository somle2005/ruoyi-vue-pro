package com.jd.open.api.sdk.domain.jinsuanpan.BillQueryServiceProvider.response.queryRefundBillChargeListByCondition;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class FeeMo implements Serializable {
   private String detailId;
   private BigDecimal money;
   private Integer direction;
   private String businessUuid;
   private Long billingRecordId;
   private Long settlementRecordId;
   private String currency;
   private Integer feeType;
   private Integer settlementStatus;
   private Date settlementTime;
   private String billNo;

   @JsonProperty("detailId")
   public void setDetailId(String detailId) {
      this.detailId = detailId;
   }

   @JsonProperty("detailId")
   public String getDetailId() {
      return this.detailId;
   }

   @JsonProperty("money")
   public void setMoney(BigDecimal money) {
      this.money = money;
   }

   @JsonProperty("money")
   public BigDecimal getMoney() {
      return this.money;
   }

   @JsonProperty("direction")
   public void setDirection(Integer direction) {
      this.direction = direction;
   }

   @JsonProperty("direction")
   public Integer getDirection() {
      return this.direction;
   }

   @JsonProperty("businessUuid")
   public void setBusinessUuid(String businessUuid) {
      this.businessUuid = businessUuid;
   }

   @JsonProperty("businessUuid")
   public String getBusinessUuid() {
      return this.businessUuid;
   }

   @JsonProperty("billingRecordId")
   public void setBillingRecordId(Long billingRecordId) {
      this.billingRecordId = billingRecordId;
   }

   @JsonProperty("billingRecordId")
   public Long getBillingRecordId() {
      return this.billingRecordId;
   }

   @JsonProperty("settlementRecordId")
   public void setSettlementRecordId(Long settlementRecordId) {
      this.settlementRecordId = settlementRecordId;
   }

   @JsonProperty("settlementRecordId")
   public Long getSettlementRecordId() {
      return this.settlementRecordId;
   }

   @JsonProperty("currency")
   public void setCurrency(String currency) {
      this.currency = currency;
   }

   @JsonProperty("currency")
   public String getCurrency() {
      return this.currency;
   }

   @JsonProperty("feeType")
   public void setFeeType(Integer feeType) {
      this.feeType = feeType;
   }

   @JsonProperty("feeType")
   public Integer getFeeType() {
      return this.feeType;
   }

   @JsonProperty("settlementStatus")
   public void setSettlementStatus(Integer settlementStatus) {
      this.settlementStatus = settlementStatus;
   }

   @JsonProperty("settlementStatus")
   public Integer getSettlementStatus() {
      return this.settlementStatus;
   }

   @JsonProperty("settlementTime")
   public void setSettlementTime(Date settlementTime) {
      this.settlementTime = settlementTime;
   }

   @JsonProperty("settlementTime")
   public Date getSettlementTime() {
      return this.settlementTime;
   }

   @JsonProperty("billNo")
   public void setBillNo(String billNo) {
      this.billNo = billNo;
   }

   @JsonProperty("billNo")
   public String getBillNo() {
      return this.billNo;
   }
}
