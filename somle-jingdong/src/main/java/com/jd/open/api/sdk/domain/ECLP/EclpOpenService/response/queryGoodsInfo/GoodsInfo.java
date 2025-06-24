package com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.queryGoodsInfo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;

public class GoodsInfo implements Serializable {
   private String[] goodsNo;
   private String[] sellerGoodsSign;
   private String[] deptNo;
   private String[] isvGoodsNo;
   private String[] spGoodsNo;
   private String[] barcodes;
   private String[] thirdCategoryNo;
   private String[] goodsName;
   private String[] abbreviation;
   private String[] brandNo;
   private String[] brandName;
   private String[] manufacturer;
   private String[] produceAddress;
   private String[] standard;
   private String[] color;
   private String[] size;
   private String[] sizeDefinition;
   private Double[] grossWeight;
   private Double[] netWeight;
   private Integer[] length;
   private Integer[] width;
   private Integer[] height;
   private Integer[] safeDays;
   private Float[] instoreThreshold;
   private Float[] outstoreThreshold;
   private String[] serial;
   private String[] batch;
   private String[] cheapGift;
   private String[] quality;
   private String[] expensive;
   private String[] luxury;
   private String[] breakable;
   private String[] liquid;
   private String[] consumables;
   private String[] abnormal;
   private String[] imported;
   private String[] health;
   private String[] temperature;
   private String[] temperatureCeil;
   private String[] temperatureFloor;
   private String[] humidity;
   private String[] humidityCeil;
   private String[] humidityFloor;
   private String[] movable;
   private String[] service3g;
   private String[] sample;
   private String[] odor;
   private String[] sex;
   private String[] precious;
   private String[] mixedBatch;
   private String[] reserve1;
   private String[] reserve2;
   private String[] reserve3;
   private String[] reserve4;
   private String[] reserve5;
   private String[] reserve6;
   private String[] reserve7;
   private String[] reserve8;
   private String[] reserve9;
   private String[] reserve10;
   private String[] airMark;
   private String[] storeProperty;
   private Byte[] storeSaleFlag;
   private String[] keyMaintenance;
   private String[] specialDrugs;
   private String[] boxRule;
   private Integer[] warningDay;
   private Integer[] regularAdventDay;
   private Integer[] urgentAdventDay;
   private Integer[] adventDay;
   private String[] easyPollute;
   private String[] muslim;
   private Integer[] allowedDay;
   private String[] approvalNo;
   private Byte athletesUseCaution;
   private Byte elecSupervisionCodeFlag;
   private BigDecimal[] caseGrossWeight;
   private BigDecimal[] boxRegulations;
   private Byte enableFlag;
   private String[] goodsUnit;
   private Byte uniqueCode;
   private Byte clothingAttr;
   private Byte clothingStyle;
   private Byte clothingVersionType;
   private Byte clothingSilhouette;
   private Byte clothingThickness;
   private Byte clothingWeek;
   private String bodyParts;
   private String styleSex;
   private String listedBand;
   private String expectListedTime;
   private String fabric;
   private String washing;
   private String year;
   private String productSeason;
   private String afterSaleFlag;
   private String transportTemperature;
   private Byte boxUniqueCode;
   private Byte auxiliary;
   private Integer minSaleQuantity;
   private Integer minPackageQuantity;
   private String packageInstruction;
   private String texture;
   private String substrate;
   private String executiveStandard;
   private String processTechnology;
   private String allSerial;
   private String renewPackage;
   private Byte warehouseInsured;
   private Byte transportInsured;
   private Byte isBillingSplit;
   private Integer source;
   private Integer medicineCategoryCode;

   @JsonProperty("goodsNo")
   public void setGoodsNo(String[] goodsNo) {
      this.goodsNo = goodsNo;
   }

   @JsonProperty("goodsNo")
   public String[] getGoodsNo() {
      return this.goodsNo;
   }

   @JsonProperty("sellerGoodsSign")
   public void setSellerGoodsSign(String[] sellerGoodsSign) {
      this.sellerGoodsSign = sellerGoodsSign;
   }

