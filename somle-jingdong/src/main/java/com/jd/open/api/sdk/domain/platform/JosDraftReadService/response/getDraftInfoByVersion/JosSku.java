package com.jd.open.api.sdk.domain.platform.JosDraftReadService.response.getDraftInfoByVersion;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Set;

public class JosSku implements Serializable {
   private Set<JosSaleAttr> saleAttrs;
   private String skuName;
   private Long currencySpuId;
   private List<JosFeature> features;
   private JosHouseSku josHouseSku;
   private Integer enable;
   private Long stockNum;
   private String logo;
   private Date modified;
   private Long skuId;
   private String upcCode;
   private Long productId;
   private Date created;
   private Set<JosProp> multiCateProps;
   private String outerId;
   private BigDecimal jdPrice;
   private String saleAttrTemplateId;
   private JosLineationPrice lineationPrice;
   private String status;
   private String capacity;
   private Long promiseId;
   private String weight;
   private Long incrStock;
   private Boolean incrType;
   private String stockRfId;
   private List<JosImage> guideImageList;

   @JsonProperty("saleAttrs")
   public void setSaleAttrs(Set<JosSaleAttr> saleAttrs) {
      this.saleAttrs = saleAttrs;
   }

   @JsonProperty("saleAttrs")
   public Set<JosSaleAttr> getSaleAttrs() {
      return this.saleAttrs;
   }

   @JsonProperty("skuName")
   public void setSkuName(String skuName) {
      this.skuName = skuName;
   }

   @JsonProperty("skuName")
   public String getSkuName() {
      return this.skuName;
   }

   @JsonProperty("currencySpuId")
   public void setCurrencySpuId(Long currencySpuId) {
      this.currencySpuId = currencySpuId;
   }

   @JsonProperty("currencySpuId")
   public Long getCurrencySpuId() {
      return this.currencySpuId;
   }

   @JsonProperty("features")
   public void setFeatures(List<JosFeature> features) {
      this.features = features;
   }

   @JsonProperty("features")
   public List<JosFeature> getFeatures() {
      return this.features;
   }

   @JsonProperty("josHouseSku")
   public void setJosHouseSku(JosHouseSku josHouseSku) {
      this.josHouseSku = josHouseSku;
   }

   @JsonProperty("josHouseSku")
   public JosHouseSku getJosHouseSku() {
      return this.josHouseSku;
   }

   @JsonProperty("enable")
   public void setEnable(Integer enable) {
      this.enable = enable;
   }

   @JsonProperty("enable")
   public Integer getEnable() {
      return this.enable;
   }

   @JsonProperty("stockNum")
   public void setStockNum(Long stockNum) {
      this.stockNum = stockNum;
   }

   @JsonProperty("stockNum")
   public Long getStockNum() {
      return this.stockNum;
   }

   @JsonProperty("logo")
   public void setLogo(String logo) {
      this.logo = logo;
   }

   @JsonProperty("logo")
   public String getLogo() {
      return this.logo;
   }

   @JsonProperty("modified")
   public void setModified(Date modified) {
      this.modified = modified;
   }

   @JsonProperty("modified")
   public Date getModified() {
      return this.modified;
   }

   @JsonProperty("skuId")
   public void setSkuId(Long skuId) {
      this.skuId = skuId;
   }

   @JsonProperty("skuId")
   public Long getSkuId() {
      return this.skuId;
   }

   @JsonProperty("upcCode")
   public void setUpcCode(String upcCode) {
      this.upcCode = upcCode;
   }

   @JsonProperty("upcCode")
   public String getUpcCode() {
      return this.upcCode;
   }

   @JsonProperty("productId")
   public void setProductId(Long productId) {
      this.productId = productId;
   }

   @JsonProperty("productId")
   public Long getProductId() {
      return this.productId;
   }

   @JsonProperty("created")
   public void setCreated(Date created) {
      this.created = created;
   }

   @JsonProperty("created")
   public Date getCreated() {
      return this.created;
   }

   @JsonProperty("multiCateProps")
   public void setMultiCateProps(Set<JosProp> multiCateProps) {
      this.multiCateProps = multiCateProps;
   }

   @JsonProperty("multiCateProps")
   public Set<JosProp> getMultiCateProps() {
      return this.multiCateProps;
   }

   @JsonProperty("outerId")
   public void setOuterId(String outerId) {
      this.outerId = outerId;
   }

   @JsonProperty("outerId")
   public String getOuterId() {
      return this.outerId;
   }

   @JsonProperty("jdPrice")
   public void setJdPrice(BigDecimal jdPrice) {
      this.jdPrice = jdPrice;
   }

   @JsonProperty("jdPrice")
   public BigDecimal getJdPrice() {
      return this.jdPrice;
   }

   @JsonProperty("saleAttrTemplateId")
   public void setSaleAttrTemplateId(String saleAttrTemplateId) {
      this.saleAttrTemplateId = saleAttrTemplateId;
   }

   @JsonProperty("saleAttrTemplateId")
   public String getSaleAttrTemplateId() {
      return this.saleAttrTemplateId;
   }

   @JsonProperty("lineationPrice")
   public void setLineationPrice(JosLineationPrice lineationPrice) {
      this.lineationPrice = lineationPrice;
   }

   @JsonProperty("lineationPrice")
   public JosLineationPrice getLineationPrice() {
      return this.lineationPrice;
   }

   @JsonProperty("status")
   public void setStatus(String status) {
      this.status = status;
   }

   @JsonProperty("status")
   public String getStatus() {
      return this.status;
   }

   @JsonProperty("capacity")
   public void setCapacity(String capacity) {
      this.capacity = capacity;
   }

   @JsonProperty("capacity")
   public String getCapacity() {
      return this.capacity;
   }

   @JsonProperty("promiseId")
   public void setPromiseId(Long promiseId) {
      this.promiseId = promiseId;
   }

   @JsonProperty("promiseId")
   public Long getPromiseId() {
      return this.promiseId;
   }

   @JsonProperty("weight")
   public void setWeight(String weight) {
      this.weight = weight;
   }

   @JsonProperty("weight")
   public String getWeight() {
      return this.weight;
   }

   @JsonProperty("incrStock")
   public void setIncrStock(Long incrStock) {
      this.incrStock = incrStock;
   }

   @JsonProperty("incrStock")
   public Long getIncrStock() {
      return this.incrStock;
   }

   @JsonProperty("incrType")
   public void setIncrType(Boolean incrType) {
      this.incrType = incrType;
   }

   @JsonProperty("incrType")
   public Boolean getIncrType() {
      return this.incrType;
   }

   @JsonProperty("stockRfId")
   public void setStockRfId(String stockRfId) {
      this.stockRfId = stockRfId;
   }

   @JsonProperty("stockRfId")
   public String getStockRfId() {
      return this.stockRfId;
   }

   @JsonProperty("guideImageList")
   public void setGuideImageList(List<JosImage> guideImageList) {
      this.guideImageList = guideImageList;
   }

   @JsonProperty("guideImageList")
   public List<JosImage> getGuideImageList() {
      return this.guideImageList;
   }
}
