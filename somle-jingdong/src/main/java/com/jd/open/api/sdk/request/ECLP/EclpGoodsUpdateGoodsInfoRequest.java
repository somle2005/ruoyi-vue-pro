package com.jd.open.api.sdk.request.ECLP;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ECLP.EclpGoodsUpdateGoodsInfoResponse;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Map;
import java.util.TreeMap;

public class EclpGoodsUpdateGoodsInfoRequest extends AbstractRequest implements JdRequest<EclpGoodsUpdateGoodsInfoResponse> {
   private String goodsNo;
   private String spGoodsNo;
   private String barcodes;
   private String abbreviation;
   private String brandNo;
   private String brandName;
   private String manufacturer;
   private String produceAddress;
   private String standard;
   private String color;
   private String size;
   private String sizeDefinition;
   private Double grossWeight;
   private Double netWeight;
   private Integer length;
   private Integer width;
   private Integer height;
   private String batch;
   private String cheapGift;
   private String quality;
   private String expensive;
   private String luxury;
   private String breakable;
   private String liquid;
   private String consumables;
   private String abnormal;
   private String imported;
   private String health;
   private String temperature;
   private String temperatureCeil;
   private String temperatureFloor;
   private String humidity;
   private String humidityCeil;
   private String humidityFloor;
   private String movable;
   private String service3g;
   private String sample;
   private String odor;
   private String sex;
   private String precious;
   private String mixedBatch;
   private String reserve1;
   private String reserve2;
   private String reserve3;
   private String reserve4;
   private String reserve5;
   private String reserve6;
   private String reserve7;
   private String reserve8;
   private String reserve9;
   private String reserve10;
   private String fashionNo;
   private String goodsMess;
   private String isvGoodsNo;
   private String deptNo;
   private Byte signType;
   private String overseaPurchase;
   private String qiRecord;
   private String customRecord;
   private String pattern;
   private String ccProvider;
   private String bondedArea;
   private String sellerRecord;
   private String batAttrIds;
   private String needJDRecord;
   private String modelNumber;
   private String spe;
   private Integer vatRate;
   private Integer taxRate;
   private String taxNumberPost;
   private String postRate;
   private String hsCode;
   private String country;
   private String qiCountry;
   private String flag;
   private String legalUnit1;
   private String legalAmount1;
   private String legalUnit2;
   private String legalAmount2;
   private String measurement;
   private String qiMeasurement;
   private String delivery;
   private String storeProperty;
   private String productCategory;
   private String category;
   private String approvalNo;
   private String storage;
   private String form;
   private String type;
   private String specification;
   private String genericName;
   private String dosage;
   private String useMethods;
   private String packingUnit;
   private String efficacy;
   private String manufactory;
   private BigDecimal price;
   private Byte storeSaleFlag;
   private String keyMaintenance;
   private String specialDrugs;
   private String marketingAuthorizationHolder;
   private Byte boxRule;
   private Integer warningDay;
   private Integer regularAdventDay;
   private Integer urgentAdventDay;
   private Integer adventDay;
   private String easyPollute;
   private String muslim;
   private BigDecimal boxRegulations;
   private Integer allowedDay;
   private String sellerFirstCategory;
   private String sellerSecondCategory;
   private String sellerThirdCategory;
   private String sellerFirstCategoryNo;
   private String sellerSecondCategoryNo;
   private String sellerThirdCategoryNo;
   private Byte athletesUseCaution;
   private Byte elecSupervisionCodeFlag;
   private String hgsbys;
   private String goodsUnit;
   private Byte uniqueCode;
   private String productLine;
   private String isStandardInstrument;
   private String isColdChain;
   private String isDetachablePackage;
   private String certificateNo;
   private String businessTypeName;
   private String ownerTypeName;
   private String packageTypeName;
   private String materialTypeName;
   private String model;
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
   private String productionLicenseNo;
   private String transportTemperature;
   private Byte boxUniqueCode;
   private Byte auxiliary;
   private String goodsNameEn;
   private Integer minSaleQuantity;
   private Integer minPackageQuantity;
   private String packageInstruction;
   private String texture;
   private String substrate;
   private String executiveStandard;
   private String processTechnology;
   private String allSerial;
   private String isRcvDate;
   private String renewPackage;
   private String imgUrls;
   private Byte warehouseInsured;
   private Byte transportInsured;
   private Byte isBillingSplit;
   private Integer source;
   private Integer medicineCategoryCode;
   private String warehouseTransfer;

   public void setGoodsNo(String goodsNo) {
      this.goodsNo = goodsNo;
   }

   public String getGoodsNo() {
      return this.goodsNo;
   }

   public void setSpGoodsNo(String spGoodsNo) {
      this.spGoodsNo = spGoodsNo;
   }

   public String getSpGoodsNo() {
      return this.spGoodsNo;
   }

   public void setBarcodes(String barcodes) {
      this.barcodes = barcodes;
   }

   public String getBarcodes() {
      return this.barcodes;
   }

   public void setAbbreviation(String abbreviation) {
      this.abbreviation = abbreviation;
   }

   public String getAbbreviation() {
      return this.abbreviation;
   }

   public void setBrandNo(String brandNo) {
      this.brandNo = brandNo;
   }

