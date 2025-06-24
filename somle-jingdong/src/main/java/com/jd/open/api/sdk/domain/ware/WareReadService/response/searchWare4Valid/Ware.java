package com.jd.open.api.sdk.domain.ware.WareReadService.response.searchWare4Valid;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Set;

public class Ware implements Serializable {
   private Long wareId;
   private String title;
   private Long categoryId;
   private Long brandId;
   private Long templateId;
   private Long transportId;
   private Integer wareStatus;
   private String outerId;
   private String itemNum;
   private String barCode;
   private Integer wareLocation;
   private Date modified;
   private Date created;
   private Date offlineTime;
   private Date onlineTime;
   private Integer colType;
   private String delivery;
   private AdWords adWords;
   private String wrap;
   private String packListing;
   private Float weight;
   private Integer width;
   private Integer height;
   private Integer length;
   private Set<Prop> props;
   private Set<Feature> features;
   private List<Image> images;
   private Set<Long> shopCategorys;
   private String mobileDesc;
   private String introduction;
   private String zhuangBaIntroduction;
   private String zhuangBaId;
   private String introductionUseFlag;
   private String afterSales;
   private String logo;
   private BigDecimal marketPrice;
   private BigDecimal costPrice;
   private BigDecimal jdPrice;
   private String brandName;
   private Long stockNum;
   private Long categorySecId;
   private Long shopId;
   private Long promiseId;
   private Long multiCategoryId;
   private Set<Prop> multiCateProps;
   private String sellPoint;
   private WareTax wareTax;
   private String afterSaleDesc;
   private String zhuangBaMobileDesc;
   private String mobileZhuangBaId;
   private String mobileDescUseFlag;
   private String fitCaseHtmlPc;
   private String fitCaseHtmlApp;
   private List<String> specialServices;
   private Long parentId;
   private Long wareGroupId;
   private String businessType;
   private String designConcept;
   private Boolean isArchival;
   private String templateIds;
   private Long spuId;

   @JsonProperty("wareId")
   public void setWareId(Long wareId) {
      this.wareId = wareId;
   }

   @JsonProperty("wareId")
   public Long getWareId() {
      return this.wareId;
   }

   @JsonProperty("title")
   public void setTitle(String title) {
      this.title = title;
   }

   @JsonProperty("title")
   public String getTitle() {
      return this.title;
   }

   @JsonProperty("categoryId")
   public void setCategoryId(Long categoryId) {
      this.categoryId = categoryId;
   }

   @JsonProperty("categoryId")
   public Long getCategoryId() {
      return this.categoryId;
   }

   @JsonProperty("brandId")
   public void setBrandId(Long brandId) {
      this.brandId = brandId;
   }

   @JsonProperty("brandId")
   public Long getBrandId() {
      return this.brandId;
   }

   @JsonProperty("templateId")
   public void setTemplateId(Long templateId) {
      this.templateId = templateId;
   }

   @JsonProperty("templateId")
   public Long getTemplateId() {
      return this.templateId;
   }

   @JsonProperty("transportId")
   public void setTransportId(Long transportId) {
      this.transportId = transportId;
   }

   @JsonProperty("transportId")
   public Long getTransportId() {
      return this.transportId;
   }

   @JsonProperty("wareStatus")
   public void setWareStatus(Integer wareStatus) {
      this.wareStatus = wareStatus;
   }

   @JsonProperty("wareStatus")
   public Integer getWareStatus() {
      return this.wareStatus;
   }

   @JsonProperty("outerId")
   public void setOuterId(String outerId) {
      this.outerId = outerId;
   }

   @JsonProperty("outerId")
   public String getOuterId() {
      return this.outerId;
   }

   @JsonProperty("itemNum")
   public void setItemNum(String itemNum) {
      this.itemNum = itemNum;
   }

   @JsonProperty("itemNum")
   public String getItemNum() {
      return this.itemNum;
   }

