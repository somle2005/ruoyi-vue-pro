package com.jd.open.api.sdk.domain.promotion.CouponWriteJosServiceV2.response.sendCoupon;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class CouponInfo implements Serializable {
   private String pin;
   private Date createTime;
   private BigDecimal quota;
   private BigDecimal discount;
   private int style;
   private Date beginTime;
   private Date endTime;
   private int state;
   private String couponId;
   private int batchId;
   private int type;
   private String openIdBuyer;
   private String xidBuyer;

   @JsonProperty("pin")
   public void setPin(String pin) {
      this.pin = pin;
   }

   @JsonProperty("pin")
   public String getPin() {
      return this.pin;
   }

   @JsonProperty("createTime")
   public void setCreateTime(Date createTime) {
      this.createTime = createTime;
   }

   @JsonProperty("createTime")
   public Date getCreateTime() {
      return this.createTime;
   }

   @JsonProperty("quota")
   public void setQuota(BigDecimal quota) {
      this.quota = quota;
   }

   @JsonProperty("quota")
   public BigDecimal getQuota() {
      return this.quota;
   }

   @JsonProperty("discount")
   public void setDiscount(BigDecimal discount) {
      this.discount = discount;
   }

   @JsonProperty("discount")
   public BigDecimal getDiscount() {
      return this.discount;
   }

   @JsonProperty("style")
   public void setStyle(int style) {
      this.style = style;
   }

   @JsonProperty("style")
   public int getStyle() {
      return this.style;
   }

   @JsonProperty("beginTime")
   public void setBeginTime(Date beginTime) {
      this.beginTime = beginTime;
   }

   @JsonProperty("beginTime")
   public Date getBeginTime() {
      return this.beginTime;
   }

   @JsonProperty("endTime")
   public void setEndTime(Date endTime) {
      this.endTime = endTime;
   }

   @JsonProperty("endTime")
   public Date getEndTime() {
      return this.endTime;
   }

   @JsonProperty("state")
   public void setState(int state) {
      this.state = state;
   }

   @JsonProperty("state")
   public int getState() {
      return this.state;
   }

   @JsonProperty("couponId")
   public void setCouponId(String couponId) {
      this.couponId = couponId;
   }

   @JsonProperty("couponId")
   public String getCouponId() {
      return this.couponId;
   }

   @JsonProperty("batchId")
   public void setBatchId(int batchId) {
      this.batchId = batchId;
   }

   @JsonProperty("batchId")
   public int getBatchId() {
      return this.batchId;
   }

   @JsonProperty("type")
   public void setType(int type) {
      this.type = type;
   }

   @JsonProperty("type")
   public int getType() {
      return this.type;
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