   @JsonProperty("sellerGoodsSign")
   public String[] getSellerGoodsSign() {
      return this.sellerGoodsSign;
   }

   @JsonProperty("deptNo")
   public void setDeptNo(String[] deptNo) {
      this.deptNo = deptNo;
   }

   @JsonProperty("deptNo")
   public String[] getDeptNo() {
      return this.deptNo;
   }

   @JsonProperty("isvGoodsNo")
   public void setIsvGoodsNo(String[] isvGoodsNo) {
      this.isvGoodsNo = isvGoodsNo;
   }

   @JsonProperty("isvGoodsNo")
   public String[] getIsvGoodsNo() {
      return this.isvGoodsNo;
   }

   @JsonProperty("spGoodsNo")
   public void setSpGoodsNo(String[] spGoodsNo) {
      this.spGoodsNo = spGoodsNo;
   }

   @JsonProperty("spGoodsNo")
   public String[] getSpGoodsNo() {
      return this.spGoodsNo;
   }

   @JsonProperty("barcodes")
   public void setBarcodes(String[] barcodes) {
      this.barcodes = barcodes;
   }

   @JsonProperty("barcodes")
   public String[] getBarcodes() {
      return this.barcodes;
   }

   @JsonProperty("thirdCategoryNo")
   public void setThirdCategoryNo(String[] thirdCategoryNo) {
      this.thirdCategoryNo = thirdCategoryNo;
   }

   @JsonProperty("thirdCategoryNo")
   public String[] getThirdCategoryNo() {
      return this.thirdCategoryNo;
   }

   @JsonProperty("goodsName")
   public void setGoodsName(String[] goodsName) {
      this.goodsName = goodsName;
   }

   @JsonProperty("goodsName")
   public String[] getGoodsName() {
      return this.goodsName;
   }

   @JsonProperty("abbreviation")
   public void setAbbreviation(String[] abbreviation) {
      this.abbreviation = abbreviation;
   }

   @JsonProperty("abbreviation")
   public String[] getAbbreviation() {
      return this.abbreviation;
   }

   @JsonProperty("brandNo")
   public void setBrandNo(String[] brandNo) {
      this.brandNo = brandNo;
   }

   @JsonProperty("brandNo")
   public String[] getBrandNo() {
      return this.brandNo;
   }

   @JsonProperty("brandName")
   public void setBrandName(String[] brandName) {
      this.brandName = brandName;
   }

   @JsonProperty("brandName")
   public String[] getBrandName() {
      return this.brandName;
   }

   @JsonProperty("manufacturer")
   public void setManufacturer(String[] manufacturer) {
      this.manufacturer = manufacturer;
   }

   @JsonProperty("manufacturer")
   public String[] getManufacturer() {
      return this.manufacturer;
   }

   @JsonProperty("produceAddress")
   public void setProduceAddress(String[] produceAddress) {
      this.produceAddress = produceAddress;
   }

   @JsonProperty("produceAddress")
   public String[] getProduceAddress() {
      return this.produceAddress;
   }

   @JsonProperty("standard")
   public void setStandard(String[] standard) {
      this.standard = standard;
   }

   @JsonProperty("standard")
   public String[] getStandard() {
      return this.standard;
   }

   @JsonProperty("color")
   public void setColor(String[] color) {
      this.color = color;
   }

   @JsonProperty("color")
   public String[] getColor() {
      return this.color;
   }

   @JsonProperty("size")
   public void setSize(String[] size) {
      this.size = size;
   }

   @JsonProperty("size")
   public String[] getSize() {
      return this.size;
   }

   @JsonProperty("sizeDefinition")
   public void setSizeDefinition(String[] sizeDefinition) {
      this.sizeDefinition = sizeDefinition;
   }

   @JsonProperty("sizeDefinition")
   public String[] getSizeDefinition() {
      return this.sizeDefinition;
   }

