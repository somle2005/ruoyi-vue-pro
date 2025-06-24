package com.jd.open.api.sdk.domain.EPT.WareApiClient.response.get;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class WareApiVO implements Serializable {
   private Long wareId;
   private Integer categoryId;
   private Integer wareStatus;
   private String title;
   private String itemNum;
   private Long transportId;
   private Date onlineTime;
   private Date offlineTime;
   private String attributes;
   private BigDecimal minSupplyPrice;
   private BigDecimal maxSupplyPrice;
   private Integer stock;
   private String imgUri;
   private String hsCode;
   private Integer recommendTpid;
   private Integer customTpid;
   private Integer brandId;
   private Integer deliveryDays;
   private String keywords;
   private String description;
   private String cubage;
   private String packInfo;
   private Float netWeight;
   private Float weight;
   private Float packLong;
   private Float packWide;
   private Float packHeight;
   private WareSkuApiVO[] wareSkus;
   private String messegeCode;
   private String message;
   private boolean success;

   @JsonProperty("wareId")
   public void setWareId(Long wareId) {
      this.wareId = wareId;
   }

   @JsonProperty("wareId")
   public Long getWareId() {
      return this.wareId;
   }

   @JsonProperty("categoryId")
   public void setCategoryId(Integer categoryId) {
      this.categoryId = categoryId;
   }

   @JsonProperty("categoryId")
   public Integer getCategoryId() {
      return this.categoryId;
   }

   @JsonProperty("wareStatus")
   public void setWareStatus(Integer wareStatus) {
      this.wareStatus = wareStatus;
   }

   @JsonProperty("wareStatus")
   public Integer getWareStatus() {
      return this.wareStatus;
   }

   @JsonProperty("title")
   public void setTitle(String title) {
      this.title = title;
   }

   @JsonProperty("title")
   public String getTitle() {
      return this.title;
   }

   @JsonProperty("itemNum")
   public void setItemNum(String itemNum) {
      this.itemNum = itemNum;
   }

   @JsonProperty("itemNum")
   public String getItemNum() {
      return this.itemNum;
   }

   @JsonProperty("transportId")
   public void setTransportId(Long transportId) {
      this.transportId = transportId;
   }

   @JsonProperty("transportId")
   public Long getTransportId() {
      return this.transportId;
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

   @JsonProperty("attributes")
   public void setAttributes(String attributes) {
      this.attributes = attributes;
   }

   @JsonProperty("attributes")
   public String getAttributes() {
      return this.attributes;
   }

   @JsonProperty("minSupplyPrice")
   public void setMinSupplyPrice(BigDecimal minSupplyPrice) {
      this.minSupplyPrice = minSupplyPrice;
   }

   @JsonProperty("minSupplyPrice")
   public BigDecimal getMinSupplyPrice() {
      return this.minSupplyPrice;
   }

   @JsonProperty("maxSupplyPrice")
   public void setMaxSupplyPrice(BigDecimal maxSupplyPrice) {
      this.maxSupplyPrice = maxSupplyPrice;
   }

   @JsonProperty("maxSupplyPrice")
   public BigDecimal getMaxSupplyPrice() {
      return this.maxSupplyPrice;
   }

   @JsonProperty("stock")
   public void setStock(Integer stock) {
      this.stock = stock;
   }

   @JsonProperty("stock")
   public Integer getStock() {
      return this.stock;
   }

   @JsonProperty("imgUri")
   public void setImgUri(String imgUri) {
      this.imgUri = imgUri;
   }

   @JsonProperty("imgUri")
   public String getImgUri() {
      return this.imgUri;
   }

   @JsonProperty("hsCode")
   public void setHsCode(String hsCode) {
      this.hsCode = hsCode;
   }

   @JsonProperty("hsCode")
   public String getHsCode() {
      return this.hsCode;
   }

   @JsonProperty("recommendTpid")
   public void setRecommendTpid(Integer recommendTpid) {
      this.recommendTpid = recommendTpid;
   }

   @JsonProperty("recommendTpid")
   public Integer getRecommendTpid() {
      return this.recommendTpid;
   }

   @JsonProperty("customTpid")
   public void setCustomTpid(Integer customTpid) {
      this.customTpid = customTpid;
   }

   @JsonProperty("customTpid")
   public Integer getCustomTpid() {
      return this.customTpid;
   }

   @JsonProperty("brandId")
   public void setBrandId(Integer brandId) {
      this.brandId = brandId;
   }

   @JsonProperty("brandId")
   public Integer getBrandId() {
      return this.brandId;
   }

   @JsonProperty("deliveryDays")
   public void setDeliveryDays(Integer deliveryDays) {
      this.deliveryDays = deliveryDays;
   }

   @JsonProperty("deliveryDays")
   public Integer getDeliveryDays() {
      return this.deliveryDays;
   }

   @JsonProperty("keywords")
   public void setKeywords(String keywords) {
      this.keywords = keywords;
   }

   @JsonProperty("keywords")
   public String getKeywords() {
      return this.keywords;
   }

   @JsonProperty("description")
   public void setDescription(String description) {
      this.description = description;
   }

   @JsonProperty("description")
   public String getDescription() {
      return this.description;
   }

   @JsonProperty("cubage")
   public void setCubage(String cubage) {
      this.cubage = cubage;
   }

   @JsonProperty("cubage")
   public String getCubage() {
      return this.cubage;
   }

   @JsonProperty("packInfo")
   public void setPackInfo(String packInfo) {
      this.packInfo = packInfo;
   }

   @JsonProperty("packInfo")
   public String getPackInfo() {
      return this.packInfo;
   }

   @JsonProperty("netWeight")
   public void setNetWeight(Float netWeight) {
      this.netWeight = netWeight;
   }

   @JsonProperty("netWeight")
   public Float getNetWeight() {
      return this.netWeight;
   }

   @JsonProperty("weight")
   public void setWeight(Float weight) {
      this.weight = weight;
   }

   @JsonProperty("weight")
   public Float getWeight() {
      return this.weight;
   }

   @JsonProperty("packLong")
   public void setPackLong(Float packLong) {
      this.packLong = packLong;
   }

   @JsonProperty("packLong")
   public Float getPackLong() {
      return this.packLong;
   }

   @JsonProperty("packWide")
   public void setPackWide(Float packWide) {
      this.packWide = packWide;
   }

   @JsonProperty("packWide")
   public Float getPackWide() {
      return this.packWide;
   }

   @JsonProperty("packHeight")
   public void setPackHeight(Float packHeight) {
      this.packHeight = packHeight;
   }

   @JsonProperty("packHeight")
   public Float getPackHeight() {
      return this.packHeight;
   }

   @JsonProperty("wareSkus")
   public void setWareSkus(WareSkuApiVO[] wareSkus) {
      this.wareSkus = wareSkus;
   }

   @JsonProperty("wareSkus")
   public WareSkuApiVO[] getWareSkus() {
      return this.wareSkus;
   }

   @JsonProperty("messegeCode")
   public void setMessegeCode(String messegeCode) {
      this.messegeCode = messegeCode;
   }

   @JsonProperty("messegeCode")
   public String getMessegeCode() {
      return this.messegeCode;
   }

   @JsonProperty("message")
   public void setMessage(String message) {
      this.message = message;
   }

   @JsonProperty("message")
   public String getMessage() {
      return this.message;
   }

   @JsonProperty("success")
   public void setSuccess(boolean success) {
      this.success = success;
   }

   @JsonProperty("success")
   public boolean getSuccess() {
      return this.success;
   }
}
