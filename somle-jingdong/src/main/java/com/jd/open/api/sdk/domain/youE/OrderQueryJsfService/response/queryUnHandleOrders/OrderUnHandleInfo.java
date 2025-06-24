package com.jd.open.api.sdk.domain.youE.OrderQueryJsfService.response.queryUnHandleOrders;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

public class OrderUnHandleInfo implements Serializable {
   private String userCity;
   private BigDecimal serviceSkuPrice;
   private String shopUserPin;
   private String serviceSkuName;
   private String userProvince;
   private String buyShop;
   private Date buyDate;
   private String companyName;
   private String remark;
   private Integer firstServiceType;
   private String serviceCategory3;
   private String skuName;
   private String serviceCategoryId1;
   private String serviceCategoryId2;
   private String serviceCategoryId3;
   private BigDecimal serviceSettlePrice;
   private Integer shopId;
   private String mainOrderId;
   private String skuId;
   private String serviceOrderId;
   private Date createDate;
   private String category2;
   private String userTown;
   private String secondServiceTypeName;
   private String category3;
   private String brandName;
   private String orderNo;
   private String userCounty;
   private String category1;
   private Integer userProvinceId;
   private String serviceSkuId;
   private String userName;
   private Integer userTownId;
   private Integer userCityId;
   private Integer categoryId1;
   private String serviceCategory1;
   private String userAddress;
   private Integer secondServiceType;
   private Integer categoryId2;
   private String serviceCategory2;
   private Integer categoryId3;
   private String sourceType;
   private String brandId;
   private String firstServiceTypeName;
   private Integer userCountyId;
   private RecycleOrderInfo recycleInfo;
   private ProgressInfo progressInfo;
   private String mainOrderStatus;
   private String serviceOrderStatus;
   private Integer isExclusiveOrder;
   private InsuranceProgressInfo insuranceProgressInfo;
   private Integer modeType;
   private Integer originType;
   private Set<String> businessIds;
   private String shopName;

   @JsonProperty("userCity")
   public void setUserCity(String userCity) {
      this.userCity = userCity;
   }

   @JsonProperty("userCity")
   public String getUserCity() {
      return this.userCity;
   }

   @JsonProperty("serviceSkuPrice")
   public void setServiceSkuPrice(BigDecimal serviceSkuPrice) {
      this.serviceSkuPrice = serviceSkuPrice;
   }

   @JsonProperty("serviceSkuPrice")
   public BigDecimal getServiceSkuPrice() {
      return this.serviceSkuPrice;
   }

   @JsonProperty("shopUserPin")
   public void setShopUserPin(String shopUserPin) {
      this.shopUserPin = shopUserPin;
   }

   @JsonProperty("shopUserPin")
   public String getShopUserPin() {
      return this.shopUserPin;
   }

   @JsonProperty("serviceSkuName")
   public void setServiceSkuName(String serviceSkuName) {
      this.serviceSkuName = serviceSkuName;
   }

   @JsonProperty("serviceSkuName")
   public String getServiceSkuName() {
      return this.serviceSkuName;
   }

   @JsonProperty("userProvince")
   public void setUserProvince(String userProvince) {
      this.userProvince = userProvince;
   }

   @JsonProperty("userProvince")
   public String getUserProvince() {
      return this.userProvince;
   }

   @JsonProperty("buyShop")
   public void setBuyShop(String buyShop) {
      this.buyShop = buyShop;
   }

   @JsonProperty("buyShop")
   public String getBuyShop() {
      return this.buyShop;
   }

   @JsonProperty("buyDate")
   public void setBuyDate(Date buyDate) {
      this.buyDate = buyDate;
   }

   @JsonProperty("buyDate")
   public Date getBuyDate() {
      return this.buyDate;
   }

   @JsonProperty("companyName")
   public void setCompanyName(String companyName) {
      this.companyName = companyName;
   }

   @JsonProperty("companyName")
   public String getCompanyName() {
      return this.companyName;
   }

   @JsonProperty("remark")
   public void setRemark(String remark) {
      this.remark = remark;
   }

