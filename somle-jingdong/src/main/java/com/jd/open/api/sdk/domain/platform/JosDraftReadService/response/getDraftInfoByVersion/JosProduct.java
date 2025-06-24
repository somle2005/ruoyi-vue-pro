package com.jd.open.api.sdk.domain.platform.JosDraftReadService.response.getDraftInfoByVersion;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Set;

public class JosProduct implements Serializable {
   private String templateId;
   private String title;
   private Long promiseId;
   private Set<JosFeature> features;
   private Long wareGroupId;
   private String fitCaseHtmlApp;
   private String designConcept;
   private Integer stockNum;
   private JosAdWords adWords;
   private Date modified;
   private String logo;
   private Long shopId;
   private Integer height;
   private String brandName;
   private String packListing;
   private Long productId;
   private String templateIds;
   private Date created;
   private Long multiCategoryId;
   private BigDecimal weight;
   private String afterSales;
   private String barCode;
   private Set<JosProp> multiCateProps;
   private Long brandId;
   private BigDecimal jdPrice;
   private List<String> specialServices;
   private String zhuangBaId;
   private JosProductTax productTax;
   private BigDecimal marketPrice;
   private String sellPoint;
   private Integer transportId;
   private Set<Long> shopCategorys;
   private String afterSaleDesc;
   private String itemNum;
   private Integer colType;
   private Date onlineTime;
   private Date offlineTime;
   private Boolean archival;
   private String introduction;
   private String delivery;
   private Integer length;
   private Integer productStatus;
   private Long categorySecId;
   private Long parentId;
   private String zhuangBaIntroduction;
   private String fitCaseHtmlPc;
   private Integer width;
   private String outerId;
   private Integer location;
   private Long spuId;
   private Long categoryId;
   private String introductionUseFlag;
   private BigDecimal costPrice;

   @JsonProperty("templateId")
   public void setTemplateId(String templateId) {
      this.templateId = templateId;
   }

   @JsonProperty("templateId")
   public String getTemplateId() {
      return this.templateId;
   }

   @JsonProperty("title")
   public void setTitle(String title) {
      this.title = title;
   }

   @JsonProperty("title")
   public String getTitle() {
      return this.title;
   }

   @JsonProperty("promiseId")
   public void setPromiseId(Long promiseId) {
      this.promiseId = promiseId;
   }

   @JsonProperty("promiseId")
   public Long getPromiseId() {
      return this.promiseId;
   }

   @JsonProperty("features")
   public void setFeatures(Set<JosFeature> features) {
      this.features = features;
   }

   @JsonProperty("features")
   public Set<JosFeature> getFeatures() {
      return this.features;
   }

   @JsonProperty("wareGroupId")
   public void setWareGroupId(Long wareGroupId) {
      this.wareGroupId = wareGroupId;
   }

   @JsonProperty("wareGroupId")
   public Long getWareGroupId() {
      return this.wareGroupId;
   }

   @JsonProperty("fitCaseHtmlApp")
   public void setFitCaseHtmlApp(String fitCaseHtmlApp) {
      this.fitCaseHtmlApp = fitCaseHtmlApp;
   }

   @JsonProperty("fitCaseHtmlApp")
   public String getFitCaseHtmlApp() {
      return this.fitCaseHtmlApp;
   }

   @JsonProperty("designConcept")
   public void setDesignConcept(String designConcept) {
      this.designConcept = designConcept;
   }

   @JsonProperty("designConcept")
   public String getDesignConcept() {
      return this.designConcept;
   }

   @JsonProperty("stockNum")
   public void setStockNum(Integer stockNum) {
      this.stockNum = stockNum;
   }

   @JsonProperty("stockNum")
   public Integer getStockNum() {
      return this.stockNum;
   }

   @JsonProperty("adWords")
   public void setAdWords(JosAdWords adWords) {
      this.adWords = adWords;
   }

   @JsonProperty("adWords")
   public JosAdWords getAdWords() {
      return this.adWords;
   }

   @JsonProperty("modified")
   public void setModified(Date modified) {
      this.modified = modified;
   }

   @JsonProperty("modified")
   public Date getModified() {
      return this.modified;
   }

   @JsonProperty("logo")
   public void setLogo(String logo) {
      this.logo = logo;
   }

   @JsonProperty("logo")
   public String getLogo() {
      return this.logo;
   }

   @JsonProperty("shopId")
   public void setShopId(Long shopId) {
      this.shopId = shopId;
   }

   @JsonProperty("shopId")
   public Long getShopId() {
      return this.shopId;
   }

   @JsonProperty("height")
   public void setHeight(Integer height) {
      this.height = height;
   }

   @JsonProperty("height")
   public Integer getHeight() {
      return this.height;
   }

   @JsonProperty("brandName")
   public void setBrandName(String brandName) {
      this.brandName = brandName;
   }

   @JsonProperty("brandName")
   public String getBrandName() {
      return this.brandName;
   }

   @JsonProperty("packListing")
   public void setPackListing(String packListing) {
      this.packListing = packListing;
   }

   @JsonProperty("packListing")
   public String getPackListing() {
      return this.packListing;
   }

   @JsonProperty("productId")
   public void setProductId(Long productId) {
      this.productId = productId;
   }

   @JsonProperty("productId")
   public Long getProductId() {
      return this.productId;
   }

   @JsonProperty("templateIds")
   public void setTemplateIds(String templateIds) {
      this.templateIds = templateIds;
   }

   @JsonProperty("templateIds")
   public String getTemplateIds() {
      return this.templateIds;
   }

