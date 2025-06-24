package com.jd.open.api.sdk.domain.B2B.BWareReadService.response.get;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Map;

public class BSpuInfoDto implements Serializable {
   private Long jdSpuId;
   private Long b2bSpuId;
   private String spuName;
   private Integer spuSource;
   private Long leavedSpuId;
   private String outerSpuId;
   private Long venderId;
   private Long shopId;
   private Integer venderColType;
   private Integer productColType;
   private Integer spuType;
   private String category;
   private Integer firstCid;
   private String firstCidName;
   private Integer secondCid;
   private String secondCidName;
   private Integer thirdCid;
   private String thirdCidName;
   private Integer spuState;
   private String spuOnShelfTime;
   private String spuOffShelfTime;
   private String imagePath;
   private Integer brandId;
   private Integer productionAreaId;
   private String productionArea;
   private Integer deliveryAreaId;
   private Integer dayLimitedSales;
   private Integer isPayFirst;
   private Integer packSpecification;
   private String saleUnit;
   private String carton;
   private Integer length;
   private Integer width;
   private Integer height;
   private BigDecimal weight;
   private BigDecimal valueWeight;
   private String saler;
   private String shangg;
   private String buyer;
   private String operater;
   private Integer salePlatform;
   private String enBrand;
   private String cnBrand;
   private String model;
   private String shangJia;
   private String thirdSpuId;
   private String upcCode;
   private BigDecimal wholesalePrice;
   private String pcDes;
   private String mobDes;
   private Map<String, String> channelFields;
   private Map<String, String> specialProperty;
   private Map<String, String> b2bSpecialProperty;
   private Integer dataVersion;
   private Integer status;
   private String created;
   private String modified;
   private String bizCode;
   private Integer unLimitCid;
   private String unLimitCidName;

   @JsonProperty("jdSpuId")
   public void setJdSpuId(Long jdSpuId) {
      this.jdSpuId = jdSpuId;
   }

   @JsonProperty("jdSpuId")
   public Long getJdSpuId() {
      return this.jdSpuId;
   }

   @JsonProperty("b2bSpuId")
   public void setB2bSpuId(Long b2bSpuId) {
      this.b2bSpuId = b2bSpuId;
   }

   @JsonProperty("b2bSpuId")
   public Long getB2bSpuId() {
      return this.b2bSpuId;
   }

   @JsonProperty("spuName")
   public void setSpuName(String spuName) {
      this.spuName = spuName;
   }

   @JsonProperty("spuName")
   public String getSpuName() {
      return this.spuName;
   }

   @JsonProperty("spuSource")
   public void setSpuSource(Integer spuSource) {
      this.spuSource = spuSource;
   }

   @JsonProperty("spuSource")
   public Integer getSpuSource() {
      return this.spuSource;
   }

   @JsonProperty("leavedSpuId")
   public void setLeavedSpuId(Long leavedSpuId) {
      this.leavedSpuId = leavedSpuId;
   }

   @JsonProperty("leavedSpuId")
   public Long getLeavedSpuId() {
      return this.leavedSpuId;
   }

   @JsonProperty("outerSpuId")
   public void setOuterSpuId(String outerSpuId) {
      this.outerSpuId = outerSpuId;
   }

   @JsonProperty("outerSpuId")
   public String getOuterSpuId() {
      return this.outerSpuId;
   }

   @JsonProperty("venderId")
   public void setVenderId(Long venderId) {
      this.venderId = venderId;
   }

   @JsonProperty("venderId")
   public Long getVenderId() {
      return this.venderId;
   }

   @JsonProperty("shopId")
   public void setShopId(Long shopId) {
      this.shopId = shopId;
   }

   @JsonProperty("shopId")
   public Long getShopId() {
      return this.shopId;
   }

   @JsonProperty("venderColType")
   public void setVenderColType(Integer venderColType) {
      this.venderColType = venderColType;
   }

   @JsonProperty("venderColType")
   public Integer getVenderColType() {
      return this.venderColType;
   }

