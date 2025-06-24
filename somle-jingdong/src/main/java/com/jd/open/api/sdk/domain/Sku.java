package com.jd.open.api.sdk.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Sku {
   private String type = "com.jd.pop.ware.ic.api.domain.Sku";
   private Long venderId;
   private Long wareId;
   private Long skuId;
   private Integer status;
   private Set<Prop> saleAttrs;
   private Set<Prop> multiCateProps;
   private Set<Prop> props;
   private Set<Feature> features;
   private BigDecimal jdPrice;
   private String outerId;
   private Long stockNum;
   private Integer imgTag;
   /** @deprecated */
   @Deprecated
   private String wareTitle;
   /** @deprecated */
   @Deprecated
   private Long categoryId;
   private String logo;
   private Date created;
   private Date modified;
   private String barCode;
   private String skuName;
   private String capacity;
   private Long promiseId;
   private String saleAttrTemplateId;
   private Integer enable;
   private Long currencySpuId;
   private String mappingId;
   private List<Image> guideImageList;

   @JsonProperty("@type")
   public String getType() {
      return this.type;
   }

   public String getBarCode() {
      return this.barCode;
   }

   public void setBarCode(String barCode) {
      this.barCode = barCode;
   }

   public Long getVenderId() {
      return 0L;
   }

   public Long getSkuId() {
      return this.skuId;
   }

   public void setSkuId(Long skuId) {
      this.skuId = skuId;
   }

   public Integer getStatus() {
      return this.status;
   }

   public void setStatus(Integer status) {
      this.status = status;
   }

   public Set<Prop> getSaleAttrs() {
      return this.saleAttrs;
   }

   public void setSaleAttrs(Set<Prop> saleAttrs) {
      this.saleAttrs = saleAttrs;
   }

   public Set<Feature> getFeatures() {
      return this.features;
   }

   public void setFeatures(Set<Feature> features) {
      this.features = features;
   }

   public BigDecimal getJdPrice() {
      return this.jdPrice;
   }

   public void setJdPrice(BigDecimal jdPrice) {
      this.jdPrice = jdPrice;
   }

   public String getOuterId() {
      return this.outerId;
   }

   public void setOuterId(String outerId) {
      this.outerId = outerId;
   }

   public Long getStockNum() {
      return this.stockNum;
   }

   public void setStockNum(Long stockNum) {
      this.stockNum = stockNum;
   }

   public Integer getImgTag() {
      return this.imgTag;
   }

   public void setImgTag(Integer imgTag) {
      this.imgTag = imgTag;
   }

   public String getWareTitle() {
      return this.wareTitle;
   }

   public void setWareTitle(String wareTitle) {
      this.wareTitle = wareTitle;
   }

   public Long getCategoryId() {
      return this.categoryId;
   }

   public void setCategoryId(Long categoryId) {
      this.categoryId = categoryId;
   }

   public String getLogo() {
      return this.logo;
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

   public String getSkuName() {
      return this.skuName;
   }

   public void setSkuName(String skuName) {
      this.skuName = skuName;
   }

   public Set<Prop> getMultiCateProps() {
      return this.multiCateProps;
   }

   public void setMultiCateProps(Set<Prop> multiCateProps) {
      this.multiCateProps = multiCateProps;
   }

   public Set<Prop> getProps() {
      return this.props;
   }

   public void setProps(Set<Prop> props) {
      this.props = props;
   }

   public String getSaleAttrTemplateId() {
      return this.saleAttrTemplateId;
   }

   public void setSaleAttrTemplateId(String saleAttrTemplateId) {
      this.saleAttrTemplateId = saleAttrTemplateId;
   }

   public Integer getEnable() {
      return this.enable;
   }

   public void setEnable(Integer enable) {
      this.enable = enable;
   }

   public Long getCurrencySpuId() {
      return this.currencySpuId;
   }

   public void setCurrencySpuId(Long currencySpuId) {
      this.currencySpuId = currencySpuId;
   }

   public String getMappingId() {
      return this.mappingId;
   }

   public String getCapacity() {
      return this.capacity;
   }

   public void setCapacity(String capacity) {
      this.capacity = capacity;
   }

   public Long getPromiseId() {
      return this.promiseId;
   }

   public void setPromiseId(Long promiseId) {
      this.promiseId = promiseId;
   }

   public void setMappingId(String mappingId) {
      this.mappingId = mappingId;
   }

   public List<Image> getGuideImageList() {
      return this.guideImageList;
   }

   public void setGuideImageList(List<Image> guideImageList) {
      this.guideImageList = guideImageList;
   }

   public String toString() {
      int maxLen = 100;
      StringBuilder builder = new StringBuilder();
      builder.append("Sku [");
      if (this.venderId != null) {
         builder.append("venderId=").append(this.venderId).append(", ");
      }

      if (this.wareId != null) {
         builder.append("wareId=").append(this.wareId).append(", ");
      }

      if (this.skuId != null) {
         builder.append("skuId=").append(this.skuId).append(", ");
      }

      if (this.status != null) {
         builder.append("status=").append(this.status).append(", ");
      }

      if (this.saleAttrs != null) {
         builder.append("saleAttrs=").append(this.toString(this.saleAttrs, 100)).append(", ");
      }

      if (this.multiCateProps != null) {
         builder.append("multiCateProps=").append(this.toString(this.multiCateProps, 100)).append(", ");
      }

      if (this.props != null) {
         builder.append("props=").append(this.toString(this.props, 100)).append(", ");
      }

      if (this.features != null) {
         builder.append("features=").append(this.toString(this.features, 100)).append(", ");
      }

      if (this.jdPrice != null) {
         builder.append("jdPrice=").append(this.jdPrice).append(", ");
      }

      if (this.outerId != null) {
         builder.append("outerId=").append(this.outerId).append(", ");
      }

      if (this.stockNum != null) {
         builder.append("stockNum=").append(this.stockNum).append(", ");
      }

      if (this.imgTag != null) {
         builder.append("imgTag=").append(this.imgTag).append(", ");
      }

      if (this.wareTitle != null) {
         builder.append("wareTitle=").append(this.wareTitle).append(", ");
      }

      if (this.categoryId != null) {
         builder.append("categoryId=").append(this.categoryId).append(", ");
      }

      if (this.logo != null) {
         builder.append("logo=").append(this.logo).append(", ");
      }

      if (this.created != null) {
         builder.append("created=").append(this.created).append(", ");
      }

      if (this.modified != null) {
         builder.append("modified=").append(this.modified).append(", ");
      }

      if (this.barCode != null) {
         builder.append("barCode=").append(this.barCode).append(", ");
      }

      if (this.skuName != null) {
         builder.append("skuName=").append(this.skuName);
      }

      if (this.guideImageList != null) {
         builder.append("guideImageList=").append(this.toString(this.guideImageList, 100));
      }

      builder.append("]");
      return builder.toString();
   }

   private String toString(Collection<?> collection, int maxLen) {
      StringBuilder builder = new StringBuilder();
      builder.append("[");
      int i = 0;

      for(Iterator<?> iterator = collection.iterator(); iterator.hasNext() && i < maxLen; ++i) {
         if (i > 0) {
            builder.append(", ");
         }

         builder.append(iterator.next());
      }

      builder.append("]");
      return builder.toString();
   }
}
