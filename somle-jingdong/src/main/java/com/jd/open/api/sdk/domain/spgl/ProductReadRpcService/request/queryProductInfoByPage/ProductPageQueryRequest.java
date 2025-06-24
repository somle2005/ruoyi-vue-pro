package com.jd.open.api.sdk.domain.spgl.ProductReadRpcService.request.queryProductInfoByPage;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class ProductPageQueryRequest implements Serializable {
   private String operatorPort;
   private String operatorName;
   private Long appId;
   private Long shopId;
   private String skuId;
   private String traceId;
   private String spuId;
   private String appName;
   private String operatorIp;
   private String tenantId;
   private Long merchantId;
   private Integer pageIndex;
   private Integer pageSize;
   private String skuCode;
   private Long firstCategoryId;
   private Long secondCategoryId;
   private Long thirdCategoryId;
   private Long fourthCategoryId;
   private Long firstShopCategory;
   private Long secondShopCategory;
   private Integer deleted;
   private Integer productStatus;

   @JsonProperty("operatorPort")
   public void setOperatorPort(String operatorPort) {
      this.operatorPort = operatorPort;
   }

   @JsonProperty("operatorPort")
   public String getOperatorPort() {
      return this.operatorPort;
   }

   @JsonProperty("operatorName")
   public void setOperatorName(String operatorName) {
      this.operatorName = operatorName;
   }

   @JsonProperty("operatorName")
   public String getOperatorName() {
      return this.operatorName;
   }

   @JsonProperty("appId")
   public void setAppId(Long appId) {
      this.appId = appId;
   }

   @JsonProperty("appId")
   public Long getAppId() {
      return this.appId;
   }

   @JsonProperty("shopId")
   public void setShopId(Long shopId) {
      this.shopId = shopId;
   }

   @JsonProperty("shopId")
   public Long getShopId() {
      return this.shopId;
   }

   @JsonProperty("skuId")
   public void setSkuId(String skuId) {
      this.skuId = skuId;
   }

   @JsonProperty("skuId")
   public String getSkuId() {
      return this.skuId;
   }

   @JsonProperty("traceId")
   public void setTraceId(String traceId) {
      this.traceId = traceId;
   }

   @JsonProperty("traceId")
   public String getTraceId() {
      return this.traceId;
   }

   @JsonProperty("spuId")
   public void setSpuId(String spuId) {
      this.spuId = spuId;
   }

   @JsonProperty("spuId")
   public String getSpuId() {
      return this.spuId;
   }

   @JsonProperty("appName")
   public void setAppName(String appName) {
      this.appName = appName;
   }

   @JsonProperty("appName")
   public String getAppName() {
      return this.appName;
   }

   @JsonProperty("operatorIp")
   public void setOperatorIp(String operatorIp) {
      this.operatorIp = operatorIp;
   }

   @JsonProperty("operatorIp")
   public String getOperatorIp() {
      return this.operatorIp;
   }

   @JsonProperty("tenantId")
   public void setTenantId(String tenantId) {
      this.tenantId = tenantId;
   }

   @JsonProperty("tenantId")
   public String getTenantId() {
      return this.tenantId;
   }

   @JsonProperty("merchantId")
   public void setMerchantId(Long merchantId) {
      this.merchantId = merchantId;
   }

   @JsonProperty("merchantId")
   public Long getMerchantId() {
      return this.merchantId;
   }

   @JsonProperty("pageIndex")
   public void setPageIndex(Integer pageIndex) {
      this.pageIndex = pageIndex;
   }

   @JsonProperty("pageIndex")
   public Integer getPageIndex() {
      return this.pageIndex;
   }

   @JsonProperty("pageSize")
   public void setPageSize(Integer pageSize) {
      this.pageSize = pageSize;
   }

   @JsonProperty("pageSize")
   public Integer getPageSize() {
      return this.pageSize;
   }

   @JsonProperty("skuCode")
   public void setSkuCode(String skuCode) {
      this.skuCode = skuCode;
   }

   @JsonProperty("skuCode")
   public String getSkuCode() {
      return this.skuCode;
   }

   @JsonProperty("firstCategoryId")
   public void setFirstCategoryId(Long firstCategoryId) {
      this.firstCategoryId = firstCategoryId;
   }

   @JsonProperty("firstCategoryId")
   public Long getFirstCategoryId() {
      return this.firstCategoryId;
   }

   @JsonProperty("secondCategoryId")
   public void setSecondCategoryId(Long secondCategoryId) {
      this.secondCategoryId = secondCategoryId;
   }

   @JsonProperty("secondCategoryId")
   public Long getSecondCategoryId() {
      return this.secondCategoryId;
   }

   @JsonProperty("thirdCategoryId")
   public void setThirdCategoryId(Long thirdCategoryId) {
      this.thirdCategoryId = thirdCategoryId;
   }

   @JsonProperty("thirdCategoryId")
   public Long getThirdCategoryId() {
      return this.thirdCategoryId;
   }

   @JsonProperty("fourthCategoryId")
   public void setFourthCategoryId(Long fourthCategoryId) {
      this.fourthCategoryId = fourthCategoryId;
   }

   @JsonProperty("fourthCategoryId")
   public Long getFourthCategoryId() {
      return this.fourthCategoryId;
   }

   @JsonProperty("firstShopCategory")
   public void setFirstShopCategory(Long firstShopCategory) {
      this.firstShopCategory = firstShopCategory;
   }

   @JsonProperty("firstShopCategory")
   public Long getFirstShopCategory() {
      return this.firstShopCategory;
   }

   @JsonProperty("secondShopCategory")
   public void setSecondShopCategory(Long secondShopCategory) {
      this.secondShopCategory = secondShopCategory;
   }

   @JsonProperty("secondShopCategory")
   public Long getSecondShopCategory() {
      return this.secondShopCategory;
   }

   @JsonProperty("deleted")
   public void setDeleted(Integer deleted) {
      this.deleted = deleted;
   }

   @JsonProperty("deleted")
   public Integer getDeleted() {
      return this.deleted;
   }

   @JsonProperty("productStatus")
   public void setProductStatus(Integer productStatus) {
      this.productStatus = productStatus;
   }

   @JsonProperty("productStatus")
   public Integer getProductStatus() {
      return this.productStatus;
   }
}