   @JsonProperty("productColType")
   public void setProductColType(Integer productColType) {
      this.productColType = productColType;
   }

   @JsonProperty("productColType")
   public Integer getProductColType() {
      return this.productColType;
   }

   @JsonProperty("spuType")
   public void setSpuType(Integer spuType) {
      this.spuType = spuType;
   }

   @JsonProperty("spuType")
   public Integer getSpuType() {
      return this.spuType;
   }

   @JsonProperty("category")
   public void setCategory(String category) {
      this.category = category;
   }

   @JsonProperty("category")
   public String getCategory() {
      return this.category;
   }

   @JsonProperty("firstCid")
   public void setFirstCid(Integer firstCid) {
      this.firstCid = firstCid;
   }

   @JsonProperty("firstCid")
   public Integer getFirstCid() {
      return this.firstCid;
   }

   @JsonProperty("firstCidName")
   public void setFirstCidName(String firstCidName) {
      this.firstCidName = firstCidName;
   }

   @JsonProperty("firstCidName")
   public String getFirstCidName() {
      return this.firstCidName;
   }

   @JsonProperty("secondCid")
   public void setSecondCid(Integer secondCid) {
      this.secondCid = secondCid;
   }

   @JsonProperty("secondCid")
   public Integer getSecondCid() {
      return this.secondCid;
   }

   @JsonProperty("secondCidName")
   public void setSecondCidName(String secondCidName) {
      this.secondCidName = secondCidName;
   }

   @JsonProperty("secondCidName")
   public String getSecondCidName() {
      return this.secondCidName;
   }

   @JsonProperty("thirdCid")
   public void setThirdCid(Integer thirdCid) {
      this.thirdCid = thirdCid;
   }

   @JsonProperty("thirdCid")
   public Integer getThirdCid() {
      return this.thirdCid;
   }

   @JsonProperty("thirdCidName")
   public void setThirdCidName(String thirdCidName) {
      this.thirdCidName = thirdCidName;
   }

   @JsonProperty("thirdCidName")
   public String getThirdCidName() {
      return this.thirdCidName;
   }

   @JsonProperty("spuState")
   public void setSpuState(Integer spuState) {
      this.spuState = spuState;
   }

   @JsonProperty("spuState")
   public Integer getSpuState() {
      return this.spuState;
   }

   @JsonProperty("spuOnShelfTime")
   public void setSpuOnShelfTime(String spuOnShelfTime) {
      this.spuOnShelfTime = spuOnShelfTime;
   }

   @JsonProperty("spuOnShelfTime")
   public String getSpuOnShelfTime() {
      return this.spuOnShelfTime;
   }

   @JsonProperty("spuOffShelfTime")
   public void setSpuOffShelfTime(String spuOffShelfTime) {
      this.spuOffShelfTime = spuOffShelfTime;
   }

   @JsonProperty("spuOffShelfTime")
   public String getSpuOffShelfTime() {
      return this.spuOffShelfTime;
   }

   @JsonProperty("imagePath")
   public void setImagePath(String imagePath) {
      this.imagePath = imagePath;
   }

   @JsonProperty("imagePath")
   public String getImagePath() {
      return this.imagePath;
   }

   @JsonProperty("brandId")
   public void setBrandId(Integer brandId) {
      this.brandId = brandId;
   }

   @JsonProperty("brandId")
   public Integer getBrandId() {
      return this.brandId;
   }

   @JsonProperty("productionAreaId")
   public void setProductionAreaId(Integer productionAreaId) {
      this.productionAreaId = productionAreaId;
   }

   @JsonProperty("productionAreaId")
   public Integer getProductionAreaId() {
      return this.productionAreaId;
   }

   @JsonProperty("productionArea")
   public void setProductionArea(String productionArea) {
      this.productionArea = productionArea;
   }

   @JsonProperty("productionArea")
   public String getProductionArea() {
      return this.productionArea;
   }

