package com.jd.open.api.sdk.domain.youE.OrderQueryJsfService.response.queryUnHandleOrders;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class RecycleOrderInfo implements Serializable {
   private Integer incomeType;
   private String oldMachineInfo;
   private Integer changeAddress;
   private String firstOldCat;
   private String secondOldCat;
   private String thirdOldCat;
   private String forthOldCat;
   private Integer firstOldCatId;
   private Integer secondOldCatId;
   private Integer thirdOldCatId;
   private Double estimatePrice;
   private String modelType;
   private String oldMachineMode;
   private String workOrderRemark;
   private Integer catType;
   private String deliverCenterCode;
   private String wmsName;
   private String wmsProvinceName;
   private String wmsCityName;
   private String wmsCountyName;
   private String wmsTownName;
   private String wishBookDate;
   private String engineerId;
   private String engineerName;
   private String engineerMobile;
   private String userMobile;
   private Date phoneBindTimeout;
   private String siteId;
   private String siteName;
   private Integer forthOldCatId;
   private Integer orderSource;
   private String arriveTime;
   private String estimateArriveTime;
   private Integer recycleDemand;
   private Integer saleOrderStat;
   private List<String> installOrderNos;
   private String userRemark;
   private Integer modelCode;

   @JsonProperty("incomeType")
   public void setIncomeType(Integer incomeType) {
      this.incomeType = incomeType;
   }

   @JsonProperty("incomeType")
   public Integer getIncomeType() {
      return this.incomeType;
   }

   @JsonProperty("oldMachineInfo")
   public void setOldMachineInfo(String oldMachineInfo) {
      this.oldMachineInfo = oldMachineInfo;
   }

   @JsonProperty("oldMachineInfo")
   public String getOldMachineInfo() {
      return this.oldMachineInfo;
   }

   @JsonProperty("changeAddress")
   public void setChangeAddress(Integer changeAddress) {
      this.changeAddress = changeAddress;
   }

   @JsonProperty("changeAddress")
   public Integer getChangeAddress() {
      return this.changeAddress;
   }

   @JsonProperty("firstOldCat")
   public void setFirstOldCat(String firstOldCat) {
      this.firstOldCat = firstOldCat;
   }

   @JsonProperty("firstOldCat")
   public String getFirstOldCat() {
      return this.firstOldCat;
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

   @JsonProperty("forthOldCat")
   public void setForthOldCat(String forthOldCat) {
      this.forthOldCat = forthOldCat;
   }

   @JsonProperty("forthOldCat")
   public String getForthOldCat() {
      return this.forthOldCat;
   }

   @JsonProperty("firstOldCatId")
   public void setFirstOldCatId(Integer firstOldCatId) {
      this.firstOldCatId = firstOldCatId;
   }

   @JsonProperty("firstOldCatId")
   public Integer getFirstOldCatId() {
      return this.firstOldCatId;
   }

   @JsonProperty("secondOldCatId")
   public void setSecondOldCatId(Integer secondOldCatId) {
      this.secondOldCatId = secondOldCatId;
   }

   @JsonProperty("secondOldCatId")
   public Integer getSecondOldCatId() {
      return this.secondOldCatId;
   }

   @JsonProperty("thirdOldCatId")
   public void setThirdOldCatId(Integer thirdOldCatId) {
      this.thirdOldCatId = thirdOldCatId;
   }

   @JsonProperty("thirdOldCatId")
   public Integer getThirdOldCatId() {
      return this.thirdOldCatId;
   }

   @JsonProperty("estimatePrice")
   public void setEstimatePrice(Double estimatePrice) {
      this.estimatePrice = estimatePrice;
   }

   @JsonProperty("estimatePrice")
   public Double getEstimatePrice() {
      return this.estimatePrice;
   }

   @JsonProperty("modelType")
   public void setModelType(String modelType) {
      this.modelType = modelType;
   }

   @JsonProperty("modelType")
   public String getModelType() {
      return this.modelType;
   }

   @JsonProperty("oldMachineMode")
   public void setOldMachineMode(String oldMachineMode) {
      this.oldMachineMode = oldMachineMode;
   }

   @JsonProperty("oldMachineMode")
   public String getOldMachineMode() {
      return this.oldMachineMode;
   }

   @JsonProperty("workOrderRemark")
   public void setWorkOrderRemark(String workOrderRemark) {
      this.workOrderRemark = workOrderRemark;
   }

   @JsonProperty("workOrderRemark")
   public String getWorkOrderRemark() {
      return this.workOrderRemark;
   }

   @JsonProperty("catType")
   public void setCatType(Integer catType) {
      this.catType = catType;
   }

   @JsonProperty("catType")
   public Integer getCatType() {
      return this.catType;
   }

   @JsonProperty("deliverCenterCode")
   public void setDeliverCenterCode(String deliverCenterCode) {
      this.deliverCenterCode = deliverCenterCode;
   }

   @JsonProperty("deliverCenterCode")
   public String getDeliverCenterCode() {
      return this.deliverCenterCode;
   }

   @JsonProperty("wmsName")
   public void setWmsName(String wmsName) {
      this.wmsName = wmsName;
   }

   @JsonProperty("wmsName")
   public String getWmsName() {
      return this.wmsName;
   }

   @JsonProperty("wmsProvinceName")
   public void setWmsProvinceName(String wmsProvinceName) {
      this.wmsProvinceName = wmsProvinceName;
   }

   @JsonProperty("wmsProvinceName")
   public String getWmsProvinceName() {
      return this.wmsProvinceName;
   }

   @JsonProperty("wmsCityName")
   public void setWmsCityName(String wmsCityName) {
      this.wmsCityName = wmsCityName;
   }

   @JsonProperty("wmsCityName")
   public String getWmsCityName() {
      return this.wmsCityName;
   }

   @JsonProperty("wmsCountyName")
   public void setWmsCountyName(String wmsCountyName) {
      this.wmsCountyName = wmsCountyName;
   }

   @JsonProperty("wmsCountyName")
   public String getWmsCountyName() {
      return this.wmsCountyName;
   }

   @JsonProperty("wmsTownName")
   public void setWmsTownName(String wmsTownName) {
      this.wmsTownName = wmsTownName;
   }

   @JsonProperty("wmsTownName")
   public String getWmsTownName() {
      return this.wmsTownName;
   }

   @JsonProperty("wishBookDate")
   public void setWishBookDate(String wishBookDate) {
      this.wishBookDate = wishBookDate;
   }

   @JsonProperty("wishBookDate")
   public String getWishBookDate() {
      return this.wishBookDate;
   }

   @JsonProperty("engineerId")
   public void setEngineerId(String engineerId) {
      this.engineerId = engineerId;
   }

   @JsonProperty("engineerId")
   public String getEngineerId() {
      return this.engineerId;
   }

   @JsonProperty("engineerName")
   public void setEngineerName(String engineerName) {
      this.engineerName = engineerName;
   }

   @JsonProperty("engineerName")
   public String getEngineerName() {
      return this.engineerName;
   }

   @JsonProperty("engineerMobile")
   public void setEngineerMobile(String engineerMobile) {
      this.engineerMobile = engineerMobile;
   }

   @JsonProperty("engineerMobile")
   public String getEngineerMobile() {
      return this.engineerMobile;
   }

   @JsonProperty("userMobile")
   public void setUserMobile(String userMobile) {
      this.userMobile = userMobile;
   }

   @JsonProperty("userMobile")
   public String getUserMobile() {
      return this.userMobile;
   }

   @JsonProperty("phoneBindTimeout")
   public void setPhoneBindTimeout(Date phoneBindTimeout) {
      this.phoneBindTimeout = phoneBindTimeout;
   }

   @JsonProperty("phoneBindTimeout")
   public Date getPhoneBindTimeout() {
      return this.phoneBindTimeout;
   }

   @JsonProperty("siteId")
   public void setSiteId(String siteId) {
      this.siteId = siteId;
   }

   @JsonProperty("siteId")
   public String getSiteId() {
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

   @JsonProperty("forthOldCatId")
   public void setForthOldCatId(Integer forthOldCatId) {
      this.forthOldCatId = forthOldCatId;
   }

   @JsonProperty("forthOldCatId")
   public Integer getForthOldCatId() {
      return this.forthOldCatId;
   }

   @JsonProperty("orderSource")
   public void setOrderSource(Integer orderSource) {
      this.orderSource = orderSource;
   }

   @JsonProperty("orderSource")
   public Integer getOrderSource() {
      return this.orderSource;
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

   @JsonProperty("userRemark")
   public void setUserRemark(String userRemark) {
      this.userRemark = userRemark;
   }

   @JsonProperty("userRemark")
   public String getUserRemark() {
      return this.userRemark;
   }

   @JsonProperty("modelCode")
   public void setModelCode(Integer modelCode) {
      this.modelCode = modelCode;
   }

   @JsonProperty("modelCode")
   public Integer getModelCode() {
      return this.modelCode;
   }
}
