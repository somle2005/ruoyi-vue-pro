package com.jd.open.api.sdk.request.supplier;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.supplier.VcItemNewProductCreateV2Response;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class VcItemNewProductCreateV2Request extends AbstractRequest implements JdRequest<VcItemNewProductCreateV2Response> {
   private String applyId;
   private Integer leafCid;
   private String pkgInfo;
   private String introMobile;
   private Long videoId;
   private BigDecimal purchasePrice;
   private String shortTitle;
   private String originalPlace;
   private String purchaserCode;
   private String designConcept;
   private String warranty;
   private String model;
   private String tel;
   private Integer cid1;
   private Integer height;
   private String productOilUnit;
   private BigDecimal weight;
   private String upc;
   private String dangerValue;
   private Integer brandId;
   private String name;
   private String enBrand;
   private BigDecimal marketPrice;
   private Integer packType;
   private Integer packing;
   private String afterSaleDesc;
   private String webSite;
   private String itemNum;
   private Integer giftsGoods;
   private String pdfUrl;
   private String introHtml;
   private Integer shelfLife;
   private BigDecimal memberPrice;
   private Integer length;
   private String salerCode;
   private Integer sysp;
   private Integer width;
   private String zhBrand;
   private Long spuId;
   private Long upcSpuId;
   private Integer storeProperty;
   private String hasTransferElecCode;
   private Double productOilNumber;
   private String skuUnit;
   private String mainPath;
   private String mainYn;
   private String mainIsPrimary;
   private String mainIsGgt;
   private String longPath;
   private String longYn;
   private String longIsPrimary;
   private String longIsGgt;
   private Integer imageIsPublishSchedule;
   private Date imagePublishTime;
   private Integer lastCategoryId;
   private String vehicleId;
   private String vehicleSaleUnit;
   private String conversionValue;
   private String vehiclePartQuality;
   private String oeNum;
   private String spuName;
   private Long vehicleSpuId;
   private String carGroupId;
   private String sourceKey;
   private String spuProductName;
   private String transparentPath;
   private String transparentYn;
   private String transparentIsPrimary;
   private String skc;
   private String sizeTemplateId;
   private String propValues;
   private String propAlias;
   private String propVid;
   private String propId;
   private String propRemark;
   private String ocrUrl;
   private String wreadme;
   private String extId;
   private String extValues;
   private String extAlias;
   private String extRemark;
   private String marketPriceGaea;
   private String dim1ValGaea;
   private String dim2SortGaea;
   private String purchasePriceGaea;
   private String skuNameGaea;
   private String itemNumGaea;
   private String skuShortTitleGaea;
   private String heightGaea;
   private String memberPriceGaea;
   private String lengthGaea;
   private String weightGaea;
   private String upcGaea;
   private String dim1SortGaea;
   private String dim2ValGaea;
   private String widthGaea;
   private String imageGaeaMainList;
   private String imageGaeaLongList;
   private String vehicleIdGaea;
   private String vehicleSaleUnitGaea;
   private String conversionValueGaea;
   private String vehiclePartQualityGaea;
   private String oeNumGaea;
   private String spuNameGaea;
   private Long vehicleSpuIdGaea;
   private String carGroupIdGaea;
   private String carGroupNameGaea;
   private String imageGaeaTransparentList;
   private String skcGaea;
   private String imageGaeaMainGgtIndex;
   private String imageGaeaLongGgtIndex;
   private String imageGaeaShopGuideImageList;
   private String endDate;
   private String entCode;
   private String qcCode;
   private String type;
   private String applicant;
   private String fileKeyList;
   private String structSaleAttrMap;

   public void setApplyId(String applyId) {
      this.applyId = applyId;
   }

   public String getApplyId() {
      return this.applyId;
   }

   public void setLeafCid(Integer leafCid) {
      this.leafCid = leafCid;
   }

   public Integer getLeafCid() {
      return this.leafCid;
   }

   public void setPkgInfo(String pkgInfo) {
      this.pkgInfo = pkgInfo;
   }

   public String getPkgInfo() {
      return this.pkgInfo;
   }

   public void setIntroMobile(String introMobile) {
      this.introMobile = introMobile;
   }

   public String getIntroMobile() {
      return this.introMobile;
   }

   public void setVideoId(Long videoId) {
      this.videoId = videoId;
   }

   public Long getVideoId() {
      return this.videoId;
   }

   public void setPurchasePrice(BigDecimal purchasePrice) {
      this.purchasePrice = purchasePrice;
   }

   public BigDecimal getPurchasePrice() {
      return this.purchasePrice;
   }

   public void setShortTitle(String shortTitle) {
      this.shortTitle = shortTitle;
   }

   public String getShortTitle() {
      return this.shortTitle;
   }

   public void setOriginalPlace(String originalPlace) {
      this.originalPlace = originalPlace;
   }

   public String getOriginalPlace() {
      return this.originalPlace;
   }

   public void setPurchaserCode(String purchaserCode) {
      this.purchaserCode = purchaserCode;
   }

   public String getPurchaserCode() {
      return this.purchaserCode;
   }

   public void setDesignConcept(String designConcept) {
      this.designConcept = designConcept;
   }

   public String getDesignConcept() {
      return this.designConcept;
   }

   public void setWarranty(String warranty) {
      this.warranty = warranty;
   }

   public String getWarranty() {
      return this.warranty;
   }

   public void setModel(String model) {
      this.model = model;
   }

   public String getModel() {
      return this.model;
   }

   public void setTel(String tel) {
      this.tel = tel;
   }

   public String getTel() {
      return this.tel;
   }

   public void setCid1(Integer cid1) {
      this.cid1 = cid1;
   }

   public Integer getCid1() {
      return this.cid1;
   }

   public void setHeight(Integer height) {
      this.height = height;
   }

   public Integer getHeight() {
      return this.height;
   }

   public void setProductOilUnit(String productOilUnit) {
      this.productOilUnit = productOilUnit;
   }

   public String getProductOilUnit() {
      return this.productOilUnit;
   }

   public void setWeight(BigDecimal weight) {
      this.weight = weight;
   }

   public BigDecimal getWeight() {
      return this.weight;
   }

   public void setUpc(String upc) {
      this.upc = upc;
   }

   public String getUpc() {
      return this.upc;
   }

   public void setDangerValue(String dangerValue) {
      this.dangerValue = dangerValue;
   }

   public String getDangerValue() {
      return this.dangerValue;
   }

   public void setBrandId(Integer brandId) {
      this.brandId = brandId;
   }

   public Integer getBrandId() {
      return this.brandId;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getName() {
      return this.name;
   }

   public void setEnBrand(String enBrand) {
      this.enBrand = enBrand;
   }

   public String getEnBrand() {
      return this.enBrand;
   }

   public void setMarketPrice(BigDecimal marketPrice) {
      this.marketPrice = marketPrice;
   }

   public BigDecimal getMarketPrice() {
      return this.marketPrice;
   }

   public void setPackType(Integer packType) {
      this.packType = packType;
   }

   public Integer getPackType() {
      return this.packType;
   }

   public void setPacking(Integer packing) {
      this.packing = packing;
   }

   public Integer getPacking() {
      return this.packing;
   }

   public void setAfterSaleDesc(String afterSaleDesc) {
      this.afterSaleDesc = afterSaleDesc;
   }

   public String getAfterSaleDesc() {
      return this.afterSaleDesc;
   }

   public void setWebSite(String webSite) {
      this.webSite = webSite;
   }

   public String getWebSite() {
      return this.webSite;
   }

   public void setItemNum(String itemNum) {
      this.itemNum = itemNum;
   }

   public String getItemNum() {
      return this.itemNum;
   }

   public void setGiftsGoods(Integer giftsGoods) {
      this.giftsGoods = giftsGoods;
   }

   public Integer getGiftsGoods() {
      return this.giftsGoods;
   }

   public void setPdfUrl(String pdfUrl) {
      this.pdfUrl = pdfUrl;
   }

   public String getPdfUrl() {
      return this.pdfUrl;
   }

   public void setIntroHtml(String introHtml) {
      this.introHtml = introHtml;
   }

   public String getIntroHtml() {
      return this.introHtml;
   }

   public void setShelfLife(Integer shelfLife) {
      this.shelfLife = shelfLife;
   }

   public Integer getShelfLife() {
      return this.shelfLife;
   }

   public void setMemberPrice(BigDecimal memberPrice) {
      this.memberPrice = memberPrice;
   }

   public BigDecimal getMemberPrice() {
      return this.memberPrice;
   }

   public void setLength(Integer length) {
      this.length = length;
   }

   public Integer getLength() {
      return this.length;
   }

   public void setSalerCode(String salerCode) {
      this.salerCode = salerCode;
   }

   public String getSalerCode() {
      return this.salerCode;
   }

   public void setSysp(Integer sysp) {
      this.sysp = sysp;
   }

   public Integer getSysp() {
      return this.sysp;
   }

   public void setWidth(Integer width) {
      this.width = width;
   }

   public Integer getWidth() {
      return this.width;
   }

   public void setZhBrand(String zhBrand) {
      this.zhBrand = zhBrand;
   }

   public String getZhBrand() {
      return this.zhBrand;
   }

   public void setSpuId(Long spuId) {
      this.spuId = spuId;
   }

   public Long getSpuId() {
      return this.spuId;
   }

   public void setUpcSpuId(Long upcSpuId) {
      this.upcSpuId = upcSpuId;
   }

   public Long getUpcSpuId() {
      return this.upcSpuId;
   }

   public void setStoreProperty(Integer storeProperty) {
      this.storeProperty = storeProperty;
   }

   public Integer getStoreProperty() {
      return this.storeProperty;
   }

   public void setHasTransferElecCode(String hasTransferElecCode) {
      this.hasTransferElecCode = hasTransferElecCode;
   }

   public String getHasTransferElecCode() {
      return this.hasTransferElecCode;
   }

   public void setProductOilNumber(Double productOilNumber) {
      this.productOilNumber = productOilNumber;
   }

   public Double getProductOilNumber() {
      return this.productOilNumber;
   }

   public void setSkuUnit(String skuUnit) {
      this.skuUnit = skuUnit;
   }

   public String getSkuUnit() {
      return this.skuUnit;
   }

   public void setMainPath(String mainPath) {
      this.mainPath = mainPath;
   }

   public String getMainPath() {
      return this.mainPath;
   }

   public void setMainYn(String mainYn) {
      this.mainYn = mainYn;
   }

   public String getMainYn() {
      return this.mainYn;
   }

   public void setMainIsPrimary(String mainIsPrimary) {
      this.mainIsPrimary = mainIsPrimary;
   }

   public String getMainIsPrimary() {
      return this.mainIsPrimary;
   }

   public void setMainIsGgt(String mainIsGgt) {
      this.mainIsGgt = mainIsGgt;
   }

   public String getMainIsGgt() {
      return this.mainIsGgt;
   }

   public void setLongPath(String longPath) {
      this.longPath = longPath;
   }

   public String getLongPath() {
      return this.longPath;
   }

   public void setLongYn(String longYn) {
      this.longYn = longYn;
   }

   public String getLongYn() {
      return this.longYn;
   }

   public void setLongIsPrimary(String longIsPrimary) {
      this.longIsPrimary = longIsPrimary;
   }

   public String getLongIsPrimary() {
      return this.longIsPrimary;
   }

   public void setLongIsGgt(String longIsGgt) {
      this.longIsGgt = longIsGgt;
   }

   public String getLongIsGgt() {
      return this.longIsGgt;
   }

   public void setImageIsPublishSchedule(Integer imageIsPublishSchedule) {
      this.imageIsPublishSchedule = imageIsPublishSchedule;
   }

   public Integer getImageIsPublishSchedule() {
      return this.imageIsPublishSchedule;
   }

   public void setImagePublishTime(Date imagePublishTime) {
      this.imagePublishTime = imagePublishTime;
   }

   public Date getImagePublishTime() {
      return this.imagePublishTime;
   }

   public void setLastCategoryId(Integer lastCategoryId) {
      this.lastCategoryId = lastCategoryId;
   }

   public Integer getLastCategoryId() {
      return this.lastCategoryId;
   }

   public void setVehicleId(String vehicleId) {
      this.vehicleId = vehicleId;
   }

   public String getVehicleId() {
      return this.vehicleId;
   }

   public void setVehicleSaleUnit(String vehicleSaleUnit) {
      this.vehicleSaleUnit = vehicleSaleUnit;
   }

   public String getVehicleSaleUnit() {
      return this.vehicleSaleUnit;
   }

   public void setConversionValue(String conversionValue) {
      this.conversionValue = conversionValue;
   }

   public String getConversionValue() {
      return this.conversionValue;
   }

   public void setVehiclePartQuality(String vehiclePartQuality) {
      this.vehiclePartQuality = vehiclePartQuality;
   }

   public String getVehiclePartQuality() {
      return this.vehiclePartQuality;
   }

   public void setOeNum(String oeNum) {
      this.oeNum = oeNum;
   }

   public String getOeNum() {
      return this.oeNum;
   }

   public void setSpuName(String spuName) {
      this.spuName = spuName;
   }

   public String getSpuName() {
      return this.spuName;
   }

   public void setVehicleSpuId(Long vehicleSpuId) {
      this.vehicleSpuId = vehicleSpuId;
   }

   public Long getVehicleSpuId() {
      return this.vehicleSpuId;
   }

   public void setCarGroupId(String carGroupId) {
      this.carGroupId = carGroupId;
   }

   public String getCarGroupId() {
      return this.carGroupId;
   }

   public void setSourceKey(String sourceKey) {
      this.sourceKey = sourceKey;
   }

   public String getSourceKey() {
      return this.sourceKey;
   }

   public void setSpuProductName(String spuProductName) {
      this.spuProductName = spuProductName;
   }

   public String getSpuProductName() {
      return this.spuProductName;
   }

   public void setTransparentPath(String transparentPath) {
      this.transparentPath = transparentPath;
   }

   public String getTransparentPath() {
      return this.transparentPath;
   }

   public void setTransparentYn(String transparentYn) {
      this.transparentYn = transparentYn;
   }

   public String getTransparentYn() {
      return this.transparentYn;
   }

   public void setTransparentIsPrimary(String transparentIsPrimary) {
      this.transparentIsPrimary = transparentIsPrimary;
   }

   public String getTransparentIsPrimary() {
      return this.transparentIsPrimary;
   }

   public void setSkc(String skc) {
      this.skc = skc;
   }

   public String getSkc() {
      return this.skc;
   }

   public void setSizeTemplateId(String sizeTemplateId) {
      this.sizeTemplateId = sizeTemplateId;
   }

   public String getSizeTemplateId() {
      return this.sizeTemplateId;
   }

   public void setPropValues(String propValues) {
      this.propValues = propValues;
   }

   public String getPropValues() {
      return this.propValues;
   }

   public void setPropAlias(String propAlias) {
      this.propAlias = propAlias;
   }

   public String getPropAlias() {
      return this.propAlias;
   }

   public void setPropVid(String propVid) {
      this.propVid = propVid;
   }

   public String getPropVid() {
      return this.propVid;
   }

   public void setPropId(String propId) {
      this.propId = propId;
   }

   public String getPropId() {
      return this.propId;
   }

   public void setPropRemark(String propRemark) {
      this.propRemark = propRemark;
   }

   public String getPropRemark() {
      return this.propRemark;
   }

   public void setOcrUrl(String ocrUrl) {
      this.ocrUrl = ocrUrl;
   }

   public String getOcrUrl() {
      return this.ocrUrl;
   }

   public void setWreadme(String wreadme) {
      this.wreadme = wreadme;
   }

   public String getWreadme() {
      return this.wreadme;
   }

   public void setExtId(String extId) {
      this.extId = extId;
   }

   public String getExtId() {
      return this.extId;
   }

   public void setExtValues(String extValues) {
      this.extValues = extValues;
   }

   public String getExtValues() {
      return this.extValues;
   }

   public void setExtAlias(String extAlias) {
      this.extAlias = extAlias;
   }

   public String getExtAlias() {
      return this.extAlias;
   }

   public void setExtRemark(String extRemark) {
      this.extRemark = extRemark;
   }

   public String getExtRemark() {
      return this.extRemark;
   }

   public void setMarketPriceGaea(String marketPriceGaea) {
      this.marketPriceGaea = marketPriceGaea;
   }

   public String getMarketPriceGaea() {
      return this.marketPriceGaea;
   }

   public void setDim1ValGaea(String dim1ValGaea) {
      this.dim1ValGaea = dim1ValGaea;
   }

   public String getDim1ValGaea() {
      return this.dim1ValGaea;
   }

   public void setDim2SortGaea(String dim2SortGaea) {
      this.dim2SortGaea = dim2SortGaea;
   }

   public String getDim2SortGaea() {
      return this.dim2SortGaea;
   }

   public void setPurchasePriceGaea(String purchasePriceGaea) {
      this.purchasePriceGaea = purchasePriceGaea;
   }

   public String getPurchasePriceGaea() {
      return this.purchasePriceGaea;
   }

   public void setSkuNameGaea(String skuNameGaea) {
      this.skuNameGaea = skuNameGaea;
   }

   public String getSkuNameGaea() {
      return this.skuNameGaea;
   }

   public void setItemNumGaea(String itemNumGaea) {
      this.itemNumGaea = itemNumGaea;
   }

   public String getItemNumGaea() {
      return this.itemNumGaea;
   }

   public void setSkuShortTitleGaea(String skuShortTitleGaea) {
      this.skuShortTitleGaea = skuShortTitleGaea;
   }

   public String getSkuShortTitleGaea() {
      return this.skuShortTitleGaea;
   }

   public void setHeightGaea(String heightGaea) {
      this.heightGaea = heightGaea;
   }

   public String getHeightGaea() {
      return this.heightGaea;
   }

   public void setMemberPriceGaea(String memberPriceGaea) {
      this.memberPriceGaea = memberPriceGaea;
   }

   public String getMemberPriceGaea() {
      return this.memberPriceGaea;
   }

   public void setLengthGaea(String lengthGaea) {
      this.lengthGaea = lengthGaea;
   }

   public String getLengthGaea() {
      return this.lengthGaea;
   }

   public void setWeightGaea(String weightGaea) {
      this.weightGaea = weightGaea;
   }

   public String getWeightGaea() {
      return this.weightGaea;
   }

   public void setUpcGaea(String upcGaea) {
      this.upcGaea = upcGaea;
   }

   public String getUpcGaea() {
      return this.upcGaea;
   }

   public void setDim1SortGaea(String dim1SortGaea) {
      this.dim1SortGaea = dim1SortGaea;
   }

   public String getDim1SortGaea() {
      return this.dim1SortGaea;
   }

   public void setDim2ValGaea(String dim2ValGaea) {
      this.dim2ValGaea = dim2ValGaea;
   }

   public String getDim2ValGaea() {
      return this.dim2ValGaea;
   }

   public void setWidthGaea(String widthGaea) {
      this.widthGaea = widthGaea;
   }

   public String getWidthGaea() {
      return this.widthGaea;
   }

   public void setImageGaeaMainList(String imageGaeaMainList) {
      this.imageGaeaMainList = imageGaeaMainList;
   }

   public String getImageGaeaMainList() {
      return this.imageGaeaMainList;
   }

   public void setImageGaeaLongList(String imageGaeaLongList) {
      this.imageGaeaLongList = imageGaeaLongList;
   }

   public String getImageGaeaLongList() {
      return this.imageGaeaLongList;
   }

   public void setVehicleIdGaea(String vehicleIdGaea) {
      this.vehicleIdGaea = vehicleIdGaea;
   }

   public String getVehicleIdGaea() {
      return this.vehicleIdGaea;
   }

   public void setVehicleSaleUnitGaea(String vehicleSaleUnitGaea) {
      this.vehicleSaleUnitGaea = vehicleSaleUnitGaea;
   }

   public String getVehicleSaleUnitGaea() {
      return this.vehicleSaleUnitGaea;
   }

   public void setConversionValueGaea(String conversionValueGaea) {
      this.conversionValueGaea = conversionValueGaea;
   }

   public String getConversionValueGaea() {
      return this.conversionValueGaea;
   }

   public void setVehiclePartQualityGaea(String vehiclePartQualityGaea) {
      this.vehiclePartQualityGaea = vehiclePartQualityGaea;
   }

   public String getVehiclePartQualityGaea() {
      return this.vehiclePartQualityGaea;
   }

   public void setOeNumGaea(String oeNumGaea) {
      this.oeNumGaea = oeNumGaea;
   }

   public String getOeNumGaea() {
      return this.oeNumGaea;
   }

   public void setSpuNameGaea(String spuNameGaea) {
      this.spuNameGaea = spuNameGaea;
   }

   public String getSpuNameGaea() {
      return this.spuNameGaea;
   }

   public void setVehicleSpuIdGaea(Long vehicleSpuIdGaea) {
      this.vehicleSpuIdGaea = vehicleSpuIdGaea;
   }

   public Long getVehicleSpuIdGaea() {
      return this.vehicleSpuIdGaea;
   }

   public void setCarGroupIdGaea(String carGroupIdGaea) {
      this.carGroupIdGaea = carGroupIdGaea;
   }

   public String getCarGroupIdGaea() {
      return this.carGroupIdGaea;
   }

   public void setCarGroupNameGaea(String carGroupNameGaea) {
      this.carGroupNameGaea = carGroupNameGaea;
   }

   public String getCarGroupNameGaea() {
      return this.carGroupNameGaea;
   }

   public void setImageGaeaTransparentList(String imageGaeaTransparentList) {
      this.imageGaeaTransparentList = imageGaeaTransparentList;
   }

   public String getImageGaeaTransparentList() {
      return this.imageGaeaTransparentList;
   }

   public void setSkcGaea(String skcGaea) {
      this.skcGaea = skcGaea;
   }

   public String getSkcGaea() {
      return this.skcGaea;
   }

   public void setImageGaeaMainGgtIndex(String imageGaeaMainGgtIndex) {
      this.imageGaeaMainGgtIndex = imageGaeaMainGgtIndex;
   }

   public String getImageGaeaMainGgtIndex() {
      return this.imageGaeaMainGgtIndex;
   }

   public void setImageGaeaLongGgtIndex(String imageGaeaLongGgtIndex) {
      this.imageGaeaLongGgtIndex = imageGaeaLongGgtIndex;
   }

   public String getImageGaeaLongGgtIndex() {
      return this.imageGaeaLongGgtIndex;
   }

   public void setImageGaeaShopGuideImageList(String imageGaeaShopGuideImageList) {
      this.imageGaeaShopGuideImageList = imageGaeaShopGuideImageList;
   }

   public String getImageGaeaShopGuideImageList() {
      return this.imageGaeaShopGuideImageList;
   }

   public void setEndDate(String endDate) {
      this.endDate = endDate;
   }

   public String getEndDate() {
      return this.endDate;
   }

   public void setEntCode(String entCode) {
      this.entCode = entCode;
   }

   public String getEntCode() {
      return this.entCode;
   }

   public void setQcCode(String qcCode) {
      this.qcCode = qcCode;
   }

   public String getQcCode() {
      return this.qcCode;
   }

   public void setType(String type) {
      this.type = type;
   }

   public String getType() {
      return this.type;
   }

   public void setApplicant(String applicant) {
      this.applicant = applicant;
   }

   public String getApplicant() {
      return this.applicant;
   }

   public void setFileKeyList(String fileKeyList) {
      this.fileKeyList = fileKeyList;
   }

   public String getFileKeyList() {
      return this.fileKeyList;
   }

   public void setStructSaleAttrMap(String structSaleAttrMap) {
      this.structSaleAttrMap = structSaleAttrMap;
   }

   public String getStructSaleAttrMap() {
      return this.structSaleAttrMap;
   }

   public String getApiMethod() {
      return "jingdong.vc.item.newProduct.createV2";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("apply_id", this.applyId);
      pmap.put("leaf_cid", this.leafCid);
      pmap.put("pkg_info", this.pkgInfo);
      pmap.put("intro_mobile", this.introMobile);
      pmap.put("video_id", this.videoId);
      pmap.put("purchase_price", this.purchasePrice);
      pmap.put("short_title", this.shortTitle);
      pmap.put("original_place", this.originalPlace);
      pmap.put("purchaser_code", this.purchaserCode);
      pmap.put("design_concept", this.designConcept);
      pmap.put("warranty", this.warranty);
      pmap.put("model", this.model);
      pmap.put("tel", this.tel);
      pmap.put("cid1", this.cid1);
      pmap.put("height", this.height);
      pmap.put("product_oil_unit", this.productOilUnit);
      pmap.put("weight", this.weight);
      pmap.put("upc", this.upc);
      pmap.put("danger_value", this.dangerValue);
      pmap.put("brand_id", this.brandId);
      pmap.put("name", this.name);
      pmap.put("en_brand", this.enBrand);
      pmap.put("market_price", this.marketPrice);
      pmap.put("pack_type", this.packType);
      pmap.put("packing", this.packing);
      pmap.put("after_sale_desc", this.afterSaleDesc);
      pmap.put("web_site", this.webSite);
      pmap.put("item_num", this.itemNum);
      pmap.put("gifts_goods", this.giftsGoods);
      pmap.put("pdfUrl", this.pdfUrl);
      pmap.put("intro_html", this.introHtml);
      pmap.put("shelf_life", this.shelfLife);
      pmap.put("member_price", this.memberPrice);
      pmap.put("length", this.length);
      pmap.put("saler_code", this.salerCode);
      pmap.put("sysp", this.sysp);
      pmap.put("width", this.width);
      pmap.put("zh_brand", this.zhBrand);
      pmap.put("spuId", this.spuId);
      pmap.put("upcSpuId", this.upcSpuId);
      pmap.put("store_property", this.storeProperty);
      pmap.put("has_transfer_elec_code", this.hasTransferElecCode);
      pmap.put("product_oil_number", this.productOilNumber);
      pmap.put("sku_unit", this.skuUnit);
      pmap.put("main_path", this.mainPath);
      pmap.put("main_yn", this.mainYn);
      pmap.put("main_isPrimary", this.mainIsPrimary);
      pmap.put("main_isGgt", this.mainIsGgt);
      pmap.put("long_path", this.longPath);
      pmap.put("long_yn", this.longYn);
      pmap.put("long_isPrimary", this.longIsPrimary);
      pmap.put("long_isGgt", this.longIsGgt);
      pmap.put("image_isPublishSchedule", this.imageIsPublishSchedule);

      try {
         if (this.imagePublishTime != null) {
            pmap.put("image_publishTime", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.imagePublishTime));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      pmap.put("lastCategoryId", this.lastCategoryId);
      pmap.put("vehicleId", this.vehicleId);
      pmap.put("vehicleSaleUnit", this.vehicleSaleUnit);
      pmap.put("conversionValue", this.conversionValue);
      pmap.put("vehiclePartQuality", this.vehiclePartQuality);
      pmap.put("oeNum", this.oeNum);
      pmap.put("spuName", this.spuName);
      pmap.put("vehicleSpuId", this.vehicleSpuId);
      pmap.put("carGroupId", this.carGroupId);
      pmap.put("sourceKey", this.sourceKey);
      pmap.put("spuProductName", this.spuProductName);
      pmap.put("transparent_path", this.transparentPath);
      pmap.put("transparent_yn", this.transparentYn);
      pmap.put("transparent_isPrimary", this.transparentIsPrimary);
      pmap.put("skc", this.skc);
      pmap.put("sizeTemplateId", this.sizeTemplateId);
      pmap.put("prop_values", this.propValues);
      pmap.put("prop_alias", this.propAlias);
      pmap.put("prop_vid", this.propVid);
      pmap.put("prop_id", this.propId);
      pmap.put("prop_remark", this.propRemark);
      pmap.put("ocrUrl", this.ocrUrl);
      pmap.put("wreadme", this.wreadme);
      pmap.put("ext_id", this.extId);
      pmap.put("ext_values", this.extValues);
      pmap.put("ext_alias", this.extAlias);
      pmap.put("ext_remark", this.extRemark);
      pmap.put("market_price_gaea", this.marketPriceGaea);
      pmap.put("dim1_val_gaea", this.dim1ValGaea);
      pmap.put("dim2_sort_gaea", this.dim2SortGaea);
      pmap.put("purchase_price_gaea", this.purchasePriceGaea);
      pmap.put("sku_name_gaea", this.skuNameGaea);
      pmap.put("item_num_gaea", this.itemNumGaea);
      pmap.put("sku_short_title_gaea", this.skuShortTitleGaea);
      pmap.put("height_gaea", this.heightGaea);
      pmap.put("member_price_gaea", this.memberPriceGaea);
      pmap.put("length_gaea", this.lengthGaea);
      pmap.put("weight_gaea", this.weightGaea);
      pmap.put("upc_gaea", this.upcGaea);
      pmap.put("dim1_sort_gaea", this.dim1SortGaea);
      pmap.put("dim2_val_gaea", this.dim2ValGaea);
      pmap.put("width_gaea", this.widthGaea);
      pmap.put("imageGaeaMainList", this.imageGaeaMainList);
      pmap.put("imageGaeaLongList", this.imageGaeaLongList);
      pmap.put("vehicleIdGaea", this.vehicleIdGaea);
      pmap.put("vehicleSaleUnitGaea", this.vehicleSaleUnitGaea);
      pmap.put("conversionValueGaea", this.conversionValueGaea);
      pmap.put("vehiclePartQualityGaea", this.vehiclePartQualityGaea);
      pmap.put("oeNumGaea", this.oeNumGaea);
      pmap.put("spuNameGaea", this.spuNameGaea);
      pmap.put("vehicleSpuIdGaea", this.vehicleSpuIdGaea);
      pmap.put("carGroupIdGaea", this.carGroupIdGaea);
      pmap.put("carGroupNameGaea", this.carGroupNameGaea);
      pmap.put("imageGaeaTransparentList", this.imageGaeaTransparentList);
      pmap.put("skc_gaea", this.skcGaea);
      pmap.put("imageGaeaMainGgtIndex", this.imageGaeaMainGgtIndex);
      pmap.put("imageGaeaLongGgtIndex", this.imageGaeaLongGgtIndex);
      pmap.put("imageGaeaShopGuideImageList", this.imageGaeaShopGuideImageList);
      pmap.put("end_date", this.endDate);
      pmap.put("ent_code", this.entCode);
      pmap.put("qc_code", this.qcCode);
      pmap.put("type", this.type);
      pmap.put("applicant", this.applicant);
      pmap.put("file_key_list", this.fileKeyList);
      pmap.put("structSaleAttrMap", this.structSaleAttrMap);
      return JsonUtil.toJson(pmap);
   }

   public Class<VcItemNewProductCreateV2Response> getResponseClass() {
      return VcItemNewProductCreateV2Response.class;
   }
}
