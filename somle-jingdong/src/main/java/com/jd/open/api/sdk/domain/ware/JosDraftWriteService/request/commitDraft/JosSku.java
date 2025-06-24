package com.jd.open.api.sdk.domain.ware.JosDraftWriteService.request.commitDraft;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import java.util.Set;

public class JosSku implements Serializable {
   private Long currencySpuId;
   private Set<JosSaleAttr> saleAttrs;
   private List<JosFeature> features;
   private JosHouseSku josHouseSku;
   private BigDecimal jdPrice;
   private Long stockNum;
   private Long skuId;
   private String upcCode;
   private Set<JosProp> multiCateProps;
   private String outerId;
   private String saleAttrTemplateId;
   private JosLineationPrice lineationPrice;
   private String capacity;
   private Long promiseId;
   private Integer enable;
   private String weight;
   private Long incrStock;
   private Boolean incrType;
   private String stockRfId;
   private List<JosImage> guideImageList;

   @JsonProperty("currencySpuId")
   public void setCurrencySpuId(Long currencySpuId) {
      this.currencySpuId = currencySpuId;
   }

   @JsonProperty("currencySpuId")
   public Long getCurrencySpuId() {
      return this.currencySpuId;
   }

   @JsonProperty("saleAttrs")
   public void setSaleAttrs(Set<JosSaleAttr> saleAttrs) {
      this.saleAttrs = saleAttrs;
   }

   @JsonProperty("saleAttrs")
   public Set<JosSaleAttr> getSaleAttrs() {
      return this.saleAttrs;
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

   @JsonProperty("jdPrice")
   public void setJdPrice(BigDecimal jdPrice) {
      this.jdPrice = jdPrice;
   }

   @JsonProperty("jdPrice")
   public BigDecimal getJdPrice() {
      return this.jdPrice;
   }

   @JsonProperty("stockNum")
   public void setStockNum(Long stockNum) {
      this.stockNum = stockNum;
   }

   @JsonProperty("stockNum")
   public Long getStockNum() {
      return this.stockNum;
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

   @JsonProperty("enable")
   public void setEnable(Integer enable) {
      this.enable = enable;
   }

   @JsonProperty("enable")
   public Integer getEnable() {
      return this.enable;
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
