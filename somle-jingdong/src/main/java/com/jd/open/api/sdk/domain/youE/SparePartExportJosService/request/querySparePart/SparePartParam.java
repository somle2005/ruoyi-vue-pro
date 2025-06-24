package com.jd.open.api.sdk.domain.youE.SparePartExportJosService.request.querySparePart;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class SparePartParam implements Serializable {
   private String brandName;
   private Integer secondCatId;
   private String fourthCatName;
   private Integer pageSize;
   private String secondCatName;
   private String firstCatName;
   private Integer thirdCatId;
   private Integer pageNo;
   private Integer firstCatId;
   private Integer brandId;
   private List<Integer> providerIds;
   private Integer fourthCatId;
   private String thirdCatName;
   private String jdGoodsCode;
   private String goodsCode;
   private String goodsName;
   private String productModel;

   @JsonProperty("brandName")
   public void setBrandName(String brandName) {
      this.brandName = brandName;
   }

   @JsonProperty("brandName")
   public String getBrandName() {
      return this.brandName;
   }

   @JsonProperty("secondCatId")
   public void setSecondCatId(Integer secondCatId) {
      this.secondCatId = secondCatId;
   }

   @JsonProperty("secondCatId")
   public Integer getSecondCatId() {
      return this.secondCatId;
   }

   @JsonProperty("fourthCatName")
   public void setFourthCatName(String fourthCatName) {
      this.fourthCatName = fourthCatName;
   }

   @JsonProperty("fourthCatName")
   public String getFourthCatName() {
      return this.fourthCatName;
   }

   @JsonProperty("pageSize")
   public void setPageSize(Integer pageSize) {
      this.pageSize = pageSize;
   }

   @JsonProperty("pageSize")
   public Integer getPageSize() {
      return this.pageSize;
   }

   @JsonProperty("secondCatName")
   public void setSecondCatName(String secondCatName) {
      this.secondCatName = secondCatName;
   }

   @JsonProperty("secondCatName")
   public String getSecondCatName() {
      return this.secondCatName;
   }

   @JsonProperty("firstCatName")
   public void setFirstCatName(String firstCatName) {
      this.firstCatName = firstCatName;
   }

   @JsonProperty("firstCatName")
   public String getFirstCatName() {
      return this.firstCatName;
   }

   @JsonProperty("thirdCatId")
   public void setThirdCatId(Integer thirdCatId) {
      this.thirdCatId = thirdCatId;
   }

   @JsonProperty("thirdCatId")
   public Integer getThirdCatId() {
      return this.thirdCatId;
   }

   @JsonProperty("pageNo")
   public void setPageNo(Integer pageNo) {
      this.pageNo = pageNo;
   }

   @JsonProperty("pageNo")
   public Integer getPageNo() {
      return this.pageNo;
   }

   @JsonProperty("firstCatId")
   public void setFirstCatId(Integer firstCatId) {
      this.firstCatId = firstCatId;
   }

   @JsonProperty("firstCatId")
   public Integer getFirstCatId() {
      return this.firstCatId;
   }

   @JsonProperty("brandId")
   public void setBrandId(Integer brandId) {
      this.brandId = brandId;
   }

   @JsonProperty("brandId")
   public Integer getBrandId() {
      return this.brandId;
   }

   @JsonProperty("providerIds")
   public void setProviderIds(List<Integer> providerIds) {
      this.providerIds = providerIds;
   }

   @JsonProperty("providerIds")
   public List<Integer> getProviderIds() {
      return this.providerIds;
   }

   @JsonProperty("fourthCatId")
   public void setFourthCatId(Integer fourthCatId) {
      this.fourthCatId = fourthCatId;
   }

   @JsonProperty("fourthCatId")
   public Integer getFourthCatId() {
      return this.fourthCatId;
   }

   @JsonProperty("thirdCatName")
   public void setThirdCatName(String thirdCatName) {
      this.thirdCatName = thirdCatName;
   }

   @JsonProperty("thirdCatName")
   public String getThirdCatName() {
      return this.thirdCatName;
   }

   @JsonProperty("jdGoodsCode")
   public void setJdGoodsCode(String jdGoodsCode) {
      this.jdGoodsCode = jdGoodsCode;
   }

   @JsonProperty("jdGoodsCode")
   public String getJdGoodsCode() {
      return this.jdGoodsCode;
   }

   @JsonProperty("goodsCode")
   public void setGoodsCode(String goodsCode) {
      this.goodsCode = goodsCode;
   }

   @JsonProperty("goodsCode")
   public String getGoodsCode() {
      return this.goodsCode;
   }

   @JsonProperty("goodsName")
   public void setGoodsName(String goodsName) {
      this.goodsName = goodsName;
   }

   @JsonProperty("goodsName")
   public String getGoodsName() {
      return this.goodsName;
   }

   @JsonProperty("productModel")
   public void setProductModel(String productModel) {
      this.productModel = productModel;
   }

   @JsonProperty("productModel")
   public String getProductModel() {
      return this.productModel;
   }
}
