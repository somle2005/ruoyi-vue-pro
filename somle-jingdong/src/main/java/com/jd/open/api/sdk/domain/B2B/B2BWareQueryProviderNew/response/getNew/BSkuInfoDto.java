package com.jd.open.api.sdk.domain.B2B.B2BWareQueryProviderNew.response.getNew;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public class BSkuInfoDto implements Serializable {
   private Long jdSkuId;
   private String color;
   private String bizCode;
   private String sizeSequence;
   private Long venderId;
   private String specSequence;
   private Map<String, String> channelFields;
   private String saleDate;
   private String saleAttributes;
   private String colorSequence;
   private String spec;
   private Long b2bSkuId;
   private String skuOffShelfTime;
   private String skuName;
   private Long skuMark;
   private String modified;
   private String skuOnShelfTime;
   private BigDecimal wholesalePrice;
   private Map<String, String> skuB2bSpecInfo;
   private List<BSkuChildsInfoDto> childSkus;
   private List<BImageDto> images;
   private Integer skuState;
   private Integer dataVersion;
   private Long jdSpuId;
   private String created;
   private Map<String, String> skuSpecInfo;
   private String upc;
   private Long b2bSpuId;
   private String sizeNote;
   private Map<String, String> skuBizArray;
   private String thirdSkuId;
   private Map<String, String> skuB2bBizInfo;
   private String productCode;
   private String size;
   private String specName;
   private Long mainJdSkuId;
   private String colorNote;
   private String outerId;
   private Integer status;

   @JsonProperty("jdSkuId")
   public void setJdSkuId(Long jdSkuId) {
      this.jdSkuId = jdSkuId;
   }

   @JsonProperty("jdSkuId")
   public Long getJdSkuId() {
      return this.jdSkuId;
   }

   @JsonProperty("color")
   public void setColor(String color) {
      this.color = color;
   }

   @JsonProperty("color")
   public String getColor() {
      return this.color;
   }

   @JsonProperty("bizCode")
   public void setBizCode(String bizCode) {
      this.bizCode = bizCode;
   }

   @JsonProperty("bizCode")
   public String getBizCode() {
      return this.bizCode;
   }

   @JsonProperty("sizeSequence")
   public void setSizeSequence(String sizeSequence) {
      this.sizeSequence = sizeSequence;
   }

   @JsonProperty("sizeSequence")
   public String getSizeSequence() {
      return this.sizeSequence;
   }

   @JsonProperty("venderId")
   public void setVenderId(Long venderId) {
      this.venderId = venderId;
   }

   @JsonProperty("venderId")
   public Long getVenderId() {
      return this.venderId;
   }

   @JsonProperty("specSequence")
   public void setSpecSequence(String specSequence) {
      this.specSequence = specSequence;
   }

   @JsonProperty("specSequence")
   public String getSpecSequence() {
      return this.specSequence;
   }

   @JsonProperty("channelFields")
   public void setChannelFields(Map<String, String> channelFields) {
      this.channelFields = channelFields;
   }

   @JsonProperty("channelFields")
   public Map<String, String> getChannelFields() {
      return this.channelFields;
   }

   @JsonProperty("saleDate")
   public void setSaleDate(String saleDate) {
      this.saleDate = saleDate;
   }

   @JsonProperty("saleDate")
   public String getSaleDate() {
      return this.saleDate;
   }

   @JsonProperty("saleAttributes")
   public void setSaleAttributes(String saleAttributes) {
      this.saleAttributes = saleAttributes;
   }

   @JsonProperty("saleAttributes")
   public String getSaleAttributes() {
      return this.saleAttributes;
   }

   @JsonProperty("colorSequence")
   public void setColorSequence(String colorSequence) {
      this.colorSequence = colorSequence;
   }

   @JsonProperty("colorSequence")
   public String getColorSequence() {
      return this.colorSequence;
   }

   @JsonProperty("spec")
   public void setSpec(String spec) {
      this.spec = spec;
   }

   @JsonProperty("spec")
   public String getSpec() {
      return this.spec;
   }

   @JsonProperty("b2bSkuId")
   public void setB2bSkuId(Long b2bSkuId) {
      this.b2bSkuId = b2bSkuId;
   }

   @JsonProperty("b2bSkuId")
   public Long getB2bSkuId() {
      return this.b2bSkuId;
   }

   @JsonProperty("skuOffShelfTime")
   public void setSkuOffShelfTime(String skuOffShelfTime) {
      this.skuOffShelfTime = skuOffShelfTime;
   }

   @JsonProperty("skuOffShelfTime")
   public String getSkuOffShelfTime() {
      return this.skuOffShelfTime;
   }

   @JsonProperty("skuName")
   public void setSkuName(String skuName) {
      this.skuName = skuName;
   }

   @JsonProperty("skuName")
   public String getSkuName() {
      return this.skuName;
   }

   @JsonProperty("skuMark")
   public void setSkuMark(Long skuMark) {
      this.skuMark = skuMark;
   }

   @JsonProperty("skuMark")
   public Long getSkuMark() {
      return this.skuMark;
   }

   @JsonProperty("modified")
   public void setModified(String modified) {
      this.modified = modified;
   }

   @JsonProperty("modified")
   public String getModified() {
      return this.modified;
   }

   @JsonProperty("skuOnShelfTime")
   public void setSkuOnShelfTime(String skuOnShelfTime) {
      this.skuOnShelfTime = skuOnShelfTime;
   }

   @JsonProperty("skuOnShelfTime")
   public String getSkuOnShelfTime() {
      return this.skuOnShelfTime;
   }

   @JsonProperty("wholesalePrice")
   public void setWholesalePrice(BigDecimal wholesalePrice) {
      this.wholesalePrice = wholesalePrice;
   }

   @JsonProperty("wholesalePrice")
   public BigDecimal getWholesalePrice() {
      return this.wholesalePrice;
   }

   @JsonProperty("skuB2bSpecInfo")
   public void setSkuB2bSpecInfo(Map<String, String> skuB2bSpecInfo) {
      this.skuB2bSpecInfo = skuB2bSpecInfo;
   }

   @JsonProperty("skuB2bSpecInfo")
   public Map<String, String> getSkuB2bSpecInfo() {
      return this.skuB2bSpecInfo;
   }

   @JsonProperty("childSkus")
   public void setChildSkus(List<BSkuChildsInfoDto> childSkus) {
      this.childSkus = childSkus;
   }

   @JsonProperty("childSkus")
   public List<BSkuChildsInfoDto> getChildSkus() {
      return this.childSkus;
   }

   @JsonProperty("images")
   public void setImages(List<BImageDto> images) {
      this.images = images;
   }

   @JsonProperty("images")
   public List<BImageDto> getImages() {
      return this.images;
   }

   @JsonProperty("skuState")
   public void setSkuState(Integer skuState) {
      this.skuState = skuState;
   }

   @JsonProperty("skuState")
   public Integer getSkuState() {
      return this.skuState;
   }

   @JsonProperty("dataVersion")
   public void setDataVersion(Integer dataVersion) {
      this.dataVersion = dataVersion;
   }

   @JsonProperty("dataVersion")
   public Integer getDataVersion() {
      return this.dataVersion;
   }

   @JsonProperty("jdSpuId")
   public void setJdSpuId(Long jdSpuId) {
      this.jdSpuId = jdSpuId;
   }

   @JsonProperty("jdSpuId")
   public Long getJdSpuId() {
      return this.jdSpuId;
   }

   @JsonProperty("created")
   public void setCreated(String created) {
      this.created = created;
   }

   @JsonProperty("created")
   public String getCreated() {
      return this.created;
   }

   @JsonProperty("skuSpecInfo")
   public void setSkuSpecInfo(Map<String, String> skuSpecInfo) {
      this.skuSpecInfo = skuSpecInfo;
   }

   @JsonProperty("skuSpecInfo")
   public Map<String, String> getSkuSpecInfo() {
      return this.skuSpecInfo;
   }

   @JsonProperty("upc")
   public void setUpc(String upc) {
      this.upc = upc;
   }

   @JsonProperty("upc")
   public String getUpc() {
      return this.upc;
   }

   @JsonProperty("b2bSpuId")
   public void setB2bSpuId(Long b2bSpuId) {
      this.b2bSpuId = b2bSpuId;
   }

   @JsonProperty("b2bSpuId")
   public Long getB2bSpuId() {
      return this.b2bSpuId;
   }

   @JsonProperty("sizeNote")
   public void setSizeNote(String sizeNote) {
      this.sizeNote = sizeNote;
   }

   @JsonProperty("sizeNote")
   public String getSizeNote() {
      return this.sizeNote;
   }

   @JsonProperty("skuBizArray")
   public void setSkuBizArray(Map<String, String> skuBizArray) {
      this.skuBizArray = skuBizArray;
   }

   @JsonProperty("skuBizArray")
   public Map<String, String> getSkuBizArray() {
      return this.skuBizArray;
   }

   @JsonProperty("thirdSkuId")
   public void setThirdSkuId(String thirdSkuId) {
      this.thirdSkuId = thirdSkuId;
   }

   @JsonProperty("thirdSkuId")
   public String getThirdSkuId() {
      return this.thirdSkuId;
   }

   @JsonProperty("skuB2bBizInfo")
   public void setSkuB2bBizInfo(Map<String, String> skuB2bBizInfo) {
      this.skuB2bBizInfo = skuB2bBizInfo;
   }

   @JsonProperty("skuB2bBizInfo")
   public Map<String, String> getSkuB2bBizInfo() {
      return this.skuB2bBizInfo;
   }

   @JsonProperty("productCode")
   public void setProductCode(String productCode) {
      this.productCode = productCode;
   }

   @JsonProperty("productCode")
   public String getProductCode() {
      return this.productCode;
   }

   @JsonProperty("size")
   public void setSize(String size) {
      this.size = size;
   }

   @JsonProperty("size")
   public String getSize() {
      return this.size;
   }

   @JsonProperty("specName")
   public void setSpecName(String specName) {
      this.specName = specName;
   }

   @JsonProperty("specName")
   public String getSpecName() {
      return this.specName;
   }

   @JsonProperty("mainJdSkuId")
   public void setMainJdSkuId(Long mainJdSkuId) {
      this.mainJdSkuId = mainJdSkuId;
   }

   @JsonProperty("mainJdSkuId")
   public Long getMainJdSkuId() {
      return this.mainJdSkuId;
   }

   @JsonProperty("colorNote")
   public void setColorNote(String colorNote) {
      this.colorNote = colorNote;
   }

   @JsonProperty("colorNote")
   public String getColorNote() {
      return this.colorNote;
   }

   @JsonProperty("outerId")
   public void setOuterId(String outerId) {
      this.outerId = outerId;
   }

   @JsonProperty("outerId")
   public String getOuterId() {
      return this.outerId;
   }

   @JsonProperty("status")
   public void setStatus(Integer status) {
      this.status = status;
   }

   @JsonProperty("status")
   public Integer getStatus() {
      return this.status;
   }
}
