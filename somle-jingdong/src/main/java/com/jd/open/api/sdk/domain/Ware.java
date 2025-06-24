package com.jd.open.api.sdk.domain;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Set;

public class Ware {
   private Long wareId;
   private String title;
   private Long venderId;
   private Long categoryId;
   private Long categorySecId;
   private Long brandId;
   private Long templateId;
   private Long transportId;
   private Integer wareStatus;
   private String outerId;
   private String itemNum;
   private String barCode;
   private Integer wareLocation;
   private Date onlineTime;
   private Date offlineTime;
   private Integer colType;
   private Long delivery;
   private AdWords adWords;
   /** @deprecated */
   @Deprecated
   private String wrap;
   private String packListing;
   private Integer length;
   private Integer width;
   private Integer height;
   private Float weight;
   private Set<Prop> props;
   private Set<Prop> multiCateProps;
   private Set<Feature> features;
   private List<Image> images;
   private Set<Long> shopCategorys;
   private String mobileDesc;
   private String introduction;
   private String afterSales;
   private String logo;
   private BigDecimal marketPrice;
   private BigDecimal costPrice;
   private Long stockNum;
   private Date created;
   private Date modified;
   private List<Sku> skus;
   private String brandName;
   private Long shopId;
   private BigDecimal jdPrice;
   private Long promiseId;
   private Long multiCategoryId;
   private Long spuId;

   public BigDecimal getMarketPrice() {
      return this.marketPrice;
   }

   public void setMarketPrice(BigDecimal marketPrice) {
      this.marketPrice = marketPrice;
   }

   public BigDecimal getCostPrice() {
      return this.costPrice;
   }

   public void setCostPrice(BigDecimal costPrice) {
      this.costPrice = costPrice;
   }

   public Long getStockNum() {
      return this.stockNum;
   }

   public void setStockNum(Long stockNum) {
      this.stockNum = stockNum;
   }

   public void setCategorySecId(Long categorySecId) {
      this.categorySecId = categorySecId;
   }

   public void setTemplateId(Long templateId) {
      this.templateId = templateId;
   }

   public void setOnlineTime(Date onlineTime) {
      this.onlineTime = onlineTime;
   }

   public void setOfflineTime(Date offlineTime) {
      this.offlineTime = offlineTime;
   }

   public void setLogo(String logo) {
      this.logo = logo;
   }

   public Long getWareId() {
      return this.wareId;
   }

   public void setWareId(Long wareId) {
      this.wareId = wareId;
   }

   public String getTitle() {
      return this.title;
   }

   public void setTitle(String title) {
      this.title = title;
   }

   public Long getVenderId() {
      return 0L;
   }

   public Long getCategoryId() {
      return this.categoryId;
   }

   public void setCategoryId(Long categoryId) {
      this.categoryId = categoryId;
   }

   public Long getBrandId() {
      return this.brandId;
   }

   public void setBrandId(Long brandId) {
      this.brandId = brandId;
   }

   public Long getTransportId() {
      return this.transportId;
   }

   public void setTransportId(Long transportId) {
      this.transportId = transportId;
   }

   public Integer getWareStatus() {
      return this.wareStatus;
   }

   public void setWareStatus(Integer wareStatus) {
      this.wareStatus = wareStatus;
   }

   public String getOuterId() {
      return this.outerId;
   }

   public void setOuterId(String outerId) {
      this.outerId = outerId;
   }

   public String getItemNum() {
      return this.itemNum;
   }

   public void setItemNum(String itemNum) {
      this.itemNum = itemNum;
   }

   public String getBarCode() {
      return this.barCode;
   }

   public void setBarCode(String barCode) {
      this.barCode = barCode;
   }

   public Integer getWareLocation() {
      return this.wareLocation;
   }

   public void setWareLocation(Integer wareLocation) {
      this.wareLocation = wareLocation;
   }

   public Integer getColType() {
      return this.colType;
   }

   public void setColType(Integer colType) {
      this.colType = colType;
   }