   @JsonProperty("deliveryAreaId")
   public void setDeliveryAreaId(Integer deliveryAreaId) {
      this.deliveryAreaId = deliveryAreaId;
   }

   @JsonProperty("deliveryAreaId")
   public Integer getDeliveryAreaId() {
      return this.deliveryAreaId;
   }

   @JsonProperty("dayLimitedSales")
   public void setDayLimitedSales(Integer dayLimitedSales) {
      this.dayLimitedSales = dayLimitedSales;
   }

   @JsonProperty("dayLimitedSales")
   public Integer getDayLimitedSales() {
      return this.dayLimitedSales;
   }

   @JsonProperty("isPayFirst")
   public void setIsPayFirst(Integer isPayFirst) {
      this.isPayFirst = isPayFirst;
   }

   @JsonProperty("isPayFirst")
   public Integer getIsPayFirst() {
      return this.isPayFirst;
   }

   @JsonProperty("packSpecification")
   public void setPackSpecification(Integer packSpecification) {
      this.packSpecification = packSpecification;
   }

   @JsonProperty("packSpecification")
   public Integer getPackSpecification() {
      return this.packSpecification;
   }

   @JsonProperty("saleUnit")
   public void setSaleUnit(String saleUnit) {
      this.saleUnit = saleUnit;
   }

   @JsonProperty("saleUnit")
   public String getSaleUnit() {
      return this.saleUnit;
   }

   @JsonProperty("carton")
   public void setCarton(String carton) {
      this.carton = carton;
   }

   @JsonProperty("carton")
   public String getCarton() {
      return this.carton;
   }

   @JsonProperty("length")
   public void setLength(Integer length) {
      this.length = length;
   }