   @JsonProperty("barCode")
   public void setBarCode(String barCode) {
      this.barCode = barCode;
   }

   @JsonProperty("barCode")
   public String getBarCode() {
      return this.barCode;
   }

   @JsonProperty("wareLocation")
   public void setWareLocation(Integer wareLocation) {
      this.wareLocation = wareLocation;
   }

   @JsonProperty("wareLocation")
   public Integer getWareLocation() {
      return this.wareLocation;
   }

   @JsonProperty("modified")
   public void setModified(Date modified) {
      this.modified = modified;
   }

   @JsonProperty("modified")
   public Date getModified() {
      return this.modified;
   }

   @JsonProperty("created")
   public void setCreated(Date created) {
      this.created = created;
   }

   @JsonProperty("created")
   public Date getCreated() {
      return this.created;
   }

   @JsonProperty("offlineTime")
   public void setOfflineTime(Date offlineTime) {
      this.offlineTime = offlineTime;
   }

   @JsonProperty("offlineTime")
   public Date getOfflineTime() {
      return this.offlineTime;
   }

   @JsonProperty("onlineTime")
   public void setOnlineTime(Date onlineTime) {
      this.onlineTime = onlineTime;
   }

   @JsonProperty("onlineTime")
   public Date getOnlineTime() {
      return this.onlineTime;
   }

   @JsonProperty("colType")
   public void setColType(Integer colType) {
      this.colType = colType;
   }

   @JsonProperty("colType")
   public Integer getColType() {
      return this.colType;
   }

   @JsonProperty("delivery")
   public void setDelivery(String delivery) {
      this.delivery = delivery;
   }

   @JsonProperty("delivery")
   public String getDelivery() {
      return this.delivery;
   }

   @JsonProperty("adWords")
   public void setAdWords(AdWords adWords) {
      this.adWords = adWords;
   }

   @JsonProperty("adWords")
   public AdWords getAdWords() {
      return this.adWords;
   }

   @JsonProperty("wrap")
   public void setWrap(String wrap) {
      this.wrap = wrap;
   }

   @JsonProperty("wrap")
   public String getWrap() {
      return this.wrap;
   }

   @JsonProperty("packListing")
   public void setPackListing(String packListing) {
      this.packListing = packListing;
   }

   @JsonProperty("packListing")
   public String getPackListing() {
      return this.packListing;
   }

   @JsonProperty("weight")
   public void setWeight(Float weight) {
      this.weight = weight;
   }

   @JsonProperty("weight")
   public Float getWeight() {
      return this.weight;
   }

   @JsonProperty("width")
   public void setWidth(Integer width) {
      this.width = width;
   }

   @JsonProperty("width")
   public Integer getWidth() {
      return this.width;
   }

   @JsonProperty("height")
   public void setHeight(Integer height) {
      this.height = height;
   }

   @JsonProperty("height")
   public Integer getHeight() {
      return this.height;
   }

   @JsonProperty("length")
   public void setLength(Integer length) {
      this.length = length;
   }

   @JsonProperty("length")
   public Integer getLength() {
      return this.length;
   }

   @JsonProperty("props")
   public void setProps(Set<Prop> props) {
      this.props = props;
   }

   @JsonProperty("props")
   public Set<Prop> getProps() {
      return this.props;
   }

   @JsonProperty("features")
   public void setFeatures(Set<Feature> features) {
      this.features = features;
   }

   @JsonProperty("features")
   public Set<Feature> getFeatures() {
      return this.features;
   }

   @JsonProperty("images")
   public void setImages(List<Image> images) {
      this.images = images;
   }

   @JsonProperty("images")
   public List<Image> getImages() {
      return this.images;
   }

   @JsonProperty("shopCategorys")
   public void setShopCategorys(Set<Long> shopCategorys) {
      this.shopCategorys = shopCategorys;
   }

   @JsonProperty("shopCategorys")
   public Set<Long> getShopCategorys() {
      return this.shopCategorys;
   }

