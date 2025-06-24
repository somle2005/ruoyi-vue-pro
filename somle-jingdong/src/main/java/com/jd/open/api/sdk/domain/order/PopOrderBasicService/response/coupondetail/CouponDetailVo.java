package com.jd.open.api.sdk.domain.order.PopOrderBasicService.response.coupondetail;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class CouponDetailVo implements Serializable {
   private List<OrderPromotionDetail> promotionList;
   private List<OrderCouponDetail> couponList;
   private List<OrderItemDetail> skuList;
   private BigDecimal totalItemPrice;
   private BigDecimal totalBaseDiscount;
   private BigDecimal totalManJian;
   private BigDecimal totalVenderFee;
   private BigDecimal totalBaseFee;
   private BigDecimal totalRemoteFee;
   private BigDecimal totalCoupon;
   private BigDecimal totalJingDou;
   private BigDecimal totalBalance;
   private BigDecimal totalSuperRedEnvelope;
   private BigDecimal totalPlus95;
   private BigDecimal totalTuiHuanHuoWuYou;
   private BigDecimal totalTaxFee;
   private BigDecimal totalLuoDiPeiService;
   private BigDecimal totalShouldPay;
   private Long orderId;
   private Date orderCreateDate;
   private BigDecimal totalJingQuan;
   private BigDecimal totalDongQuan;
   private BigDecimal totalXianPinLeiJingQuan;
   private BigDecimal totalXianPinLeiDongQuan;
   private BigDecimal totalPingTaiChengDanYouHuiQuan;
   private BigDecimal totalLiJinYouHui;
   private BigDecimal totalZhiFuYingXiaoYouHui;
   private BigDecimal totalJdZhiFuYouHui;
   private BigDecimal totalGlobalGeneralTax;
   private BigDecimal totalGlobalGeneralIncludeTax;
   private BigDecimal totalJingXiangLiJin;
   private BigDecimal totalPromotionDiscount;
   private BigDecimal totalExpiryGiftDiscount;
   private BigDecimal totalOfficialInstantDiscount;
   private BigDecimal totalPlusInstantDiscount;
   private BigDecimal totalSingleProductDirectDiscount;
   private BigDecimal totalECardDiscount;

   @JsonProperty("promotionList")
   public void setPromotionList(List<OrderPromotionDetail> promotionList) {
      this.promotionList = promotionList;
   }

   @JsonProperty("promotionList")
   public List<OrderPromotionDetail> getPromotionList() {
      return this.promotionList;
   }

   @JsonProperty("couponList")
   public void setCouponList(List<OrderCouponDetail> couponList) {
      this.couponList = couponList;
   }

   @JsonProperty("couponList")
   public List<OrderCouponDetail> getCouponList() {
      return this.couponList;
   }

   @JsonProperty("skuList")
   public void setSkuList(List<OrderItemDetail> skuList) {
      this.skuList = skuList;
   }

   @JsonProperty("skuList")
   public List<OrderItemDetail> getSkuList() {
      return this.skuList;
   }

   @JsonProperty("totalItemPrice")
   public void setTotalItemPrice(BigDecimal totalItemPrice) {
      this.totalItemPrice = totalItemPrice;
   }

   @JsonProperty("totalItemPrice")
   public BigDecimal getTotalItemPrice() {
      return this.totalItemPrice;
   }

   @JsonProperty("totalBaseDiscount")
   public void setTotalBaseDiscount(BigDecimal totalBaseDiscount) {
      this.totalBaseDiscount = totalBaseDiscount;
   }

   @JsonProperty("totalBaseDiscount")
   public BigDecimal getTotalBaseDiscount() {
      return this.totalBaseDiscount;
   }

   @JsonProperty("totalManJian")
   public void setTotalManJian(BigDecimal totalManJian) {
      this.totalManJian = totalManJian;
   }

   @JsonProperty("totalManJian")
   public BigDecimal getTotalManJian() {
      return this.totalManJian;
   }

   @JsonProperty("totalVenderFee")
   public void setTotalVenderFee(BigDecimal totalVenderFee) {
      this.totalVenderFee = totalVenderFee;
   }

   @JsonProperty("totalVenderFee")
   public BigDecimal getTotalVenderFee() {
      return this.totalVenderFee;
   }

   @JsonProperty("totalBaseFee")
   public void setTotalBaseFee(BigDecimal totalBaseFee) {
      this.totalBaseFee = totalBaseFee;
   }

   @JsonProperty("totalBaseFee")
   public BigDecimal getTotalBaseFee() {
      return this.totalBaseFee;
   }

   @JsonProperty("totalRemoteFee")
   public void setTotalRemoteFee(BigDecimal totalRemoteFee) {
      this.totalRemoteFee = totalRemoteFee;
   }

   @JsonProperty("totalRemoteFee")
   public BigDecimal getTotalRemoteFee() {
      return this.totalRemoteFee;
   }

   @JsonProperty("totalCoupon")
   public void setTotalCoupon(BigDecimal totalCoupon) {
      this.totalCoupon = totalCoupon;
   }

   @JsonProperty("totalCoupon")
   public BigDecimal getTotalCoupon() {
      return this.totalCoupon;
   }

   @JsonProperty("totalJingDou")
   public void setTotalJingDou(BigDecimal totalJingDou) {
      this.totalJingDou = totalJingDou;
   }

   @JsonProperty("totalJingDou")
   public BigDecimal getTotalJingDou() {
      return this.totalJingDou;
   }

   @JsonProperty("totalBalance")
   public void setTotalBalance(BigDecimal totalBalance) {
      this.totalBalance = totalBalance;
   }

   @JsonProperty("totalBalance")
   public BigDecimal getTotalBalance() {
      return this.totalBalance;
   }

   @JsonProperty("totalSuperRedEnvelope")
   public void setTotalSuperRedEnvelope(BigDecimal totalSuperRedEnvelope) {
      this.totalSuperRedEnvelope = totalSuperRedEnvelope;
   }

   @JsonProperty("totalSuperRedEnvelope")
   public BigDecimal getTotalSuperRedEnvelope() {
      return this.totalSuperRedEnvelope;
   }

   @JsonProperty("totalPlus95")
   public void setTotalPlus95(BigDecimal totalPlus95) {
      this.totalPlus95 = totalPlus95;
   }

   @JsonProperty("totalPlus95")
   public BigDecimal getTotalPlus95() {
      return this.totalPlus95;
   }

   @JsonProperty("totalTuiHuanHuoWuYou")
   public void setTotalTuiHuanHuoWuYou(BigDecimal totalTuiHuanHuoWuYou) {
      this.totalTuiHuanHuoWuYou = totalTuiHuanHuoWuYou;
   }

   @JsonProperty("totalTuiHuanHuoWuYou")
   public BigDecimal getTotalTuiHuanHuoWuYou() {
      return this.totalTuiHuanHuoWuYou;
   }

   @JsonProperty("totalTaxFee")
   public void setTotalTaxFee(BigDecimal totalTaxFee) {
      this.totalTaxFee = totalTaxFee;
   }

   @JsonProperty("totalTaxFee")
   public BigDecimal getTotalTaxFee() {
      return this.totalTaxFee;
   }

   @JsonProperty("totalLuoDiPeiService")
   public void setTotalLuoDiPeiService(BigDecimal totalLuoDiPeiService) {
      this.totalLuoDiPeiService = totalLuoDiPeiService;
   }

   @JsonProperty("totalLuoDiPeiService")
   public BigDecimal getTotalLuoDiPeiService() {
      return this.totalLuoDiPeiService;
   }

   @JsonProperty("totalShouldPay")
   public void setTotalShouldPay(BigDecimal totalShouldPay) {
      this.totalShouldPay = totalShouldPay;
   }

   @JsonProperty("totalShouldPay")
   public BigDecimal getTotalShouldPay() {
      return this.totalShouldPay;
   }

   @JsonProperty("orderId")
   public void setOrderId(Long orderId) {
      this.orderId = orderId;
   }

   @JsonProperty("orderId")
   public Long getOrderId() {
      return this.orderId;
   }

   @JsonProperty("orderCreateDate")
   public void setOrderCreateDate(Date orderCreateDate) {
      this.orderCreateDate = orderCreateDate;
   }

   @JsonProperty("orderCreateDate")
   public Date getOrderCreateDate() {
      return this.orderCreateDate;
   }

   @JsonProperty("totalJingQuan")
   public void setTotalJingQuan(BigDecimal totalJingQuan) {
      this.totalJingQuan = totalJingQuan;
   }

   @JsonProperty("totalJingQuan")
   public BigDecimal getTotalJingQuan() {
      return this.totalJingQuan;
   }

   @JsonProperty("totalDongQuan")
   public void setTotalDongQuan(BigDecimal totalDongQuan) {
      this.totalDongQuan = totalDongQuan;
   }

   @JsonProperty("totalDongQuan")
   public BigDecimal getTotalDongQuan() {
      return this.totalDongQuan;
   }

   @JsonProperty("totalXianPinLeiJingQuan")
   public void setTotalXianPinLeiJingQuan(BigDecimal totalXianPinLeiJingQuan) {
      this.totalXianPinLeiJingQuan = totalXianPinLeiJingQuan;
   }

   @JsonProperty("totalXianPinLeiJingQuan")
   public BigDecimal getTotalXianPinLeiJingQuan() {
      return this.totalXianPinLeiJingQuan;
   }

   @JsonProperty("totalXianPinLeiDongQuan")
   public void setTotalXianPinLeiDongQuan(BigDecimal totalXianPinLeiDongQuan) {
      this.totalXianPinLeiDongQuan = totalXianPinLeiDongQuan;
   }

   @JsonProperty("totalXianPinLeiDongQuan")
   public BigDecimal getTotalXianPinLeiDongQuan() {
      return this.totalXianPinLeiDongQuan;
   }

   @JsonProperty("totalPingTaiChengDanYouHuiQuan")
   public void setTotalPingTaiChengDanYouHuiQuan(BigDecimal totalPingTaiChengDanYouHuiQuan) {
      this.totalPingTaiChengDanYouHuiQuan = totalPingTaiChengDanYouHuiQuan;
   }

   @JsonProperty("totalPingTaiChengDanYouHuiQuan")
   public BigDecimal getTotalPingTaiChengDanYouHuiQuan() {
      return this.totalPingTaiChengDanYouHuiQuan;
   }

   @JsonProperty("totalLiJinYouHui")
   public void setTotalLiJinYouHui(BigDecimal totalLiJinYouHui) {
      this.totalLiJinYouHui = totalLiJinYouHui;
   }

   @JsonProperty("totalLiJinYouHui")
   public BigDecimal getTotalLiJinYouHui() {
      return this.totalLiJinYouHui;
   }

   @JsonProperty("totalZhiFuYingXiaoYouHui")
   public void setTotalZhiFuYingXiaoYouHui(BigDecimal totalZhiFuYingXiaoYouHui) {
      this.totalZhiFuYingXiaoYouHui = totalZhiFuYingXiaoYouHui;
   }

   @JsonProperty("totalZhiFuYingXiaoYouHui")
   public BigDecimal getTotalZhiFuYingXiaoYouHui() {
      return this.totalZhiFuYingXiaoYouHui;
   }

   @JsonProperty("totalJdZhiFuYouHui")
   public void setTotalJdZhiFuYouHui(BigDecimal totalJdZhiFuYouHui) {
      this.totalJdZhiFuYouHui = totalJdZhiFuYouHui;
   }

   @JsonProperty("totalJdZhiFuYouHui")
   public BigDecimal getTotalJdZhiFuYouHui() {
      return this.totalJdZhiFuYouHui;
   }

   @JsonProperty("totalGlobalGeneralTax")
   public void setTotalGlobalGeneralTax(BigDecimal totalGlobalGeneralTax) {
      this.totalGlobalGeneralTax = totalGlobalGeneralTax;
   }

   @JsonProperty("totalGlobalGeneralTax")
   public BigDecimal getTotalGlobalGeneralTax() {
      return this.totalGlobalGeneralTax;
   }

   @JsonProperty("totalGlobalGeneralIncludeTax")
   public void setTotalGlobalGeneralIncludeTax(BigDecimal totalGlobalGeneralIncludeTax) {
      this.totalGlobalGeneralIncludeTax = totalGlobalGeneralIncludeTax;
   }

   @JsonProperty("totalGlobalGeneralIncludeTax")
   public BigDecimal getTotalGlobalGeneralIncludeTax() {
      return this.totalGlobalGeneralIncludeTax;
   }

   @JsonProperty("totalJingXiangLiJin")
   public void setTotalJingXiangLiJin(BigDecimal totalJingXiangLiJin) {
      this.totalJingXiangLiJin = totalJingXiangLiJin;
   }

   @JsonProperty("totalJingXiangLiJin")
   public BigDecimal getTotalJingXiangLiJin() {
      return this.totalJingXiangLiJin;
   }

   @JsonProperty("totalPromotionDiscount")
   public void setTotalPromotionDiscount(BigDecimal totalPromotionDiscount) {
      this.totalPromotionDiscount = totalPromotionDiscount;
   }

   @JsonProperty("totalPromotionDiscount")
   public BigDecimal getTotalPromotionDiscount() {
      return this.totalPromotionDiscount;
   }

   @JsonProperty("totalExpiryGiftDiscount")
   public void setTotalExpiryGiftDiscount(BigDecimal totalExpiryGiftDiscount) {
      this.totalExpiryGiftDiscount = totalExpiryGiftDiscount;
   }

   @JsonProperty("totalExpiryGiftDiscount")
   public BigDecimal getTotalExpiryGiftDiscount() {
      return this.totalExpiryGiftDiscount;
   }

   @JsonProperty("totalOfficialInstantDiscount")
   public void setTotalOfficialInstantDiscount(BigDecimal totalOfficialInstantDiscount) {
      this.totalOfficialInstantDiscount = totalOfficialInstantDiscount;
   }

   @JsonProperty("totalOfficialInstantDiscount")
   public BigDecimal getTotalOfficialInstantDiscount() {
      return this.totalOfficialInstantDiscount;
   }

   @JsonProperty("totalPlusInstantDiscount")
   public void setTotalPlusInstantDiscount(BigDecimal totalPlusInstantDiscount) {
      this.totalPlusInstantDiscount = totalPlusInstantDiscount;
   }

   @JsonProperty("totalPlusInstantDiscount")
   public BigDecimal getTotalPlusInstantDiscount() {
      return this.totalPlusInstantDiscount;
   }

   @JsonProperty("totalSingleProductDirectDiscount")
   public void setTotalSingleProductDirectDiscount(BigDecimal totalSingleProductDirectDiscount) {
      this.totalSingleProductDirectDiscount = totalSingleProductDirectDiscount;
   }

   @JsonProperty("totalSingleProductDirectDiscount")
   public BigDecimal getTotalSingleProductDirectDiscount() {
      return this.totalSingleProductDirectDiscount;
   }

   @JsonProperty("totalECardDiscount")
   public void setTotalECardDiscount(BigDecimal totalECardDiscount) {
      this.totalECardDiscount = totalECardDiscount;
   }

   @JsonProperty("totalECardDiscount")
   public BigDecimal getTotalECardDiscount() {
      return this.totalECardDiscount;
   }
}
