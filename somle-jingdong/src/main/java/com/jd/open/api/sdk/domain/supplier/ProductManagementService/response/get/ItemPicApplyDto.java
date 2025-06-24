package com.jd.open.api.sdk.domain.supplier.ProductManagementService.response.get;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class ItemPicApplyDto implements Serializable {
   private String wareId;
   private String name;
   private Integer brandId;
   private Integer categoryId;
   private String vendorCode;
   private List<ItemPicSkuDto> skuList;
   private List<ItemPicSkuDtoLong> skuListLong;
   private List<ItemPicSkuDtoLucency> skuListLucency;
   private String brandName;
   private Integer saleState;
   private String categoryName;
   private List<ItemPicSkuDtoGuide> skuListGuide;

   @JsonProperty("ware_id")
   public void setWareId(String wareId) {
      this.wareId = wareId;
   }

   @JsonProperty("ware_id")
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

   @JsonProperty("brand_id")
   public void setBrandId(Integer brandId) {
      this.brandId = brandId;
   }

   @JsonProperty("brand_id")
   public Integer getBrandId() {
      return this.brandId;
   }

   @JsonProperty("category_id")
   public void setCategoryId(Integer categoryId) {
      this.categoryId = categoryId;
   }

   @JsonProperty("category_id")
   public Integer getCategoryId() {
      return this.categoryId;
   }

   @JsonProperty("vendor_code")
   public void setVendorCode(String vendorCode) {
      this.vendorCode = vendorCode;
   }

   @JsonProperty("vendor_code")
   public String getVendorCode() {
      return this.vendorCode;
   }

   @JsonProperty("sku_list")
   public void setSkuList(List<ItemPicSkuDto> skuList) {
      this.skuList = skuList;
   }

   @JsonProperty("sku_list")
   public List<ItemPicSkuDto> getSkuList() {
      return this.skuList;
   }

   @JsonProperty("sku_list_long")
   public void setSkuListLong(List<ItemPicSkuDtoLong> skuListLong) {
      this.skuListLong = skuListLong;
   }

   @JsonProperty("sku_list_long")
   public List<ItemPicSkuDtoLong> getSkuListLong() {
      return this.skuListLong;
   }

   @JsonProperty("sku_list_lucency")
   public void setSkuListLucency(List<ItemPicSkuDtoLucency> skuListLucency) {
      this.skuListLucency = skuListLucency;
   }

   @JsonProperty("sku_list_lucency")
   public List<ItemPicSkuDtoLucency> getSkuListLucency() {
      return this.skuListLucency;
   }

   @JsonProperty("brand_name")
   public void setBrandName(String brandName) {
      this.brandName = brandName;
   }

   @JsonProperty("brand_name")
   public String getBrandName() {
      return this.brandName;
   }

   @JsonProperty("sale_state")
   public void setSaleState(Integer saleState) {
      this.saleState = saleState;
   }

   @JsonProperty("sale_state")
   public Integer getSaleState() {
      return this.saleState;
   }

   @JsonProperty("category_name")
   public void setCategoryName(String categoryName) {
      this.categoryName = categoryName;
   }

   @JsonProperty("category_name")
   public String getCategoryName() {
      return this.categoryName;
   }

   @JsonProperty("sku_list_guide")
   public void setSkuListGuide(List<ItemPicSkuDtoGuide> skuListGuide) {
      this.skuListGuide = skuListGuide;
   }

   @JsonProperty("sku_list_guide")
   public List<ItemPicSkuDtoGuide> getSkuListGuide() {
      return this.skuListGuide;
   }
}
