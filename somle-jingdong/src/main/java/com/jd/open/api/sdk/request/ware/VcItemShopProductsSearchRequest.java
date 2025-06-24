package com.jd.open.api.sdk.request.ware;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ware.VcItemShopProductsSearchResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class VcItemShopProductsSearchRequest extends AbstractRequest implements JdRequest<VcItemShopProductsSearchResponse> {
   private Integer orderType;
   private String productId;
   private String createdEndTime;
   private String modifiedStartTime;
   private Integer skuStatus;
   private int pageSize;
   private int pageNum;
   private Integer thirdCategoryId;
   private Integer rootCategoryId;
   private String skuName;
   private Integer lastCategoryId;
   private String createdStartTime;
   private Integer brandId;
   private Integer secondCategoryId;
   private String modifiedEndTime;

   public void setOrderType(Integer orderType) {
      this.orderType = orderType;
   }

   public Integer getOrderType() {
      return this.orderType;
   }

   public void setProductId(String productId) {
      this.productId = productId;
   }

   public String getProductId() {
      return this.productId;
   }

   public void setCreatedEndTime(String createdEndTime) {
      this.createdEndTime = createdEndTime;
   }

   public String getCreatedEndTime() {
      return this.createdEndTime;
   }

   public void setModifiedStartTime(String modifiedStartTime) {
      this.modifiedStartTime = modifiedStartTime;
   }

   public String getModifiedStartTime() {
      return this.modifiedStartTime;
   }

   public void setSkuStatus(Integer skuStatus) {
      this.skuStatus = skuStatus;
   }

   public Integer getSkuStatus() {
      return this.skuStatus;
   }

   public void setPageSize(int pageSize) {
      this.pageSize = pageSize;
   }

   public int getPageSize() {
      return this.pageSize;
   }

   public void setPageNum(int pageNum) {
      this.pageNum = pageNum;
   }

   public int getPageNum() {
      return this.pageNum;
   }

   public void setThirdCategoryId(Integer thirdCategoryId) {
      this.thirdCategoryId = thirdCategoryId;
   }

   public Integer getThirdCategoryId() {
      return this.thirdCategoryId;
   }

   public void setRootCategoryId(Integer rootCategoryId) {
      this.rootCategoryId = rootCategoryId;
   }

   public Integer getRootCategoryId() {
      return this.rootCategoryId;
   }

   public void setSkuName(String skuName) {
      this.skuName = skuName;
   }

   public String getSkuName() {
      return this.skuName;
   }

   public void setLastCategoryId(Integer lastCategoryId) {
      this.lastCategoryId = lastCategoryId;
   }

   public Integer getLastCategoryId() {
      return this.lastCategoryId;
   }

   public void setCreatedStartTime(String createdStartTime) {
      this.createdStartTime = createdStartTime;
   }

   public String getCreatedStartTime() {
      return this.createdStartTime;
   }

   public void setBrandId(Integer brandId) {
      this.brandId = brandId;
   }

   public Integer getBrandId() {
      return this.brandId;
   }

   public void setSecondCategoryId(Integer secondCategoryId) {
      this.secondCategoryId = secondCategoryId;
   }

   public Integer getSecondCategoryId() {
      return this.secondCategoryId;
   }

   public void setModifiedEndTime(String modifiedEndTime) {
      this.modifiedEndTime = modifiedEndTime;
   }

   public String getModifiedEndTime() {
      return this.modifiedEndTime;
   }

   public String getApiMethod() {
      return "jingdong.vc.item.shop.products.search";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("orderType", this.orderType);
      pmap.put("productId", this.productId);
      pmap.put("createdEndTime", this.createdEndTime);
      pmap.put("modifiedStartTime", this.modifiedStartTime);
      pmap.put("skuStatus", this.skuStatus);
      pmap.put("pageSize", this.pageSize);
      pmap.put("pageNum", this.pageNum);
      pmap.put("thirdCategoryId", this.thirdCategoryId);
      pmap.put("rootCategoryId", this.rootCategoryId);
      pmap.put("skuName", this.skuName);
      pmap.put("lastCategoryId", this.lastCategoryId);
      pmap.put("createdStartTime", this.createdStartTime);
      pmap.put("brandId", this.brandId);
      pmap.put("secondCategoryId", this.secondCategoryId);
      pmap.put("modifiedEndTime", this.modifiedEndTime);
      return JsonUtil.toJson(pmap);
   }

   public Class<VcItemShopProductsSearchResponse> getResponseClass() {
      return VcItemShopProductsSearchResponse.class;
   }
}