   @JsonProperty("mobileDesc")
   public void setMobileDesc(String mobileDesc) {
      this.mobileDesc = mobileDesc;
   }

   @JsonProperty("mobileDesc")
   public String getMobileDesc() {
      return this.mobileDesc;
   }

   @JsonProperty("introduction")
   public void setIntroduction(String introduction) {
      this.introduction = introduction;
   }

   @JsonProperty("introduction")
   public String getIntroduction() {
      return this.introduction;
   }

   @JsonProperty("zhuangBaIntroduction")
   public void setZhuangBaIntroduction(String zhuangBaIntroduction) {
      this.zhuangBaIntroduction = zhuangBaIntroduction;
   }

   @JsonProperty("zhuangBaIntroduction")
   public String getZhuangBaIntroduction() {
      return this.zhuangBaIntroduction;
   }

   @JsonProperty("zhuangBaId")
   public void setZhuangBaId(String zhuangBaId) {
      this.zhuangBaId = zhuangBaId;
   }

   @JsonProperty("zhuangBaId")
   public String getZhuangBaId() {
      return this.zhuangBaId;
   }

   @JsonProperty("introductionUseFlag")
   public void setIntroductionUseFlag(String introductionUseFlag) {
      this.introductionUseFlag = introductionUseFlag;
   }

   @JsonProperty("introductionUseFlag")
   public String getIntroductionUseFlag() {
      return this.introductionUseFlag;
   }

   @JsonProperty("afterSales")
   public void setAfterSales(String afterSales) {
      this.afterSales = afterSales;
   }

   @JsonProperty("afterSales")
   public String getAfterSales() {
      return this.afterSales;
   }

   @JsonProperty("logo")
   public void setLogo(String logo) {
      this.logo = logo;
   }

   @JsonProperty("logo")
   public String getLogo() {
      return this.logo;
   }

   @JsonProperty("marketPrice")
   public void setMarketPrice(BigDecimal marketPrice) {
      this.marketPrice = marketPrice;
   }

   @JsonProperty("marketPrice")
   public BigDecimal getMarketPrice() {
      return this.marketPrice;
   }

   @JsonProperty("costPrice")
   public void setCostPrice(BigDecimal costPrice) {
      this.costPrice = costPrice;
   }

   @JsonProperty("costPrice")
   public BigDecimal getCostPrice() {
      return this.costPrice;
   }

   @JsonProperty("jdPrice")
   public void setJdPrice(BigDecimal jdPrice) {
      this.jdPrice = jdPrice;
   }

   @JsonProperty("jdPrice")
   public BigDecimal getJdPrice() {
      return this.jdPrice;
   }

   @JsonProperty("brandName")
   public void setBrandName(String brandName) {
      this.brandName = brandName;
   }

   @JsonProperty("brandName")
   public String getBrandName() {
      return this.brandName;
   }

   @JsonProperty("stockNum")
   public void setStockNum(Long stockNum) {
      this.stockNum = stockNum;
   }

   @JsonProperty("stockNum")
   public Long getStockNum() {
      return this.stockNum;
   }

   @JsonProperty("categorySecId")
   public void setCategorySecId(Long categorySecId) {
      this.categorySecId = categorySecId;
   }

   @JsonProperty("categorySecId")
   public Long getCategorySecId() {
      return this.categorySecId;
   }

   @JsonProperty("shopId")
   public void setShopId(Long shopId) {
      this.shopId = shopId;
   }

   @JsonProperty("shopId")
   public Long getShopId() {
      return this.shopId;
   }

   @JsonProperty("promiseId")
   public void setPromiseId(Long promiseId) {
      this.promiseId = promiseId;
   }

   @JsonProperty("promiseId")
   public Long getPromiseId() {
      return this.promiseId;
   }

   @JsonProperty("multiCategoryId")
   public void setMultiCategoryId(Long multiCategoryId) {
      this.multiCategoryId = multiCategoryId;
   }

