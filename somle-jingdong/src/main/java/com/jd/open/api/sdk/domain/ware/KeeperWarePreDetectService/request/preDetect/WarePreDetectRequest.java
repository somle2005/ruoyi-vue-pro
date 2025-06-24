package com.jd.open.api.sdk.domain.ware.KeeperWarePreDetectService.request.preDetect;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

public class WarePreDetectRequest implements Serializable {
   private Long thirdCid;
   private Integer payFirst;
   private Integer giftGoods;
   private Long brandId;
   private String adWords;
   private String slogan;
   private Set<String> appDescImages;
   private Long shopId;
   private Set<String> transparentImages;
   private Set<String> pcDescImages;
   private String pcDescText;
   private Long firstCid;
   private Long secondCid;
   private Long wareId;
   private String hrefSlogan;
   private String productArea;
   private String appDescText;
   private Integer source;
   private String wareName;
   private Long unLimitCid;
   private String shopName;
   private Integer factoryShip;
   private List<WarePreDetectRequest$Sku> skus;
   private String tempId;
   private String venderName;
   private WarePreDetectRequest$Brand brand;
   private Set<String> skuImages;
   private List<Arrays> attrs;
   private List<Arrays> marketings;
   private Boolean draft;

   @JsonProperty("thirdCid")
   public void setThirdCid(Long thirdCid) {
      this.thirdCid = thirdCid;
   }

   @JsonProperty("thirdCid")
   public Long getThirdCid() {
      return this.thirdCid;
   }

   @JsonProperty("payFirst")
   public void setPayFirst(Integer payFirst) {
      this.payFirst = payFirst;
   }

   @JsonProperty("payFirst")
   public Integer getPayFirst() {
      return this.payFirst;
   }

   @JsonProperty("giftGoods")
   public void setGiftGoods(Integer giftGoods) {
      this.giftGoods = giftGoods;
   }

   @JsonProperty("giftGoods")
   public Integer getGiftGoods() {
      return this.giftGoods;
   }

   @JsonProperty("brandId")
   public void setBrandId(Long brandId) {
      this.brandId = brandId;
   }

   @JsonProperty("brandId")
   public Long getBrandId() {
      return this.brandId;
   }

   @JsonProperty("adWords")
   public void setAdWords(String adWords) {
      this.adWords = adWords;
   }

   @JsonProperty("adWords")
   public String getAdWords() {
      return this.adWords;
   }

   @JsonProperty("slogan")
   public void setSlogan(String slogan) {
      this.slogan = slogan;
   }

   @JsonProperty("slogan")
   public String getSlogan() {
      return this.slogan;
   }

   @JsonProperty("appDescImages")
   public void setAppDescImages(Set<String> appDescImages) {
      this.appDescImages = appDescImages;
   }

   @JsonProperty("appDescImages")
   public Set<String> getAppDescImages() {
      return this.appDescImages;
   }

   @JsonProperty("shopId")
   public void setShopId(Long shopId) {
      this.shopId = shopId;
   }

   @JsonProperty("shopId")
   public Long getShopId() {
      return this.shopId;
   }

   @JsonProperty("transparentImages")
   public void setTransparentImages(Set<String> transparentImages) {
      this.transparentImages = transparentImages;
   }

   @JsonProperty("transparentImages")
   public Set<String> getTransparentImages() {
      return this.transparentImages;
   }

   @JsonProperty("pcDescImages")
   public void setPcDescImages(Set<String> pcDescImages) {
      this.pcDescImages = pcDescImages;
   }

   @JsonProperty("pcDescImages")
   public Set<String> getPcDescImages() {
      return this.pcDescImages;
   }

   @JsonProperty("pcDescText")
   public void setPcDescText(String pcDescText) {
      this.pcDescText = pcDescText;
   }

   @JsonProperty("pcDescText")
   public String getPcDescText() {
      return this.pcDescText;
   }

   @JsonProperty("firstCid")
   public void setFirstCid(Long firstCid) {
      this.firstCid = firstCid;
   }

   @JsonProperty("firstCid")
   public Long getFirstCid() {
      return this.firstCid;
   }

