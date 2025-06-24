package com.jd.open.api.sdk.domain.order.PopOrderBasicService.response.queryCouponDetai;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

public class OrderItemDetail implements Serializable {
   private String skuCode;
   private Integer count;
   private String skuName;
   private BigDecimal skuPrice;
   private BigDecimal baseDiscount;
   private BigDecimal manJian;
   private BigDecimal venderFee;
   private BigDecimal baseFee;
   private BigDecimal remoteFee;
   private BigDecimal coupon;
   private BigDecimal jingDou;
   private BigDecimal balance;
   private BigDecimal superRedEnvelope;
   private BigDecimal plus95;
   private BigDecimal tuiHuanHuoWuYou;
   private BigDecimal taxFee;
   private BigDecimal luoDiPeiService;
   private BigDecimal shouldPay;
   private BigDecimal jingQuan;
   private BigDecimal dongQuan;
   private BigDecimal xianPinLeiJingQuan;
   private BigDecimal xianPinLeiDongQuan;
   private BigDecimal pingTaiChengDanYouHuiQuan;
   private BigDecimal liJinYouHui;
   private BigDecimal zhiFuYingXiaoYouHui;
   private BigDecimal jdZhiFuYouHui;
   private BigDecimal globalGeneralTax;
   private BigDecimal globalGeneralIncludeTax;
   private BigDecimal jingXiangLiJin;
   private List<String> bizCodeList;
   private List<String> promoIdList;
   private BigDecimal manJianTotal;
   private String promoId;
   private String publicPromoId;
   private List<SkuDiscountInfo> skuDiscountInfoList;
   private BigDecimal promotionDiscount;
   private BigDecimal expiryGiftDiscount;
   private BigDecimal officialInstantDiscount;
   private BigDecimal plusInstantDiscount;
   private BigDecimal singleProductDirectDiscount;
   private BigDecimal eCard;

   @JsonProperty("skuCode")
   public void setSkuCode(String skuCode) {
      this.skuCode = skuCode;
   }

   @JsonProperty("skuCode")
   public String getSkuCode() {
      return this.skuCode;
   }

   @JsonProperty("count")
   public void setCount(Integer count) {
      this.count = count;
   }

   @JsonProperty("count")
   public Integer getCount() {
      return this.count;
   }

   @JsonProperty("skuName")
   public void setSkuName(String skuName) {
      this.skuName = skuName;
   }

   @JsonProperty("skuName")
   public String getSkuName() {
      return this.skuName;
   }

   @JsonProperty("skuPrice")
   public void setSkuPrice(BigDecimal skuPrice) {
      this.skuPrice = skuPrice;
   }

   @JsonProperty("skuPrice")
   public BigDecimal getSkuPrice() {
      return this.skuPrice;
   }

   @JsonProperty("baseDiscount")
   public void setBaseDiscount(BigDecimal baseDiscount) {
      this.baseDiscount = baseDiscount;
   }

   @JsonProperty("baseDiscount")
   public BigDecimal getBaseDiscount() {
      return this.baseDiscount;
   }

   @JsonProperty("manJian")
   public void setManJian(BigDecimal manJian) {
      this.manJian = manJian;
   }

   @JsonProperty("manJian")
   public BigDecimal getManJian() {
      return this.manJian;
   }

   @JsonProperty("venderFee")
   public void setVenderFee(BigDecimal venderFee) {
      this.venderFee = venderFee;
   }

   @JsonProperty("venderFee")
   public BigDecimal getVenderFee() {
      return this.venderFee;
   }

   @JsonProperty("baseFee")
   public void setBaseFee(BigDecimal baseFee) {
      this.baseFee = baseFee;
   }

   @JsonProperty("baseFee")
   public BigDecimal getBaseFee() {
      return this.baseFee;
   }

   @JsonProperty("remoteFee")
   public void setRemoteFee(BigDecimal remoteFee) {
      this.remoteFee = remoteFee;
   }

   @JsonProperty("remoteFee")
   public BigDecimal getRemoteFee() {
      return this.remoteFee;
   }

   @JsonProperty("coupon")
   public void setCoupon(BigDecimal coupon) {
      this.coupon = coupon;
   }

   @JsonProperty("coupon")
   public BigDecimal getCoupon() {
      return this.coupon;
   }

   @JsonProperty("jingDou")
   public void setJingDou(BigDecimal jingDou) {
      this.jingDou = jingDou;
   }

   @JsonProperty("jingDou")
   public BigDecimal getJingDou() {
      return this.jingDou;
   }

   @JsonProperty("balance")
   public void setBalance(BigDecimal balance) {
      this.balance = balance;
   }

   @JsonProperty("balance")
   public BigDecimal getBalance() {
      return this.balance;
   }

