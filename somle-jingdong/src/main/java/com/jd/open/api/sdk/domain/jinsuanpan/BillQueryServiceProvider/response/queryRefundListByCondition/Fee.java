package com.jd.open.api.sdk.domain.jinsuanpan.BillQueryServiceProvider.response.queryRefundListByCondition;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Fee implements Serializable {
   private BigDecimal money;
   private Integer settlementStatus;
   private Date settlementTime;
   private String detailId;
   private String currency;
   private String businessUuid;
   private Integer feeType;
   private String billNo;
   private Long chargingRecordId;
   private Integer direction;
   private Long settlementRecordId;
   private String skuId;
   private String skuName;
   private Long count;

   @JsonProperty("money")
   public void setMoney(BigDecimal money) {
      this.money = money;
   }

   @JsonProperty("money")
   public BigDecimal getMoney() {
      return this.money;
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

   @JsonProperty("detailId")
   public void setDetailId(String detailId) {
      this.detailId = detailId;
   }

   @JsonProperty("detailId")
   public String getDetailId() {
      return this.detailId;
   }

   @JsonProperty("currency")
   public void setCurrency(String currency) {
      this.currency = currency;
   }

   @JsonProperty("currency")
   public String getCurrency() {
      return this.currency;
   }

   @JsonProperty("businessUuid")
   public void setBusinessUuid(String businessUuid) {
      this.businessUuid = businessUuid;
   }

   @JsonProperty("businessUuid")
   public String getBusinessUuid() {
      return this.businessUuid;
   }

   @JsonProperty("feeType")
   public void setFeeType(Integer feeType) {
      this.feeType = feeType;
   }

   @JsonProperty("feeType")
   public Integer getFeeType() {
      return this.feeType;
   }

   @JsonProperty("billNo")
   public void setBillNo(String billNo) {
      this.billNo = billNo;
   }

   @JsonProperty("billNo")
   public String getBillNo() {
      return this.billNo;
   }

   @JsonProperty("chargingRecordId")
   public void setChargingRecordId(Long chargingRecordId) {
      this.chargingRecordId = chargingRecordId;
   }

   @JsonProperty("chargingRecordId")
   public Long getChargingRecordId() {
      return this.chargingRecordId;
   }

   @JsonProperty("direction")
   public void setDirection(Integer direction) {
      this.direction = direction;
   }

   @JsonProperty("direction")
   public Integer getDirection() {
      return this.direction;
   }

   @JsonProperty("settlementRecordId")
   public void setSettlementRecordId(Long settlementRecordId) {
      this.settlementRecordId = settlementRecordId;
   }

   @JsonProperty("settlementRecordId")
   public Long getSettlementRecordId() {
      return this.settlementRecordId;
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

   @JsonProperty("count")
   public void setCount(Long count) {
      this.count = count;
   }

   @JsonProperty("count")
   public Long getCount() {
      return this.count;
   }
}