   @JsonProperty("multiCategoryId")
   public Long getMultiCategoryId() {
      return this.multiCategoryId;
   }

   @JsonProperty("multiCateProps")
   public void setMultiCateProps(Set<Prop> multiCateProps) {
      this.multiCateProps = multiCateProps;
   }

   @JsonProperty("multiCateProps")
   public Set<Prop> getMultiCateProps() {
      return this.multiCateProps;
   }

   @JsonProperty("sellPoint")
   public void setSellPoint(String sellPoint) {
      this.sellPoint = sellPoint;
   }

   @JsonProperty("sellPoint")
   public String getSellPoint() {
      return this.sellPoint;
   }

   @JsonProperty("wareTax")
   public void setWareTax(WareTax wareTax) {
      this.wareTax = wareTax;
   }

   @JsonProperty("wareTax")
   public WareTax getWareTax() {
      return this.wareTax;
   }

   @JsonProperty("afterSaleDesc")
   public void setAfterSaleDesc(String afterSaleDesc) {
      this.afterSaleDesc = afterSaleDesc;
   }

   @JsonProperty("afterSaleDesc")
   public String getAfterSaleDesc() {
      return this.afterSaleDesc;
   }

   @JsonProperty("zhuangBaMobileDesc")
   public void setZhuangBaMobileDesc(String zhuangBaMobileDesc) {
      this.zhuangBaMobileDesc = zhuangBaMobileDesc;
   }

   @JsonProperty("zhuangBaMobileDesc")
   public String getZhuangBaMobileDesc() {
      return this.zhuangBaMobileDesc;
   }

   @JsonProperty("mobileZhuangBaId")
   public void setMobileZhuangBaId(String mobileZhuangBaId) {
      this.mobileZhuangBaId = mobileZhuangBaId;
   }

   @JsonProperty("mobileZhuangBaId")
   public String getMobileZhuangBaId() {
      return this.mobileZhuangBaId;
   }

   @JsonProperty("mobileDescUseFlag")
   public void setMobileDescUseFlag(String mobileDescUseFlag) {
      this.mobileDescUseFlag = mobileDescUseFlag;
   }

   @JsonProperty("mobileDescUseFlag")
   public String getMobileDescUseFlag() {
      return this.mobileDescUseFlag;
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

   @JsonProperty("parentId")
   public void setParentId(Long parentId) {
      this.parentId = parentId;
   }

   @JsonProperty("parentId")
   public Long getParentId() {
      return this.parentId;
   }

   @JsonProperty("wareGroupId")
   public void setWareGroupId(Long wareGroupId) {
      this.wareGroupId = wareGroupId;
   }

   @JsonProperty("wareGroupId")
   public Long getWareGroupId() {
      return this.wareGroupId;
   }

   @JsonProperty("businessType")
   public void setBusinessType(String businessType) {
      this.businessType = businessType;
   }

   @JsonProperty("businessType")
   public String getBusinessType() {
      return this.businessType;
   }

   @JsonProperty("designConcept")
   public void setDesignConcept(String designConcept) {
      this.designConcept = designConcept;
   }

   @JsonProperty("designConcept")
   public String getDesignConcept() {
      return this.designConcept;
   }

   @JsonProperty("isArchival")
   public void setIsArchival(Boolean isArchival) {
      this.isArchival = isArchival;
   }

   @JsonProperty("isArchival")
   public Boolean getIsArchival() {
      return this.isArchival;
   }

   @JsonProperty("templateIds")
   public void setTemplateIds(String templateIds) {
      this.templateIds = templateIds;
   }

   @JsonProperty("templateIds")
   public String getTemplateIds() {
      return this.templateIds;
   }

   @JsonProperty("spuId")
   public void setSpuId(Long spuId) {
      this.spuId = spuId;
   }

   @JsonProperty("spuId")
   public Long getSpuId() {
      return this.spuId;
   }
}