   @JsonProperty("remark")
   public String getRemark() {
      return this.remark;
   }

   @JsonProperty("firstServiceType")
   public void setFirstServiceType(Integer firstServiceType) {
      this.firstServiceType = firstServiceType;
   }

   @JsonProperty("firstServiceType")
   public Integer getFirstServiceType() {
      return this.firstServiceType;
   }

   @JsonProperty("serviceCategory3")
   public void setServiceCategory3(String serviceCategory3) {
      this.serviceCategory3 = serviceCategory3;
   }

   @JsonProperty("serviceCategory3")
   public String getServiceCategory3() {
      return this.serviceCategory3;
   }

   @JsonProperty("skuName")
   public void setSkuName(String skuName) {
      this.skuName = skuName;
   }

   @JsonProperty("skuName")
   public String getSkuName() {
      return this.skuName;
   }

   @JsonProperty("serviceCategoryId1")
   public void setServiceCategoryId1(String serviceCategoryId1) {
      this.serviceCategoryId1 = serviceCategoryId1;
   }

   @JsonProperty("serviceCategoryId1")
   public String getServiceCategoryId1() {
      return this.serviceCategoryId1;
   }

   @JsonProperty("serviceCategoryId2")
   public void setServiceCategoryId2(String serviceCategoryId2) {
      this.serviceCategoryId2 = serviceCategoryId2;
   }

   @JsonProperty("serviceCategoryId2")
   public String getServiceCategoryId2() {
      return this.serviceCategoryId2;
   }

   @JsonProperty("serviceCategoryId3")
   public void setServiceCategoryId3(String serviceCategoryId3) {
      this.serviceCategoryId3 = serviceCategoryId3;
   }

   @JsonProperty("serviceCategoryId3")
   public String getServiceCategoryId3() {
      return this.serviceCategoryId3;
   }

   @JsonProperty("serviceSettlePrice")
   public void setServiceSettlePrice(BigDecimal serviceSettlePrice) {
      this.serviceSettlePrice = serviceSettlePrice;
   }

   @JsonProperty("serviceSettlePrice")
   public BigDecimal getServiceSettlePrice() {
      return this.serviceSettlePrice;
   }

   @JsonProperty("shopId")
   public void setShopId(Integer shopId) {
      this.shopId = shopId;
   }

   @JsonProperty("shopId")
   public Integer getShopId() {
      return this.shopId;
   }

   @JsonProperty("mainOrderId")
   public void setMainOrderId(String mainOrderId) {
      this.mainOrderId = mainOrderId;
   }

   @JsonProperty("mainOrderId")
   public String getMainOrderId() {
      return this.mainOrderId;
   }

   @JsonProperty("skuId")
   public void setSkuId(String skuId) {
      this.skuId = skuId;
   }

   @JsonProperty("skuId")
   public String getSkuId() {
      return this.skuId;
   }

   @JsonProperty("serviceOrderId")
   public void setServiceOrderId(String serviceOrderId) {
      this.serviceOrderId = serviceOrderId;
   }

   @JsonProperty("serviceOrderId")
   public String getServiceOrderId() {
      return this.serviceOrderId;
   }

   @JsonProperty("createDate")
   public void setCreateDate(Date createDate) {
      this.createDate = createDate;
   }

   @JsonProperty("createDate")
   public Date getCreateDate() {
      return this.createDate;
   }

   @JsonProperty("category2")
   public void setCategory2(String category2) {
      this.category2 = category2;
   }

   @JsonProperty("category2")
   public String getCategory2() {
      return this.category2;
   }

   @JsonProperty("userTown")
   public void setUserTown(String userTown) {
      this.userTown = userTown;
   }

   @JsonProperty("userTown")
   public String getUserTown() {
      return this.userTown;
   }

   @JsonProperty("secondServiceTypeName")
   public void setSecondServiceTypeName(String secondServiceTypeName) {
      this.secondServiceTypeName = secondServiceTypeName;
   }

