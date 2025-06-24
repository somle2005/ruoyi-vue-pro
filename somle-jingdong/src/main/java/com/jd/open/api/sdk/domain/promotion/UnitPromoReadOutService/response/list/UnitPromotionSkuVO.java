package com.jd.open.api.sdk.domain.promotion.UnitPromoReadOutService.response.list;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

public class UnitPromotionSkuVO implements Serializable {
   private BigDecimal discount;
   private Long venderId;
   private Long erpId;
   private Long skuId;
   private String imgRui;
   private Integer limitNum;
   private BigDecimal realTimePrice;
   private Integer rebateType;
   private Long categoryId1;
   private BigDecimal promoPrice;
   private Long categoryId2;
   private Integer promoStatus;
   private String brandId;
   private String approvalName;
   private BigDecimal jdPrice;
   private Boolean delEnable;
   private String supplierCode;
   private Boolean valid;
   private String skuName;
   private Integer synchStatus;
   private List<PromoApprovalStep> approvalList;
   private String erpCode;
   private Boolean oneSkuManyVendor;
   private Long wareId;
   private UnitPromoRebateInfo rebate;
   private BigDecimal createJdPrice;
   private Long categoryId;

   @JsonProperty("discount")
   public void setDiscount(BigDecimal discount) {
      this.discount = discount;
   }

   @JsonProperty("discount")
   public BigDecimal getDiscount() {
      return this.discount;
   }

   @JsonProperty("venderId")
   public void setVenderId(Long venderId) {
      this.venderId = venderId;
   }

   @JsonProperty("venderId")
   public Long getVenderId() {
      return this.venderId;
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

   @JsonProperty("limitNum")
   public void setLimitNum(Integer limitNum) {
      this.limitNum = limitNum;
   }

   @JsonProperty("limitNum")
   public Integer getLimitNum() {
      return this.limitNum;
   }

   @JsonProperty("realTimePrice")
   public void setRealTimePrice(BigDecimal realTimePrice) {
      this.realTimePrice = realTimePrice;
   }

   @JsonProperty("realTimePrice")
   public BigDecimal getRealTimePrice() {
      return this.realTimePrice;
   }

   @JsonProperty("rebateType")
   public void setRebateType(Integer rebateType) {
      this.rebateType = rebateType;
   }

   @JsonProperty("rebateType")
   public Integer getRebateType() {
      return this.rebateType;
   }

   @JsonProperty("categoryId1")
   public void setCategoryId1(Long categoryId1) {
      this.categoryId1 = categoryId1;
   }

   @JsonProperty("categoryId1")
   public Long getCategoryId1() {
      return this.categoryId1;
   }

   @JsonProperty("promoPrice")
   public void setPromoPrice(BigDecimal promoPrice) {
      this.promoPrice = promoPrice;
   }

   @JsonProperty("promoPrice")
   public BigDecimal getPromoPrice() {
      return this.promoPrice;
   }

   @JsonProperty("categoryId2")
   public void setCategoryId2(Long categoryId2) {
      this.categoryId2 = categoryId2;
   }

   @JsonProperty("categoryId2")
   public Long getCategoryId2() {
      return this.categoryId2;
   }

   @JsonProperty("promoStatus")
   public void setPromoStatus(Integer promoStatus) {
      this.promoStatus = promoStatus;
   }

   @JsonProperty("promoStatus")
   public Integer getPromoStatus() {
      return this.promoStatus;
   }

   @JsonProperty("brandId")
   public void setBrandId(String brandId) {
      this.brandId = brandId;
   }

   @JsonProperty("brandId")
   public String getBrandId() {
      return this.brandId;
   }

   @JsonProperty("approvalName")
   public void setApprovalName(String approvalName) {
      this.approvalName = approvalName;
   }

   @JsonProperty("approvalName")
   public String getApprovalName() {
      return this.approvalName;
   }

   @JsonProperty("jdPrice")
   public void setJdPrice(BigDecimal jdPrice) {
      this.jdPrice = jdPrice;
   }

   @JsonProperty("jdPrice")
   public BigDecimal getJdPrice() {
      return this.jdPrice;
   }

   @JsonProperty("delEnable")
   public void setDelEnable(Boolean delEnable) {
      this.delEnable = delEnable;
   }

   @JsonProperty("delEnable")
   public Boolean getDelEnable() {
      return this.delEnable;
   }

   @JsonProperty("supplierCode")
   public void setSupplierCode(String supplierCode) {
      this.supplierCode = supplierCode;
   }

   @JsonProperty("supplierCode")
   public String getSupplierCode() {
      return this.supplierCode;
   }

   @JsonProperty("valid")
   public void setValid(Boolean valid) {
      this.valid = valid;
   }

   @JsonProperty("valid")
   public Boolean getValid() {
      return this.valid;
   }

   @JsonProperty("skuName")
   public void setSkuName(String skuName) {
      this.skuName = skuName;
   }

   @JsonProperty("skuName")
   public String getSkuName() {
      return this.skuName;
   }

   @JsonProperty("synchStatus")
   public void setSynchStatus(Integer synchStatus) {
      this.synchStatus = synchStatus;
   }

   @JsonProperty("synchStatus")
   public Integer getSynchStatus() {
      return this.synchStatus;
   }

   @JsonProperty("approvalList")
   public void setApprovalList(List<PromoApprovalStep> approvalList) {
      this.approvalList = approvalList;
   }

   @JsonProperty("approvalList")
   public List<PromoApprovalStep> getApprovalList() {
      return this.approvalList;
   }

   @JsonProperty("erpCode")
   public void setErpCode(String erpCode) {
      this.erpCode = erpCode;
   }

   @JsonProperty("erpCode")
   public String getErpCode() {
      return this.erpCode;
   }

   @JsonProperty("oneSkuManyVendor")
   public void setOneSkuManyVendor(Boolean oneSkuManyVendor) {
      this.oneSkuManyVendor = oneSkuManyVendor;
   }

   @JsonProperty("oneSkuManyVendor")
   public Boolean getOneSkuManyVendor() {
      return this.oneSkuManyVendor;
   }

   @JsonProperty("wareId")
   public void setWareId(Long wareId) {
      this.wareId = wareId;
   }

   @JsonProperty("wareId")
   public Long getWareId() {
      return this.wareId;
   }

   @JsonProperty("rebate")
   public void setRebate(UnitPromoRebateInfo rebate) {
      this.rebate = rebate;
   }

   @JsonProperty("rebate")
   public UnitPromoRebateInfo getRebate() {
      return this.rebate;
   }

   @JsonProperty("createJdPrice")
   public void setCreateJdPrice(BigDecimal createJdPrice) {
      this.createJdPrice = createJdPrice;
   }

   @JsonProperty("createJdPrice")
   public BigDecimal getCreateJdPrice() {
      return this.createJdPrice;
   }

   @JsonProperty("categoryId")
   public void setCategoryId(Long categoryId) {
      this.categoryId = categoryId;
   }

   @JsonProperty("categoryId")
   public Long getCategoryId() {
      return this.categoryId;
   }
}