   @JsonProperty("created")
   public void setCreated(Date created) {
      this.created = created;
   }

   @JsonProperty("created")
   public Date getCreated() {
      return this.created;
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

   @JsonProperty("jdPrice")
   public void setJdPrice(BigDecimal jdPrice) {
      this.jdPrice = jdPrice;
   }

   @JsonProperty("jdPrice")
   public BigDecimal getJdPrice() {
      return this.jdPrice;
   }

   @JsonProperty("specialServices")
   public void setSpecialServices(List<String> specialServices) {
      this.specialServices = specialServices;
   }

   @JsonProperty("specialServices")
   public List<String> getSpecialServices() {
      return this.specialServices;
   }

   @JsonProperty("zhuangBaId")
   public void setZhuangBaId(String zhuangBaId) {
      this.zhuangBaId = zhuangBaId;
   }

   @JsonProperty("zhuangBaId")
   public String getZhuangBaId() {
      return this.zhuangBaId;
   }

   @JsonProperty("productTax")
   public void setProductTax(JosProductTax productTax) {
      this.productTax = productTax;
   }

   @JsonProperty("productTax")
   public JosProductTax getProductTax() {
      return this.productTax;
   }

   @JsonProperty("marketPrice")
   public void setMarketPrice(BigDecimal marketPrice) {
      this.marketPrice = marketPrice;
   }

   @JsonProperty("marketPrice")
   public BigDecimal getMarketPrice() {
      return this.marketPrice;
   }

   @JsonProperty("sellPoint")
   public void setSellPoint(String sellPoint) {
      this.sellPoint = sellPoint;
   }

   @JsonProperty("sellPoint")
   public String getSellPoint() {
      return this.sellPoint;
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

   @JsonProperty("afterSaleDesc")
   public void setAfterSaleDesc(String afterSaleDesc) {
      this.afterSaleDesc = afterSaleDesc;
   }

   @JsonProperty("afterSaleDesc")
   public String getAfterSaleDesc() {
      return this.afterSaleDesc;
   }

   @JsonProperty("itemNum")
   public void setItemNum(String itemNum) {
      this.itemNum = itemNum;
   }

   @JsonProperty("itemNum")
   public String getItemNum() {
      return this.itemNum;
   }

   @JsonProperty("colType")
   public void setColType(Integer colType) {
      this.colType = colType;
   }

   @JsonProperty("colType")
   public Integer getColType() {
      return this.colType;
   }

   @JsonProperty("onlineTime")
   public void setOnlineTime(Date onlineTime) {
      this.onlineTime = onlineTime;
   }

   @JsonProperty("onlineTime")
   public Date getOnlineTime() {
      return this.onlineTime;
   }

   @JsonProperty("offlineTime")
   public void setOfflineTime(Date offlineTime) {
      this.offlineTime = offlineTime;
   }

   @JsonProperty("offlineTime")
   public Date getOfflineTime() {
      return this.offlineTime;
   }

   @JsonProperty("archival")
   public void setArchival(Boolean archival) {
      this.archival = archival;
   }

   @JsonProperty("archival")
   public Boolean getArchival() {
      return this.archival;
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
   public void setDelivery(String delivery) {
      this.delivery = delivery;
   }

   @JsonProperty("delivery")
   public String getDelivery() {
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

   @JsonProperty("productStatus")
   public void setProductStatus(Integer productStatus) {
      this.productStatus = productStatus;
   }

   @JsonProperty("productStatus")
   public Integer getProductStatus() {
      return this.productStatus;
   }

   @JsonProperty("categorySecId")
   public void setCategorySecId(Long categorySecId) {
      this.categorySecId = categorySecId;
   }

   @JsonProperty("categorySecId")
   public Long getCategorySecId() {
      return this.categorySecId;
   }

   @JsonProperty("parentId")
   public void setParentId(Long parentId) {
      this.parentId = parentId;
   }

   @JsonProperty("parentId")
   public Long getParentId() {
      return this.parentId;
   }

   @JsonProperty("zhuangBaIntroduction")
   public void setZhuangBaIntroduction(String zhuangBaIntroduction) {
      this.zhuangBaIntroduction = zhuangBaIntroduction;
   }

   @JsonProperty("zhuangBaIntroduction")
   public String getZhuangBaIntroduction() {
      return this.zhuangBaIntroduction;
   }

   @JsonProperty("fitCaseHtmlPc")
   public void setFitCaseHtmlPc(String fitCaseHtmlPc) {
      this.fitCaseHtmlPc = fitCaseHtmlPc;
   }

   @JsonProperty("fitCaseHtmlPc")
   public String getFitCaseHtmlPc() {
      return this.fitCaseHtmlPc;
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

   @JsonProperty("location")
   public void setLocation(Integer location) {
      this.location = location;
   }

   @JsonProperty("location")
   public Integer getLocation() {
      return this.location;
   }

   @JsonProperty("spuId")
   public void setSpuId(Long spuId) {
      this.spuId = spuId;
   }

   @JsonProperty("spuId")
   public Long getSpuId() {
      return this.spuId;
   }

   @JsonProperty("categoryId")
   public void setCategoryId(Long categoryId) {
      this.categoryId = categoryId;
   }

   @JsonProperty("categoryId")
   public Long getCategoryId() {
      return this.categoryId;
   }

   @JsonProperty("introductionUseFlag")
   public void setIntroductionUseFlag(String introductionUseFlag) {
      this.introductionUseFlag = introductionUseFlag;
   }

   @JsonProperty("introductionUseFlag")
   public String getIntroductionUseFlag() {
      return this.introductionUseFlag;
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
