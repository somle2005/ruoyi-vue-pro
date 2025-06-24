package com.jd.open.api.sdk.request.ware;

import com.jd.open.api.sdk.internal.util.JdHashMap;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ware.WareUpdateResponse;
import java.io.IOException;

public class WareUpdateRequest extends AbstractRequest implements JdRequest<WareUpdateResponse> {
   private String isPayFirst;
   private String isCanVAT = null;
   private String isImported = null;
   private String isHealthProduct = null;
   private String shelfLifeDays;
   private String isSerialNo = null;
   private String isAppliancesCard = null;
   private String isSpecialWet = null;
   private String wareBigSmallModel;
   private String warePackType;
   private String isShelfLife;
   private String wareId;
   private String shopCategory;
   private String title;
   private String upcCode;
   private String optionType;
   private String itemNum;
   private String skuUpcCodes;
   private String stockNum;
   private String wareLocation;
   private String brandId;
   private String producter;
   private String wrap;
   private String length;
   private String wide;
   private String high;
   private String weight;
   private String costPrice;
   private String marketPrice;
   private String jdPrice;
   private String notes;
   private String rate;
   private String packListing;
   private String service;
   private String skuProperties;
   private String attributes;
   private String skuPrices;
   private String skuStocks;
   private String tradeNo;
   private String propertyAlias;
   private String outerId;
   private String inputPids;
   private String inputStrs;
   private String hasCheckCode;
   private String adContent;
   private String listTime;

   public String getApiMethod() {
      return "360buy.ware.update";
   }

   public String getAppJsonParams() throws IOException {
      JdHashMap pmap = new JdHashMap();
      pmap.put("ware_id", this.wareId);
      pmap.put("trade_no", this.tradeNo);
      pmap.put("shop_category", this.shopCategory);
      pmap.put("title", this.title);
      pmap.put("upc_code", this.upcCode);
      pmap.put("item_num", this.itemNum);
      pmap.put("stock_num", this.stockNum);
      pmap.put("producter", this.producter);
      pmap.put("ware_location", this.wareLocation);
      pmap.put("option_type", this.optionType);
      pmap.put("length", this.length);
      pmap.put("wrap", this.wrap);
      pmap.put("wide", this.wide);
      pmap.put("high", this.high);
      pmap.put("weight", this.weight);
      pmap.put("cost_price", this.costPrice);
      pmap.put("market_price", this.marketPrice);
      pmap.put("jd_price", this.jdPrice);
      pmap.put("notes", this.notes);
      pmap.put("rate", this.rate);
      pmap.put("pack_listing", this.packListing);
      pmap.put("service", this.service);
      pmap.put("sku_properties", this.skuProperties);
      pmap.put("attributes", this.attributes);
      pmap.put("sku_prices", this.skuPrices);
      pmap.put("sku_stocks", this.skuStocks);
      pmap.put("outer_id", this.outerId);
      pmap.put("property_alias", this.propertyAlias);
      pmap.put("trade_no", this.tradeNo);
      pmap.put("input_pids", this.inputPids);
      pmap.put("input_strs", this.inputStrs);
      pmap.put("brand_id", this.brandId);
      pmap.put("is_pay_first", this.isPayFirst);
      pmap.put("is_can_vat", this.isCanVAT);
      pmap.put("is_imported", this.isImported);
      pmap.put("is_health_product", this.isHealthProduct);
      pmap.put("shelf_life_days", this.shelfLifeDays);
      pmap.put("is_serial_no", this.isSerialNo);
      pmap.put("is_appliances_card", this.isAppliancesCard);
      pmap.put("is_special_wet", this.isSpecialWet);
      pmap.put("ware_big_small_model", this.wareBigSmallModel);
      pmap.put("ware_pack_type", this.warePackType);
      pmap.put("is_shelf_life", this.isShelfLife);
      pmap.put("has_check_code", this.hasCheckCode);
      pmap.put("ad_content", this.adContent);
      pmap.put("list_time", this.listTime);
      pmap.put("sku_upccodes", this.skuUpcCodes);
      return JsonUtil.toJson(pmap);
   }

   public Class<WareUpdateResponse> getResponseClass() {
      return WareUpdateResponse.class;
   }

   public String getSkuUpcCodes() {
      return this.skuUpcCodes;
   }

   public void setSkuUpcCodes(String skuUpcCodes) {
      this.skuUpcCodes = skuUpcCodes;
   }

   public String getWareLocation() {
      return this.wareLocation;
   }

   public void setWareLocation(String wareLocation) {
      this.wareLocation = wareLocation;
   }

   public String getBrandId() {
      return this.brandId;
   }

   public void setBrandId(String brandId) {
      this.brandId = brandId;
   }

   public String getHasCheckCode() {
      return this.hasCheckCode;
   }

   public void setHasCheckCode(String hasCheckCode) {
      this.hasCheckCode = hasCheckCode;
   }

   public String getAdContent() {
      return this.adContent;
   }

   public void setAdContent(String adContent) {
      this.adContent = adContent;
   }

   public String getListTime() {
      return this.listTime;
   }

   public void setListTime(String listTime) {
      this.listTime = listTime;
   }

   public String getStockNum() {
      return this.stockNum;
   }

   public void setStockNum(String stockNum) {
      this.stockNum = stockNum;
   }

   public String getInputPids() {
      return this.inputPids;
   }

   public void setInputPids(String inputPids) {
      this.inputPids = inputPids;
   }

   public String getInputStrs() {
      return this.inputStrs;
   }

