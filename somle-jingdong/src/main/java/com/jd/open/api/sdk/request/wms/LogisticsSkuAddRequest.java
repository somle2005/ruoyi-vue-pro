package com.jd.open.api.sdk.request.wms;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.wms.LogisticsSkuAddResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class LogisticsSkuAddRequest extends AbstractRequest implements JdRequest<LogisticsSkuAddResponse> {
   private String barCode;
   private String skuId;
   private String name;
   private String goodsAbbreviation;
   private String categoryId;
   private String categoryName;
   private String brandNo;
   private String brandName;
   private String format;
   private String color;
   private String size;
   private float grossWeight;
   private float netWeight;
   private String sizeDefinition;
   private String suppliersName;
   private String manufacturer;
   private String suppliersNo;
   private String productArea;
   private float length;
   private float width;
   private float height;
   private float volume;
   private int isSafe;
   private String safeDate;

   public void setBarCode(String barCode) {
      this.barCode = barCode;
   }

   public String getBarCode() {
      return this.barCode;
   }

   public void setSkuId(String skuId) {
      this.skuId = skuId;
   }

   public String getSkuId() {
      return this.skuId;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getName() {
      return this.name;
   }

   public void setGoodsAbbreviation(String goodsAbbreviation) {
      this.goodsAbbreviation = goodsAbbreviation;
   }

   public String getGoodsAbbreviation() {
      return this.goodsAbbreviation;
   }

   public void setCategoryId(String categoryId) {
      this.categoryId = categoryId;
   }

   public String getCategoryId() {
      return this.categoryId;
   }

   public void setCategoryName(String categoryName) {
      this.categoryName = categoryName;
   }

   public String getCategoryName() {
      return this.categoryName;
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

   public void setFormat(String format) {
      this.format = format;
   }

   public String getFormat() {
      return this.format;
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

   public void setGrossWeight(float grossWeight) {
      this.grossWeight = grossWeight;
   }

   public float getGrossWeight() {
      return this.grossWeight;
   }

   public void setNetWeight(float netWeight) {
      this.netWeight = netWeight;
   }

   public float getNetWeight() {
      return this.netWeight;
   }

   public void setSizeDefinition(String sizeDefinition) {
      this.sizeDefinition = sizeDefinition;
   }

   public String getSizeDefinition() {
      return this.sizeDefinition;
   }

   public void setSuppliersName(String suppliersName) {
      this.suppliersName = suppliersName;
   }

   public String getSuppliersName() {
      return this.suppliersName;
   }

   public void setManufacturer(String manufacturer) {
      this.manufacturer = manufacturer;
   }

   public String getManufacturer() {
      return this.manufacturer;
   }

   public void setSuppliersNo(String suppliersNo) {
      this.suppliersNo = suppliersNo;
   }

   public String getSuppliersNo() {
      return this.suppliersNo;
   }

   public void setProductArea(String productArea) {
      this.productArea = productArea;
   }

   public String getProductArea() {
      return this.productArea;
   }

   public void setLength(float length) {
      this.length = length;
   }

   public float getLength() {
      return this.length;
   }

   public void setWidth(float width) {
      this.width = width;
   }

   public float getWidth() {
      return this.width;
   }

   public void setHeight(float height) {
      this.height = height;
   }

   public float getHeight() {
      return this.height;
   }

   public void setVolume(float volume) {
      this.volume = volume;
   }

   public float getVolume() {
      return this.volume;
   }

   public void setIsSafe(int isSafe) {
      this.isSafe = isSafe;
   }

   public int getIsSafe() {
      return this.isSafe;
   }

   public void setSafeDate(String safeDate) {
      this.safeDate = safeDate;
   }

   public String getSafeDate() {
      return this.safeDate;
   }

   public String getApiMethod() {
      return "jingdong.logistics.sku.add";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("bar_code", this.barCode);
      pmap.put("sku_id", this.skuId);
      pmap.put("name", this.name);
      pmap.put("goods_abbreviation", this.goodsAbbreviation);
      pmap.put("category_id", this.categoryId);
      pmap.put("category_name", this.categoryName);
      pmap.put("brand_no", this.brandNo);
      pmap.put("brand_name", this.brandName);
      pmap.put("format", this.format);
      pmap.put("color", this.color);
      pmap.put("size", this.size);
      pmap.put("gross_weight", this.grossWeight);
      pmap.put("net_weight", this.netWeight);
      pmap.put("size_definition", this.sizeDefinition);
      pmap.put("suppliers_name", this.suppliersName);
      pmap.put("manufacturer", this.manufacturer);
      pmap.put("suppliers_no", this.suppliersNo);
      pmap.put("product_area", this.productArea);
      pmap.put("length", this.length);
      pmap.put("width", this.width);
      pmap.put("height", this.height);
      pmap.put("volume", this.volume);
      pmap.put("is_safe", this.isSafe);
      pmap.put("safe_date", this.safeDate);
      return JsonUtil.toJson(pmap);
   }

   public Class<LogisticsSkuAddResponse> getResponseClass() {
      return LogisticsSkuAddResponse.class;
   }
}
