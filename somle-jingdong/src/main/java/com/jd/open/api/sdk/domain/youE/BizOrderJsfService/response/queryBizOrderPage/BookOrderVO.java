package com.jd.open.api.sdk.domain.youE.BizOrderJsfService.response.queryBizOrderPage;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;

public class BookOrderVO implements Serializable {
   private String orderNo;
   private String salesOrderNo;
   private String companyType;
   private String seviceSkuCode;
   private String seviceSkuName;
   private String itemCode;
   private String itemName;
   private String productSn;
   private String brandName;
   private String userName;
   private String userMobile;
   private String userProvince;
   private String userCity;
   private String userCounty;
   private String userTown;
   private String userAddress;
   private String userAreaId;
   private String itemCatName;
   private Date buyDate;
   private String buyShop;
   private int inOrOut;
   private String salesOrderState;
   private String failureName;
   private String remark;
   private Date createDate;
   private String wishBookDate;
   private String deliverCompany;
   private String deliverNo;
   private Date deliverArriveDate;
   private String phoneBindTimeout;
   private int sendRepairType;
   private String takeAddress;
   private int verifyCodeFlag;
   private String questionPic;
   private int installRule;
   private String mainFields;
   private String onePriceService;
   private Integer sourceType;
   private String desenUserMobile;

   @JsonProperty("orderNo")
   public void setOrderNo(String orderNo) {
      this.orderNo = orderNo;
   }

   @JsonProperty("orderNo")
   public String getOrderNo() {
      return this.orderNo;
   }

   @JsonProperty("salesOrderNo")
   public void setSalesOrderNo(String salesOrderNo) {
      this.salesOrderNo = salesOrderNo;
   }

   @JsonProperty("salesOrderNo")
   public String getSalesOrderNo() {
      return this.salesOrderNo;
   }

   @JsonProperty("companyType")
   public void setCompanyType(String companyType) {
      this.companyType = companyType;
   }

   @JsonProperty("companyType")
   public String getCompanyType() {
      return this.companyType;
   }

   @JsonProperty("seviceSkuCode")
   public void setSeviceSkuCode(String seviceSkuCode) {
      this.seviceSkuCode = seviceSkuCode;
   }

   @JsonProperty("seviceSkuCode")
   public String getSeviceSkuCode() {
      return this.seviceSkuCode;
   }

   @JsonProperty("seviceSkuName")
   public void setSeviceSkuName(String seviceSkuName) {
      this.seviceSkuName = seviceSkuName;
   }

   @JsonProperty("seviceSkuName")
   public String getSeviceSkuName() {
      return this.seviceSkuName;
   }

   @JsonProperty("itemCode")
   public void setItemCode(String itemCode) {
      this.itemCode = itemCode;
   }

   @JsonProperty("itemCode")
   public String getItemCode() {
      return this.itemCode;
   }

   @JsonProperty("itemName")
   public void setItemName(String itemName) {
      this.itemName = itemName;
   }

   @JsonProperty("itemName")
   public String getItemName() {
      return this.itemName;
   }

   @JsonProperty("productSn")
   public void setProductSn(String productSn) {
      this.productSn = productSn;
   }

   @JsonProperty("productSn")
   public String getProductSn() {
      return this.productSn;
   }

   @JsonProperty("brandName")
   public void setBrandName(String brandName) {
      this.brandName = brandName;
   }

   @JsonProperty("brandName")
   public String getBrandName() {
      return this.brandName;
   }

   @JsonProperty("userName")
   public void setUserName(String userName) {
      this.userName = userName;
   }

   @JsonProperty("userName")
   public String getUserName() {
      return this.userName;
   }

   @JsonProperty("userMobile")
   public void setUserMobile(String userMobile) {
      this.userMobile = userMobile;
   }

   @JsonProperty("userMobile")
   public String getUserMobile() {
      return this.userMobile;
   }

   @JsonProperty("userProvince")
   public void setUserProvince(String userProvince) {
      this.userProvince = userProvince;
   }

   @JsonProperty("userProvince")
   public String getUserProvince() {
      return this.userProvince;
   }

   @JsonProperty("userCity")
   public void setUserCity(String userCity) {
      this.userCity = userCity;
   }

   @JsonProperty("userCity")
   public String getUserCity() {
      return this.userCity;
   }

   @JsonProperty("userCounty")
   public void setUserCounty(String userCounty) {
      this.userCounty = userCounty;
   }

   @JsonProperty("userCounty")
   public String getUserCounty() {
      return this.userCounty;
   }

   @JsonProperty("userTown")
   public void setUserTown(String userTown) {
      this.userTown = userTown;
   }

   @JsonProperty("userTown")
   public String getUserTown() {
      return this.userTown;
   }

   @JsonProperty("userAddress")
   public void setUserAddress(String userAddress) {
      this.userAddress = userAddress;
   }

   @JsonProperty("userAddress")
   public String getUserAddress() {
      return this.userAddress;
   }

   @JsonProperty("userAreaId")
   public void setUserAreaId(String userAreaId) {
      this.userAreaId = userAreaId;
   }

   @JsonProperty("userAreaId")
   public String getUserAreaId() {
      return this.userAreaId;
   }

   @JsonProperty("itemCatName")
   public void setItemCatName(String itemCatName) {
      this.itemCatName = itemCatName;
   }