   public void setInputStrs(String inputStrs) {
      this.inputStrs = inputStrs;
   }

   public String getShelfLife() {
      return this.isShelfLife;
   }

   public void setShelfLife(String shelfLife) {
      this.isShelfLife = shelfLife;
   }

   public String getOuterId() {
      return this.outerId;
   }

   public void setOuterId(String outerId) {
      this.outerId = outerId;
   }

   public String getPropertyAlias() {
      return this.propertyAlias;
   }

   public void setPropertyAlias(String propertyAlias) {
      this.propertyAlias = propertyAlias;
   }

   public String getTradeNo() {
      return this.tradeNo;
   }

   public void setTradeNo(String tradeNo) {
      this.tradeNo = tradeNo;
   }

   public String getOptionType() {
      return this.optionType;
   }

   public void setOptionType(String optionType) {
      this.optionType = optionType;
   }

   public String getTitle() {
      return this.title;
   }

   public void setTitle(String title) {
      this.title = title;
   }

   public String getUpcCode() {
      return this.upcCode;
   }

   public void setUpcCode(String upcCode) {
      this.upcCode = upcCode;
   }

   public String getItemNum() {
      return this.itemNum;
   }

   public void setItemNum(String itemNum) {
      this.itemNum = itemNum;
   }

   public String getProducter() {
      return this.producter;
   }

   public void setProducter(String producter) {
      this.producter = producter;
   }

   public String getWrap() {
      return this.wrap;
   }

   public void setWrap(String wrap) {
      this.wrap = wrap;
   }

   public String getLength() {
      return this.length;
   }

   public void setLength(String length) {
      this.length = length;
   }

   public String getWide() {
      return this.wide;
   }

   public void setWide(String wide) {
      this.wide = wide;
   }

   public String getHigh() {
      return this.high;
   }

   public void setHigh(String high) {
      this.high = high;
   }

   public String getWeight() {
      return this.weight;
   }

   public void setWeight(String weight) {
      this.weight = weight;
   }

   public String getCostPrice() {
      return this.costPrice;
   }

   public void setCostPrice(String costPrice) {
      this.costPrice = costPrice;
   }

   public String getMarketPrice() {
      return this.marketPrice;
   }

   public void setMarketPrice(String marketPrice) {
      this.marketPrice = marketPrice;
   }

   public String getJdPrice() {
      return this.jdPrice;
   }

   public void setJdPrice(String jdPrice) {
      this.jdPrice = jdPrice;
   }

   public String getNotes() {
      return this.notes;
   }

   public void setNotes(String notes) {
      this.notes = notes;
   }

   public String getRate() {
      return this.rate;
   }

   public void setRate(String rate) {
      this.rate = rate;
   }

   public String getPackListing() {
      return this.packListing;
   }

   public void setPackListing(String packListing) {
      this.packListing = packListing;
   }

   public String getService() {
      return this.service;
   }

   public void setService(String service) {
      this.service = service;
   }

   public String getSkuProperties() {
      return this.skuProperties;
   }

   public void setSkuProperties(String skuProperties) {
      this.skuProperties = skuProperties;
   }

   public String getAttributes() {
      return this.attributes;
   }

   public void setAttributes(String attributes) {
      this.attributes = attributes;
   }

   public String getShopCategory() {
      return this.shopCategory;
   }

   public void setShopCategory(String shopCategory) {
      this.shopCategory = shopCategory;
   }

   public String getSkuPrices() {
      return this.skuPrices;
   }

   public void setSkuPrices(String skuPrices) {
      this.skuPrices = skuPrices;
   }

   public String getSkuStocks() {
      return this.skuStocks;
   }

   public void setSkuStocks(String skuStocks) {
      this.skuStocks = skuStocks;
   }

   public String getWareId() {
      return this.wareId;
   }

   public void setWareId(String wareId) {
      this.wareId = wareId;
   }

   public String getPayFirst() {
      return this.isPayFirst;
   }

   public void setPayFirst(String payFirst) {
      this.isPayFirst = payFirst;
   }

   public String getCanVAT() {
      return this.isCanVAT;
   }

   public void setCanVAT(String canVAT) {
      this.isCanVAT = canVAT;
   }

   public String getImported() {
      return this.isImported;
   }

   public void setImported(String imported) {
      this.isImported = imported;
   }

   public String getHealthProduct() {
      return this.isHealthProduct;
   }

   public void setHealthProduct(String healthProduct) {
      this.isHealthProduct = healthProduct;
   }

   public String getShelfLifeDays() {
      return this.shelfLifeDays;
   }

   public void setShelfLifeDays(String shelfLifeDays) {
      this.shelfLifeDays = shelfLifeDays;
   }

   public String getSerialNo() {
      return this.isSerialNo;
   }

   public void setSerialNo(String serialNo) {
      this.isSerialNo = serialNo;
   }

   public String getAppliancesCard() {
      return this.isAppliancesCard;
   }

   public void setAppliancesCard(String appliancesCard) {
      this.isAppliancesCard = appliancesCard;
   }

   public String getSpecialWet() {
      return this.isSpecialWet;
   }

   public void setSpecialWet(String specialWet) {
      this.isSpecialWet = specialWet;
   }

   public String getWareBigSmallModel() {
      return this.wareBigSmallModel;
   }

   public void setWareBigSmallModel(String wareBigSmallModel) {
      this.wareBigSmallModel = wareBigSmallModel;
   }

   public String getWarePackType() {
      return this.warePackType;
   }

   public void setWarePackType(String warePackType) {
      this.warePackType = warePackType;
   }
}