   @JsonProperty("grossWeight")
   public void setGrossWeight(Double[] grossWeight) {
      this.grossWeight = grossWeight;
   }

   @JsonProperty("grossWeight")
   public Double[] getGrossWeight() {
      return this.grossWeight;
   }

   @JsonProperty("netWeight")
   public void setNetWeight(Double[] netWeight) {
      this.netWeight = netWeight;
   }

   @JsonProperty("netWeight")
   public Double[] getNetWeight() {
      return this.netWeight;
   }

   @JsonProperty("length")
   public void setLength(Integer[] length) {
      this.length = length;
   }

   @JsonProperty("length")
   public Integer[] getLength() {
      return this.length;
   }

   @JsonProperty("width")
   public void setWidth(Integer[] width) {
      this.width = width;
   }

   @JsonProperty("width")
   public Integer[] getWidth() {
      return this.width;
   }

   @JsonProperty("height")
   public void setHeight(Integer[] height) {
      this.height = height;
   }

   @JsonProperty("height")
   public Integer[] getHeight() {
      return this.height;
   }

   @JsonProperty("safeDays")
   public void setSafeDays(Integer[] safeDays) {
      this.safeDays = safeDays;
   }

   @JsonProperty("safeDays")
   public Integer[] getSafeDays() {
      return this.safeDays;
   }

   @JsonProperty("instoreThreshold")
   public void setInstoreThreshold(Float[] instoreThreshold) {
      this.instoreThreshold = instoreThreshold;
   }

   @JsonProperty("instoreThreshold")
   public Float[] getInstoreThreshold() {
      return this.instoreThreshold;
   }

   @JsonProperty("outstoreThreshold")
   public void setOutstoreThreshold(Float[] outstoreThreshold) {
      this.outstoreThreshold = outstoreThreshold;
   }

   @JsonProperty("outstoreThreshold")
   public Float[] getOutstoreThreshold() {
      return this.outstoreThreshold;
   }

   @JsonProperty("serial")
   public void setSerial(String[] serial) {
      this.serial = serial;
   }

   @JsonProperty("serial")
   public String[] getSerial() {
      return this.serial;
   }

   @JsonProperty("batch")
   public void setBatch(String[] batch) {
      this.batch = batch;
   }

   @JsonProperty("batch")
   public String[] getBatch() {
      return this.batch;
   }

   @JsonProperty("cheapGift")
   public void setCheapGift(String[] cheapGift) {
      this.cheapGift = cheapGift;
   }

   @JsonProperty("cheapGift")
   public String[] getCheapGift() {
      return this.cheapGift;
   }

   @JsonProperty("quality")
   public void setQuality(String[] quality) {
      this.quality = quality;
   }

   @JsonProperty("quality")
   public String[] getQuality() {
      return this.quality;
   }

   @JsonProperty("expensive")
   public void setExpensive(String[] expensive) {
      this.expensive = expensive;
   }

   @JsonProperty("expensive")
   public String[] getExpensive() {
      return this.expensive;
   }

   @JsonProperty("luxury")
   public void setLuxury(String[] luxury) {
      this.luxury = luxury;
   }

   @JsonProperty("luxury")
   public String[] getLuxury() {
      return this.luxury;
   }

   @JsonProperty("breakable")
   public void setBreakable(String[] breakable) {
      this.breakable = breakable;
   }

   @JsonProperty("breakable")
   public String[] getBreakable() {
      return this.breakable;
   }

   @JsonProperty("liquid")
   public void setLiquid(String[] liquid) {
      this.liquid = liquid;
   }

   @JsonProperty("liquid")
   public String[] getLiquid() {
      return this.liquid;
   }

   @JsonProperty("consumables")
   public void setConsumables(String[] consumables) {
      this.consumables = consumables;
   }

   @JsonProperty("consumables")
   public String[] getConsumables() {
      return this.consumables;
   }

   @JsonProperty("abnormal")
   public void setAbnormal(String[] abnormal) {
      this.abnormal = abnormal;
   }

   @JsonProperty("abnormal")
   public String[] getAbnormal() {
      return this.abnormal;
   }

