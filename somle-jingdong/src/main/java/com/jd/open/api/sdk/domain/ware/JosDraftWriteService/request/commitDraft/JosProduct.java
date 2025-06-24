package com.jd.open.api.sdk.domain.ware.JosDraftWriteService.request.commitDraft;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import java.util.Set;

public class JosProduct implements Serializable {
   private String title;
   private Set<JosFeature> features;
   private Long promiseId;
   private BigDecimal jdPrice;
   private String designConcept;
   private JosAdWords adWords;
   private Integer height;
   private String packListing;
   private Long multiCategoryId;
   private BigDecimal weight;
   private String afterSales;
   private String barCode;
   private Set<JosProp> multiCateProps;
   private Long brandId;
   private BigDecimal marketPrice;
   private Integer transportId;
   private Set<Long> shopCategorys;
   private String itemNum;
   private String introduction;
   private Integer delivery;
   private Integer length;
   private Integer width;
   private String outerId;
   private Long spuId;
   private Integer location;
   private Long categoryId;
   private Integer productStatus;
   private String introductionUseFlag;
   private String fitCaseHtmlPc;
   private String fitCaseHtmlApp;
   private List<String> specialServices;
   private String templateId;
   private Long productId;
   private String zhuangBaId;
   private BigDecimal costPrice;

   @JsonProperty("title")
   public void setTitle(String title) {
      this.title = title;
   }

   @JsonProperty("title")
   public String getTitle() {
      return this.title;
   }

   @JsonProperty("features")
   public void setFeatures(Set<JosFeature> features) {
      this.features = features;
   }

   @JsonProperty("features")
   public Set<JosFeature> getFeatures() {
      return this.features;
   }

   @JsonProperty("promiseId")
   public void setPromiseId(Long promiseId) {
      this.promiseId = promiseId;
   }

   @JsonProperty("promiseId")
   public Long getPromiseId() {
      return this.promiseId;
   }

   @JsonProperty("jdPrice")
   public void setJdPrice(BigDecimal jdPrice) {
      this.jdPrice = jdPrice;
   }

   @JsonProperty("jdPrice")
   public BigDecimal getJdPrice() {
      return this.jdPrice;
   }

   @JsonProperty("designConcept")
   public void setDesignConcept(String designConcept) {
      this.designConcept = designConcept;
   }

   @JsonProperty("designConcept")
   public String getDesignConcept() {
      return this.designConcept;
   }

   @JsonProperty("adWords")
   public void setAdWords(JosAdWords adWords) {
      this.adWords = adWords;
   }

   @JsonProperty("adWords")
   public JosAdWords getAdWords() {
      return this.adWords;
   }

   @JsonProperty("height")
   public void setHeight(Integer height) {
      this.height = height;
   }

   @JsonProperty("height")
   public Integer getHeight() {
      return this.height;
   }

   @JsonProperty("packListing")
   public void setPackListing(String packListing) {
      this.packListing = packListing;
   }

   @JsonProperty("packListing")
   public String getPackListing() {
      return this.packListing;
   }

   @JsonProperty("multiCategoryId")
   public void setMultiCategoryId(Long multiCategoryId) {
      this.multiCategoryId = multiCategoryId;
   }

   @JsonProperty("multiCategoryId")
   public Long getMultiCategoryId() {
      return this.multiCategoryId;
   }

   @JsonProperty("weight")
   public void setWeight(BigDecimal weight) {
      this.weight = weight;
   }

   @JsonProperty("weight")
   public BigDecimal getWeight() {
      return this.weight;
   }

   @JsonProperty("afterSales")
   public void setAfterSales(String afterSales) {
      this.afterSales = afterSales;
   }

   @JsonProperty("afterSales")
   public String getAfterSales() {
      return this.afterSales;
   }

   @JsonProperty("barCode")
   public void setBarCode(String barCode) {
      this.barCode = barCode;
   }

   @JsonProperty("barCode")
   public String getBarCode() {
      return this.barCode;
   }

   @JsonProperty("multiCateProps")
   public void setMultiCateProps(Set<JosProp> multiCateProps) {
      this.multiCateProps = multiCateProps;
   }

   @JsonProperty("multiCateProps")
   public Set<JosProp> getMultiCateProps() {
      return this.multiCateProps;
   }

   @JsonProperty("brandId")
   public void setBrandId(Long brandId) {
      this.brandId = brandId;
   }

   @JsonProperty("brandId")
   public Long getBrandId() {
      return this.brandId;
   }

   @JsonProperty("marketPrice")
   public void setMarketPrice(BigDecimal marketPrice) {
      this.marketPrice = marketPrice;
   }

   @JsonProperty("marketPrice")
   public BigDecimal getMarketPrice() {
      return this.marketPrice;
   }

