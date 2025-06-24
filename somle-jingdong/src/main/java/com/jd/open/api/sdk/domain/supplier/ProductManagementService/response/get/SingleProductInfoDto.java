package com.jd.open.api.sdk.domain.supplier.ProductManagementService.response.get;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class SingleProductInfoDto implements Serializable {
   private String wareId;
   private String name;
   private String model;
   private String originalPlace;
   private String upc;
   private Integer packing;
   private String skuUnit;
   private Integer packType;
   private String pkgInfo;
   private String warranty;
   private Integer shelfLife;
   private String zhBrand;
   private String enBrand;
   private String webSite;
   private String tel;
   private Integer length;
   private Integer width;
   private Integer height;
   private BigDecimal weight;
   private BigDecimal marketPrice;
   private BigDecimal purchasePrice;
   private BigDecimal memberPrice;
   private Integer brandId;
   private String brandName;
   private Integer cid1;
   private String cidName1;
   private List<JosSubCategory> subCategories;
   private String salerCode;
   private String salerName;
   private String purchaserCode;
   private String purchaserName;
   private String vendorCode;
   private String vendorName;
   private String fullCategoryName1;
   private String wreadme;
   private List<PropSetting> propInfosList;
   private List<ExtPropDto> extPropIInfosList;
   private String introHtml;
   private String introMobile;
   private String pcTemplateHtml;
   private String pcDecorationHtml;
   private String mobileDecorationHtml;
   private Long videoId;
   private String title;
   private Date modifyTime;
   private String issn;
   private String service;
   private String salesRatio;
   private String aftersales;
   private String catalogerCode;
   private String catalogerName;
   private String salerDeptId;
   private String salerDeptName;
   private List<DCStoreDto> stores;
   private String itemNum;
   private Integer isFlashPurchase;
   private String flashProductor;
   private Integer isJIT;
   private Integer isOverseaPurchase;
   private Integer spwq;
   private Integer dangerGoods;
   private String afterSaleDesc;
   private Integer storeProperty;
   private String designConcept;
   private Integer sysp;
   private List<SkuInfoDto> skuList;
   private Integer giftsGoods;
   private Double productOilNumber;
   private String productOilUnit;
   private String shortTitle;
   private Long spuId;
   private String spuProductName;
   private String vendorId;
   private String sizeTemplateId;
   private String sizeTemplateTypeId;
   private String sizeTemplateName;

   @JsonProperty("wareId")
   public void setWareId(String wareId) {
      this.wareId = wareId;
   }

   @JsonProperty("wareId")
   public String getWareId() {
      return this.wareId;
   }

   @JsonProperty("name")
   public void setName(String name) {
      this.name = name;
   }

   @JsonProperty("name")
   public String getName() {
      return this.name;
   }

   @JsonProperty("model")
   public void setModel(String model) {
      this.model = model;
   }

   @JsonProperty("model")
   public String getModel() {
      return this.model;
   }

   @JsonProperty("original_place")
   public void setOriginalPlace(String originalPlace) {
      this.originalPlace = originalPlace;
   }

   @JsonProperty("original_place")
   public String getOriginalPlace() {
      return this.originalPlace;
   }

   @JsonProperty("upc")
   public void setUpc(String upc) {
      this.upc = upc;
   }

   @JsonProperty("upc")
   public String getUpc() {
      return this.upc;
   }

   @JsonProperty("packing")
   public void setPacking(Integer packing) {
      this.packing = packing;
   }

   @JsonProperty("packing")
   public Integer getPacking() {
      return this.packing;
   }

   @JsonProperty("sku_unit")
   public void setSkuUnit(String skuUnit) {
      this.skuUnit = skuUnit;
   }

   @JsonProperty("sku_unit")
   public String getSkuUnit() {
      return this.skuUnit;
   }

   @JsonProperty("pack_type")
   public void setPackType(Integer packType) {
      this.packType = packType;
   }

   @JsonProperty("pack_type")
   public Integer getPackType() {
      return this.packType;
   }

   @JsonProperty("pkgInfo")
   public void setPkgInfo(String pkgInfo) {
      this.pkgInfo = pkgInfo;
   }

   @JsonProperty("pkgInfo")
   public String getPkgInfo() {
      return this.pkgInfo;
   }

   @JsonProperty("warranty")
   public void setWarranty(String warranty) {
      this.warranty = warranty;
   }

   @JsonProperty("warranty")
   public String getWarranty() {
      return this.warranty;
   }

   @JsonProperty("shelf_life")
   public void setShelfLife(Integer shelfLife) {
      this.shelfLife = shelfLife;
   }

   @JsonProperty("shelf_life")
   public Integer getShelfLife() {
      return this.shelfLife;
   }

   @JsonProperty("zh_brand")
   public void setZhBrand(String zhBrand) {
      this.zhBrand = zhBrand;
   }

   @JsonProperty("zh_brand")
   public String getZhBrand() {
      return this.zhBrand;
   }

   @JsonProperty("en_brand")
   public void setEnBrand(String enBrand) {
      this.enBrand = enBrand;
   }

   @JsonProperty("en_brand")
   public String getEnBrand() {
      return this.enBrand;
   }

   @JsonProperty("web_site")
   public void setWebSite(String webSite) {
      this.webSite = webSite;
   }

   @JsonProperty("web_site")
   public String getWebSite() {
      return this.webSite;
   }

   @JsonProperty("tel")
   public void setTel(String tel) {
      this.tel = tel;
   }

   @JsonProperty("tel")
   public String getTel() {
      return this.tel;
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

   @JsonProperty("market_price")
   public void setMarketPrice(BigDecimal marketPrice) {
      this.marketPrice = marketPrice;
   }

   @JsonProperty("market_price")
   public BigDecimal getMarketPrice() {
      return this.marketPrice;
   }

   @JsonProperty("purchase_price")
   public void setPurchasePrice(BigDecimal purchasePrice) {
      this.purchasePrice = purchasePrice;
   }

   @JsonProperty("purchase_price")
   public BigDecimal getPurchasePrice() {
      return this.purchasePrice;
   }

   @JsonProperty("member_price")
   public void setMemberPrice(BigDecimal memberPrice) {
      this.memberPrice = memberPrice;
   }

   @JsonProperty("member_price")
   public BigDecimal getMemberPrice() {
      return this.memberPrice;
   }

   @JsonProperty("brand_id")
   public void setBrandId(Integer brandId) {
      this.brandId = brandId;
   }

   @JsonProperty("brand_id")
   public Integer getBrandId() {
      return this.brandId;
   }

   @JsonProperty("brand_name")
   public void setBrandName(String brandName) {
      this.brandName = brandName;
   }

   @JsonProperty("brand_name")
   public String getBrandName() {
      return this.brandName;
   }

   @JsonProperty("cid1")
   public void setCid1(Integer cid1) {
      this.cid1 = cid1;
   }

   @JsonProperty("cid1")
   public Integer getCid1() {
      return this.cid1;
   }

   @JsonProperty("cid_name1")
   public void setCidName1(String cidName1) {
      this.cidName1 = cidName1;
   }

   @JsonProperty("cid_name1")
   public String getCidName1() {
      return this.cidName1;
   }

   @JsonProperty("sub_categories")
   public void setSubCategories(List<JosSubCategory> subCategories) {
      this.subCategories = subCategories;
   }

   @JsonProperty("sub_categories")
   public List<JosSubCategory> getSubCategories() {
      return this.subCategories;
   }

   @JsonProperty("saler_code")
   public void setSalerCode(String salerCode) {
      this.salerCode = salerCode;
   }

   @JsonProperty("saler_code")
   public String getSalerCode() {
      return this.salerCode;
   }

   @JsonProperty("saler_name")
   public void setSalerName(String salerName) {
      this.salerName = salerName;
   }

   @JsonProperty("saler_name")
   public String getSalerName() {
      return this.salerName;
   }

   @JsonProperty("purchaser_code")
   public void setPurchaserCode(String purchaserCode) {
      this.purchaserCode = purchaserCode;
   }

   @JsonProperty("purchaser_code")
   public String getPurchaserCode() {
      return this.purchaserCode;
   }

   @JsonProperty("purchaser_name")
   public void setPurchaserName(String purchaserName) {
      this.purchaserName = purchaserName;
   }

   @JsonProperty("purchaser_name")
   public String getPurchaserName() {
      return this.purchaserName;
   }

   @JsonProperty("vendor_code")
   public void setVendorCode(String vendorCode) {
      this.vendorCode = vendorCode;
   }

   @JsonProperty("vendor_code")
   public String getVendorCode() {
      return this.vendorCode;
   }

   @JsonProperty("vendor_name")
   public void setVendorName(String vendorName) {
      this.vendorName = vendorName;
   }

   @JsonProperty("vendor_name")
   public String getVendorName() {
      return this.vendorName;
   }

   @JsonProperty("full_category_name1")
   public void setFullCategoryName1(String fullCategoryName1) {
      this.fullCategoryName1 = fullCategoryName1;
   }

   @JsonProperty("full_category_name1")
   public String getFullCategoryName1() {
      return this.fullCategoryName1;
   }

   @JsonProperty("wreadme")
   public void setWreadme(String wreadme) {
      this.wreadme = wreadme;
   }

   @JsonProperty("wreadme")
   public String getWreadme() {
      return this.wreadme;
   }

   @JsonProperty("prop_infos_list")
   public void setPropInfosList(List<PropSetting> propInfosList) {
      this.propInfosList = propInfosList;
   }

   @JsonProperty("prop_infos_list")
   public List<PropSetting> getPropInfosList() {
      return this.propInfosList;
   }

   @JsonProperty("ext_propI_infos_list")
   public void setExtPropIInfosList(List<ExtPropDto> extPropIInfosList) {
      this.extPropIInfosList = extPropIInfosList;
   }

   @JsonProperty("ext_propI_infos_list")
   public List<ExtPropDto> getExtPropIInfosList() {
      return this.extPropIInfosList;
   }

   @JsonProperty("intro_html")
   public void setIntroHtml(String introHtml) {
      this.introHtml = introHtml;
   }

   @JsonProperty("intro_html")
   public String getIntroHtml() {
      return this.introHtml;
   }

   @JsonProperty("intro_mobile")
   public void setIntroMobile(String introMobile) {
      this.introMobile = introMobile;
   }

   @JsonProperty("intro_mobile")
   public String getIntroMobile() {
      return this.introMobile;
   }

   @JsonProperty("pc_template_html")
   public void setPcTemplateHtml(String pcTemplateHtml) {
      this.pcTemplateHtml = pcTemplateHtml;
   }

   @JsonProperty("pc_template_html")
   public String getPcTemplateHtml() {
      return this.pcTemplateHtml;
   }

   @JsonProperty("pc_decoration_html")
   public void setPcDecorationHtml(String pcDecorationHtml) {
      this.pcDecorationHtml = pcDecorationHtml;
   }

   @JsonProperty("pc_decoration_html")
   public String getPcDecorationHtml() {
      return this.pcDecorationHtml;
   }

   @JsonProperty("mobile_decoration_html")
   public void setMobileDecorationHtml(String mobileDecorationHtml) {
      this.mobileDecorationHtml = mobileDecorationHtml;
   }

   @JsonProperty("mobile_decoration_html")
   public String getMobileDecorationHtml() {
      return this.mobileDecorationHtml;
   }

   @JsonProperty("videoId")
   public void setVideoId(Long videoId) {
      this.videoId = videoId;
   }

   @JsonProperty("videoId")
   public Long getVideoId() {
      return this.videoId;
   }

   @JsonProperty("title")
   public void setTitle(String title) {
      this.title = title;
   }

   @JsonProperty("title")
   public String getTitle() {
      return this.title;
   }

   @JsonProperty("modifyTime")
   public void setModifyTime(Date modifyTime) {
      this.modifyTime = modifyTime;
   }

   @JsonProperty("modifyTime")
   public Date getModifyTime() {
      return this.modifyTime;
   }

   @JsonProperty("issn")
   public void setIssn(String issn) {
      this.issn = issn;
   }

   @JsonProperty("issn")
   public String getIssn() {
      return this.issn;
   }

   @JsonProperty("service")
   public void setService(String service) {
      this.service = service;
   }

   @JsonProperty("service")
   public String getService() {
      return this.service;
   }

   @JsonProperty("salesRatio")
   public void setSalesRatio(String salesRatio) {
      this.salesRatio = salesRatio;
   }

   @JsonProperty("salesRatio")
   public String getSalesRatio() {
      return this.salesRatio;
   }

   @JsonProperty("aftersales")
   public void setAftersales(String aftersales) {
      this.aftersales = aftersales;
   }

   @JsonProperty("aftersales")
   public String getAftersales() {
      return this.aftersales;
   }

   @JsonProperty("catalogerCode")
   public void setCatalogerCode(String catalogerCode) {
      this.catalogerCode = catalogerCode;
   }

   @JsonProperty("catalogerCode")
   public String getCatalogerCode() {
      return this.catalogerCode;
   }

   @JsonProperty("catalogerName")
   public void setCatalogerName(String catalogerName) {
      this.catalogerName = catalogerName;
   }

   @JsonProperty("catalogerName")
   public String getCatalogerName() {
      return this.catalogerName;
   }

   @JsonProperty("salerDeptId")
   public void setSalerDeptId(String salerDeptId) {
      this.salerDeptId = salerDeptId;
   }

   @JsonProperty("salerDeptId")
   public String getSalerDeptId() {
      return this.salerDeptId;
   }

   @JsonProperty("salerDeptName")
   public void setSalerDeptName(String salerDeptName) {
      this.salerDeptName = salerDeptName;
   }

   @JsonProperty("salerDeptName")
   public String getSalerDeptName() {
      return this.salerDeptName;
   }

   @JsonProperty("stores")
   public void setStores(List<DCStoreDto> stores) {
      this.stores = stores;
   }

   @JsonProperty("stores")
   public List<DCStoreDto> getStores() {
      return this.stores;
   }

   @JsonProperty("itemNum")
   public void setItemNum(String itemNum) {
      this.itemNum = itemNum;
   }

   @JsonProperty("itemNum")
   public String getItemNum() {
      return this.itemNum;
   }

   @JsonProperty("isFlashPurchase")
   public void setIsFlashPurchase(Integer isFlashPurchase) {
      this.isFlashPurchase = isFlashPurchase;
   }

   @JsonProperty("isFlashPurchase")
   public Integer getIsFlashPurchase() {
      return this.isFlashPurchase;
   }

   @JsonProperty("flashProductor")
   public void setFlashProductor(String flashProductor) {
      this.flashProductor = flashProductor;
   }

   @JsonProperty("flashProductor")
   public String getFlashProductor() {
      return this.flashProductor;
   }

   @JsonProperty("isJIT")
   public void setIsJIT(Integer isJIT) {
      this.isJIT = isJIT;
   }

   @JsonProperty("isJIT")
   public Integer getIsJIT() {
      return this.isJIT;
   }

   @JsonProperty("isOverseaPurchase")
   public void setIsOverseaPurchase(Integer isOverseaPurchase) {
      this.isOverseaPurchase = isOverseaPurchase;
   }

   @JsonProperty("isOverseaPurchase")
   public Integer getIsOverseaPurchase() {
      return this.isOverseaPurchase;
   }

   @JsonProperty("spwq")
   public void setSpwq(Integer spwq) {
      this.spwq = spwq;
   }

   @JsonProperty("spwq")
   public Integer getSpwq() {
      return this.spwq;
   }

   @JsonProperty("dangerGoods")
   public void setDangerGoods(Integer dangerGoods) {
      this.dangerGoods = dangerGoods;
   }

   @JsonProperty("dangerGoods")
   public Integer getDangerGoods() {
      return this.dangerGoods;
   }

   @JsonProperty("after_sale_desc")
   public void setAfterSaleDesc(String afterSaleDesc) {
      this.afterSaleDesc = afterSaleDesc;
   }

   @JsonProperty("after_sale_desc")
   public String getAfterSaleDesc() {
      return this.afterSaleDesc;
   }

   @JsonProperty("store_property")
   public void setStoreProperty(Integer storeProperty) {
      this.storeProperty = storeProperty;
   }

   @JsonProperty("store_property")
   public Integer getStoreProperty() {
      return this.storeProperty;
   }

   @JsonProperty("design_concept")
   public void setDesignConcept(String designConcept) {
      this.designConcept = designConcept;
   }

   @JsonProperty("design_concept")
   public String getDesignConcept() {
      return this.designConcept;
   }

   @JsonProperty("sysp")
   public void setSysp(Integer sysp) {
      this.sysp = sysp;
   }

   @JsonProperty("sysp")
   public Integer getSysp() {
      return this.sysp;
   }

   @JsonProperty("skuList")
   public void setSkuList(List<SkuInfoDto> skuList) {
      this.skuList = skuList;
   }

   @JsonProperty("skuList")
   public List<SkuInfoDto> getSkuList() {
      return this.skuList;
   }

   @JsonProperty("gifts_goods")
   public void setGiftsGoods(Integer giftsGoods) {
      this.giftsGoods = giftsGoods;
   }

   @JsonProperty("gifts_goods")
   public Integer getGiftsGoods() {
      return this.giftsGoods;
   }

   @JsonProperty("product_oil_number")
   public void setProductOilNumber(Double productOilNumber) {
      this.productOilNumber = productOilNumber;
   }

   @JsonProperty("product_oil_number")
   public Double getProductOilNumber() {
      return this.productOilNumber;
   }

   @JsonProperty("product_oil_unit")
   public void setProductOilUnit(String productOilUnit) {
      this.productOilUnit = productOilUnit;
   }

   @JsonProperty("product_oil_unit")
   public String getProductOilUnit() {
      return this.productOilUnit;
   }

   @JsonProperty("shortTitle")
   public void setShortTitle(String shortTitle) {
      this.shortTitle = shortTitle;
   }

   @JsonProperty("shortTitle")
   public String getShortTitle() {
      return this.shortTitle;
   }

   @JsonProperty("spuId")
   public void setSpuId(Long spuId) {
      this.spuId = spuId;
   }

   @JsonProperty("spuId")
   public Long getSpuId() {
      return this.spuId;
   }

   @JsonProperty("spuProductName")
   public void setSpuProductName(String spuProductName) {
      this.spuProductName = spuProductName;
   }

   @JsonProperty("spuProductName")
   public String getSpuProductName() {
      return this.spuProductName;
   }

   @JsonProperty("vendorId")
   public void setVendorId(String vendorId) {
      this.vendorId = vendorId;
   }

   @JsonProperty("vendorId")
   public String getVendorId() {
      return this.vendorId;
   }

   @JsonProperty("sizeTemplateId")
   public void setSizeTemplateId(String sizeTemplateId) {
      this.sizeTemplateId = sizeTemplateId;
   }

   @JsonProperty("sizeTemplateId")
   public String getSizeTemplateId() {
      return this.sizeTemplateId;
   }

   @JsonProperty("sizeTemplateTypeId")
   public void setSizeTemplateTypeId(String sizeTemplateTypeId) {
      this.sizeTemplateTypeId = sizeTemplateTypeId;
   }

   @JsonProperty("sizeTemplateTypeId")
   public String getSizeTemplateTypeId() {
      return this.sizeTemplateTypeId;
   }

   @JsonProperty("sizeTemplateName")
   public void setSizeTemplateName(String sizeTemplateName) {
      this.sizeTemplateName = sizeTemplateName;
   }

   @JsonProperty("sizeTemplateName")
   public String getSizeTemplateName() {
      return this.sizeTemplateName;
   }
}