   @JsonProperty("imported")
   public void setImported(String[] imported) {
      this.imported = imported;
   }

   @JsonProperty("imported")
   public String[] getImported() {
      return this.imported;
   }

   @JsonProperty("health")
   public void setHealth(String[] health) {
      this.health = health;
   }

   @JsonProperty("health")
   public String[] getHealth() {
      return this.health;
   }

   @JsonProperty("temperature")
   public void setTemperature(String[] temperature) {
      this.temperature = temperature;
   }

   @JsonProperty("temperature")
   public String[] getTemperature() {
      return this.temperature;
   }

   @JsonProperty("temperatureCeil")
   public void setTemperatureCeil(String[] temperatureCeil) {
      this.temperatureCeil = temperatureCeil;
   }

   @JsonProperty("temperatureCeil")
   public String[] getTemperatureCeil() {
      return this.temperatureCeil;
   }

   @JsonProperty("temperatureFloor")
   public void setTemperatureFloor(String[] temperatureFloor) {
      this.temperatureFloor = temperatureFloor;
   }

   @JsonProperty("temperatureFloor")
   public String[] getTemperatureFloor() {
      return this.temperatureFloor;
   }

   @JsonProperty("humidity")
   public void setHumidity(String[] humidity) {
      this.humidity = humidity;
   }

   @JsonProperty("humidity")
   public String[] getHumidity() {
      return this.humidity;
   }

   @JsonProperty("humidityCeil")
   public void setHumidityCeil(String[] humidityCeil) {
      this.humidityCeil = humidityCeil;
   }

   @JsonProperty("humidityCeil")
   public String[] getHumidityCeil() {
      return this.humidityCeil;
   }

   @JsonProperty("humidityFloor")
   public void setHumidityFloor(String[] humidityFloor) {
      this.humidityFloor = humidityFloor;
   }

   @JsonProperty("humidityFloor")
   public String[] getHumidityFloor() {
      return this.humidityFloor;
   }

   @JsonProperty("movable")
   public void setMovable(String[] movable) {
      this.movable = movable;
   }

   @JsonProperty("movable")
   public String[] getMovable() {
      return this.movable;
   }

   @JsonProperty("service3g")
   public void setService3g(String[] service3g) {
      this.service3g = service3g;
   }

   @JsonProperty("service3g")
   public String[] getService3g() {
      return this.service3g;
   }

   @JsonProperty("sample")
   public void setSample(String[] sample) {
      this.sample = sample;
   }

   @JsonProperty("sample")
   public String[] getSample() {
      return this.sample;
   }

   @JsonProperty("odor")
   public void setOdor(String[] odor) {
      this.odor = odor;
   }

   @JsonProperty("odor")
   public String[] getOdor() {
      return this.odor;
   }

   @JsonProperty("sex")
   public void setSex(String[] sex) {
      this.sex = sex;
   }

   @JsonProperty("sex")
   public String[] getSex() {
      return this.sex;
   }

   @JsonProperty("precious")
   public void setPrecious(String[] precious) {
      this.precious = precious;
   }

   @JsonProperty("precious")
   public String[] getPrecious() {
      return this.precious;
   }

   @JsonProperty("mixedBatch")
   public void setMixedBatch(String[] mixedBatch) {
      this.mixedBatch = mixedBatch;
   }

   @JsonProperty("mixedBatch")
   public String[] getMixedBatch() {
      return this.mixedBatch;
   }

   @JsonProperty("reserve1")
   public void setReserve1(String[] reserve1) {
      this.reserve1 = reserve1;
   }

   @JsonProperty("reserve1")
   public String[] getReserve1() {
      return this.reserve1;
   }

   @JsonProperty("reserve2")
   public void setReserve2(String[] reserve2) {
      this.reserve2 = reserve2;
   }

   @JsonProperty("reserve2")
   public String[] getReserve2() {
      return this.reserve2;
   }