   public String getBrandNo() {
      return this.brandNo;
   }

   public void setBrandName(String brandName) {
      this.brandName = brandName;
   }

   public String getBrandName() {
      return this.brandName;
   }

   public void setManufacturer(String manufacturer) {
      this.manufacturer = manufacturer;
   }

   public String getManufacturer() {
      return this.manufacturer;
   }

   public void setProduceAddress(String produceAddress) {
      this.produceAddress = produceAddress;
   }

   public String getProduceAddress() {
      return this.produceAddress;
   }

   public void setStandard(String standard) {
      this.standard = standard;
   }

   public String getStandard() {
      return this.standard;
   }

   public void setColor(String color) {
      this.color = color;
   }

   public String getColor() {
      return this.color;
   }

   public void setSize(String size) {
      this.size = size;
   }

   public String getSize() {
      return this.size;
   }

   public void setSizeDefinition(String sizeDefinition) {
      this.sizeDefinition = sizeDefinition;
   }

   public String getSizeDefinition() {
      return this.sizeDefinition;
   }

   public void setGrossWeight(Double grossWeight) {
      this.grossWeight = grossWeight;
   }

   public Double getGrossWeight() {
      return this.grossWeight;
   }

   public void setNetWeight(Double netWeight) {
      this.netWeight = netWeight;
   }

   public Double getNetWeight() {
      return this.netWeight;
   }

   public void setLength(Integer length) {
      this.length = length;
   }

   public Integer getLength() {
      return this.length;
   }

   public void setWidth(Integer width) {
      this.width = width;
   }

   public Integer getWidth() {
      return this.width;
   }

   public void setHeight(Integer height) {
      this.height = height;
   }

   public Integer getHeight() {
      return this.height;
   }

   public void setBatch(String batch) {
      this.batch = batch;
   }

   public String getBatch() {
      return this.batch;
   }

   public void setCheapGift(String cheapGift) {
      this.cheapGift = cheapGift;
   }

   public String getCheapGift() {
      return this.cheapGift;
   }

   public void setQuality(String quality) {
      this.quality = quality;
   }

   public String getQuality() {
      return this.quality;
   }

   public void setExpensive(String expensive) {
      this.expensive = expensive;
   }

   public String getExpensive() {
      return this.expensive;
   }

   public void setLuxury(String luxury) {
      this.luxury = luxury;
   }

   public String getLuxury() {
      return this.luxury;
   }

   public void setBreakable(String breakable) {
      this.breakable = breakable;
   }

   public String getBreakable() {
      return this.breakable;
   }

   public void setLiquid(String liquid) {
      this.liquid = liquid;
   }

   public String getLiquid() {
      return this.liquid;
   }

   public void setConsumables(String consumables) {
      this.consumables = consumables;
   }

   public String getConsumables() {
      return this.consumables;
   }

   public void setAbnormal(String abnormal) {
      this.abnormal = abnormal;
   }

   public String getAbnormal() {
      return this.abnormal;
   }

   public void setImported(String imported) {
      this.imported = imported;
   }

   public String getImported() {
      return this.imported;
   }

   public void setHealth(String health) {
      this.health = health;
   }

   public String getHealth() {
      return this.health;
   }

   public void setTemperature(String temperature) {
      this.temperature = temperature;
   }

   public String getTemperature() {
      return this.temperature;
   }

   public void setTemperatureCeil(String temperatureCeil) {
      this.temperatureCeil = temperatureCeil;
   }

   public String getTemperatureCeil() {
      return this.temperatureCeil;
   }

   public void setTemperatureFloor(String temperatureFloor) {
      this.temperatureFloor = temperatureFloor;
   }

   public String getTemperatureFloor() {
      return this.temperatureFloor;
   }

   public void setHumidity(String humidity) {
      this.humidity = humidity;
   }

   public String getHumidity() {
      return this.humidity;
   }

   public void setHumidityCeil(String humidityCeil) {
      this.humidityCeil = humidityCeil;
   }

   public String getHumidityCeil() {
      return this.humidityCeil;
   }

   public void setHumidityFloor(String humidityFloor) {
      this.humidityFloor = humidityFloor;
   }

   public String getHumidityFloor() {
      return this.humidityFloor;
   }

   public void setMovable(String movable) {
      this.movable = movable;
   }

   public String getMovable() {
      return this.movable;
   }

   public void setService3g(String service3g) {
      this.service3g = service3g;
   }

   public String getService3g() {
      return this.service3g;
   }

   public void setSample(String sample) {
      this.sample = sample;
   }

   public String getSample() {
      return this.sample;
   }

   public void setOdor(String odor) {
      this.odor = odor;
   }

   public String getOdor() {
      return this.odor;
   }

   public void setSex(String sex) {
      this.sex = sex;
   }

   public String getSex() {
      return this.sex;
   }

   public void setPrecious(String precious) {
      this.precious = precious;
   }

   public String getPrecious() {
      return this.precious;
   }

   public void setMixedBatch(String mixedBatch) {
      this.mixedBatch = mixedBatch;
   }

   public String getMixedBatch() {
      return this.mixedBatch;
   }

   public void setReserve1(String reserve1) {
      this.reserve1 = reserve1;
   }

