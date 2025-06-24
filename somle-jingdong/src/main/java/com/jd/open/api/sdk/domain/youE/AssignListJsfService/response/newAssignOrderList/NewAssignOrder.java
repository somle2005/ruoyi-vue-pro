package com.jd.open.api.sdk.domain.youE.AssignListJsfService.response.newAssignOrderList;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class NewAssignOrder implements Serializable {
   private String userCity;
   private String userTown;
   private Integer stat;
   private Long saleOrderNo;
   private String orderNo;
   private String userProvince;
   private Integer incomeType;
   private String userCounty;
   private String userName;
   private String workOrderRemark;
   private String userRemark;
   private String userAddress;
   private String oldMachineInfo;
   private String userMobile;
   private Integer oldMachineMode;
   private Integer changeAddress;
   private String secondOldCat;
   private String thirdOldCat;
   private Date expectOnsite;
   private String forthOldCat;
   private Double estimatePrice;
   private String firstOldCat;
   private String phoneBindTimeout;
   private String modelType;
   private Long engineerId;
   private String siteId;
   private Integer orderSource;
   private String serviceTypeId;
   private String arriveTime;
   private String estimateArriveTime;
   private Integer recycleDemand;
   private Integer saleOrderStat;
   private List<String> installOrderNos;
   private Integer subModelType;
   private Long sku;
   private UserBicycleInfo bicInfo;
   private String limitActivityId;
   private String openIdBuyer;
   private String xidBuyer;

   @JsonProperty("userCity")
   public void setUserCity(String userCity) {
      this.userCity = userCity;
   }

   @JsonProperty("userCity")
   public String getUserCity() {
      return this.userCity;
   }

   @JsonProperty("userTown")
   public void setUserTown(String userTown) {
      this.userTown = userTown;
   }

   @JsonProperty("userTown")
   public String getUserTown() {
      return this.userTown;
   }

   @JsonProperty("stat")
   public void setStat(Integer stat) {
      this.stat = stat;
   }

   @JsonProperty("stat")
   public Integer getStat() {
      return this.stat;
   }

   @JsonProperty("saleOrderNo")
   public void setSaleOrderNo(Long saleOrderNo) {
      this.saleOrderNo = saleOrderNo;
   }

   @JsonProperty("saleOrderNo")
   public Long getSaleOrderNo() {
      return this.saleOrderNo;
   }

   @JsonProperty("orderNo")
   public void setOrderNo(String orderNo) {
      this.orderNo = orderNo;
   }

   @JsonProperty("orderNo")
   public String getOrderNo() {
      return this.orderNo;
   }

   @JsonProperty("userProvince")
   public void setUserProvince(String userProvince) {
      this.userProvince = userProvince;
   }

   @JsonProperty("userProvince")
   public String getUserProvince() {
      return this.userProvince;
   }

   @JsonProperty("incomeType")
   public void setIncomeType(Integer incomeType) {
      this.incomeType = incomeType;
   }

   @JsonProperty("incomeType")
   public Integer getIncomeType() {
      return this.incomeType;
   }

   @JsonProperty("userCounty")
   public void setUserCounty(String userCounty) {
      this.userCounty = userCounty;
   }

   @JsonProperty("userCounty")
   public String getUserCounty() {
      return this.userCounty;
   }

   @JsonProperty("userName")
   public void setUserName(String userName) {
      this.userName = userName;
   }

   @JsonProperty("userName")
   public String getUserName() {
      return this.userName;
   }

   @JsonProperty("workOrderRemark")
   public void setWorkOrderRemark(String workOrderRemark) {
      this.workOrderRemark = workOrderRemark;
   }

   @JsonProperty("workOrderRemark")
   public String getWorkOrderRemark() {
      return this.workOrderRemark;
   }

   @JsonProperty("userRemark")
   public void setUserRemark(String userRemark) {
      this.userRemark = userRemark;
   }

   @JsonProperty("userRemark")
   public String getUserRemark() {
      return this.userRemark;
   }

   @JsonProperty("userAddress")
   public void setUserAddress(String userAddress) {
      this.userAddress = userAddress;
   }

   @JsonProperty("userAddress")
   public String getUserAddress() {
      return this.userAddress;
   }

   @JsonProperty("oldMachineInfo")
   public void setOldMachineInfo(String oldMachineInfo) {
      this.oldMachineInfo = oldMachineInfo;
   }

   @JsonProperty("oldMachineInfo")
   public String getOldMachineInfo() {
      return this.oldMachineInfo;
   }

   @JsonProperty("userMobile")
   public void setUserMobile(String userMobile) {
      this.userMobile = userMobile;
   }

   @JsonProperty("userMobile")
   public String getUserMobile() {
      return this.userMobile;
   }

   @JsonProperty("oldMachineMode")
   public void setOldMachineMode(Integer oldMachineMode) {
      this.oldMachineMode = oldMachineMode;
   }

   @JsonProperty("oldMachineMode")
   public Integer getOldMachineMode() {
      return this.oldMachineMode;
   }

   @JsonProperty("changeAddress")
   public void setChangeAddress(Integer changeAddress) {
      this.changeAddress = changeAddress;
   }

   @JsonProperty("changeAddress")
   public Integer getChangeAddress() {
      return this.changeAddress;
   }

   @JsonProperty("secondOldCat")
   public void setSecondOldCat(String secondOldCat) {
      this.secondOldCat = secondOldCat;
   }

   @JsonProperty("secondOldCat")
   public String getSecondOldCat() {
      return this.secondOldCat;
   }

   @JsonProperty("thirdOldCat")
   public void setThirdOldCat(String thirdOldCat) {
      this.thirdOldCat = thirdOldCat;
   }

   @JsonProperty("thirdOldCat")
   public String getThirdOldCat() {
      return this.thirdOldCat;
   }

   @JsonProperty("expectOnsite")
   public void setExpectOnsite(Date expectOnsite) {
      this.expectOnsite = expectOnsite;
   }

   @JsonProperty("expectOnsite")
   public Date getExpectOnsite() {
      return this.expectOnsite;
   }

   @JsonProperty("forthOldCat")
   public void setForthOldCat(String forthOldCat) {
      this.forthOldCat = forthOldCat;
   }

   @JsonProperty("forthOldCat")
   public String getForthOldCat() {
      return this.forthOldCat;
   }

   @JsonProperty("estimatePrice")
   public void setEstimatePrice(Double estimatePrice) {
      this.estimatePrice = estimatePrice;
   }

   @JsonProperty("estimatePrice")
   public Double getEstimatePrice() {
      return this.estimatePrice;
   }

   @JsonProperty("firstOldCat")
   public void setFirstOldCat(String firstOldCat) {
      this.firstOldCat = firstOldCat;
   }

   @JsonProperty("firstOldCat")
   public String getFirstOldCat() {
      return this.firstOldCat;
   }

   @JsonProperty("phoneBindTimeout")
   public void setPhoneBindTimeout(String phoneBindTimeout) {
      this.phoneBindTimeout = phoneBindTimeout;
   }

   @JsonProperty("phoneBindTimeout")
   public String getPhoneBindTimeout() {
      return this.phoneBindTimeout;
   }

   @JsonProperty("modelType")
   public void setModelType(String modelType) {
      this.modelType = modelType;
   }

   @JsonProperty("modelType")
   public String getModelType() {
      return this.modelType;
   }

   @JsonProperty("engineerId")
   public void setEngineerId(Long engineerId) {
      this.engineerId = engineerId;
   }

   @JsonProperty("engineerId")
   public Long getEngineerId() {
      return this.engineerId;
   }

   @JsonProperty("siteId")
   public void setSiteId(String siteId) {
      this.siteId = siteId;
   }

   @JsonProperty("siteId")
   public String getSiteId() {
      return this.siteId;
   }

   @JsonProperty("orderSource")
   public void setOrderSource(Integer orderSource) {
      this.orderSource = orderSource;
   }

   @JsonProperty("orderSource")
   public Integer getOrderSource() {
      return this.orderSource;
   }

   @JsonProperty("serviceTypeId")
   public void setServiceTypeId(String serviceTypeId) {
      this.serviceTypeId = serviceTypeId;
   }

   @JsonProperty("serviceTypeId")
   public String getServiceTypeId() {
      return this.serviceTypeId;
   }

   @JsonProperty("arriveTime")
   public void setArriveTime(String arriveTime) {
      this.arriveTime = arriveTime;
   }

   @JsonProperty("arriveTime")
   public String getArriveTime() {
      return this.arriveTime;
   }

   @JsonProperty("estimateArriveTime")
   public void setEstimateArriveTime(String estimateArriveTime) {
      this.estimateArriveTime = estimateArriveTime;
   }

   @JsonProperty("estimateArriveTime")
   public String getEstimateArriveTime() {
      return this.estimateArriveTime;
   }

   @JsonProperty("recycleDemand")
   public void setRecycleDemand(Integer recycleDemand) {
      this.recycleDemand = recycleDemand;
   }

   @JsonProperty("recycleDemand")
   public Integer getRecycleDemand() {
      return this.recycleDemand;
   }

   @JsonProperty("saleOrderStat")
   public void setSaleOrderStat(Integer saleOrderStat) {
      this.saleOrderStat = saleOrderStat;
   }

   @JsonProperty("saleOrderStat")
   public Integer getSaleOrderStat() {
      return this.saleOrderStat;
   }

   @JsonProperty("installOrderNos")
   public void setInstallOrderNos(List<String> installOrderNos) {
      this.installOrderNos = installOrderNos;
   }

   @JsonProperty("installOrderNos")
   public List<String> getInstallOrderNos() {
      return this.installOrderNos;
   }

   @JsonProperty("subModelType")
   public void setSubModelType(Integer subModelType) {
      this.subModelType = subModelType;
   }

   @JsonProperty("subModelType")
   public Integer getSubModelType() {
      return this.subModelType;
   }

   @JsonProperty("sku")
   public void setSku(Long sku) {
      this.sku = sku;
   }

   @JsonProperty("sku")
   public Long getSku() {
      return this.sku;
   }

   @JsonProperty("bicInfo")
   public void setBicInfo(UserBicycleInfo bicInfo) {
      this.bicInfo = bicInfo;
   }

   @JsonProperty("bicInfo")
   public UserBicycleInfo getBicInfo() {
      return this.bicInfo;
   }

   @JsonProperty("limitActivityId")
   public void setLimitActivityId(String limitActivityId) {
      this.limitActivityId = limitActivityId;
   }

   @JsonProperty("limitActivityId")
   public String getLimitActivityId() {
      return this.limitActivityId;
   }

   @JsonProperty("open_id_buyer")
   public void setOpenIdBuyer(String openIdBuyer) {
      this.openIdBuyer = openIdBuyer;
   }

   @JsonProperty("open_id_buyer")
   public String getOpenIdBuyer() {
      return this.openIdBuyer;
   }

   @JsonProperty("xid_buyer")
   public void setXidBuyer(String xidBuyer) {
      this.xidBuyer = xidBuyer;
   }

   @JsonProperty("xid_buyer")
   public String getXidBuyer() {
      return this.xidBuyer;
   }
}