   public Long getDelivery() {
      return this.delivery;
   }

   public void setDelivery(Long delivery) {
      this.delivery = delivery;
   }

   public AdWords getAdWords() {
      return this.adWords;
   }

   public void setAdWords(AdWords adWords) {
      this.adWords = adWords;
   }

   public String getLogo() {
      return this.logo;
   }

   public String getWrap() {
      return this.wrap;
   }

   public void setWrap(String wrap) {
      this.wrap = wrap;
   }

   public String getPackListing() {
      return this.packListing;
   }

   public void setPackListing(String packListing) {
      this.packListing = packListing;
   }

   public Integer getLength() {
      return this.length;
   }

   public void setLength(Integer length) {
      this.length = length;
   }

   public Integer getWidth() {
      return this.width;
   }

   public void setWidth(Integer width) {
      this.width = width;
   }

   public Integer getHeight() {
      return this.height;
   }

   public void setHeight(Integer height) {
      this.height = height;
   }

   public Float getWeight() {
      return this.weight;
   }

   public void setWeight(Float weight) {
      this.weight = weight;
   }

   public Set<Prop> getProps() {
      return this.props;
   }

   public void setProps(Set<Prop> props) {
      this.props = props;
   }

   public Set<Prop> getMultiCateProps() {
      return this.multiCateProps;
   }

   public void setMultiCateProps(Set<Prop> multiCateProps) {
      this.multiCateProps = multiCateProps;
   }

   public List<Image> getImages() {
      return this.images;
   }

   public void setImages(List<Image> images) {
      this.images = images;
   }

   public Set<Long> getShopCategorys() {
      return this.shopCategorys;
   }

   public void setShopCategorys(Set<Long> shopCategorys) {
      this.shopCategorys = shopCategorys;
   }

   public String getMobileDesc() {
      return this.mobileDesc;
   }

   public void setMobileDesc(String phoneDetail) {
      this.mobileDesc = phoneDetail;
   }

   public String getIntroduction() {
      return this.introduction;
   }

   public void setIntroduction(String introduction) {
      this.introduction = introduction;
   }

   public String getAfterSales() {
      return this.afterSales;
   }

   public void setAfterSales(String afterSales) {
      this.afterSales = afterSales;
   }

   public Long getCategorySecId() {
      return this.categorySecId;
   }

   public Long getTemplateId() {
      return this.templateId;
   }

   public Date getOnlineTime() {
      return this.onlineTime;
   }

   public Date getOfflineTime() {
      return this.offlineTime;
   }

   public Date getCreated() {
      return this.created;
   }

   public void setCreated(Date created) {
      this.created = created;
   }

   public Date getModified() {
      return this.modified;
   }

   public void setModified(Date modified) {
      this.modified = modified;
   }

   public Set<Feature> getFeatures() {
      return this.features;
   }

   public void setFeatures(Set<Feature> features) {
      this.features = features;
   }

   public List<Sku> getSkus() {
      return this.skus;
   }

   public void setSkus(List<Sku> skus) {
      this.skus = skus;
   }

   public String getBrandName() {
      return this.brandName;
   }

   public void setBrandName(String brandName) {
      this.brandName = brandName;
   }

   public Long getShopId() {
      return this.shopId;
   }

   public void setShopId(Long shopId) {
      this.shopId = shopId;
   }

   public BigDecimal getJdPrice() {
      return this.jdPrice;
   }

   public void setJdPrice(BigDecimal jdPrice) {
      this.jdPrice = jdPrice;
   }

   public Long getPromiseId() {
      return this.promiseId;
   }

   public void setPromiseId(Long promiseId) {
      this.promiseId = promiseId;
   }

   public Long getMultiCategoryId() {
      return this.multiCategoryId;
   }

   public void setMultiCategoryId(Long multiCategoryId) {
      this.multiCategoryId = multiCategoryId;
   }

   public Long getSpuId() {
      return this.spuId;
   }

   public void setSpuId(Long spuId) {
      this.spuId = spuId;
   }
}
