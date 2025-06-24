package com.jd.open.api.sdk.domain.afsservice.PriceProtectSoaService.response.page;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class PriceProtectRecordDto implements Serializable {
   private String pricePrtctTypeDesc;
   private Long orderId;
   private Long proSkuApplyId;
   private BigDecimal subsidyRateAmount;
   private Long venderId;
   private Long wareNum;
   private String applyStatusDesc;
   private BigDecimal purchasePrice;
   private BigDecimal pluszxlj;
   private String skuName;
   private Long proApplyId;
   private String skuPhoto;
   private BigDecimal venderUndertakeAmount;
   private String customerPin;
   private BigDecimal popPlatformCouponRateAmount;
   private BigDecimal applyPrice;
   private BigDecimal succAmount;
   private Date applyDate;
   private Long skuId;
   private Long realApplyId;
   private Long uuid;
   private Long openIdSeller;
   private Long xidSeller;
   private String encryptVenderId;
   private String encryptOpenIdSeller;
   private String encryptXidSeller;

   @JsonProperty("pricePrtctTypeDesc")
   public void setPricePrtctTypeDesc(String pricePrtctTypeDesc) {
      this.pricePrtctTypeDesc = pricePrtctTypeDesc;
   }

   @JsonProperty("pricePrtctTypeDesc")
   public String getPricePrtctTypeDesc() {
      return this.pricePrtctTypeDesc;
   }

   @JsonProperty("orderId")
   public void setOrderId(Long orderId) {
      this.orderId = orderId;
   }

   @JsonProperty("orderId")
   public Long getOrderId() {
      return this.orderId;
   }

   @JsonProperty("proSkuApplyId")
   public void setProSkuApplyId(Long proSkuApplyId) {
      this.proSkuApplyId = proSkuApplyId;
   }

   @JsonProperty("proSkuApplyId")
   public Long getProSkuApplyId() {
      return this.proSkuApplyId;
   }

   @JsonProperty("subsidyRateAmount")
   public void setSubsidyRateAmount(BigDecimal subsidyRateAmount) {
      this.subsidyRateAmount = subsidyRateAmount;
   }

   @JsonProperty("subsidyRateAmount")
   public BigDecimal getSubsidyRateAmount() {
      return this.subsidyRateAmount;
   }

   @JsonProperty("venderId")
   public void setVenderId(Long venderId) {
      this.venderId = venderId;
   }

   @JsonProperty("venderId")
   public Long getVenderId() {
      return this.venderId;
   }

   @JsonProperty("wareNum")
   public void setWareNum(Long wareNum) {
      this.wareNum = wareNum;
   }

   @JsonProperty("wareNum")
   public Long getWareNum() {
      return this.wareNum;
   }

   @JsonProperty("applyStatusDesc")
   public void setApplyStatusDesc(String applyStatusDesc) {
      this.applyStatusDesc = applyStatusDesc;
   }

   @JsonProperty("applyStatusDesc")
   public String getApplyStatusDesc() {
      return this.applyStatusDesc;
   }

   @JsonProperty("purchasePrice")
   public void setPurchasePrice(BigDecimal purchasePrice) {
      this.purchasePrice = purchasePrice;
   }

   @JsonProperty("purchasePrice")
   public BigDecimal getPurchasePrice() {
      return this.purchasePrice;
   }

   @JsonProperty("pluszxlj")
   public void setPluszxlj(BigDecimal pluszxlj) {
      this.pluszxlj = pluszxlj;
   }

   @JsonProperty("pluszxlj")
   public BigDecimal getPluszxlj() {
      return this.pluszxlj;
   }

   @JsonProperty("skuName")
   public void setSkuName(String skuName) {
      this.skuName = skuName;
   }

   @JsonProperty("skuName")
   public String getSkuName() {
      return this.skuName;
   }

   @JsonProperty("proApplyId")
   public void setProApplyId(Long proApplyId) {
      this.proApplyId = proApplyId;
   }

   @JsonProperty("proApplyId")
   public Long getProApplyId() {
      return this.proApplyId;
   }

   @JsonProperty("skuPhoto")
   public void setSkuPhoto(String skuPhoto) {
      this.skuPhoto = skuPhoto;
   }

   @JsonProperty("skuPhoto")
   public String getSkuPhoto() {
      return this.skuPhoto;
   }

   @JsonProperty("venderUndertakeAmount")
   public void setVenderUndertakeAmount(BigDecimal venderUndertakeAmount) {
      this.venderUndertakeAmount = venderUndertakeAmount;
   }

   @JsonProperty("venderUndertakeAmount")
   public BigDecimal getVenderUndertakeAmount() {
      return this.venderUndertakeAmount;
   }

   @JsonProperty("customerPin")
   public void setCustomerPin(String customerPin) {
      this.customerPin = customerPin;
   }

   @JsonProperty("customerPin")
   public String getCustomerPin() {
      return this.customerPin;
   }

   @JsonProperty("popPlatformCouponRateAmount")
   public void setPopPlatformCouponRateAmount(BigDecimal popPlatformCouponRateAmount) {
      this.popPlatformCouponRateAmount = popPlatformCouponRateAmount;
   }

   @JsonProperty("popPlatformCouponRateAmount")
   public BigDecimal getPopPlatformCouponRateAmount() {
      return this.popPlatformCouponRateAmount;
   }

   @JsonProperty("applyPrice")
   public void setApplyPrice(BigDecimal applyPrice) {
      this.applyPrice = applyPrice;
   }

   @JsonProperty("applyPrice")
   public BigDecimal getApplyPrice() {
      return this.applyPrice;
   }

   @JsonProperty("succAmount")
   public void setSuccAmount(BigDecimal succAmount) {
      this.succAmount = succAmount;
   }

   @JsonProperty("succAmount")
   public BigDecimal getSuccAmount() {
      return this.succAmount;
   }

   @JsonProperty("applyDate")
   public void setApplyDate(Date applyDate) {
      this.applyDate = applyDate;
   }

   @JsonProperty("applyDate")
   public Date getApplyDate() {
      return this.applyDate;
   }

   @JsonProperty("skuId")
   public void setSkuId(Long skuId) {
      this.skuId = skuId;
   }

   @JsonProperty("skuId")
   public Long getSkuId() {
      return this.skuId;
   }

   @JsonProperty("realApplyId")
   public void setRealApplyId(Long realApplyId) {
      this.realApplyId = realApplyId;
   }

   @JsonProperty("realApplyId")
   public Long getRealApplyId() {
      return this.realApplyId;
   }

   @JsonProperty("uuid")
   public void setUuid(Long uuid) {
      this.uuid = uuid;
   }

   @JsonProperty("uuid")
   public Long getUuid() {
      return this.uuid;
   }

   @JsonProperty("open_id_seller")
   public void setOpenIdSeller(Long openIdSeller) {
      this.openIdSeller = openIdSeller;
   }

   @JsonProperty("open_id_seller")
   public Long getOpenIdSeller() {
      return this.openIdSeller;
   }

   @JsonProperty("xid_seller")
   public void setXidSeller(Long xidSeller) {
      this.xidSeller = xidSeller;
   }

   @JsonProperty("xid_seller")
   public Long getXidSeller() {
      return this.xidSeller;
   }

   @JsonProperty("encrypt_venderId")
   public void setEncryptVenderId(String encryptVenderId) {
      this.encryptVenderId = encryptVenderId;
   }

   @JsonProperty("encrypt_venderId")
   public String getEncryptVenderId() {
      return this.encryptVenderId;
   }

   @JsonProperty("encrypt_open_id_seller")
   public void setEncryptOpenIdSeller(String encryptOpenIdSeller) {
      this.encryptOpenIdSeller = encryptOpenIdSeller;
   }

   @JsonProperty("encrypt_open_id_seller")
   public String getEncryptOpenIdSeller() {
      return this.encryptOpenIdSeller;
   }

   @JsonProperty("encrypt_xid_seller")
   public void setEncryptXidSeller(String encryptXidSeller) {
      this.encryptXidSeller = encryptXidSeller;
   }

   @JsonProperty("encrypt_xid_seller")
   public String getEncryptXidSeller() {
      return this.encryptXidSeller;
   }
}