   @JsonProperty("reserve3")
   public void setReserve3(String[] reserve3) {
      this.reserve3 = reserve3;
   }

   @JsonProperty("reserve3")
   public String[] getReserve3() {
      return this.reserve3;
   }

   @JsonProperty("reserve4")
   public void setReserve4(String[] reserve4) {
      this.reserve4 = reserve4;
   }

   @JsonProperty("reserve4")
   public String[] getReserve4() {
      return this.reserve4;
   }

   @JsonProperty("reserve5")
   public void setReserve5(String[] reserve5) {
      this.reserve5 = reserve5;
   }

   @JsonProperty("reserve5")
   public String[] getReserve5() {
      return this.reserve5;
   }

   @JsonProperty("reserve6")
   public void setReserve6(String[] reserve6) {
      this.reserve6 = reserve6;
   }

   @JsonProperty("reserve6")
   public String[] getReserve6() {
      return this.reserve6;
   }

   @JsonProperty("reserve7")
   public void setReserve7(String[] reserve7) {
      this.reserve7 = reserve7;
   }

   @JsonProperty("reserve7")
   public String[] getReserve7() {
      return this.reserve7;
   }

   @JsonProperty("reserve8")
   public void setReserve8(String[] reserve8) {
      this.reserve8 = reserve8;
   }

   @JsonProperty("reserve8")
   public String[] getReserve8() {
      return this.reserve8;
   }

   @JsonProperty("reserve9")
   public void setReserve9(String[] reserve9) {
      this.reserve9 = reserve9;
   }

   @JsonProperty("reserve9")
   public String[] getReserve9() {
      return this.reserve9;
   }

   @JsonProperty("reserve10")
   public void setReserve10(String[] reserve10) {
      this.reserve10 = reserve10;
   }

   @JsonProperty("reserve10")
   public String[] getReserve10() {
      return this.reserve10;
   }

   @JsonProperty("airMark")
   public void setAirMark(String[] airMark) {
      this.airMark = airMark;
   }

   @JsonProperty("airMark")
   public String[] getAirMark() {
      return this.airMark;
   }

   @JsonProperty("storeProperty")
   public void setStoreProperty(String[] storeProperty) {
      this.storeProperty = storeProperty;
   }

   @JsonProperty("storeProperty")
   public String[] getStoreProperty() {
      return this.storeProperty;
   }

   @JsonProperty("storeSaleFlag")
   public void setStoreSaleFlag(Byte[] storeSaleFlag) {
      this.storeSaleFlag = storeSaleFlag;
   }

   @JsonProperty("storeSaleFlag")
   public Byte[] getStoreSaleFlag() {
      return this.storeSaleFlag;
   }

   @JsonProperty("keyMaintenance")
   public void setKeyMaintenance(String[] keyMaintenance) {
      this.keyMaintenance = keyMaintenance;
   }

   @JsonProperty("keyMaintenance")
   public String[] getKeyMaintenance() {
      return this.keyMaintenance;
   }

   @JsonProperty("specialDrugs")
   public void setSpecialDrugs(String[] specialDrugs) {
      this.specialDrugs = specialDrugs;
   }

   @JsonProperty("specialDrugs")
   public String[] getSpecialDrugs() {
      return this.specialDrugs;
   }

   @JsonProperty("boxRule")
   public void setBoxRule(String[] boxRule) {
      this.boxRule = boxRule;
   }

   @JsonProperty("boxRule")
   public String[] getBoxRule() {
      return this.boxRule;
   }

   @JsonProperty("warningDay")
   public void setWarningDay(Integer[] warningDay) {
      this.warningDay = warningDay;
   }

   @JsonProperty("warningDay")
   public Integer[] getWarningDay() {
      return this.warningDay;
   }

   @JsonProperty("regularAdventDay")
   public void setRegularAdventDay(Integer[] regularAdventDay) {
      this.regularAdventDay = regularAdventDay;
   }

   @JsonProperty("regularAdventDay")
   public Integer[] getRegularAdventDay() {
      return this.regularAdventDay;
   }