   public String getReserve1() {
      return this.reserve1;
   }

   public void setReserve2(String reserve2) {
      this.reserve2 = reserve2;
   }

   public String getReserve2() {
      return this.reserve2;
   }

   public void setReserve3(String reserve3) {
      this.reserve3 = reserve3;
   }

   public String getReserve3() {
      return this.reserve3;
   }

   public void setReserve4(String reserve4) {
      this.reserve4 = reserve4;
   }

   public String getReserve4() {
      return this.reserve4;
   }

   public void setReserve5(String reserve5) {
      this.reserve5 = reserve5;
   }

   public String getReserve5() {
      return this.reserve5;
   }

   public void setReserve6(String reserve6) {
      this.reserve6 = reserve6;
   }

   public String getReserve6() {
      return this.reserve6;
   }

   public void setReserve7(String reserve7) {
      this.reserve7 = reserve7;
   }

   public String getReserve7() {
      return this.reserve7;
   }

   public void setReserve8(String reserve8) {
      this.reserve8 = reserve8;
   }

   public String getReserve8() {
      return this.reserve8;
   }

   public void setReserve9(String reserve9) {
      this.reserve9 = reserve9;
   }

   public String getReserve9() {
      return this.reserve9;
   }

   public void setReserve10(String reserve10) {
      this.reserve10 = reserve10;
   }

   public String getReserve10() {
      return this.reserve10;
   }

   public void setFashionNo(String fashionNo) {
      this.fashionNo = fashionNo;
   }

   public String getFashionNo() {
      return this.fashionNo;
   }

   public void setGoodsMess(String goodsMess) {
      this.goodsMess = goodsMess;
   }

   public String getGoodsMess() {
      return this.goodsMess;
   }

   public void setIsvGoodsNo(String isvGoodsNo) {
      this.isvGoodsNo = isvGoodsNo;
   }

   public String getIsvGoodsNo() {
      return this.isvGoodsNo;
   }

   public void setDeptNo(String deptNo) {
      this.deptNo = deptNo;
   }

   public String getDeptNo() {
      return this.deptNo;
   }

   public void setSignType(Byte signType) {
      this.signType = signType;
   }

   public Byte getSignType() {
      return this.signType;
   }

   public void setOverseaPurchase(String overseaPurchase) {
      this.overseaPurchase = overseaPurchase;
   }

   public String getOverseaPurchase() {
      return this.overseaPurchase;
   }

   public void setQiRecord(String qiRecord) {
      this.qiRecord = qiRecord;
   }

   public String getQiRecord() {
      return this.qiRecord;
   }

   public void setCustomRecord(String customRecord) {
      this.customRecord = customRecord;
   }

   public String getCustomRecord() {
      return this.customRecord;
   }

   public void setPattern(String pattern) {
      this.pattern = pattern;
   }

   public String getPattern() {
      return this.pattern;
   }

   public void setCcProvider(String ccProvider) {
      this.ccProvider = ccProvider;
   }

   public String getCcProvider() {
      return this.ccProvider;
   }

   public void setBondedArea(String bondedArea) {
      this.bondedArea = bondedArea;
   }

   public String getBondedArea() {
      return this.bondedArea;
   }

   public void setSellerRecord(String sellerRecord) {
      this.sellerRecord = sellerRecord;
   }

   public String getSellerRecord() {
      return this.sellerRecord;
   }

   public void setBatAttrIds(String batAttrIds) {
      this.batAttrIds = batAttrIds;
   }

   public String getBatAttrIds() {
      return this.batAttrIds;
   }

   public void setNeedJDRecord(String needJDRecord) {
      this.needJDRecord = needJDRecord;
   }

   public String getNeedJDRecord() {
      return this.needJDRecord;
   }

   public void setModelNumber(String modelNumber) {
      this.modelNumber = modelNumber;
   }

   public String getModelNumber() {
      return this.modelNumber;
   }

   public void setSpe(String spe) {
      this.spe = spe;
   }

   public String getSpe() {
      return this.spe;
   }

   public void setVatRate(Integer vatRate) {
      this.vatRate = vatRate;
   }

   public Integer getVatRate() {
      return this.vatRate;
   }

   public void setTaxRate(Integer taxRate) {
      this.taxRate = taxRate;
   }

   public Integer getTaxRate() {
      return this.taxRate;
   }

   public void setTaxNumberPost(String taxNumberPost) {
      this.taxNumberPost = taxNumberPost;
   }

   public String getTaxNumberPost() {
      return this.taxNumberPost;
   }

   public void setPostRate(String postRate) {
      this.postRate = postRate;
   }

   public String getPostRate() {
      return this.postRate;
   }

   public void setHsCode(String hsCode) {
      this.hsCode = hsCode;
   }

   public String getHsCode() {
      return this.hsCode;
   }

   public void setCountry(String country) {
      this.country = country;
   }

   public String getCountry() {
      return this.country;
   }

   public void setQiCountry(String qiCountry) {
      this.qiCountry = qiCountry;
   }

   public String getQiCountry() {
      return this.qiCountry;
   }

   public void setFlag(String flag) {
      this.flag = flag;
   }

   public String getFlag() {
      return this.flag;
   }