   @JsonProperty("secondServiceTypeName")
   public String getSecondServiceTypeName() {
      return this.secondServiceTypeName;
   }

   @JsonProperty("category3")
   public void setCategory3(String category3) {
      this.category3 = category3;
   }

   @JsonProperty("category3")
   public String getCategory3() {
      return this.category3;
   }

   @JsonProperty("brandName")
   public void setBrandName(String brandName) {
      this.brandName = brandName;
   }

   @JsonProperty("brandName")
   public String getBrandName() {
      return this.brandName;
   }

   @JsonProperty("orderNo")
   public void setOrderNo(String orderNo) {
      this.orderNo = orderNo;
   }

   @JsonProperty("orderNo")
   public String getOrderNo() {
      return this.orderNo;
   }

   @JsonProperty("userCounty")
   public void setUserCounty(String userCounty) {
      this.userCounty = userCounty;
   }

   @JsonProperty("userCounty")
   public String getUserCounty() {
      return this.userCounty;
   }

   @JsonProperty("category1")
   public void setCategory1(String category1) {
      this.category1 = category1;
   }

   @JsonProperty("category1")
   public String getCategory1() {
      return this.category1;
   }

   @JsonProperty("userProvinceId")
   public void setUserProvinceId(Integer userProvinceId) {
      this.userProvinceId = userProvinceId;
   }

   @JsonProperty("userProvinceId")
   public Integer getUserProvinceId() {
      return this.userProvinceId;
   }

   @JsonProperty("serviceSkuId")
   public void setServiceSkuId(String serviceSkuId) {
      this.serviceSkuId = serviceSkuId;
   }

   @JsonProperty("serviceSkuId")
   public String getServiceSkuId() {
      return this.serviceSkuId;
   }

   @JsonProperty("userName")
   public void setUserName(String userName) {
      this.userName = userName;
   }

   @JsonProperty("userName")
   public String getUserName() {
      return this.userName;
   }

   @JsonProperty("userTownId")
   public void setUserTownId(Integer userTownId) {
      this.userTownId = userTownId;
   }

   @JsonProperty("userTownId")
   public Integer getUserTownId() {
      return this.userTownId;
   }

   @JsonProperty("userCityId")
   public void setUserCityId(Integer userCityId) {
      this.userCityId = userCityId;
   }

   @JsonProperty("userCityId")
   public Integer getUserCityId() {
      return this.userCityId;
   }

   @JsonProperty("categoryId1")
   public void setCategoryId1(Integer categoryId1) {
      this.categoryId1 = categoryId1;
   }

   @JsonProperty("categoryId1")
   public Integer getCategoryId1() {
      return this.categoryId1;
   }

   @JsonProperty("serviceCategory1")
   public void setServiceCategory1(String serviceCategory1) {
      this.serviceCategory1 = serviceCategory1;
   }

   @JsonProperty("serviceCategory1")
   public String getServiceCategory1() {
      return this.serviceCategory1;
   }

   @JsonProperty("userAddress")
   public void setUserAddress(String userAddress) {
      this.userAddress = userAddress;
   }

   @JsonProperty("userAddress")
   public String getUserAddress() {
      return this.userAddress;
   }

   @JsonProperty("secondServiceType")
   public void setSecondServiceType(Integer secondServiceType) {
      this.secondServiceType = secondServiceType;
   }

   @JsonProperty("secondServiceType")
   public Integer getSecondServiceType() {
      return this.secondServiceType;
   }

   @JsonProperty("categoryId2")
   public void setCategoryId2(Integer categoryId2) {
      this.categoryId2 = categoryId2;
   }

   @JsonProperty("categoryId2")
   public Integer getCategoryId2() {
      return this.categoryId2;
   }

   @JsonProperty("serviceCategory2")
   public void setServiceCategory2(String serviceCategory2) {
      this.serviceCategory2 = serviceCategory2;
   }

   @JsonProperty("serviceCategory2")
   public String getServiceCategory2() {
      return this.serviceCategory2;
   }