   @JsonProperty("itemCatName")
   public String getItemCatName() {
      return this.itemCatName;
   }

   @JsonProperty("buyDate")
   public void setBuyDate(Date buyDate) {
      this.buyDate = buyDate;
   }

   @JsonProperty("buyDate")
   public Date getBuyDate() {
      return this.buyDate;
   }

   @JsonProperty("buyShop")
   public void setBuyShop(String buyShop) {
      this.buyShop = buyShop;
   }

   @JsonProperty("buyShop")
   public String getBuyShop() {
      return this.buyShop;
   }

   @JsonProperty("inOrOut")
   public void setInOrOut(int inOrOut) {
      this.inOrOut = inOrOut;
   }

   @JsonProperty("inOrOut")
   public int getInOrOut() {
      return this.inOrOut;
   }

   @JsonProperty("salesOrderState")
   public void setSalesOrderState(String salesOrderState) {
      this.salesOrderState = salesOrderState;
   }

   @JsonProperty("salesOrderState")
   public String getSalesOrderState() {
      return this.salesOrderState;
   }

   @JsonProperty("failureName")
   public void setFailureName(String failureName) {
      this.failureName = failureName;
   }

   @JsonProperty("failureName")
   public String getFailureName() {
      return this.failureName;
   }

   @JsonProperty("remark")
   public void setRemark(String remark) {
      this.remark = remark;
   }

   @JsonProperty("remark")
   public String getRemark() {
      return this.remark;
   }

   @JsonProperty("createDate")
   public void setCreateDate(Date createDate) {
      this.createDate = createDate;
   }

   @JsonProperty("createDate")
   public Date getCreateDate() {
      return this.createDate;
   }

   @JsonProperty("wishBookDate")
   public void setWishBookDate(String wishBookDate) {
      this.wishBookDate = wishBookDate;
   }

   @JsonProperty("wishBookDate")
   public String getWishBookDate() {
      return this.wishBookDate;
   }

   @JsonProperty("deliverCompany")
   public void setDeliverCompany(String deliverCompany) {
      this.deliverCompany = deliverCompany;
   }

   @JsonProperty("deliverCompany")
   public String getDeliverCompany() {
      return this.deliverCompany;
   }

   @JsonProperty("deliverNo")
   public void setDeliverNo(String deliverNo) {
      this.deliverNo = deliverNo;
   }

   @JsonProperty("deliverNo")
   public String getDeliverNo() {
      return this.deliverNo;
   }

   @JsonProperty("deliverArriveDate")
   public void setDeliverArriveDate(Date deliverArriveDate) {
      this.deliverArriveDate = deliverArriveDate;
   }

   @JsonProperty("deliverArriveDate")
   public Date getDeliverArriveDate() {
      return this.deliverArriveDate;
   }

   @JsonProperty("phoneBindTimeout")
   public void setPhoneBindTimeout(String phoneBindTimeout) {
      this.phoneBindTimeout = phoneBindTimeout;
   }

   @JsonProperty("phoneBindTimeout")
   public String getPhoneBindTimeout() {
      return this.phoneBindTimeout;
   }

   @JsonProperty("sendRepairType")
   public void setSendRepairType(int sendRepairType) {
      this.sendRepairType = sendRepairType;
   }

   @JsonProperty("sendRepairType")
   public int getSendRepairType() {
      return this.sendRepairType;
   }

   @JsonProperty("takeAddress")
   public void setTakeAddress(String takeAddress) {
      this.takeAddress = takeAddress;
   }

   @JsonProperty("takeAddress")
   public String getTakeAddress() {
      return this.takeAddress;
   }

   @JsonProperty("verifyCodeFlag")
   public void setVerifyCodeFlag(int verifyCodeFlag) {
      this.verifyCodeFlag = verifyCodeFlag;
   }

   @JsonProperty("verifyCodeFlag")
   public int getVerifyCodeFlag() {
      return this.verifyCodeFlag;
   }

   @JsonProperty("questionPic")
   public void setQuestionPic(String questionPic) {
      this.questionPic = questionPic;
   }

   @JsonProperty("questionPic")
   public String getQuestionPic() {
      return this.questionPic;
   }

   @JsonProperty("installRule")
   public void setInstallRule(int installRule) {
      this.installRule = installRule;
   }

   @JsonProperty("installRule")
   public int getInstallRule() {
      return this.installRule;
   }

   @JsonProperty("mainFields")
   public void setMainFields(String mainFields) {
      this.mainFields = mainFields;
   }

   @JsonProperty("mainFields")
   public String getMainFields() {
      return this.mainFields;
   }

   @JsonProperty("onePriceService")
   public void setOnePriceService(String onePriceService) {
      this.onePriceService = onePriceService;
   }

   @JsonProperty("onePriceService")
   public String getOnePriceService() {
      return this.onePriceService;
   }

   @JsonProperty("sourceType")
   public void setSourceType(Integer sourceType) {
      this.sourceType = sourceType;
   }

   @JsonProperty("sourceType")
   public Integer getSourceType() {
      return this.sourceType;
   }

   @JsonProperty("desen_userMobile")
   public void setDesenUserMobile(String desenUserMobile) {
      this.desenUserMobile = desenUserMobile;
   }

   @JsonProperty("desen_userMobile")
   public String getDesenUserMobile() {
      return this.desenUserMobile;
   }
}
