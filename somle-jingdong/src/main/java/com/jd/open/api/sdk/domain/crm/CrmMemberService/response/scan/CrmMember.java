package com.jd.open.api.sdk.domain.crm.CrmMemberService.response.scan;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class CrmMember implements Serializable {
   private String customerPin;
   private String grade;
   private int tradeCount;
   private BigDecimal tradeAmount;
   private int closeTradeCount;
   private BigDecimal closeTradeAmount;
   private int itemNum;
   private BigDecimal avgPrice;
   private Date lastTradeTime;
   private String openIdBuyer;
   private String xidBuyer;

   @JsonProperty("customer_pin")
   public void setCustomerPin(String customerPin) {
      this.customerPin = customerPin;
   }

   @JsonProperty("customer_pin")
   public String getCustomerPin() {
      return this.customerPin;
   }

   @JsonProperty("grade")
   public void setGrade(String grade) {
      this.grade = grade;
   }

   @JsonProperty("grade")
   public String getGrade() {
      return this.grade;
   }

   @JsonProperty("trade_count")
   public void setTradeCount(int tradeCount) {
      this.tradeCount = tradeCount;
   }

   @JsonProperty("trade_count")
   public int getTradeCount() {
      return this.tradeCount;
   }

   @JsonProperty("trade_amount")
   public void setTradeAmount(BigDecimal tradeAmount) {
      this.tradeAmount = tradeAmount;
   }

   @JsonProperty("trade_amount")
   public BigDecimal getTradeAmount() {
      return this.tradeAmount;
   }

   @JsonProperty("close_trade_count")
   public void setCloseTradeCount(int closeTradeCount) {
      this.closeTradeCount = closeTradeCount;
   }

   @JsonProperty("close_trade_count")
   public int getCloseTradeCount() {
      return this.closeTradeCount;
   }

   @JsonProperty("close_trade_amount")
   public void setCloseTradeAmount(BigDecimal closeTradeAmount) {
      this.closeTradeAmount = closeTradeAmount;
   }

   @JsonProperty("close_trade_amount")
   public BigDecimal getCloseTradeAmount() {
      return this.closeTradeAmount;
   }

   @JsonProperty("item_num")
   public void setItemNum(int itemNum) {
      this.itemNum = itemNum;
   }

   @JsonProperty("item_num")
   public int getItemNum() {
      return this.itemNum;
   }

   @JsonProperty("avg_price")
   public void setAvgPrice(BigDecimal avgPrice) {
      this.avgPrice = avgPrice;
   }

   @JsonProperty("avg_price")
   public BigDecimal getAvgPrice() {
      return this.avgPrice;
   }

   @JsonProperty("last_trade_time")
   public void setLastTradeTime(Date lastTradeTime) {
      this.lastTradeTime = lastTradeTime;
   }

   @JsonProperty("last_trade_time")
   public Date getLastTradeTime() {
      return this.lastTradeTime;
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