   @JsonProperty("superRedEnvelope")
   public void setSuperRedEnvelope(BigDecimal superRedEnvelope) {
      this.superRedEnvelope = superRedEnvelope;
   }

   @JsonProperty("superRedEnvelope")
   public BigDecimal getSuperRedEnvelope() {
      return this.superRedEnvelope;
   }

   @JsonProperty("plus95")
   public void setPlus95(BigDecimal plus95) {
      this.plus95 = plus95;
   }

   @JsonProperty("plus95")
   public BigDecimal getPlus95() {
      return this.plus95;
   }

   @JsonProperty("tuiHuanHuoWuYou")
   public void setTuiHuanHuoWuYou(BigDecimal tuiHuanHuoWuYou) {
      this.tuiHuanHuoWuYou = tuiHuanHuoWuYou;
   }

   @JsonProperty("tuiHuanHuoWuYou")
   public BigDecimal getTuiHuanHuoWuYou() {
      return this.tuiHuanHuoWuYou;
   }

   @JsonProperty("taxFee")
   public void setTaxFee(BigDecimal taxFee) {
      this.taxFee = taxFee;
   }

   @JsonProperty("taxFee")
   public BigDecimal getTaxFee() {
      return this.taxFee;
   }

   @JsonProperty("luoDiPeiService")
   public void setLuoDiPeiService(BigDecimal luoDiPeiService) {
      this.luoDiPeiService = luoDiPeiService;
   }

   @JsonProperty("luoDiPeiService")
   public BigDecimal getLuoDiPeiService() {
      return this.luoDiPeiService;
   }

   @JsonProperty("shouldPay")
   public void setShouldPay(BigDecimal shouldPay) {
      this.shouldPay = shouldPay;
   }

   @JsonProperty("shouldPay")
   public BigDecimal getShouldPay() {
      return this.shouldPay;
   }

   @JsonProperty("jingQuan")
   public void setJingQuan(BigDecimal jingQuan) {
      this.jingQuan = jingQuan;
   }

   @JsonProperty("jingQuan")
   public BigDecimal getJingQuan() {
      return this.jingQuan;
   }

   @JsonProperty("dongQuan")
   public void setDongQuan(BigDecimal dongQuan) {
      this.dongQuan = dongQuan;
   }

   @JsonProperty("dongQuan")
   public BigDecimal getDongQuan() {
      return this.dongQuan;
   }

   @JsonProperty("xianPinLeiJingQuan")
   public void setXianPinLeiJingQuan(BigDecimal xianPinLeiJingQuan) {
      this.xianPinLeiJingQuan = xianPinLeiJingQuan;
   }

   @JsonProperty("xianPinLeiJingQuan")
   public BigDecimal getXianPinLeiJingQuan() {
      return this.xianPinLeiJingQuan;
   }

   @JsonProperty("xianPinLeiDongQuan")
   public void setXianPinLeiDongQuan(BigDecimal xianPinLeiDongQuan) {
      this.xianPinLeiDongQuan = xianPinLeiDongQuan;
   }

   @JsonProperty("xianPinLeiDongQuan")
   public BigDecimal getXianPinLeiDongQuan() {
      return this.xianPinLeiDongQuan;
   }

   @JsonProperty("pingTaiChengDanYouHuiQuan")
   public void setPingTaiChengDanYouHuiQuan(BigDecimal pingTaiChengDanYouHuiQuan) {
      this.pingTaiChengDanYouHuiQuan = pingTaiChengDanYouHuiQuan;
   }

   @JsonProperty("pingTaiChengDanYouHuiQuan")
   public BigDecimal getPingTaiChengDanYouHuiQuan() {
      return this.pingTaiChengDanYouHuiQuan;
   }

   @JsonProperty("liJinYouHui")
   public void setLiJinYouHui(BigDecimal liJinYouHui) {
      this.liJinYouHui = liJinYouHui;
   }

   @JsonProperty("liJinYouHui")
   public BigDecimal getLiJinYouHui() {
      return this.liJinYouHui;
   }

   @JsonProperty("zhiFuYingXiaoYouHui")
   public void setZhiFuYingXiaoYouHui(BigDecimal zhiFuYingXiaoYouHui) {
      this.zhiFuYingXiaoYouHui = zhiFuYingXiaoYouHui;
   }

   @JsonProperty("zhiFuYingXiaoYouHui")
   public BigDecimal getZhiFuYingXiaoYouHui() {
      return this.zhiFuYingXiaoYouHui;
   }

   @JsonProperty("jdZhiFuYouHui")
   public void setJdZhiFuYouHui(BigDecimal jdZhiFuYouHui) {
      this.jdZhiFuYouHui = jdZhiFuYouHui;
   }

   @JsonProperty("jdZhiFuYouHui")
   public BigDecimal getJdZhiFuYouHui() {
      return this.jdZhiFuYouHui;
   }

