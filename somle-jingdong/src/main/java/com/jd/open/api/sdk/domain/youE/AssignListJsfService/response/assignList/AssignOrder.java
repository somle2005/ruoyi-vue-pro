package com.jd.open.api.sdk.domain.youE.AssignListJsfService.response.assignList;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;

public class AssignOrder implements Serializable {
   private String userRemark;
   private Integer changeAddress;
   private String userCounty;
   private String firstOldCat;
   private String workOrderRemark;
   private String userTown;
   private Integer oldMachineMode;
   private String userCity;
   private String orderNo;
   private String userAddress;
   private String secondOldCat;
   private Integer stat;
   private String thirdOldCat;
   private String userProvince;
   private String userMobile;
   private String userName;
   private Double estimatePrice;
   private String forthOldCat;
   private String incomeType;
   private String oldMachineInfo;
   private Date expectOnsite;
   private String phoneBindTimeout;

   @JsonProperty("userRemark")
   public void setUserRemark(String userRemark) {
      this.userRemark = userRemark;
   }

   @JsonProperty("userRemark")
   public String getUserRemark() {
      return this.userRemark;
   }

   @JsonProperty("changeAddress")
   public void setChangeAddress(Integer changeAddress) {
      this.changeAddress = changeAddress;
   }

   @JsonProperty("changeAddress")
   public Integer getChangeAddress() {
      return this.changeAddress;
   }

   @JsonProperty("userCounty")
   public void setUserCounty(String userCounty) {
      this.userCounty = userCounty;
   }

   @JsonProperty("userCounty")
   public String getUserCounty() {
      return this.userCounty;
   }

   @JsonProperty("firstOldCat")
   public void setFirstOldCat(String firstOldCat) {
      this.firstOldCat = firstOldCat;
   }

   @JsonProperty("firstOldCat")
   public String getFirstOldCat() {
      return this.firstOldCat;
   }

   @JsonProperty("workOrderRemark")
   public void setWorkOrderRemark(String workOrderRemark) {
      this.workOrderRemark = workOrderRemark;
   }

   @JsonProperty("workOrderRemark")
   public String getWorkOrderRemark() {
      return this.workOrderRemark;
   }

   @JsonProperty("userTown")
   public void setUserTown(String userTown) {
      this.userTown = userTown;
   }

   @JsonProperty("userTown")
   public String getUserTown() {
      return this.userTown;
   }

   @JsonProperty("oldMachineMode")
   public void setOldMachineMode(Integer oldMachineMode) {
      this.oldMachineMode = oldMachineMode;
   }

   @JsonProperty("oldMachineMode")
   public Integer getOldMachineMode() {
      return this.oldMachineMode;
   }

   @JsonProperty("userCity")
   public void setUserCity(String userCity) {
      this.userCity = userCity;
   }

   @JsonProperty("userCity")
   public String getUserCity() {
      return this.userCity;
   }

   @JsonProperty("orderNo")
   public void setOrderNo(String orderNo) {
      this.orderNo = orderNo;
   }

   @JsonProperty("orderNo")
   public String getOrderNo() {
      return this.orderNo;
   }

   @JsonProperty("userAddress")
   public void setUserAddress(String userAddress) {
      this.userAddress = userAddress;
   }

   @JsonProperty("userAddress")
   public String getUserAddress() {
      return this.userAddress;
   }

   @JsonProperty("secondOldCat")
   public void setSecondOldCat(String secondOldCat) {
      this.secondOldCat = secondOldCat;
   }

   @JsonProperty("secondOldCat")
   public String getSecondOldCat() {
      return this.secondOldCat;
   }

   @JsonProperty("stat")
   public void setStat(Integer stat) {
      this.stat = stat;
   }

   @JsonProperty("stat")
   public Integer getStat() {
      return this.stat;
   }

   @JsonProperty("thirdOldCat")
   public void setThirdOldCat(String thirdOldCat) {
      this.thirdOldCat = thirdOldCat;
   }

   @JsonProperty("thirdOldCat")
   public String getThirdOldCat() {
      return this.thirdOldCat;
   }

   @JsonProperty("userProvince")
   public void setUserProvince(String userProvince) {
      this.userProvince = userProvince;
   }

   @JsonProperty("userProvince")
   public String getUserProvince() {
      return this.userProvince;
   }

   @JsonProperty("userMobile")
   public void setUserMobile(String userMobile) {
      this.userMobile = userMobile;
   }

   @JsonProperty("userMobile")
   public String getUserMobile() {
      return this.userMobile;
   }

   @JsonProperty("userName")
   public void setUserName(String userName) {
      this.userName = userName;
   }

   @JsonProperty("userName")
   public String getUserName() {
      return this.userName;
   }

   @JsonProperty("estimatePrice")
   public void setEstimatePrice(Double estimatePrice) {
      this.estimatePrice = estimatePrice;
   }

   @JsonProperty("estimatePrice")
   public Double getEstimatePrice() {
      return this.estimatePrice;
   }

   @JsonProperty("forthOldCat")
   public void setForthOldCat(String forthOldCat) {
      this.forthOldCat = forthOldCat;
   }

   @JsonProperty("forthOldCat")
   public String getForthOldCat() {
      return this.forthOldCat;
   }

   @JsonProperty("incomeType")
   public void setIncomeType(String incomeType) {
      this.incomeType = incomeType;
   }

   @JsonProperty("incomeType")
   public String getIncomeType() {
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

   @JsonProperty("expectOnsite")
   public void setExpectOnsite(Date expectOnsite) {
      this.expectOnsite = expectOnsite;
   }

   @JsonProperty("expectOnsite")
   public Date getExpectOnsite() {
      return this.expectOnsite;
   }

   @JsonProperty("phoneBindTimeout")
   public void setPhoneBindTimeout(String phoneBindTimeout) {
      this.phoneBindTimeout = phoneBindTimeout;
   }

   @JsonProperty("phoneBindTimeout")
   public String getPhoneBindTimeout() {
      return this.phoneBindTimeout;
   }
}
