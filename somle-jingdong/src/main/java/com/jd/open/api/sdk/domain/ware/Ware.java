package com.jd.open.api.sdk.domain.ware;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class Ware implements Serializable {
   private static final long serialVersionUID = -3659686612229148061L;
   private Long wareId;
   List<Sku> skus;
   private Long spuId;
   private Long categoryId;
   private Long venderId;
   private Long shopId;
   private String wareStatus;
   private String title;
   private String itemNum;
   private String upcCode;
   private Long transportId;
   private String onlineTime;
   private String offlineTime;
   private String attributes;
   private String costPrice;
   private String marketPrice;
   private String jdPrice;
   private long stockNum;
   private String logo;
   private String creator;
   private String status;
   private String weight;
   private String created;
   private String modified;
   private String desc;
   private String cubage;
   private String packListing;
   private String producter;
   private String wrap;
   private String service;
   private String shopCategorys;
   private Boolean isPayFirst;
   private Boolean isShelfLife;
   private Boolean isImported;
   private Boolean isCanVat;
   private Boolean isSpecialWet;
   private Boolean isAppliancesCard;
   private Boolean isHealthProduct;
   private Boolean isSerialNo;
   private Integer shelfLifeDays;
   private Integer wareBigSmallModel;
   private Integer warePackType;
   private String propertyAlias;
   private String adContent;

   @JsonProperty("shop_categorys")
   public String getShopCategorys() {
      return this.shopCategorys;
   }

   @JsonProperty("shop_categorys")
   public void setShopCategorys(String shopCategorys) {
      this.shopCategorys = shopCategorys;
   }

   @JsonProperty("ad_content")
   public String getAdContent() {
      return this.adContent;
   }

   @JsonProperty("ad_content")
   public void setAdContent(String adContent) {
      this.adContent = adContent;
   }

   @JsonProperty("property_alias")
   public String getPropertyAlias() {
      return this.propertyAlias;
   }

   @JsonProperty("property_alias")
   public void setPropertyAlias(String propertyAlias) {
      this.propertyAlias = propertyAlias;
   }

   @JsonProperty("ware_id")
   public Long getWareId() {
      return this.wareId;
   }

   @JsonProperty("ware_id")
   public void setWareId(Long wareId) {
      this.wareId = wareId;
   }

   @JsonProperty("skus")
   public List<Sku> getSkus() {
      return this.skus;
   }

   @JsonProperty("skus")
   public void setSkus(List<Sku> skus) {
      this.skus = skus;
   }

   @JsonProperty("spu_id")
   public Long getSpuId() {
      return this.spuId;
   }

   @JsonProperty("spu_id")
   public void setSpuId(Long spuId) {
      this.spuId = spuId;
   }

   @JsonProperty("cid")
   public Long getCategoryId() {
      return this.categoryId;
   }

   @JsonProperty("cid")
   public void setCategoryId(Long categoryId) {
      this.categoryId = categoryId;
   }

   @JsonProperty("vender_id")
   public Long getVenderId() {
      return this.venderId;
   }

   @JsonProperty("vender_id")
   public void setVenderId(Long venderId) {
      this.venderId = venderId;
   }

   @JsonProperty("shop_id")
   public Long getShopId() {
      return this.shopId;
   }

   @JsonProperty("shop_id")
   public void setShopId(Long shopId) {
      this.shopId = shopId;
   }

   @JsonProperty("ware_status")
   public String getWareStatus() {
      return this.wareStatus;
   }

   @JsonProperty("ware_status")
   public void setWareStatus(String wareStatus) {
      this.wareStatus = wareStatus;
   }

   @JsonProperty("title")
   public String getTitle() {
      return this.title;
   }

   @JsonProperty("title")
   public void setTitle(String title) {
      this.title = title;
   }

   @JsonProperty("item_num")
   public String getItemNum() {
      return this.itemNum;
   }

   @JsonProperty("item_num")
   public void setItemNum(String itemNum) {
      this.itemNum = itemNum;
   }

   @JsonProperty("upc_code")
   public String getUpcCode() {
      return this.upcCode;
   }

   @JsonProperty("upc_code")
   public void setUpcCode(String upcCode) {
      this.upcCode = upcCode;
   }

   @JsonProperty("transport_id")
   public Long getTransportId() {
      return this.transportId;
   }

   @JsonProperty("transport_id")
   public void setTransportId(Long transportId) {
      this.transportId = transportId;
   }

   @JsonProperty("online_time")
   public String getOnlineTime() {
      return this.onlineTime;
   }

   @JsonProperty("online_time")
   public void setOnlineTime(String onlineTime) {
      this.onlineTime = onlineTime;
   }

   @JsonProperty("offline_time")
   public String getOfflineTime() {
      return this.offlineTime;
   }

   @JsonProperty("offline_time")
   public void setOfflineTime(String offlineTime) {
      this.offlineTime = offlineTime;
   }

   @JsonProperty("attributes")
   public String getAttributes() {
      return this.attributes;
   }

   @JsonProperty("attributes")
   public void setAttributes(String attributes) {
      this.attributes = attributes;
   }

   @JsonProperty("cost_price")
   public String getCostPrice() {
      return this.costPrice;
   }

   @JsonProperty("cost_price")
   public void setCostPrice(String costPrice) {
      this.costPrice = costPrice;
   }

   @JsonProperty("market_price")
   public String getMarketPrice() {
      return this.marketPrice;
   }

   @JsonProperty("market_price")
   public void setMarketPrice(String marketPrice) {
      this.marketPrice = marketPrice;
   }

   @JsonProperty("jd_price")
   public String getJdPrice() {
      return this.jdPrice;
   }

   @JsonProperty("jd_price")
   public void setJdPrice(String jdPrice) {
      this.jdPrice = jdPrice;
   }

   @JsonProperty("stock_num")
   public long getStockNum() {
      return this.stockNum;
   }

   @JsonProperty("stock_num")
   public void setStockNum(long stockNum) {
      this.stockNum = stockNum;
   }

   @JsonProperty("logo")
   public String getLogo() {
      return this.logo;
   }

   @JsonProperty("logo")
   public void setLogo(String logo) {
      this.logo = logo;
   }

   @JsonProperty("creator")
   public String getCreator() {
      return this.creator;
   }

   @JsonProperty("creator")
   public void setCreator(String creator) {
      this.creator = creator;
   }

   @JsonProperty("status")
   public String getStatus() {
      return this.status;
   }

   @JsonProperty("status")
   public void setStatus(String status) {
      this.status = status;
   }

   @JsonProperty("weight")
   public String getWeight() {
      return this.weight;
   }

   @JsonProperty("weight")
   public void setWeight(String weight) {
      this.weight = weight;
   }

   @JsonProperty("created")
   public String getCreated() {
      return this.created;
   }

   @JsonProperty("created")
   public void setCreated(String created) {
      this.created = created;
   }

   @JsonProperty("modified")
   public String getModified() {
      return this.modified;
   }

   @JsonProperty("modified")
   public void setModified(String modified) {
      this.modified = modified;
   }

   @JsonProperty("desc")
   public String getDesc() {
      return this.desc;
   }

   @JsonProperty("desc")
   public void setDesc(String desc) {
      this.desc = desc;
   }

   @JsonProperty("cubage")
   public String getCubage() {
      return this.cubage;
   }

   @JsonProperty("cubage")
   public void setCubage(String cubage) {
      this.cubage = cubage;
   }

   @JsonProperty("pack_listing")
   public String getPackListing() {
      return this.packListing;
   }

   @JsonProperty("pack_listing")
   public void setPackListing(String packListing) {
      this.packListing = packListing;
   }

   @JsonProperty("producter")
   public String getProducter() {
      return this.producter;
   }

   @JsonProperty("producter")
   public void setProducter(String producter) {
      this.producter = producter;
   }

   @JsonProperty("wrap")
   public String getWrap() {
      return this.wrap;
   }

   @JsonProperty("wrap")
   public void setWrap(String wrap) {
      this.wrap = wrap;
   }

   @JsonProperty("service")
   public String getService() {
      return this.service;
   }

   @JsonProperty("service")
   public void setService(String service) {
      this.service = service;
   }

   @JsonProperty("is_pay_first")
   public Boolean getPayFirst() {
      return this.isPayFirst;
   }

   @JsonProperty("is_pay_first")
   public void setPayFirst(Boolean payFirst) {
      this.isPayFirst = payFirst;
   }

   @JsonProperty("is_shelf_life")
   public Boolean getShelfLife() {
      return this.isShelfLife;
   }

   @JsonProperty("is_shelf_life")
   public void setShelfLife(Boolean shelfLife) {
      this.isShelfLife = shelfLife;
   }

   @JsonProperty("is_imported")
   public Boolean getImported() {
      return this.isImported;
   }

   @JsonProperty("is_imported")
   public void setImported(Boolean imported) {
      this.isImported = imported;
   }

   @JsonProperty("is_can_vat")
   public Boolean getCanVat() {
      return this.isCanVat;
   }

   @JsonProperty("is_can_vat")
   public void setCanVat(Boolean canVat) {
      this.isCanVat = canVat;
   }

   @JsonProperty("is_special_wet")
   public Boolean getSpecialWet() {
      return this.isSpecialWet;
   }

   @JsonProperty("is_special_wet")
   public void setSpecialWet(Boolean specialWet) {
      this.isSpecialWet = specialWet;
   }

   @JsonProperty("is_appliances_card")
   public Boolean getAppliancesCard() {
      return this.isAppliancesCard;
   }

   @JsonProperty("is_appliances_card")
   public void setAppliancesCard(Boolean appliancesCard) {
      this.isAppliancesCard = appliancesCard;
   }

   @JsonProperty("is_health_product")
   public Boolean getHealthProduct() {
      return this.isHealthProduct;
   }

   @JsonProperty("is_health_product")
   public void setHealthProduct(Boolean healthProduct) {
      this.isHealthProduct = healthProduct;
   }

   @JsonProperty("is_serial_no")
   public Boolean getSerialNo() {
      return this.isSerialNo;
   }

   @JsonProperty("is_serial_no")
   public void setSerialNo(Boolean serialNo) {
      this.isSerialNo = serialNo;
   }

   @JsonProperty("shelf_life_days")
   public Integer getShelfLifeDays() {
      return this.shelfLifeDays;
   }

   @JsonProperty("shelf_life_days")
   public void setShelfLifeDays(Integer shelfLifeDays) {
      this.shelfLifeDays = shelfLifeDays;
   }

   @JsonProperty("ware_big_small_model")
   public Integer getWareBigSmallModel() {
      return this.wareBigSmallModel;
   }

   @JsonProperty("ware_big_small_model")
   public void setWareBigSmallModel(Integer wareBigSmallModel) {
      this.wareBigSmallModel = wareBigSmallModel;
   }

   @JsonProperty("ware_pack_type")
   public Integer getWarePackType() {
      return this.warePackType;
   }

   @JsonProperty("ware_pack_type")
   public void setWarePackType(Integer warePackType) {
      this.warePackType = warePackType;
   }
}