   public void setLegalUnit1(String legalUnit1) {
      this.legalUnit1 = legalUnit1;
   }

   public String getLegalUnit1() {
      return this.legalUnit1;
   }

   public void setLegalAmount1(String legalAmount1) {
      this.legalAmount1 = legalAmount1;
   }

   public String getLegalAmount1() {
      return this.legalAmount1;
   }

   public void setLegalUnit2(String legalUnit2) {
      this.legalUnit2 = legalUnit2;
   }

   public String getLegalUnit2() {
      return this.legalUnit2;
   }

   public void setLegalAmount2(String legalAmount2) {
      this.legalAmount2 = legalAmount2;
   }

   public String getLegalAmount2() {
      return this.legalAmount2;
   }

   public void setMeasurement(String measurement) {
      this.measurement = measurement;
   }

   public String getMeasurement() {
      return this.measurement;
   }

   public void setQiMeasurement(String qiMeasurement) {
      this.qiMeasurement = qiMeasurement;
   }

   public String getQiMeasurement() {
      return this.qiMeasurement;
   }

   public void setDelivery(String delivery) {
      this.delivery = delivery;
   }

   public String getDelivery() {
      return this.delivery;
   }

   public void setStoreProperty(String storeProperty) {
      this.storeProperty = storeProperty;
   }

   public String getStoreProperty() {
      return this.storeProperty;
   }

   public void setProductCategory(String productCategory) {
      this.productCategory = productCategory;
   }

   public String getProductCategory() {
      return this.productCategory;
   }

   public void setCategory(String category) {
      this.category = category;
   }

   public String getCategory() {
      return this.category;
   }

   public void setApprovalNo(String approvalNo) {
      this.approvalNo = approvalNo;
   }

   public String getApprovalNo() {
      return this.approvalNo;
   }

   public void setStorage(String storage) {
      this.storage = storage;
   }

   public String getStorage() {
      return this.storage;
   }

   public void setForm(String form) {
      this.form = form;
   }

   public String getForm() {
      return this.form;
   }

   public void setType(String type) {
      this.type = type;
   }

   public String getType() {
      return this.type;
   }

   public void setSpecification(String specification) {
      this.specification = specification;
   }

   public String getSpecification() {
      return this.specification;
   }

   public void setGenericName(String genericName) {
      this.genericName = genericName;
   }

   public String getGenericName() {
      return this.genericName;
   }

   public void setDosage(String dosage) {
      this.dosage = dosage;
   }

   public String getDosage() {
      return this.dosage;
   }

   public void setUseMethods(String useMethods) {
      this.useMethods = useMethods;
   }

   public String getUseMethods() {
      return this.useMethods;
   }

   public void setPackingUnit(String packingUnit) {
      this.packingUnit = packingUnit;
   }

   public String getPackingUnit() {
      return this.packingUnit;
   }

   public void setEfficacy(String efficacy) {
      this.efficacy = efficacy;
   }

   public String getEfficacy() {
      return this.efficacy;
   }

   public void setManufactory(String manufactory) {
      this.manufactory = manufactory;
   }

   public String getManufactory() {
      return this.manufactory;
   }

   public void setPrice(BigDecimal price) {
      this.price = price;
   }

   public BigDecimal getPrice() {
      return this.price;
   }

   public void setStoreSaleFlag(Byte storeSaleFlag) {
      this.storeSaleFlag = storeSaleFlag;
   }

   public Byte getStoreSaleFlag() {
      return this.storeSaleFlag;
   }

   public void setKeyMaintenance(String keyMaintenance) {
      this.keyMaintenance = keyMaintenance;
   }

   public String getKeyMaintenance() {
      return this.keyMaintenance;
   }

   public void setSpecialDrugs(String specialDrugs) {
      this.specialDrugs = specialDrugs;
   }

   public String getSpecialDrugs() {
      return this.specialDrugs;
   }

   public void setMarketingAuthorizationHolder(String marketingAuthorizationHolder) {
      this.marketingAuthorizationHolder = marketingAuthorizationHolder;
   }

   public String getMarketingAuthorizationHolder() {
      return this.marketingAuthorizationHolder;
   }

   public void setBoxRule(Byte boxRule) {
      this.boxRule = boxRule;
   }

   public Byte getBoxRule() {
      return this.boxRule;
   }

   public void setWarningDay(Integer warningDay) {
      this.warningDay = warningDay;
   }

   public Integer getWarningDay() {
      return this.warningDay;
   }

   public void setRegularAdventDay(Integer regularAdventDay) {
      this.regularAdventDay = regularAdventDay;
   }

   public Integer getRegularAdventDay() {
      return this.regularAdventDay;
   }

   public void setUrgentAdventDay(Integer urgentAdventDay) {
      this.urgentAdventDay = urgentAdventDay;
   }

   public Integer getUrgentAdventDay() {
      return this.urgentAdventDay;
   }

   public void setAdventDay(Integer adventDay) {
      this.adventDay = adventDay;
   }

   public Integer getAdventDay() {
      return this.adventDay;
   }

   public void setEasyPollute(String easyPollute) {
      this.easyPollute = easyPollute;
   }

   public String getEasyPollute() {
      return this.easyPollute;
   }