   @JsonProperty("categoryId3")
   public void setCategoryId3(Integer categoryId3) {
      this.categoryId3 = categoryId3;
   }

   @JsonProperty("categoryId3")
   public Integer getCategoryId3() {
      return this.categoryId3;
   }

   @JsonProperty("sourceType")
   public void setSourceType(String sourceType) {
      this.sourceType = sourceType;
   }

   @JsonProperty("sourceType")
   public String getSourceType() {
      return this.sourceType;
   }

   @JsonProperty("brandId")
   public void setBrandId(String brandId) {
      this.brandId = brandId;
   }

   @JsonProperty("brandId")
   public String getBrandId() {
      return this.brandId;
   }

   @JsonProperty("firstServiceTypeName")
   public void setFirstServiceTypeName(String firstServiceTypeName) {
      this.firstServiceTypeName = firstServiceTypeName;
   }

   @JsonProperty("firstServiceTypeName")
   public String getFirstServiceTypeName() {
      return this.firstServiceTypeName;
   }

   @JsonProperty("userCountyId")
   public void setUserCountyId(Integer userCountyId) {
      this.userCountyId = userCountyId;
   }

   @JsonProperty("userCountyId")
   public Integer getUserCountyId() {
      return this.userCountyId;
   }

   @JsonProperty("recycleInfo")
   public void setRecycleInfo(RecycleOrderInfo recycleInfo) {
      this.recycleInfo = recycleInfo;
   }

   @JsonProperty("recycleInfo")
   public RecycleOrderInfo getRecycleInfo() {
      return this.recycleInfo;
   }

   @JsonProperty("progressInfo")
   public void setProgressInfo(ProgressInfo progressInfo) {
      this.progressInfo = progressInfo;
   }

   @JsonProperty("progressInfo")
   public ProgressInfo getProgressInfo() {
      return this.progressInfo;
   }

   @JsonProperty("mainOrderStatus")
   public void setMainOrderStatus(String mainOrderStatus) {
      this.mainOrderStatus = mainOrderStatus;
   }

   @JsonProperty("mainOrderStatus")
   public String getMainOrderStatus() {
      return this.mainOrderStatus;
   }

   @JsonProperty("serviceOrderStatus")
   public void setServiceOrderStatus(String serviceOrderStatus) {
      this.serviceOrderStatus = serviceOrderStatus;
   }

   @JsonProperty("serviceOrderStatus")
   public String getServiceOrderStatus() {
      return this.serviceOrderStatus;
   }

   @JsonProperty("isExclusiveOrder")
   public void setIsExclusiveOrder(Integer isExclusiveOrder) {
      this.isExclusiveOrder = isExclusiveOrder;
   }

   @JsonProperty("isExclusiveOrder")
   public Integer getIsExclusiveOrder() {
      return this.isExclusiveOrder;
   }

   @JsonProperty("insuranceProgressInfo")
   public void setInsuranceProgressInfo(InsuranceProgressInfo insuranceProgressInfo) {
      this.insuranceProgressInfo = insuranceProgressInfo;
   }

   @JsonProperty("insuranceProgressInfo")
   public InsuranceProgressInfo getInsuranceProgressInfo() {
      return this.insuranceProgressInfo;
   }

   @JsonProperty("modeType")
   public void setModeType(Integer modeType) {
      this.modeType = modeType;
   }

   @JsonProperty("modeType")
   public Integer getModeType() {
      return this.modeType;
   }

   @JsonProperty("originType")
   public void setOriginType(Integer originType) {
      this.originType = originType;
   }

   @JsonProperty("originType")
   public Integer getOriginType() {
      return this.originType;
   }

   @JsonProperty("businessIds")
   public void setBusinessIds(Set<String> businessIds) {
      this.businessIds = businessIds;
   }

   @JsonProperty("businessIds")
   public Set<String> getBusinessIds() {
      return this.businessIds;
   }

   @JsonProperty("shopName")
   public void setShopName(String shopName) {
      this.shopName = shopName;
   }

   @JsonProperty("shopName")
   public String getShopName() {
      return this.shopName;
   }
}