   @JsonProperty("transportId")
   public void setTransportId(Integer transportId) {
      this.transportId = transportId;
   }

   @JsonProperty("transportId")
   public Integer getTransportId() {
      return this.transportId;
   }

   @JsonProperty("shopCategorys")
   public void setShopCategorys(Set<Long> shopCategorys) {
      this.shopCategorys = shopCategorys;
   }

   @JsonProperty("shopCategorys")
   public Set<Long> getShopCategorys() {
      return this.shopCategorys;
   }

   @JsonProperty("itemNum")
   public void setItemNum(String itemNum) {
      this.itemNum = itemNum;
   }

   @JsonProperty("itemNum")
   public String getItemNum() {
      return this.itemNum;
   }

   @JsonProperty("introduction")
   public void setIntroduction(String introduction) {
      this.introduction = introduction;
   }

   @JsonProperty("introduction")
   public String getIntroduction() {
      return this.introduction;
   }

   @JsonProperty("delivery")
   public void setDelivery(Integer delivery) {
      this.delivery = delivery;
   }

   @JsonProperty("delivery")
   public Integer getDelivery() {
      return this.delivery;
   }

   @JsonProperty("length")
   public void setLength(Integer length) {
      this.length = length;
   }

   @JsonProperty("length")
   public Integer getLength() {
      return this.length;
   }

   @JsonProperty("width")
   public void setWidth(Integer width) {
      this.width = width;
   }

   @JsonProperty("width")
   public Integer getWidth() {
      return this.width;
   }

   @JsonProperty("outerId")
   public void setOuterId(String outerId) {
      this.outerId = outerId;
   }

   @JsonProperty("outerId")
   public String getOuterId() {
      return this.outerId;
   }

   @JsonProperty("spuId")
   public void setSpuId(Long spuId) {
      this.spuId = spuId;
   }

   @JsonProperty("spuId")
   public Long getSpuId() {
      return this.spuId;
   }

   @JsonProperty("location")
   public void setLocation(Integer location) {
      this.location = location;
   }

   @JsonProperty("location")
   public Integer getLocation() {
      return this.location;
   }

   @JsonProperty("categoryId")
   public void setCategoryId(Long categoryId) {
      this.categoryId = categoryId;
   }

   @JsonProperty("categoryId")
   public Long getCategoryId() {
      return this.categoryId;
   }

   @JsonProperty("productStatus")
   public void setProductStatus(Integer productStatus) {
      this.productStatus = productStatus;
   }

   @JsonProperty("productStatus")
   public Integer getProductStatus() {
      return this.productStatus;
   }

   @JsonProperty("introductionUseFlag")
   public void setIntroductionUseFlag(String introductionUseFlag) {
      this.introductionUseFlag = introductionUseFlag;
   }

   @JsonProperty("introductionUseFlag")
   public String getIntroductionUseFlag() {
      return this.introductionUseFlag;
   }

   @JsonProperty("fitCaseHtmlPc")
   public void setFitCaseHtmlPc(String fitCaseHtmlPc) {
      this.fitCaseHtmlPc = fitCaseHtmlPc;
   }

   @JsonProperty("fitCaseHtmlPc")
   public String getFitCaseHtmlPc() {
      return this.fitCaseHtmlPc;
   }

   @JsonProperty("fitCaseHtmlApp")
   public void setFitCaseHtmlApp(String fitCaseHtmlApp) {
      this.fitCaseHtmlApp = fitCaseHtmlApp;
   }

   @JsonProperty("fitCaseHtmlApp")
   public String getFitCaseHtmlApp() {
      return this.fitCaseHtmlApp;
   }

   @JsonProperty("specialServices")
   public void setSpecialServices(List<String> specialServices) {
      this.specialServices = specialServices;
   }

   @JsonProperty("specialServices")
   public List<String> getSpecialServices() {
      return this.specialServices;
   }

   @JsonProperty("templateId")
   public void setTemplateId(String templateId) {
      this.templateId = templateId;
   }

   @JsonProperty("templateId")
   public String getTemplateId() {
      return this.templateId;
   }

   @JsonProperty("productId")
   public void setProductId(Long productId) {
      this.productId = productId;
   }

   @JsonProperty("productId")
   public Long getProductId() {
      return this.productId;
   }

   @JsonProperty("zhuangBaId")
   public void setZhuangBaId(String zhuangBaId) {
      this.zhuangBaId = zhuangBaId;
   }

   @JsonProperty("zhuangBaId")
   public String getZhuangBaId() {
      return this.zhuangBaId;
   }

   @JsonProperty("costPrice")
   public void setCostPrice(BigDecimal costPrice) {
      this.costPrice = costPrice;
   }

   @JsonProperty("costPrice")
   public BigDecimal getCostPrice() {
      return this.costPrice;
   }
}
