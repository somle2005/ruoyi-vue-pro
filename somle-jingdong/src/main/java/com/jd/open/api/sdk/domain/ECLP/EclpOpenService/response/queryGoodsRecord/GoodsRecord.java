package com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.queryGoodsRecord;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class GoodsRecord implements Serializable {
   private String bondedArea;
   private String platformId;
   private String platformName;
   private String venderId;
   private String goodsNo;
   private String deptNo;
   private String isvGoodsNo;
   private String ccProvider;
   private String pattern;
   private String skuId;
   private String barcodes;
   private String postChangeType;
   private String brand;
   private String brandEn;
   private String goodsName;
   private String goodsNameEn;
   private String modelNumber;
   private String spe;
   private String unit;
   private String grossWeight;
   private String netWeight;
   private String hsCode;
   private int vatRate;
   private int taxRate;
   private String hgsbys;
   private String function;
   private String purpose;
   private String composition;
   private String enterpriseName;
   private String enterpriseAddress;
   private String country;
   private String qiCountry;
   private String originRegion;
   private String goodsCostPrice;
   private String goodsSellerPrice;
   private String volume;
   private int safeDays;
   private String saleWebPage;
   private String contacts;
   private String email;
   private String telephone;
   private byte recordSuccess;
   private String sellerRecord;
   private String customRecord;
   private String qiRecord;
   private String taxNumberPost;
   private String postRate;
   private String measurement;
   private String qiMeasurement;
   private String legalUnit1;
   private String legalAmount1;
   private String legalUnit2;
   private String legalAmount2;
   private String itemNo;

   @JsonProperty("bondedArea")
   public void setBondedArea(String bondedArea) {
      this.bondedArea = bondedArea;
   }

   @JsonProperty("bondedArea")
   public String getBondedArea() {
      return this.bondedArea;
   }

   @JsonProperty("platformId")
   public void setPlatformId(String platformId) {
      this.platformId = platformId;
   }

   @JsonProperty("platformId")
   public String getPlatformId() {
      return this.platformId;
   }

   @JsonProperty("platformName")
   public void setPlatformName(String platformName) {
      this.platformName = platformName;
   }

   @JsonProperty("platformName")
   public String getPlatformName() {
      return this.platformName;
   }

   @JsonProperty("venderId")
   public void setVenderId(String venderId) {
      this.venderId = venderId;
   }

   @JsonProperty("venderId")
   public String getVenderId() {
      return this.venderId;
   }

   @JsonProperty("goodsNo")
   public void setGoodsNo(String goodsNo) {
      this.goodsNo = goodsNo;
   }

   @JsonProperty("goodsNo")
   public String getGoodsNo() {
      return this.goodsNo;
   }

   @JsonProperty("deptNo")
   public void setDeptNo(String deptNo) {
      this.deptNo = deptNo;
   }

   @JsonProperty("deptNo")
   public String getDeptNo() {
      return this.deptNo;
   }

   @JsonProperty("isvGoodsNo")
   public void setIsvGoodsNo(String isvGoodsNo) {
      this.isvGoodsNo = isvGoodsNo;
   }

   @JsonProperty("isvGoodsNo")
   public String getIsvGoodsNo() {
      return this.isvGoodsNo;
   }

   @JsonProperty("ccProvider")
   public void setCcProvider(String ccProvider) {
      this.ccProvider = ccProvider;
   }

   @JsonProperty("ccProvider")
   public String getCcProvider() {
      return this.ccProvider;
   }

   @JsonProperty("pattern")
   public void setPattern(String pattern) {
      this.pattern = pattern;
   }

   @JsonProperty("pattern")
   public String getPattern() {
      return this.pattern;
   }

   @JsonProperty("skuId")
   public void setSkuId(String skuId) {
      this.skuId = skuId;
   }

   @JsonProperty("skuId")
   public String getSkuId() {
      return this.skuId;
   }

   @JsonProperty("barcodes")
   public void setBarcodes(String barcodes) {
      this.barcodes = barcodes;
   }

   @JsonProperty("barcodes")
   public String getBarcodes() {
      return this.barcodes;
   }

   @JsonProperty("postChangeType")
   public void setPostChangeType(String postChangeType) {
      this.postChangeType = postChangeType;
   }

   @JsonProperty("postChangeType")
   public String getPostChangeType() {
      return this.postChangeType;
   }

   @JsonProperty("brand")
   public void setBrand(String brand) {
      this.brand = brand;
   }

   @JsonProperty("brand")
   public String getBrand() {
      return this.brand;
   }

   @JsonProperty("brandEn")
   public void setBrandEn(String brandEn) {
      this.brandEn = brandEn;
   }

   @JsonProperty("brandEn")
   public String getBrandEn() {
      return this.brandEn;
   }

   @JsonProperty("goodsName")
   public void setGoodsName(String goodsName) {
      this.goodsName = goodsName;
   }

   @JsonProperty("goodsName")
   public String getGoodsName() {
      return this.goodsName;
   }

   @JsonProperty("goodsNameEn")
   public void setGoodsNameEn(String goodsNameEn) {
      this.goodsNameEn = goodsNameEn;
   }

   @JsonProperty("goodsNameEn")
   public String getGoodsNameEn() {
      return this.goodsNameEn;
   }

   @JsonProperty("modelNumber")
   public void setModelNumber(String modelNumber) {
      this.modelNumber = modelNumber;
   }

   @JsonProperty("modelNumber")
   public String getModelNumber() {
      return this.modelNumber;
   }

   @JsonProperty("spe")
   public void setSpe(String spe) {
      this.spe = spe;
   }

   @JsonProperty("spe")
   public String getSpe() {
      return this.spe;
   }

   @JsonProperty("unit")
   public void setUnit(String unit) {
      this.unit = unit;
   }

   @JsonProperty("unit")
   public String getUnit() {
      return this.unit;
   }

   @JsonProperty("grossWeight")
   public void setGrossWeight(String grossWeight) {
      this.grossWeight = grossWeight;
   }

   @JsonProperty("grossWeight")
   public String getGrossWeight() {
      return this.grossWeight;
   }

   @JsonProperty("netWeight")
   public void setNetWeight(String netWeight) {
      this.netWeight = netWeight;
   }

   @JsonProperty("netWeight")
   public String getNetWeight() {
      return this.netWeight;
   }

   @JsonProperty("hsCode")
   public void setHsCode(String hsCode) {
      this.hsCode = hsCode;
   }

   @JsonProperty("hsCode")
   public String getHsCode() {
      return this.hsCode;
   }

   @JsonProperty("vatRate")
   public void setVatRate(int vatRate) {
      this.vatRate = vatRate;
   }

   @JsonProperty("vatRate")
   public int getVatRate() {
      return this.vatRate;
   }

   @JsonProperty("taxRate")
   public void setTaxRate(int taxRate) {
      this.taxRate = taxRate;
   }

   @JsonProperty("taxRate")
   public int getTaxRate() {
      return this.taxRate;
   }

   @JsonProperty("hgsbys")
   public void setHgsbys(String hgsbys) {
      this.hgsbys = hgsbys;
   }

   @JsonProperty("hgsbys")
   public String getHgsbys() {
      return this.hgsbys;
   }

   @JsonProperty("function")
   public void setFunction(String function) {
      this.function = function;
   }

   @JsonProperty("function")
   public String getFunction() {
      return this.function;
   }

   @JsonProperty("purpose")
   public void setPurpose(String purpose) {
      this.purpose = purpose;
   }

   @JsonProperty("purpose")
   public String getPurpose() {
      return this.purpose;
   }

   @JsonProperty("composition")
   public void setComposition(String composition) {
      this.composition = composition;
   }

   @JsonProperty("composition")
   public String getComposition() {
      return this.composition;
   }

   @JsonProperty("enterpriseName")
   public void setEnterpriseName(String enterpriseName) {
      this.enterpriseName = enterpriseName;
   }

   @JsonProperty("enterpriseName")
   public String getEnterpriseName() {
      return this.enterpriseName;
   }

   @JsonProperty("enterpriseAddress")
   public void setEnterpriseAddress(String enterpriseAddress) {
      this.enterpriseAddress = enterpriseAddress;
   }

   @JsonProperty("enterpriseAddress")
   public String getEnterpriseAddress() {
      return this.enterpriseAddress;
   }

   @JsonProperty("country")
   public void setCountry(String country) {
      this.country = country;
   }

   @JsonProperty("country")
   public String getCountry() {
      return this.country;
   }

   @JsonProperty("qiCountry")
   public void setQiCountry(String qiCountry) {
      this.qiCountry = qiCountry;
   }

   @JsonProperty("qiCountry")
   public String getQiCountry() {
      return this.qiCountry;
   }

   @JsonProperty("originRegion")
   public void setOriginRegion(String originRegion) {
      this.originRegion = originRegion;
   }

   @JsonProperty("originRegion")
   public String getOriginRegion() {
      return this.originRegion;
   }

   @JsonProperty("goodsCostPrice")
   public void setGoodsCostPrice(String goodsCostPrice) {
      this.goodsCostPrice = goodsCostPrice;
   }

   @JsonProperty("goodsCostPrice")
   public String getGoodsCostPrice() {
      return this.goodsCostPrice;
   }

   @JsonProperty("goodsSellerPrice")
   public void setGoodsSellerPrice(String goodsSellerPrice) {
      this.goodsSellerPrice = goodsSellerPrice;
   }

   @JsonProperty("goodsSellerPrice")
   public String getGoodsSellerPrice() {
      return this.goodsSellerPrice;
   }

   @JsonProperty("volume")
   public void setVolume(String volume) {
      this.volume = volume;
   }

   @JsonProperty("volume")
   public String getVolume() {
      return this.volume;
   }

   @JsonProperty("safeDays")
   public void setSafeDays(int safeDays) {
      this.safeDays = safeDays;
   }

   @JsonProperty("safeDays")
   public int getSafeDays() {
      return this.safeDays;
   }

   @JsonProperty("saleWebPage")
   public void setSaleWebPage(String saleWebPage) {
      this.saleWebPage = saleWebPage;
   }

   @JsonProperty("saleWebPage")
   public String getSaleWebPage() {
      return this.saleWebPage;
   }

   @JsonProperty("contacts")
   public void setContacts(String contacts) {
      this.contacts = contacts;
   }

   @JsonProperty("contacts")
   public String getContacts() {
      return this.contacts;
   }

   @JsonProperty("email")
   public void setEmail(String email) {
      this.email = email;
   }

   @JsonProperty("email")
   public String getEmail() {
      return this.email;
   }

   @JsonProperty("telephone")
   public void setTelephone(String telephone) {
      this.telephone = telephone;
   }

   @JsonProperty("telephone")
   public String getTelephone() {
      return this.telephone;
   }

   @JsonProperty("recordSuccess")
   public void setRecordSuccess(byte recordSuccess) {
      this.recordSuccess = recordSuccess;
   }

   @JsonProperty("recordSuccess")
   public byte getRecordSuccess() {
      return this.recordSuccess;
   }

   @JsonProperty("sellerRecord")
   public void setSellerRecord(String sellerRecord) {
      this.sellerRecord = sellerRecord;
   }

   @JsonProperty("sellerRecord")
   public String getSellerRecord() {
      return this.sellerRecord;
   }

   @JsonProperty("customRecord")
   public void setCustomRecord(String customRecord) {
      this.customRecord = customRecord;
   }

   @JsonProperty("customRecord")
   public String getCustomRecord() {
      return this.customRecord;
   }

   @JsonProperty("qiRecord")
   public void setQiRecord(String qiRecord) {
      this.qiRecord = qiRecord;
   }

   @JsonProperty("qiRecord")
   public String getQiRecord() {
      return this.qiRecord;
   }

   @JsonProperty("taxNumberPost")
   public void setTaxNumberPost(String taxNumberPost) {
      this.taxNumberPost = taxNumberPost;
   }

   @JsonProperty("taxNumberPost")
   public String getTaxNumberPost() {
      return this.taxNumberPost;
   }

   @JsonProperty("postRate")
   public void setPostRate(String postRate) {
      this.postRate = postRate;
   }

   @JsonProperty("postRate")
   public String getPostRate() {
      return this.postRate;
   }

   @JsonProperty("measurement")
   public void setMeasurement(String measurement) {
      this.measurement = measurement;
   }

   @JsonProperty("measurement")
   public String getMeasurement() {
      return this.measurement;
   }

   @JsonProperty("qiMeasurement")
   public void setQiMeasurement(String qiMeasurement) {
      this.qiMeasurement = qiMeasurement;
   }

   @JsonProperty("qiMeasurement")
   public String getQiMeasurement() {
      return this.qiMeasurement;
   }

   @JsonProperty("legalUnit1")
   public void setLegalUnit1(String legalUnit1) {
      this.legalUnit1 = legalUnit1;
   }

   @JsonProperty("legalUnit1")
   public String getLegalUnit1() {
      return this.legalUnit1;
   }

   @JsonProperty("legalAmount1")
   public void setLegalAmount1(String legalAmount1) {
      this.legalAmount1 = legalAmount1;
   }

   @JsonProperty("legalAmount1")
   public String getLegalAmount1() {
      return this.legalAmount1;
   }

   @JsonProperty("legalUnit2")
   public void setLegalUnit2(String legalUnit2) {
      this.legalUnit2 = legalUnit2;
   }

   @JsonProperty("legalUnit2")
   public String getLegalUnit2() {
      return this.legalUnit2;
   }

   @JsonProperty("legalAmount2")
   public void setLegalAmount2(String legalAmount2) {
      this.legalAmount2 = legalAmount2;
   }

   @JsonProperty("legalAmount2")
   public String getLegalAmount2() {
      return this.legalAmount2;
   }

   @JsonProperty("itemNo")
   public void setItemNo(String itemNo) {
      this.itemNo = itemNo;
   }

   @JsonProperty("itemNo")
   public String getItemNo() {
      return this.itemNo;
   }
}