   public void setMuslim(String muslim) {
      this.muslim = muslim;
   }

   public String getMuslim() {
      return this.muslim;
   }

   public void setBoxRegulations(BigDecimal boxRegulations) {
      this.boxRegulations = boxRegulations;
   }

   public BigDecimal getBoxRegulations() {
      return this.boxRegulations;
   }

   public void setAllowedDay(Integer allowedDay) {
      this.allowedDay = allowedDay;
   }

   public Integer getAllowedDay() {
      return this.allowedDay;
   }

   public void setSellerFirstCategory(String sellerFirstCategory) {
      this.sellerFirstCategory = sellerFirstCategory;
   }

   public String getSellerFirstCategory() {
      return this.sellerFirstCategory;
   }

   public void setSellerSecondCategory(String sellerSecondCategory) {
      this.sellerSecondCategory = sellerSecondCategory;
   }

   public String getSellerSecondCategory() {
      return this.sellerSecondCategory;
   }

   public void setSellerThirdCategory(String sellerThirdCategory) {
      this.sellerThirdCategory = sellerThirdCategory;
   }

   public String getSellerThirdCategory() {
      return this.sellerThirdCategory;
   }

   public void setSellerFirstCategoryNo(String sellerFirstCategoryNo) {
      this.sellerFirstCategoryNo = sellerFirstCategoryNo;
   }

   public String getSellerFirstCategoryNo() {
      return this.sellerFirstCategoryNo;
   }

   public void setSellerSecondCategoryNo(String sellerSecondCategoryNo) {
      this.sellerSecondCategoryNo = sellerSecondCategoryNo;
   }

   public String getSellerSecondCategoryNo() {
      return this.sellerSecondCategoryNo;
   }

   public void setSellerThirdCategoryNo(String sellerThirdCategoryNo) {
      this.sellerThirdCategoryNo = sellerThirdCategoryNo;
   }

   public String getSellerThirdCategoryNo() {
      return this.sellerThirdCategoryNo;
   }

   public void setAthletesUseCaution(Byte athletesUseCaution) {
      this.athletesUseCaution = athletesUseCaution;
   }

   public Byte getAthletesUseCaution() {
      return this.athletesUseCaution;
   }

   public void setElecSupervisionCodeFlag(Byte elecSupervisionCodeFlag) {
      this.elecSupervisionCodeFlag = elecSupervisionCodeFlag;
   }

   public Byte getElecSupervisionCodeFlag() {
      return this.elecSupervisionCodeFlag;
   }

   public void setHgsbys(String hgsbys) {
      this.hgsbys = hgsbys;
   }

   public String getHgsbys() {
      return this.hgsbys;
   }

   public void setGoodsUnit(String goodsUnit) {
      this.goodsUnit = goodsUnit;
   }

   public String getGoodsUnit() {
      return this.goodsUnit;
   }

   public void setUniqueCode(Byte uniqueCode) {
      this.uniqueCode = uniqueCode;
   }

   public Byte getUniqueCode() {
      return this.uniqueCode;
   }

   public void setProductLine(String productLine) {
      this.productLine = productLine;
   }

   public String getProductLine() {
      return this.productLine;
   }

   public void setIsStandardInstrument(String isStandardInstrument) {
      this.isStandardInstrument = isStandardInstrument;
   }

   public String getIsStandardInstrument() {
      return this.isStandardInstrument;
   }

   public void setIsColdChain(String isColdChain) {
      this.isColdChain = isColdChain;
   }

   public String getIsColdChain() {
      return this.isColdChain;
   }

   public void setIsDetachablePackage(String isDetachablePackage) {
      this.isDetachablePackage = isDetachablePackage;
   }

   public String getIsDetachablePackage() {
      return this.isDetachablePackage;
   }

   public void setCertificateNo(String certificateNo) {
      this.certificateNo = certificateNo;
   }

   public String getCertificateNo() {
      return this.certificateNo;
   }

   public void setBusinessTypeName(String businessTypeName) {
      this.businessTypeName = businessTypeName;
   }

   public String getBusinessTypeName() {
      return this.businessTypeName;
   }

   public void setOwnerTypeName(String ownerTypeName) {
      this.ownerTypeName = ownerTypeName;
   }

   public String getOwnerTypeName() {
      return this.ownerTypeName;
   }

   public void setPackageTypeName(String packageTypeName) {
      this.packageTypeName = packageTypeName;
   }

   public String getPackageTypeName() {
      return this.packageTypeName;
   }

   public void setMaterialTypeName(String materialTypeName) {
      this.materialTypeName = materialTypeName;
   }

   public String getMaterialTypeName() {
      return this.materialTypeName;
   }

   public void setModel(String model) {
      this.model = model;
   }

   public String getModel() {
      return this.model;
   }

   public void setClothingAttr(Byte clothingAttr) {
      this.clothingAttr = clothingAttr;
   }

   public Byte getClothingAttr() {
      return this.clothingAttr;
   }

   public void setClothingStyle(Byte clothingStyle) {
      this.clothingStyle = clothingStyle;
   }

   public Byte getClothingStyle() {
      return this.clothingStyle;
   }