   @JsonProperty("urgentAdventDay")
   public void setUrgentAdventDay(Integer[] urgentAdventDay) {
      this.urgentAdventDay = urgentAdventDay;
   }

   @JsonProperty("urgentAdventDay")
   public Integer[] getUrgentAdventDay() {
      return this.urgentAdventDay;
   }

   @JsonProperty("adventDay")
   public void setAdventDay(Integer[] adventDay) {
      this.adventDay = adventDay;
   }

   @JsonProperty("adventDay")
   public Integer[] getAdventDay() {
      return this.adventDay;
   }

   @JsonProperty("easyPollute")
   public void setEasyPollute(String[] easyPollute) {
      this.easyPollute = easyPollute;
   }

   @JsonProperty("easyPollute")
   public String[] getEasyPollute() {
      return this.easyPollute;
   }

   @JsonProperty("muslim")
   public void setMuslim(String[] muslim) {
      this.muslim = muslim;
   }

   @JsonProperty("muslim")
   public String[] getMuslim() {
      return this.muslim;
   }

   @JsonProperty("allowedDay")
   public void setAllowedDay(Integer[] allowedDay) {
      this.allowedDay = allowedDay;
   }

   @JsonProperty("allowedDay")
   public Integer[] getAllowedDay() {
      return this.allowedDay;
   }

   @JsonProperty("approvalNo")
   public void setApprovalNo(String[] approvalNo) {
      this.approvalNo = approvalNo;
   }

   @JsonProperty("approvalNo")
   public String[] getApprovalNo() {
      return this.approvalNo;
   }

   @JsonProperty("athletesUseCaution")
   public void setAthletesUseCaution(Byte athletesUseCaution) {
      this.athletesUseCaution = athletesUseCaution;
   }

   @JsonProperty("athletesUseCaution")
   public Byte getAthletesUseCaution() {
      return this.athletesUseCaution;
   }

   @JsonProperty("elecSupervisionCodeFlag")
   public void setElecSupervisionCodeFlag(Byte elecSupervisionCodeFlag) {
      this.elecSupervisionCodeFlag = elecSupervisionCodeFlag;
   }

   @JsonProperty("elecSupervisionCodeFlag")
   public Byte getElecSupervisionCodeFlag() {
      return this.elecSupervisionCodeFlag;
   }

   @JsonProperty("caseGrossWeight")
   public void setCaseGrossWeight(BigDecimal[] caseGrossWeight) {
      this.caseGrossWeight = caseGrossWeight;
   }

   @JsonProperty("caseGrossWeight")
   public BigDecimal[] getCaseGrossWeight() {
      return this.caseGrossWeight;
   }

   @JsonProperty("boxRegulations")
   public void setBoxRegulations(BigDecimal[] boxRegulations) {
      this.boxRegulations = boxRegulations;
   }

   @JsonProperty("boxRegulations")
   public BigDecimal[] getBoxRegulations() {
      return this.boxRegulations;
   }

   @JsonProperty("enableFlag")
   public void setEnableFlag(Byte enableFlag) {
      this.enableFlag = enableFlag;
   }

   @JsonProperty("enableFlag")
   public Byte getEnableFlag() {
      return this.enableFlag;
   }

   @JsonProperty("goodsUnit")
   public void setGoodsUnit(String[] goodsUnit) {
      this.goodsUnit = goodsUnit;
   }

   @JsonProperty("goodsUnit")
   public String[] getGoodsUnit() {
      return this.goodsUnit;
   }

   @JsonProperty("uniqueCode")
   public void setUniqueCode(Byte uniqueCode) {
      this.uniqueCode = uniqueCode;
   }

   @JsonProperty("uniqueCode")
   public Byte getUniqueCode() {
      return this.uniqueCode;
   }

   @JsonProperty("clothingAttr")
   public void setClothingAttr(Byte clothingAttr) {
      this.clothingAttr = clothingAttr;
   }

   @JsonProperty("clothingAttr")
   public Byte getClothingAttr() {
      return this.clothingAttr;
   }

