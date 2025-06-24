package com.jd.open.api.sdk.domain.B2B.B2BOrderProvider.response.submitPo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public class SkuResp implements Serializable {
   private Long secondCategory;
   private String packSpecification;
   private Integer num;
   private BigDecimal salesPrice;
   private Long firstCategory;
   private Long venderId;
   private int limitHour;
   private Long promotionId;
   private long numTotal;
   private Long giftId;
   private String venderCode;
   private long numRemain;
   private Long skuId;
   private String venderShopName;
   private List<SkuResp> gifts;
   private Long height;
   private Long thirdCategory;
   private Integer promotionType;
   private Long length;
   private double weight;
   private Integer skuType;
   private Map<String, String> extAttr;
   private String imgUrl;
   private Long venderShopId;
   private BigDecimal taxRate;
   private BigDecimal extFreight;
   private Integer onLineStatus;
   private Long brandId;
   private String name;
   private String factoryShip;
   private Long width;
   private boolean embargo;
   private String isKO;

   @JsonProperty("secondCategory")
   public void setSecondCategory(Long secondCategory) {
      this.secondCategory = secondCategory;
   }

   @JsonProperty("secondCategory")
   public Long getSecondCategory() {
      return this.secondCategory;
   }

   @JsonProperty("packSpecification")
   public void setPackSpecification(String packSpecification) {
      this.packSpecification = packSpecification;
   }

   @JsonProperty("packSpecification")
   public String getPackSpecification() {
      return this.packSpecification;
   }

   @JsonProperty("num")
   public void setNum(Integer num) {
      this.num = num;
   }

   @JsonProperty("num")
   public Integer getNum() {
      return this.num;
   }

   @JsonProperty("salesPrice")
   public void setSalesPrice(BigDecimal salesPrice) {
      this.salesPrice = salesPrice;
   }

   @JsonProperty("salesPrice")
   public BigDecimal getSalesPrice() {
      return this.salesPrice;
   }

   @JsonProperty("firstCategory")
   public void setFirstCategory(Long firstCategory) {
      this.firstCategory = firstCategory;
   }

   @JsonProperty("firstCategory")
   public Long getFirstCategory() {
      return this.firstCategory;
   }

   @JsonProperty("venderId")
   public void setVenderId(Long venderId) {
      this.venderId = venderId;
   }

   @JsonProperty("venderId")
   public Long getVenderId() {
      return this.venderId;
   }

   @JsonProperty("limitHour")
   public void setLimitHour(int limitHour) {
      this.limitHour = limitHour;
   }

   @JsonProperty("limitHour")
   public int getLimitHour() {
      return this.limitHour;
   }

   @JsonProperty("promotionId")
   public void setPromotionId(Long promotionId) {
      this.promotionId = promotionId;
   }

   @JsonProperty("promotionId")
   public Long getPromotionId() {
      return this.promotionId;
   }

   @JsonProperty("numTotal")
   public void setNumTotal(long numTotal) {
      this.numTotal = numTotal;
   }

   @JsonProperty("numTotal")
   public long getNumTotal() {
      return this.numTotal;
   }

   @JsonProperty("giftId")
   public void setGiftId(Long giftId) {
      this.giftId = giftId;
   }

   @JsonProperty("giftId")
   public Long getGiftId() {
      return this.giftId;
   }

   @JsonProperty("venderCode")
   public void setVenderCode(String venderCode) {
      this.venderCode = venderCode;
   }

   @JsonProperty("venderCode")
   public String getVenderCode() {
      return this.venderCode;
   }

   @JsonProperty("numRemain")
   public void setNumRemain(long numRemain) {
      this.numRemain = numRemain;
   }

   @JsonProperty("numRemain")
   public long getNumRemain() {
      return this.numRemain;
   }

   @JsonProperty("skuId")
   public void setSkuId(Long skuId) {
      this.skuId = skuId;
   }

   @JsonProperty("skuId")
   public Long getSkuId() {
      return this.skuId;
   }

   @JsonProperty("venderShopName")
   public void setVenderShopName(String venderShopName) {
      this.venderShopName = venderShopName;
   }

   @JsonProperty("venderShopName")
   public String getVenderShopName() {
      return this.venderShopName;
   }

   @JsonProperty("gifts")
   public void setGifts(List<SkuResp> gifts) {
      this.gifts = gifts;
   }

   @JsonProperty("gifts")
   public List<SkuResp> getGifts() {
      return this.gifts;
   }

   @JsonProperty("height")
   public void setHeight(Long height) {
      this.height = height;
   }

   @JsonProperty("height")
   public Long getHeight() {
      return this.height;
   }

   @JsonProperty("thirdCategory")
   public void setThirdCategory(Long thirdCategory) {
      this.thirdCategory = thirdCategory;
   }

   @JsonProperty("thirdCategory")
   public Long getThirdCategory() {
      return this.thirdCategory;
   }

   @JsonProperty("promotionType")
   public void setPromotionType(Integer promotionType) {
      this.promotionType = promotionType;
   }

   @JsonProperty("promotionType")
   public Integer getPromotionType() {
      return this.promotionType;
   }

   @JsonProperty("length")
   public void setLength(Long length) {
      this.length = length;
   }

   @JsonProperty("length")
   public Long getLength() {
      return this.length;
   }

   @JsonProperty("weight")
   public void setWeight(double weight) {
      this.weight = weight;
   }

   @JsonProperty("weight")
   public double getWeight() {
      return this.weight;
   }

   @JsonProperty("skuType")
   public void setSkuType(Integer skuType) {
      this.skuType = skuType;
   }

   @JsonProperty("skuType")
   public Integer getSkuType() {
      return this.skuType;
   }

   @JsonProperty("extAttr")
   public void setExtAttr(Map<String, String> extAttr) {
      this.extAttr = extAttr;
   }

   @JsonProperty("extAttr")
   public Map<String, String> getExtAttr() {
      return this.extAttr;
   }

   @JsonProperty("imgUrl")
   public void setImgUrl(String imgUrl) {
      this.imgUrl = imgUrl;
   }

   @JsonProperty("imgUrl")
   public String getImgUrl() {
      return this.imgUrl;
   }

   @JsonProperty("venderShopId")
   public void setVenderShopId(Long venderShopId) {
      this.venderShopId = venderShopId;
   }

   @JsonProperty("venderShopId")
   public Long getVenderShopId() {
      return this.venderShopId;
   }

   @JsonProperty("taxRate")
   public void setTaxRate(BigDecimal taxRate) {
      this.taxRate = taxRate;
   }

   @JsonProperty("taxRate")
   public BigDecimal getTaxRate() {
      return this.taxRate;
   }

   @JsonProperty("extFreight")
   public void setExtFreight(BigDecimal extFreight) {
      this.extFreight = extFreight;
   }

   @JsonProperty("extFreight")
   public BigDecimal getExtFreight() {
      return this.extFreight;
   }

   @JsonProperty("onLineStatus")
   public void setOnLineStatus(Integer onLineStatus) {
      this.onLineStatus = onLineStatus;
   }

   @JsonProperty("onLineStatus")
   public Integer getOnLineStatus() {
      return this.onLineStatus;
   }

   @JsonProperty("brandId")
   public void setBrandId(Long brandId) {
      this.brandId = brandId;
   }

   @JsonProperty("brandId")
   public Long getBrandId() {
      return this.brandId;
   }

   @JsonProperty("name")
   public void setName(String name) {
      this.name = name;
   }

   @JsonProperty("name")
   public String getName() {
      return this.name;
   }

   @JsonProperty("factoryShip")
   public void setFactoryShip(String factoryShip) {
      this.factoryShip = factoryShip;
   }

   @JsonProperty("factoryShip")
   public String getFactoryShip() {
      return this.factoryShip;
   }

   @JsonProperty("width")
   public void setWidth(Long width) {
      this.width = width;
   }

   @JsonProperty("width")
   public Long getWidth() {
      return this.width;
   }

   @JsonProperty("embargo")
   public void setEmbargo(boolean embargo) {
      this.embargo = embargo;
   }

   @JsonProperty("embargo")
   public boolean getEmbargo() {
      return this.embargo;
   }

   @JsonProperty("isKO")
   public void setIsKO(String isKO) {
      this.isKO = isKO;
   }

   @JsonProperty("isKO")
   public String getIsKO() {
      return this.isKO;
   }
}
