package com.jd.open.api.sdk.domain.seller.OrderPromoFullCouponService.response.getTrendData;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class FullCouponDataInfo implements Serializable {
   private Double lastCustPriceNum;
   private Date endDate;
   private Integer ordProNum;
   private BigDecimal accOrdAmt;
   private Double toOrdRate;
   private Integer accOrdNum;
   private String timeStr;
   private String platform;
   private Double lastOrdProNum;
   private BigDecimal custPriceAvg;
   private Double lastCustPriceAvg;
   private String member;
   private Long promoId;
   private Double custPriceNum;
   private Double lastToOrdRate;
   private Integer accOrdProNum;
   private Integer accOrdCustNum;
   private Integer promoType;
   private Integer ordCustNum;
   private String favor;
   private String dataName;
   private Double lastOrdCustNum;
   private BigDecimal ordAmt;
   private Integer ordNum;
   private Double lastOrdAmt;
   private Double lastOrdNum;
   private Date startDate;

   @JsonProperty("lastCustPriceNum")
   public void setLastCustPriceNum(Double lastCustPriceNum) {
      this.lastCustPriceNum = lastCustPriceNum;
   }

   @JsonProperty("lastCustPriceNum")
   public Double getLastCustPriceNum() {
      return this.lastCustPriceNum;
   }

   @JsonProperty("endDate")
   public void setEndDate(Date endDate) {
      this.endDate = endDate;
   }

   @JsonProperty("endDate")
   public Date getEndDate() {
      return this.endDate;
   }

   @JsonProperty("ordProNum")
   public void setOrdProNum(Integer ordProNum) {
      this.ordProNum = ordProNum;
   }

   @JsonProperty("ordProNum")
   public Integer getOrdProNum() {
      return this.ordProNum;
   }

   @JsonProperty("accOrdAmt")
   public void setAccOrdAmt(BigDecimal accOrdAmt) {
      this.accOrdAmt = accOrdAmt;
   }

   @JsonProperty("accOrdAmt")
   public BigDecimal getAccOrdAmt() {
      return this.accOrdAmt;
   }

   @JsonProperty("toOrdRate")
   public void setToOrdRate(Double toOrdRate) {
      this.toOrdRate = toOrdRate;
   }

   @JsonProperty("toOrdRate")
   public Double getToOrdRate() {
      return this.toOrdRate;
   }

   @JsonProperty("accOrdNum")
   public void setAccOrdNum(Integer accOrdNum) {
      this.accOrdNum = accOrdNum;
   }

   @JsonProperty("accOrdNum")
   public Integer getAccOrdNum() {
      return this.accOrdNum;
   }

   @JsonProperty("timeStr")
   public void setTimeStr(String timeStr) {
      this.timeStr = timeStr;
   }

   @JsonProperty("timeStr")
   public String getTimeStr() {
      return this.timeStr;
   }

   @JsonProperty("platform")
   public void setPlatform(String platform) {
      this.platform = platform;
   }

   @JsonProperty("platform")
   public String getPlatform() {
      return this.platform;
   }

   @JsonProperty("lastOrdProNum")
   public void setLastOrdProNum(Double lastOrdProNum) {
      this.lastOrdProNum = lastOrdProNum;
   }

   @JsonProperty("lastOrdProNum")
   public Double getLastOrdProNum() {
      return this.lastOrdProNum;
   }

   @JsonProperty("custPriceAvg")
   public void setCustPriceAvg(BigDecimal custPriceAvg) {
      this.custPriceAvg = custPriceAvg;
   }

   @JsonProperty("custPriceAvg")
   public BigDecimal getCustPriceAvg() {
      return this.custPriceAvg;
   }

   @JsonProperty("lastCustPriceAvg")
   public void setLastCustPriceAvg(Double lastCustPriceAvg) {
      this.lastCustPriceAvg = lastCustPriceAvg;
   }

   @JsonProperty("lastCustPriceAvg")
   public Double getLastCustPriceAvg() {
      return this.lastCustPriceAvg;
   }

   @JsonProperty("member")
   public void setMember(String member) {
      this.member = member;
   }

   @JsonProperty("member")
   public String getMember() {
      return this.member;
   }

   @JsonProperty("promoId")
   public void setPromoId(Long promoId) {
      this.promoId = promoId;
   }

   @JsonProperty("promoId")
   public Long getPromoId() {
      return this.promoId;
   }

   @JsonProperty("custPriceNum")
   public void setCustPriceNum(Double custPriceNum) {
      this.custPriceNum = custPriceNum;
   }

   @JsonProperty("custPriceNum")
   public Double getCustPriceNum() {
      return this.custPriceNum;
   }

   @JsonProperty("lastToOrdRate")
   public void setLastToOrdRate(Double lastToOrdRate) {
      this.lastToOrdRate = lastToOrdRate;
   }

   @JsonProperty("lastToOrdRate")
   public Double getLastToOrdRate() {
      return this.lastToOrdRate;
   }

   @JsonProperty("accOrdProNum")
   public void setAccOrdProNum(Integer accOrdProNum) {
      this.accOrdProNum = accOrdProNum;
   }

   @JsonProperty("accOrdProNum")
   public Integer getAccOrdProNum() {
      return this.accOrdProNum;
   }

   @JsonProperty("accOrdCustNum")
   public void setAccOrdCustNum(Integer accOrdCustNum) {
      this.accOrdCustNum = accOrdCustNum;
   }

   @JsonProperty("accOrdCustNum")
   public Integer getAccOrdCustNum() {
      return this.accOrdCustNum;
   }

   @JsonProperty("promoType")
   public void setPromoType(Integer promoType) {
      this.promoType = promoType;
   }

   @JsonProperty("promoType")
   public Integer getPromoType() {
      return this.promoType;
   }

   @JsonProperty("ordCustNum")
   public void setOrdCustNum(Integer ordCustNum) {
      this.ordCustNum = ordCustNum;
   }

   @JsonProperty("ordCustNum")
   public Integer getOrdCustNum() {
      return this.ordCustNum;
   }

   @JsonProperty("favor")
   public void setFavor(String favor) {
      this.favor = favor;
   }

   @JsonProperty("favor")
   public String getFavor() {
      return this.favor;
   }

   @JsonProperty("dataName")
   public void setDataName(String dataName) {
      this.dataName = dataName;
   }

   @JsonProperty("dataName")
   public String getDataName() {
      return this.dataName;
   }

   @JsonProperty("lastOrdCustNum")
   public void setLastOrdCustNum(Double lastOrdCustNum) {
      this.lastOrdCustNum = lastOrdCustNum;
   }

   @JsonProperty("lastOrdCustNum")
   public Double getLastOrdCustNum() {
      return this.lastOrdCustNum;
   }

   @JsonProperty("ordAmt")
   public void setOrdAmt(BigDecimal ordAmt) {
      this.ordAmt = ordAmt;
   }

   @JsonProperty("ordAmt")
   public BigDecimal getOrdAmt() {
      return this.ordAmt;
   }

   @JsonProperty("ordNum")
   public void setOrdNum(Integer ordNum) {
      this.ordNum = ordNum;
   }

   @JsonProperty("ordNum")
   public Integer getOrdNum() {
      return this.ordNum;
   }

   @JsonProperty("lastOrdAmt")
   public void setLastOrdAmt(Double lastOrdAmt) {
      this.lastOrdAmt = lastOrdAmt;
   }

   @JsonProperty("lastOrdAmt")
   public Double getLastOrdAmt() {
      return this.lastOrdAmt;
   }

   @JsonProperty("lastOrdNum")
   public void setLastOrdNum(Double lastOrdNum) {
      this.lastOrdNum = lastOrdNum;
   }

   @JsonProperty("lastOrdNum")
   public Double getLastOrdNum() {
      return this.lastOrdNum;
   }

   @JsonProperty("startDate")
   public void setStartDate(Date startDate) {
      this.startDate = startDate;
   }

   @JsonProperty("startDate")
   public Date getStartDate() {
      return this.startDate;
   }
}
