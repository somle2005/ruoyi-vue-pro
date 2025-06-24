package com.jd.open.api.sdk.domain.youE.BizOrderDetailsJsfService.response.queryBizOrderDetails;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class OrderDetailsVo implements Serializable {
   private String businessSkuName;
   private String brandName;
   private String orderNo;
   private String saleOrderNo;
   private String secondLevelCat;
   private String wishBookDate;
   private String buyShop;
   private Date buyDate;
   private String remark;
   private String thirdLevelCat;
   private String userName;
   private String mainSku;
   private String userAddress;
   private String userMobile;
   private String firstLevelCat;
   private String mainSkuName;
   private Integer suitBuyStatus;
   private String businessSku;
   private Date createDate;
   private Date completeDate;
   private RecycleInfo recycleInfo;
   private String userProvince;
   private Integer userProvinceId;
   private String userCity;
   private Integer userCityId;
   private String userCounty;
   private Integer userCountyId;
   private String userTown;
   private Integer userTownId;
   private Integer siteId;
   private String siteName;
   private String barcode1;
   private String barcode2;
   private List<String> inCodeList;
   private List<String> outCodeList;
   private List<String> finishPicList;
   private String mainBrandId;
   private String mainBrandName;
   private String upperDoorPositionAddress;
   private String upperDoorUserHomeDistance;
   private String companyName;
   private String engineerName;
   private String phoneBindNumber;
   private String mainOrderId;
   private String secondServiceTypeName;
   private String outDate;
   private String mainSkuFirstLevelCatId;
   private String mainSkuSecondLevelCatId;
   private String mainSkuThirdLevelCatId;
   private String mainSkuFirstLevelCat;
   private String mainSkuSecondLevelCat;
   private String mainSkuThirdLevelCat;
   private String deliverArriveDate;
   private String reserveSetupTime;
   private String firstBookOperateDate;
   private String firstBookDate;
   private String lastBookOperateDate;
   private String lastBookDate;
   private String arriveTime;
   private FeeInfo feeInfo;
   private ServiceReportVo serviceReportInfo;
   private Integer orderStat;
   private LngLatVo lngLatInfo;
   private String secondServiceTypeId;
   private Integer shopId;
   private String shopName;
   private Integer engineerId;
   private String siteCode;
   private String orderExpectedReceiptTime;
   private CallRecord callRecord;

   @JsonProperty("businessSkuName")
   public void setBusinessSkuName(String businessSkuName) {
      this.businessSkuName = businessSkuName;
   }

   @JsonProperty("businessSkuName")
   public String getBusinessSkuName() {
      return this.businessSkuName;
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

   @JsonProperty("saleOrderNo")
   public void setSaleOrderNo(String saleOrderNo) {
      this.saleOrderNo = saleOrderNo;
   }

   @JsonProperty("saleOrderNo")
   public String getSaleOrderNo() {
      return this.saleOrderNo;
   }

   @JsonProperty("secondLevelCat")
   public void setSecondLevelCat(String secondLevelCat) {
      this.secondLevelCat = secondLevelCat;
   }

   @JsonProperty("secondLevelCat")
   public String getSecondLevelCat() {
      return this.secondLevelCat;
   }

   @JsonProperty("wishBookDate")
   public void setWishBookDate(String wishBookDate) {
      this.wishBookDate = wishBookDate;
   }

   @JsonProperty("wishBookDate")
   public String getWishBookDate() {
      return this.wishBookDate;
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

   @JsonProperty("remark")
   public void setRemark(String remark) {
      this.remark = remark;
   }

   @JsonProperty("remark")
   public String getRemark() {
      return this.remark;
   }

   @JsonProperty("thirdLevelCat")
   public void setThirdLevelCat(String thirdLevelCat) {
      this.thirdLevelCat = thirdLevelCat;
   }

   @JsonProperty("thirdLevelCat")
   public String getThirdLevelCat() {
      return this.thirdLevelCat;
   }

   @JsonProperty("userName")
   public void setUserName(String userName) {
      this.userName = userName;
   }

   @JsonProperty("userName")
   public String getUserName() {
      return this.userName;
   }

   @JsonProperty("mainSku")
   public void setMainSku(String mainSku) {
      this.mainSku = mainSku;
   }

   @JsonProperty("mainSku")
   public String getMainSku() {
      return this.mainSku;
   }

   @JsonProperty("userAddress")
   public void setUserAddress(String userAddress) {
      this.userAddress = userAddress;
   }

   @JsonProperty("userAddress")
   public String getUserAddress() {
      return this.userAddress;
   }

   @JsonProperty("userMobile")
   public void setUserMobile(String userMobile) {
      this.userMobile = userMobile;
   }

   @JsonProperty("userMobile")
   public String getUserMobile() {
      return this.userMobile;
   }

   @JsonProperty("firstLevelCat")
   public void setFirstLevelCat(String firstLevelCat) {
      this.firstLevelCat = firstLevelCat;
   }

   @JsonProperty("firstLevelCat")
   public String getFirstLevelCat() {
      return this.firstLevelCat;
   }

   @JsonProperty("mainSkuName")
   public void setMainSkuName(String mainSkuName) {
      this.mainSkuName = mainSkuName;
   }

   @JsonProperty("mainSkuName")
   public String getMainSkuName() {
      return this.mainSkuName;
   }

   @JsonProperty("suitBuyStatus")
   public void setSuitBuyStatus(Integer suitBuyStatus) {
      this.suitBuyStatus = suitBuyStatus;
   }

   @JsonProperty("suitBuyStatus")
   public Integer getSuitBuyStatus() {
      return this.suitBuyStatus;
   }

   @JsonProperty("businessSku")
   public void setBusinessSku(String businessSku) {
      this.businessSku = businessSku;
   }

   @JsonProperty("businessSku")
   public String getBusinessSku() {
      return this.businessSku;
   }

   @JsonProperty("createDate")
   public void setCreateDate(Date createDate) {
      this.createDate = createDate;
   }

   @JsonProperty("createDate")
   public Date getCreateDate() {
      return this.createDate;
   }

   @JsonProperty("completeDate")
   public void setCompleteDate(Date completeDate) {
      this.completeDate = completeDate;
   }

   @JsonProperty("completeDate")
   public Date getCompleteDate() {
      return this.completeDate;
   }

   @JsonProperty("recycleInfo")
   public void setRecycleInfo(RecycleInfo recycleInfo) {
      this.recycleInfo = recycleInfo;
   }

   @JsonProperty("recycleInfo")
   public RecycleInfo getRecycleInfo() {
      return this.recycleInfo;
   }

   @JsonProperty("userProvince")
   public void setUserProvince(String userProvince) {
      this.userProvince = userProvince;
   }

   @JsonProperty("userProvince")
   public String getUserProvince() {
      return this.userProvince;
   }

   @JsonProperty("userProvinceId")
   public void setUserProvinceId(Integer userProvinceId) {
      this.userProvinceId = userProvinceId;
   }

   @JsonProperty("userProvinceId")
   public Integer getUserProvinceId() {
      return this.userProvinceId;
   }

   @JsonProperty("userCity")
   public void setUserCity(String userCity) {
      this.userCity = userCity;
   }

   @JsonProperty("userCity")
   public String getUserCity() {
      return this.userCity;
   }

   @JsonProperty("userCityId")
   public void setUserCityId(Integer userCityId) {
      this.userCityId = userCityId;
   }

   @JsonProperty("userCityId")
   public Integer getUserCityId() {
      return this.userCityId;
   }

   @JsonProperty("userCounty")
   public void setUserCounty(String userCounty) {
      this.userCounty = userCounty;
   }

   @JsonProperty("userCounty")
   public String getUserCounty() {
      return this.userCounty;
   }

   @JsonProperty("userCountyId")
   public void setUserCountyId(Integer userCountyId) {
      this.userCountyId = userCountyId;
   }

   @JsonProperty("userCountyId")
   public Integer getUserCountyId() {
      return this.userCountyId;
   }

   @JsonProperty("userTown")
   public void setUserTown(String userTown) {
      this.userTown = userTown;
   }

   @JsonProperty("userTown")
   public String getUserTown() {
      return this.userTown;
   }

   @JsonProperty("userTownId")
   public void setUserTownId(Integer userTownId) {
      this.userTownId = userTownId;
   }

   @JsonProperty("userTownId")
   public Integer getUserTownId() {
      return this.userTownId;
   }

   @JsonProperty("siteId")
   public void setSiteId(Integer siteId) {
      this.siteId = siteId;
   }

   @JsonProperty("siteId")
   public Integer getSiteId() {
      return this.siteId;
   }

   @JsonProperty("siteName")
   public void setSiteName(String siteName) {
      this.siteName = siteName;
   }

   @JsonProperty("siteName")
   public String getSiteName() {
      return this.siteName;
   }

   @JsonProperty("barcode1")
   public void setBarcode1(String barcode1) {
      this.barcode1 = barcode1;
   }

   @JsonProperty("barcode1")
   public String getBarcode1() {
      return this.barcode1;
   }

   @JsonProperty("barcode2")
   public void setBarcode2(String barcode2) {
      this.barcode2 = barcode2;
   }

   @JsonProperty("barcode2")
   public String getBarcode2() {
      return this.barcode2;
   }

   @JsonProperty("inCodeList")
   public void setInCodeList(List<String> inCodeList) {
      this.inCodeList = inCodeList;
   }

   @JsonProperty("inCodeList")
   public List<String> getInCodeList() {
      return this.inCodeList;
   }

   @JsonProperty("outCodeList")
   public void setOutCodeList(List<String> outCodeList) {
      this.outCodeList = outCodeList;
   }

   @JsonProperty("outCodeList")
   public List<String> getOutCodeList() {
      return this.outCodeList;
   }

   @JsonProperty("finishPicList")
   public void setFinishPicList(List<String> finishPicList) {
      this.finishPicList = finishPicList;
   }

   @JsonProperty("finishPicList")
   public List<String> getFinishPicList() {
      return this.finishPicList;
   }

   @JsonProperty("mainBrandId")
   public void setMainBrandId(String mainBrandId) {
      this.mainBrandId = mainBrandId;
   }

   @JsonProperty("mainBrandId")
   public String getMainBrandId() {
      return this.mainBrandId;
   }

   @JsonProperty("mainBrandName")
   public void setMainBrandName(String mainBrandName) {
      this.mainBrandName = mainBrandName;
   }

   @JsonProperty("mainBrandName")
   public String getMainBrandName() {
      return this.mainBrandName;
   }

   @JsonProperty("upperDoorPositionAddress")
   public void setUpperDoorPositionAddress(String upperDoorPositionAddress) {
      this.upperDoorPositionAddress = upperDoorPositionAddress;
   }

   @JsonProperty("upperDoorPositionAddress")
   public String getUpperDoorPositionAddress() {
      return this.upperDoorPositionAddress;
   }

   @JsonProperty("upperDoorUserHomeDistance")
   public void setUpperDoorUserHomeDistance(String upperDoorUserHomeDistance) {
      this.upperDoorUserHomeDistance = upperDoorUserHomeDistance;
   }

   @JsonProperty("upperDoorUserHomeDistance")
   public String getUpperDoorUserHomeDistance() {
      return this.upperDoorUserHomeDistance;
   }

   @JsonProperty("companyName")
   public void setCompanyName(String companyName) {
      this.companyName = companyName;
   }

   @JsonProperty("companyName")
   public String getCompanyName() {
      return this.companyName;
   }

   @JsonProperty("engineerName")
   public void setEngineerName(String engineerName) {
      this.engineerName = engineerName;
   }

   @JsonProperty("engineerName")
   public String getEngineerName() {
      return this.engineerName;
   }

   @JsonProperty("phoneBindNumber")
   public void setPhoneBindNumber(String phoneBindNumber) {
      this.phoneBindNumber = phoneBindNumber;
   }

   @JsonProperty("phoneBindNumber")
   public String getPhoneBindNumber() {
      return this.phoneBindNumber;
   }

   @JsonProperty("mainOrderId")
   public void setMainOrderId(String mainOrderId) {
      this.mainOrderId = mainOrderId;
   }

   @JsonProperty("mainOrderId")
   public String getMainOrderId() {
      return this.mainOrderId;
   }

   @JsonProperty("secondServiceTypeName")
   public void setSecondServiceTypeName(String secondServiceTypeName) {
      this.secondServiceTypeName = secondServiceTypeName;
   }

   @JsonProperty("secondServiceTypeName")
   public String getSecondServiceTypeName() {
      return this.secondServiceTypeName;
   }

   @JsonProperty("outDate")
   public void setOutDate(String outDate) {
      this.outDate = outDate;
   }

   @JsonProperty("outDate")
   public String getOutDate() {
      return this.outDate;
   }

   @JsonProperty("mainSkuFirstLevelCatId")
   public void setMainSkuFirstLevelCatId(String mainSkuFirstLevelCatId) {
      this.mainSkuFirstLevelCatId = mainSkuFirstLevelCatId;
   }

   @JsonProperty("mainSkuFirstLevelCatId")
   public String getMainSkuFirstLevelCatId() {
      return this.mainSkuFirstLevelCatId;
   }

   @JsonProperty("mainSkuSecondLevelCatId")
   public void setMainSkuSecondLevelCatId(String mainSkuSecondLevelCatId) {
      this.mainSkuSecondLevelCatId = mainSkuSecondLevelCatId;
   }

   @JsonProperty("mainSkuSecondLevelCatId")
   public String getMainSkuSecondLevelCatId() {
      return this.mainSkuSecondLevelCatId;
   }

   @JsonProperty("mainSkuThirdLevelCatId")
   public void setMainSkuThirdLevelCatId(String mainSkuThirdLevelCatId) {
      this.mainSkuThirdLevelCatId = mainSkuThirdLevelCatId;
   }

   @JsonProperty("mainSkuThirdLevelCatId")
   public String getMainSkuThirdLevelCatId() {
      return this.mainSkuThirdLevelCatId;
   }

   @JsonProperty("mainSkuFirstLevelCat")
   public void setMainSkuFirstLevelCat(String mainSkuFirstLevelCat) {
      this.mainSkuFirstLevelCat = mainSkuFirstLevelCat;
   }

   @JsonProperty("mainSkuFirstLevelCat")
   public String getMainSkuFirstLevelCat() {
      return this.mainSkuFirstLevelCat;
   }

   @JsonProperty("mainSkuSecondLevelCat")
   public void setMainSkuSecondLevelCat(String mainSkuSecondLevelCat) {
      this.mainSkuSecondLevelCat = mainSkuSecondLevelCat;
   }

   @JsonProperty("mainSkuSecondLevelCat")
   public String getMainSkuSecondLevelCat() {
      return this.mainSkuSecondLevelCat;
   }

   @JsonProperty("mainSkuThirdLevelCat")
   public void setMainSkuThirdLevelCat(String mainSkuThirdLevelCat) {
      this.mainSkuThirdLevelCat = mainSkuThirdLevelCat;
   }

   @JsonProperty("mainSkuThirdLevelCat")
   public String getMainSkuThirdLevelCat() {
      return this.mainSkuThirdLevelCat;
   }

   @JsonProperty("deliverArriveDate")
   public void setDeliverArriveDate(String deliverArriveDate) {
      this.deliverArriveDate = deliverArriveDate;
   }

   @JsonProperty("deliverArriveDate")
   public String getDeliverArriveDate() {
      return this.deliverArriveDate;
   }

   @JsonProperty("reserveSetupTime")
   public void setReserveSetupTime(String reserveSetupTime) {
      this.reserveSetupTime = reserveSetupTime;
   }

   @JsonProperty("reserveSetupTime")
   public String getReserveSetupTime() {
      return this.reserveSetupTime;
   }

   @JsonProperty("firstBookOperateDate")
   public void setFirstBookOperateDate(String firstBookOperateDate) {
      this.firstBookOperateDate = firstBookOperateDate;
   }

   @JsonProperty("firstBookOperateDate")
   public String getFirstBookOperateDate() {
      return this.firstBookOperateDate;
   }

   @JsonProperty("firstBookDate")
   public void setFirstBookDate(String firstBookDate) {
      this.firstBookDate = firstBookDate;
   }

   @JsonProperty("firstBookDate")
   public String getFirstBookDate() {
      return this.firstBookDate;
   }

   @JsonProperty("lastBookOperateDate")
   public void setLastBookOperateDate(String lastBookOperateDate) {
      this.lastBookOperateDate = lastBookOperateDate;
   }

   @JsonProperty("lastBookOperateDate")
   public String getLastBookOperateDate() {
      return this.lastBookOperateDate;
   }

   @JsonProperty("lastBookDate")
   public void setLastBookDate(String lastBookDate) {
      this.lastBookDate = lastBookDate;
   }

   @JsonProperty("lastBookDate")
   public String getLastBookDate() {
      return this.lastBookDate;
   }

   @JsonProperty("arriveTime")
   public void setArriveTime(String arriveTime) {
      this.arriveTime = arriveTime;
   }

   @JsonProperty("arriveTime")
   public String getArriveTime() {
      return this.arriveTime;
   }

   @JsonProperty("feeInfo")
   public void setFeeInfo(FeeInfo feeInfo) {
      this.feeInfo = feeInfo;
   }

   @JsonProperty("feeInfo")
   public FeeInfo getFeeInfo() {
      return this.feeInfo;
   }

   @JsonProperty("serviceReportInfo")
   public void setServiceReportInfo(ServiceReportVo serviceReportInfo) {
      this.serviceReportInfo = serviceReportInfo;
   }

   @JsonProperty("serviceReportInfo")
   public ServiceReportVo getServiceReportInfo() {
      return this.serviceReportInfo;
   }

   @JsonProperty("orderStat")
   public void setOrderStat(Integer orderStat) {
      this.orderStat = orderStat;
   }

   @JsonProperty("orderStat")
   public Integer getOrderStat() {
      return this.orderStat;
   }

   @JsonProperty("lngLatInfo")
   public void setLngLatInfo(LngLatVo lngLatInfo) {
      this.lngLatInfo = lngLatInfo;
   }

   @JsonProperty("lngLatInfo")
   public LngLatVo getLngLatInfo() {
      return this.lngLatInfo;
   }

   @JsonProperty("secondServiceTypeId")
   public void setSecondServiceTypeId(String secondServiceTypeId) {
      this.secondServiceTypeId = secondServiceTypeId;
   }

   @JsonProperty("secondServiceTypeId")
   public String getSecondServiceTypeId() {
      return this.secondServiceTypeId;
   }

   @JsonProperty("shopId")
   public void setShopId(Integer shopId) {
      this.shopId = shopId;
   }

   @JsonProperty("shopId")
   public Integer getShopId() {
      return this.shopId;
   }

   @JsonProperty("shopName")
   public void setShopName(String shopName) {
      this.shopName = shopName;
   }

   @JsonProperty("shopName")
   public String getShopName() {
      return this.shopName;
   }

   @JsonProperty("engineerId")
   public void setEngineerId(Integer engineerId) {
      this.engineerId = engineerId;
   }

   @JsonProperty("engineerId")
   public Integer getEngineerId() {
      return this.engineerId;
   }

   @JsonProperty("siteCode")
   public void setSiteCode(String siteCode) {
      this.siteCode = siteCode;
   }

   @JsonProperty("siteCode")
   public String getSiteCode() {
      return this.siteCode;
   }

   @JsonProperty("orderExpectedReceiptTime")
   public void setOrderExpectedReceiptTime(String orderExpectedReceiptTime) {
      this.orderExpectedReceiptTime = orderExpectedReceiptTime;
   }

   @JsonProperty("orderExpectedReceiptTime")
   public String getOrderExpectedReceiptTime() {
      return this.orderExpectedReceiptTime;
   }

   @JsonProperty("callRecord")
   public void setCallRecord(CallRecord callRecord) {
      this.callRecord = callRecord;
   }

   @JsonProperty("callRecord")
   public CallRecord getCallRecord() {
      return this.callRecord;
   }
}