   @JsonProperty("globalGeneralTax")
   public void setGlobalGeneralTax(BigDecimal globalGeneralTax) {
      this.globalGeneralTax = globalGeneralTax;
   }

   @JsonProperty("globalGeneralTax")
   public BigDecimal getGlobalGeneralTax() {
      return this.globalGeneralTax;
   }

   @JsonProperty("globalGeneralIncludeTax")
   public void setGlobalGeneralIncludeTax(BigDecimal globalGeneralIncludeTax) {
      this.globalGeneralIncludeTax = globalGeneralIncludeTax;
   }

   @JsonProperty("globalGeneralIncludeTax")
   public BigDecimal getGlobalGeneralIncludeTax() {
      return this.globalGeneralIncludeTax;
   }

   @JsonProperty("jingXiangLiJin")
   public void setJingXiangLiJin(BigDecimal jingXiangLiJin) {
      this.jingXiangLiJin = jingXiangLiJin;
   }

   @JsonProperty("jingXiangLiJin")
   public BigDecimal getJingXiangLiJin() {
      return this.jingXiangLiJin;
   }

   @JsonProperty("bizCodeList")
   public void setBizCodeList(List<String> bizCodeList) {
      this.bizCodeList = bizCodeList;
   }

   @JsonProperty("bizCodeList")
   public List<String> getBizCodeList() {
      return this.bizCodeList;
   }

   @JsonProperty("promoIdList")
   public void setPromoIdList(List<String> promoIdList) {
      this.promoIdList = promoIdList;
   }

   @JsonProperty("promoIdList")
   public List<String> getPromoIdList() {
      return this.promoIdList;
   }

   @JsonProperty("manJianTotal")
   public void setManJianTotal(BigDecimal manJianTotal) {
      this.manJianTotal = manJianTotal;
   }

   @JsonProperty("manJianTotal")
   public BigDecimal getManJianTotal() {
      return this.manJianTotal;
   }

   @JsonProperty("promoId")
   public void setPromoId(String promoId) {
      this.promoId = promoId;
   }

   @JsonProperty("promoId")
   public String getPromoId() {
      return this.promoId;
   }

   @JsonProperty("publicPromoId")
   public void setPublicPromoId(String publicPromoId) {
      this.publicPromoId = publicPromoId;
   }

   @JsonProperty("publicPromoId")
   public String getPublicPromoId() {
      return this.publicPromoId;
   }

   @JsonProperty("skuDiscountInfoList")
   public void setSkuDiscountInfoList(List<SkuDiscountInfo> skuDiscountInfoList) {
      this.skuDiscountInfoList = skuDiscountInfoList;
   }

   @JsonProperty("skuDiscountInfoList")
   public List<SkuDiscountInfo> getSkuDiscountInfoList() {
      return this.skuDiscountInfoList;
   }

   @JsonProperty("promotionDiscount")
   public void setPromotionDiscount(BigDecimal promotionDiscount) {
      this.promotionDiscount = promotionDiscount;
   }

   @JsonProperty("promotionDiscount")
   public BigDecimal getPromotionDiscount() {
      return this.promotionDiscount;
   }

   @JsonProperty("expiryGiftDiscount")
   public void setExpiryGiftDiscount(BigDecimal expiryGiftDiscount) {
      this.expiryGiftDiscount = expiryGiftDiscount;
   }

   @JsonProperty("expiryGiftDiscount")
   public BigDecimal getExpiryGiftDiscount() {
      return this.expiryGiftDiscount;
   }

   @JsonProperty("officialInstantDiscount")
   public void setOfficialInstantDiscount(BigDecimal officialInstantDiscount) {
      this.officialInstantDiscount = officialInstantDiscount;
   }

   @JsonProperty("officialInstantDiscount")
   public BigDecimal getOfficialInstantDiscount() {
      return this.officialInstantDiscount;
   }

   @JsonProperty("plusInstantDiscount")
   public void setPlusInstantDiscount(BigDecimal plusInstantDiscount) {
      this.plusInstantDiscount = plusInstantDiscount;
   }

   @JsonProperty("plusInstantDiscount")
   public BigDecimal getPlusInstantDiscount() {
      return this.plusInstantDiscount;
   }

   @JsonProperty("singleProductDirectDiscount")
   public void setSingleProductDirectDiscount(BigDecimal singleProductDirectDiscount) {
      this.singleProductDirectDiscount = singleProductDirectDiscount;
   }

   @JsonProperty("singleProductDirectDiscount")
   public BigDecimal getSingleProductDirectDiscount() {
      return this.singleProductDirectDiscount;
   }

   @JsonProperty("eCard")
   public void setECard(BigDecimal eCard) {
      this.eCard = eCard;
   }

   @JsonProperty("eCard")
   public BigDecimal getECard() {
      return this.eCard;
   }
}