   public void setClothingVersionType(Byte clothingVersionType) {
      this.clothingVersionType = clothingVersionType;
   }

   public Byte getClothingVersionType() {
      return this.clothingVersionType;
   }

   public void setClothingSilhouette(Byte clothingSilhouette) {
      this.clothingSilhouette = clothingSilhouette;
   }

   public Byte getClothingSilhouette() {
      return this.clothingSilhouette;
   }

   public void setClothingThickness(Byte clothingThickness) {
      this.clothingThickness = clothingThickness;
   }

   public Byte getClothingThickness() {
      return this.clothingThickness;
   }

   public void setClothingWeek(Byte clothingWeek) {
      this.clothingWeek = clothingWeek;
   }

   public Byte getClothingWeek() {
      return this.clothingWeek;
   }

   public void setBodyParts(String bodyParts) {
      this.bodyParts = bodyParts;
   }

   public String getBodyParts() {
      return this.bodyParts;
   }

   public void setStyleSex(String styleSex) {
      this.styleSex = styleSex;
   }

   public String getStyleSex() {
      return this.styleSex;
   }

   public void setListedBand(String listedBand) {
      this.listedBand = listedBand;
   }

   public String getListedBand() {
      return this.listedBand;
   }

   public void setExpectListedTime(String expectListedTime) {
      this.expectListedTime = expectListedTime;
   }

   public String getExpectListedTime() {
      return this.expectListedTime;
   }

   public void setFabric(String fabric) {
      this.fabric = fabric;
   }

   public String getFabric() {
      return this.fabric;
   }

   public void setWashing(String washing) {
      this.washing = washing;
   }

   public String getWashing() {
      return this.washing;
   }

   public void setYear(String year) {
      this.year = year;
   }

   public String getYear() {
      return this.year;
   }

   public void setProductSeason(String productSeason) {
      this.productSeason = productSeason;
   }

   public String getProductSeason() {
      return this.productSeason;
   }

   public void setAfterSaleFlag(String afterSaleFlag) {
      this.afterSaleFlag = afterSaleFlag;
   }

   public String getAfterSaleFlag() {
      return this.afterSaleFlag;
   }

   public void setProductionLicenseNo(String productionLicenseNo) {
      this.productionLicenseNo = productionLicenseNo;
   }

   public String getProductionLicenseNo() {
      return this.productionLicenseNo;
   }

   public void setTransportTemperature(String transportTemperature) {
      this.transportTemperature = transportTemperature;
   }

   public String getTransportTemperature() {
      return this.transportTemperature;
   }

   public void setBoxUniqueCode(Byte boxUniqueCode) {
      this.boxUniqueCode = boxUniqueCode;
   }

   public Byte getBoxUniqueCode() {
      return this.boxUniqueCode;
   }

   public void setAuxiliary(Byte auxiliary) {
      this.auxiliary = auxiliary;
   }

   public Byte getAuxiliary() {
      return this.auxiliary;
   }

   public void setGoodsNameEn(String goodsNameEn) {
      this.goodsNameEn = goodsNameEn;
   }

   public String getGoodsNameEn() {
      return this.goodsNameEn;
   }

   public void setMinSaleQuantity(Integer minSaleQuantity) {
      this.minSaleQuantity = minSaleQuantity;
   }

   public Integer getMinSaleQuantity() {
      return this.minSaleQuantity;
   }

   public void setMinPackageQuantity(Integer minPackageQuantity) {
      this.minPackageQuantity = minPackageQuantity;
   }

   public Integer getMinPackageQuantity() {
      return this.minPackageQuantity;
   }

   public void setPackageInstruction(String packageInstruction) {
      this.packageInstruction = packageInstruction;
   }

   public String getPackageInstruction() {
      return this.packageInstruction;
   }

   public void setTexture(String texture) {
      this.texture = texture;
   }

   public String getTexture() {
      return this.texture;
   }

   public void setSubstrate(String substrate) {
      this.substrate = substrate;
   }

   public String getSubstrate() {
      return this.substrate;
   }

   public void setExecutiveStandard(String executiveStandard) {
      this.executiveStandard = executiveStandard;
   }

   public String getExecutiveStandard() {
      return this.executiveStandard;
   }

   public void setProcessTechnology(String processTechnology) {
      this.processTechnology = processTechnology;
   }

   public String getProcessTechnology() {
      return this.processTechnology;
   }

   public void setAllSerial(String allSerial) {
      this.allSerial = allSerial;
   }

   public String getAllSerial() {
      return this.allSerial;
   }

   public void setIsRcvDate(String isRcvDate) {
      this.isRcvDate = isRcvDate;
   }

   public String getIsRcvDate() {
      return this.isRcvDate;
   }

   public void setRenewPackage(String renewPackage) {
      this.renewPackage = renewPackage;
   }

   public String getRenewPackage() {
      return this.renewPackage;
   }

   public void setImgUrls(String imgUrls) {
      this.imgUrls = imgUrls;
   }

   public String getImgUrls() {
      return this.imgUrls;
   }

   public void setWarehouseInsured(Byte warehouseInsured) {
      this.warehouseInsured = warehouseInsured;
   }

   public Byte getWarehouseInsured() {
      return this.warehouseInsured;
   }

