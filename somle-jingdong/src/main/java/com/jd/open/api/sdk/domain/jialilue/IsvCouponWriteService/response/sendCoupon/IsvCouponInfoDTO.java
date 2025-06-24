package com.jd.open.api.sdk.domain.jialilue.IsvCouponWriteService.response.sendCoupon;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class IsvCouponInfoDTO implements Serializable {
   private BigDecimal quota;
   private int style;
   private Date beginTime;
   private int batchId;
   private Date endTime;
   private int type;
   private String couponId;
   private BigDecimal discount;

   @JsonProperty("quota")
   public void setQuota(BigDecimal quota) {
      this.quota = quota;
   }

   @JsonProperty("quota")
   public BigDecimal getQuota() {
      return this.quota;
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

   @JsonProperty("batchId")
   public void setBatchId(int batchId) {
      this.batchId = batchId;
   }

   @JsonProperty("batchId")
   public int getBatchId() {
      return this.batchId;
   }

   @JsonProperty("endTime")
   public void setEndTime(Date endTime) {
      this.endTime = endTime;
   }

   @JsonProperty("endTime")
   public Date getEndTime() {
      return this.endTime;
   }

   @JsonProperty("type")
   public void setType(int type) {
      this.type = type;
   }

   @JsonProperty("type")
   public int getType() {
      return this.type;
   }

   @JsonProperty("couponId")
   public void setCouponId(String couponId) {
      this.couponId = couponId;
   }

   @JsonProperty("couponId")
   public String getCouponId() {
      return this.couponId;
   }

   @JsonProperty("discount")
   public void setDiscount(BigDecimal discount) {
      this.discount = discount;
   }

   @JsonProperty("discount")
   public BigDecimal getDiscount() {
      return this.discount;
   }
}