   @JsonProperty("length")
   public Integer getLength() {
      return this.length;
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

   @JsonProperty("weight")
   public void setWeight(BigDecimal weight) {
      this.weight = weight;
   }

   @JsonProperty("weight")
   public BigDecimal getWeight() {
      return this.weight;
   }

   @JsonProperty("valueWeight")
   public void setValueWeight(BigDecimal valueWeight) {
      this.valueWeight = valueWeight;
   }

   @JsonProperty("valueWeight")
   public BigDecimal getValueWeight() {
      return this.valueWeight;
   }

   @JsonProperty("saler")
   public void setSaler(String saler) {
      this.saler = saler;
   }

   @JsonProperty("saler")
   public String getSaler() {
      return this.saler;
   }

   @JsonProperty("shangg")
   public void setShangg(String shangg) {
      this.shangg = shangg;
   }

   @JsonProperty("shangg")
   public String getShangg() {
      return this.shangg;
   }

   @JsonProperty("buyer")
   public void setBuyer(String buyer) {
      this.buyer = buyer;
   }

   @JsonProperty("buyer")
   public String getBuyer() {
      return this.buyer;
   }

   @JsonProperty("operater")
   public void setOperater(String operater) {
      this.operater = operater;
   }

   @JsonProperty("operater")
   public String getOperater() {
      return this.operater;
   }

   @JsonProperty("salePlatform")
   public void setSalePlatform(Integer salePlatform) {
      this.salePlatform = salePlatform;
   }

   @JsonProperty("salePlatform")
   public Integer getSalePlatform() {
      return this.salePlatform;
   }

   @JsonProperty("enBrand")
   public void setEnBrand(String enBrand) {
      this.enBrand = enBrand;
   }

   @JsonProperty("enBrand")
   public String getEnBrand() {
      return this.enBrand;
   }

   @JsonProperty("cnBrand")
   public void setCnBrand(String cnBrand) {
      this.cnBrand = cnBrand;
   }

   @JsonProperty("cnBrand")
   public String getCnBrand() {
      return this.cnBrand;
   }

   @JsonProperty("model")
   public void setModel(String model) {
      this.model = model;
   }

   @JsonProperty("model")
   public String getModel() {
      return this.model;
   }

   @JsonProperty("shangJia")
   public void setShangJia(String shangJia) {
      this.shangJia = shangJia;
   }

   @JsonProperty("shangJia")
   public String getShangJia() {
      return this.shangJia;
   }

   @JsonProperty("thirdSpuId")
   public void setThirdSpuId(String thirdSpuId) {
      this.thirdSpuId = thirdSpuId;
   }

   @JsonProperty("thirdSpuId")
   public String getThirdSpuId() {
      return this.thirdSpuId;
   }

   @JsonProperty("upcCode")
   public void setUpcCode(String upcCode) {
      this.upcCode = upcCode;
   }

   @JsonProperty("upcCode")
   public String getUpcCode() {
      return this.upcCode;
   }

   @JsonProperty("wholesalePrice")
   public void setWholesalePrice(BigDecimal wholesalePrice) {
      this.wholesalePrice = wholesalePrice;
   }

   @JsonProperty("wholesalePrice")
   public BigDecimal getWholesalePrice() {
      return this.wholesalePrice;
   }

   @JsonProperty("pcDes")
   public void setPcDes(String pcDes) {
      this.pcDes = pcDes;
   }

   @JsonProperty("pcDes")
   public String getPcDes() {
      return this.pcDes;
   }

   @JsonProperty("mobDes")
   public void setMobDes(String mobDes) {
      this.mobDes = mobDes;
   }

   @JsonProperty("mobDes")
   public String getMobDes() {
      return this.mobDes;
   }

   @JsonProperty("channelFields")
   public void setChannelFields(Map<String, String> channelFields) {
      this.channelFields = channelFields;
   }

   @JsonProperty("channelFields")
   public Map<String, String> getChannelFields() {
      return this.channelFields;
   }

   @JsonProperty("specialProperty")
   public void setSpecialProperty(Map<String, String> specialProperty) {
      this.specialProperty = specialProperty;
   }

   @JsonProperty("specialProperty")
   public Map<String, String> getSpecialProperty() {
      return this.specialProperty;
   }

   @JsonProperty("b2bSpecialProperty")
   public void setB2bSpecialProperty(Map<String, String> b2bSpecialProperty) {
      this.b2bSpecialProperty = b2bSpecialProperty;
   }

   @JsonProperty("b2bSpecialProperty")
   public Map<String, String> getB2bSpecialProperty() {
      return this.b2bSpecialProperty;
   }

   @JsonProperty("dataVersion")
   public void setDataVersion(Integer dataVersion) {
      this.dataVersion = dataVersion;
   }

   @JsonProperty("dataVersion")
   public Integer getDataVersion() {
      return this.dataVersion;
   }

   @JsonProperty("status")
   public void setStatus(Integer status) {
      this.status = status;
   }

   @JsonProperty("status")
   public Integer getStatus() {
      return this.status;
   }

   @JsonProperty("created")
   public void setCreated(String created) {
      this.created = created;
   }

   @JsonProperty("created")
   public String getCreated() {
      return this.created;
   }

   @JsonProperty("modified")
   public void setModified(String modified) {
      this.modified = modified;
   }

   @JsonProperty("modified")
   public String getModified() {
      return this.modified;
   }

   @JsonProperty("bizCode")
   public void setBizCode(String bizCode) {
      this.bizCode = bizCode;
   }

   @JsonProperty("bizCode")
   public String getBizCode() {
      return this.bizCode;
   }

   @JsonProperty("unLimitCid")
   public void setUnLimitCid(Integer unLimitCid) {
      this.unLimitCid = unLimitCid;
   }

   @JsonProperty("unLimitCid")
   public Integer getUnLimitCid() {
      return this.unLimitCid;
   }

   @JsonProperty("unLimitCidName")
   public void setUnLimitCidName(String unLimitCidName) {
      this.unLimitCidName = unLimitCidName;
   }

   @JsonProperty("unLimitCidName")
   public String getUnLimitCidName() {
      return this.unLimitCidName;
   }
}