   @JsonProperty("secondCid")
   public void setSecondCid(Long secondCid) {
      this.secondCid = secondCid;
   }

   @JsonProperty("secondCid")
   public Long getSecondCid() {
      return this.secondCid;
   }

   @JsonProperty("wareId")
   public void setWareId(Long wareId) {
      this.wareId = wareId;
   }

   @JsonProperty("wareId")
   public Long getWareId() {
      return this.wareId;
   }

   @JsonProperty("hrefSlogan")
   public void setHrefSlogan(String hrefSlogan) {
      this.hrefSlogan = hrefSlogan;
   }

   @JsonProperty("hrefSlogan")
   public String getHrefSlogan() {
      return this.hrefSlogan;
   }

   @JsonProperty("productArea")
   public void setProductArea(String productArea) {
      this.productArea = productArea;
   }

   @JsonProperty("productArea")
   public String getProductArea() {
      return this.productArea;
   }

   @JsonProperty("appDescText")
   public void setAppDescText(String appDescText) {
      this.appDescText = appDescText;
   }

   @JsonProperty("appDescText")
   public String getAppDescText() {
      return this.appDescText;
   }

   @JsonProperty("source")
   public void setSource(Integer source) {
      this.source = source;
   }

   @JsonProperty("source")
   public Integer getSource() {
      return this.source;
   }

   @JsonProperty("wareName")
   public void setWareName(String wareName) {
      this.wareName = wareName;
   }

   @JsonProperty("wareName")
   public String getWareName() {
      return this.wareName;
   }

   @JsonProperty("unLimitCid")
   public void setUnLimitCid(Long unLimitCid) {
      this.unLimitCid = unLimitCid;
   }

   @JsonProperty("unLimitCid")
   public Long getUnLimitCid() {
      return this.unLimitCid;
   }

   @JsonProperty("shopName")
   public void setShopName(String shopName) {
      this.shopName = shopName;
   }

   @JsonProperty("shopName")
   public String getShopName() {
      return this.shopName;
   }

   @JsonProperty("factoryShip")
   public void setFactoryShip(Integer factoryShip) {
      this.factoryShip = factoryShip;
   }

   @JsonProperty("factoryShip")
   public Integer getFactoryShip() {
      return this.factoryShip;
   }

   @JsonProperty("skus")
   public void setSkus(List<WarePreDetectRequest$Sku> skus) {
      this.skus = skus;
   }

   @JsonProperty("skus")
   public List<WarePreDetectRequest$Sku> getSkus() {
      return this.skus;
   }

   @JsonProperty("tempId")
   public void setTempId(String tempId) {
      this.tempId = tempId;
   }

   @JsonProperty("tempId")
   public String getTempId() {
      return this.tempId;
   }

   @JsonProperty("venderName")
   public void setVenderName(String venderName) {
      this.venderName = venderName;
   }

   @JsonProperty("venderName")
   public String getVenderName() {
      return this.venderName;
   }

   @JsonProperty("brand")
   public void setBrand(WarePreDetectRequest$Brand brand) {
      this.brand = brand;
   }

   @JsonProperty("brand")
   public WarePreDetectRequest$Brand getBrand() {
      return this.brand;
   }

   @JsonProperty("skuImages")
   public void setSkuImages(Set<String> skuImages) {
      this.skuImages = skuImages;
   }

   @JsonProperty("skuImages")
   public Set<String> getSkuImages() {
      return this.skuImages;
   }

   @JsonProperty("attrs")
   public void setAttrs(List<Arrays> attrs) {
      this.attrs = attrs;
   }

   @JsonProperty("attrs")
   public List<Arrays> getAttrs() {
      return this.attrs;
   }

   @JsonProperty("marketings")
   public void setMarketings(List<Arrays> marketings) {
      this.marketings = marketings;
   }

   @JsonProperty("marketings")
   public List<Arrays> getMarketings() {
      return this.marketings;
   }

   @JsonProperty("draft")
   public void setDraft(Boolean draft) {
      this.draft = draft;
   }

   @JsonProperty("draft")
   public Boolean getDraft() {
      return this.draft;
   }
}
