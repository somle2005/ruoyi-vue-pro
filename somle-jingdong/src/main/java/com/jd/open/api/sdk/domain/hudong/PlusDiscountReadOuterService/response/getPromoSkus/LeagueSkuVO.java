package com.jd.open.api.sdk.domain.hudong.PlusDiscountReadOuterService.response.getPromoSkus;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;

public class LeagueSkuVO implements Serializable {
   private Long stockNum;
   private String unChangeSkuImg;
   private Long erpId;
   private Long skuId;
   private String imgRui;
   private BigDecimal realTimePrice;
   private BigDecimal promoPrice;
   private Integer promoStatus;
   private BigDecimal jdPrice;
   private String supplierId;
   private String supplierCode;
   private String skuName;
   private String erpCode;
   private BigDecimal createJdPrice;

   @JsonProperty("stockNum")
   public void setStockNum(Long stockNum) {
      this.stockNum = stockNum;
   }

   @JsonProperty("stockNum")
   public Long getStockNum() {
      return this.stockNum;
   }

   @JsonProperty("unChangeSkuImg")
   public void setUnChangeSkuImg(String unChangeSkuImg) {
      this.unChangeSkuImg = unChangeSkuImg;
   }

   @JsonProperty("unChangeSkuImg")
   public String getUnChangeSkuImg() {
      return this.unChangeSkuImg;
   }

   @JsonProperty("erpId")
   public void setErpId(Long erpId) {
      this.erpId = erpId;
   }

   @JsonProperty("erpId")
   public Long getErpId() {
      return this.erpId;
   }

   @JsonProperty("skuId")
   public void setSkuId(Long skuId) {
      this.skuId = skuId;
   }

   @JsonProperty("skuId")
   public Long getSkuId() {
      return this.skuId;
   }

   @JsonProperty("imgRui")
   public void setImgRui(String imgRui) {
      this.imgRui = imgRui;
   }

   @JsonProperty("imgRui")
   public String getImgRui() {
      return this.imgRui;
   }

   @JsonProperty("realTimePrice")
   public void setRealTimePrice(BigDecimal realTimePrice) {
      this.realTimePrice = realTimePrice;
   }

   @JsonProperty("realTimePrice")
   public BigDecimal getRealTimePrice() {
      return this.realTimePrice;
   }

   @JsonProperty("promoPrice")
   public void setPromoPrice(BigDecimal promoPrice) {
      this.promoPrice = promoPrice;
   }

   @JsonProperty("promoPrice")
   public BigDecimal getPromoPrice() {
      return this.promoPrice;
   }

   @JsonProperty("promoStatus")
   public void setPromoStatus(Integer promoStatus) {
      this.promoStatus = promoStatus;
   }

   @JsonProperty("promoStatus")
   public Integer getPromoStatus() {
      return this.promoStatus;
   }

   @JsonProperty("jdPrice")
   public void setJdPrice(BigDecimal jdPrice) {
      this.jdPrice = jdPrice;
   }

   @JsonProperty("jdPrice")
   public BigDecimal getJdPrice() {
      return this.jdPrice;
   }

   @JsonProperty("supplierId")
   public void setSupplierId(String supplierId) {
      this.supplierId = supplierId;
   }

   @JsonProperty("supplierId")
   public String getSupplierId() {
      return this.supplierId;
   }

   @JsonProperty("supplierCode")
   public void setSupplierCode(String supplierCode) {
      this.supplierCode = supplierCode;
   }

   @JsonProperty("supplierCode")
   public String getSupplierCode() {
      return this.supplierCode;
   }

   @JsonProperty("skuName")
   public void setSkuName(String skuName) {
      this.skuName = skuName;
   }

   @JsonProperty("skuName")
   public String getSkuName() {
      return this.skuName;
   }

   @JsonProperty("erpCode")
   public void setErpCode(String erpCode) {
      this.erpCode = erpCode;
   }

   @JsonProperty("erpCode")
   public String getErpCode() {
      return this.erpCode;
   }

   @JsonProperty("createJdPrice")
   public void setCreateJdPrice(BigDecimal createJdPrice) {
      this.createJdPrice = createJdPrice;
   }

   @JsonProperty("createJdPrice")
   public BigDecimal getCreateJdPrice() {
      return this.createJdPrice;
   }
}
