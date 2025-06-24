package com.jd.open.api.sdk.domain.mall.ProductWrapService.response.get;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class ProductBase implements Serializable {
   private Long skuId;
   private String name;
   private String isDelete;
   private String state;
   private String barCode;
   private String erpPid;
   private String color;
   private String colorSequence;
   private String size;
   private String sizeSequence;
   private String upc;
   private String skuMark;
   private String saleDate;
   private String cid2;
   private String valueWeight;
   private String weight;
   private String productArea;
   private String wserve;
   private String allnum;
   private String maxPurchQty;
   private String brandId;
   private String valuePayFirst;
   private String length;
   private String width;
   private String height;
   private String venderType;
   private String pname;
   private String issn;
   private String safeDays;
   private String saleUnit;
   private String packSpecification;
   private String category;
   private String shopCategorys;
   private String phone;
   private String site;
   private String ebrand;
   private String cbrand;
   private String model;
   private String imagePath;
   private String shopName;
   private String url;
   private String venderId;

   @JsonProperty("skuId")
   public void setSkuId(Long skuId) {
      this.skuId = skuId;
   }

   @JsonProperty("skuId")
   public Long getSkuId() {
      return this.skuId;
   }

   @JsonProperty("name")
   public void setName(String name) {
      this.name = name;
   }

   @JsonProperty("name")
   public String getName() {
      return this.name;
   }

   @JsonProperty("isDelete")
   public void setIsDelete(String isDelete) {
      this.isDelete = isDelete;
   }

   @JsonProperty("isDelete")
   public String getIsDelete() {
      return this.isDelete;
   }

   @JsonProperty("state")
   public void setState(String state) {
      this.state = state;
   }

   @JsonProperty("state")
   public String getState() {
      return this.state;
   }

   @JsonProperty("barCode")
   public void setBarCode(String barCode) {
      this.barCode = barCode;
   }

   @JsonProperty("barCode")
   public String getBarCode() {
      return this.barCode;
   }

   @JsonProperty("erpPid")
   public void setErpPid(String erpPid) {
      this.erpPid = erpPid;
   }

   @JsonProperty("erpPid")
   public String getErpPid() {
      return this.erpPid;
   }

   @JsonProperty("color")
   public void setColor(String color) {
      this.color = color;
   }

   @JsonProperty("color")
   public String getColor() {
      return this.color;
   }

   @JsonProperty("colorSequence")
   public void setColorSequence(String colorSequence) {
      this.colorSequence = colorSequence;
   }

   @JsonProperty("colorSequence")
   public String getColorSequence() {
      return this.colorSequence;
   }

   @JsonProperty("size")
   public void setSize(String size) {
      this.size = size;
   }

   @JsonProperty("size")
   public String getSize() {
      return this.size;
   }

   @JsonProperty("sizeSequence")
   public void setSizeSequence(String sizeSequence) {
      this.sizeSequence = sizeSequence;
   }

   @JsonProperty("sizeSequence")
   public String getSizeSequence() {
      return this.sizeSequence;
   }

   @JsonProperty("upc")
   public void setUpc(String upc) {
      this.upc = upc;
   }

   @JsonProperty("upc")
   public String getUpc() {
      return this.upc;
   }

   @JsonProperty("skuMark")
   public void setSkuMark(String skuMark) {
      this.skuMark = skuMark;
   }

   @JsonProperty("skuMark")
   public String getSkuMark() {
      return this.skuMark;
   }

   @JsonProperty("saleDate")
   public void setSaleDate(String saleDate) {
      this.saleDate = saleDate;
   }

   @JsonProperty("saleDate")
   public String getSaleDate() {
      return this.saleDate;
   }

   @JsonProperty("cid2")
   public void setCid2(String cid2) {
      this.cid2 = cid2;
   }

   @JsonProperty("cid2")
   public String getCid2() {
      return this.cid2;
   }

   @JsonProperty("valueWeight")
   public void setValueWeight(String valueWeight) {
      this.valueWeight = valueWeight;
   }

   @JsonProperty("valueWeight")
   public String getValueWeight() {
      return this.valueWeight;
   }

   @JsonProperty("weight")
   public void setWeight(String weight) {
      this.weight = weight;
   }

   @JsonProperty("weight")
   public String getWeight() {
      return this.weight;
   }

   @JsonProperty("productArea")
   public void setProductArea(String productArea) {
      this.productArea = productArea;
   }

   @JsonProperty("productArea")
   public String getProductArea() {
      return this.productArea;
   }

   @JsonProperty("wserve")
   public void setWserve(String wserve) {
      this.wserve = wserve;
   }

   @JsonProperty("wserve")
   public String getWserve() {
      return this.wserve;
   }

   @JsonProperty("allnum")
   public void setAllnum(String allnum) {
      this.allnum = allnum;
   }

   @JsonProperty("allnum")
   public String getAllnum() {
      return this.allnum;
   }

   @JsonProperty("maxPurchQty")
   public void setMaxPurchQty(String maxPurchQty) {
      this.maxPurchQty = maxPurchQty;
   }

   @JsonProperty("maxPurchQty")
   public String getMaxPurchQty() {
      return this.maxPurchQty;
   }

   @JsonProperty("brandId")
   public void setBrandId(String brandId) {
      this.brandId = brandId;
   }

   @JsonProperty("brandId")
   public String getBrandId() {
      return this.brandId;
   }

   @JsonProperty("valuePayFirst")
   public void setValuePayFirst(String valuePayFirst) {
      this.valuePayFirst = valuePayFirst;
   }

   @JsonProperty("valuePayFirst")
   public String getValuePayFirst() {
      return this.valuePayFirst;
   }

   @JsonProperty("length")
   public void setLength(String length) {
      this.length = length;
   }

   @JsonProperty("length")
   public String getLength() {
      return this.length;
   }

   @JsonProperty("width")
   public void setWidth(String width) {
      this.width = width;
   }

   @JsonProperty("width")
   public String getWidth() {
      return this.width;
   }

   @JsonProperty("height")
   public void setHeight(String height) {
      this.height = height;
   }

   @JsonProperty("height")
   public String getHeight() {
      return this.height;
   }

   @JsonProperty("venderType")
   public void setVenderType(String venderType) {
      this.venderType = venderType;
   }

   @JsonProperty("venderType")
   public String getVenderType() {
      return this.venderType;
   }

   @JsonProperty("pname")
   public void setPname(String pname) {
      this.pname = pname;
   }

   @JsonProperty("pname")
   public String getPname() {
      return this.pname;
   }

   @JsonProperty("issn")
   public void setIssn(String issn) {
      this.issn = issn;
   }

   @JsonProperty("issn")
   public String getIssn() {
      return this.issn;
   }

   @JsonProperty("safeDays")
   public void setSafeDays(String safeDays) {
      this.safeDays = safeDays;
   }

   @JsonProperty("safeDays")
   public String getSafeDays() {
      return this.safeDays;
   }

   @JsonProperty("saleUnit")
   public void setSaleUnit(String saleUnit) {
      this.saleUnit = saleUnit;
   }

   @JsonProperty("saleUnit")
   public String getSaleUnit() {
      return this.saleUnit;
   }

   @JsonProperty("packSpecification")
   public void setPackSpecification(String packSpecification) {
      this.packSpecification = packSpecification;
   }

   @JsonProperty("packSpecification")
   public String getPackSpecification() {
      return this.packSpecification;
   }

   @JsonProperty("category")
   public void setCategory(String category) {
      this.category = category;
   }

   @JsonProperty("category")
   public String getCategory() {
      return this.category;
   }

   @JsonProperty("shopCategorys")
   public void setShopCategorys(String shopCategorys) {
      this.shopCategorys = shopCategorys;
   }

   @JsonProperty("shopCategorys")
   public String getShopCategorys() {
      return this.shopCategorys;
   }

   @JsonProperty("phone")
   public void setPhone(String phone) {
      this.phone = phone;
   }

   @JsonProperty("phone")
   public String getPhone() {
      return this.phone;
   }

   @JsonProperty("site")
   public void setSite(String site) {
      this.site = site;
   }

   @JsonProperty("site")
   public String getSite() {
      return this.site;
   }

   @JsonProperty("ebrand")
   public void setEbrand(String ebrand) {
      this.ebrand = ebrand;
   }

   @JsonProperty("ebrand")
   public String getEbrand() {
      return this.ebrand;
   }

   @JsonProperty("cbrand")
   public void setCbrand(String cbrand) {
      this.cbrand = cbrand;
   }

   @JsonProperty("cbrand")
   public String getCbrand() {
      return this.cbrand;
   }

   @JsonProperty("model")
   public void setModel(String model) {
      this.model = model;
   }

   @JsonProperty("model")
   public String getModel() {
      return this.model;
   }

   @JsonProperty("imagePath")
   public void setImagePath(String imagePath) {
      this.imagePath = imagePath;
   }

   @JsonProperty("imagePath")
   public String getImagePath() {
      return this.imagePath;
   }

   @JsonProperty("shopName")
   public void setShopName(String shopName) {
      this.shopName = shopName;
   }

   @JsonProperty("shopName")
   public String getShopName() {
      return this.shopName;
   }

   @JsonProperty("url")
   public void setUrl(String url) {
      this.url = url;
   }

   @JsonProperty("url")
   public String getUrl() {
      return this.url;
   }

   @JsonProperty("venderId")
   public void setVenderId(String venderId) {
      this.venderId = venderId;
   }

   @JsonProperty("venderId")
   public String getVenderId() {
      return this.venderId;
   }
}