   @JsonProperty("clothingStyle")
   public void setClothingStyle(Byte clothingStyle) {
      this.clothingStyle = clothingStyle;
   }

   @JsonProperty("clothingStyle")
   public Byte getClothingStyle() {
      return this.clothingStyle;
   }

   @JsonProperty("clothingVersionType")
   public void setClothingVersionType(Byte clothingVersionType) {
      this.clothingVersionType = clothingVersionType;
   }

   @JsonProperty("clothingVersionType")
   public Byte getClothingVersionType() {
      return this.clothingVersionType;
   }

   @JsonProperty("clothingSilhouette")
   public void setClothingSilhouette(Byte clothingSilhouette) {
      this.clothingSilhouette = clothingSilhouette;
   }

   @JsonProperty("clothingSilhouette")
   public Byte getClothingSilhouette() {
      return this.clothingSilhouette;
   }

   @JsonProperty("clothingThickness")
   public void setClothingThickness(Byte clothingThickness) {
      this.clothingThickness = clothingThickness;
   }

   @JsonProperty("clothingThickness")
   public Byte getClothingThickness() {
      return this.clothingThickness;
   }

   @JsonProperty("clothingWeek")
   public void setClothingWeek(Byte clothingWeek) {
      this.clothingWeek = clothingWeek;
   }

   @JsonProperty("clothingWeek")
   public Byte getClothingWeek() {
      return this.clothingWeek;
   }

   @JsonProperty("bodyParts")
   public void setBodyParts(String bodyParts) {
      this.bodyParts = bodyParts;
   }

   @JsonProperty("bodyParts")
   public String getBodyParts() {
      return this.bodyParts;
   }

   @JsonProperty("styleSex")
   public void setStyleSex(String styleSex) {
      this.styleSex = styleSex;
   }

   @JsonProperty("styleSex")
   public String getStyleSex() {
      return this.styleSex;
   }

   @JsonProperty("listedBand")
   public void setListedBand(String listedBand) {
      this.listedBand = listedBand;
   }

   @JsonProperty("listedBand")
   public String getListedBand() {
      return this.listedBand;
   }

   @JsonProperty("expectListedTime")
   public void setExpectListedTime(String expectListedTime) {
      this.expectListedTime = expectListedTime;
   }

   @JsonProperty("expectListedTime")
   public String getExpectListedTime() {
      return this.expectListedTime;
   }

   @JsonProperty("fabric")
   public void setFabric(String fabric) {
      this.fabric = fabric;
   }

   @JsonProperty("fabric")
   public String getFabric() {
      return this.fabric;
   }

   @JsonProperty("washing")
   public void setWashing(String washing) {
      this.washing = washing;
   }

   @JsonProperty("washing")
   public String getWashing() {
      return this.washing;
   }

   @JsonProperty("year")
   public void setYear(String year) {
      this.year = year;
   }

   @JsonProperty("year")
   public String getYear() {
      return this.year;
   }

   @JsonProperty("productSeason")
   public void setProductSeason(String productSeason) {
      this.productSeason = productSeason;
   }

   @JsonProperty("productSeason")
   public String getProductSeason() {
      return this.productSeason;
   }

   @JsonProperty("afterSaleFlag")
   public void setAfterSaleFlag(String afterSaleFlag) {
      this.afterSaleFlag = afterSaleFlag;
   }

   @JsonProperty("afterSaleFlag")
   public String getAfterSaleFlag() {
      return this.afterSaleFlag;
   }

   @JsonProperty("transportTemperature")
   public void setTransportTemperature(String transportTemperature) {
      this.transportTemperature = transportTemperature;
   }

   @JsonProperty("transportTemperature")
   public String getTransportTemperature() {
      return this.transportTemperature;
   }

   @JsonProperty("boxUniqueCode")
   public void setBoxUniqueCode(Byte boxUniqueCode) {
      this.boxUniqueCode = boxUniqueCode;
   }