   public void setTransportInsured(Byte transportInsured) {
      this.transportInsured = transportInsured;
   }

   public Byte getTransportInsured() {
      return this.transportInsured;
   }

   public void setIsBillingSplit(Byte isBillingSplit) {
      this.isBillingSplit = isBillingSplit;
   }

   public Byte getIsBillingSplit() {
      return this.isBillingSplit;
   }

   public void setSource(Integer source) {
      this.source = source;
   }

   public Integer getSource() {
      return this.source;
   }

   public void setMedicineCategoryCode(Integer medicineCategoryCode) {
      this.medicineCategoryCode = medicineCategoryCode;
   }

   public Integer getMedicineCategoryCode() {
      return this.medicineCategoryCode;
   }

   public void setWarehouseTransfer(String warehouseTransfer) {
      this.warehouseTransfer = warehouseTransfer;
   }

   public String getWarehouseTransfer() {
      return this.warehouseTransfer;
   }

   public String getApiMethod() {
      return "jingdong.eclp.goods.updateGoodsInfo";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("goodsNo", this.goodsNo);
      pmap.put("spGoodsNo", this.spGoodsNo);
      pmap.put("barcodes", this.barcodes);
      pmap.put("abbreviation", this.abbreviation);
      pmap.put("brandNo", this.brandNo);
      pmap.put("brandName", this.brandName);
      pmap.put("manufacturer", this.manufacturer);
      pmap.put("produceAddress", this.produceAddress);
      pmap.put("standard", this.standard);
      pmap.put("color", this.color);
      pmap.put("size", this.size);
      pmap.put("sizeDefinition", this.sizeDefinition);
      pmap.put("grossWeight", this.grossWeight);
      pmap.put("netWeight", this.netWeight);
      pmap.put("length", this.length);
      pmap.put("width", this.width);
      pmap.put("height", this.height);
      pmap.put("batch", this.batch);
      pmap.put("cheapGift", this.cheapGift);
      pmap.put("quality", this.quality);
      pmap.put("expensive", this.expensive);
      pmap.put("luxury", this.luxury);
      pmap.put("breakable", this.breakable);
      pmap.put("liquid", this.liquid);
      pmap.put("consumables", this.consumables);
      pmap.put("abnormal", this.abnormal);
      pmap.put("imported", this.imported);
      pmap.put("health", this.health);
      pmap.put("temperature", this.temperature);
      pmap.put("temperatureCeil", this.temperatureCeil);
      pmap.put("temperatureFloor", this.temperatureFloor);
      pmap.put("humidity", this.humidity);
      pmap.put("humidityCeil", this.humidityCeil);
      pmap.put("humidityFloor", this.humidityFloor);
      pmap.put("movable", this.movable);
      pmap.put("service3g", this.service3g);
      pmap.put("sample", this.sample);
      pmap.put("odor", this.odor);
      pmap.put("sex", this.sex);
      pmap.put("precious", this.precious);
      pmap.put("mixedBatch", this.mixedBatch);
      pmap.put("reserve1", this.reserve1);
      pmap.put("reserve2", this.reserve2);
      pmap.put("reserve3", this.reserve3);
      pmap.put("reserve4", this.reserve4);
      pmap.put("reserve5", this.reserve5);
      pmap.put("reserve6", this.reserve6);
      pmap.put("reserve7", this.reserve7);
      pmap.put("reserve8", this.reserve8);
      pmap.put("reserve9", this.reserve9);
      pmap.put("reserve10", this.reserve10);
      pmap.put("fashionNo", this.fashionNo);
      pmap.put("goodsMess", this.goodsMess);
      pmap.put("isvGoodsNo", this.isvGoodsNo);
      pmap.put("deptNo", this.deptNo);
      pmap.put("signType", this.signType);
      pmap.put("overseaPurchase", this.overseaPurchase);
      pmap.put("qiRecord", this.qiRecord);
      pmap.put("customRecord", this.customRecord);
      pmap.put("pattern", this.pattern);
      pmap.put("ccProvider", this.ccProvider);
      pmap.put("bondedArea", this.bondedArea);
      pmap.put("sellerRecord", this.sellerRecord);
      pmap.put("batAttrIds", this.batAttrIds);
      pmap.put("needJDRecord", this.needJDRecord);
      pmap.put("modelNumber", this.modelNumber);
      pmap.put("spe", this.spe);
      pmap.put("vatRate", this.vatRate);
      pmap.put("taxRate", this.taxRate);
      pmap.put("taxNumberPost", this.taxNumberPost);
      pmap.put("postRate", this.postRate);
      pmap.put("hsCode", this.hsCode);
      pmap.put("country", this.country);
      pmap.put("qiCountry", this.qiCountry);
      pmap.put("flag", this.flag);
      pmap.put("legalUnit1", this.legalUnit1);
      pmap.put("legalAmount1", this.legalAmount1);
      pmap.put("legalUnit2", this.legalUnit2);
      pmap.put("legalAmount2", this.legalAmount2);
      pmap.put("measurement", this.measurement);
      pmap.put("qiMeasurement", this.qiMeasurement);
      pmap.put("delivery", this.delivery);
      pmap.put("storeProperty", this.storeProperty);
      pmap.put("productCategory", this.productCategory);
      pmap.put("category", this.category);
      pmap.put("approvalNo", this.approvalNo);
      pmap.put("storage", this.storage);
      pmap.put("form", this.form);
      pmap.put("type", this.type);
      pmap.put("specification", this.specification);
      pmap.put("genericName", this.genericName);
      pmap.put("dosage", this.dosage);
      pmap.put("useMethods", this.useMethods);
      pmap.put("packingUnit", this.packingUnit);
      pmap.put("efficacy", this.efficacy);
      pmap.put("manufactory", this.manufactory);
      pmap.put("price", this.price);
      pmap.put("storeSaleFlag", this.storeSaleFlag);
      pmap.put("keyMaintenance", this.keyMaintenance);
      pmap.put("specialDrugs", this.specialDrugs);
      pmap.put("marketingAuthorizationHolder", this.marketingAuthorizationHolder);
      pmap.put("boxRule", this.boxRule);
      pmap.put("warningDay", this.warningDay);
      pmap.put("regularAdventDay", this.regularAdventDay);
      pmap.put("urgentAdventDay", this.urgentAdventDay);
      pmap.put("adventDay", this.adventDay);
      pmap.put("easyPollute", this.easyPollute);
      pmap.put("muslim", this.muslim);
      pmap.put("boxRegulations", this.boxRegulations);
      pmap.put("allowedDay", this.allowedDay);
      pmap.put("sellerFirstCategory", this.sellerFirstCategory);
      pmap.put("sellerSecondCategory", this.sellerSecondCategory);
      pmap.put("sellerThirdCategory", this.sellerThirdCategory);
      pmap.put("sellerFirstCategoryNo", this.sellerFirstCategoryNo);
      pmap.put("sellerSecondCategoryNo", this.sellerSecondCategoryNo);
      pmap.put("sellerThirdCategoryNo", this.sellerThirdCategoryNo);
      pmap.put("athletesUseCaution", this.athletesUseCaution);
      pmap.put("elecSupervisionCodeFlag", this.elecSupervisionCodeFlag);
      pmap.put("hgsbys", this.hgsbys);
      pmap.put("goodsUnit", this.goodsUnit);
      pmap.put("uniqueCode", this.uniqueCode);
      pmap.put("productLine", this.productLine);
      pmap.put("isStandardInstrument", this.isStandardInstrument);
      pmap.put("isColdChain", this.isColdChain);
      pmap.put("isDetachablePackage", this.isDetachablePackage);
      pmap.put("certificateNo", this.certificateNo);
      pmap.put("businessTypeName", this.businessTypeName);
      pmap.put("ownerTypeName", this.ownerTypeName);
      pmap.put("packageTypeName", this.packageTypeName);
      pmap.put("materialTypeName", this.materialTypeName);
      pmap.put("model", this.model);
      pmap.put("clothingAttr", this.clothingAttr);
      pmap.put("clothingStyle", this.clothingStyle);
      pmap.put("clothingVersionType", this.clothingVersionType);
      pmap.put("clothingSilhouette", this.clothingSilhouette);
      pmap.put("clothingThickness", this.clothingThickness);
      pmap.put("clothingWeek", this.clothingWeek);
      pmap.put("bodyParts", this.bodyParts);
      pmap.put("styleSex", this.styleSex);
      pmap.put("listedBand", this.listedBand);
      pmap.put("expectListedTime", this.expectListedTime);
      pmap.put("fabric", this.fabric);
      pmap.put("washing", this.washing);
      pmap.put("year", this.year);
      pmap.put("productSeason", this.productSeason);
      pmap.put("afterSaleFlag", this.afterSaleFlag);
      pmap.put("productionLicenseNo", this.productionLicenseNo);
      pmap.put("transportTemperature", this.transportTemperature);
      pmap.put("boxUniqueCode", this.boxUniqueCode);
      pmap.put("auxiliary", this.auxiliary);
      pmap.put("goodsNameEn", this.goodsNameEn);
      pmap.put("minSaleQuantity", this.minSaleQuantity);
      pmap.put("minPackageQuantity", this.minPackageQuantity);
      pmap.put("packageInstruction", this.packageInstruction);
      pmap.put("texture", this.texture);
      pmap.put("substrate", this.substrate);
      pmap.put("executiveStandard", this.executiveStandard);
      pmap.put("processTechnology", this.processTechnology);
      pmap.put("allSerial", this.allSerial);
      pmap.put("isRcvDate", this.isRcvDate);
      pmap.put("renewPackage", this.renewPackage);
      pmap.put("imgUrls", this.imgUrls);
      pmap.put("warehouseInsured", this.warehouseInsured);
      pmap.put("transportInsured", this.transportInsured);
      pmap.put("isBillingSplit", this.isBillingSplit);
      pmap.put("source", this.source);
      pmap.put("medicineCategoryCode", this.medicineCategoryCode);
      pmap.put("warehouseTransfer", this.warehouseTransfer);
      return JsonUtil.toJson(pmap);
   }

   public Class<EclpGoodsUpdateGoodsInfoResponse> getResponseClass() {
      return EclpGoodsUpdateGoodsInfoResponse.class;
   }
}
