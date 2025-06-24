package com.jd.open.api.sdk.domain.jinsuanpan.BillQueryServiceProvider.response.queryBillChargeListByCondition;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class SkuMo implements Serializable {
   private String detailId;
   private Long skuId;
   private Long count;
   private BigDecimal money;
   private Integer direction;
   private String businessUuid;
   private String currency;
   private Integer feeType;
   private Integer settlementStatus;
   private Date settlementTime;
   private String billNo;
   private Integer billType;
   private Date returnTime;
   private String skuUuid;
   private String bankFlow;
   private String settleRemark;
   private String merDate;

   @JsonProperty("detailId")
   public void setDetailId(String detailId) {
      this.detailId = detailId;
   }

   @JsonProperty("detailId")
   public String getDetailId() {
      return this.detailId;
   }

   @JsonProperty("skuId")
   public void setSkuId(Long skuId) {
      this.skuId = skuId;
   }

   @JsonProperty("skuId")
   public Long getSkuId() {
      return this.skuId;
   }

   @JsonProperty("count")
   public void setCount(Long count) {
      this.count = count;
   }

   @JsonProperty("count")
   public Long getCount() {
      return this.count;
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

   @JsonProperty("billType")
   public void setBillType(Integer billType) {
      this.billType = billType;
   }

   @JsonProperty("billType")
   public Integer getBillType() {
      return this.billType;
   }

   @JsonProperty("returnTime")
   public void setReturnTime(Date returnTime) {
      this.returnTime = returnTime;
   }

   @JsonProperty("returnTime")
   public Date getReturnTime() {
      return this.returnTime;
   }

   @JsonProperty("skuUuid")
   public void setSkuUuid(String skuUuid) {
      this.skuUuid = skuUuid;
   }

   @JsonProperty("skuUuid")
   public String getSkuUuid() {
      return this.skuUuid;
   }

   @JsonProperty("bankFlow")
   public void setBankFlow(String bankFlow) {
      this.bankFlow = bankFlow;
   }

   @JsonProperty("bankFlow")
   public String getBankFlow() {
      return this.bankFlow;
   }

   @JsonProperty("settleRemark")
   public void setSettleRemark(String settleRemark) {
      this.settleRemark = settleRemark;
   }

   @JsonProperty("settleRemark")
   public String getSettleRemark() {
      return this.settleRemark;
   }

   @JsonProperty("merDate")
   public void setMerDate(String merDate) {
      this.merDate = merDate;
   }

   @JsonProperty("merDate")
   public String getMerDate() {
      return this.merDate;
   }
}
