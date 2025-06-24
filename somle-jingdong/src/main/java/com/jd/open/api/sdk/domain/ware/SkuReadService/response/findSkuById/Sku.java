package com.jd.open.api.sdk.domain.ware.SkuReadService.response.findSkuById;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

public class Sku implements Serializable {
   private Long wareId;
   private Long skuId;
   private Integer status;
   private Set<Prop> saleAttrs;
   private Set<Feature> features;
   private BigDecimal jdPrice;
   private String outerId;
   private String barCode;
   private Long categoryId;
   private Integer imgTag;
   private String logo;
   private String skuName;
   private Long stockNum;
   private String wareTitle;
   private String fixedDeliveryTime;
   private String relativeDeliveryTime;
   private Long parentId;
   private Date modified;
   private Date created;
   private Set<Prop> multiCateProps;
   private Set<Prop> props;
   private String capacity;
   private Long promiseId;
   private String saleAttrTemplateId;
   private Integer enable;
   private Long currencySpuId;
   private String weight;

   @JsonProperty("wareId")
   public void setWareId(Long wareId) {
      this.wareId = wareId;
   }

   @JsonProperty("wareId")
   public Long getWareId() {
      return this.wareId;
   }

   @JsonProperty("skuId")
   public void setSkuId(Long skuId) {
      this.skuId = skuId;
   }

   @JsonProperty("skuId")
   public Long getSkuId() {
      return this.skuId;
   }

   @JsonProperty("status")
   public void setStatus(Integer status) {
      this.status = status;
   }

   @JsonProperty("status")
   public Integer getStatus() {
      return this.status;
   }

   @JsonProperty("saleAttrs")
   public void setSaleAttrs(Set<Prop> saleAttrs) {
      this.saleAttrs = saleAttrs;
   }

   @JsonProperty("saleAttrs")
   public Set<Prop> getSaleAttrs() {
      return this.saleAttrs;
   }

   @JsonProperty("features")
   public void setFeatures(Set<Feature> features) {
      this.features = features;
   }

   @JsonProperty("features")
   public Set<Feature> getFeatures() {
      return this.features;
   }

   @JsonProperty("jdPrice")
   public void setJdPrice(BigDecimal jdPrice) {
      this.jdPrice = jdPrice;
   }

   @JsonProperty("jdPrice")
   public BigDecimal getJdPrice() {
      return this.jdPrice;
   }

   @JsonProperty("outerId")
   public void setOuterId(String outerId) {
      this.outerId = outerId;
   }

   @JsonProperty("outerId")
   public String getOuterId() {
      return this.outerId;
   }

   @JsonProperty("barCode")
   public void setBarCode(String barCode) {
      this.barCode = barCode;
   }

   @JsonProperty("barCode")
   public String getBarCode() {
      return this.barCode;
   }

   @JsonProperty("categoryId")
   public void setCategoryId(Long categoryId) {
      this.categoryId = categoryId;
   }

   @JsonProperty("categoryId")
   public Long getCategoryId() {
      return this.categoryId;
   }

   @JsonProperty("imgTag")
   public void setImgTag(Integer imgTag) {
      this.imgTag = imgTag;
   }

   @JsonProperty("imgTag")
   public Integer getImgTag() {
      return this.imgTag;
   }

   @JsonProperty("logo")
   public void setLogo(String logo) {
      this.logo = logo;
   }

   @JsonProperty("logo")
   public String getLogo() {
      return this.logo;
   }

   @JsonProperty("skuName")
   public void setSkuName(String skuName) {
      this.skuName = skuName;
   }

   @JsonProperty("skuName")
   public String getSkuName() {
      return this.skuName;
   }

   @JsonProperty("stockNum")
   public void setStockNum(Long stockNum) {
      this.stockNum = stockNum;
   }

   @JsonProperty("stockNum")
   public Long getStockNum() {
      return this.stockNum;
   }

   @JsonProperty("wareTitle")
   public void setWareTitle(String wareTitle) {
      this.wareTitle = wareTitle;
   }

   @JsonProperty("wareTitle")
   public String getWareTitle() {
      return this.wareTitle;
   }

   @JsonProperty("fixedDeliveryTime")
   public void setFixedDeliveryTime(String fixedDeliveryTime) {
      this.fixedDeliveryTime = fixedDeliveryTime;
   }

   @JsonProperty("fixedDeliveryTime")
   public String getFixedDeliveryTime() {
      return this.fixedDeliveryTime;
   }

   @JsonProperty("relativeDeliveryTime")
   public void setRelativeDeliveryTime(String relativeDeliveryTime) {
      this.relativeDeliveryTime = relativeDeliveryTime;
   }

   @JsonProperty("relativeDeliveryTime")
   public String getRelativeDeliveryTime() {
      return this.relativeDeliveryTime;
   }

   @JsonProperty("parentId")
   public void setParentId(Long parentId) {
      this.parentId = parentId;
   }

   @JsonProperty("parentId")
   public Long getParentId() {
      return this.parentId;
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

   @JsonProperty("multiCateProps")
   public void setMultiCateProps(Set<Prop> multiCateProps) {
      this.multiCateProps = multiCateProps;
   }

   @JsonProperty("multiCateProps")
   public Set<Prop> getMultiCateProps() {
      return this.multiCateProps;
   }

   @JsonProperty("props")
   public void setProps(Set<Prop> props) {
      this.props = props;
   }

   @JsonProperty("props")
   public Set<Prop> getProps() {
      return this.props;
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

   @JsonProperty("saleAttrTemplateId")
   public void setSaleAttrTemplateId(String saleAttrTemplateId) {
      this.saleAttrTemplateId = saleAttrTemplateId;
   }

   @JsonProperty("saleAttrTemplateId")
   public String getSaleAttrTemplateId() {
      return this.saleAttrTemplateId;
   }

   @JsonProperty("enable")
   public void setEnable(Integer enable) {
      this.enable = enable;
   }

   @JsonProperty("enable")
   public Integer getEnable() {
      return this.enable;
   }

   @JsonProperty("currencySpuId")
   public void setCurrencySpuId(Long currencySpuId) {
      this.currencySpuId = currencySpuId;
   }

   @JsonProperty("currencySpuId")
   public Long getCurrencySpuId() {
      return this.currencySpuId;
   }

   @JsonProperty("weight")
   public void setWeight(String weight) {
      this.weight = weight;
   }

   @JsonProperty("weight")
   public String getWeight() {
      return this.weight;
   }
}