   @JsonProperty("boxUniqueCode")
   public Byte getBoxUniqueCode() {
      return this.boxUniqueCode;
   }

   @JsonProperty("auxiliary")
   public void setAuxiliary(Byte auxiliary) {
      this.auxiliary = auxiliary;
   }

   @JsonProperty("auxiliary")
   public Byte getAuxiliary() {
      return this.auxiliary;
   }

   @JsonProperty("minSaleQuantity")
   public void setMinSaleQuantity(Integer minSaleQuantity) {
      this.minSaleQuantity = minSaleQuantity;
   }

   @JsonProperty("minSaleQuantity")
   public Integer getMinSaleQuantity() {
      return this.minSaleQuantity;
   }

   @JsonProperty("minPackageQuantity")
   public void setMinPackageQuantity(Integer minPackageQuantity) {
      this.minPackageQuantity = minPackageQuantity;
   }

   @JsonProperty("minPackageQuantity")
   public Integer getMinPackageQuantity() {
      return this.minPackageQuantity;
   }

   @JsonProperty("packageInstruction")
   public void setPackageInstruction(String packageInstruction) {
      this.packageInstruction = packageInstruction;
   }

   @JsonProperty("packageInstruction")
   public String getPackageInstruction() {
      return this.packageInstruction;
   }

   @JsonProperty("texture")
   public void setTexture(String texture) {
      this.texture = texture;
   }

   @JsonProperty("texture")
   public String getTexture() {
      return this.texture;
   }

   @JsonProperty("substrate")
   public void setSubstrate(String substrate) {
      this.substrate = substrate;
   }

   @JsonProperty("substrate")
   public String getSubstrate() {
      return this.substrate;
   }

   @JsonProperty("executiveStandard")
   public void setExecutiveStandard(String executiveStandard) {
      this.executiveStandard = executiveStandard;
   }

   @JsonProperty("executiveStandard")
   public String getExecutiveStandard() {
      return this.executiveStandard;
   }

   @JsonProperty("processTechnology")
   public void setProcessTechnology(String processTechnology) {
      this.processTechnology = processTechnology;
   }

   @JsonProperty("processTechnology")
   public String getProcessTechnology() {
      return this.processTechnology;
   }

   @JsonProperty("allSerial")
   public void setAllSerial(String allSerial) {
      this.allSerial = allSerial;
   }

   @JsonProperty("allSerial")
   public String getAllSerial() {
      return this.allSerial;
   }

   @JsonProperty("renewPackage")
   public void setRenewPackage(String renewPackage) {
      this.renewPackage = renewPackage;
   }

   @JsonProperty("renewPackage")
   public String getRenewPackage() {
      return this.renewPackage;
   }

   @JsonProperty("warehouseInsured")
   public void setWarehouseInsured(Byte warehouseInsured) {
      this.warehouseInsured = warehouseInsured;
   }

   @JsonProperty("warehouseInsured")
   public Byte getWarehouseInsured() {
      return this.warehouseInsured;
   }

   @JsonProperty("transportInsured")
   public void setTransportInsured(Byte transportInsured) {
      this.transportInsured = transportInsured;
   }

   @JsonProperty("transportInsured")
   public Byte getTransportInsured() {
      return this.transportInsured;
   }

   @JsonProperty("isBillingSplit")
   public void setIsBillingSplit(Byte isBillingSplit) {
      this.isBillingSplit = isBillingSplit;
   }

   @JsonProperty("isBillingSplit")
   public Byte getIsBillingSplit() {
      return this.isBillingSplit;
   }

   @JsonProperty("source")
   public void setSource(Integer source) {
      this.source = source;
   }

   @JsonProperty("source")
   public Integer getSource() {
      return this.source;
   }

   @JsonProperty("medicineCategoryCode")
   public void setMedicineCategoryCode(Integer medicineCategoryCode) {
      this.medicineCategoryCode = medicineCategoryCode;
   }

   @JsonProperty("medicineCategoryCode")
   public Integer getMedicineCategoryCode() {
      return this.medicineCategoryCode;
   }
}
