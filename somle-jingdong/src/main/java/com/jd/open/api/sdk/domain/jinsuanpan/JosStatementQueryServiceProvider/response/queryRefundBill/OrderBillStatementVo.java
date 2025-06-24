package com.jd.open.api.sdk.domain.jinsuanpan.JosStatementQueryServiceProvider.response.queryRefundBill;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class OrderBillStatementVo implements Serializable {
   private String[] id;
   private Long[] bid;
   private Long[] venderId;
   private String[] billType;
   private Long[] orderId;
   private String[] refRefundBillId;
   private String[] businessBillId;
   private String[] refOrderId;
   private Date[] happenTime;
   private Date[] orderCompleteTime;
   private Long[] storeId;
   private String[] refStoreId;
   private String[] storeName;
   private BigDecimal[] orderAmount;
   private BigDecimal[] refundAmount;
   private BigDecimal[] discountAmount;
   private int[] usedCouponNum;
   private BigDecimal[] price;
   private BigDecimal[] commCharge;
   private BigDecimal[] couponAmount;
   private int[] couponNum;
   private String[] settleStatus;

   @JsonProperty("id")
   public void setId(String[] id) {
      this.id = id;
   }

   @JsonProperty("id")
   public String[] getId() {
      return this.id;
   }

   @JsonProperty("bid")
   public void setBid(Long[] bid) {
      this.bid = bid;
   }

   @JsonProperty("bid")
   public Long[] getBid() {
      return this.bid;
   }

   @JsonProperty("venderId")
   public void setVenderId(Long[] venderId) {
      this.venderId = venderId;
   }

   @JsonProperty("venderId")
   public Long[] getVenderId() {
      return this.venderId;
   }

   @JsonProperty("billType")
   public void setBillType(String[] billType) {
      this.billType = billType;
   }

   @JsonProperty("billType")
   public String[] getBillType() {
      return this.billType;
   }

   @JsonProperty("orderId")
   public void setOrderId(Long[] orderId) {
      this.orderId = orderId;
   }

   @JsonProperty("orderId")
   public Long[] getOrderId() {
      return this.orderId;
   }

   @JsonProperty("refRefundBillId")
   public void setRefRefundBillId(String[] refRefundBillId) {
      this.refRefundBillId = refRefundBillId;
   }

   @JsonProperty("refRefundBillId")
   public String[] getRefRefundBillId() {
      return this.refRefundBillId;
   }

   @JsonProperty("businessBillId")
   public void setBusinessBillId(String[] businessBillId) {
      this.businessBillId = businessBillId;
   }

   @JsonProperty("businessBillId")
   public String[] getBusinessBillId() {
      return this.businessBillId;
   }

   @JsonProperty("refOrderId")
   public void setRefOrderId(String[] refOrderId) {
      this.refOrderId = refOrderId;
   }

   @JsonProperty("refOrderId")
   public String[] getRefOrderId() {
      return this.refOrderId;
   }

   @JsonProperty("happenTime")
   public void setHappenTime(Date[] happenTime) {
      this.happenTime = happenTime;
   }

   @JsonProperty("happenTime")
   public Date[] getHappenTime() {
      return this.happenTime;
   }

   @JsonProperty("orderCompleteTime")
   public void setOrderCompleteTime(Date[] orderCompleteTime) {
      this.orderCompleteTime = orderCompleteTime;
   }

   @JsonProperty("orderCompleteTime")
   public Date[] getOrderCompleteTime() {
      return this.orderCompleteTime;
   }

   @JsonProperty("storeId")
   public void setStoreId(Long[] storeId) {
      this.storeId = storeId;
   }

   @JsonProperty("storeId")
   public Long[] getStoreId() {
      return this.storeId;
   }

   @JsonProperty("refStoreId")
   public void setRefStoreId(String[] refStoreId) {
      this.refStoreId = refStoreId;
   }

   @JsonProperty("refStoreId")
   public String[] getRefStoreId() {
      return this.refStoreId;
   }

   @JsonProperty("storeName")
   public void setStoreName(String[] storeName) {
      this.storeName = storeName;
   }

   @JsonProperty("storeName")
   public String[] getStoreName() {
      return this.storeName;
   }

   @JsonProperty("orderAmount")
   public void setOrderAmount(BigDecimal[] orderAmount) {
      this.orderAmount = orderAmount;
   }

   @JsonProperty("orderAmount")
   public BigDecimal[] getOrderAmount() {
      return this.orderAmount;
   }

   @JsonProperty("refundAmount")
   public void setRefundAmount(BigDecimal[] refundAmount) {
      this.refundAmount = refundAmount;
   }

   @JsonProperty("refundAmount")
   public BigDecimal[] getRefundAmount() {
      return this.refundAmount;
   }

   @JsonProperty("discountAmount")
   public void setDiscountAmount(BigDecimal[] discountAmount) {
      this.discountAmount = discountAmount;
   }

   @JsonProperty("discountAmount")
   public BigDecimal[] getDiscountAmount() {
      return this.discountAmount;
   }

   @JsonProperty("usedCouponNum")
   public void setUsedCouponNum(int[] usedCouponNum) {
      this.usedCouponNum = usedCouponNum;
   }

   @JsonProperty("usedCouponNum")
   public int[] getUsedCouponNum() {
      return this.usedCouponNum;
   }

   @JsonProperty("price")
   public void setPrice(BigDecimal[] price) {
      this.price = price;
   }

   @JsonProperty("price")
   public BigDecimal[] getPrice() {
      return this.price;
   }

   @JsonProperty("commCharge")
   public void setCommCharge(BigDecimal[] commCharge) {
      this.commCharge = commCharge;
   }

   @JsonProperty("commCharge")
   public BigDecimal[] getCommCharge() {
      return this.commCharge;
   }

   @JsonProperty("couponAmount")
   public void setCouponAmount(BigDecimal[] couponAmount) {
      this.couponAmount = couponAmount;
   }

   @JsonProperty("couponAmount")
   public BigDecimal[] getCouponAmount() {
      return this.couponAmount;
   }

   @JsonProperty("couponNum")
   public void setCouponNum(int[] couponNum) {
      this.couponNum = couponNum;
   }

   @JsonProperty("couponNum")
   public int[] getCouponNum() {
      return this.couponNum;
   }

   @JsonProperty("settleStatus")
   public void setSettleStatus(String[] settleStatus) {
      this.settleStatus = settleStatus;
   }

   @JsonProperty("settleStatus")
   public String[] getSettleStatus() {
      return this.settleStatus;
   }
}
